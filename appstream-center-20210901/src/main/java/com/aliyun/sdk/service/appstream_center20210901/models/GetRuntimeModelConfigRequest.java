// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.appstream_center20210901.models;

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
 * {@link GetRuntimeModelConfigRequest} extends {@link RequestModel}
 *
 * <p>GetRuntimeModelConfigRequest</p>
 */
public class GetRuntimeModelConfigRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AgentPlatform")
    private String agentPlatform;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AgentProvider")
    @com.aliyun.core.annotation.Validation(required = true)
    private String agentProvider;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IncludeRiskInfo")
    private Boolean includeRiskInfo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Language")
    private String language;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RuntimeId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String runtimeId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RuntimeType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String runtimeType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SmartModel")
    private Boolean smartModel;

    private GetRuntimeModelConfigRequest(Builder builder) {
        super(builder);
        this.agentPlatform = builder.agentPlatform;
        this.agentProvider = builder.agentProvider;
        this.includeRiskInfo = builder.includeRiskInfo;
        this.language = builder.language;
        this.runtimeId = builder.runtimeId;
        this.runtimeType = builder.runtimeType;
        this.smartModel = builder.smartModel;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetRuntimeModelConfigRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return agentPlatform
     */
    public String getAgentPlatform() {
        return this.agentPlatform;
    }

    /**
     * @return agentProvider
     */
    public String getAgentProvider() {
        return this.agentProvider;
    }

    /**
     * @return includeRiskInfo
     */
    public Boolean getIncludeRiskInfo() {
        return this.includeRiskInfo;
    }

    /**
     * @return language
     */
    public String getLanguage() {
        return this.language;
    }

    /**
     * @return runtimeId
     */
    public String getRuntimeId() {
        return this.runtimeId;
    }

    /**
     * @return runtimeType
     */
    public String getRuntimeType() {
        return this.runtimeType;
    }

    /**
     * @return smartModel
     */
    public Boolean getSmartModel() {
        return this.smartModel;
    }

    public static final class Builder extends Request.Builder<GetRuntimeModelConfigRequest, Builder> {
        private String agentPlatform; 
        private String agentProvider; 
        private Boolean includeRiskInfo; 
        private String language; 
        private String runtimeId; 
        private String runtimeType; 
        private Boolean smartModel; 

        private Builder() {
            super();
        } 

        private Builder(GetRuntimeModelConfigRequest request) {
            super(request);
            this.agentPlatform = request.agentPlatform;
            this.agentProvider = request.agentProvider;
            this.includeRiskInfo = request.includeRiskInfo;
            this.language = request.language;
            this.runtimeId = request.runtimeId;
            this.runtimeType = request.runtimeType;
            this.smartModel = request.smartModel;
        } 

        /**
         * <p>The agent platform.</p>
         * 
         * <strong>example:</strong>
         * <p>ENTERPRISE</p>
         */
        public Builder agentPlatform(String agentPlatform) {
            this.putQueryParameter("AgentPlatform", agentPlatform);
            this.agentPlatform = agentPlatform;
            return this;
        }

        /**
         * <p>The agent provider.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>OpenClaw</p>
         */
        public Builder agentProvider(String agentProvider) {
            this.putQueryParameter("AgentProvider", agentProvider);
            this.agentProvider = agentProvider;
            return this;
        }

        /**
         * <p>Specifies whether to include risk information.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder includeRiskInfo(Boolean includeRiskInfo) {
            this.putQueryParameter("IncludeRiskInfo", includeRiskInfo);
            this.includeRiskInfo = includeRiskInfo;
            return this;
        }

        /**
         * <p>The model display language. Valid values: zh-CN, en-US, ja-JP, and zh-TW. The value is case-insensitive, and leading and trailing spaces are removed. If this parameter is not specified, left empty, or set to an unsupported value, the default value zh-CN is used. The model pool description mapping is returned based on the normalized interface language, and falls back to Chinese if a translation is missing. Bailian and existing dynamic configurations still use Chinese for zh-CN and zh-TW, and English for en-US and ja-JP. This parameter is used for the names and descriptions of system intelligence tiers, as well as general model descriptions. Template fallback text, custom names, and runtime configurations retain their original values. The values zh_CN, en_US, ja_JP, and zh_TW are also supported, and en and ja are compatible. The value is case-insensitive, and leading and trailing spaces are removed. An invalid language value falls back to Chinese and does not cause a parameter error to be returned for Language. The names and descriptions of the four system intelligence tiers (Auto, Standard, Advanced, and Ultimate) support all four languages, and Chinese is retained for missing Japanese and Traditional Chinese items. User template names retain their original values.</p>
         * 
         * <strong>example:</strong>
         * <p>en_US</p>
         */
        public Builder language(String language) {
            this.putQueryParameter("Language", language);
            this.language = language;
            return this;
        }

        /**
         * <p>The agent runtime ID. The ID mappings are as follows:</p>
         * <p>JVS Computer: JVS Computer ID, in the format of jvs-xxxx.</p>
         * <p>OpenClaw: Cloud desktop ID, in the format of ecd-xxxx.</p>
         * <p>Hermes Agent: Hermes Agent ID, in the format of jvs-xxxx.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ecd-xxxx</p>
         */
        public Builder runtimeId(String runtimeId) {
            this.putQueryParameter("RuntimeId", runtimeId);
            this.runtimeId = runtimeId;
            return this;
        }

        /**
         * <p>The agent runtime type.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>CloudDesktop</p>
         */
        public Builder runtimeType(String runtimeType) {
            this.putQueryParameter("RuntimeType", runtimeType);
            this.runtimeType = runtimeType;
            return this;
        }

        /**
         * <p>The smart model filter. Valid values:</p>
         * <ul>
         * <li>true: Queries the system wuying-preset provider models based on the business type of the runtime.</li>
         * <li>false: Excludes wuying-preset from the effective configuration.</li>
         * <li>Not specified: Returns both smart and non-smart models in the effective configuration.
         * The business type is read by the server from runtime.biz_type, and the BizType input parameter is not required. Risk information is still independently controlled by IncludeRiskInfo.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder smartModel(Boolean smartModel) {
            this.putQueryParameter("SmartModel", smartModel);
            this.smartModel = smartModel;
            return this;
        }

        @Override
        public GetRuntimeModelConfigRequest build() {
            return new GetRuntimeModelConfigRequest(this);
        } 

    } 

}
