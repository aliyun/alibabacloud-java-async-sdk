// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yike20260707.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link SubmitMediaComprehensionJobRequest} extends {@link RequestModel}
 *
 * <p>SubmitMediaComprehensionJobRequest</p>
 */
public class SubmitMediaComprehensionJobRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Input")
    private String input;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("JobParams")
    private String jobParams;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("JobType")
    private String jobType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserData")
    private String userData;

    private SubmitMediaComprehensionJobRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.input = builder.input;
        this.jobParams = builder.jobParams;
        this.jobType = builder.jobType;
        this.userData = builder.userData;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SubmitMediaComprehensionJobRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return input
     */
    public String getInput() {
        return this.input;
    }

    /**
     * @return jobParams
     */
    public String getJobParams() {
        return this.jobParams;
    }

    /**
     * @return jobType
     */
    public String getJobType() {
        return this.jobType;
    }

    /**
     * @return userData
     */
    public String getUserData() {
        return this.userData;
    }

    public static final class Builder extends Request.Builder<SubmitMediaComprehensionJobRequest, Builder> {
        private String regionId; 
        private String input; 
        private String jobParams; 
        private String jobType; 
        private String userData; 

        private Builder() {
            super();
        } 

        private Builder(SubmitMediaComprehensionJobRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.input = request.input;
            this.jobParams = request.jobParams;
            this.jobType = request.jobType;
            this.userData = request.userData;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The input material. JSON string with the following structure:</p>
         * <ul>
         * <li>Medias (Array<Object>, required): The list of media assets. Contains 1 to 10 elements. Each element includes the following fields:<ul>
         * <li>Type (String, required): The media asset type. Valid values: video or image (case-insensitive).</li>
         * <li>Url (String, either Url or MediaId is required): The URL of the media asset. The URL must start with http:// or https:// and cannot exceed 2048 characters in length. Unregistered URLs are automatically registered as media assets.</li>
         * <li>MediaId (String, either Url or MediaId is required): The ID of a registered media asset. If both Url and MediaId are specified, MediaId takes precedence.</li>
         * </ul>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>{&quot;Medias&quot;:[{&quot;Type&quot;:&quot;video&quot;,&quot;Url&quot;:&quot;<a href="https://xxx.mp4%22%7D%5D%7D">https://xxx.mp4&quot;}]}</a></p>
         */
        public Builder input(String input) {
            this.putQueryParameter("Input", input);
            this.input = input;
            return this;
        }

        /**
         * <p>The analysis parameters. JSON string. The total length cannot exceed 65536 characters, and the total number of fields cannot exceed 20.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;ProductName&quot;:&quot;Quiet Blender Soymilk Maker&quot;,&quot;BrandName&quot;:&quot;LiangChu&quot;,&quot;SellingPoints&quot;:[&quot;Low-noise blending&quot;,&quot;One-touch self-cleaning&quot;]}</p>
         */
        public Builder jobParams(String jobParams) {
            this.putQueryParameter("JobParams", jobParams);
            this.jobParams = jobParams;
            return this;
        }

        /**
         * <p>The job type.</p>
         * <ul>
         * <li>VideoBreakdown: viral video breakdown. Requires Medias to contain exactly 1 element with Type=video.</li>
         * <li>ProductRecognition: product image information recognition. Requires all elements in Medias to have Type=image.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>VideoBreakdown</p>
         */
        public Builder jobType(String jobType) {
            this.putQueryParameter("JobType", jobType);
            this.jobType = jobType;
            return this;
        }

        /**
         * <p>The custom parameters. JSON string that is returned as-is in the callback result (for example, newsKey). The system reserved field NotifyAddress specifies the callback URL. The callback is triggered after the job is completed.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;NotifyAddress&quot;: &quot;<a href="http://xxx.callback.url%22%7D">http://xxx.callback.url&quot;}</a></p>
         */
        public Builder userData(String userData) {
            this.putQueryParameter("UserData", userData);
            this.userData = userData;
            return this;
        }

        @Override
        public SubmitMediaComprehensionJobRequest build() {
            return new SubmitMediaComprehensionJobRequest(this);
        } 

    } 

}
