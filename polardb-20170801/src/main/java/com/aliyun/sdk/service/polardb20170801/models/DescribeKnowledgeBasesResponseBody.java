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
 * {@link DescribeKnowledgeBasesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeKnowledgeBasesResponseBody</p>
 */
public class DescribeKnowledgeBasesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Items")
    private java.util.List<Items> items;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalRecordCount")
    private Integer totalRecordCount;

    private DescribeKnowledgeBasesResponseBody(Builder builder) {
        this.items = builder.items;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalRecordCount = builder.totalRecordCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeKnowledgeBasesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return items
     */
    public java.util.List<Items> getItems() {
        return this.items;
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
     * @return totalRecordCount
     */
    public Integer getTotalRecordCount() {
        return this.totalRecordCount;
    }

    public static final class Builder {
        private java.util.List<Items> items; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalRecordCount; 

        private Builder() {
        } 

        private Builder(DescribeKnowledgeBasesResponseBody model) {
            this.items = model.items;
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.totalRecordCount = model.totalRecordCount;
        } 

        /**
         * <p>The list of knowledge bases.</p>
         */
        public Builder items(java.util.List<Items> items) {
            this.items = items;
            return this;
        }

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page. Valid values: <strong>30</strong>, <strong>50</strong>, and <strong>100</strong>.</p>
         * <p>Default value: <strong>30</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>CDB3258F-B5DE-43C4-8935-CBA0CA******</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of records.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalRecordCount(Integer totalRecordCount) {
            this.totalRecordCount = totalRecordCount;
            return this;
        }

        public DescribeKnowledgeBasesResponseBody build() {
            return new DescribeKnowledgeBasesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeKnowledgeBasesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeKnowledgeBasesResponseBody</p>
     */
    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BindingAppCount")
        private Integer bindingAppCount;

        @com.aliyun.core.annotation.NameInMap("CreationTime")
        private String creationTime;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("KnowledgeBaseId")
        private String knowledgeBaseId;

        @com.aliyun.core.annotation.NameInMap("KnowledgeBaseType")
        private String knowledgeBaseType;

        @com.aliyun.core.annotation.NameInMap("KnowledgeSpaceId")
        private String knowledgeSpaceId;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("TotalDocs")
        private Integer totalDocs;

        @com.aliyun.core.annotation.NameInMap("TotalSizeBytes")
        private Long totalSizeBytes;

        private Items(Builder builder) {
            this.bindingAppCount = builder.bindingAppCount;
            this.creationTime = builder.creationTime;
            this.description = builder.description;
            this.knowledgeBaseId = builder.knowledgeBaseId;
            this.knowledgeBaseType = builder.knowledgeBaseType;
            this.knowledgeSpaceId = builder.knowledgeSpaceId;
            this.name = builder.name;
            this.status = builder.status;
            this.totalDocs = builder.totalDocs;
            this.totalSizeBytes = builder.totalSizeBytes;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
        }

        /**
         * @return bindingAppCount
         */
        public Integer getBindingAppCount() {
            return this.bindingAppCount;
        }

        /**
         * @return creationTime
         */
        public String getCreationTime() {
            return this.creationTime;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return knowledgeBaseId
         */
        public String getKnowledgeBaseId() {
            return this.knowledgeBaseId;
        }

        /**
         * @return knowledgeBaseType
         */
        public String getKnowledgeBaseType() {
            return this.knowledgeBaseType;
        }

        /**
         * @return knowledgeSpaceId
         */
        public String getKnowledgeSpaceId() {
            return this.knowledgeSpaceId;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return totalDocs
         */
        public Integer getTotalDocs() {
            return this.totalDocs;
        }

        /**
         * @return totalSizeBytes
         */
        public Long getTotalSizeBytes() {
            return this.totalSizeBytes;
        }

        public static final class Builder {
            private Integer bindingAppCount; 
            private String creationTime; 
            private String description; 
            private String knowledgeBaseId; 
            private String knowledgeBaseType; 
            private String knowledgeSpaceId; 
            private String name; 
            private String status; 
            private Integer totalDocs; 
            private Long totalSizeBytes; 

            private Builder() {
            } 

            private Builder(Items model) {
                this.bindingAppCount = model.bindingAppCount;
                this.creationTime = model.creationTime;
                this.description = model.description;
                this.knowledgeBaseId = model.knowledgeBaseId;
                this.knowledgeBaseType = model.knowledgeBaseType;
                this.knowledgeSpaceId = model.knowledgeSpaceId;
                this.name = model.name;
                this.status = model.status;
                this.totalDocs = model.totalDocs;
                this.totalSizeBytes = model.totalSizeBytes;
            } 

            /**
             * <p>The number of AI applications bound to the knowledge base.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder bindingAppCount(Integer bindingAppCount) {
                this.bindingAppCount = bindingAppCount;
                return this;
            }

            /**
             * <p>The creation time.</p>
             * 
             * <strong>example:</strong>
             * <p>2025-03-25T09:37:10Z</p>
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * <p>The description of the knowledge base.</p>
             * 
             * <strong>example:</strong>
             * <p>testDesc</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The unique identifier of the knowledge base.</p>
             * 
             * <strong>example:</strong>
             * <p>pkb-xxxxxx</p>
             */
            public Builder knowledgeBaseId(String knowledgeBaseId) {
                this.knowledgeBaseId = knowledgeBaseId;
                return this;
            }

            /**
             * <p>The type of the knowledge base. Valid values:</p>
             * <ul>
             * <li>PUBLIC: public.</li>
             * <li>PERSONAL: personal.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>PUBLIC</p>
             */
            public Builder knowledgeBaseType(String knowledgeBaseType) {
                this.knowledgeBaseType = knowledgeBaseType;
                return this;
            }

            /**
             * <p>The ID of the knowledge space.</p>
             * 
             * <strong>example:</strong>
             * <p>pks-xxxxxx</p>
             */
            public Builder knowledgeSpaceId(String knowledgeSpaceId) {
                this.knowledgeSpaceId = knowledgeSpaceId;
                return this;
            }

            /**
             * <p>The name of the knowledge base.</p>
             * 
             * <strong>example:</strong>
             * <p>testName</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The status of the knowledge base.</p>
             * 
             * <strong>example:</strong>
             * <p>Activation</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The total number of documents.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder totalDocs(Integer totalDocs) {
                this.totalDocs = totalDocs;
                return this;
            }

            /**
             * <p>The total size in bytes.</p>
             * 
             * <strong>example:</strong>
             * <p>231984</p>
             */
            public Builder totalSizeBytes(Long totalSizeBytes) {
                this.totalSizeBytes = totalSizeBytes;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
}
