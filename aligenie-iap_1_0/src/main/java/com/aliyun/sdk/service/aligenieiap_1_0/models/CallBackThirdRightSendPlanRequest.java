// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aligenieiap_1_0.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CallBackThirdRightSendPlanRequest} extends {@link RequestModel}
 *
 * <p>CallBackThirdRightSendPlanRequest</p>
 */
public class CallBackThirdRightSendPlanRequest extends Request {
    @Query
    @NameInMap("BizGroup")
    private String bizGroup;

    @Query
    @NameInMap("BizType")
    private String bizType;

    @Query
    @NameInMap("CardType")
    private Integer cardType;

    @Query
    @NameInMap("ErrorMsg")
    private String errorMsg;

    @Query
    @NameInMap("ExtendInfo")
    private java.util.Map < String, ? > extendInfo;

    @Query
    @NameInMap("GenieOpenId")
    private String genieOpenId;

    @Query
    @NameInMap("ReceiveStatus")
    private Integer receiveStatus;

    @Query
    @NameInMap("Sn")
    private String sn;

    @Query
    @NameInMap("SupplierId")
    private Long supplierId;

    private CallBackThirdRightSendPlanRequest(Builder builder) {
        super(builder);
        this.bizGroup = builder.bizGroup;
        this.bizType = builder.bizType;
        this.cardType = builder.cardType;
        this.errorMsg = builder.errorMsg;
        this.extendInfo = builder.extendInfo;
        this.genieOpenId = builder.genieOpenId;
        this.receiveStatus = builder.receiveStatus;
        this.sn = builder.sn;
        this.supplierId = builder.supplierId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CallBackThirdRightSendPlanRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return bizGroup
     */
    public String getBizGroup() {
        return this.bizGroup;
    }

    /**
     * @return bizType
     */
    public String getBizType() {
        return this.bizType;
    }

    /**
     * @return cardType
     */
    public Integer getCardType() {
        return this.cardType;
    }

    /**
     * @return errorMsg
     */
    public String getErrorMsg() {
        return this.errorMsg;
    }

    /**
     * @return extendInfo
     */
    public java.util.Map < String, ? > getExtendInfo() {
        return this.extendInfo;
    }

    /**
     * @return genieOpenId
     */
    public String getGenieOpenId() {
        return this.genieOpenId;
    }

    /**
     * @return receiveStatus
     */
    public Integer getReceiveStatus() {
        return this.receiveStatus;
    }

    /**
     * @return sn
     */
    public String getSn() {
        return this.sn;
    }

    /**
     * @return supplierId
     */
    public Long getSupplierId() {
        return this.supplierId;
    }

    public static final class Builder extends Request.Builder<CallBackThirdRightSendPlanRequest, Builder> {
        private String bizGroup; 
        private String bizType; 
        private Integer cardType; 
        private String errorMsg; 
        private java.util.Map < String, ? > extendInfo; 
        private String genieOpenId; 
        private Integer receiveStatus; 
        private String sn; 
        private Long supplierId; 

        private Builder() {
            super();
        } 

        private Builder(CallBackThirdRightSendPlanRequest request) {
            super(request);
            this.bizGroup = request.bizGroup;
            this.bizType = request.bizType;
            this.cardType = request.cardType;
            this.errorMsg = request.errorMsg;
            this.extendInfo = request.extendInfo;
            this.genieOpenId = request.genieOpenId;
            this.receiveStatus = request.receiveStatus;
            this.sn = request.sn;
            this.supplierId = request.supplierId;
        } 

        /**
         * BizGroup.
         */
        public Builder bizGroup(String bizGroup) {
            this.putQueryParameter("BizGroup", bizGroup);
            this.bizGroup = bizGroup;
            return this;
        }

        /**
         * BizType.
         */
        public Builder bizType(String bizType) {
            this.putQueryParameter("BizType", bizType);
            this.bizType = bizType;
            return this;
        }

        /**
         * CardType.
         */
        public Builder cardType(Integer cardType) {
            this.putQueryParameter("CardType", cardType);
            this.cardType = cardType;
            return this;
        }

        /**
         * ErrorMsg.
         */
        public Builder errorMsg(String errorMsg) {
            this.putQueryParameter("ErrorMsg", errorMsg);
            this.errorMsg = errorMsg;
            return this;
        }

        /**
         * ExtendInfo.
         */
        public Builder extendInfo(java.util.Map < String, ? > extendInfo) {
            String extendInfoShrink = shrink(extendInfo, "ExtendInfo", "json");
            this.putQueryParameter("ExtendInfo", extendInfoShrink);
            this.extendInfo = extendInfo;
            return this;
        }

        /**
         * GenieOpenId.
         */
        public Builder genieOpenId(String genieOpenId) {
            this.putQueryParameter("GenieOpenId", genieOpenId);
            this.genieOpenId = genieOpenId;
            return this;
        }

        /**
         * ReceiveStatus.
         */
        public Builder receiveStatus(Integer receiveStatus) {
            this.putQueryParameter("ReceiveStatus", receiveStatus);
            this.receiveStatus = receiveStatus;
            return this;
        }

        /**
         * Sn.
         */
        public Builder sn(String sn) {
            this.putQueryParameter("Sn", sn);
            this.sn = sn;
            return this;
        }

        /**
         * SupplierId.
         */
        public Builder supplierId(Long supplierId) {
            this.putQueryParameter("SupplierId", supplierId);
            this.supplierId = supplierId;
            return this;
        }

        @Override
        public CallBackThirdRightSendPlanRequest build() {
            return new CallBackThirdRightSendPlanRequest(this);
        } 

    } 

}
