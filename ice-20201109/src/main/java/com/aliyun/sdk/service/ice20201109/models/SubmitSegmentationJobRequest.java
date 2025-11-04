// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

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
 * {@link SubmitSegmentationJobRequest} extends {@link RequestModel}
 *
 * <p>SubmitSegmentationJobRequest</p>
 */
public class SubmitSegmentationJobRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("InputConfig")
    private String inputConfig;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("JobParams")
    private String jobParams;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OutputConfig")
    private String outputConfig;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserData")
    private String userData;

    private SubmitSegmentationJobRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.clientToken = builder.clientToken;
        this.inputConfig = builder.inputConfig;
        this.jobParams = builder.jobParams;
        this.outputConfig = builder.outputConfig;
        this.userData = builder.userData;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SubmitSegmentationJobRequest create() {
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
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return inputConfig
     */
    public String getInputConfig() {
        return this.inputConfig;
    }

    /**
     * @return jobParams
     */
    public String getJobParams() {
        return this.jobParams;
    }

    /**
     * @return outputConfig
     */
    public String getOutputConfig() {
        return this.outputConfig;
    }

    /**
     * @return userData
     */
    public String getUserData() {
        return this.userData;
    }

    public static final class Builder extends Request.Builder<SubmitSegmentationJobRequest, Builder> {
        private String regionId; 
        private String clientToken; 
        private String inputConfig; 
        private String jobParams; 
        private String outputConfig; 
        private String userData; 

        private Builder() {
            super();
        } 

        private Builder(SubmitSegmentationJobRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.clientToken = request.clientToken;
            this.inputConfig = request.inputConfig;
            this.jobParams = request.jobParams;
            this.outputConfig = request.outputConfig;
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
         * <p>The client token that is used to ensure the idempotence of the request.</p>
         * 
         * <strong>example:</strong>
         * <p><strong><strong>12e8864746a0a398</strong></strong></p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>The input configuration. For detailed parameters, see <a href="~~2874121#cc59ad3082jbx~~">InputConfig</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *     &quot;Type&quot;: &quot;OSS&quot;,
         *     &quot;Media&quot;: &quot;<a href="http://test-bucket.oss-cn-shanghai.aliyuncs.com/test.mp4">http://test-bucket.oss-cn-shanghai.aliyuncs.com/test.mp4</a>&quot;
         * }
         * or {
         *     &quot;Type&quot;: &quot;Media&quot;,
         *     &quot;Media&quot;: &quot;ce49a020e****1ef81c1e6f6d5686302&quot;
         * }</p>
         */
        public Builder inputConfig(String inputConfig) {
            this.putBodyParameter("InputConfig", inputConfig);
            this.inputConfig = inputConfig;
            return this;
        }

        /**
         * <p>The task parameters. For details, see <a href="~~2874121#a60357f2d5iix~~">JobParams</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *     &quot;Mode&quot;: &quot;UserDefined&quot;,
         *     &quot;Ranges&quot;: [{
         *         &quot;In&quot;: 10,
         *         &quot;Out&quot;: 20
         *     }, {
         *         &quot;In&quot;: 35,
         *         &quot;Out&quot;: 50
         *     }]
         * }</p>
         */
        public Builder jobParams(String jobParams) {
            this.putQueryParameter("JobParams", jobParams);
            this.jobParams = jobParams;
            return this;
        }

        /**
         * <p>The output configuration. For detailed parameters, see <a href="~~2874121#cef23186a8d6w~~">OutputConfig</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *     &quot;OutputMediaTarget&quot;: &quot;oss-object&quot;,
         *     &quot;Bucket&quot;: &quot;test-bucket&quot;,
         *     &quot;ObjectKey&quot;: &quot;path/to/test_{index}.mp4&quot;,
         *     &quot;Width&quot;: 1920,
         *     &quot;Height&quot;: 1080,
         *     &quot;ExportAsNewMedia&quot;: false
         * }</p>
         */
        public Builder outputConfig(String outputConfig) {
            this.putQueryParameter("OutputConfig", outputConfig);
            this.outputConfig = outputConfig;
            return this;
        }

        /**
         * <p>The user-defined data in the JSON format, which can be up to 512 bytes in length.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;test&quot;: &quot;22&quot;}</p>
         */
        public Builder userData(String userData) {
            this.putQueryParameter("UserData", userData);
            this.userData = userData;
            return this;
        }

        @Override
        public SubmitSegmentationJobRequest build() {
            return new SubmitSegmentationJobRequest(this);
        } 

    } 

}
