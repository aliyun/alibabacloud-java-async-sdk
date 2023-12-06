// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adp20210720.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteProductVersionConfigRequest} extends {@link RequestModel}
 *
 * <p>DeleteProductVersionConfigRequest</p>
 */
public class DeleteProductVersionConfigRequest extends Request {
    @Path
    @NameInMap("uid")
    @Validation(required = true)
    private String uid;

    @Path
    @NameInMap("configUID")
    @Validation(required = true)
    private String configUID;

    private DeleteProductVersionConfigRequest(Builder builder) {
        super(builder);
        this.uid = builder.uid;
        this.configUID = builder.configUID;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteProductVersionConfigRequest create() {
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
     * @return configUID
     */
    public String getConfigUID() {
        return this.configUID;
    }

    public static final class Builder extends Request.Builder<DeleteProductVersionConfigRequest, Builder> {
        private String uid; 
        private String configUID; 

        private Builder() {
            super();
        } 

        private Builder(DeleteProductVersionConfigRequest request) {
            super(request);
            this.uid = request.uid;
            this.configUID = request.configUID;
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
         * configUID.
         */
        public Builder configUID(String configUID) {
            this.putPathParameter("configUID", configUID);
            this.configUID = configUID;
            return this;
        }

        @Override
        public DeleteProductVersionConfigRequest build() {
            return new DeleteProductVersionConfigRequest(this);
        } 

    } 

}
