// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quickbi_public20220101.models;

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
 * {@link ListPortalMenusRequest} extends {@link RequestModel}
 *
 * <p>ListPortalMenusRequest</p>
 */
public class ListPortalMenusRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DataPortalId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String dataPortalId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserId")
    private String userId;

    private ListPortalMenusRequest(Builder builder) {
        super(builder);
        this.dataPortalId = builder.dataPortalId;
        this.userId = builder.userId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListPortalMenusRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dataPortalId
     */
    public String getDataPortalId() {
        return this.dataPortalId;
    }

    /**
     * @return userId
     */
    public String getUserId() {
        return this.userId;
    }

    public static final class Builder extends Request.Builder<ListPortalMenusRequest, Builder> {
        private String dataPortalId; 
        private String userId; 

        private Builder() {
            super();
        } 

        private Builder(ListPortalMenusRequest request) {
            super(request);
            this.dataPortalId = request.dataPortalId;
            this.userId = request.userId;
        } 

        /**
         * <p>The ID of the BI portal.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>0d173abb53e84c8ca7495429163b****</p>
         */
        public Builder dataPortalId(String dataPortalId) {
            this.putQueryParameter("DataPortalId", dataPortalId);
            this.dataPortalId = dataPortalId;
            return this;
        }

        /**
         * <p>The user ID in the Quick BI. When passed in, the list displays only the menus that the user has permissions on.</p>
         * 
         * <strong>example:</strong>
         * <p>1234567***</p>
         */
        public Builder userId(String userId) {
            this.putQueryParameter("UserId", userId);
            this.userId = userId;
            return this;
        }

        @Override
        public ListPortalMenusRequest build() {
            return new ListPortalMenusRequest(this);
        } 

    } 

}
