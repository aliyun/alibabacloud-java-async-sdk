// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devs20230714.models;

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
 * {@link Tool} extends {@link TeaModel}
 *
 * <p>Tool</p>
 */
public class Tool extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("method")
    private String method;

    @com.aliyun.core.annotation.NameInMap("path")
    private String path;

    @com.aliyun.core.annotation.NameInMap("toolId")
    private String toolId;

    @com.aliyun.core.annotation.NameInMap("toolName")
    private String toolName;

    private Tool(Builder builder) {
        this.method = builder.method;
        this.path = builder.path;
        this.toolId = builder.toolId;
        this.toolName = builder.toolName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Tool create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return method
     */
    public String getMethod() {
        return this.method;
    }

    /**
     * @return path
     */
    public String getPath() {
        return this.path;
    }

    /**
     * @return toolId
     */
    public String getToolId() {
        return this.toolId;
    }

    /**
     * @return toolName
     */
    public String getToolName() {
        return this.toolName;
    }

    public static final class Builder {
        private String method; 
        private String path; 
        private String toolId; 
        private String toolName; 

        private Builder() {
        } 

        private Builder(Tool model) {
            this.method = model.method;
            this.path = model.path;
            this.toolId = model.toolId;
            this.toolName = model.toolName;
        } 

        /**
         * method.
         */
        public Builder method(String method) {
            this.method = method;
            return this;
        }

        /**
         * path.
         */
        public Builder path(String path) {
            this.path = path;
            return this;
        }

        /**
         * toolId.
         */
        public Builder toolId(String toolId) {
            this.toolId = toolId;
            return this;
        }

        /**
         * toolName.
         */
        public Builder toolName(String toolName) {
            this.toolName = toolName;
            return this;
        }

        public Tool build() {
            return new Tool(this);
        } 

    } 

}
