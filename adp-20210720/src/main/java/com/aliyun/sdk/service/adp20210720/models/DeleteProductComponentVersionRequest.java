// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adp20210720.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteProductComponentVersionRequest} extends {@link RequestModel}
 *
 * <p>DeleteProductComponentVersionRequest</p>
 */
public class DeleteProductComponentVersionRequest extends Request {
    @Path
    @NameInMap("uid")
    @Validation(required = true)
    private String uid;

    @Path
    @NameInMap("relationUID")
    @Validation(required = true)
    private String relationUID;

    private DeleteProductComponentVersionRequest(Builder builder) {
        super(builder);
        this.uid = builder.uid;
        this.relationUID = builder.relationUID;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteProductComponentVersionRequest create() {
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
     * @return relationUID
     */
    public String getRelationUID() {
        return this.relationUID;
    }

    public static final class Builder extends Request.Builder<DeleteProductComponentVersionRequest, Builder> {
        private String uid; 
        private String relationUID; 

        private Builder() {
            super();
        } 

        private Builder(DeleteProductComponentVersionRequest request) {
            super(request);
            this.uid = request.uid;
            this.relationUID = request.relationUID;
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
         * relationUID.
         */
        public Builder relationUID(String relationUID) {
            this.putPathParameter("relationUID", relationUID);
            this.relationUID = relationUID;
            return this;
        }

        @Override
        public DeleteProductComponentVersionRequest build() {
            return new DeleteProductComponentVersionRequest(this);
        } 

    } 

}
