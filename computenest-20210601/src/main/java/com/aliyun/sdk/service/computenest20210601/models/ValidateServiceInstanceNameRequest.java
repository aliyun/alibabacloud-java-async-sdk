// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.computenest20210601.models;

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
 * {@link ValidateServiceInstanceNameRequest} extends {@link RequestModel}
 *
 * <p>ValidateServiceInstanceNameRequest</p>
 */
public class ValidateServiceInstanceNameRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IsTrial")
    private Boolean isTrial;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ServiceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String serviceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ServiceInstanceName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String serviceInstanceName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ServiceVersion")
    private String serviceVersion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TemplateName")
    private String templateName;

    private ValidateServiceInstanceNameRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.isTrial = builder.isTrial;
        this.serviceId = builder.serviceId;
        this.serviceInstanceName = builder.serviceInstanceName;
        this.serviceVersion = builder.serviceVersion;
        this.templateName = builder.templateName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ValidateServiceInstanceNameRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return isTrial
     */
    public Boolean getIsTrial() {
        return this.isTrial;
    }

    /**
     * @return serviceId
     */
    public String getServiceId() {
        return this.serviceId;
    }

    /**
     * @return serviceInstanceName
     */
    public String getServiceInstanceName() {
        return this.serviceInstanceName;
    }

    /**
     * @return serviceVersion
     */
    public String getServiceVersion() {
        return this.serviceVersion;
    }

    /**
     * @return templateName
     */
    public String getTemplateName() {
        return this.templateName;
    }

    public static final class Builder extends Request.Builder<ValidateServiceInstanceNameRequest, Builder> {
        private String clientToken; 
        private Boolean isTrial; 
        private String serviceId; 
        private String serviceInstanceName; 
        private String serviceVersion; 
        private String templateName; 

        private Builder() {
            super();
        } 

        private Builder(ValidateServiceInstanceNameRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.isTrial = request.isTrial;
            this.serviceId = request.serviceId;
            this.serviceInstanceName = request.serviceInstanceName;
            this.serviceVersion = request.serviceVersion;
            this.templateName = request.templateName;
        } 

        /**
         * ClientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * IsTrial.
         */
        public Builder isTrial(Boolean isTrial) {
            this.putQueryParameter("IsTrial", isTrial);
            this.isTrial = isTrial;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>service-12xxxxxx</p>
         */
        public Builder serviceId(String serviceId) {
            this.putQueryParameter("ServiceId", serviceId);
            this.serviceId = serviceId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>testName</p>
         */
        public Builder serviceInstanceName(String serviceInstanceName) {
            this.putQueryParameter("ServiceInstanceName", serviceInstanceName);
            this.serviceInstanceName = serviceInstanceName;
            return this;
        }

        /**
         * ServiceVersion.
         */
        public Builder serviceVersion(String serviceVersion) {
            this.putQueryParameter("ServiceVersion", serviceVersion);
            this.serviceVersion = serviceVersion;
            return this;
        }

        /**
         * TemplateName.
         */
        public Builder templateName(String templateName) {
            this.putQueryParameter("TemplateName", templateName);
            this.templateName = templateName;
            return this;
        }

        @Override
        public ValidateServiceInstanceNameRequest build() {
            return new ValidateServiceInstanceNameRequest(this);
        } 

    } 

}
