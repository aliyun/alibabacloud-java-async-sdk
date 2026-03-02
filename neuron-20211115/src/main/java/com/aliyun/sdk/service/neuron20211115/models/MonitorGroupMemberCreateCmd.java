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
 * {@link MonitorGroupMemberCreateCmd} extends {@link TeaModel}
 *
 * <p>MonitorGroupMemberCreateCmd</p>
 */
public class MonitorGroupMemberCreateCmd extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("accountId")
    private String accountId;

    @com.aliyun.core.annotation.NameInMap("contactIds")
    private java.util.List<Long> contactIds;

    private MonitorGroupMemberCreateCmd(Builder builder) {
        this.accountId = builder.accountId;
        this.contactIds = builder.contactIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static MonitorGroupMemberCreateCmd create() {
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

    public static final class Builder {
        private String accountId; 
        private java.util.List<Long> contactIds; 

        private Builder() {
        } 

        private Builder(MonitorGroupMemberCreateCmd model) {
            this.accountId = model.accountId;
            this.contactIds = model.contactIds;
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

        public MonitorGroupMemberCreateCmd build() {
            return new MonitorGroupMemberCreateCmd(this);
        } 

    } 

}
