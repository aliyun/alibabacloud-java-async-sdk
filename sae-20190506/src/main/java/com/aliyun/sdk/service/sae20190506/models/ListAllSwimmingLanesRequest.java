// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sae20190506.models;

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
 * {@link ListAllSwimmingLanesRequest} extends {@link RequestModel}
 *
 * <p>ListAllSwimmingLanesRequest</p>
 */
public class ListAllSwimmingLanesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GroupId")
    private Long groupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NamespaceId")
    private String namespaceId;

    private ListAllSwimmingLanesRequest(Builder builder) {
        super(builder);
        this.groupId = builder.groupId;
        this.namespaceId = builder.namespaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAllSwimmingLanesRequest create() {
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
     * @return namespaceId
     */
    public String getNamespaceId() {
        return this.namespaceId;
    }

    public static final class Builder extends Request.Builder<ListAllSwimmingLanesRequest, Builder> {
        private Long groupId; 
        private String namespaceId; 

        private Builder() {
            super();
        } 

        private Builder(ListAllSwimmingLanesRequest request) {
            super(request);
            this.groupId = request.groupId;
            this.namespaceId = request.namespaceId;
        } 

        /**
         * GroupId.
         */
        public Builder groupId(Long groupId) {
            this.putQueryParameter("GroupId", groupId);
            this.groupId = groupId;
            return this;
        }

        /**
         * NamespaceId.
         */
        public Builder namespaceId(String namespaceId) {
            this.putQueryParameter("NamespaceId", namespaceId);
            this.namespaceId = namespaceId;
            return this;
        }

        @Override
        public ListAllSwimmingLanesRequest build() {
            return new ListAllSwimmingLanesRequest(this);
        } 

    } 

}
