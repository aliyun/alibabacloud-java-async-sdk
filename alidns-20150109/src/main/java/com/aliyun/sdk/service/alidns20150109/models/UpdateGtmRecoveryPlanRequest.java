// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link UpdateGtmRecoveryPlanRequest} extends {@link RequestModel}
 *
 * <p>UpdateGtmRecoveryPlanRequest</p>
 */
public class UpdateGtmRecoveryPlanRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FaultAddrPool")
    private String faultAddrPool;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RecoveryPlanId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long recoveryPlanId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Remark")
    private String remark;

    private UpdateGtmRecoveryPlanRequest(Builder builder) {
        super(builder);
        this.faultAddrPool = builder.faultAddrPool;
        this.lang = builder.lang;
        this.name = builder.name;
        this.recoveryPlanId = builder.recoveryPlanId;
        this.remark = builder.remark;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateGtmRecoveryPlanRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return faultAddrPool
     */
    public String getFaultAddrPool() {
        return this.faultAddrPool;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return recoveryPlanId
     */
    public Long getRecoveryPlanId() {
        return this.recoveryPlanId;
    }

    /**
     * @return remark
     */
    public String getRemark() {
        return this.remark;
    }

    public static final class Builder extends Request.Builder<UpdateGtmRecoveryPlanRequest, Builder> {
        private String faultAddrPool; 
        private String lang; 
        private String name; 
        private Long recoveryPlanId; 
        private String remark; 

        private Builder() {
            super();
        } 

        private Builder(UpdateGtmRecoveryPlanRequest request) {
            super(request);
            this.faultAddrPool = request.faultAddrPool;
            this.lang = request.lang;
            this.name = request.name;
            this.recoveryPlanId = request.recoveryPlanId;
            this.remark = request.remark;
        } 

        /**
         * <p>The list of faulty address pools.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;hra0or&quot;]</p>
         */
        public Builder faultAddrPool(String faultAddrPool) {
            this.putQueryParameter("FaultAddrPool", faultAddrPool);
            this.faultAddrPool = faultAddrPool;
            return this;
        }

        /**
         * <p>The language in which you want the values of some response parameters to be returned. These response parameters support multiple languages.</p>
         * 
         * <strong>example:</strong>
         * <p>en</p>
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * <p>The name of the disaster recovery plan.</p>
         * 
         * <strong>example:</strong>
         * <p>abc</p>
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>The ID of the disaster recovery plan.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder recoveryPlanId(Long recoveryPlanId) {
            this.putQueryParameter("RecoveryPlanId", recoveryPlanId);
            this.recoveryPlanId = recoveryPlanId;
            return this;
        }

        /**
         * <p>The remarks about the disaster recovery plan.</p>
         * 
         * <strong>example:</strong>
         * <p>remark</p>
         */
        public Builder remark(String remark) {
            this.putQueryParameter("Remark", remark);
            this.remark = remark;
            return this;
        }

        @Override
        public UpdateGtmRecoveryPlanRequest build() {
            return new UpdateGtmRecoveryPlanRequest(this);
        } 

    } 

}
