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
 * {@link GetFaceEntityResponseBody} extends {@link TeaModel}
 *
 * <p>GetFaceEntityResponseBody</p>
 */
public class GetFaceEntityResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetFaceEntityResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetFaceEntityResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Data data; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetFaceEntityResponseBody model) {
            this.data = model.data;
            this.requestId = model.requestId;
        } 

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetFaceEntityResponseBody build() {
            return new GetFaceEntityResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetFaceEntityResponseBody} extends {@link TeaModel}
     *
     * <p>GetFaceEntityResponseBody</p>
     */
    public static class Faces extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FaceId")
        private String faceId;

        private Faces(Builder builder) {
            this.faceId = builder.faceId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Faces create() {
            return builder().build();
        }

        /**
         * @return faceId
         */
        public String getFaceId() {
            return this.faceId;
        }

        public static final class Builder {
            private String faceId; 

            private Builder() {
            } 

            private Builder(Faces model) {
                this.faceId = model.faceId;
            } 

            /**
             * FaceId.
             */
            public Builder faceId(String faceId) {
                this.faceId = faceId;
                return this;
            }

            public Faces build() {
                return new Faces(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetFaceEntityResponseBody} extends {@link TeaModel}
     *
     * <p>GetFaceEntityResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DbName")
        private String dbName;

        @com.aliyun.core.annotation.NameInMap("EntityId")
        private String entityId;

        @com.aliyun.core.annotation.NameInMap("Faces")
        private java.util.List<Faces> faces;

        @com.aliyun.core.annotation.NameInMap("Labels")
        private String labels;

        private Data(Builder builder) {
            this.dbName = builder.dbName;
            this.entityId = builder.entityId;
            this.faces = builder.faces;
            this.labels = builder.labels;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
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
         * @return faces
         */
        public java.util.List<Faces> getFaces() {
            return this.faces;
        }

        /**
         * @return labels
         */
        public String getLabels() {
            return this.labels;
        }

        public static final class Builder {
            private String dbName; 
            private String entityId; 
            private java.util.List<Faces> faces; 
            private String labels; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.dbName = model.dbName;
                this.entityId = model.entityId;
                this.faces = model.faces;
                this.labels = model.labels;
            } 

            /**
             * DbName.
             */
            public Builder dbName(String dbName) {
                this.dbName = dbName;
                return this;
            }

            /**
             * EntityId.
             */
            public Builder entityId(String entityId) {
                this.entityId = entityId;
                return this;
            }

            /**
             * Faces.
             */
            public Builder faces(java.util.List<Faces> faces) {
                this.faces = faces;
                return this;
            }

            /**
             * Labels.
             */
            public Builder labels(String labels) {
                this.labels = labels;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
