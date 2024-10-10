// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quickbi_public20220101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListPortalMenuAuthorizationRequest} extends {@link RequestModel}
 *
 * <p>ListPortalMenuAuthorizationRequest</p>
 */
public class ListPortalMenuAuthorizationRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DataPortalId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String dataPortalId;

    private ListPortalMenuAuthorizationRequest(Builder builder) {
        super(builder);
        this.dataPortalId = builder.dataPortalId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListPortalMenuAuthorizationRequest create() {
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

    public static final class Builder extends Request.Builder<ListPortalMenuAuthorizationRequest, Builder> {
        private String dataPortalId; 

        private Builder() {
            super();
        } 

        private Builder(ListPortalMenuAuthorizationRequest request) {
            super(request);
            this.dataPortalId = request.dataPortalId;
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

        @Override
        public ListPortalMenuAuthorizationRequest build() {
            return new ListPortalMenuAuthorizationRequest(this);
        } 

    } 

}
