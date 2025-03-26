// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.contactcenterai20240603.models;

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
 * {@link UpdateVocabRequest} extends {@link RequestModel}
 *
 * <p>UpdateVocabRequest</p>
 */
public class UpdateVocabRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("regionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("vocabularyId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String vocabularyId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("wordWeightList")
    private java.util.List<WordWeightList> wordWeightList;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("workspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    private UpdateVocabRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.description = builder.description;
        this.name = builder.name;
        this.vocabularyId = builder.vocabularyId;
        this.wordWeightList = builder.wordWeightList;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateVocabRequest create() {
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
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return vocabularyId
     */
    public String getVocabularyId() {
        return this.vocabularyId;
    }

    /**
     * @return wordWeightList
     */
    public java.util.List<WordWeightList> getWordWeightList() {
        return this.wordWeightList;
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder extends Request.Builder<UpdateVocabRequest, Builder> {
        private String regionId; 
        private String description; 
        private String name; 
        private String vocabularyId; 
        private java.util.List<WordWeightList> wordWeightList; 
        private String workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateVocabRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.description = request.description;
            this.name = request.name;
            this.vocabularyId = request.vocabularyId;
            this.wordWeightList = request.wordWeightList;
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
         * description.
         */
        public Builder description(String description) {
            this.putBodyParameter("description", description);
            this.description = description;
            return this;
        }

        /**
         * name.
         */
        public Builder name(String name) {
            this.putBodyParameter("name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>dsvsv***dsvv</p>
         */
        public Builder vocabularyId(String vocabularyId) {
            this.putBodyParameter("vocabularyId", vocabularyId);
            this.vocabularyId = vocabularyId;
            return this;
        }

        /**
         * wordWeightList.
         */
        public Builder wordWeightList(java.util.List<WordWeightList> wordWeightList) {
            this.putBodyParameter("wordWeightList", wordWeightList);
            this.wordWeightList = wordWeightList;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>llm-jhfr****w8v</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.putBodyParameter("workspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        @Override
        public UpdateVocabRequest build() {
            return new UpdateVocabRequest(this);
        } 

    } 

    /**
     * 
     * {@link UpdateVocabRequest} extends {@link TeaModel}
     *
     * <p>UpdateVocabRequest</p>
     */
    public static class WordWeightList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("weight")
        @com.aliyun.core.annotation.Validation(required = true)
        private Integer weight;

        @com.aliyun.core.annotation.NameInMap("word")
        @com.aliyun.core.annotation.Validation(required = true)
        private String word;

        private WordWeightList(Builder builder) {
            this.weight = builder.weight;
            this.word = builder.word;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static WordWeightList create() {
            return builder().build();
        }

        /**
         * @return weight
         */
        public Integer getWeight() {
            return this.weight;
        }

        /**
         * @return word
         */
        public String getWord() {
            return this.word;
        }

        public static final class Builder {
            private Integer weight; 
            private String word; 

            private Builder() {
            } 

            private Builder(WordWeightList model) {
                this.weight = model.weight;
                this.word = model.word;
            } 

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder weight(Integer weight) {
                this.weight = weight;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             */
            public Builder word(String word) {
                this.word = word;
                return this;
            }

            public WordWeightList build() {
                return new WordWeightList(this);
            } 

        } 

    }
}
