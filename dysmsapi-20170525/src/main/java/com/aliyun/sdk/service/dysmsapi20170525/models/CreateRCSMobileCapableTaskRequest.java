// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dysmsapi20170525.models;

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
 * {@link CreateRCSMobileCapableTaskRequest} extends {@link RequestModel}
 *
 * <p>CreateRCSMobileCapableTaskRequest</p>
 */
public class CreateRCSMobileCapableTaskRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PhoneNumbersFile")
    @com.aliyun.core.annotation.Validation(required = true)
    private String phoneNumbersFile;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SignName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String signName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TemplateCode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String templateCode;

    private CreateRCSMobileCapableTaskRequest(Builder builder) {
        super(builder);
        this.phoneNumbersFile = builder.phoneNumbersFile;
        this.signName = builder.signName;
        this.templateCode = builder.templateCode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateRCSMobileCapableTaskRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return phoneNumbersFile
     */
    public String getPhoneNumbersFile() {
        return this.phoneNumbersFile;
    }

    /**
     * @return signName
     */
    public String getSignName() {
        return this.signName;
    }

    /**
     * @return templateCode
     */
    public String getTemplateCode() {
        return this.templateCode;
    }

    public static final class Builder extends Request.Builder<CreateRCSMobileCapableTaskRequest, Builder> {
        private String phoneNumbersFile; 
        private String signName; 
        private String templateCode; 

        private Builder() {
            super();
        } 

        private Builder(CreateRCSMobileCapableTaskRequest request) {
            super(request);
            this.phoneNumbersFile = request.phoneNumbersFile;
            this.signName = request.signName;
            this.templateCode = request.templateCode;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>示例值示例值</p>
         */
        public Builder phoneNumbersFile(String phoneNumbersFile) {
            this.putQueryParameter("PhoneNumbersFile", phoneNumbersFile);
            this.phoneNumbersFile = phoneNumbersFile;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>示例值</p>
         */
        public Builder signName(String signName) {
            this.putQueryParameter("SignName", signName);
            this.signName = signName;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>示例值示例值</p>
         */
        public Builder templateCode(String templateCode) {
            this.putQueryParameter("TemplateCode", templateCode);
            this.templateCode = templateCode;
            return this;
        }

        @Override
        public CreateRCSMobileCapableTaskRequest build() {
            return new CreateRCSMobileCapableTaskRequest(this);
        } 

    } 

}
