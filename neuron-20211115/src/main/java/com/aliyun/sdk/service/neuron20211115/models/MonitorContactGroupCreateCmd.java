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
 * {@link MonitorContactGroupCreateCmd} extends {@link TeaModel}
 *
 * <p>MonitorContactGroupCreateCmd</p>
 */
public class MonitorContactGroupCreateCmd extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("accountId")
    private String accountId;

    @com.aliyun.core.annotation.NameInMap("contactIds")
    private java.util.List<Long> contactIds;

    @com.aliyun.core.annotation.NameInMap("enterpriseId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long enterpriseId;

    @com.aliyun.core.annotation.NameInMap("name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    private MonitorContactGroupCreateCmd(Builder builder) {
        this.accountId = builder.accountId;
        this.contactIds = builder.contactIds;
        this.enterpriseId = builder.enterpriseId;
        this.name = builder.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static MonitorContactGroupCreateCmd create() {
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
     * @return contactIds
     */
    public java.util.List<Long> getContactIds() {
        return this.contactIds;
    }

    /**
     * @return enterpriseId
     */
    public Long getEnterpriseId() {
        return this.enterpriseId;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    public static final class Builder {
        private String accountId; 
        private java.util.List<Long> contactIds; 
        private Long enterpriseId; 
        private String name; 

        private Builder() {
        } 

        private Builder(MonitorContactGroupCreateCmd model) {
            this.accountId = model.accountId;
            this.contactIds = model.contactIds;
            this.enterpriseId = model.enterpriseId;
            this.name = model.name;
        } 

        /**
         * accountId.
         */
        public Builder accountId(String accountId) {
            this.accountId = accountId;
            return this;
        }

        /**
         * contactIds.
         */
        public Builder contactIds(java.util.List<Long> contactIds) {
            this.contactIds = contactIds;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder enterpriseId(Long enterpriseId) {
            this.enterpriseId = enterpriseId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>尚仁</p>
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public MonitorContactGroupCreateCmd build() {
            return new MonitorContactGroupCreateCmd(this);
        } 

    } 

}
