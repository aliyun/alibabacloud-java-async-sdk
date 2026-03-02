// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.neuron20211115.models;

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
 * {@link CreatePrivilegeCmd} extends {@link TeaModel}
 *
 * <p>CreatePrivilegeCmd</p>
 */
public class CreatePrivilegeCmd extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("accountId")
    private String accountId;

    @com.aliyun.core.annotation.NameInMap("roleId")
    private Long roleId;

    @com.aliyun.core.annotation.NameInMap("strategyItems")
    private java.util.List<StrategyItem> strategyItems;

    @com.aliyun.core.annotation.NameInMap("strategys")
    private String strategys;

    private CreatePrivilegeCmd(Builder builder) {
        this.accountId = builder.accountId;
        this.roleId = builder.roleId;
        this.strategyItems = builder.strategyItems;
        this.strategys = builder.strategys;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreatePrivilegeCmd create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accountId
     */
    public String getAccountId() {
        return this.accountId;
    }

    /**
     * @return roleId
     */
    public Long getRoleId() {
        return this.roleId;
    }

    /**
     * @return strategyItems
     */
    public java.util.List<StrategyItem> getStrategyItems() {
        return this.strategyItems;
    }

    /**
     * @return strategys
     */
    public String getStrategys() {
        return this.strategys;
    }

    public static final class Builder {
        private String accountId; 
        private Long roleId; 
        private java.util.List<StrategyItem> strategyItems; 
        private String strategys; 

        private Builder() {
        } 

        private Builder(CreatePrivilegeCmd model) {
            this.accountId = model.accountId;
            this.roleId = model.roleId;
            this.strategyItems = model.strategyItems;
            this.strategys = model.strategys;
        } 

        /**
         * accountId.
         */
        public Builder accountId(String accountId) {
            this.accountId = accountId;
            return this;
        }

        /**
         * roleId.
         */
        public Builder roleId(Long roleId) {
            this.roleId = roleId;
            return this;
        }

        /**
         * strategyItems.
         */
        public Builder strategyItems(java.util.List<StrategyItem> strategyItems) {
            this.strategyItems = strategyItems;
            return this;
        }

        /**
         * strategys.
         */
        public Builder strategys(String strategys) {
            this.strategys = strategys;
            return this;
        }

        public CreatePrivilegeCmd build() {
            return new CreatePrivilegeCmd(this);
        } 

    } 

}
