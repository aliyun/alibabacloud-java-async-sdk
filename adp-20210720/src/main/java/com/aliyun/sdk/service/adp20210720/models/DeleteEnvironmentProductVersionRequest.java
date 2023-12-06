// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adp20210720.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteEnvironmentProductVersionRequest} extends {@link RequestModel}
 *
 * <p>DeleteEnvironmentProductVersionRequest</p>
 */
public class DeleteEnvironmentProductVersionRequest extends Request {
    @Path
    @NameInMap("uid")
    @Validation(required = true)
    private String uid;

    @Path
    @NameInMap("productVersionUID")
    @Validation(required = true)
    private String productVersionUID;

    private DeleteEnvironmentProductVersionRequest(Builder builder) {
        super(builder);
        this.uid = builder.uid;
        this.productVersionUID = builder.productVersionUID;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteEnvironmentProductVersionRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return uid
     */
    public String getUid() {
        return this.uid;
    }

    /**
     * @return productVersionUID
     */
    public String getProductVersionUID() {
        return this.productVersionUID;
    }

    public static final class Builder extends Request.Builder<DeleteEnvironmentProductVersionRequest, Builder> {
        private String uid; 
        private String productVersionUID; 

        private Builder() {
            super();
        } 

        private Builder(DeleteEnvironmentProductVersionRequest request) {
            super(request);
            this.uid = request.uid;
            this.productVersionUID = request.productVersionUID;
        } 

        /**
         * uid.
         */
        public Builder uid(String uid) {
            this.putPathParameter("uid", uid);
            this.uid = uid;
            return this;
        }

        /**
         * productVersionUID.
         */
        public Builder productVersionUID(String productVersionUID) {
            this.putPathParameter("productVersionUID", productVersionUID);
            this.productVersionUID = productVersionUID;
            return this;
        }

        @Override
        public DeleteEnvironmentProductVersionRequest build() {
            return new DeleteEnvironmentProductVersionRequest(this);
        } 

    } 

}
