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
 * {@link FunctionDefinition} extends {@link TeaModel}
 *
 * <p>FunctionDefinition</p>
 */
public class FunctionDefinition extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("className")
    private String className;

    @com.aliyun.core.annotation.NameInMap("definition")
    private String definition;

    @com.aliyun.core.annotation.NameInMap("fileResources")
    private java.util.List<FunctionFileResource> fileResources;

    @com.aliyun.core.annotation.NameInMap("functionName")
    private String functionName;

    @com.aliyun.core.annotation.NameInMap("language")
    private String language;

    @com.aliyun.core.annotation.NameInMap("type")
    private String type;

    private FunctionDefinition(Builder builder) {
        this.className = builder.className;
        this.definition = builder.definition;
        this.fileResources = builder.fileResources;
        this.functionName = builder.functionName;
        this.language = builder.language;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static FunctionDefinition create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return className
     */
    public String getClassName() {
        return this.className;
    }

    /**
     * @return definition
     */
    public String getDefinition() {
        return this.definition;
    }

    /**
     * @return fileResources
     */
    public java.util.List<FunctionFileResource> getFileResources() {
        return this.fileResources;
    }

    /**
     * @return functionName
     */
    public String getFunctionName() {
        return this.functionName;
    }

    /**
     * @return language
     */
    public String getLanguage() {
        return this.language;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder {
        private String className; 
        private String definition; 
        private java.util.List<FunctionFileResource> fileResources; 
        private String functionName; 
        private String language; 
        private String type; 

        private Builder() {
        } 

        private Builder(FunctionDefinition model) {
            this.className = model.className;
            this.definition = model.definition;
            this.fileResources = model.fileResources;
            this.functionName = model.functionName;
            this.language = model.language;
            this.type = model.type;
        } 

        /**
         * <p>required in FileFunctionDefinition</p>
         */
        public Builder className(String className) {
            this.className = className;
            return this;
        }

        /**
         * <p>required in SQLFunctionDefinition/LambdaFunctionDefinition</p>
         */
        public Builder definition(String definition) {
            this.definition = definition;
            return this;
        }

        /**
         * <p>required in FileFunctionDefinition</p>
         */
        public Builder fileResources(java.util.List<FunctionFileResource> fileResources) {
            this.fileResources = fileResources;
            return this;
        }

        /**
         * <p>required in FileFunctionDefinition</p>
         */
        public Builder functionName(String functionName) {
            this.functionName = functionName;
            return this;
        }

        /**
         * <p>required in LambdaFunctionDefinition/FileFunctionDefinition</p>
         */
        public Builder language(String language) {
            this.language = language;
            return this;
        }

        /**
         * type.
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        public FunctionDefinition build() {
            return new FunctionDefinition(this);
        } 

    } 

}
