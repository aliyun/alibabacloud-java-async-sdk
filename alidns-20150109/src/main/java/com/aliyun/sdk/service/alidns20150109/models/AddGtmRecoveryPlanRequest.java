// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddGtmRecoveryPlanRequest} extends {@link RequestModel}
 *
 * <p>AddGtmRecoveryPlanRequest</p>
 */
public class AddGtmRecoveryPlanRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FaultAddrPool")
    @com.aliyun.core.annotation.Validation(required = true)
    private String faultAddrPool;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Remark")
    private String remark;

    private AddGtmRecoveryPlanRequest(Builder builder) {
        super(builder);
        this.faultAddrPool = builder.faultAddrPool;
        this.lang = builder.lang;
        this.name = builder.name;
        this.remark = builder.remark;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddGtmRecoveryPlanRequest create() {
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
     * @return remark
     */
    public String getRemark() {
        return this.remark;
    }

    public static final class Builder extends Request.Builder<AddGtmRecoveryPlanRequest, Builder> {
        private String faultAddrPool; 
        private String lang; 
        private String name; 
        private String remark; 

        private Builder() {
            super();
        } 

        private Builder(AddGtmRecoveryPlanRequest request) {
            super(request);
            this.faultAddrPool = request.faultAddrPool;
            this.lang = request.lang;
            this.name = request.name;
            this.remark = request.remark;
        } 

        /**
         * The list of IDs of faulty address pools.
         */
        public Builder faultAddrPool(String faultAddrPool) {
            this.putQueryParameter("FaultAddrPool", faultAddrPool);
            this.faultAddrPool = faultAddrPool;
            return this;
        }

        /**
         * The language used by the user.
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * The name of the disaster recovery plan that you want to create.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * The remarks on the disaster recovery plan.
         */
        public Builder remark(String remark) {
            this.putQueryParameter("Remark", remark);
            this.remark = remark;
            return this;
        }

        @Override
        public AddGtmRecoveryPlanRequest build() {
            return new AddGtmRecoveryPlanRequest(this);
        } 

    } 

}
