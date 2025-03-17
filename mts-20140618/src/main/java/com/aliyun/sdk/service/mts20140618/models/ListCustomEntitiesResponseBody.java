// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mts20140618.models;

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
 * {@link ListCustomEntitiesResponseBody} extends {@link TeaModel}
 *
 * <p>ListCustomEntitiesResponseBody</p>
 */
public class ListCustomEntitiesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CustomEntities")
    private CustomEntities customEntities;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private ListCustomEntitiesResponseBody(Builder builder) {
        this.customEntities = builder.customEntities;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListCustomEntitiesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return customEntities
     */
    public CustomEntities getCustomEntities() {
        return this.customEntities;
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
        private CustomEntities customEntities; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Long totalCount; 

        private Builder() {
        } 

        private Builder(ListCustomEntitiesResponseBody model) {
            this.customEntities = model.customEntities;
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * CustomEntities.
         */
        public Builder customEntities(CustomEntities customEntities) {
            this.customEntities = customEntities;
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

        public ListCustomEntitiesResponseBody build() {
            return new ListCustomEntitiesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListCustomEntitiesResponseBody} extends {@link TeaModel}
     *
     * <p>ListCustomEntitiesResponseBody</p>
     */
    public static class CustomEntity extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CustomEntityId")
        private String customEntityId;

        @com.aliyun.core.annotation.NameInMap("CustomEntityInfo")
        private String customEntityInfo;

        @com.aliyun.core.annotation.NameInMap("CustomEntityName")
        private String customEntityName;

        private CustomEntity(Builder builder) {
            this.customEntityId = builder.customEntityId;
            this.customEntityInfo = builder.customEntityInfo;
            this.customEntityName = builder.customEntityName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CustomEntity create() {
            return builder().build();
        }

        /**
         * @return customEntityId
         */
        public String getCustomEntityId() {
            return this.customEntityId;
        }

        /**
         * @return customEntityInfo
         */
        public String getCustomEntityInfo() {
            return this.customEntityInfo;
        }

        /**
         * @return customEntityName
         */
        public String getCustomEntityName() {
            return this.customEntityName;
        }

        public static final class Builder {
            private String customEntityId; 
            private String customEntityInfo; 
            private String customEntityName; 

            private Builder() {
            } 

            private Builder(CustomEntity model) {
                this.customEntityId = model.customEntityId;
                this.customEntityInfo = model.customEntityInfo;
                this.customEntityName = model.customEntityName;
            } 

            /**
             * CustomEntityId.
             */
            public Builder customEntityId(String customEntityId) {
                this.customEntityId = customEntityId;
                return this;
            }

            /**
             * CustomEntityInfo.
             */
            public Builder customEntityInfo(String customEntityInfo) {
                this.customEntityInfo = customEntityInfo;
                return this;
            }

            /**
             * CustomEntityName.
             */
            public Builder customEntityName(String customEntityName) {
                this.customEntityName = customEntityName;
                return this;
            }

            public CustomEntity build() {
                return new CustomEntity(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListCustomEntitiesResponseBody} extends {@link TeaModel}
     *
     * <p>ListCustomEntitiesResponseBody</p>
     */
    public static class CustomEntities extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CustomEntity")
        private java.util.List<CustomEntity> customEntity;

        private CustomEntities(Builder builder) {
            this.customEntity = builder.customEntity;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CustomEntities create() {
            return builder().build();
        }

        /**
         * @return customEntity
         */
        public java.util.List<CustomEntity> getCustomEntity() {
            return this.customEntity;
        }

        public static final class Builder {
            private java.util.List<CustomEntity> customEntity; 

            private Builder() {
            } 

            private Builder(CustomEntities model) {
                this.customEntity = model.customEntity;
            } 

            /**
             * CustomEntity.
             */
            public Builder customEntity(java.util.List<CustomEntity> customEntity) {
                this.customEntity = customEntity;
                return this;
            }

            public CustomEntities build() {
                return new CustomEntities(this);
            } 

        } 

    }
}
