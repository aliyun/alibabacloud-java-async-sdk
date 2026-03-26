// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agentrun20250910.models;

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
 * {@link BoundTool} extends {@link TeaModel}
 *
 * <p>BoundTool</p>
 */
public class BoundTool extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("method")
    private String method;

    @com.aliyun.core.annotation.NameInMap("path")
    private String path;

    @com.aliyun.core.annotation.NameInMap("toolName")
    private String toolName;

    private BoundTool(Builder builder) {
        this.method = builder.method;
        this.path = builder.path;
        this.toolName = builder.toolName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BoundTool create() {
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
     * @return toolName
     */
    public String getToolName() {
        return this.toolName;
    }

    public static final class Builder {
        private String method; 
        private String path; 
        private String toolName; 

        private Builder() {
        } 

        private Builder(BoundTool model) {
            this.method = model.method;
            this.path = model.path;
            this.toolName = model.toolName;
        } 

        /**
         * <p>绑定的 HTTP 请求方法，支持：GET、PUT、POST、PATCH、DELETE、OPTIONS</p>
         * 
         * <strong>example:</strong>
         * <p>POST</p>
         */
        public Builder method(String method) {
            this.method = method;
            return this;
        }

        /**
         * <p>绑定的 URL 路径，用于路由匹配</p>
         * 
         * <strong>example:</strong>
         * <p>/api/v1/tools</p>
         */
        public Builder path(String path) {
            this.path = path;
            return this;
        }

        /**
         * <p>要绑定的工具名称</p>
         * 
         * <strong>example:</strong>
         * <p>my-tool</p>
         */
        public Builder toolName(String toolName) {
            this.toolName = toolName;
            return this;
        }

        public BoundTool build() {
            return new BoundTool(this);
        } 

    } 

}
