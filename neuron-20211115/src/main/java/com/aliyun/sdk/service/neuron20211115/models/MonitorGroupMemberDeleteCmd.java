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
 * {@link MonitorGroupMemberDeleteCmd} extends {@link TeaModel}
 *
 * <p>MonitorGroupMemberDeleteCmd</p>
 */
public class MonitorGroupMemberDeleteCmd extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("contactIds")
    private java.util.List<Long> contactIds;

    @com.aliyun.core.annotation.NameInMap("groupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long groupId;

    private MonitorGroupMemberDeleteCmd(Builder builder) {
        this.contactIds = builder.contactIds;
        this.groupId = builder.groupId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static MonitorGroupMemberDeleteCmd create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return contactIds
     */
    public java.util.List<Long> getContactIds() {
        return this.contactIds;
    }

    /**
     * @return groupId
     */
    public Long getGroupId() {
        return this.groupId;
    }

    public static final class Builder {
        private java.util.List<Long> contactIds; 
        private Long groupId; 

        private Builder() {
        } 

        private Builder(MonitorGroupMemberDeleteCmd model) {
            this.contactIds = model.contactIds;
            this.groupId = model.groupId;
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
        public Builder groupId(Long groupId) {
            this.groupId = groupId;
            return this;
        }

        public MonitorGroupMemberDeleteCmd build() {
            return new MonitorGroupMemberDeleteCmd(this);
        } 

    } 

}
