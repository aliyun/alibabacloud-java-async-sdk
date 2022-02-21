// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddGtmRecoveryPlanRequest} extends {@link RequestModel}
 *
 * <p>AddGtmRecoveryPlanRequest</p>
 */
public class AddGtmRecoveryPlanRequest extends Request {
    @Query
    @NameInMap("FaultAddrPool")
    @Validation(required = true)
    private String faultAddrPool;

    @Query
    @NameInMap("Lang")
    private String lang;

    @Query
    @NameInMap("Name")
    @Validation(required = true)
    private String name;

    @Query
    @NameInMap("Remark")
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

        private Builder(AddGtmRecoveryPlanRequest response) {
            super(response);
            this.faultAddrPool = response.faultAddrPool;
            this.lang = response.lang;
            this.name = response.name;
            this.remark = response.remark;
        } 

        /**
         * FaultAddrPool.
         */
        public Builder faultAddrPool(String faultAddrPool) {
            this.putQueryParameter("FaultAddrPool", faultAddrPool);
            this.faultAddrPool = faultAddrPool;
            return this;
        }

        /**
         * Lang.
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * Remark.
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
