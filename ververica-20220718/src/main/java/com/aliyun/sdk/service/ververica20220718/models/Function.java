// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ververica20220718.models;

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
    @com.aliyun.core.annotation.NameInMap("className")
    @com.aliyun.core.annotation.Validation(required = true)
    private String className;

    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("functionLanguage")
    @com.aliyun.core.annotation.Validation(required = true)
    private String functionLanguage;

    @com.aliyun.core.annotation.NameInMap("functionType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String functionType;

    @com.aliyun.core.annotation.NameInMap("gmtModified")
    private Long gmtModified;

    @com.aliyun.core.annotation.NameInMap("name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    private Function(Builder builder) {
        this.className = builder.className;
        this.description = builder.description;
        this.functionLanguage = builder.functionLanguage;
        this.functionType = builder.functionType;
        this.gmtModified = builder.gmtModified;
        this.name = builder.name;
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
     * @return className
     */
    public String getClassName() {
        return this.className;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return functionLanguage
     */
    public String getFunctionLanguage() {
        return this.functionLanguage;
    }

    /**
     * @return functionType
     */
    public String getFunctionType() {
        return this.functionType;
    }

    /**
     * @return gmtModified
     */
    public Long getGmtModified() {
        return this.gmtModified;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    public static final class Builder {
        private String className; 
        private String description; 
        private String functionLanguage; 
        private String functionType; 
        private Long gmtModified; 
        private String name; 

        private Builder() {
        } 

        private Builder(Function model) {
            this.className = model.className;
            this.description = model.description;
            this.functionLanguage = model.functionLanguage;
            this.functionType = model.functionType;
            this.gmtModified = model.gmtModified;
            this.name = model.name;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder className(String className) {
            this.className = className;
            return this;
        }

        /**
         * description.
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder functionLanguage(String functionLanguage) {
            this.functionLanguage = functionLanguage;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder functionType(String functionType) {
            this.functionType = functionType;
            return this;
        }

        /**
         * gmtModified.
         */
        public Builder gmtModified(Long gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Function build() {
            return new Function(this);
        } 

    } 

}
