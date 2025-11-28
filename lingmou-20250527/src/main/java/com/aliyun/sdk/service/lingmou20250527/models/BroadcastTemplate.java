// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.lingmou20250527.models;

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
 * {@link BroadcastTemplate} extends {@link TeaModel}
 *
 * <p>BroadcastTemplate</p>
 */
public class BroadcastTemplate extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("createTime")
    private String createTime;

    @com.aliyun.core.annotation.NameInMap("id")
    private String id;

    @com.aliyun.core.annotation.NameInMap("modifiedTime")
    private String modifiedTime;

    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("variables")
    private java.util.List<TemplateVariable> variables;

    private BroadcastTemplate(Builder builder) {
        this.createTime = builder.createTime;
        this.id = builder.id;
        this.modifiedTime = builder.modifiedTime;
        this.name = builder.name;
        this.variables = builder.variables;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BroadcastTemplate create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return createTime
     */
    public String getCreateTime() {
        return this.createTime;
    }

    /**
     * @return id
     */
    public String getId() {
        return this.id;
    }

    /**
     * @return modifiedTime
     */
    public String getModifiedTime() {
        return this.modifiedTime;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return variables
     */
    public java.util.List<TemplateVariable> getVariables() {
        return this.variables;
    }

    public static final class Builder {
        private String createTime; 
        private String id; 
        private String modifiedTime; 
        private String name; 
        private java.util.List<TemplateVariable> variables; 

        private Builder() {
        } 

        private Builder(BroadcastTemplate model) {
            this.createTime = model.createTime;
            this.id = model.id;
            this.modifiedTime = model.modifiedTime;
            this.name = model.name;
            this.variables = model.variables;
        } 

        /**
         * createTime.
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
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
         * modifiedTime.
         */
        public Builder modifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
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
         * variables.
         */
        public Builder variables(java.util.List<TemplateVariable> variables) {
            this.variables = variables;
            return this;
        }

        public BroadcastTemplate build() {
            return new BroadcastTemplate(this);
        } 

    } 

}
