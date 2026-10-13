// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.chatbot20220408.models;

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
 * {@link ListDSEntityValueResponseBody} extends {@link TeaModel}
 *
 * <p>ListDSEntityValueResponseBody</p>
 */
public class ListDSEntityValueResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("EntityValues")
    private java.util.List<EntityValues> entityValues;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private ListDSEntityValueResponseBody(Builder builder) {
        this.entityValues = builder.entityValues;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDSEntityValueResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return entityValues
     */
    public java.util.List<EntityValues> getEntityValues() {
        return this.entityValues;
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
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List<EntityValues> entityValues; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(ListDSEntityValueResponseBody model) {
            this.entityValues = model.entityValues;
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The entity list.</p>
         */
        public Builder entityValues(java.util.List<EntityValues> entityValues) {
            this.entityValues = entityValues;
            return this;
        }

        /**
         * <p>The current page number. Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The page size. Default value: 10.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The unique request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>n3fg34gbfj8adf2gj923</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListDSEntityValueResponseBody build() {
            return new ListDSEntityValueResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListDSEntityValueResponseBody} extends {@link TeaModel}
     *
     * <p>ListDSEntityValueResponseBody</p>
     */
    public static class EntityValues extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Content")
        private String content;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("EntityId")
        private Long entityId;

        @com.aliyun.core.annotation.NameInMap("EntityValueId")
        private Long entityValueId;

        @com.aliyun.core.annotation.NameInMap("ModifyTime")
        private String modifyTime;

        @com.aliyun.core.annotation.NameInMap("Synonyms")
        private java.util.List<String> synonyms;

        private EntityValues(Builder builder) {
            this.content = builder.content;
            this.createTime = builder.createTime;
            this.entityId = builder.entityId;
            this.entityValueId = builder.entityValueId;
            this.modifyTime = builder.modifyTime;
            this.synonyms = builder.synonyms;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EntityValues create() {
            return builder().build();
        }

        /**
         * @return content
         */
        public String getContent() {
            return this.content;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return entityId
         */
        public Long getEntityId() {
            return this.entityId;
        }

        /**
         * @return entityValueId
         */
        public Long getEntityValueId() {
            return this.entityValueId;
        }

        /**
         * @return modifyTime
         */
        public String getModifyTime() {
            return this.modifyTime;
        }

        /**
         * @return synonyms
         */
        public java.util.List<String> getSynonyms() {
            return this.synonyms;
        }

        public static final class Builder {
            private String content; 
            private String createTime; 
            private Long entityId; 
            private Long entityValueId; 
            private String modifyTime; 
            private java.util.List<String> synonyms; 

            private Builder() {
            } 

            private Builder(EntityValues model) {
                this.content = model.content;
                this.createTime = model.createTime;
                this.entityId = model.entityId;
                this.entityValueId = model.entityValueId;
                this.modifyTime = model.modifyTime;
                this.synonyms = model.synonyms;
            } 

            /**
             * <p>The entity member name (entity value or regular expression).</p>
             * 
             * <strong>example:</strong>
             * <p>Book type</p>
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * <p>The creation time in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-08-12T16:00:01Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The entity ID.</p>
             * 
             * <strong>example:</strong>
             * <p>34313785463</p>
             */
            public Builder entityId(Long entityId) {
                this.entityId = entityId;
                return this;
            }

            /**
             * <p>The entity member ID.</p>
             * 
             * <strong>example:</strong>
             * <p>3467858234534534532</p>
             */
            public Builder entityValueId(Long entityValueId) {
                this.entityValueId = entityValueId;
                return this;
            }

            /**
             * <p>The modification time in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-08-12T16:00:01Z</p>
             */
            public Builder modifyTime(String modifyTime) {
                this.modifyTime = modifyTime;
                return this;
            }

            /**
             * <p>The synonym list.</p>
             */
            public Builder synonyms(java.util.List<String> synonyms) {
                this.synonyms = synonyms;
                return this;
            }

            public EntityValues build() {
                return new EntityValues(this);
            } 

        } 

    }
}
