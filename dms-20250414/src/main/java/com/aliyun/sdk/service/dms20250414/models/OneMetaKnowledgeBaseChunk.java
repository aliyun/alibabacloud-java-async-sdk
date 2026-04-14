// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms20250414.models;

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
 * {@link OneMetaKnowledgeBaseChunk} extends {@link TeaModel}
 *
 * <p>OneMetaKnowledgeBaseChunk</p>
 */
public class OneMetaKnowledgeBaseChunk extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ChunkMtime")
    private String chunkMtime;

    @com.aliyun.core.annotation.NameInMap("ChunkTitle")
    private String chunkTitle;

    @com.aliyun.core.annotation.NameInMap("Content")
    private String content;

    @com.aliyun.core.annotation.NameInMap("DocName")
    private String docName;

    @com.aliyun.core.annotation.NameInMap("Id")
    private String id;

    private OneMetaKnowledgeBaseChunk(Builder builder) {
        this.chunkMtime = builder.chunkMtime;
        this.chunkTitle = builder.chunkTitle;
        this.content = builder.content;
        this.docName = builder.docName;
        this.id = builder.id;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static OneMetaKnowledgeBaseChunk create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return chunkMtime
     */
    public String getChunkMtime() {
        return this.chunkMtime;
    }

    /**
     * @return chunkTitle
     */
    public String getChunkTitle() {
        return this.chunkTitle;
    }

    /**
     * @return content
     */
    public String getContent() {
        return this.content;
    }

    /**
     * @return docName
     */
    public String getDocName() {
        return this.docName;
    }

    /**
     * @return id
     */
    public String getId() {
        return this.id;
    }

    public static final class Builder {
        private String chunkMtime; 
        private String chunkTitle; 
        private String content; 
        private String docName; 
        private String id; 

        private Builder() {
        } 

        private Builder(OneMetaKnowledgeBaseChunk model) {
            this.chunkMtime = model.chunkMtime;
            this.chunkTitle = model.chunkTitle;
            this.content = model.content;
            this.docName = model.docName;
            this.id = model.id;
        } 

        /**
         * ChunkMtime.
         */
        public Builder chunkMtime(String chunkMtime) {
            this.chunkMtime = chunkMtime;
            return this;
        }

        /**
         * ChunkTitle.
         */
        public Builder chunkTitle(String chunkTitle) {
            this.chunkTitle = chunkTitle;
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
         * DocName.
         */
        public Builder docName(String docName) {
            this.docName = docName;
            return this;
        }

        /**
         * Id.
         */
        public Builder id(String id) {
            this.id = id;
            return this;
        }

        public OneMetaKnowledgeBaseChunk build() {
            return new OneMetaKnowledgeBaseChunk(this);
        } 

    } 

}
