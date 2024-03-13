// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.facebody20191230.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteFaceRequest} extends {@link RequestModel}
 *
 * <p>DeleteFaceRequest</p>
 */
public class DeleteFaceRequest extends Request {
    @Body
    @NameInMap("DbName")
    @Validation(required = true)
    private String dbName;

    @Body
    @NameInMap("FaceId")
    @Validation(required = true)
    private String faceId;

    private DeleteFaceRequest(Builder builder) {
        super(builder);
        this.dbName = builder.dbName;
        this.faceId = builder.faceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteFaceRequest create() {
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
     * @return faceId
     */
    public String getFaceId() {
        return this.faceId;
    }

    public static final class Builder extends Request.Builder<DeleteFaceRequest, Builder> {
        private String dbName; 
        private String faceId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteFaceRequest request) {
            super(request);
            this.dbName = request.dbName;
            this.faceId = request.faceId;
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
         * FaceId.
         */
        public Builder faceId(String faceId) {
            this.putBodyParameter("FaceId", faceId);
            this.faceId = faceId;
            return this;
        }

        @Override
        public DeleteFaceRequest build() {
            return new DeleteFaceRequest(this);
        } 

    } 

}
