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
 * {@link MonitorContactGroupUpdateCmd} extends {@link TeaModel}
 *
 * <p>MonitorContactGroupUpdateCmd</p>
 */
public class MonitorContactGroupUpdateCmd extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("accountId")
    private String accountId;

    @com.aliyun.core.annotation.NameInMap("contactIds")
    private java.util.List<Long> contactIds;

    @com.aliyun.core.annotation.NameInMap("id")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long id;

    @com.aliyun.core.annotation.NameInMap("name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    private MonitorContactGroupUpdateCmd(Builder builder) {
        this.accountId = builder.accountId;
        this.contactIds = builder.contactIds;
        this.id = builder.id;
        this.name = builder.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static MonitorContactGroupUpdateCmd create() {
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
     * @return id
     */
    public Long getId() {
        return this.id;
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
        private Long id; 
        private String name; 

        private Builder() {
        } 

        private Builder(MonitorContactGroupUpdateCmd model) {
            this.accountId = model.accountId;
            this.contactIds = model.contactIds;
            this.id = model.id;
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
        public Builder id(Long id) {
            this.id = id;
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

        public MonitorContactGroupUpdateCmd build() {
            return new MonitorContactGroupUpdateCmd(this);
        } 

    } 

}
