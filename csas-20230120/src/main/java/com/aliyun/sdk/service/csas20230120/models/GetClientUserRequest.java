// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.csas20230120.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetClientUserRequest} extends {@link RequestModel}
 *
 * <p>GetClientUserRequest</p>
 */
public class GetClientUserRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IdpConfigId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String idpConfigId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Username")
    @com.aliyun.core.annotation.Validation(required = true)
    private String username;

    private GetClientUserRequest(Builder builder) {
        super(builder);
        this.idpConfigId = builder.idpConfigId;
        this.username = builder.username;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetClientUserRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return idpConfigId
     */
    public String getIdpConfigId() {
        return this.idpConfigId;
    }

    /**
     * @return username
     */
    public String getUsername() {
        return this.username;
    }

    public static final class Builder extends Request.Builder<GetClientUserRequest, Builder> {
        private String idpConfigId; 
        private String username; 

        private Builder() {
            super();
        } 

        private Builder(GetClientUserRequest request) {
            super(request);
            this.idpConfigId = request.idpConfigId;
            this.username = request.username;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>598</p>
         */
        public Builder idpConfigId(String idpConfigId) {
            this.putQueryParameter("IdpConfigId", idpConfigId);
            this.idpConfigId = idpConfigId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder username(String username) {
            this.putQueryParameter("Username", username);
            this.username = username;
            return this;
        }

        @Override
        public GetClientUserRequest build() {
            return new GetClientUserRequest(this);
        } 

    } 

}
