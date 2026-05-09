// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eds_aic20230930.models;

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
 * {@link ModifyJVSInstanceRequest} extends {@link RequestModel}
 *
 * <p>ModifyJVSInstanceRequest</p>
 */
public class ModifyJVSInstanceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ApplyToAll")
    private Boolean applyToAll;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CreditConfig")
    private java.util.List<CreditConfig> creditConfig;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceIds")
    private java.util.List<String> instanceIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceName")
    private String instanceName;

    private ModifyJVSInstanceRequest(Builder builder) {
        super(builder);
        this.applyToAll = builder.applyToAll;
        this.creditConfig = builder.creditConfig;
        this.instanceIds = builder.instanceIds;
        this.instanceName = builder.instanceName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyJVSInstanceRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return applyToAll
     */
    public Boolean getApplyToAll() {
        return this.applyToAll;
    }

    /**
     * @return creditConfig
     */
    public java.util.List<CreditConfig> getCreditConfig() {
        return this.creditConfig;
    }

    /**
     * @return instanceIds
     */
    public java.util.List<String> getInstanceIds() {
        return this.instanceIds;
    }

    /**
     * @return instanceName
     */
    public String getInstanceName() {
        return this.instanceName;
    }

    public static final class Builder extends Request.Builder<ModifyJVSInstanceRequest, Builder> {
        private Boolean applyToAll; 
        private java.util.List<CreditConfig> creditConfig; 
        private java.util.List<String> instanceIds; 
        private String instanceName; 

        private Builder() {
            super();
        } 

        private Builder(ModifyJVSInstanceRequest request) {
            super(request);
            this.applyToAll = request.applyToAll;
            this.creditConfig = request.creditConfig;
            this.instanceIds = request.instanceIds;
            this.instanceName = request.instanceName;
        } 

        /**
         * ApplyToAll.
         */
        public Builder applyToAll(Boolean applyToAll) {
            this.putQueryParameter("ApplyToAll", applyToAll);
            this.applyToAll = applyToAll;
            return this;
        }

        /**
         * CreditConfig.
         */
        public Builder creditConfig(java.util.List<CreditConfig> creditConfig) {
            this.putQueryParameter("CreditConfig", creditConfig);
            this.creditConfig = creditConfig;
            return this;
        }

        /**
         * InstanceIds.
         */
        public Builder instanceIds(java.util.List<String> instanceIds) {
            this.putQueryParameter("InstanceIds", instanceIds);
            this.instanceIds = instanceIds;
            return this;
        }

        /**
         * InstanceName.
         */
        public Builder instanceName(String instanceName) {
            this.putQueryParameter("InstanceName", instanceName);
            this.instanceName = instanceName;
            return this;
        }

        @Override
        public ModifyJVSInstanceRequest build() {
            return new ModifyJVSInstanceRequest(this);
        } 

    } 

    /**
     * 
     * {@link ModifyJVSInstanceRequest} extends {@link TeaModel}
     *
     * <p>ModifyJVSInstanceRequest</p>
     */
    public static class CreditConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreditLimit")
        private Long creditLimit;

        @com.aliyun.core.annotation.NameInMap("LimitPeriod")
        private String limitPeriod;

        private CreditConfig(Builder builder) {
            this.creditLimit = builder.creditLimit;
            this.limitPeriod = builder.limitPeriod;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CreditConfig create() {
            return builder().build();
        }

        /**
         * @return creditLimit
         */
        public Long getCreditLimit() {
            return this.creditLimit;
        }

        /**
         * @return limitPeriod
         */
        public String getLimitPeriod() {
            return this.limitPeriod;
        }

        public static final class Builder {
            private Long creditLimit; 
            private String limitPeriod; 

            private Builder() {
            } 

            private Builder(CreditConfig model) {
                this.creditLimit = model.creditLimit;
                this.limitPeriod = model.limitPeriod;
            } 

            /**
             * CreditLimit.
             */
            public Builder creditLimit(Long creditLimit) {
                this.creditLimit = creditLimit;
                return this;
            }

            /**
             * LimitPeriod.
             */
            public Builder limitPeriod(String limitPeriod) {
                this.limitPeriod = limitPeriod;
                return this;
            }

            public CreditConfig build() {
                return new CreditConfig(this);
            } 

        } 

    }
}
