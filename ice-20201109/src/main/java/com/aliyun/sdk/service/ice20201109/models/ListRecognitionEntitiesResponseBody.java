// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

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
 * {@link ListRecognitionEntitiesResponseBody} extends {@link TeaModel}
 *
 * <p>ListRecognitionEntitiesResponseBody</p>
 */
public class ListRecognitionEntitiesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Entities")
    private Entities entities;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private ListRecognitionEntitiesResponseBody(Builder builder) {
        this.entities = builder.entities;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListRecognitionEntitiesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return entities
     */
    public Entities getEntities() {
        return this.entities;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private Entities entities; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Long totalCount; 

        private Builder() {
        } 

        private Builder(ListRecognitionEntitiesResponseBody model) {
            this.entities = model.entities;
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * Entities.
         */
        public Builder entities(Entities entities) {
            this.entities = entities;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListRecognitionEntitiesResponseBody build() {
            return new ListRecognitionEntitiesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListRecognitionEntitiesResponseBody} extends {@link TeaModel}
     *
     * <p>ListRecognitionEntitiesResponseBody</p>
     */
    public static class Entity extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EntityId")
        private String entityId;

        @com.aliyun.core.annotation.NameInMap("EntityInfo")
        private String entityInfo;

        @com.aliyun.core.annotation.NameInMap("EntityName")
        private String entityName;

        private Entity(Builder builder) {
            this.entityId = builder.entityId;
            this.entityInfo = builder.entityInfo;
            this.entityName = builder.entityName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Entity create() {
            return builder().build();
        }

        /**
         * @return entityId
         */
        public String getEntityId() {
            return this.entityId;
        }

        /**
         * @return entityInfo
         */
        public String getEntityInfo() {
            return this.entityInfo;
        }

        /**
         * @return entityName
         */
        public String getEntityName() {
            return this.entityName;
        }

        public static final class Builder {
            private String entityId; 
            private String entityInfo; 
            private String entityName; 

            private Builder() {
            } 

            private Builder(Entity model) {
                this.entityId = model.entityId;
                this.entityInfo = model.entityInfo;
                this.entityName = model.entityName;
            } 

            /**
             * EntityId.
             */
            public Builder entityId(String entityId) {
                this.entityId = entityId;
                return this;
            }

            /**
             * EntityInfo.
             */
            public Builder entityInfo(String entityInfo) {
                this.entityInfo = entityInfo;
                return this;
            }

            /**
             * EntityName.
             */
            public Builder entityName(String entityName) {
                this.entityName = entityName;
                return this;
            }

            public Entity build() {
                return new Entity(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListRecognitionEntitiesResponseBody} extends {@link TeaModel}
     *
     * <p>ListRecognitionEntitiesResponseBody</p>
     */
    public static class Entities extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Entity")
        private java.util.List<Entity> entity;

        private Entities(Builder builder) {
            this.entity = builder.entity;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Entities create() {
            return builder().build();
        }

        /**
         * @return entity
         */
        public java.util.List<Entity> getEntity() {
            return this.entity;
        }

        public static final class Builder {
            private java.util.List<Entity> entity; 

            private Builder() {
            } 

            private Builder(Entities model) {
                this.entity = model.entity;
            } 

            /**
             * Entity.
             */
            public Builder entity(java.util.List<Entity> entity) {
                this.entity = entity;
                return this;
            }

            public Entities build() {
                return new Entities(this);
            } 

        } 

    }
}
