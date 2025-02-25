// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aligenieiap_1_0.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CheckThirdRightSendPlanRequest} extends {@link RequestModel}
 *
 * <p>CheckThirdRightSendPlanRequest</p>
 */
public class CheckThirdRightSendPlanRequest extends Request {
    @Query
    @NameInMap("BizGroup")
    private String bizGroup;

    @Query
    @NameInMap("BizType")
    private String bizType;

    @Query
    @NameInMap("ExtendInfo")
    private java.util.Map < String, ? > extendInfo;

    @Query
    @NameInMap("Sn")
    private String sn;

    @Query
    @NameInMap("SupplierId")
    private Long supplierId;

    private CheckThirdRightSendPlanRequest(Builder builder) {
        super(builder);
        this.bizGroup = builder.bizGroup;
        this.bizType = builder.bizType;
        this.extendInfo = builder.extendInfo;
        this.sn = builder.sn;
        this.supplierId = builder.supplierId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CheckThirdRightSendPlanRequest create() {
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
     * @return extendInfo
     */
    public java.util.Map < String, ? > getExtendInfo() {
        return this.extendInfo;
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

    public static final class Builder extends Request.Builder<CheckThirdRightSendPlanRequest, Builder> {
        private String bizGroup; 
        private String bizType; 
        private java.util.Map < String, ? > extendInfo; 
        private String sn; 
        private Long supplierId; 

        private Builder() {
            super();
        } 

        private Builder(CheckThirdRightSendPlanRequest request) {
            super(request);
            this.bizGroup = request.bizGroup;
            this.bizType = request.bizType;
            this.extendInfo = request.extendInfo;
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
         * ExtendInfo.
         */
        public Builder extendInfo(java.util.Map < String, ? > extendInfo) {
            String extendInfoShrink = shrink(extendInfo, "ExtendInfo", "json");
            this.putQueryParameter("ExtendInfo", extendInfoShrink);
            this.extendInfo = extendInfo;
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
        public CheckThirdRightSendPlanRequest build() {
            return new CheckThirdRightSendPlanRequest(this);
        } 

    } 

}
