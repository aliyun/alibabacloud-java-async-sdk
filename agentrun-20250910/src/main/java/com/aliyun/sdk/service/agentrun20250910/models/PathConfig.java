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

    @com.aliyun.core.annotation.NameInMap("compatibleProtocol")
    private String compatibleProtocol;

    @com.aliyun.core.annotation.NameInMap("flowEndpointName")
    private String flowEndpointName;

    @com.aliyun.core.annotation.NameInMap("methods")
    private java.util.List<String> methods;

    @com.aliyun.core.annotation.NameInMap("path")
    private String path;

    @com.aliyun.core.annotation.NameInMap("removeBasePathOnForward")
    private Boolean removeBasePathOnForward;

    @com.aliyun.core.annotation.NameInMap("resourceName")
    private String resourceName;

    @com.aliyun.core.annotation.NameInMap("resourceType")
    private String resourceType;

    private PathConfig(Builder builder) {
        this.agentRuntimeEndpointName = builder.agentRuntimeEndpointName;
        this.compatibleProtocol = builder.compatibleProtocol;
        this.flowEndpointName = builder.flowEndpointName;
        this.methods = builder.methods;
        this.path = builder.path;
        this.removeBasePathOnForward = builder.removeBasePathOnForward;
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
     * @return compatibleProtocol
     */
    public String getCompatibleProtocol() {
        return this.compatibleProtocol;
    }

    /**
     * @return flowEndpointName
     */
    public String getFlowEndpointName() {
        return this.flowEndpointName;
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
     * @return removeBasePathOnForward
     */
    public Boolean getRemoveBasePathOnForward() {
        return this.removeBasePathOnForward;
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
        private String compatibleProtocol; 
        private String flowEndpointName; 
        private java.util.List<String> methods; 
        private String path; 
        private Boolean removeBasePathOnForward; 
        private String resourceName; 
        private String resourceType; 

        private Builder() {
        } 

        private Builder(PathConfig model) {
            this.agentRuntimeEndpointName = model.agentRuntimeEndpointName;
            this.compatibleProtocol = model.compatibleProtocol;
            this.flowEndpointName = model.flowEndpointName;
            this.methods = model.methods;
            this.path = model.path;
            this.removeBasePathOnForward = model.removeBasePathOnForward;
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
         * <p>兼容协议，指定后端响应格式转换。仅当 resourceType 为 flow 时必填：native 表示 FnF 原生调用；openai、dify-workflow、dify-chatflow 为对应兼容 API。</p>
         * 
         * <strong>example:</strong>
         * <p>native</p>
         */
        public Builder compatibleProtocol(String compatibleProtocol) {
            this.compatibleProtocol = compatibleProtocol;
            return this;
        }

        /**
         * <p>Flow 版本/别名（仅当 resourceType 为 flow 时有效，默认 Default）</p>
         * 
         * <strong>example:</strong>
         * <p>Default</p>
         */
        public Builder flowEndpointName(String flowEndpointName) {
            this.flowEndpointName = flowEndpointName;
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
         * removeBasePathOnForward.
         */
        public Builder removeBasePathOnForward(Boolean removeBasePathOnForward) {
            this.removeBasePathOnForward = removeBasePathOnForward;
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
