// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.csas20230120.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RevokeUserSessionRequest} extends {@link RequestModel}
 *
 * <p>RevokeUserSessionRequest</p>
 */
public class RevokeUserSessionRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ExternalIds")
    @com.aliyun.core.annotation.Validation(required = true)
    private String externalIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IdpId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String idpId;

    private RevokeUserSessionRequest(Builder builder) {
        super(builder);
        this.externalIds = builder.externalIds;
        this.idpId = builder.idpId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RevokeUserSessionRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return externalIds
     */
    public String getExternalIds() {
        return this.externalIds;
    }

    /**
     * @return idpId
     */
    public String getIdpId() {
        return this.idpId;
    }

    public static final class Builder extends Request.Builder<RevokeUserSessionRequest, Builder> {
        private String externalIds; 
        private String idpId; 

        private Builder() {
            super();
        } 

        private Builder(RevokeUserSessionRequest request) {
            super(request);
            this.externalIds = request.externalIds;
            this.idpId = request.idpId;
        } 

        /**
         * ExternalIds.
         */
        public Builder externalIds(String externalIds) {
            this.putQueryParameter("ExternalIds", externalIds);
            this.externalIds = externalIds;
            return this;
        }

        /**
         * IdpId.
         */
        public Builder idpId(String idpId) {
            this.putQueryParameter("IdpId", idpId);
            this.idpId = idpId;
            return this;
        }

        @Override
        public RevokeUserSessionRequest build() {
            return new RevokeUserSessionRequest(this);
        } 

    } 

}
