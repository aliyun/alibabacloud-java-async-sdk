// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.facebody20191230.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateFaceEntityRequest} extends {@link RequestModel}
 *
 * <p>UpdateFaceEntityRequest</p>
 */
public class UpdateFaceEntityRequest extends Request {
    @Body
    @NameInMap("DbName")
    @Validation(required = true)
    private String dbName;

    @Body
    @NameInMap("EntityId")
    @Validation(required = true)
    private String entityId;

    @Body
    @NameInMap("Labels")
    private String labels;

    private UpdateFaceEntityRequest(Builder builder) {
        super(builder);
        this.dbName = builder.dbName;
        this.entityId = builder.entityId;
        this.labels = builder.labels;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateFaceEntityRequest create() {
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

    /**
     * @return labels
     */
    public String getLabels() {
        return this.labels;
    }

    public static final class Builder extends Request.Builder<UpdateFaceEntityRequest, Builder> {
        private String dbName; 
        private String entityId; 
        private String labels; 

        private Builder() {
            super();
        } 

        private Builder(UpdateFaceEntityRequest request) {
            super(request);
            this.dbName = request.dbName;
            this.entityId = request.entityId;
            this.labels = request.labels;
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

        /**
         * Labels.
         */
        public Builder labels(String labels) {
            this.putBodyParameter("Labels", labels);
            this.labels = labels;
            return this;
        }

        @Override
        public UpdateFaceEntityRequest build() {
            return new UpdateFaceEntityRequest(this);
        } 

    } 

}
