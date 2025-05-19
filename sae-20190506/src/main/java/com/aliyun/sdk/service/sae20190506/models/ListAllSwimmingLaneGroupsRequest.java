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
 * {@link ListAllSwimmingLaneGroupsRequest} extends {@link RequestModel}
 *
 * <p>ListAllSwimmingLaneGroupsRequest</p>
 */
public class ListAllSwimmingLaneGroupsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NamespaceId")
    private String namespaceId;

    private ListAllSwimmingLaneGroupsRequest(Builder builder) {
        super(builder);
        this.namespaceId = builder.namespaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAllSwimmingLaneGroupsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return namespaceId
     */
    public String getNamespaceId() {
        return this.namespaceId;
    }

    public static final class Builder extends Request.Builder<ListAllSwimmingLaneGroupsRequest, Builder> {
        private String namespaceId; 

        private Builder() {
            super();
        } 

        private Builder(ListAllSwimmingLaneGroupsRequest request) {
            super(request);
            this.namespaceId = request.namespaceId;
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
        public ListAllSwimmingLaneGroupsRequest build() {
            return new ListAllSwimmingLaneGroupsRequest(this);
        } 

    } 

}
