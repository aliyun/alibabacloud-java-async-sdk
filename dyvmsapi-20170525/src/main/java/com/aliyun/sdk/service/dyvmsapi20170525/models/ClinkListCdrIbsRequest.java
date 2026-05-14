// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dyvmsapi20170525.models;

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
 * {@link ClinkListCdrIbsRequest} extends {@link RequestModel}
 *
 * <p>ClinkListCdrIbsRequest</p>
 */
public class ClinkListCdrIbsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientNumber")
    private String clientNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Cno")
    private String cno;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CustomerNumber")
    private String customerNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTime")
    private Long endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnterpriseId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long enterpriseId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HiddenType")
    private Long hiddenType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Limit")
    private Long limit;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MainUniqueId")
    private String mainUniqueId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Offset")
    private Long offset;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Qno")
    private String qno;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("QueueAnswerInTime")
    private Long queueAnswerInTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
    private Long startTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Status")
    private Long status;

    private ClinkListCdrIbsRequest(Builder builder) {
        super(builder);
        this.clientNumber = builder.clientNumber;
        this.cno = builder.cno;
        this.customerNumber = builder.customerNumber;
        this.endTime = builder.endTime;
        this.enterpriseId = builder.enterpriseId;
        this.hiddenType = builder.hiddenType;
        this.limit = builder.limit;
        this.mainUniqueId = builder.mainUniqueId;
        this.offset = builder.offset;
        this.ownerId = builder.ownerId;
        this.qno = builder.qno;
        this.queueAnswerInTime = builder.queueAnswerInTime;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.startTime = builder.startTime;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ClinkListCdrIbsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clientNumber
     */
    public String getClientNumber() {
        return this.clientNumber;
    }

    /**
     * @return cno
     */
    public String getCno() {
        return this.cno;
    }

    /**
     * @return customerNumber
     */
    public String getCustomerNumber() {
        return this.customerNumber;
    }

    /**
     * @return endTime
     */
    public Long getEndTime() {
        return this.endTime;
    }

    /**
     * @return enterpriseId
     */
    public Long getEnterpriseId() {
        return this.enterpriseId;
    }

    /**
     * @return hiddenType
     */
    public Long getHiddenType() {
        return this.hiddenType;
    }

    /**
     * @return limit
     */
    public Long getLimit() {
        return this.limit;
    }

    /**
     * @return mainUniqueId
     */
    public String getMainUniqueId() {
        return this.mainUniqueId;
    }

    /**
     * @return offset
     */
    public Long getOffset() {
        return this.offset;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return qno
     */
    public String getQno() {
        return this.qno;
    }

    /**
     * @return queueAnswerInTime
     */
    public Long getQueueAnswerInTime() {
        return this.queueAnswerInTime;
    }

    /**
     * @return resourceOwnerAccount
     */
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    /**
     * @return resourceOwnerId
     */
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    /**
     * @return startTime
     */
    public Long getStartTime() {
        return this.startTime;
    }

    /**
     * @return status
     */
    public Long getStatus() {
        return this.status;
    }

    public static final class Builder extends Request.Builder<ClinkListCdrIbsRequest, Builder> {
        private String clientNumber; 
        private String cno; 
        private String customerNumber; 
        private Long endTime; 
        private Long enterpriseId; 
        private Long hiddenType; 
        private Long limit; 
        private String mainUniqueId; 
        private Long offset; 
        private Long ownerId; 
        private String qno; 
        private Long queueAnswerInTime; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private Long startTime; 
        private Long status; 

        private Builder() {
            super();
        } 

        private Builder(ClinkListCdrIbsRequest request) {
            super(request);
            this.clientNumber = request.clientNumber;
            this.cno = request.cno;
            this.customerNumber = request.customerNumber;
            this.endTime = request.endTime;
            this.enterpriseId = request.enterpriseId;
            this.hiddenType = request.hiddenType;
            this.limit = request.limit;
            this.mainUniqueId = request.mainUniqueId;
            this.offset = request.offset;
            this.ownerId = request.ownerId;
            this.qno = request.qno;
            this.queueAnswerInTime = request.queueAnswerInTime;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.startTime = request.startTime;
            this.status = request.status;
        } 

        /**
         * ClientNumber.
         */
        public Builder clientNumber(String clientNumber) {
            this.putQueryParameter("ClientNumber", clientNumber);
            this.clientNumber = clientNumber;
            return this;
        }

        /**
         * Cno.
         */
        public Builder cno(String cno) {
            this.putQueryParameter("Cno", cno);
            this.cno = cno;
            return this;
        }

        /**
         * CustomerNumber.
         */
        public Builder customerNumber(String customerNumber) {
            this.putQueryParameter("CustomerNumber", customerNumber);
            this.customerNumber = customerNumber;
            return this;
        }

        /**
         * EndTime.
         */
        public Builder endTime(Long endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>呼叫中心 id</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>8004970</p>
         */
        public Builder enterpriseId(Long enterpriseId) {
            this.putQueryParameter("EnterpriseId", enterpriseId);
            this.enterpriseId = enterpriseId;
            return this;
        }

        /**
         * HiddenType.
         */
        public Builder hiddenType(Long hiddenType) {
            this.putQueryParameter("HiddenType", hiddenType);
            this.hiddenType = hiddenType;
            return this;
        }

        /**
         * Limit.
         */
        public Builder limit(Long limit) {
            this.putQueryParameter("Limit", limit);
            this.limit = limit;
            return this;
        }

        /**
         * MainUniqueId.
         */
        public Builder mainUniqueId(String mainUniqueId) {
            this.putQueryParameter("MainUniqueId", mainUniqueId);
            this.mainUniqueId = mainUniqueId;
            return this;
        }

        /**
         * Offset.
         */
        public Builder offset(Long offset) {
            this.putQueryParameter("Offset", offset);
            this.offset = offset;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * Qno.
         */
        public Builder qno(String qno) {
            this.putQueryParameter("Qno", qno);
            this.qno = qno;
            return this;
        }

        /**
         * QueueAnswerInTime.
         */
        public Builder queueAnswerInTime(Long queueAnswerInTime) {
            this.putQueryParameter("QueueAnswerInTime", queueAnswerInTime);
            this.queueAnswerInTime = queueAnswerInTime;
            return this;
        }

        /**
         * ResourceOwnerAccount.
         */
        public Builder resourceOwnerAccount(String resourceOwnerAccount) {
            this.putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
            this.resourceOwnerAccount = resourceOwnerAccount;
            return this;
        }

        /**
         * ResourceOwnerId.
         */
        public Builder resourceOwnerId(Long resourceOwnerId) {
            this.putQueryParameter("ResourceOwnerId", resourceOwnerId);
            this.resourceOwnerId = resourceOwnerId;
            return this;
        }

        /**
         * StartTime.
         */
        public Builder startTime(Long startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * Status.
         */
        public Builder status(Long status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        @Override
        public ClinkListCdrIbsRequest build() {
            return new ClinkListCdrIbsRequest(this);
        } 

    } 

}
