// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agentloop20260520.models;

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
 * {@link GetAgentSpaceResponseBody} extends {@link TeaModel}
 *
 * <p>GetAgentSpaceResponseBody</p>
 */
public class GetAgentSpaceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("agentSpace")
    private String agentSpace;

    @com.aliyun.core.annotation.NameInMap("cmsWorkspace")
    private String cmsWorkspace;

    @com.aliyun.core.annotation.NameInMap("cmsWorkspaceBindType")
    private String cmsWorkspaceBindType;

    @com.aliyun.core.annotation.NameInMap("createTime")
    private String createTime;

    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("mseNamespace")
    private MseNamespace mseNamespace;

    @com.aliyun.core.annotation.NameInMap("regionId")
    private String regionId;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("slsProject")
    private String slsProject;

    @com.aliyun.core.annotation.NameInMap("updateTime")
    private String updateTime;

    private GetAgentSpaceResponseBody(Builder builder) {
        this.agentSpace = builder.agentSpace;
        this.cmsWorkspace = builder.cmsWorkspace;
        this.cmsWorkspaceBindType = builder.cmsWorkspaceBindType;
        this.createTime = builder.createTime;
        this.description = builder.description;
        this.mseNamespace = builder.mseNamespace;
        this.regionId = builder.regionId;
        this.requestId = builder.requestId;
        this.slsProject = builder.slsProject;
        this.updateTime = builder.updateTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAgentSpaceResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return agentSpace
     */
    public String getAgentSpace() {
        return this.agentSpace;
    }

    /**
     * @return cmsWorkspace
     */
    public String getCmsWorkspace() {
        return this.cmsWorkspace;
    }

    /**
     * @return cmsWorkspaceBindType
     */
    public String getCmsWorkspaceBindType() {
        return this.cmsWorkspaceBindType;
    }

    /**
     * @return createTime
     */
    public String getCreateTime() {
        return this.createTime;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return mseNamespace
     */
    public MseNamespace getMseNamespace() {
        return this.mseNamespace;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return slsProject
     */
    public String getSlsProject() {
        return this.slsProject;
    }

    /**
     * @return updateTime
     */
    public String getUpdateTime() {
        return this.updateTime;
    }

    public static final class Builder {
        private String agentSpace; 
        private String cmsWorkspace; 
        private String cmsWorkspaceBindType; 
        private String createTime; 
        private String description; 
        private MseNamespace mseNamespace; 
        private String regionId; 
        private String requestId; 
        private String slsProject; 
        private String updateTime; 

        private Builder() {
        } 

        private Builder(GetAgentSpaceResponseBody model) {
            this.agentSpace = model.agentSpace;
            this.cmsWorkspace = model.cmsWorkspace;
            this.cmsWorkspaceBindType = model.cmsWorkspaceBindType;
            this.createTime = model.createTime;
            this.description = model.description;
            this.mseNamespace = model.mseNamespace;
            this.regionId = model.regionId;
            this.requestId = model.requestId;
            this.slsProject = model.slsProject;
            this.updateTime = model.updateTime;
        } 

        /**
         * agentSpace.
         */
        public Builder agentSpace(String agentSpace) {
            this.agentSpace = agentSpace;
            return this;
        }

        /**
         * cmsWorkspace.
         */
        public Builder cmsWorkspace(String cmsWorkspace) {
            this.cmsWorkspace = cmsWorkspace;
            return this;
        }

        /**
         * cmsWorkspaceBindType.
         */
        public Builder cmsWorkspaceBindType(String cmsWorkspaceBindType) {
            this.cmsWorkspaceBindType = cmsWorkspaceBindType;
            return this;
        }

        /**
         * <p>Use the UTC time format: yyyy-MM-ddTHH:mm:ssZ</p>
         * 
         * <strong>example:</strong>
         * <p>2026-05-05T12:39:36Z</p>
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
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
         * mseNamespace.
         */
        public Builder mseNamespace(MseNamespace mseNamespace) {
            this.mseNamespace = mseNamespace;
            return this;
        }

        /**
         * regionId.
         */
        public Builder regionId(String regionId) {
            this.regionId = regionId;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * slsProject.
         */
        public Builder slsProject(String slsProject) {
            this.slsProject = slsProject;
            return this;
        }

        /**
         * <p>Use the UTC time format: yyyy-MM-ddTHH:mm:ssZ</p>
         * 
         * <strong>example:</strong>
         * <p>2025-10-20T02:28:14Z</p>
         */
        public Builder updateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }

        public GetAgentSpaceResponseBody build() {
            return new GetAgentSpaceResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetAgentSpaceResponseBody} extends {@link TeaModel}
     *
     * <p>GetAgentSpaceResponseBody</p>
     */
    public static class MseNamespace extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("namespaceId")
        private String namespaceId;

        @com.aliyun.core.annotation.NameInMap("namespaceName")
        private String namespaceName;

        private MseNamespace(Builder builder) {
            this.namespaceId = builder.namespaceId;
            this.namespaceName = builder.namespaceName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MseNamespace create() {
            return builder().build();
        }

        /**
         * @return namespaceId
         */
        public String getNamespaceId() {
            return this.namespaceId;
        }

        /**
         * @return namespaceName
         */
        public String getNamespaceName() {
            return this.namespaceName;
        }

        public static final class Builder {
            private String namespaceId; 
            private String namespaceName; 

            private Builder() {
            } 

            private Builder(MseNamespace model) {
                this.namespaceId = model.namespaceId;
                this.namespaceName = model.namespaceName;
            } 

            /**
             * namespaceId.
             */
            public Builder namespaceId(String namespaceId) {
                this.namespaceId = namespaceId;
                return this;
            }

            /**
             * namespaceName.
             */
            public Builder namespaceName(String namespaceName) {
                this.namespaceName = namespaceName;
                return this;
            }

            public MseNamespace build() {
                return new MseNamespace(this);
            } 

        } 

    }
}
