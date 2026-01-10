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
 * {@link PathConfig} extends {@link TeaModel}
 *
 * <p>PathConfig</p>
 */
public class PathConfig extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("agentRuntimeEndpointName")
    private String agentRuntimeEndpointName;

    @com.aliyun.core.annotation.NameInMap("methods")
    private java.util.List<String> methods;

    @com.aliyun.core.annotation.NameInMap("path")
    private String path;

    @com.aliyun.core.annotation.NameInMap("resourceName")
    private String resourceName;

    @com.aliyun.core.annotation.NameInMap("resourceType")
    private String resourceType;

    private PathConfig(Builder builder) {
        this.agentRuntimeEndpointName = builder.agentRuntimeEndpointName;
        this.methods = builder.methods;
        this.path = builder.path;
        this.resourceName = builder.resourceName;
        this.resourceType = builder.resourceType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PathConfig create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return agentRuntimeEndpointName
     */
    public String getAgentRuntimeEndpointName() {
        return this.agentRuntimeEndpointName;
    }

    /**
     * @return methods
     */
    public java.util.List<String> getMethods() {
        return this.methods;
    }

    /**
     * @return path
     */
    public String getPath() {
        return this.path;
    }

    /**
     * @return resourceName
     */
    public String getResourceName() {
        return this.resourceName;
    }

    /**
     * @return resourceType
     */
    public String getResourceType() {
        return this.resourceType;
    }

    public static final class Builder {
        private String agentRuntimeEndpointName; 
        private java.util.List<String> methods; 
        private String path; 
        private String resourceName; 
        private String resourceType; 

        private Builder() {
        } 

        private Builder(PathConfig model) {
            this.agentRuntimeEndpointName = model.agentRuntimeEndpointName;
            this.methods = model.methods;
            this.path = model.path;
            this.resourceName = model.resourceName;
            this.resourceType = model.resourceType;
        } 

        /**
         * <p>agent runtime 版本（仅当 resourceType 为 runtime 时有效）</p>
         */
        public Builder agentRuntimeEndpointName(String agentRuntimeEndpointName) {
            this.agentRuntimeEndpointName = agentRuntimeEndpointName;
            return this;
        }

        /**
         * <p>支持的方法有：HEAD, GET, POST, PUT, DELETE, PATCH, OPTIONS</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;GET&quot;]</p>
         */
        public Builder methods(java.util.List<String> methods) {
            this.methods = methods;
            return this;
        }

        /**
         * <p>此条路由规则对应的请求路径。</p>
         * 
         * <strong>example:</strong>
         * <p>/login</p>
         */
        public Builder path(String path) {
            this.path = path;
            return this;
        }

        /**
         * <p>资源名称</p>
         */
        public Builder resourceName(String resourceName) {
            this.resourceName = resourceName;
            return this;
        }

        /**
         * <p>资源类型（和凭证关联资源类型一致）</p>
         * 
         * <strong>example:</strong>
         * <p>runtime</p>
         */
        public Builder resourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }

        public PathConfig build() {
            return new PathConfig(this);
        } 

    } 

}
