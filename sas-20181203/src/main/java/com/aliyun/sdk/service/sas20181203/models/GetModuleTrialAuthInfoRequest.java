// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetModuleTrialAuthInfoRequest} extends {@link RequestModel}
 *
 * <p>GetModuleTrialAuthInfoRequest</p>
 */
public class GetModuleTrialAuthInfoRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ModuleCode")
    private String moduleCode;

    private GetModuleTrialAuthInfoRequest(Builder builder) {
        super(builder);
        this.lang = builder.lang;
        this.moduleCode = builder.moduleCode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetModuleTrialAuthInfoRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return moduleCode
     */
    public String getModuleCode() {
        return this.moduleCode;
    }

    public static final class Builder extends Request.Builder<GetModuleTrialAuthInfoRequest, Builder> {
        private String lang; 
        private String moduleCode; 

        private Builder() {
            super();
        } 

        private Builder(GetModuleTrialAuthInfoRequest request) {
            super(request);
            this.lang = request.lang;
            this.moduleCode = request.moduleCode;
        } 

        /**
         * The language of the content within the request and response. Default value: **zh**. Valid values:
         * <p>
         * 
         * *   **zh**: Chinese
         * *   **en**: English
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * The module code. Valid values:
         * <p>
         * 
         * *   **vulFix**: vulnerability fixing
         * *   **cloudSiem**: threat analysis
         */
        public Builder moduleCode(String moduleCode) {
            this.putQueryParameter("ModuleCode", moduleCode);
            this.moduleCode = moduleCode;
            return this;
        }

        @Override
        public GetModuleTrialAuthInfoRequest build() {
            return new GetModuleTrialAuthInfoRequest(this);
        } 

    } 

}
