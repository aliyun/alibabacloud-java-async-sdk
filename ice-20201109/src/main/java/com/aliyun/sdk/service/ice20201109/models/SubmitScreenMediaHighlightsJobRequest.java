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
 * {@link SubmitScreenMediaHighlightsJobRequest} extends {@link RequestModel}
 *
 * <p>SubmitScreenMediaHighlightsJobRequest</p>
 */
public class SubmitScreenMediaHighlightsJobRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EditingConfig")
    private String editingConfig;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("InputConfig")
    private String inputConfig;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OutputConfig")
    private String outputConfig;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserData")
    private String userData;

    private SubmitScreenMediaHighlightsJobRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.editingConfig = builder.editingConfig;
        this.inputConfig = builder.inputConfig;
        this.outputConfig = builder.outputConfig;
        this.userData = builder.userData;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SubmitScreenMediaHighlightsJobRequest create() {
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
     * @return editingConfig
     */
    public String getEditingConfig() {
        return this.editingConfig;
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

    public static final class Builder extends Request.Builder<SubmitScreenMediaHighlightsJobRequest, Builder> {
        private String regionId; 
        private String editingConfig; 
        private String inputConfig; 
        private String outputConfig; 
        private String userData; 

        private Builder() {
            super();
        } 

        private Builder(SubmitScreenMediaHighlightsJobRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.editingConfig = request.editingConfig;
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
         * <p>The editing configuration. For detailed parameters, see <a href="~~2863940#9b05519d46e0x~~">EditingConfig</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *     &quot;MediaConfig&quot;: {
         *         &quot;Volume&quot;: 1
         *     },
         *     &quot;ProcessConfig&quot;: {
         *         &quot;AllowTransition&quot;: true,
         *         &quot;TransitionList&quot;: [&quot;fadecolor&quot;]
         *     }
         * }</p>
         */
        public Builder editingConfig(String editingConfig) {
            this.putBodyParameter("EditingConfig", editingConfig);
            this.editingConfig = editingConfig;
            return this;
        }

        /**
         * <p>The input configuration. For detailed parameters, see <a href="~~2863940#dda38bf6ec2pk~~">InputConfig</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *     &quot;MediaArray&quot;: [
         *         &quot;<strong><strong>9d46c886b45481030f6e</strong></strong>&quot;,
         *         &quot;<strong><strong>6c886b4549d481030f6e</strong></strong>&quot;
         *     ]
         * }</p>
         */
        public Builder inputConfig(String inputConfig) {
            this.putBodyParameter("InputConfig", inputConfig);
            this.inputConfig = inputConfig;
            return this;
        }

        /**
         * <p>The output configuration. For detailed parameters, see <a href="~~2863940#4111a373d0xbz~~">OutputConfig</a>.</p>
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
         * <p>The user-defined data, including the business and callback configurations. For more information, see <a href="https://help.aliyun.com/document_detail/357745.html">UserData</a>.</p>
         */
        public Builder userData(String userData) {
            this.putQueryParameter("UserData", userData);
            this.userData = userData;
            return this;
        }

        @Override
        public SubmitScreenMediaHighlightsJobRequest build() {
            return new SubmitScreenMediaHighlightsJobRequest(this);
        } 

    } 

}
