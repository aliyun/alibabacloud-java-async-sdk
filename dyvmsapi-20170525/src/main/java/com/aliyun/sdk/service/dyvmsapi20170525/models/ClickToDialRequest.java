// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dyvmsapi20170525.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ClickToDialRequest} extends {@link RequestModel}
 *
 * <p>ClickToDialRequest</p>
 */
public class ClickToDialRequest extends Request {
    @Query
    @NameInMap("AsrFlag")
    private Boolean asrFlag;

    @Query
    @NameInMap("AsrModelId")
    private String asrModelId;

    @Query
    @NameInMap("CalledNumber")
    @Validation(required = true)
    private String calledNumber;

    @Query
    @NameInMap("CalledShowNumber")
    @Validation(required = true)
    private String calledShowNumber;

    @Query
    @NameInMap("CallerNumber")
    @Validation(required = true)
    private String callerNumber;

    @Query
    @NameInMap("CallerShowNumber")
    @Validation(required = true)
    private String callerShowNumber;

    @Query
    @NameInMap("OutId")
    private String outId;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("RecordFlag")
    private Boolean recordFlag;

    @Query
    @NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @Query
    @NameInMap("SessionTimeout")
    private Integer sessionTimeout;

    private ClickToDialRequest(Builder builder) {
        super(builder);
        this.asrFlag = builder.asrFlag;
        this.asrModelId = builder.asrModelId;
        this.calledNumber = builder.calledNumber;
        this.calledShowNumber = builder.calledShowNumber;
        this.callerNumber = builder.callerNumber;
        this.callerShowNumber = builder.callerShowNumber;
        this.outId = builder.outId;
        this.ownerId = builder.ownerId;
        this.recordFlag = builder.recordFlag;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.sessionTimeout = builder.sessionTimeout;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ClickToDialRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return asrFlag
     */
    public Boolean getAsrFlag() {
        return this.asrFlag;
    }

    /**
     * @return asrModelId
     */
    public String getAsrModelId() {
        return this.asrModelId;
    }

    /**
     * @return calledNumber
     */
    public String getCalledNumber() {
        return this.calledNumber;
    }

    /**
     * @return calledShowNumber
     */
    public String getCalledShowNumber() {
        return this.calledShowNumber;
    }

    /**
     * @return callerNumber
     */
    public String getCallerNumber() {
        return this.callerNumber;
    }

    /**
     * @return callerShowNumber
     */
    public String getCallerShowNumber() {
        return this.callerShowNumber;
    }

    /**
     * @return outId
     */
    public String getOutId() {
        return this.outId;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return recordFlag
     */
    public Boolean getRecordFlag() {
        return this.recordFlag;
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
     * @return sessionTimeout
     */
    public Integer getSessionTimeout() {
        return this.sessionTimeout;
    }

    public static final class Builder extends Request.Builder<ClickToDialRequest, Builder> {
        private Boolean asrFlag; 
        private String asrModelId; 
        private String calledNumber; 
        private String calledShowNumber; 
        private String callerNumber; 
        private String callerShowNumber; 
        private String outId; 
        private Long ownerId; 
        private Boolean recordFlag; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private Integer sessionTimeout; 

        private Builder() {
            super();
        } 

        private Builder(ClickToDialRequest response) {
            super(response);
            this.asrFlag = response.asrFlag;
            this.asrModelId = response.asrModelId;
            this.calledNumber = response.calledNumber;
            this.calledShowNumber = response.calledShowNumber;
            this.callerNumber = response.callerNumber;
            this.callerShowNumber = response.callerShowNumber;
            this.outId = response.outId;
            this.ownerId = response.ownerId;
            this.recordFlag = response.recordFlag;
            this.resourceOwnerAccount = response.resourceOwnerAccount;
            this.resourceOwnerId = response.resourceOwnerId;
            this.sessionTimeout = response.sessionTimeout;
        } 

        /**
         * AsrFlag.
         */
        public Builder asrFlag(Boolean asrFlag) {
            this.putQueryParameter("AsrFlag", asrFlag);
            this.asrFlag = asrFlag;
            return this;
        }

        /**
         * AsrModelId.
         */
        public Builder asrModelId(String asrModelId) {
            this.putQueryParameter("AsrModelId", asrModelId);
            this.asrModelId = asrModelId;
            return this;
        }

        /**
         * CalledNumber.
         */
        public Builder calledNumber(String calledNumber) {
            this.putQueryParameter("CalledNumber", calledNumber);
            this.calledNumber = calledNumber;
            return this;
        }

        /**
         * CalledShowNumber.
         */
        public Builder calledShowNumber(String calledShowNumber) {
            this.putQueryParameter("CalledShowNumber", calledShowNumber);
            this.calledShowNumber = calledShowNumber;
            return this;
        }

        /**
         * CallerNumber.
         */
        public Builder callerNumber(String callerNumber) {
            this.putQueryParameter("CallerNumber", callerNumber);
            this.callerNumber = callerNumber;
            return this;
        }

        /**
         * CallerShowNumber.
         */
        public Builder callerShowNumber(String callerShowNumber) {
            this.putQueryParameter("CallerShowNumber", callerShowNumber);
            this.callerShowNumber = callerShowNumber;
            return this;
        }

        /**
         * OutId.
         */
        public Builder outId(String outId) {
            this.putQueryParameter("OutId", outId);
            this.outId = outId;
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
         * RecordFlag.
         */
        public Builder recordFlag(Boolean recordFlag) {
            this.putQueryParameter("RecordFlag", recordFlag);
            this.recordFlag = recordFlag;
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
         * SessionTimeout.
         */
        public Builder sessionTimeout(Integer sessionTimeout) {
            this.putQueryParameter("SessionTimeout", sessionTimeout);
            this.sessionTimeout = sessionTimeout;
            return this;
        }

        @Override
        public ClickToDialRequest build() {
            return new ClickToDialRequest(this);
        } 

    } 

}
