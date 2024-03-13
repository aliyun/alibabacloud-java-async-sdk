// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.facebody20191230.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteFaceEntityRequest} extends {@link RequestModel}
 *
 * <p>DeleteFaceEntityRequest</p>
 */
public class DeleteFaceEntityRequest extends Request {
    @Body
    @NameInMap("DbName")
    @Validation(required = true)
    private String dbName;

    @Body
    @NameInMap("EntityId")
    @Validation(required = true)
    private String entityId;

    private DeleteFaceEntityRequest(Builder builder) {
        super(builder);
        this.dbName = builder.dbName;
        this.entityId = builder.entityId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteFaceEntityRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dbName
     */
    public String getDbName() {
        return this.dbName;
    }

    /**
     * @return entityId
     */
    public String getEntityId() {
        return this.entityId;
    }

    public static final class Builder extends Request.Builder<DeleteFaceEntityRequest, Builder> {
        private String dbName; 
        private String entityId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteFaceEntityRequest request) {
            super(request);
            this.dbName = request.dbName;
            this.entityId = request.entityId;
        } 

        /**
         * DbName.
         */
        public Builder dbName(String dbName) {
            this.putBodyParameter("DbName", dbName);
            this.dbName = dbName;
            return this;
        }

        /**
         * EntityId.
         */
        public Builder entityId(String entityId) {
            this.putBodyParameter("EntityId", entityId);
            this.entityId = entityId;
            return this;
        }

        @Override
        public DeleteFaceEntityRequest build() {
            return new DeleteFaceEntityRequest(this);
        } 

    } 

}
