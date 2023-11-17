// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sophonsoar20220728.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyPlaybookInputOutputRequest} extends {@link RequestModel}
 *
 * <p>ModifyPlaybookInputOutputRequest</p>
 */
public class ModifyPlaybookInputOutputRequest extends Request {
    @Body
    @NameInMap("InputParams")
    @Validation(required = true)
    private String inputParams;

    @Body
    @NameInMap("Lang")
    private String lang;

    @Body
    @NameInMap("OutputParams")
    @Validation(required = true)
    private String outputParams;

    @Body
    @NameInMap("ParamType")
    private String paramType;

    @Body
    @NameInMap("PlaybookUuid")
    @Validation(required = true)
    private String playbookUuid;

    private ModifyPlaybookInputOutputRequest(Builder builder) {
        super(builder);
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
            this.inputParams = request.inputParams;
            this.lang = request.lang;
            this.outputParams = request.outputParams;
            this.paramType = request.paramType;
            this.playbookUuid = request.playbookUuid;
        } 

        /**
         * InputParams.
         */
        public Builder inputParams(String inputParams) {
            this.putBodyParameter("InputParams", inputParams);
            this.inputParams = inputParams;
            return this;
        }

        /**
         * Lang.
         */
        public Builder lang(String lang) {
            this.putBodyParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * OutputParams.
         */
        public Builder outputParams(String outputParams) {
            this.putBodyParameter("OutputParams", outputParams);
            this.outputParams = outputParams;
            return this;
        }

        /**
         * ParamType.
         */
        public Builder paramType(String paramType) {
            this.putBodyParameter("ParamType", paramType);
            this.paramType = paramType;
            return this;
        }

        /**
         * PlaybookUuid.
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
