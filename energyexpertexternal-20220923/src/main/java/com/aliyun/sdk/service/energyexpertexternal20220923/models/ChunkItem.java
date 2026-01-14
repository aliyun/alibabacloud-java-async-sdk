// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.energyexpertexternal20220923.models;

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
 * {@link ChunkItem} extends {@link TeaModel}
 *
 * <p>ChunkItem</p>
 */
public class ChunkItem extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("chunkContent")
    private String chunkContent;

    @com.aliyun.core.annotation.NameInMap("chunkId")
    private String chunkId;

    @com.aliyun.core.annotation.NameInMap("docElsIds")
    private java.util.List<String> docElsIds;

    @com.aliyun.core.annotation.NameInMap("docId")
    private String docId;

    @com.aliyun.core.annotation.NameInMap("docName")
    private String docName;

    @com.aliyun.core.annotation.NameInMap("docUrl")
    private String docUrl;

    @com.aliyun.core.annotation.NameInMap("rerankScore")
    private Float rerankScore;

    @com.aliyun.core.annotation.NameInMap("score")
    private Float score;

    @com.aliyun.core.annotation.NameInMap("weightedScore")
    private Float weightedScore;

    private ChunkItem(Builder builder) {
        this.chunkContent = builder.chunkContent;
        this.chunkId = builder.chunkId;
        this.docElsIds = builder.docElsIds;
        this.docId = builder.docId;
        this.docName = builder.docName;
        this.docUrl = builder.docUrl;
        this.rerankScore = builder.rerankScore;
        this.score = builder.score;
        this.weightedScore = builder.weightedScore;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ChunkItem create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return chunkContent
     */
    public String getChunkContent() {
        return this.chunkContent;
    }

    /**
     * @return chunkId
     */
    public String getChunkId() {
        return this.chunkId;
    }

    /**
     * @return docElsIds
     */
    public java.util.List<String> getDocElsIds() {
        return this.docElsIds;
    }

    /**
     * @return docId
     */
    public String getDocId() {
        return this.docId;
    }

    /**
     * @return docName
     */
    public String getDocName() {
        return this.docName;
    }

    /**
     * @return docUrl
     */
    public String getDocUrl() {
        return this.docUrl;
    }

    /**
     * @return rerankScore
     */
    public Float getRerankScore() {
        return this.rerankScore;
    }

    /**
     * @return score
     */
    public Float getScore() {
        return this.score;
    }

    /**
     * @return weightedScore
     */
    public Float getWeightedScore() {
        return this.weightedScore;
    }

    public static final class Builder {
        private String chunkContent; 
        private String chunkId; 
        private java.util.List<String> docElsIds; 
        private String docId; 
        private String docName; 
        private String docUrl; 
        private Float rerankScore; 
        private Float score; 
        private Float weightedScore; 

        private Builder() {
        } 

        private Builder(ChunkItem model) {
            this.chunkContent = model.chunkContent;
            this.chunkId = model.chunkId;
            this.docElsIds = model.docElsIds;
            this.docId = model.docId;
            this.docName = model.docName;
            this.docUrl = model.docUrl;
            this.rerankScore = model.rerankScore;
            this.score = model.score;
            this.weightedScore = model.weightedScore;
        } 

        /**
         * chunkContent.
         */
        public Builder chunkContent(String chunkContent) {
            this.chunkContent = chunkContent;
            return this;
        }

        /**
         * chunkId.
         */
        public Builder chunkId(String chunkId) {
            this.chunkId = chunkId;
            return this;
        }

        /**
         * docElsIds.
         */
        public Builder docElsIds(java.util.List<String> docElsIds) {
            this.docElsIds = docElsIds;
            return this;
        }

        /**
         * docId.
         */
        public Builder docId(String docId) {
            this.docId = docId;
            return this;
        }

        /**
         * docName.
         */
        public Builder docName(String docName) {
            this.docName = docName;
            return this;
        }

        /**
         * docUrl.
         */
        public Builder docUrl(String docUrl) {
            this.docUrl = docUrl;
            return this;
        }

        /**
         * rerankScore.
         */
        public Builder rerankScore(Float rerankScore) {
            this.rerankScore = rerankScore;
            return this;
        }

        /**
         * score.
         */
        public Builder score(Float score) {
            this.score = score;
            return this;
        }

        /**
         * weightedScore.
         */
        public Builder weightedScore(Float weightedScore) {
            this.weightedScore = weightedScore;
            return this;
        }

        public ChunkItem build() {
            return new ChunkItem(this);
        } 

    } 

}
