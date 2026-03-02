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
 * {@link DeleteMonitorGroupMemberRequest} extends {@link RequestModel}
 *
 * <p>DeleteMonitorGroupMemberRequest</p>
 */
public class DeleteMonitorGroupMemberRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("groupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long groupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("contactIds")
    @com.aliyun.core.annotation.Validation(required = true)
    private String contactIds;

    private DeleteMonitorGroupMemberRequest(Builder builder) {
        super(builder);
        this.groupId = builder.groupId;
        this.contactIds = builder.contactIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteMonitorGroupMemberRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return groupId
     */
    public Long getGroupId() {
        return this.groupId;
    }

    /**
     * @return contactIds
     */
    public String getContactIds() {
        return this.contactIds;
    }

    public static final class Builder extends Request.Builder<DeleteMonitorGroupMemberRequest, Builder> {
        private Long groupId; 
        private String contactIds; 

        private Builder() {
            super();
        } 

        private Builder(DeleteMonitorGroupMemberRequest request) {
            super(request);
            this.groupId = request.groupId;
            this.contactIds = request.contactIds;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>22433</p>
         */
        public Builder groupId(Long groupId) {
            this.putPathParameter("groupId", groupId);
            this.groupId = groupId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>[]</p>
         */
        public Builder contactIds(String contactIds) {
            this.putQueryParameter("contactIds", contactIds);
            this.contactIds = contactIds;
            return this;
        }

        @Override
        public DeleteMonitorGroupMemberRequest build() {
            return new DeleteMonitorGroupMemberRequest(this);
        } 

    } 

}
