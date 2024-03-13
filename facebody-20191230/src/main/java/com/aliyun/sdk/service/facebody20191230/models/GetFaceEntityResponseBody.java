// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.facebody20191230.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetFaceEntityResponseBody} extends {@link TeaModel}
 *
 * <p>GetFaceEntityResponseBody</p>
 */
public class GetFaceEntityResponseBody extends TeaModel {
    @NameInMap("Data")
    private Data data;

    @NameInMap("RequestId")
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

    public static class Faces extends TeaModel {
        @NameInMap("FaceId")
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
    public static class Data extends TeaModel {
        @NameInMap("DbName")
        private String dbName;

        @NameInMap("EntityId")
        private String entityId;

        @NameInMap("Faces")
        private java.util.List < Faces> faces;

        @NameInMap("Labels")
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
        public java.util.List < Faces> getFaces() {
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
            private java.util.List < Faces> faces; 
            private String labels; 

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
            public Builder faces(java.util.List < Faces> faces) {
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
