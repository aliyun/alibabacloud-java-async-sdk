// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adbai20250812.models;

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
 * {@link DescribeEmbodiedAIPlatformsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeEmbodiedAIPlatformsResponseBody</p>
 */
public class DescribeEmbodiedAIPlatformsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("Platforms")
    private java.util.List<Platforms> platforms;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private DescribeEmbodiedAIPlatformsResponseBody(Builder builder) {
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.platforms = builder.platforms;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeEmbodiedAIPlatformsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return platforms
     */
    public java.util.List<Platforms> getPlatforms() {
        return this.platforms;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private Integer maxResults; 
        private String nextToken; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private java.util.List<Platforms> platforms; 
        private String requestId; 
        private Long totalCount; 

        private Builder() {
        } 

        private Builder(DescribeEmbodiedAIPlatformsResponseBody model) {
            this.maxResults = model.maxResults;
            this.nextToken = model.nextToken;
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.platforms = model.platforms;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>Use the paged query parameters PageSize, PageNumber, and TotalCount for paging.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>Use the paged query parameters PageSize, PageNumber, and TotalCount for paging.</p>
         * 
         * <strong>example:</strong>
         * <p>9c3158c2e8acf616501bd5ee05******</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The current page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The list of embodied intelligence multimodal data platforms.</p>
         */
        public Builder platforms(java.util.List<Platforms> platforms) {
            this.platforms = platforms;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>B47EED99-BFA5-529D-8D85-A6642421D390</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of platforms.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeEmbodiedAIPlatformsResponseBody build() {
            return new DescribeEmbodiedAIPlatformsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeEmbodiedAIPlatformsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeEmbodiedAIPlatformsResponseBody</p>
     */
    public static class EapConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("WebserverAddress")
        private String webserverAddress;

        @com.aliyun.core.annotation.NameInMap("WebserverSpecName")
        private String webserverSpecName;

        private EapConfig(Builder builder) {
            this.webserverAddress = builder.webserverAddress;
            this.webserverSpecName = builder.webserverSpecName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EapConfig create() {
            return builder().build();
        }

        /**
         * @return webserverAddress
         */
        public String getWebserverAddress() {
            return this.webserverAddress;
        }

        /**
         * @return webserverSpecName
         */
        public String getWebserverSpecName() {
            return this.webserverSpecName;
        }

        public static final class Builder {
            private String webserverAddress; 
            private String webserverSpecName; 

            private Builder() {
            } 

            private Builder(EapConfig model) {
                this.webserverAddress = model.webserverAddress;
                this.webserverSpecName = model.webserverSpecName;
            } 

            /**
             * <p>The public network access address of the platform webserver.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://amv-2z******-***-roboto.ads.example.com:80">http://amv-2z******-***-roboto.ads.example.com:80</a></p>
             */
            public Builder webserverAddress(String webserverAddress) {
                this.webserverAddress = webserverAddress;
                return this;
            }

            /**
             * <p>The webserver specification of the platform.</p>
             * 
             * <strong>example:</strong>
             * <p>large</p>
             */
            public Builder webserverSpecName(String webserverSpecName) {
                this.webserverSpecName = webserverSpecName;
                return this;
            }

            public EapConfig build() {
                return new EapConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeEmbodiedAIPlatformsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeEmbodiedAIPlatformsResponseBody</p>
     */
    public static class WorkerGroups extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AllocateUnit")
        private String allocateUnit;

        @com.aliyun.core.annotation.NameInMap("GroupName")
        private String groupName;

        @com.aliyun.core.annotation.NameInMap("MaxWorkerQuantity")
        private Integer maxWorkerQuantity;

        @com.aliyun.core.annotation.NameInMap("MinWorkerQuantity")
        private Integer minWorkerQuantity;

        @com.aliyun.core.annotation.NameInMap("WorkerDiskCapacity")
        private String workerDiskCapacity;

        @com.aliyun.core.annotation.NameInMap("WorkerSpecName")
        private String workerSpecName;

        @com.aliyun.core.annotation.NameInMap("WorkerSpecType")
        private String workerSpecType;

        private WorkerGroups(Builder builder) {
            this.allocateUnit = builder.allocateUnit;
            this.groupName = builder.groupName;
            this.maxWorkerQuantity = builder.maxWorkerQuantity;
            this.minWorkerQuantity = builder.minWorkerQuantity;
            this.workerDiskCapacity = builder.workerDiskCapacity;
            this.workerSpecName = builder.workerSpecName;
            this.workerSpecType = builder.workerSpecType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static WorkerGroups create() {
            return builder().build();
        }

        /**
         * @return allocateUnit
         */
        public String getAllocateUnit() {
            return this.allocateUnit;
        }

        /**
         * @return groupName
         */
        public String getGroupName() {
            return this.groupName;
        }

        /**
         * @return maxWorkerQuantity
         */
        public Integer getMaxWorkerQuantity() {
            return this.maxWorkerQuantity;
        }

        /**
         * @return minWorkerQuantity
         */
        public Integer getMinWorkerQuantity() {
            return this.minWorkerQuantity;
        }

        /**
         * @return workerDiskCapacity
         */
        public String getWorkerDiskCapacity() {
            return this.workerDiskCapacity;
        }

        /**
         * @return workerSpecName
         */
        public String getWorkerSpecName() {
            return this.workerSpecName;
        }

        /**
         * @return workerSpecType
         */
        public String getWorkerSpecType() {
            return this.workerSpecType;
        }

        public static final class Builder {
            private String allocateUnit; 
            private String groupName; 
            private Integer maxWorkerQuantity; 
            private Integer minWorkerQuantity; 
            private String workerDiskCapacity; 
            private String workerSpecName; 
            private String workerSpecType; 

            private Builder() {
            } 

            private Builder(WorkerGroups model) {
                this.allocateUnit = model.allocateUnit;
                this.groupName = model.groupName;
                this.maxWorkerQuantity = model.maxWorkerQuantity;
                this.minWorkerQuantity = model.minWorkerQuantity;
                this.workerDiskCapacity = model.workerDiskCapacity;
                this.workerSpecName = model.workerSpecName;
                this.workerSpecType = model.workerSpecType;
            } 

            /**
             * <p>The allocation unit.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder allocateUnit(String allocateUnit) {
                this.allocateUnit = allocateUnit;
                return this;
            }

            /**
             * <p>The name of the worker group.</p>
             * 
             * <strong>example:</strong>
             * <p>worker1</p>
             */
            public Builder groupName(String groupName) {
                this.groupName = groupName;
                return this;
            }

            /**
             * <p>The maximum number of workers.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder maxWorkerQuantity(Integer maxWorkerQuantity) {
                this.maxWorkerQuantity = maxWorkerQuantity;
                return this;
            }

            /**
             * <p>The minimum number of workers.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder minWorkerQuantity(Integer minWorkerQuantity) {
                this.minWorkerQuantity = minWorkerQuantity;
                return this;
            }

            /**
             * <p>The disk size of each worker.</p>
             * 
             * <strong>example:</strong>
             * <p>100G</p>
             */
            public Builder workerDiskCapacity(String workerDiskCapacity) {
                this.workerDiskCapacity = workerDiskCapacity;
                return this;
            }

            /**
             * <p>The worker resource model.</p>
             * 
             * <strong>example:</strong>
             * <p>large</p>
             */
            public Builder workerSpecName(String workerSpecName) {
                this.workerSpecName = workerSpecName;
                return this;
            }

            /**
             * <p>The Ray worker resource type.</p>
             * 
             * <strong>example:</strong>
             * <p>CPU</p>
             */
            public Builder workerSpecType(String workerSpecType) {
                this.workerSpecType = workerSpecType;
                return this;
            }

            public WorkerGroups build() {
                return new WorkerGroups(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeEmbodiedAIPlatformsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeEmbodiedAIPlatformsResponseBody</p>
     */
    public static class RayConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Category")
        private String category;

        @com.aliyun.core.annotation.NameInMap("HeadDiskCapacity")
        private String headDiskCapacity;

        @com.aliyun.core.annotation.NameInMap("HeadSpec")
        private String headSpec;

        @com.aliyun.core.annotation.NameInMap("HeadSpecType")
        private String headSpecType;

        @com.aliyun.core.annotation.NameInMap("RayClusterAddress")
        private String rayClusterAddress;

        @com.aliyun.core.annotation.NameInMap("RayDashboardAddress")
        private String rayDashboardAddress;

        @com.aliyun.core.annotation.NameInMap("RayGrafanaAddress")
        private String rayGrafanaAddress;

        @com.aliyun.core.annotation.NameInMap("WorkerGroups")
        private java.util.List<WorkerGroups> workerGroups;

        private RayConfig(Builder builder) {
            this.category = builder.category;
            this.headDiskCapacity = builder.headDiskCapacity;
            this.headSpec = builder.headSpec;
            this.headSpecType = builder.headSpecType;
            this.rayClusterAddress = builder.rayClusterAddress;
            this.rayDashboardAddress = builder.rayDashboardAddress;
            this.rayGrafanaAddress = builder.rayGrafanaAddress;
            this.workerGroups = builder.workerGroups;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RayConfig create() {
            return builder().build();
        }

        /**
         * @return category
         */
        public String getCategory() {
            return this.category;
        }

        /**
         * @return headDiskCapacity
         */
        public String getHeadDiskCapacity() {
            return this.headDiskCapacity;
        }

        /**
         * @return headSpec
         */
        public String getHeadSpec() {
            return this.headSpec;
        }

        /**
         * @return headSpecType
         */
        public String getHeadSpecType() {
            return this.headSpecType;
        }

        /**
         * @return rayClusterAddress
         */
        public String getRayClusterAddress() {
            return this.rayClusterAddress;
        }

        /**
         * @return rayDashboardAddress
         */
        public String getRayDashboardAddress() {
            return this.rayDashboardAddress;
        }

        /**
         * @return rayGrafanaAddress
         */
        public String getRayGrafanaAddress() {
            return this.rayGrafanaAddress;
        }

        /**
         * @return workerGroups
         */
        public java.util.List<WorkerGroups> getWorkerGroups() {
            return this.workerGroups;
        }

        public static final class Builder {
            private String category; 
            private String headDiskCapacity; 
            private String headSpec; 
            private String headSpecType; 
            private String rayClusterAddress; 
            private String rayDashboardAddress; 
            private String rayGrafanaAddress; 
            private java.util.List<WorkerGroups> workerGroups; 

            private Builder() {
            } 

            private Builder(RayConfig model) {
                this.category = model.category;
                this.headDiskCapacity = model.headDiskCapacity;
                this.headSpec = model.headSpec;
                this.headSpecType = model.headSpecType;
                this.rayClusterAddress = model.rayClusterAddress;
                this.rayDashboardAddress = model.rayDashboardAddress;
                this.rayGrafanaAddress = model.rayGrafanaAddress;
                this.workerGroups = model.workerGroups;
            } 

            /**
             * <p>The Ray cluster type. Valid values:</p>
             * <ul>
             * <li>BASIC: basic type without high availability.</li>
             * <li>HIGH_AVAILABILITY: high-availability type.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>BASIC</p>
             */
            public Builder category(String category) {
                this.category = category;
                return this;
            }

            /**
             * <p>The disk size of the head node.</p>
             * 
             * <strong>example:</strong>
             * <p>100G</p>
             */
            public Builder headDiskCapacity(String headDiskCapacity) {
                this.headDiskCapacity = headDiskCapacity;
                return this;
            }

            /**
             * <p>The node specifications of the head node.</p>
             * 
             * <strong>example:</strong>
             * <p>large</p>
             */
            public Builder headSpec(String headSpec) {
                this.headSpec = headSpec;
                return this;
            }

            /**
             * <p>The resource type of the head node.</p>
             * 
             * <strong>example:</strong>
             * <p>CPU</p>
             */
            public Builder headSpecType(String headSpecType) {
                this.headSpecType = headSpecType;
                return this;
            }

            /**
             * <p>The Ray cluster address.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://ray-cluster-address.example.com">http://ray-cluster-address.example.com</a></p>
             */
            public Builder rayClusterAddress(String rayClusterAddress) {
                this.rayClusterAddress = rayClusterAddress;
                return this;
            }

            /**
             * <p>The Ray Dashboard address.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://ray-dashboard-address.example.com">http://ray-dashboard-address.example.com</a></p>
             */
            public Builder rayDashboardAddress(String rayDashboardAddress) {
                this.rayDashboardAddress = rayDashboardAddress;
                return this;
            }

            /**
             * <p>The Ray Grafana address.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://ray-grafana-address.example.com">http://ray-grafana-address.example.com</a></p>
             */
            public Builder rayGrafanaAddress(String rayGrafanaAddress) {
                this.rayGrafanaAddress = rayGrafanaAddress;
                return this;
            }

            /**
             * <p>The list of Ray worker group configurations.</p>
             */
            public Builder workerGroups(java.util.List<WorkerGroups> workerGroups) {
                this.workerGroups = workerGroups;
                return this;
            }

            public RayConfig build() {
                return new RayConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeEmbodiedAIPlatformsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeEmbodiedAIPlatformsResponseBody</p>
     */
    public static class GpuSpecs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AllocateUnit")
        private String allocateUnit;

        @com.aliyun.core.annotation.NameInMap("Count")
        private Long count;

        @com.aliyun.core.annotation.NameInMap("SpecName")
        private String specName;

        private GpuSpecs(Builder builder) {
            this.allocateUnit = builder.allocateUnit;
            this.count = builder.count;
            this.specName = builder.specName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static GpuSpecs create() {
            return builder().build();
        }

        /**
         * @return allocateUnit
         */
        public String getAllocateUnit() {
            return this.allocateUnit;
        }

        /**
         * @return count
         */
        public Long getCount() {
            return this.count;
        }

        /**
         * @return specName
         */
        public String getSpecName() {
            return this.specName;
        }

        public static final class Builder {
            private String allocateUnit; 
            private Long count; 
            private String specName; 

            private Builder() {
            } 

            private Builder(GpuSpecs model) {
                this.allocateUnit = model.allocateUnit;
                this.count = model.count;
                this.specName = model.specName;
            } 

            /**
             * <p>The allocation unit.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder allocateUnit(String allocateUnit) {
                this.allocateUnit = allocateUnit;
                return this;
            }

            /**
             * Count.
             */
            public Builder count(Long count) {
                this.count = count;
                return this;
            }

            /**
             * SpecName.
             */
            public Builder specName(String specName) {
                this.specName = specName;
                return this;
            }

            public GpuSpecs build() {
                return new GpuSpecs(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeEmbodiedAIPlatformsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeEmbodiedAIPlatformsResponseBody</p>
     */
    public static class AcrConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("Namespaces")
        private java.util.List<String> namespaces;

        @com.aliyun.core.annotation.NameInMap("Registry")
        private String registry;

        private AcrConfig(Builder builder) {
            this.instanceId = builder.instanceId;
            this.namespaces = builder.namespaces;
            this.registry = builder.registry;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AcrConfig create() {
            return builder().build();
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return namespaces
         */
        public java.util.List<String> getNamespaces() {
            return this.namespaces;
        }

        /**
         * @return registry
         */
        public String getRegistry() {
            return this.registry;
        }

        public static final class Builder {
            private String instanceId; 
            private java.util.List<String> namespaces; 
            private String registry; 

            private Builder() {
            } 

            private Builder(AcrConfig model) {
                this.instanceId = model.instanceId;
                this.namespaces = model.namespaces;
                this.registry = model.registry;
            } 

            /**
             * InstanceId.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * Namespaces.
             */
            public Builder namespaces(java.util.List<String> namespaces) {
                this.namespaces = namespaces;
                return this;
            }

            /**
             * Registry.
             */
            public Builder registry(String registry) {
                this.registry = registry;
                return this;
            }

            public AcrConfig build() {
                return new AcrConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeEmbodiedAIPlatformsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeEmbodiedAIPlatformsResponseBody</p>
     */
    public static class TerminalConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AcrConfig")
        private AcrConfig acrConfig;

        private TerminalConfig(Builder builder) {
            this.acrConfig = builder.acrConfig;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TerminalConfig create() {
            return builder().build();
        }

        /**
         * @return acrConfig
         */
        public AcrConfig getAcrConfig() {
            return this.acrConfig;
        }

        public static final class Builder {
            private AcrConfig acrConfig; 

            private Builder() {
            } 

            private Builder(TerminalConfig model) {
                this.acrConfig = model.acrConfig;
            } 

            /**
             * AcrConfig.
             */
            public Builder acrConfig(AcrConfig acrConfig) {
                this.acrConfig = acrConfig;
                return this;
            }

            public TerminalConfig build() {
                return new TerminalConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeEmbodiedAIPlatformsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeEmbodiedAIPlatformsResponseBody</p>
     */
    public static class RayTrainConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CpuAcu")
        private Long cpuAcu;

        @com.aliyun.core.annotation.NameInMap("GpuSpecs")
        private java.util.List<GpuSpecs> gpuSpecs;

        @com.aliyun.core.annotation.NameInMap("TerminalConfig")
        private TerminalConfig terminalConfig;

        private RayTrainConfig(Builder builder) {
            this.cpuAcu = builder.cpuAcu;
            this.gpuSpecs = builder.gpuSpecs;
            this.terminalConfig = builder.terminalConfig;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RayTrainConfig create() {
            return builder().build();
        }

        /**
         * @return cpuAcu
         */
        public Long getCpuAcu() {
            return this.cpuAcu;
        }

        /**
         * @return gpuSpecs
         */
        public java.util.List<GpuSpecs> getGpuSpecs() {
            return this.gpuSpecs;
        }

        /**
         * @return terminalConfig
         */
        public TerminalConfig getTerminalConfig() {
            return this.terminalConfig;
        }

        public static final class Builder {
            private Long cpuAcu; 
            private java.util.List<GpuSpecs> gpuSpecs; 
            private TerminalConfig terminalConfig; 

            private Builder() {
            } 

            private Builder(RayTrainConfig model) {
                this.cpuAcu = model.cpuAcu;
                this.gpuSpecs = model.gpuSpecs;
                this.terminalConfig = model.terminalConfig;
            } 

            /**
             * CpuAcu.
             */
            public Builder cpuAcu(Long cpuAcu) {
                this.cpuAcu = cpuAcu;
                return this;
            }

            /**
             * GpuSpecs.
             */
            public Builder gpuSpecs(java.util.List<GpuSpecs> gpuSpecs) {
                this.gpuSpecs = gpuSpecs;
                return this;
            }

            /**
             * TerminalConfig.
             */
            public Builder terminalConfig(TerminalConfig terminalConfig) {
                this.terminalConfig = terminalConfig;
                return this;
            }

            public RayTrainConfig build() {
                return new RayTrainConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeEmbodiedAIPlatformsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeEmbodiedAIPlatformsResponseBody</p>
     */
    public static class Platforms extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private Long createTime;

        @com.aliyun.core.annotation.NameInMap("EapConfig")
        private EapConfig eapConfig;

        @com.aliyun.core.annotation.NameInMap("OssBucketName")
        private String ossBucketName;

        @com.aliyun.core.annotation.NameInMap("PlatformName")
        private String platformName;

        @com.aliyun.core.annotation.NameInMap("RayConfig")
        private RayConfig rayConfig;

        @com.aliyun.core.annotation.NameInMap("RayTrainConfig")
        private RayTrainConfig rayTrainConfig;

        @com.aliyun.core.annotation.NameInMap("State")
        private String state;

        private Platforms(Builder builder) {
            this.createTime = builder.createTime;
            this.eapConfig = builder.eapConfig;
            this.ossBucketName = builder.ossBucketName;
            this.platformName = builder.platformName;
            this.rayConfig = builder.rayConfig;
            this.rayTrainConfig = builder.rayTrainConfig;
            this.state = builder.state;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Platforms create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return eapConfig
         */
        public EapConfig getEapConfig() {
            return this.eapConfig;
        }

        /**
         * @return ossBucketName
         */
        public String getOssBucketName() {
            return this.ossBucketName;
        }

        /**
         * @return platformName
         */
        public String getPlatformName() {
            return this.platformName;
        }

        /**
         * @return rayConfig
         */
        public RayConfig getRayConfig() {
            return this.rayConfig;
        }

        /**
         * @return rayTrainConfig
         */
        public RayTrainConfig getRayTrainConfig() {
            return this.rayTrainConfig;
        }

        /**
         * @return state
         */
        public String getState() {
            return this.state;
        }

        public static final class Builder {
            private Long createTime; 
            private EapConfig eapConfig; 
            private String ossBucketName; 
            private String platformName; 
            private RayConfig rayConfig; 
            private RayTrainConfig rayTrainConfig; 
            private String state; 

            private Builder() {
            } 

            private Builder(Platforms model) {
                this.createTime = model.createTime;
                this.eapConfig = model.eapConfig;
                this.ossBucketName = model.ossBucketName;
                this.platformName = model.platformName;
                this.rayConfig = model.rayConfig;
                this.rayTrainConfig = model.rayTrainConfig;
                this.state = model.state;
            } 

            /**
             * <p>The creation time.</p>
             * 
             * <strong>example:</strong>
             * <p>2025-12-01 14:55:36</p>
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The webserver configuration of the platform.</p>
             */
            public Builder eapConfig(EapConfig eapConfig) {
                this.eapConfig = eapConfig;
                return this;
            }

            /**
             * <p>The lake storage name.</p>
             * 
             * <strong>example:</strong>
             * <p>adb-lake-cn-beijing-5q1w******</p>
             */
            public Builder ossBucketName(String ossBucketName) {
                this.ossBucketName = ossBucketName;
                return this;
            }

            /**
             * <p>The platform name.</p>
             * 
             * <strong>example:</strong>
             * <p>platform1</p>
             */
            public Builder platformName(String platformName) {
                this.platformName = platformName;
                return this;
            }

            /**
             * <p>The Ray specification information of the platform.</p>
             */
            public Builder rayConfig(RayConfig rayConfig) {
                this.rayConfig = rayConfig;
                return this;
            }

            /**
             * RayTrainConfig.
             */
            public Builder rayTrainConfig(RayTrainConfig rayTrainConfig) {
                this.rayTrainConfig = rayTrainConfig;
                return this;
            }

            /**
             * <p>The running status.</p>
             * 
             * <strong>example:</strong>
             * <p>running</p>
             */
            public Builder state(String state) {
                this.state = state;
                return this;
            }

            public Platforms build() {
                return new Platforms(this);
            } 

        } 

    }
}
