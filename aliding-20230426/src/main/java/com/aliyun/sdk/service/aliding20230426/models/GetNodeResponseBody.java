// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aliding20230426.models;

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
 * {@link GetNodeResponseBody} extends {@link TeaModel}
 *
 * <p>GetNodeResponseBody</p>
 */
public class GetNodeResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("node")
    private Node node;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private GetNodeResponseBody(Builder builder) {
        this.node = builder.node;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetNodeResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return node
     */
    public Node getNode() {
        return this.node;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Node node; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetNodeResponseBody model) {
            this.node = model.node;
            this.requestId = model.requestId;
        } 

        /**
         * node.
         */
        public Builder node(Node node) {
            this.node = node;
            return this;
        }

        /**
         * <p>requestId</p>
         * 
         * <strong>example:</strong>
         * <p>0FAAEC9C-C6C8-5C87-AF8E-1195889BBXXX</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetNodeResponseBody build() {
            return new GetNodeResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetNodeResponseBody} extends {@link TeaModel}
     *
     * <p>GetNodeResponseBody</p>
     */
    public static class StatisticalInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("WordCount")
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

            private Builder() {
            } 

            private Builder(StatisticalInfo model) {
                this.wordCount = model.wordCount;
            } 

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
    /**
     * 
     * {@link GetNodeResponseBody} extends {@link TeaModel}
     *
     * <p>GetNodeResponseBody</p>
     */
    public static class Node extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Category")
        private String category;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("CreatorId")
        private String creatorId;

        @com.aliyun.core.annotation.NameInMap("Extension")
        private String extension;

        @com.aliyun.core.annotation.NameInMap("HasChildren")
        private Boolean hasChildren;

        @com.aliyun.core.annotation.NameInMap("ModifiedTime")
        private String modifiedTime;

        @com.aliyun.core.annotation.NameInMap("ModifierId")
        private String modifierId;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("NodeId")
        private String nodeId;

        @com.aliyun.core.annotation.NameInMap("PermissionRole")
        private String permissionRole;

        @com.aliyun.core.annotation.NameInMap("Size")
        private Long size;

        @com.aliyun.core.annotation.NameInMap("StatisticalInfo")
        private StatisticalInfo statisticalInfo;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("Url")
        private String url;

        @com.aliyun.core.annotation.NameInMap("WorkspaceId")
        private String workspaceId;

        private Node(Builder builder) {
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

        public static Node create() {
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

            private Builder() {
            } 

            private Builder(Node model) {
                this.category = model.category;
                this.createTime = model.createTime;
                this.creatorId = model.creatorId;
                this.extension = model.extension;
                this.hasChildren = model.hasChildren;
                this.modifiedTime = model.modifiedTime;
                this.modifierId = model.modifierId;
                this.name = model.name;
                this.nodeId = model.nodeId;
                this.permissionRole = model.permissionRole;
                this.size = model.size;
                this.statisticalInfo = model.statisticalInfo;
                this.type = model.type;
                this.url = model.url;
                this.workspaceId = model.workspaceId;
            } 

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

            public Node build() {
                return new Node(this);
            } 

        } 

    }
}
