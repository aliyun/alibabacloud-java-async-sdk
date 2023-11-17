// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkvisual20230630.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link TransferStorageOrderRequest} extends {@link RequestModel}
 *
 * <p>TransferStorageOrderRequest</p>
 */
public class TransferStorageOrderRequest extends Request {
    @Query
    @NameInMap("DstIotId")
    @Validation(required = true)
    private String dstIotId;

    @Query
    @NameInMap("EnableDefaultPlan")
    private Boolean enableDefaultPlan;

    @Query
    @NameInMap("EventRecordDuration")
    @Validation(maximum = 30)
    private Integer eventRecordDuration;

    @Query
    @NameInMap("EventRecordProlong")
    private Boolean eventRecordProlong;

    @Query
    @NameInMap("ImmediateUse")
    private Boolean immediateUse;

    @Query
    @NameInMap("PreRecordDuration")
    @Validation(maximum = 5)
    private Integer preRecordDuration;

    @Query
    @NameInMap("SrcIotId")
    @Validation(required = true)
    private String srcIotId;

    @Query
    @NameInMap("SrcOrderId")
    @Validation(required = true)
    private String srcOrderId;

    @Query
    @NameInMap("SupportCrossIdentityTransfer")
    private Boolean supportCrossIdentityTransfer;

    @Query
    @NameInMap("UserId")
    private String userId;

    @Query
    @NameInMap("UserName")
    private String userName;

    private TransferStorageOrderRequest(Builder builder) {
        super(builder);
        this.dstIotId = builder.dstIotId;
        this.enableDefaultPlan = builder.enableDefaultPlan;
        this.eventRecordDuration = builder.eventRecordDuration;
        this.eventRecordProlong = builder.eventRecordProlong;
        this.immediateUse = builder.immediateUse;
        this.preRecordDuration = builder.preRecordDuration;
        this.srcIotId = builder.srcIotId;
        this.srcOrderId = builder.srcOrderId;
        this.supportCrossIdentityTransfer = builder.supportCrossIdentityTransfer;
        this.userId = builder.userId;
        this.userName = builder.userName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static TransferStorageOrderRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dstIotId
     */
    public String getDstIotId() {
        return this.dstIotId;
    }

    /**
     * @return enableDefaultPlan
     */
    public Boolean getEnableDefaultPlan() {
        return this.enableDefaultPlan;
    }

    /**
     * @return eventRecordDuration
     */
    public Integer getEventRecordDuration() {
        return this.eventRecordDuration;
    }

    /**
     * @return eventRecordProlong
     */
    public Boolean getEventRecordProlong() {
        return this.eventRecordProlong;
    }

    /**
     * @return immediateUse
     */
    public Boolean getImmediateUse() {
        return this.immediateUse;
    }

    /**
     * @return preRecordDuration
     */
    public Integer getPreRecordDuration() {
        return this.preRecordDuration;
    }

    /**
     * @return srcIotId
     */
    public String getSrcIotId() {
        return this.srcIotId;
    }

    /**
     * @return srcOrderId
     */
    public String getSrcOrderId() {
        return this.srcOrderId;
    }

    /**
     * @return supportCrossIdentityTransfer
     */
    public Boolean getSupportCrossIdentityTransfer() {
        return this.supportCrossIdentityTransfer;
    }

    /**
     * @return userId
     */
    public String getUserId() {
        return this.userId;
    }

    /**
     * @return userName
     */
    public String getUserName() {
        return this.userName;
    }

    public static final class Builder extends Request.Builder<TransferStorageOrderRequest, Builder> {
        private String dstIotId; 
        private Boolean enableDefaultPlan; 
        private Integer eventRecordDuration; 
        private Boolean eventRecordProlong; 
        private Boolean immediateUse; 
        private Integer preRecordDuration; 
        private String srcIotId; 
        private String srcOrderId; 
        private Boolean supportCrossIdentityTransfer; 
        private String userId; 
        private String userName; 

        private Builder() {
            super();
        } 

        private Builder(TransferStorageOrderRequest request) {
            super(request);
            this.dstIotId = request.dstIotId;
            this.enableDefaultPlan = request.enableDefaultPlan;
            this.eventRecordDuration = request.eventRecordDuration;
            this.eventRecordProlong = request.eventRecordProlong;
            this.immediateUse = request.immediateUse;
            this.preRecordDuration = request.preRecordDuration;
            this.srcIotId = request.srcIotId;
            this.srcOrderId = request.srcOrderId;
            this.supportCrossIdentityTransfer = request.supportCrossIdentityTransfer;
            this.userId = request.userId;
            this.userName = request.userName;
        } 

        /**
         * DstIotId.
         */
        public Builder dstIotId(String dstIotId) {
            this.putQueryParameter("DstIotId", dstIotId);
            this.dstIotId = dstIotId;
            return this;
        }

        /**
         * EnableDefaultPlan.
         */
        public Builder enableDefaultPlan(Boolean enableDefaultPlan) {
            this.putQueryParameter("EnableDefaultPlan", enableDefaultPlan);
            this.enableDefaultPlan = enableDefaultPlan;
            return this;
        }

        /**
         * EventRecordDuration.
         */
        public Builder eventRecordDuration(Integer eventRecordDuration) {
            this.putQueryParameter("EventRecordDuration", eventRecordDuration);
            this.eventRecordDuration = eventRecordDuration;
            return this;
        }

        /**
         * EventRecordProlong.
         */
        public Builder eventRecordProlong(Boolean eventRecordProlong) {
            this.putQueryParameter("EventRecordProlong", eventRecordProlong);
            this.eventRecordProlong = eventRecordProlong;
            return this;
        }

        /**
         * ImmediateUse.
         */
        public Builder immediateUse(Boolean immediateUse) {
            this.putQueryParameter("ImmediateUse", immediateUse);
            this.immediateUse = immediateUse;
            return this;
        }

        /**
         * PreRecordDuration.
         */
        public Builder preRecordDuration(Integer preRecordDuration) {
            this.putQueryParameter("PreRecordDuration", preRecordDuration);
            this.preRecordDuration = preRecordDuration;
            return this;
        }

        /**
         * SrcIotId.
         */
        public Builder srcIotId(String srcIotId) {
            this.putQueryParameter("SrcIotId", srcIotId);
            this.srcIotId = srcIotId;
            return this;
        }

        /**
         * SrcOrderId.
         */
        public Builder srcOrderId(String srcOrderId) {
            this.putQueryParameter("SrcOrderId", srcOrderId);
            this.srcOrderId = srcOrderId;
            return this;
        }

        /**
         * SupportCrossIdentityTransfer.
         */
        public Builder supportCrossIdentityTransfer(Boolean supportCrossIdentityTransfer) {
            this.putQueryParameter("SupportCrossIdentityTransfer", supportCrossIdentityTransfer);
            this.supportCrossIdentityTransfer = supportCrossIdentityTransfer;
            return this;
        }

        /**
         * UserId.
         */
        public Builder userId(String userId) {
            this.putQueryParameter("UserId", userId);
            this.userId = userId;
            return this;
        }

        /**
         * UserName.
         */
        public Builder userName(String userName) {
            this.putQueryParameter("UserName", userName);
            this.userName = userName;
            return this;
        }

        @Override
        public TransferStorageOrderRequest build() {
            return new TransferStorageOrderRequest(this);
        } 

    } 

}
