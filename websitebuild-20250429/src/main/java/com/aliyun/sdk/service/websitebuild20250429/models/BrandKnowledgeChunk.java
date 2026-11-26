// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.websitebuild20250429.models;

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
 * {@link BrandKnowledgeChunk} extends {@link TeaModel}
 *
 * <p>BrandKnowledgeChunk</p>
 */
public class BrandKnowledgeChunk extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ChunkId")
    private String chunkId;

    @com.aliyun.core.annotation.NameInMap("Content")
    private String content;

    @com.aliyun.core.annotation.NameInMap("HierarchicalTitle")
    private String hierarchicalTitle;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    private BrandKnowledgeChunk(Builder builder) {
        this.chunkId = builder.chunkId;
        this.content = builder.content;
        this.hierarchicalTitle = builder.hierarchicalTitle;
        this.pageNumber = builder.pageNumber;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BrandKnowledgeChunk create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return chunkId
     */
    public String getChunkId() {
        return this.chunkId;
    }

    /**
     * @return content
     */
    public String getContent() {
        return this.content;
    }

    /**
     * @return hierarchicalTitle
     */
    public String getHierarchicalTitle() {
        return this.hierarchicalTitle;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public static final class Builder {
        private String chunkId; 
        private String content; 
        private String hierarchicalTitle; 
        private Integer pageNumber; 

        private Builder() {
        } 

        private Builder(BrandKnowledgeChunk model) {
            this.chunkId = model.chunkId;
            this.content = model.content;
            this.hierarchicalTitle = model.hierarchicalTitle;
            this.pageNumber = model.pageNumber;
        } 

        /**
         * ChunkId.
         */
        public Builder chunkId(String chunkId) {
            this.chunkId = chunkId;
            return this;
        }

        /**
         * Content.
         */
        public Builder content(String content) {
            this.content = content;
            return this;
        }

        /**
         * HierarchicalTitle.
         */
        public Builder hierarchicalTitle(String hierarchicalTitle) {
            this.hierarchicalTitle = hierarchicalTitle;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        public BrandKnowledgeChunk build() {
            return new BrandKnowledgeChunk(this);
        } 

    } 

}
