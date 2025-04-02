// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aliding20230426.models;

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
 * {@link GetUserLatestPlanResponseBody} extends {@link TeaModel}
 *
 * <p>GetUserLatestPlanResponseBody</p>
 */
public class GetUserLatestPlanResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("accountHandleStatus")
    private Integer accountHandleStatus;

    @com.aliyun.core.annotation.NameInMap("accountHandleTime")
    private String accountHandleTime;

    @com.aliyun.core.annotation.NameInMap("accountType")
    private Integer accountType;

    @com.aliyun.core.annotation.NameInMap("agreementFirstSignTime")
    private String agreementFirstSignTime;

    @com.aliyun.core.annotation.NameInMap("agreementLastSignTime")
    private String agreementLastSignTime;

    @com.aliyun.core.annotation.NameInMap("agreementStatus")
    private Integer agreementStatus;

    @com.aliyun.core.annotation.NameInMap("dataHandleEndTime")
    private String dataHandleEndTime;

    @com.aliyun.core.annotation.NameInMap("dataHandleStartTime")
    private String dataHandleStartTime;

    @com.aliyun.core.annotation.NameInMap("dataHandleStatus")
    private Integer dataHandleStatus;

    @com.aliyun.core.annotation.NameInMap("exclusivePlan")
    private Integer exclusivePlan;

    @com.aliyun.core.annotation.NameInMap("newAccountUid")
    private Long newAccountUid;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("status")
    private Integer status;

    @com.aliyun.core.annotation.NameInMap("vendorRequestId")
    private String vendorRequestId;

    @com.aliyun.core.annotation.NameInMap("vendorType")
    private String vendorType;

    private GetUserLatestPlanResponseBody(Builder builder) {
        this.accountHandleStatus = builder.accountHandleStatus;
        this.accountHandleTime = builder.accountHandleTime;
        this.accountType = builder.accountType;
        this.agreementFirstSignTime = builder.agreementFirstSignTime;
        this.agreementLastSignTime = builder.agreementLastSignTime;
        this.agreementStatus = builder.agreementStatus;
        this.dataHandleEndTime = builder.dataHandleEndTime;
        this.dataHandleStartTime = builder.dataHandleStartTime;
        this.dataHandleStatus = builder.dataHandleStatus;
        this.exclusivePlan = builder.exclusivePlan;
        this.newAccountUid = builder.newAccountUid;
        this.requestId = builder.requestId;
        this.status = builder.status;
        this.vendorRequestId = builder.vendorRequestId;
        this.vendorType = builder.vendorType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetUserLatestPlanResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accountHandleStatus
     */
    public Integer getAccountHandleStatus() {
        return this.accountHandleStatus;
    }

    /**
     * @return accountHandleTime
     */
    public String getAccountHandleTime() {
        return this.accountHandleTime;
    }

    /**
     * @return accountType
     */
    public Integer getAccountType() {
        return this.accountType;
    }

    /**
     * @return agreementFirstSignTime
     */
    public String getAgreementFirstSignTime() {
        return this.agreementFirstSignTime;
    }

    /**
     * @return agreementLastSignTime
     */
    public String getAgreementLastSignTime() {
        return this.agreementLastSignTime;
    }

    /**
     * @return agreementStatus
     */
    public Integer getAgreementStatus() {
        return this.agreementStatus;
    }

    /**
     * @return dataHandleEndTime
     */
    public String getDataHandleEndTime() {
        return this.dataHandleEndTime;
    }

    /**
     * @return dataHandleStartTime
     */
    public String getDataHandleStartTime() {
        return this.dataHandleStartTime;
    }

    /**
     * @return dataHandleStatus
     */
    public Integer getDataHandleStatus() {
        return this.dataHandleStatus;
    }

    /**
     * @return exclusivePlan
     */
    public Integer getExclusivePlan() {
        return this.exclusivePlan;
    }

    /**
     * @return newAccountUid
     */
    public Long getNewAccountUid() {
        return this.newAccountUid;
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
    public Integer getStatus() {
        return this.status;
    }

    /**
     * @return vendorRequestId
     */
    public String getVendorRequestId() {
        return this.vendorRequestId;
    }

    /**
     * @return vendorType
     */
    public String getVendorType() {
        return this.vendorType;
    }

    public static final class Builder {
        private Integer accountHandleStatus; 
        private String accountHandleTime; 
        private Integer accountType; 
        private String agreementFirstSignTime; 
        private String agreementLastSignTime; 
        private Integer agreementStatus; 
        private String dataHandleEndTime; 
        private String dataHandleStartTime; 
        private Integer dataHandleStatus; 
        private Integer exclusivePlan; 
        private Long newAccountUid; 
        private String requestId; 
        private Integer status; 
        private String vendorRequestId; 
        private String vendorType; 

        private Builder() {
        } 

        private Builder(GetUserLatestPlanResponseBody model) {
            this.accountHandleStatus = model.accountHandleStatus;
            this.accountHandleTime = model.accountHandleTime;
            this.accountType = model.accountType;
            this.agreementFirstSignTime = model.agreementFirstSignTime;
            this.agreementLastSignTime = model.agreementLastSignTime;
            this.agreementStatus = model.agreementStatus;
            this.dataHandleEndTime = model.dataHandleEndTime;
            this.dataHandleStartTime = model.dataHandleStartTime;
            this.dataHandleStatus = model.dataHandleStatus;
            this.exclusivePlan = model.exclusivePlan;
            this.newAccountUid = model.newAccountUid;
            this.requestId = model.requestId;
            this.status = model.status;
            this.vendorRequestId = model.vendorRequestId;
            this.vendorType = model.vendorType;
        } 

        /**
         * accountHandleStatus.
         */
        public Builder accountHandleStatus(Integer accountHandleStatus) {
            this.accountHandleStatus = accountHandleStatus;
            return this;
        }

        /**
         * accountHandleTime.
         */
        public Builder accountHandleTime(String accountHandleTime) {
            this.accountHandleTime = accountHandleTime;
            return this;
        }

        /**
         * accountType.
         */
        public Builder accountType(Integer accountType) {
            this.accountType = accountType;
            return this;
        }

        /**
         * agreementFirstSignTime.
         */
        public Builder agreementFirstSignTime(String agreementFirstSignTime) {
            this.agreementFirstSignTime = agreementFirstSignTime;
            return this;
        }

        /**
         * agreementLastSignTime.
         */
        public Builder agreementLastSignTime(String agreementLastSignTime) {
            this.agreementLastSignTime = agreementLastSignTime;
            return this;
        }

        /**
         * agreementStatus.
         */
        public Builder agreementStatus(Integer agreementStatus) {
            this.agreementStatus = agreementStatus;
            return this;
        }

        /**
         * dataHandleEndTime.
         */
        public Builder dataHandleEndTime(String dataHandleEndTime) {
            this.dataHandleEndTime = dataHandleEndTime;
            return this;
        }

        /**
         * dataHandleStartTime.
         */
        public Builder dataHandleStartTime(String dataHandleStartTime) {
            this.dataHandleStartTime = dataHandleStartTime;
            return this;
        }

        /**
         * dataHandleStatus.
         */
        public Builder dataHandleStatus(Integer dataHandleStatus) {
            this.dataHandleStatus = dataHandleStatus;
            return this;
        }

        /**
         * exclusivePlan.
         */
        public Builder exclusivePlan(Integer exclusivePlan) {
            this.exclusivePlan = exclusivePlan;
            return this;
        }

        /**
         * newAccountUid.
         */
        public Builder newAccountUid(Long newAccountUid) {
            this.newAccountUid = newAccountUid;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * status.
         */
        public Builder status(Integer status) {
            this.status = status;
            return this;
        }

        /**
         * vendorRequestId.
         */
        public Builder vendorRequestId(String vendorRequestId) {
            this.vendorRequestId = vendorRequestId;
            return this;
        }

        /**
         * vendorType.
         */
        public Builder vendorType(String vendorType) {
            this.vendorType = vendorType;
            return this;
        }

        public GetUserLatestPlanResponseBody build() {
            return new GetUserLatestPlanResponseBody(this);
        } 

    } 

}
