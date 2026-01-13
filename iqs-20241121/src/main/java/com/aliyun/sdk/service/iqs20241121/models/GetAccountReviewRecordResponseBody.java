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
 * {@link GetAccountReviewRecordResponseBody} extends {@link TeaModel}
 *
 * <p>GetAccountReviewRecordResponseBody</p>
 */
public class GetAccountReviewRecordResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("address")
    private String address;

    @com.aliyun.core.annotation.NameInMap("aliUid")
    private String aliUid;

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

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("sceneDesc")
    private String sceneDesc;

    @com.aliyun.core.annotation.NameInMap("scopes")
    private java.util.List<String> scopes;

    @com.aliyun.core.annotation.NameInMap("serviceType")
    private String serviceType;

    private GetAccountReviewRecordResponseBody(Builder builder) {
        this.address = builder.address;
        this.aliUid = builder.aliUid;
        this.applyType = builder.applyType;
        this.contactName = builder.contactName;
        this.instanceId = builder.instanceId;
        this.phone = builder.phone;
        this.productName = builder.productName;
        this.qps = builder.qps;
        this.requestId = builder.requestId;
        this.sceneDesc = builder.sceneDesc;
        this.scopes = builder.scopes;
        this.serviceType = builder.serviceType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAccountReviewRecordResponseBody create() {
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
     * @return aliUid
     */
    public String getAliUid() {
        return this.aliUid;
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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
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
        private String aliUid; 
        private String applyType; 
        private String contactName; 
        private String instanceId; 
        private String phone; 
        private String productName; 
        private Integer qps; 
        private String requestId; 
        private String sceneDesc; 
        private java.util.List<String> scopes; 
        private String serviceType; 

        private Builder() {
        } 

        private Builder(GetAccountReviewRecordResponseBody model) {
            this.address = model.address;
            this.aliUid = model.aliUid;
            this.applyType = model.applyType;
            this.contactName = model.contactName;
            this.instanceId = model.instanceId;
            this.phone = model.phone;
            this.productName = model.productName;
            this.qps = model.qps;
            this.requestId = model.requestId;
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
         * aliUid.
         */
        public Builder aliUid(String aliUid) {
            this.aliUid = aliUid;
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
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>6788a2c2-157d4ebe-ad979cd4f296</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
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

        public GetAccountReviewRecordResponseBody build() {
            return new GetAccountReviewRecordResponseBody(this);
        } 

    } 

}
