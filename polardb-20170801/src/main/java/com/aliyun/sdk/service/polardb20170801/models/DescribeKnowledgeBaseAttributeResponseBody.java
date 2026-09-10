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
 * {@link DescribeKnowledgeBaseAttributeResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeKnowledgeBaseAttributeResponseBody</p>
 */
public class DescribeKnowledgeBaseAttributeResponseBody extends TeaModel {
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

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SearchMode")
    private String searchMode;

    @com.aliyun.core.annotation.NameInMap("ShardCount")
    private Integer shardCount;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("TotalDocs")
    private Integer totalDocs;

    @com.aliyun.core.annotation.NameInMap("TotalSizeBytes")
    private Long totalSizeBytes;

    private DescribeKnowledgeBaseAttributeResponseBody(Builder builder) {
        this.bindingAppCount = builder.bindingAppCount;
        this.creationTime = builder.creationTime;
        this.description = builder.description;
        this.knowledgeBaseId = builder.knowledgeBaseId;
        this.knowledgeBaseType = builder.knowledgeBaseType;
        this.knowledgeSpaceId = builder.knowledgeSpaceId;
        this.name = builder.name;
        this.requestId = builder.requestId;
        this.searchMode = builder.searchMode;
        this.shardCount = builder.shardCount;
        this.status = builder.status;
        this.totalDocs = builder.totalDocs;
        this.totalSizeBytes = builder.totalSizeBytes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeKnowledgeBaseAttributeResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return searchMode
     */
    public String getSearchMode() {
        return this.searchMode;
    }

    /**
     * @return shardCount
     */
    public Integer getShardCount() {
        return this.shardCount;
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
        private String requestId; 
        private String searchMode; 
        private Integer shardCount; 
        private String status; 
        private Integer totalDocs; 
        private Long totalSizeBytes; 

        private Builder() {
        } 

        private Builder(DescribeKnowledgeBaseAttributeResponseBody model) {
            this.bindingAppCount = model.bindingAppCount;
            this.creationTime = model.creationTime;
            this.description = model.description;
            this.knowledgeBaseId = model.knowledgeBaseId;
            this.knowledgeBaseType = model.knowledgeBaseType;
            this.knowledgeSpaceId = model.knowledgeSpaceId;
            this.name = model.name;
            this.requestId = model.requestId;
            this.searchMode = model.searchMode;
            this.shardCount = model.shardCount;
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
         * <p>2020-08-14T05:58:42Z</p>
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
         * <p>pkb-xxxxx</p>
         */
        public Builder knowledgeBaseId(String knowledgeBaseId) {
            this.knowledgeBaseId = knowledgeBaseId;
            return this;
        }

        /**
         * <p>The type of the knowledge base. Valid values:</p>
         * <ul>
         * <li>PUBLIC</li>
         * <li>PERSONAL</li>
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
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>E56531A4-E552-40BA-9C58-137B80******</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The search mode. Valid values:</p>
         * <ul>
         * <li>balanced (default)</li>
         * <li>precise</li>
         * <li>semantic</li>
         * <li>knn</li>
         * <li>rrf</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>balanced</p>
         */
        public Builder searchMode(String searchMode) {
            this.searchMode = searchMode;
            return this;
        }

        /**
         * <p>The number of shards.</p>
         * 
         * <strong>example:</strong>
         * <p>15</p>
         */
        public Builder shardCount(Integer shardCount) {
            this.shardCount = shardCount;
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
         * <p>318881</p>
         */
        public Builder totalSizeBytes(Long totalSizeBytes) {
            this.totalSizeBytes = totalSizeBytes;
            return this;
        }

        public DescribeKnowledgeBaseAttributeResponseBody build() {
            return new DescribeKnowledgeBaseAttributeResponseBody(this);
        } 

    } 

}
