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
 * {@link FunctionChange} extends {@link TeaModel}
 *
 * <p>FunctionChange</p>
 */
public class FunctionChange extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("action")
    private String action;

    @com.aliyun.core.annotation.NameInMap("comment")
    private String comment;

    @com.aliyun.core.annotation.NameInMap("definition")
    private FunctionDefinition definition;

    @com.aliyun.core.annotation.NameInMap("key")
    private String key;

    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("value")
    private String value;

    private FunctionChange(Builder builder) {
        this.action = builder.action;
        this.comment = builder.comment;
        this.definition = builder.definition;
        this.key = builder.key;
        this.name = builder.name;
        this.value = builder.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static FunctionChange create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return action
     */
    public String getAction() {
        return this.action;
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
    public FunctionDefinition getDefinition() {
        return this.definition;
    }

    /**
     * @return key
     */
    public String getKey() {
        return this.key;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return value
     */
    public String getValue() {
        return this.value;
    }

    public static final class Builder {
        private String action; 
        private String comment; 
        private FunctionDefinition definition; 
        private String key; 
        private String name; 
        private String value; 

        private Builder() {
        } 

        private Builder(FunctionChange model) {
            this.action = model.action;
            this.comment = model.comment;
            this.definition = model.definition;
            this.key = model.key;
            this.name = model.name;
            this.value = model.value;
        } 

        /**
         * action.
         */
        public Builder action(String action) {
            this.action = action;
            return this;
        }

        /**
         * <p>required in UpdateFunctionComment</p>
         */
        public Builder comment(String comment) {
            this.comment = comment;
            return this;
        }

        /**
         * <p>required in AddDefinition/UpdateDefinition</p>
         */
        public Builder definition(FunctionDefinition definition) {
            this.definition = definition;
            return this;
        }

        /**
         * <p>required in SetFunctionOption/RemoveFunctionOption</p>
         */
        public Builder key(String key) {
            this.key = key;
            return this;
        }

        /**
         * <p>required in AddDefinition/UpdateDefinition/DropDefinition</p>
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * <p>required in SetFunctionOption</p>
         */
        public Builder value(String value) {
            this.value = value;
            return this;
        }

        public FunctionChange build() {
            return new FunctionChange(this);
        } 

    } 

}
