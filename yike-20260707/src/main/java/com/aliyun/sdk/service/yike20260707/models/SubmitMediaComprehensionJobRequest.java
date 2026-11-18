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
         * <p>The input media. The value is a JSON string with the following structure:</p>
         * <ul>
         * <li>Medias (Array<Object>, required): The list of media files. The array must contain 1 to 10 elements. Each element contains the following fields:<ul>
         * <li>Type (String, required): The media type. Valid values: video and image. The value is not case-sensitive.</li>
         * <li>Url (String, mutually exclusive with MediaId): The URL of the media file. The URL must start with http:// or https:// and be up to 2,048 characters in length. Unregistered URLs are automatically registered as media files.</li>
         * <li>MediaId (String, mutually exclusive with Url): The ID of the registered media file. If both Url and MediaId are specified, MediaId takes precedence.</li>
         * </ul>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>{
         *   &quot;Medias&quot;: [
         *     {
         *       &quot;Type&quot;: &quot;video&quot;,
         *       &quot;Url&quot;: &quot;<a href="https://example.com/source.mp4">https://example.com/source.mp4</a>&quot;
         *     }
         *   ]
         * }</p>
         */
        public Builder input(String input) {
            this.putQueryParameter("Input", input);
            this.input = input;
            return this;
        }

        /**
         * <p>The analysis parameters. The value is a JSON string up to 65,536 characters in length.</p>
         * <ul>
         * <li>VideoBreakdown: Supports the ResultType parameter (String, optional). Valid value: Standard (default).</li>
         * <li>ProductRecognition: Uses parameters such as product information and prompts. The total number of fields cannot exceed 20. Example fields for product parameters include ProductName, BrandName, and SellingPoints.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>{
         *   &quot;ResultType&quot;: &quot;Standard&quot;
         * }
         * or
         * {
         *   &quot;ProductName&quot;: &quot;Quiet Blender Soymilk Maker&quot;,
         *   &quot;BrandName&quot;: &quot;LiangChu&quot;,
         *   &quot;SellingPoints&quot;: [
         *     &quot;Low-noise blending&quot;,
         *     &quot;One-touch self-cleaning&quot;
         *   ]
         * }</p>
         */
        public Builder jobParams(String jobParams) {
            this.putQueryParameter("JobParams", jobParams);
            this.jobParams = jobParams;
            return this;
        }

        /**
         * <p>The job type. Valid values:</p>
         * <ul>
         * <li>VideoBreakdown: Viral video breakdown. The Medias array must contain exactly one element with Type set to video.</li>
         * <li>ProductRecognition: Product image information recognition. All elements in the Medias array must have Type set to image.</li>
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
         * <p>The custom parameters. The value is a JSON string. The custom parameters are returned as-is in the callback result (for example, newsKey). NotifyAddress is a system-reserved field for the callback URL. A callback is triggered after the job is completed.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *   &quot;NotifyAddress&quot;: &quot;<a href="https://example.com/callback">https://example.com/callback</a>&quot;
         * }</p>
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
