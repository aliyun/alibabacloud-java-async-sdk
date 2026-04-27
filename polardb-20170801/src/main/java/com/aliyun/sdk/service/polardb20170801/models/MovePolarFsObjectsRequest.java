// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

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
 * {@link MovePolarFsObjectsRequest} extends {@link RequestModel}
 *
 * <p>MovePolarFsObjectsRequest</p>
 */
public class MovePolarFsObjectsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ObjectsToMove")
    private java.util.List<ObjectsToMove> objectsToMove;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PolarFsInstanceId")
    private String polarFsInstanceId;

    private MovePolarFsObjectsRequest(Builder builder) {
        super(builder);
        this.objectsToMove = builder.objectsToMove;
        this.polarFsInstanceId = builder.polarFsInstanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static MovePolarFsObjectsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return objectsToMove
     */
    public java.util.List<ObjectsToMove> getObjectsToMove() {
        return this.objectsToMove;
    }

    /**
     * @return polarFsInstanceId
     */
    public String getPolarFsInstanceId() {
        return this.polarFsInstanceId;
    }

    public static final class Builder extends Request.Builder<MovePolarFsObjectsRequest, Builder> {
        private java.util.List<ObjectsToMove> objectsToMove; 
        private String polarFsInstanceId; 

        private Builder() {
            super();
        } 

        private Builder(MovePolarFsObjectsRequest request) {
            super(request);
            this.objectsToMove = request.objectsToMove;
            this.polarFsInstanceId = request.polarFsInstanceId;
        } 

        /**
         * ObjectsToMove.
         */
        public Builder objectsToMove(java.util.List<ObjectsToMove> objectsToMove) {
            this.putQueryParameter("ObjectsToMove", objectsToMove);
            this.objectsToMove = objectsToMove;
            return this;
        }

        /**
         * PolarFsInstanceId.
         */
        public Builder polarFsInstanceId(String polarFsInstanceId) {
            this.putQueryParameter("PolarFsInstanceId", polarFsInstanceId);
            this.polarFsInstanceId = polarFsInstanceId;
            return this;
        }

        @Override
        public MovePolarFsObjectsRequest build() {
            return new MovePolarFsObjectsRequest(this);
        } 

    } 

    /**
     * 
     * {@link MovePolarFsObjectsRequest} extends {@link TeaModel}
     *
     * <p>MovePolarFsObjectsRequest</p>
     */
    public static class ObjectsToMove extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DestinationPath")
        private String destinationPath;

        @com.aliyun.core.annotation.NameInMap("SourcePath")
        private String sourcePath;

        private ObjectsToMove(Builder builder) {
            this.destinationPath = builder.destinationPath;
            this.sourcePath = builder.sourcePath;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ObjectsToMove create() {
            return builder().build();
        }

        /**
         * @return destinationPath
         */
        public String getDestinationPath() {
            return this.destinationPath;
        }

        /**
         * @return sourcePath
         */
        public String getSourcePath() {
            return this.sourcePath;
        }

        public static final class Builder {
            private String destinationPath; 
            private String sourcePath; 

            private Builder() {
            } 

            private Builder(ObjectsToMove model) {
                this.destinationPath = model.destinationPath;
                this.sourcePath = model.sourcePath;
            } 

            /**
             * DestinationPath.
             */
            public Builder destinationPath(String destinationPath) {
                this.destinationPath = destinationPath;
                return this;
            }

            /**
             * SourcePath.
             */
            public Builder sourcePath(String sourcePath) {
                this.sourcePath = sourcePath;
                return this;
            }

            public ObjectsToMove build() {
                return new ObjectsToMove(this);
            } 

        } 

    }
}
