// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adp20210720.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateEnvironmentProductVersionRequest} extends {@link RequestModel}
 *
 * <p>UpdateEnvironmentProductVersionRequest</p>
 */
public class UpdateEnvironmentProductVersionRequest extends Request {
    @Path
    @NameInMap("uid")
    @Validation(required = true)
    private String uid;

    @Body
    @NameInMap("oldProductVersionSpecUID")
    private String oldProductVersionSpecUID;

    @Body
    @NameInMap("oldProductVersionUID")
    private String oldProductVersionUID;

    @Body
    @NameInMap("productVersionSpecUID")
    private String productVersionSpecUID;

    @Body
    @NameInMap("productVersionUID")
    @Validation(required = true)
    private String productVersionUID;

    private UpdateEnvironmentProductVersionRequest(Builder builder) {
        super(builder);
        this.uid = builder.uid;
        this.oldProductVersionSpecUID = builder.oldProductVersionSpecUID;
        this.oldProductVersionUID = builder.oldProductVersionUID;
        this.productVersionSpecUID = builder.productVersionSpecUID;
        this.productVersionUID = builder.productVersionUID;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateEnvironmentProductVersionRequest create() {
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
     * @return oldProductVersionSpecUID
     */
    public String getOldProductVersionSpecUID() {
        return this.oldProductVersionSpecUID;
    }

    /**
     * @return oldProductVersionUID
     */
    public String getOldProductVersionUID() {
        return this.oldProductVersionUID;
    }

    /**
     * @return productVersionSpecUID
     */
    public String getProductVersionSpecUID() {
        return this.productVersionSpecUID;
    }

    /**
     * @return productVersionUID
     */
    public String getProductVersionUID() {
        return this.productVersionUID;
    }

    public static final class Builder extends Request.Builder<UpdateEnvironmentProductVersionRequest, Builder> {
        private String uid; 
        private String oldProductVersionSpecUID; 
        private String oldProductVersionUID; 
        private String productVersionSpecUID; 
        private String productVersionUID; 

        private Builder() {
            super();
        } 

        private Builder(UpdateEnvironmentProductVersionRequest request) {
            super(request);
            this.uid = request.uid;
            this.oldProductVersionSpecUID = request.oldProductVersionSpecUID;
            this.oldProductVersionUID = request.oldProductVersionUID;
            this.productVersionSpecUID = request.productVersionSpecUID;
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
         * oldProductVersionSpecUID.
         */
        public Builder oldProductVersionSpecUID(String oldProductVersionSpecUID) {
            this.putBodyParameter("oldProductVersionSpecUID", oldProductVersionSpecUID);
            this.oldProductVersionSpecUID = oldProductVersionSpecUID;
            return this;
        }

        /**
         * oldProductVersionUID.
         */
        public Builder oldProductVersionUID(String oldProductVersionUID) {
            this.putBodyParameter("oldProductVersionUID", oldProductVersionUID);
            this.oldProductVersionUID = oldProductVersionUID;
            return this;
        }

        /**
         * productVersionSpecUID.
         */
        public Builder productVersionSpecUID(String productVersionSpecUID) {
            this.putBodyParameter("productVersionSpecUID", productVersionSpecUID);
            this.productVersionSpecUID = productVersionSpecUID;
            return this;
        }

        /**
         * productVersionUID.
         */
        public Builder productVersionUID(String productVersionUID) {
            this.putBodyParameter("productVersionUID", productVersionUID);
            this.productVersionUID = productVersionUID;
            return this;
        }

        @Override
        public UpdateEnvironmentProductVersionRequest build() {
            return new UpdateEnvironmentProductVersionRequest(this);
        } 

    } 

}
