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
 * {@link SenderStatisticsByTagNameAndBatchIDRequest} extends {@link RequestModel}
 *
 * <p>SenderStatisticsByTagNameAndBatchIDRequest</p>
 */
public class SenderStatisticsByTagNameAndBatchIDRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AccountName")
    private String accountName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DedicatedIp")
    private String dedicatedIp;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DedicatedIpPoolId")
    private String dedicatedIpPoolId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private String endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Esp")
    private String esp;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private String startTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TagName")
    private String tagName;

    private SenderStatisticsByTagNameAndBatchIDRequest(Builder builder) {
        super(builder);
        this.accountName = builder.accountName;
        this.dedicatedIp = builder.dedicatedIp;
        this.dedicatedIpPoolId = builder.dedicatedIpPoolId;
        this.endTime = builder.endTime;
        this.esp = builder.esp;
        this.ownerId = builder.ownerId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.startTime = builder.startTime;
        this.tagName = builder.tagName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SenderStatisticsByTagNameAndBatchIDRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accountName
     */
    public String getAccountName() {
        return this.accountName;
    }

    /**
     * @return dedicatedIp
     */
    public String getDedicatedIp() {
        return this.dedicatedIp;
    }

    /**
     * @return dedicatedIpPoolId
     */
    public String getDedicatedIpPoolId() {
        return this.dedicatedIpPoolId;
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return esp
     */
    public String getEsp() {
        return this.esp;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
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
    public String getStartTime() {
        return this.startTime;
    }

    /**
     * @return tagName
     */
    public String getTagName() {
        return this.tagName;
    }

    public static final class Builder extends Request.Builder<SenderStatisticsByTagNameAndBatchIDRequest, Builder> {
        private String accountName; 
        private String dedicatedIp; 
        private String dedicatedIpPoolId; 
        private String endTime; 
        private String esp; 
        private Long ownerId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String startTime; 
        private String tagName; 

        private Builder() {
            super();
        } 

        private Builder(SenderStatisticsByTagNameAndBatchIDRequest request) {
            super(request);
            this.accountName = request.accountName;
            this.dedicatedIp = request.dedicatedIp;
            this.dedicatedIpPoolId = request.dedicatedIpPoolId;
            this.endTime = request.endTime;
            this.esp = request.esp;
            this.ownerId = request.ownerId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.startTime = request.startTime;
            this.tagName = request.tagName;
        } 

        /**
         * <p>Sending address. If not filled, it represents all addresses.</p>
         * 
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        public Builder accountName(String accountName) {
            this.putQueryParameter("AccountName", accountName);
            this.accountName = accountName;
            return this;
        }

        /**
         * DedicatedIp.
         */
        public Builder dedicatedIp(String dedicatedIp) {
            this.putQueryParameter("DedicatedIp", dedicatedIp);
            this.dedicatedIp = dedicatedIp;
            return this;
        }

        /**
         * DedicatedIpPoolId.
         */
        public Builder dedicatedIpPoolId(String dedicatedIpPoolId) {
            this.putQueryParameter("DedicatedIpPoolId", dedicatedIpPoolId);
            this.dedicatedIpPoolId = dedicatedIpPoolId;
            return this;
        }

        /**
         * <p>End time, which cannot exceed 7 days from the start time, in the format yyyy-MM-dd.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2019-09-29</p>
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * Esp.
         */
        public Builder esp(String esp) {
            this.putQueryParameter("Esp", esp);
            this.esp = esp;
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
         * <p>Start time, in the format yyyy-MM-dd.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2019-09-29</p>
         */
        public Builder startTime(String startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * <p>Email tag. If not filled, it represents all tags.</p>
         * 
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        public Builder tagName(String tagName) {
            this.putQueryParameter("TagName", tagName);
            this.tagName = tagName;
            return this;
        }

        @Override
        public SenderStatisticsByTagNameAndBatchIDRequest build() {
            return new SenderStatisticsByTagNameAndBatchIDRequest(this);
        } 

    } 

}
