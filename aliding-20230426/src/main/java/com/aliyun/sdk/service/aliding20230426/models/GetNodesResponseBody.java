// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aliding20230426.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetNodesResponseBody} extends {@link TeaModel}
 *
 * <p>GetNodesResponseBody</p>
 */
public class GetNodesResponseBody extends TeaModel {
    @NameInMap("nodes")
    private java.util.List < Nodes> nodes;

    @NameInMap("requestId")
    private String requestId;

    private GetNodesResponseBody(Builder builder) {
        this.nodes = builder.nodes;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetNodesResponseBody create() {
        return builder().build();
    }

    /**
     * @return nodes
     */
    public java.util.List < Nodes> getNodes() {
        return this.nodes;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < Nodes> nodes; 
        private String requestId; 

        /**
         * nodes.
         */
        public Builder nodes(java.util.List < Nodes> nodes) {
            this.nodes = nodes;
            return this;
        }

        /**
         * requestId
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetNodesResponseBody build() {
            return new GetNodesResponseBody(this);
        } 

    } 

    public static class StatisticalInfo extends TeaModel {
        @NameInMap("WordCount")
        private Long wordCount;

        private StatisticalInfo(Builder builder) {
            this.wordCount = builder.wordCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static StatisticalInfo create() {
            return builder().build();
        }

        /**
         * @return wordCount
         */
        public Long getWordCount() {
            return this.wordCount;
        }

        public static final class Builder {
            private Long wordCount; 

            /**
             * WordCount.
             */
            public Builder wordCount(Long wordCount) {
                this.wordCount = wordCount;
                return this;
            }

            public StatisticalInfo build() {
                return new StatisticalInfo(this);
            } 

        } 

    }
    public static class Nodes extends TeaModel {
        @NameInMap("Category")
        private String category;

        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("CreatorId")
        private String creatorId;

        @NameInMap("Extension")
        private String extension;

        @NameInMap("HasChildren")
        private Boolean hasChildren;

        @NameInMap("ModifiedTime")
        private String modifiedTime;

        @NameInMap("ModifierId")
        private String modifierId;

        @NameInMap("Name")
        private String name;

        @NameInMap("NodeId")
        private String nodeId;

        @NameInMap("PermissionRole")
        private String permissionRole;

        @NameInMap("Size")
        private Long size;

        @NameInMap("StatisticalInfo")
        private StatisticalInfo statisticalInfo;

        @NameInMap("Type")
        private String type;

        @NameInMap("Url")
        private String url;

        @NameInMap("WorkspaceId")
        private String workspaceId;

        private Nodes(Builder builder) {
            this.category = builder.category;
            this.createTime = builder.createTime;
            this.creatorId = builder.creatorId;
            this.extension = builder.extension;
            this.hasChildren = builder.hasChildren;
            this.modifiedTime = builder.modifiedTime;
            this.modifierId = builder.modifierId;
            this.name = builder.name;
            this.nodeId = builder.nodeId;
            this.permissionRole = builder.permissionRole;
            this.size = builder.size;
            this.statisticalInfo = builder.statisticalInfo;
            this.type = builder.type;
            this.url = builder.url;
            this.workspaceId = builder.workspaceId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Nodes create() {
            return builder().build();
        }

        /**
         * @return category
         */
        public String getCategory() {
            return this.category;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return creatorId
         */
        public String getCreatorId() {
            return this.creatorId;
        }

        /**
         * @return extension
         */
        public String getExtension() {
            return this.extension;
        }

        /**
         * @return hasChildren
         */
        public Boolean getHasChildren() {
            return this.hasChildren;
        }

        /**
         * @return modifiedTime
         */
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        /**
         * @return modifierId
         */
        public String getModifierId() {
            return this.modifierId;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return nodeId
         */
        public String getNodeId() {
            return this.nodeId;
        }

        /**
         * @return permissionRole
         */
        public String getPermissionRole() {
            return this.permissionRole;
        }

        /**
         * @return size
         */
        public Long getSize() {
            return this.size;
        }

        /**
         * @return statisticalInfo
         */
        public StatisticalInfo getStatisticalInfo() {
            return this.statisticalInfo;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return url
         */
        public String getUrl() {
            return this.url;
        }

        /**
         * @return workspaceId
         */
        public String getWorkspaceId() {
            return this.workspaceId;
        }

        public static final class Builder {
            private String category; 
            private String createTime; 
            private String creatorId; 
            private String extension; 
            private Boolean hasChildren; 
            private String modifiedTime; 
            private String modifierId; 
            private String name; 
            private String nodeId; 
            private String permissionRole; 
            private Long size; 
            private StatisticalInfo statisticalInfo; 
            private String type; 
            private String url; 
            private String workspaceId; 

            /**
             * Category.
             */
            public Builder category(String category) {
                this.category = category;
                return this;
            }

            /**
             * CreateTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * CreatorId.
             */
            public Builder creatorId(String creatorId) {
                this.creatorId = creatorId;
                return this;
            }

            /**
             * Extension.
             */
            public Builder extension(String extension) {
                this.extension = extension;
                return this;
            }

            /**
             * HasChildren.
             */
            public Builder hasChildren(Boolean hasChildren) {
                this.hasChildren = hasChildren;
                return this;
            }

            /**
             * ModifiedTime.
             */
            public Builder modifiedTime(String modifiedTime) {
                this.modifiedTime = modifiedTime;
                return this;
            }

            /**
             * ModifierId.
             */
            public Builder modifierId(String modifierId) {
                this.modifierId = modifierId;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * NodeId.
             */
            public Builder nodeId(String nodeId) {
                this.nodeId = nodeId;
                return this;
            }

            /**
             * PermissionRole.
             */
            public Builder permissionRole(String permissionRole) {
                this.permissionRole = permissionRole;
                return this;
            }

            /**
             * Size.
             */
            public Builder size(Long size) {
                this.size = size;
                return this;
            }

            /**
             * StatisticalInfo.
             */
            public Builder statisticalInfo(StatisticalInfo statisticalInfo) {
                this.statisticalInfo = statisticalInfo;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * Url.
             */
            public Builder url(String url) {
                this.url = url;
                return this;
            }

            /**
             * WorkspaceId.
             */
            public Builder workspaceId(String workspaceId) {
                this.workspaceId = workspaceId;
                return this;
            }

            public Nodes build() {
                return new Nodes(this);
            } 

        } 

    }
}
