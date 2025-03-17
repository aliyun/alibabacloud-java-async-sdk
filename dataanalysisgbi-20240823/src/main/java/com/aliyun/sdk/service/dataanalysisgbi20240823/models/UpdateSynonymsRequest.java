// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataanalysisgbi20240823.models;

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
 * {@link UpdateSynonymsRequest} extends {@link RequestModel}
 *
 * <p>UpdateSynonymsRequest</p>
 */
public class UpdateSynonymsRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("regionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("columns")
    private java.util.List<String> columns;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("synonymIdKey")
    @com.aliyun.core.annotation.Validation(required = true)
    private String synonymIdKey;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("word")
    @com.aliyun.core.annotation.Validation(required = true)
    private String word;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("wordSynonyms")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> wordSynonyms;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("workspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    private UpdateSynonymsRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.columns = builder.columns;
        this.synonymIdKey = builder.synonymIdKey;
        this.word = builder.word;
        this.wordSynonyms = builder.wordSynonyms;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateSynonymsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return columns
     */
    public java.util.List<String> getColumns() {
        return this.columns;
    }

    /**
     * @return synonymIdKey
     */
    public String getSynonymIdKey() {
        return this.synonymIdKey;
    }

    /**
     * @return word
     */
    public String getWord() {
        return this.word;
    }

    /**
     * @return wordSynonyms
     */
    public java.util.List<String> getWordSynonyms() {
        return this.wordSynonyms;
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder extends Request.Builder<UpdateSynonymsRequest, Builder> {
        private String regionId; 
        private java.util.List<String> columns; 
        private String synonymIdKey; 
        private String word; 
        private java.util.List<String> wordSynonyms; 
        private String workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateSynonymsRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.columns = request.columns;
            this.synonymIdKey = request.synonymIdKey;
            this.word = request.word;
            this.wordSynonyms = request.wordSynonyms;
            this.workspaceId = request.workspaceId;
        } 

        /**
         * regionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("regionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * columns.
         */
        public Builder columns(java.util.List<String> columns) {
            this.putBodyParameter("columns", columns);
            this.columns = columns;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>synonyms-AAAAAAAAAUpwTTVrwTFJwQ</p>
         */
        public Builder synonymIdKey(String synonymIdKey) {
            this.putBodyParameter("synonymIdKey", synonymIdKey);
            this.synonymIdKey = synonymIdKey;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder word(String word) {
            this.putBodyParameter("word", word);
            this.word = word;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder wordSynonyms(java.util.List<String> wordSynonyms) {
            this.putBodyParameter("wordSynonyms", wordSynonyms);
            this.wordSynonyms = wordSynonyms;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>llm-2v3934xtp49esw64</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.putQueryParameter("workspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        @Override
        public UpdateSynonymsRequest build() {
            return new UpdateSynonymsRequest(this);
        } 

    } 

}
