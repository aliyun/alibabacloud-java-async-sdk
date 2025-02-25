// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sophonsoar20220728.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ModifyPlaybookInputOutputRequest} extends {@link RequestModel}
 *
 * <p>ModifyPlaybookInputOutputRequest</p>
 */
public class ModifyPlaybookInputOutputRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ExeConfig")
    private String exeConfig;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("InputParams")
    @com.aliyun.core.annotation.Validation(required = true)
    private String inputParams;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("OutputParams")
    @com.aliyun.core.annotation.Validation(required = true)
    private String outputParams;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ParamType")
    private String paramType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PlaybookUuid")
    @com.aliyun.core.annotation.Validation(required = true)
    private String playbookUuid;

    private ModifyPlaybookInputOutputRequest(Builder builder) {
        super(builder);
        this.exeConfig = builder.exeConfig;
        this.inputParams = builder.inputParams;
        this.lang = builder.lang;
        this.outputParams = builder.outputParams;
        this.paramType = builder.paramType;
        this.playbookUuid = builder.playbookUuid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyPlaybookInputOutputRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return exeConfig
     */
    public String getExeConfig() {
        return this.exeConfig;
    }

    /**
     * @return inputParams
     */
    public String getInputParams() {
        return this.inputParams;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return outputParams
     */
    public String getOutputParams() {
        return this.outputParams;
    }

    /**
     * @return paramType
     */
    public String getParamType() {
        return this.paramType;
    }

    /**
     * @return playbookUuid
     */
    public String getPlaybookUuid() {
        return this.playbookUuid;
    }

    public static final class Builder extends Request.Builder<ModifyPlaybookInputOutputRequest, Builder> {
        private String exeConfig; 
        private String inputParams; 
        private String lang; 
        private String outputParams; 
        private String paramType; 
        private String playbookUuid; 

        private Builder() {
            super();
        } 

        private Builder(ModifyPlaybookInputOutputRequest request) {
            super(request);
            this.exeConfig = request.exeConfig;
            this.inputParams = request.inputParams;
            this.lang = request.lang;
            this.outputParams = request.outputParams;
            this.paramType = request.paramType;
            this.playbookUuid = request.playbookUuid;
        } 

        /**
         * <p>The executed mode of a playbook. The value is a JSON array.</p>
         */
        public Builder exeConfig(String exeConfig) {
            this.putBodyParameter("ExeConfig", exeConfig);
            this.exeConfig = exeConfig;
            return this;
        }

        /**
         * <p>The configuration of the input parameters. The value is a JSON array.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>[
         *     {
         *         &quot;typeName&quot;: &quot;String&quot;,
         *         &quot;dataClass&quot;: &quot;normal&quot;,
         *         &quot;dataType&quot;: &quot;String&quot;,
         *         &quot;description&quot;: &quot;period&quot;,
         *         &quot;example&quot;: &quot;&quot;,
         *         &quot;name&quot;: &quot;period&quot;,
         *         &quot;required&quot;: false
         *     }
         * ]</p>
         */
        public Builder inputParams(String inputParams) {
            this.putBodyParameter("InputParams", inputParams);
            this.inputParams = inputParams;
            return this;
        }

        /**
         * <p>The language of the content within the request and response.</p>
         * <ul>
         * <li><strong>zh</strong>: Chinese (default)</li>
         * <li><strong>en</strong>: English</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>zh</p>
         */
        public Builder lang(String lang) {
            this.putBodyParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * <p>The configuration of the output parameters. This parameter is unavailable. Leave it empty.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>[]</p>
         */
        public Builder outputParams(String outputParams) {
            this.putBodyParameter("OutputParams", outputParams);
            this.outputParams = outputParams;
            return this;
        }

        /**
         * <p>The input parameter type.</p>
         * <ul>
         * <li><strong>template-ip</strong></li>
         * <li><strong>template-file</strong></li>
         * <li><strong>template-process</strong></li>
         * <li><strong>custom</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>custom</p>
         */
        public Builder paramType(String paramType) {
            this.putBodyParameter("ParamType", paramType);
            this.paramType = paramType;
            return this;
        }

        /**
         * <p>The UUID of the playbook.</p>
         * <blockquote>
         * <p> You can call the <a href="~~DescribePlaybooks~~">DescribePlaybooks</a>operation to query the playbook UUID.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>8baa6cff-319e-4ede-97bc-xxxxxxx</p>
         */
        public Builder playbookUuid(String playbookUuid) {
            this.putBodyParameter("PlaybookUuid", playbookUuid);
            this.playbookUuid = playbookUuid;
            return this;
        }

        @Override
        public ModifyPlaybookInputOutputRequest build() {
            return new ModifyPlaybookInputOutputRequest(this);
        } 

    } 

}
