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
 * {@link ListPodRiskResponseBody} extends {@link TeaModel}
 *
 * <p>ListPodRiskResponseBody</p>
 */
public class ListPodRiskResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PageInfo")
    private PageInfo pageInfo;

    @com.aliyun.core.annotation.NameInMap("PodRiskList")
    private java.util.List<PodRiskList> podRiskList;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListPodRiskResponseBody(Builder builder) {
        this.pageInfo = builder.pageInfo;
        this.podRiskList = builder.podRiskList;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListPodRiskResponseBody create() {
        return builder().build();
    }

    /**
     * @return pageInfo
     */
    public PageInfo getPageInfo() {
        return this.pageInfo;
    }

    /**
     * @return podRiskList
     */
    public java.util.List<PodRiskList> getPodRiskList() {
        return this.podRiskList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private PageInfo pageInfo; 
        private java.util.List<PodRiskList> podRiskList; 
        private String requestId; 

        /**
         * <p>The pagination information.</p>
         */
        public Builder pageInfo(PageInfo pageInfo) {
            this.pageInfo = pageInfo;
            return this;
        }

        /**
         * <p>An array that consists of the risks.</p>
         */
        public Builder podRiskList(java.util.List<PodRiskList> podRiskList) {
            this.podRiskList = podRiskList;
            return this;
        }

        /**
         * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>94254AD7-5026-5847-833B-403C2326BD6E</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListPodRiskResponseBody build() {
            return new ListPodRiskResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListPodRiskResponseBody} extends {@link TeaModel}
     *
     * <p>ListPodRiskResponseBody</p>
     */
    public static class PageInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Count")
        private Integer count;

        @com.aliyun.core.annotation.NameInMap("CurrentPage")
        private Integer currentPage;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Integer totalCount;

        private PageInfo(Builder builder) {
            this.count = builder.count;
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
         * @return count
         */
        public Integer getCount() {
            return this.count;
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
            private Integer count; 
            private Integer currentPage; 
            private Integer pageSize; 
            private Integer totalCount; 

            /**
             * <p>The number of entries returned on the current page.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder count(Integer count) {
                this.count = count;
                return this;
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
             * <p>2-</p>
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * <p>The total number of entries returned.</p>
             * 
             * <strong>example:</strong>
             * <p>29</p>
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
     * {@link ListPodRiskResponseBody} extends {@link TeaModel}
     *
     * <p>ListPodRiskResponseBody</p>
     */
    public static class PodRiskList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AlarmCount")
        private Integer alarmCount;

        @com.aliyun.core.annotation.NameInMap("ClusterId")
        private String clusterId;

        @com.aliyun.core.annotation.NameInMap("ClusterName")
        private String clusterName;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private Long createTime;

        @com.aliyun.core.annotation.NameInMap("HcCount")
        private Integer hcCount;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("Namespace")
        private String namespace;

        @com.aliyun.core.annotation.NameInMap("NodeName")
        private String nodeName;

        @com.aliyun.core.annotation.NameInMap("Pod")
        private String pod;

        @com.aliyun.core.annotation.NameInMap("PodIp")
        private String podIp;

        @com.aliyun.core.annotation.NameInMap("VulCount")
        private Integer vulCount;

        private PodRiskList(Builder builder) {
            this.alarmCount = builder.alarmCount;
            this.clusterId = builder.clusterId;
            this.clusterName = builder.clusterName;
            this.createTime = builder.createTime;
            this.hcCount = builder.hcCount;
            this.instanceId = builder.instanceId;
            this.namespace = builder.namespace;
            this.nodeName = builder.nodeName;
            this.pod = builder.pod;
            this.podIp = builder.podIp;
            this.vulCount = builder.vulCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PodRiskList create() {
            return builder().build();
        }

        /**
         * @return alarmCount
         */
        public Integer getAlarmCount() {
            return this.alarmCount;
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
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return hcCount
         */
        public Integer getHcCount() {
            return this.hcCount;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return namespace
         */
        public String getNamespace() {
            return this.namespace;
        }

        /**
         * @return nodeName
         */
        public String getNodeName() {
            return this.nodeName;
        }

        /**
         * @return pod
         */
        public String getPod() {
            return this.pod;
        }

        /**
         * @return podIp
         */
        public String getPodIp() {
            return this.podIp;
        }

        /**
         * @return vulCount
         */
        public Integer getVulCount() {
            return this.vulCount;
        }

        public static final class Builder {
            private Integer alarmCount; 
            private String clusterId; 
            private String clusterName; 
            private Long createTime; 
            private Integer hcCount; 
            private String instanceId; 
            private String namespace; 
            private String nodeName; 
            private String pod; 
            private String podIp; 
            private Integer vulCount; 

            /**
             * <p>The number of alerts that are generated for the pod.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder alarmCount(Integer alarmCount) {
                this.alarmCount = alarmCount;
                return this;
            }

            /**
             * <p>The ID of the container cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>c1d903a628af043659a043af59d89****</p>
             */
            public Builder clusterId(String clusterId) {
                this.clusterId = clusterId;
                return this;
            }

            /**
             * <p>The name of the cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>test66</p>
             */
            public Builder clusterName(String clusterName) {
                this.clusterName = clusterName;
                return this;
            }

            /**
             * <p>The timestamp that indicates the time when the pod was created. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1644283112720</p>
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The number of baseline risk items that are detected in the pod.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder hcCount(Integer hcCount) {
                this.hcCount = hcCount;
                return this;
            }

            /**
             * <p>The instance ID of the node.</p>
             * 
             * <strong>example:</strong>
             * <p>i-7yvdq597****</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The namespace of the Kubernetes cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>kube-system</p>
             */
            public Builder namespace(String namespace) {
                this.namespace = namespace;
                return this;
            }

            /**
             * <p>The name of the node.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder nodeName(String nodeName) {
                this.nodeName = nodeName;
                return this;
            }

            /**
             * <p>The name of the pod.</p>
             * 
             * <strong>example:</strong>
             * <p>expoit-xxx-b****</p>
             */
            public Builder pod(String pod) {
                this.pod = pod;
                return this;
            }

            /**
             * <p>The IP address of the pod.</p>
             * 
             * <strong>example:</strong>
             * <p>172.0.XXX.XXX</p>
             */
            public Builder podIp(String podIp) {
                this.podIp = podIp;
                return this;
            }

            /**
             * <p>The number of vulnerabilities that are detected in the pod.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder vulCount(Integer vulCount) {
                this.vulCount = vulCount;
                return this;
            }

            public PodRiskList build() {
                return new PodRiskList(this);
            } 

        } 

    }
}
