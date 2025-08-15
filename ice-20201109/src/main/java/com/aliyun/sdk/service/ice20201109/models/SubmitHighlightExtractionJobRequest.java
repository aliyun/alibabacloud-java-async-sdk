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
 * {@link SubmitHighlightExtractionJobRequest} extends {@link RequestModel}
 *
 * <p>SubmitHighlightExtractionJobRequest</p>
 */
public class SubmitHighlightExtractionJobRequest extends Request {
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
    @com.aliyun.core.annotation.NameInMap("OutputConfig")
    private String outputConfig;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserData")
    private String userData;

    private SubmitHighlightExtractionJobRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.clientToken = builder.clientToken;
        this.inputConfig = builder.inputConfig;
        this.outputConfig = builder.outputConfig;
        this.userData = builder.userData;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SubmitHighlightExtractionJobRequest create() {
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

    public static final class Builder extends Request.Builder<SubmitHighlightExtractionJobRequest, Builder> {
        private String regionId; 
        private String clientToken; 
        private String inputConfig; 
        private String outputConfig; 
        private String userData; 

        private Builder() {
            super();
        } 

        private Builder(SubmitHighlightExtractionJobRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.clientToken = request.clientToken;
            this.inputConfig = request.inputConfig;
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
         * <p>The client token used to ensure the idempotency of the request.</p>
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
         * <p>The input configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *     &quot;MediaArray&quot;: [{
         *         &quot;MediaId&quot;: &quot;ceb72f00e<strong><strong>1ef8216e7e6c64a6302&quot;
         *     }, {
         *         &quot;MediaId&quot;: &quot;ce450c40e</strong></strong>1ef8216e7e6c64a6302&quot;
         *     }, {
         *         &quot;MediaId&quot;: &quot;ce49a020e<strong><strong>1ef81c1e6f6d5686302&quot;
         *     }, {
         *         &quot;MediaId&quot;: &quot;d047e120e</strong></strong>1ef81c1e6f6d5686302&quot;
         *     }, {
         *         &quot;MediaId&quot;: &quot;cfe2ddc0e****1ef81c1e6f6d5686302&quot;
         *     }],
         *     &quot;Strategy&quot;: {
         *         &quot;Count&quot;: 5,
         *         &quot;ClipDuration&quot;: 15
         *     }
         * }</p>
         */
        public Builder inputConfig(String inputConfig) {
            this.putBodyParameter("InputConfig", inputConfig);
            this.inputConfig = inputConfig;
            return this;
        }

        /**
         * <p>The output configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *     &quot;NeedExport&quot;: true,
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
         * <p>The user-defined data, including the business and callback configurations. For more information, see <a href="~~357745#section-urj-v3f-0s1~~">UserData</a>.</p>
         */
        public Builder userData(String userData) {
            this.putQueryParameter("UserData", userData);
            this.userData = userData;
            return this;
        }

        @Override
        public SubmitHighlightExtractionJobRequest build() {
            return new SubmitHighlightExtractionJobRequest(this);
        } 

    } 

}
