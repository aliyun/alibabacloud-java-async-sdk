// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dm20151123.models;

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
 * {@link ValidateEmailResponseBody} extends {@link TeaModel}
 *
 * <p>ValidateEmailResponseBody</p>
 */
public class ValidateEmailResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DomainPart")
    private String domainPart;

    @com.aliyun.core.annotation.NameInMap("IsFreeMail")
    private Boolean isFreeMail;

    @com.aliyun.core.annotation.NameInMap("LocalPart")
    private String localPart;

    @com.aliyun.core.annotation.NameInMap("Provider")
    private String provider;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Status")
    @com.aliyun.core.annotation.Validation(required = true)
    private String status;

    @com.aliyun.core.annotation.NameInMap("SubStatus")
    @com.aliyun.core.annotation.Validation(required = true)
    private String subStatus;

    private ValidateEmailResponseBody(Builder builder) {
        this.domainPart = builder.domainPart;
        this.isFreeMail = builder.isFreeMail;
        this.localPart = builder.localPart;
        this.provider = builder.provider;
        this.requestId = builder.requestId;
        this.status = builder.status;
        this.subStatus = builder.subStatus;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ValidateEmailResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return domainPart
     */
    public String getDomainPart() {
        return this.domainPart;
    }

    /**
     * @return isFreeMail
     */
    public Boolean getIsFreeMail() {
        return this.isFreeMail;
    }

    /**
     * @return localPart
     */
    public String getLocalPart() {
        return this.localPart;
    }

    /**
     * @return provider
     */
    public String getProvider() {
        return this.provider;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return subStatus
     */
    public String getSubStatus() {
        return this.subStatus;
    }

    public static final class Builder {
        private String domainPart; 
        private Boolean isFreeMail; 
        private String localPart; 
        private String provider; 
        private String requestId; 
        private String status; 
        private String subStatus; 

        private Builder() {
        } 

        private Builder(ValidateEmailResponseBody model) {
            this.domainPart = model.domainPart;
            this.isFreeMail = model.isFreeMail;
            this.localPart = model.localPart;
            this.provider = model.provider;
            this.requestId = model.requestId;
            this.status = model.status;
            this.subStatus = model.subStatus;
        } 

        /**
         * DomainPart.
         */
        public Builder domainPart(String domainPart) {
            this.domainPart = domainPart;
            return this;
        }

        /**
         * IsFreeMail.
         */
        public Builder isFreeMail(Boolean isFreeMail) {
            this.isFreeMail = isFreeMail;
            return this;
        }

        /**
         * LocalPart.
         */
        public Builder localPart(String localPart) {
            this.localPart = localPart;
            return this;
        }

        /**
         * Provider.
         */
        public Builder provider(String provider) {
            this.provider = provider;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>VALID</p>
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>UNSPECIFIED</p>
         */
        public Builder subStatus(String subStatus) {
            this.subStatus = subStatus;
            return this;
        }

        public ValidateEmailResponseBody build() {
            return new ValidateEmailResponseBody(this);
        } 

    } 

}
