// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20211201.models;

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
 * {@link SemanticViewModel} extends {@link TeaModel}
 *
 * <p>SemanticViewModel</p>
 */
public class SemanticViewModel extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Comment")
    private String comment;

    @com.aliyun.core.annotation.NameInMap("Definition")
    private String definition;

    @com.aliyun.core.annotation.NameInMap("Score")
    private Double score;

    @com.aliyun.core.annotation.NameInMap("ViewName")
    private String viewName;

    @com.aliyun.core.annotation.NameInMap("ViewSchema")
    private String viewSchema;

    private SemanticViewModel(Builder builder) {
        this.comment = builder.comment;
        this.definition = builder.definition;
        this.score = builder.score;
        this.viewName = builder.viewName;
        this.viewSchema = builder.viewSchema;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SemanticViewModel create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return comment
     */
    public String getComment() {
        return this.comment;
    }

    /**
     * @return definition
     */
    public String getDefinition() {
        return this.definition;
    }

    /**
     * @return score
     */
    public Double getScore() {
        return this.score;
    }

    /**
     * @return viewName
     */
    public String getViewName() {
        return this.viewName;
    }

    /**
     * @return viewSchema
     */
    public String getViewSchema() {
        return this.viewSchema;
    }

    public static final class Builder {
        private String comment; 
        private String definition; 
        private Double score; 
        private String viewName; 
        private String viewSchema; 

        private Builder() {
        } 

        private Builder(SemanticViewModel model) {
            this.comment = model.comment;
            this.definition = model.definition;
            this.score = model.score;
            this.viewName = model.viewName;
            this.viewSchema = model.viewSchema;
        } 

        /**
         * Comment.
         */
        public Builder comment(String comment) {
            this.comment = comment;
            return this;
        }

        /**
         * Definition.
         */
        public Builder definition(String definition) {
            this.definition = definition;
            return this;
        }

        /**
         * Score.
         */
        public Builder score(Double score) {
            this.score = score;
            return this;
        }

        /**
         * ViewName.
         */
        public Builder viewName(String viewName) {
            this.viewName = viewName;
            return this;
        }

        /**
         * ViewSchema.
         */
        public Builder viewSchema(String viewSchema) {
            this.viewSchema = viewSchema;
            return this;
        }

        public SemanticViewModel build() {
            return new SemanticViewModel(this);
        } 

    } 

}
