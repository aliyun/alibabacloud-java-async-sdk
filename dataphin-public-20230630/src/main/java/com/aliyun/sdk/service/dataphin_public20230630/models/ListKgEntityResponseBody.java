// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataphin_public20230630.models;

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
 * {@link ListKgEntityResponseBody} extends {@link TeaModel}
 *
 * <p>ListKgEntityResponseBody</p>
 */
public class ListKgEntityResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("PageResult")
    private PageResult pageResult;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private ListKgEntityResponseBody(Builder builder) {
        this.code = builder.code;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.pageResult = builder.pageResult;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListKgEntityResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return pageResult
     */
    public PageResult getPageResult() {
        return this.pageResult;
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

    public static final class Builder {
        private String code; 
        private Integer httpStatusCode; 
        private String message; 
        private PageResult pageResult; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(ListKgEntityResponseBody model) {
            this.code = model.code;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.pageResult = model.pageResult;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * HttpStatusCode.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * PageResult.
         */
        public Builder pageResult(PageResult pageResult) {
            this.pageResult = pageResult;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>82E78D6B-AA8F-1FEF-8AA3-5C9DA2A79140</p>
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

        public ListKgEntityResponseBody build() {
            return new ListKgEntityResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListKgEntityResponseBody} extends {@link TeaModel}
     *
     * <p>ListKgEntityResponseBody</p>
     */
    public static class PropertyList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Code")
        private String code;

        @com.aliyun.core.annotation.NameInMap("DataType")
        private String dataType;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private PropertyList(Builder builder) {
            this.code = builder.code;
            this.dataType = builder.dataType;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PropertyList create() {
            return builder().build();
        }

        /**
         * @return code
         */
        public String getCode() {
            return this.code;
        }

        /**
         * @return dataType
         */
        public String getDataType() {
            return this.dataType;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String code; 
            private String dataType; 
            private String value; 

            private Builder() {
            } 

            private Builder(PropertyList model) {
                this.code = model.code;
                this.dataType = model.dataType;
                this.value = model.value;
            } 

            /**
             * Code.
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * DataType.
             */
            public Builder dataType(String dataType) {
                this.dataType = dataType;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public PropertyList build() {
                return new PropertyList(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListKgEntityResponseBody} extends {@link TeaModel}
     *
     * <p>ListKgEntityResponseBody</p>
     */
    public static class EntityList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EntityId")
        private String entityId;

        @com.aliyun.core.annotation.NameInMap("EntityType")
        private String entityType;

        @com.aliyun.core.annotation.NameInMap("PropertyList")
        private java.util.List<PropertyList> propertyList;

        private EntityList(Builder builder) {
            this.entityId = builder.entityId;
            this.entityType = builder.entityType;
            this.propertyList = builder.propertyList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EntityList create() {
            return builder().build();
        }

        /**
         * @return entityId
         */
        public String getEntityId() {
            return this.entityId;
        }

        /**
         * @return entityType
         */
        public String getEntityType() {
            return this.entityType;
        }

        /**
         * @return propertyList
         */
        public java.util.List<PropertyList> getPropertyList() {
            return this.propertyList;
        }

        public static final class Builder {
            private String entityId; 
            private String entityType; 
            private java.util.List<PropertyList> propertyList; 

            private Builder() {
            } 

            private Builder(EntityList model) {
                this.entityId = model.entityId;
                this.entityType = model.entityType;
                this.propertyList = model.propertyList;
            } 

            /**
             * EntityId.
             */
            public Builder entityId(String entityId) {
                this.entityId = entityId;
                return this;
            }

            /**
             * EntityType.
             */
            public Builder entityType(String entityType) {
                this.entityType = entityType;
                return this;
            }

            /**
             * PropertyList.
             */
            public Builder propertyList(java.util.List<PropertyList> propertyList) {
                this.propertyList = propertyList;
                return this;
            }

            public EntityList build() {
                return new EntityList(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListKgEntityResponseBody} extends {@link TeaModel}
     *
     * <p>ListKgEntityResponseBody</p>
     */
    public static class PageResult extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EntityList")
        private java.util.List<EntityList> entityList;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Integer totalCount;

        private PageResult(Builder builder) {
            this.entityList = builder.entityList;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PageResult create() {
            return builder().build();
        }

        /**
         * @return entityList
         */
        public java.util.List<EntityList> getEntityList() {
            return this.entityList;
        }

        /**
         * @return totalCount
         */
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private java.util.List<EntityList> entityList; 
            private Integer totalCount; 

            private Builder() {
            } 

            private Builder(PageResult model) {
                this.entityList = model.entityList;
                this.totalCount = model.totalCount;
            } 

            /**
             * EntityList.
             */
            public Builder entityList(java.util.List<EntityList> entityList) {
                this.entityList = entityList;
                return this;
            }

            /**
             * TotalCount.
             */
            public Builder totalCount(Integer totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public PageResult build() {
                return new PageResult(this);
            } 

        } 

    }
}
