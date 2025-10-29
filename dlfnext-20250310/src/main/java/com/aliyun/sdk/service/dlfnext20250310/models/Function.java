// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dlfnext20250310.models;

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
 * {@link Function} extends {@link TeaModel}
 *
 * <p>Function</p>
 */
public class Function extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("comment")
    private String comment;

    @com.aliyun.core.annotation.NameInMap("createdAt")
    private Long createdAt;

    @com.aliyun.core.annotation.NameInMap("createdBy")
    private String createdBy;

    @com.aliyun.core.annotation.NameInMap("definitions")
    private java.util.Map<String, FunctionDefinition> definitions;

    @com.aliyun.core.annotation.NameInMap("deterministic")
    private Boolean deterministic;

    @com.aliyun.core.annotation.NameInMap("id")
    private String id;

    @com.aliyun.core.annotation.NameInMap("inputParams")
    private java.util.List<DataField> inputParams;

    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("options")
    private java.util.Map<String, String> options;

    @com.aliyun.core.annotation.NameInMap("owner")
    private String owner;

    @com.aliyun.core.annotation.NameInMap("returnParams")
    private java.util.List<DataField> returnParams;

    @com.aliyun.core.annotation.NameInMap("updatedAt")
    private Long updatedAt;

    @com.aliyun.core.annotation.NameInMap("updatedBy")
    private String updatedBy;

    private Function(Builder builder) {
        this.comment = builder.comment;
        this.createdAt = builder.createdAt;
        this.createdBy = builder.createdBy;
        this.definitions = builder.definitions;
        this.deterministic = builder.deterministic;
        this.id = builder.id;
        this.inputParams = builder.inputParams;
        this.name = builder.name;
        this.options = builder.options;
        this.owner = builder.owner;
        this.returnParams = builder.returnParams;
        this.updatedAt = builder.updatedAt;
        this.updatedBy = builder.updatedBy;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Function create() {
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
     * @return createdAt
     */
    public Long getCreatedAt() {
        return this.createdAt;
    }

    /**
     * @return createdBy
     */
    public String getCreatedBy() {
        return this.createdBy;
    }

    /**
     * @return definitions
     */
    public java.util.Map<String, FunctionDefinition> getDefinitions() {
        return this.definitions;
    }

    /**
     * @return deterministic
     */
    public Boolean getDeterministic() {
        return this.deterministic;
    }

    /**
     * @return id
     */
    public String getId() {
        return this.id;
    }

    /**
     * @return inputParams
     */
    public java.util.List<DataField> getInputParams() {
        return this.inputParams;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return options
     */
    public java.util.Map<String, String> getOptions() {
        return this.options;
    }

    /**
     * @return owner
     */
    public String getOwner() {
        return this.owner;
    }

    /**
     * @return returnParams
     */
    public java.util.List<DataField> getReturnParams() {
        return this.returnParams;
    }

    /**
     * @return updatedAt
     */
    public Long getUpdatedAt() {
        return this.updatedAt;
    }

    /**
     * @return updatedBy
     */
    public String getUpdatedBy() {
        return this.updatedBy;
    }

    public static final class Builder {
        private String comment; 
        private Long createdAt; 
        private String createdBy; 
        private java.util.Map<String, FunctionDefinition> definitions; 
        private Boolean deterministic; 
        private String id; 
        private java.util.List<DataField> inputParams; 
        private String name; 
        private java.util.Map<String, String> options; 
        private String owner; 
        private java.util.List<DataField> returnParams; 
        private Long updatedAt; 
        private String updatedBy; 

        private Builder() {
        } 

        private Builder(Function model) {
            this.comment = model.comment;
            this.createdAt = model.createdAt;
            this.createdBy = model.createdBy;
            this.definitions = model.definitions;
            this.deterministic = model.deterministic;
            this.id = model.id;
            this.inputParams = model.inputParams;
            this.name = model.name;
            this.options = model.options;
            this.owner = model.owner;
            this.returnParams = model.returnParams;
            this.updatedAt = model.updatedAt;
            this.updatedBy = model.updatedBy;
        } 

        /**
         * comment.
         */
        public Builder comment(String comment) {
            this.comment = comment;
            return this;
        }

        /**
         * createdAt.
         */
        public Builder createdAt(Long createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        /**
         * createdBy.
         */
        public Builder createdBy(String createdBy) {
            this.createdBy = createdBy;
            return this;
        }

        /**
         * definitions.
         */
        public Builder definitions(java.util.Map<String, FunctionDefinition> definitions) {
            this.definitions = definitions;
            return this;
        }

        /**
         * deterministic.
         */
        public Builder deterministic(Boolean deterministic) {
            this.deterministic = deterministic;
            return this;
        }

        /**
         * id.
         */
        public Builder id(String id) {
            this.id = id;
            return this;
        }

        /**
         * inputParams.
         */
        public Builder inputParams(java.util.List<DataField> inputParams) {
            this.inputParams = inputParams;
            return this;
        }

        /**
         * name.
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * options.
         */
        public Builder options(java.util.Map<String, String> options) {
            this.options = options;
            return this;
        }

        /**
         * owner.
         */
        public Builder owner(String owner) {
            this.owner = owner;
            return this;
        }

        /**
         * returnParams.
         */
        public Builder returnParams(java.util.List<DataField> returnParams) {
            this.returnParams = returnParams;
            return this;
        }

        /**
         * updatedAt.
         */
        public Builder updatedAt(Long updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }

        /**
         * updatedBy.
         */
        public Builder updatedBy(String updatedBy) {
            this.updatedBy = updatedBy;
            return this;
        }

        public Function build() {
            return new Function(this);
        } 

    } 

}
