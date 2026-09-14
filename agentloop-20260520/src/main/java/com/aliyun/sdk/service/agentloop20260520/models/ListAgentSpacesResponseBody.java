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
 * {@link ListAgentSpacesResponseBody} extends {@link TeaModel}
 *
 * <p>ListAgentSpacesResponseBody</p>
 */
public class ListAgentSpacesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("agentSpaces")
    private java.util.List<AgentSpaces> agentSpaces;

    @com.aliyun.core.annotation.NameInMap("maxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("nextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("total")
    private Integer total;

    private ListAgentSpacesResponseBody(Builder builder) {
        this.agentSpaces = builder.agentSpaces;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.total = builder.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAgentSpacesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return agentSpaces
     */
    public java.util.List<AgentSpaces> getAgentSpaces() {
        return this.agentSpaces;
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return total
     */
    public Integer getTotal() {
        return this.total;
    }

    public static final class Builder {
        private java.util.List<AgentSpaces> agentSpaces; 
        private Integer maxResults; 
        private String nextToken; 
        private String requestId; 
        private Integer total; 

        private Builder() {
        } 

        private Builder(ListAgentSpacesResponseBody model) {
            this.agentSpaces = model.agentSpaces;
            this.maxResults = model.maxResults;
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
            this.total = model.total;
        } 

        /**
         * <p>The AgentSpaces information.</p>
         */
        public Builder agentSpaces(java.util.List<AgentSpaces> agentSpaces) {
            this.agentSpaces = agentSpaces;
            return this;
        }

        /**
         * <p>The maximum number of results returned.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The pagination token. This parameter is empty if no more pages are available.</p>
         * 
         * <strong>example:</strong>
         * <p>b5754ef15c784abc8696d82790d2985c</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>4E4AC775-2358-5B52-B6FB-171459D7B14B</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries.</p>
         * 
         * <strong>example:</strong>
         * <p>13</p>
         */
        public Builder total(Integer total) {
            this.total = total;
            return this;
        }

        public ListAgentSpacesResponseBody build() {
            return new ListAgentSpacesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListAgentSpacesResponseBody} extends {@link TeaModel}
     *
     * <p>ListAgentSpacesResponseBody</p>
     */
    public static class MseNamespace extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("bindType")
        private String bindType;

        @com.aliyun.core.annotation.NameInMap("namespaceId")
        private String namespaceId;

        @com.aliyun.core.annotation.NameInMap("namespaceName")
        private String namespaceName;

        private MseNamespace(Builder builder) {
            this.bindType = builder.bindType;
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
         * @return bindType
         */
        public String getBindType() {
            return this.bindType;
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
            private String bindType; 
            private String namespaceId; 
            private String namespaceName; 

            private Builder() {
            } 

            private Builder(MseNamespace model) {
                this.bindType = model.bindType;
                this.namespaceId = model.namespaceId;
                this.namespaceName = model.namespaceName;
            } 

            /**
             * bindType.
             */
            public Builder bindType(String bindType) {
                this.bindType = bindType;
                return this;
            }

            /**
             * <p>The MSE namespace ID.</p>
             * 
             * <strong>example:</strong>
             * <p>phoenixcloud-raw-logs</p>
             */
            public Builder namespaceId(String namespaceId) {
                this.namespaceId = namespaceId;
                return this;
            }

            /**
             * <p>The MSE namespace name.</p>
             * 
             * <strong>example:</strong>
             * <p>terraform-alicloud-modules</p>
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
    /**
     * 
     * {@link ListAgentSpacesResponseBody} extends {@link TeaModel}
     *
     * <p>ListAgentSpacesResponseBody</p>
     */
    public static class AgentSpaces extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("agentSpace")
        private String agentSpace;

        @com.aliyun.core.annotation.NameInMap("cmsWorkspace")
        private String cmsWorkspace;

        @com.aliyun.core.annotation.NameInMap("createTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("mseNamespace")
        private MseNamespace mseNamespace;

        @com.aliyun.core.annotation.NameInMap("regionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("slsProject")
        private String slsProject;

        @com.aliyun.core.annotation.NameInMap("updateTime")
        private String updateTime;

        private AgentSpaces(Builder builder) {
            this.agentSpace = builder.agentSpace;
            this.cmsWorkspace = builder.cmsWorkspace;
            this.createTime = builder.createTime;
            this.description = builder.description;
            this.mseNamespace = builder.mseNamespace;
            this.regionId = builder.regionId;
            this.slsProject = builder.slsProject;
            this.updateTime = builder.updateTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AgentSpaces create() {
            return builder().build();
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
            private String createTime; 
            private String description; 
            private MseNamespace mseNamespace; 
            private String regionId; 
            private String slsProject; 
            private String updateTime; 

            private Builder() {
            } 

            private Builder(AgentSpaces model) {
                this.agentSpace = model.agentSpace;
                this.cmsWorkspace = model.cmsWorkspace;
                this.createTime = model.createTime;
                this.description = model.description;
                this.mseNamespace = model.mseNamespace;
                this.regionId = model.regionId;
                this.slsProject = model.slsProject;
                this.updateTime = model.updateTime;
            } 

            /**
             * <p>The AgentSpace name.</p>
             * 
             * <strong>example:</strong>
             * <p>test-agent-space</p>
             */
            public Builder agentSpace(String agentSpace) {
                this.agentSpace = agentSpace;
                return this;
            }

            /**
             * <p>The CMS workspace.</p>
             * 
             * <strong>example:</strong>
             * <p>test-cms-workspace</p>
             */
            public Builder cmsWorkspace(String cmsWorkspace) {
                this.cmsWorkspace = cmsWorkspace;
                return this;
            }

            /**
             * <p>The creation time.</p>
             * <p>Use the UTC time format: yyyy-MM-ddTHH:mm:ssZ</p>
             * 
             * <strong>example:</strong>
             * <p>2023-08-23T04:06:06Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The description.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The MSE namespace.</p>
             */
            public Builder mseNamespace(MseNamespace mseNamespace) {
                this.mseNamespace = mseNamespace;
                return this;
            }

            /**
             * <p>The region ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The Simple Log Service project name.</p>
             * 
             * <strong>example:</strong>
             * <p>default-cms-1152309027070167-cn-beijing</p>
             */
            public Builder slsProject(String slsProject) {
                this.slsProject = slsProject;
                return this;
            }

            /**
             * <p>The update time.</p>
             * <p>Use the UTC time format: yyyy-MM-ddTHH:mm:ssZ</p>
             * 
             * <strong>example:</strong>
             * <p>2026-02-11T08:40:23Z</p>
             */
            public Builder updateTime(String updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            public AgentSpaces build() {
                return new AgentSpaces(this);
            } 

        } 

    }
}
