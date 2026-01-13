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
 * {@link ApplyFormalServiceCmd} extends {@link TeaModel}
 *
 * <p>ApplyFormalServiceCmd</p>
 */
public class ApplyFormalServiceCmd extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("accountId")
    private String accountId;

    @com.aliyun.core.annotation.NameInMap("accountName")
    private String accountName;

    @com.aliyun.core.annotation.NameInMap("address")
    private String address;

    @com.aliyun.core.annotation.NameInMap("applyServiceInfos")
    private java.util.List<java.util.Map<String, ?>> applyServiceInfos;

    @com.aliyun.core.annotation.NameInMap("applyType")
    private String applyType;

    @com.aliyun.core.annotation.NameInMap("contactName")
    private String contactName;

    @com.aliyun.core.annotation.NameInMap("instanceId")
    private String instanceId;

    @com.aliyun.core.annotation.NameInMap("phone")
    private String phone;

    @com.aliyun.core.annotation.NameInMap("productName")
    private String productName;

    @com.aliyun.core.annotation.NameInMap("qps")
    private Integer qps;

    @com.aliyun.core.annotation.NameInMap("sceneDesc")
    private String sceneDesc;

    @com.aliyun.core.annotation.NameInMap("serviceType")
    private String serviceType;

    private ApplyFormalServiceCmd(Builder builder) {
        this.accountId = builder.accountId;
        this.accountName = builder.accountName;
        this.address = builder.address;
        this.applyServiceInfos = builder.applyServiceInfos;
        this.applyType = builder.applyType;
        this.contactName = builder.contactName;
        this.instanceId = builder.instanceId;
        this.phone = builder.phone;
        this.productName = builder.productName;
        this.qps = builder.qps;
        this.sceneDesc = builder.sceneDesc;
        this.serviceType = builder.serviceType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ApplyFormalServiceCmd create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accountId
     */
    public String getAccountId() {
        return this.accountId;
    }

    /**
     * @return accountName
     */
    public String getAccountName() {
        return this.accountName;
    }

    /**
     * @return address
     */
    public String getAddress() {
        return this.address;
    }

    /**
     * @return applyServiceInfos
     */
    public java.util.List<java.util.Map<String, ?>> getApplyServiceInfos() {
        return this.applyServiceInfos;
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
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return phone
     */
    public String getPhone() {
        return this.phone;
    }

    /**
     * @return productName
     */
    public String getProductName() {
        return this.productName;
    }

    /**
     * @return qps
     */
    public Integer getQps() {
        return this.qps;
    }

    /**
     * @return sceneDesc
     */
    public String getSceneDesc() {
        return this.sceneDesc;
    }

    /**
     * @return serviceType
     */
    public String getServiceType() {
        return this.serviceType;
    }

    public static final class Builder {
        private String accountId; 
        private String accountName; 
        private String address; 
        private java.util.List<java.util.Map<String, ?>> applyServiceInfos; 
        private String applyType; 
        private String contactName; 
        private String instanceId; 
        private String phone; 
        private String productName; 
        private Integer qps; 
        private String sceneDesc; 
        private String serviceType; 

        private Builder() {
        } 

        private Builder(ApplyFormalServiceCmd model) {
            this.accountId = model.accountId;
            this.accountName = model.accountName;
            this.address = model.address;
            this.applyServiceInfos = model.applyServiceInfos;
            this.applyType = model.applyType;
            this.contactName = model.contactName;
            this.instanceId = model.instanceId;
            this.phone = model.phone;
            this.productName = model.productName;
            this.qps = model.qps;
            this.sceneDesc = model.sceneDesc;
            this.serviceType = model.serviceType;
        } 

        /**
         * accountId.
         */
        public Builder accountId(String accountId) {
            this.accountId = accountId;
            return this;
        }

        /**
         * accountName.
         */
        public Builder accountName(String accountName) {
            this.accountName = accountName;
            return this;
        }

        /**
         * address.
         */
        public Builder address(String address) {
            this.address = address;
            return this;
        }

        /**
         * applyServiceInfos.
         */
        public Builder applyServiceInfos(java.util.List<java.util.Map<String, ?>> applyServiceInfos) {
            this.applyServiceInfos = applyServiceInfos;
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
         * instanceId.
         */
        public Builder instanceId(String instanceId) {
            this.instanceId = instanceId;
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
         * productName.
         */
        public Builder productName(String productName) {
            this.productName = productName;
            return this;
        }

        /**
         * qps.
         */
        public Builder qps(Integer qps) {
            this.qps = qps;
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
         * serviceType.
         */
        public Builder serviceType(String serviceType) {
            this.serviceType = serviceType;
            return this;
        }

        public ApplyFormalServiceCmd build() {
            return new ApplyFormalServiceCmd(this);
        } 

    } 

}
