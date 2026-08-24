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
 * {@link RemoveVirusScanAdditionalListsRequest} extends {@link RequestModel}
 *
 * <p>RemoveVirusScanAdditionalListsRequest</p>
 */
public class RemoveVirusScanAdditionalListsRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ListIds")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> listIds;

    private RemoveVirusScanAdditionalListsRequest(Builder builder) {
        super(builder);
        this.listIds = builder.listIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RemoveVirusScanAdditionalListsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return listIds
     */
    public java.util.List<String> getListIds() {
        return this.listIds;
    }

    public static final class Builder extends Request.Builder<RemoveVirusScanAdditionalListsRequest, Builder> {
        private java.util.List<String> listIds; 

        private Builder() {
            super();
        } 

        private Builder(RemoveVirusScanAdditionalListsRequest request) {
            super(request);
            this.listIds = request.listIds;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder listIds(java.util.List<String> listIds) {
            this.putBodyParameter("ListIds", listIds);
            this.listIds = listIds;
            return this;
        }

        @Override
        public RemoveVirusScanAdditionalListsRequest build() {
            return new RemoveVirusScanAdditionalListsRequest(this);
        } 

    } 

}
