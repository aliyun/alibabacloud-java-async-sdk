// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link ListInterceptionTargetPageResponseBody} extends {@link TeaModel}
 *
 * <p>ListInterceptionTargetPageResponseBody</p>
 */
public class ListInterceptionTargetPageResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PageInfo")
    private PageInfo pageInfo;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("RuleTargetList")
    private java.util.List<RuleTargetList> ruleTargetList;

    private ListInterceptionTargetPageResponseBody(Builder builder) {
        this.pageInfo = builder.pageInfo;
        this.requestId = builder.requestId;
        this.ruleTargetList = builder.ruleTargetList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListInterceptionTargetPageResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return pageInfo
     */
    public PageInfo getPageInfo() {
        return this.pageInfo;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return ruleTargetList
     */
    public java.util.List<RuleTargetList> getRuleTargetList() {
        return this.ruleTargetList;
    }

    public static final class Builder {
        private PageInfo pageInfo; 
        private String requestId; 
        private java.util.List<RuleTargetList> ruleTargetList; 

        private Builder() {
        } 

        private Builder(ListInterceptionTargetPageResponseBody model) {
            this.pageInfo = model.pageInfo;
            this.requestId = model.requestId;
            this.ruleTargetList = model.ruleTargetList;
        } 

        /**
         * <p>The pagination information.</p>
         */
        public Builder pageInfo(PageInfo pageInfo) {
            this.pageInfo = pageInfo;
            return this;
        }

        /**
         * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>028CF634-5268-5660-9575-48C9ED6B****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>An array that consists of the network objects.</p>
         */
        public Builder ruleTargetList(java.util.List<RuleTargetList> ruleTargetList) {
            this.ruleTargetList = ruleTargetList;
            return this;
        }

        public ListInterceptionTargetPageResponseBody build() {
            return new ListInterceptionTargetPageResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListInterceptionTargetPageResponseBody} extends {@link TeaModel}
     *
     * <p>ListInterceptionTargetPageResponseBody</p>
     */
    public static class PageInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CurrentPage")
        private Integer currentPage;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Integer totalCount;

        private PageInfo(Builder builder) {
            this.currentPage = builder.currentPage;
            this.pageSize = builder.pageSize;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PageInfo create() {
            return builder().build();
        }

        /**
         * @return currentPage
         */
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        /**
         * @return pageSize
         */
        public Integer getPageSize() {
            return this.pageSize;
        }

        /**
         * @return totalCount
         */
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private Integer currentPage; 
            private Integer pageSize; 
            private Integer totalCount; 

            private Builder() {
            } 

            private Builder(PageInfo model) {
                this.currentPage = model.currentPage;
                this.pageSize = model.pageSize;
                this.totalCount = model.totalCount;
            } 

            /**
             * <p>The page number of the returned page.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder currentPage(Integer currentPage) {
                this.currentPage = currentPage;
                return this;
            }

            /**
             * <p>The number of entries returned per page.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * <p>The total number of entries returned.</p>
             * 
             * <strong>example:</strong>
             * <p>45</p>
             */
            public Builder totalCount(Integer totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public PageInfo build() {
                return new PageInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListInterceptionTargetPageResponseBody} extends {@link TeaModel}
     *
     * <p>ListInterceptionTargetPageResponseBody</p>
     */
    public static class RuleTargetList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppName")
        private String appName;

        @com.aliyun.core.annotation.NameInMap("ClusterId")
        private String clusterId;

        @com.aliyun.core.annotation.NameInMap("ClusterName")
        private String clusterName;

        @com.aliyun.core.annotation.NameInMap("ImageList")
        private java.util.List<String> imageList;

        @com.aliyun.core.annotation.NameInMap("Namespace")
        private String namespace;

        @com.aliyun.core.annotation.NameInMap("RuleType")
        private String ruleType;

        @com.aliyun.core.annotation.NameInMap("TagList")
        private java.util.List<String> tagList;

        @com.aliyun.core.annotation.NameInMap("TargetId")
        private Long targetId;

        @com.aliyun.core.annotation.NameInMap("TargetName")
        private String targetName;

        @com.aliyun.core.annotation.NameInMap("TargetType")
        private String targetType;

        private RuleTargetList(Builder builder) {
            this.appName = builder.appName;
            this.clusterId = builder.clusterId;
            this.clusterName = builder.clusterName;
            this.imageList = builder.imageList;
            this.namespace = builder.namespace;
            this.ruleType = builder.ruleType;
            this.tagList = builder.tagList;
            this.targetId = builder.targetId;
            this.targetName = builder.targetName;
            this.targetType = builder.targetType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RuleTargetList create() {
            return builder().build();
        }

        /**
         * @return appName
         */
        public String getAppName() {
            return this.appName;
        }

        /**
         * @return clusterId
         */
        public String getClusterId() {
            return this.clusterId;
        }

        /**
         * @return clusterName
         */
        public String getClusterName() {
            return this.clusterName;
        }

        /**
         * @return imageList
         */
        public java.util.List<String> getImageList() {
            return this.imageList;
        }

        /**
         * @return namespace
         */
        public String getNamespace() {
            return this.namespace;
        }

        /**
         * @return ruleType
         */
        public String getRuleType() {
            return this.ruleType;
        }

        /**
         * @return tagList
         */
        public java.util.List<String> getTagList() {
            return this.tagList;
        }

        /**
         * @return targetId
         */
        public Long getTargetId() {
            return this.targetId;
        }

        /**
         * @return targetName
         */
        public String getTargetName() {
            return this.targetName;
        }

        /**
         * @return targetType
         */
        public String getTargetType() {
            return this.targetType;
        }

        public static final class Builder {
            private String appName; 
            private String clusterId; 
            private String clusterName; 
            private java.util.List<String> imageList; 
            private String namespace; 
            private String ruleType; 
            private java.util.List<String> tagList; 
            private Long targetId; 
            private String targetName; 
            private String targetType; 

            private Builder() {
            } 

            private Builder(RuleTargetList model) {
                this.appName = model.appName;
                this.clusterId = model.clusterId;
                this.clusterName = model.clusterName;
                this.imageList = model.imageList;
                this.namespace = model.namespace;
                this.ruleType = model.ruleType;
                this.tagList = model.tagList;
                this.targetId = model.targetId;
                this.targetName = model.targetName;
                this.targetType = model.targetType;
            } 

            /**
             * <p>The name of the application of the network object.</p>
             * 
             * <strong>example:</strong>
             * <p>frontend</p>
             */
            public Builder appName(String appName) {
                this.appName = appName;
                return this;
            }

            /**
             * <p>The ID of the container cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>c3e2eae03eb064d2ebf940cd5e1b17****</p>
             */
            public Builder clusterId(String clusterId) {
                this.clusterId = clusterId;
                return this;
            }

            /**
             * <p>The name of the container cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>sas-test-cnnf</p>
             */
            public Builder clusterName(String clusterName) {
                this.clusterName = clusterName;
                return this;
            }

            /**
             * <p>The images of the network object.</p>
             */
            public Builder imageList(java.util.List<String> imageList) {
                this.imageList = imageList;
                return this;
            }

            /**
             * <p>The namespace to which the network object belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>default</p>
             */
            public Builder namespace(String namespace) {
                this.namespace = namespace;
                return this;
            }

            /**
             * <p>The type of the rule. Valid value:</p>
             * <ul>
             * <li>customize: custom rule</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>customize</p>
             */
            public Builder ruleType(String ruleType) {
                this.ruleType = ruleType;
                return this;
            }

            /**
             * <p>The tags specified for the network object.</p>
             */
            public Builder tagList(java.util.List<String> tagList) {
                this.tagList = tagList;
                return this;
            }

            /**
             * <p>The ID of the network object.</p>
             * <blockquote>
             * <p>You can call the <a href="~~ListInterceptionTargetPage~~">ListInterceptionTargetPage</a> operation to query the IDs of network objects.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>400914</p>
             */
            public Builder targetId(Long targetId) {
                this.targetId = targetId;
                return this;
            }

            /**
             * <p>The name of the network object.</p>
             * 
             * <strong>example:</strong>
             * <p>destination-test-obj-Na3cF</p>
             */
            public Builder targetName(String targetName) {
                this.targetName = targetName;
                return this;
            }

            /**
             * <p>The type of the network object. Valid value:</p>
             * <ul>
             * <li>IMAGE</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>IMAGE</p>
             */
            public Builder targetType(String targetType) {
                this.targetType = targetType;
                return this;
            }

            public RuleTargetList build() {
                return new RuleTargetList(this);
            } 

        } 

    }
}
