// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.facebody20191230.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListFaceEntitiesResponseBody} extends {@link TeaModel}
 *
 * <p>ListFaceEntitiesResponseBody</p>
 */
public class ListFaceEntitiesResponseBody extends TeaModel {
    @NameInMap("Data")
    private Data data;

    @NameInMap("RequestId")
    private String requestId;

    private ListFaceEntitiesResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListFaceEntitiesResponseBody create() {
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

        public ListFaceEntitiesResponseBody build() {
            return new ListFaceEntitiesResponseBody(this);
        } 

    } 

    public static class Entities extends TeaModel {
        @NameInMap("CreatedAt")
        private Long createdAt;

        @NameInMap("DbName")
        private String dbName;

        @NameInMap("EntityId")
        private String entityId;

        @NameInMap("FaceCount")
        private Integer faceCount;

        @NameInMap("Labels")
        private String labels;

        @NameInMap("UpdatedAt")
        private Long updatedAt;

        private Entities(Builder builder) {
            this.createdAt = builder.createdAt;
            this.dbName = builder.dbName;
            this.entityId = builder.entityId;
            this.faceCount = builder.faceCount;
            this.labels = builder.labels;
            this.updatedAt = builder.updatedAt;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Entities create() {
            return builder().build();
        }

        /**
         * @return createdAt
         */
        public Long getCreatedAt() {
            return this.createdAt;
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
         * @return faceCount
         */
        public Integer getFaceCount() {
            return this.faceCount;
        }

        /**
         * @return labels
         */
        public String getLabels() {
            return this.labels;
        }

        /**
         * @return updatedAt
         */
        public Long getUpdatedAt() {
            return this.updatedAt;
        }

        public static final class Builder {
            private Long createdAt; 
            private String dbName; 
            private String entityId; 
            private Integer faceCount; 
            private String labels; 
            private Long updatedAt; 

            /**
             * CreatedAt.
             */
            public Builder createdAt(Long createdAt) {
                this.createdAt = createdAt;
                return this;
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
             * FaceCount.
             */
            public Builder faceCount(Integer faceCount) {
                this.faceCount = faceCount;
                return this;
            }

            /**
             * Labels.
             */
            public Builder labels(String labels) {
                this.labels = labels;
                return this;
            }

            /**
             * UpdatedAt.
             */
            public Builder updatedAt(Long updatedAt) {
                this.updatedAt = updatedAt;
                return this;
            }

            public Entities build() {
                return new Entities(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("Entities")
        private java.util.List < Entities> entities;

        @NameInMap("Token")
        private String token;

        @NameInMap("TotalCount")
        private Integer totalCount;

        private Data(Builder builder) {
            this.entities = builder.entities;
            this.token = builder.token;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return entities
         */
        public java.util.List < Entities> getEntities() {
            return this.entities;
        }

        /**
         * @return token
         */
        public String getToken() {
            return this.token;
        }

        /**
         * @return totalCount
         */
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private java.util.List < Entities> entities; 
            private String token; 
            private Integer totalCount; 

            /**
             * Entities.
             */
            public Builder entities(java.util.List < Entities> entities) {
                this.entities = entities;
                return this;
            }

            /**
             * Token.
             */
            public Builder token(String token) {
                this.token = token;
                return this;
            }

            /**
             * TotalCount.
             */
            public Builder totalCount(Integer totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
