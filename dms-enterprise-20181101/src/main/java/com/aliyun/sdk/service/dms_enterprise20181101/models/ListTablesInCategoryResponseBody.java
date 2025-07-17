// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

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
 * {@link ListTablesInCategoryResponseBody} extends {@link TeaModel}
 *
 * <p>ListTablesInCategoryResponseBody</p>
 */
public class ListTablesInCategoryResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("EntityList")
    private EntityList entityList;

    @com.aliyun.core.annotation.NameInMap("ErrorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("ErrorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private ListTablesInCategoryResponseBody(Builder builder) {
        this.entityList = builder.entityList;
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListTablesInCategoryResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return entityList
     */
    public EntityList getEntityList() {
        return this.entityList;
    }

    /**
     * @return errorCode
     */
    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * @return errorMessage
     */
    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    /**
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private EntityList entityList; 
        private String errorCode; 
        private String errorMessage; 
        private String requestId; 
        private Boolean success; 
        private Long totalCount; 

        private Builder() {
        } 

        private Builder(ListTablesInCategoryResponseBody model) {
            this.entityList = model.entityList;
            this.errorCode = model.errorCode;
            this.errorMessage = model.errorMessage;
            this.requestId = model.requestId;
            this.success = model.success;
            this.totalCount = model.totalCount;
        } 

        /**
         * EntityList.
         */
        public Builder entityList(EntityList entityList) {
            this.entityList = entityList;
            return this;
        }

        /**
         * ErrorCode.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * ErrorMessage.
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
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
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListTablesInCategoryResponseBody build() {
            return new ListTablesInCategoryResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListTablesInCategoryResponseBody} extends {@link TeaModel}
     *
     * <p>ListTablesInCategoryResponseBody</p>
     */
    public static class EntityList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("MetaCategoryTableEntity")
        private java.util.List<MetaCategoryTableEntity> metaCategoryTableEntity;

        private EntityList(Builder builder) {
            this.metaCategoryTableEntity = builder.metaCategoryTableEntity;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EntityList create() {
            return builder().build();
        }

        /**
         * @return metaCategoryTableEntity
         */
        public java.util.List<MetaCategoryTableEntity> getMetaCategoryTableEntity() {
            return this.metaCategoryTableEntity;
        }

        public static final class Builder {
            private java.util.List<MetaCategoryTableEntity> metaCategoryTableEntity; 

            private Builder() {
            } 

            private Builder(EntityList model) {
                this.metaCategoryTableEntity = model.metaCategoryTableEntity;
            } 

            /**
             * MetaCategoryTableEntity.
             */
            public Builder metaCategoryTableEntity(java.util.List<MetaCategoryTableEntity> metaCategoryTableEntity) {
                this.metaCategoryTableEntity = metaCategoryTableEntity;
                return this;
            }

            public EntityList build() {
                return new EntityList(this);
            } 

        } 

    }
}
