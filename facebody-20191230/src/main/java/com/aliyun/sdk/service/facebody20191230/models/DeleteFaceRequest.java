// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.facebody20191230.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DeleteFaceRequest} extends {@link RequestModel}
 *
 * <p>DeleteFaceRequest</p>
 */
public class DeleteFaceRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DbName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String dbName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("FaceId")
    @com.aliyun.core.annotation.Validation(required = true)
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>default</p>
         */
        public Builder dbName(String dbName) {
            this.putBodyParameter("DbName", dbName);
            this.dbName = dbName;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>001</p>
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
