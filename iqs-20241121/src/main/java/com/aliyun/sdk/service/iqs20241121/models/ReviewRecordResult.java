// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iqs20241121.models;

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
 * {@link ReviewRecordResult} extends {@link TeaModel}
 *
 * <p>ReviewRecordResult</p>
 */
public class ReviewRecordResult extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("address")
    private String address;

    @com.aliyun.core.annotation.NameInMap("applyType")
    private String applyType;

    @com.aliyun.core.annotation.NameInMap("contactName")
    private String contactName;

    @com.aliyun.core.annotation.NameInMap("phone")
    private String phone;

    @com.aliyun.core.annotation.NameInMap("sceneDesc")
    private String sceneDesc;

    @com.aliyun.core.annotation.NameInMap("scopes")
    private java.util.List<String> scopes;

    @com.aliyun.core.annotation.NameInMap("serviceType")
    private String serviceType;

    private ReviewRecordResult(Builder builder) {
        this.address = builder.address;
        this.applyType = builder.applyType;
        this.contactName = builder.contactName;
        this.phone = builder.phone;
        this.sceneDesc = builder.sceneDesc;
        this.scopes = builder.scopes;
        this.serviceType = builder.serviceType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ReviewRecordResult create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return address
     */
    public String getAddress() {
        return this.address;
    }

    /**
     * @return applyType
     */
    public String getApplyType() {
        return this.applyType;
    }

    /**
     * @return contactName
     */
    public String getContactName() {
        return this.contactName;
    }

    /**
     * @return phone
     */
    public String getPhone() {
        return this.phone;
    }

    /**
     * @return sceneDesc
     */
    public String getSceneDesc() {
        return this.sceneDesc;
    }

    /**
     * @return scopes
     */
    public java.util.List<String> getScopes() {
        return this.scopes;
    }

    /**
     * @return serviceType
     */
    public String getServiceType() {
        return this.serviceType;
    }

    public static final class Builder {
        private String address; 
        private String applyType; 
        private String contactName; 
        private String phone; 
        private String sceneDesc; 
        private java.util.List<String> scopes; 
        private String serviceType; 

        private Builder() {
        } 

        private Builder(ReviewRecordResult model) {
            this.address = model.address;
            this.applyType = model.applyType;
            this.contactName = model.contactName;
            this.phone = model.phone;
            this.sceneDesc = model.sceneDesc;
            this.scopes = model.scopes;
            this.serviceType = model.serviceType;
        } 

        /**
         * address.
         */
        public Builder address(String address) {
            this.address = address;
            return this;
        }

        /**
         * applyType.
         */
        public Builder applyType(String applyType) {
            this.applyType = applyType;
            return this;
        }

        /**
         * contactName.
         */
        public Builder contactName(String contactName) {
            this.contactName = contactName;
            return this;
        }

        /**
         * phone.
         */
        public Builder phone(String phone) {
            this.phone = phone;
            return this;
        }

        /**
         * sceneDesc.
         */
        public Builder sceneDesc(String sceneDesc) {
            this.sceneDesc = sceneDesc;
            return this;
        }

        /**
         * scopes.
         */
        public Builder scopes(java.util.List<String> scopes) {
            this.scopes = scopes;
            return this;
        }

        /**
         * serviceType.
         */
        public Builder serviceType(String serviceType) {
            this.serviceType = serviceType;
            return this;
        }

        public ReviewRecordResult build() {
            return new ReviewRecordResult(this);
        } 

    } 

}
