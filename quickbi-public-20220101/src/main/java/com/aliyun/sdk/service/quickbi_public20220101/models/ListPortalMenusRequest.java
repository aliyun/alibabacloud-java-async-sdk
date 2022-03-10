// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quickbi_public20220101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListPortalMenusRequest} extends {@link RequestModel}
 *
 * <p>ListPortalMenusRequest</p>
 */
public class ListPortalMenusRequest extends Request {
    @Query
    @NameInMap("DataPortalId")
    @Validation(required = true)
    private String dataPortalId;

    @Query
    @NameInMap("UserId")
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
         * DataPortalId.
         */
        public Builder dataPortalId(String dataPortalId) {
            this.putQueryParameter("DataPortalId", dataPortalId);
            this.dataPortalId = dataPortalId;
            return this;
        }

        /**
         * UserId.
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
