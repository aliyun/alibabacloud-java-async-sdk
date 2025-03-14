// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link AddSasModuleTrialRequest} extends {@link RequestModel}
 *
 * <p>AddSasModuleTrialRequest</p>
 */
public class AddSasModuleTrialRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ModuleCode")
    private String moduleCode;

    private AddSasModuleTrialRequest(Builder builder) {
        super(builder);
        this.lang = builder.lang;
        this.moduleCode = builder.moduleCode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddSasModuleTrialRequest create() {
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

    public static final class Builder extends Request.Builder<AddSasModuleTrialRequest, Builder> {
        private String lang; 
        private String moduleCode; 

        private Builder() {
            super();
        } 

        private Builder(AddSasModuleTrialRequest request) {
            super(request);
            this.lang = request.lang;
            this.moduleCode = request.moduleCode;
        } 

        /**
         * <p>The language of the content within the request and response. Valid values:</p>
         * <ul>
         * <li><strong>zh</strong>: Chinese</li>
         * <li><strong>en</strong>: English</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>zh</p>
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * <p>The code of the feature. Valid values:</p>
         * <ul>
         * <li><strong>vulFix</strong>: vulnerability fixing.</li>
         * <li><strong>cloudSiem</strong>: threat analysis and response.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>vulFix</p>
         */
        public Builder moduleCode(String moduleCode) {
            this.putQueryParameter("ModuleCode", moduleCode);
            this.moduleCode = moduleCode;
            return this;
        }

        @Override
        public AddSasModuleTrialRequest build() {
            return new AddSasModuleTrialRequest(this);
        } 

    } 

}
