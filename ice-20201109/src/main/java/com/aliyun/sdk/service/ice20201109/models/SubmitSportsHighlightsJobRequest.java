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
 * {@link SubmitSportsHighlightsJobRequest} extends {@link RequestModel}
 *
 * <p>SubmitSportsHighlightsJobRequest</p>
 */
public class SubmitSportsHighlightsJobRequest extends Request {
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

    private SubmitSportsHighlightsJobRequest(Builder builder) {
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

    public static SubmitSportsHighlightsJobRequest create() {
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

    public static final class Builder extends Request.Builder<SubmitSportsHighlightsJobRequest, Builder> {
        private String regionId; 
        private String clientToken; 
        private String inputConfig; 
        private String outputConfig; 
        private String userData; 

        private Builder() {
            super();
        } 

        private Builder(SubmitSportsHighlightsJobRequest request) {
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
         * <p>The input configuration. For more information, see <a href="~~2843158#5cbc796a9cuu8~~">InputConfig parameter description</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *   &quot;SportsCategory&quot;: &quot;basketball&quot;,
         *   &quot;InputMedia&quot;: &quot;<a href="http://test-bucket.oss-cn-******.basketball-0707.mp4">http://test-bucket.oss-cn-******.basketball-0707.mp4</a>&quot;,
         *   &quot;FaceRegister&quot;: [
         *     {
         *       &quot;FaceUrls&quot;: [&quot;<a href="http://testcdn.com/front.jpg">http://testcdn.com/front.jpg</a>&quot;, &quot;<a href="http://testcdn.com/side.jpg%22%5D">http://testcdn.com/side.jpg&quot;]</a>,
         *       &quot;Name&quot;: &quot;James&quot;
         *     }
         *   ],
         *   &quot;SlowMotionLogoRegister&quot;: {
         *       &quot;SlowMotionLogoUrls&quot;: [&quot;<a href="http://testcdn.com/logo1.jpg">http://testcdn.com/logo1.jpg</a>&quot;, &quot;<a href="http://testcdn.com/logo2.jpg%22%5D">http://testcdn.com/logo2.jpg&quot;]</a>
         *   },
         *   &quot;TransferNameRegister&quot;: [
         *     {
         *       &quot;OriginalName&quot;: &quot;IND&quot;,
         *       &quot;TransferName&quot;: &quot;Indiana Pacers&quot;
         *     }
         *   ]
         * }</p>
         */
        public Builder inputConfig(String inputConfig) {
            this.putBodyParameter("InputConfig", inputConfig);
            this.inputConfig = inputConfig;
            return this;
        }

        /**
         * <p>The output configuration. For more information, see <a href="~~2843158#b7dad99fe5q0r~~">OutputConfig parameter description</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *   &quot;MediaURL&quot;: &quot;<a href="http://xxx.oss-cn-shanghai.aliyuncs.com/xxx_%7Bindex%7D.mp4">http://xxx.oss-cn-shanghai.aliyuncs.com/xxx_{index}.mp4</a>&quot;,
         *   &quot;Count&quot;: 1,
         *   &quot;Width&quot;: 1080,
         *   &quot;Height&quot;: 1920
         * }</p>
         */
        public Builder outputConfig(String outputConfig) {
            this.putQueryParameter("OutputConfig", outputConfig);
            this.outputConfig = outputConfig;
            return this;
        }

        /**
         * <p>The user business configuration and callback configuration. For more information about the structure, see <a href="https://help.aliyun.com/document_detail/357745.html">UserData configuration</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;NotifyAddress&quot;:&quot;<a href="http://xx.xx.xxx%22%7D">http://xx.xx.xxx&quot;}</a> or {&quot;NotifyAddress&quot;:&quot;<a href="https://xx.xx.xxx%22%7D">https://xx.xx.xxx&quot;}</a> or {&quot;NotifyAddress&quot;:&quot;ice-callback-demo&quot;}</p>
         */
        public Builder userData(String userData) {
            this.putQueryParameter("UserData", userData);
            this.userData = userData;
            return this;
        }

        @Override
        public SubmitSportsHighlightsJobRequest build() {
            return new SubmitSportsHighlightsJobRequest(this);
        } 

    } 

}
