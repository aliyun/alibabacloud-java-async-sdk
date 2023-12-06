// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adp20210720.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateProductFoundationVersionRequest} extends {@link RequestModel}
 *
 * <p>UpdateProductFoundationVersionRequest</p>
 */
public class UpdateProductFoundationVersionRequest extends Request {
    @Path
    @NameInMap("uid")
    @Validation(required = true)
    private String uid;

    @Body
    @NameInMap("foundationVersionUID")
    private String foundationVersionUID;

    private UpdateProductFoundationVersionRequest(Builder builder) {
        super(builder);
        this.uid = builder.uid;
        this.foundationVersionUID = builder.foundationVersionUID;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateProductFoundationVersionRequest create() {
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
     * @return foundationVersionUID
     */
    public String getFoundationVersionUID() {
        return this.foundationVersionUID;
    }

    public static final class Builder extends Request.Builder<UpdateProductFoundationVersionRequest, Builder> {
        private String uid; 
        private String foundationVersionUID; 

        private Builder() {
            super();
        } 

        private Builder(UpdateProductFoundationVersionRequest request) {
            super(request);
            this.uid = request.uid;
            this.foundationVersionUID = request.foundationVersionUID;
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
         * foundationVersionUID.
         */
        public Builder foundationVersionUID(String foundationVersionUID) {
            this.putBodyParameter("foundationVersionUID", foundationVersionUID);
            this.foundationVersionUID = foundationVersionUID;
            return this;
        }

        @Override
        public UpdateProductFoundationVersionRequest build() {
            return new UpdateProductFoundationVersionRequest(this);
        } 

    } 

}
