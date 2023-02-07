// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiccs20191015.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RobotCallRequest} extends {@link RequestModel}
 *
 * <p>RobotCallRequest</p>
 */
public class RobotCallRequest extends Request {
    @Query
    @NameInMap("CalledNumber")
    @Validation(required = true)
    private String calledNumber;

    @Query
    @NameInMap("CalledShowNumber")
    @Validation(required = true)
    private String calledShowNumber;

    @Query
    @NameInMap("EarlyMediaAsr")
    private Boolean earlyMediaAsr;

    @Query
    @NameInMap("OutId")
    private String outId;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("Params")
    private String params;

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
    @NameInMap("RobotId")
    @Validation(required = true)
    private Long robotId;

    private RobotCallRequest(Builder builder) {
        super(builder);
        this.calledNumber = builder.calledNumber;
        this.calledShowNumber = builder.calledShowNumber;
        this.earlyMediaAsr = builder.earlyMediaAsr;
        this.outId = builder.outId;
        this.ownerId = builder.ownerId;
        this.params = builder.params;
        this.recordFlag = builder.recordFlag;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.robotId = builder.robotId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RobotCallRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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
     * @return earlyMediaAsr
     */
    public Boolean getEarlyMediaAsr() {
        return this.earlyMediaAsr;
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
     * @return params
     */
    public String getParams() {
        return this.params;
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
     * @return robotId
     */
    public Long getRobotId() {
        return this.robotId;
    }

    public static final class Builder extends Request.Builder<RobotCallRequest, Builder> {
        private String calledNumber; 
        private String calledShowNumber; 
        private Boolean earlyMediaAsr; 
        private String outId; 
        private Long ownerId; 
        private String params; 
        private Boolean recordFlag; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private Long robotId; 

        private Builder() {
            super();
        } 

        private Builder(RobotCallRequest request) {
            super(request);
            this.calledNumber = request.calledNumber;
            this.calledShowNumber = request.calledShowNumber;
            this.earlyMediaAsr = request.earlyMediaAsr;
            this.outId = request.outId;
            this.ownerId = request.ownerId;
            this.params = request.params;
            this.recordFlag = request.recordFlag;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.robotId = request.robotId;
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
         * EarlyMediaAsr.
         */
        public Builder earlyMediaAsr(Boolean earlyMediaAsr) {
            this.putQueryParameter("EarlyMediaAsr", earlyMediaAsr);
            this.earlyMediaAsr = earlyMediaAsr;
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
         * Params.
         */
        public Builder params(String params) {
            this.putQueryParameter("Params", params);
            this.params = params;
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
         * RobotId.
         */
        public Builder robotId(Long robotId) {
            this.putQueryParameter("RobotId", robotId);
            this.robotId = robotId;
            return this;
        }

        @Override
        public RobotCallRequest build() {
            return new RobotCallRequest(this);
        } 

    } 

}
