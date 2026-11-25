// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.csas20230120.models;

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
 * {@link RemoveDeviceBelongIdentifiersRequest} extends {@link RequestModel}
 *
 * <p>RemoveDeviceBelongIdentifiersRequest</p>
 */
public class RemoveDeviceBelongIdentifiersRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("IdentifierIds")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> identifierIds;

    private RemoveDeviceBelongIdentifiersRequest(Builder builder) {
        super(builder);
        this.identifierIds = builder.identifierIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RemoveDeviceBelongIdentifiersRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return identifierIds
     */
    public java.util.List<String> getIdentifierIds() {
        return this.identifierIds;
    }

    public static final class Builder extends Request.Builder<RemoveDeviceBelongIdentifiersRequest, Builder> {
        private java.util.List<String> identifierIds; 

        private Builder() {
            super();
        } 

        private Builder(RemoveDeviceBelongIdentifiersRequest request) {
            super(request);
            this.identifierIds = request.identifierIds;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder identifierIds(java.util.List<String> identifierIds) {
            this.putBodyParameter("IdentifierIds", identifierIds);
            this.identifierIds = identifierIds;
            return this;
        }

        @Override
        public RemoveDeviceBelongIdentifiersRequest build() {
            return new RemoveDeviceBelongIdentifiersRequest(this);
        } 

    } 

}
