// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.foasconsole20211028.models;

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
 * {@link DescribeNamespacesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeNamespacesResponseBody</p>
 */
public class DescribeNamespacesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Namespaces")
    private java.util.List<Namespaces> namespaces;

    @com.aliyun.core.annotation.NameInMap("PageIndex")
    private Integer pageIndex;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    @com.aliyun.core.annotation.NameInMap("TotalPage")
    private Integer totalPage;

    private DescribeNamespacesResponseBody(Builder builder) {
        this.namespaces = builder.namespaces;
        this.pageIndex = builder.pageIndex;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.totalCount = builder.totalCount;
        this.totalPage = builder.totalPage;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeNamespacesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return namespaces
     */
    public java.util.List<Namespaces> getNamespaces() {
        return this.namespaces;
    }

    /**
     * @return pageIndex
     */
    public Integer getPageIndex() {
        return this.pageIndex;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    /**
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    /**
     * @return totalPage
     */
    public Integer getTotalPage() {
        return this.totalPage;
    }

    public static final class Builder {
        private java.util.List<Namespaces> namespaces; 
        private Integer pageIndex; 
        private Integer pageSize; 
        private String requestId; 
        private Boolean success; 
        private Long totalCount; 
        private Integer totalPage; 

        private Builder() {
        } 

        private Builder(DescribeNamespacesResponseBody model) {
            this.namespaces = model.namespaces;
            this.pageIndex = model.pageIndex;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.success = model.success;
            this.totalCount = model.totalCount;
            this.totalPage = model.totalPage;
        } 

        /**
         * <p>The list of namespaces.</p>
         */
        public Builder namespaces(java.util.List<Namespaces> namespaces) {
            this.namespaces = namespaces;
            return this;
        }

        /**
         * <p>The current page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageIndex(Integer pageIndex) {
            this.pageIndex = pageIndex;
            return this;
        }

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>67F33190-946B-1105-B6A1-E2DF0426DD51</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request is successful. Valid values:</p>
         * <ul>
         * <li>true: Successful.</li>
         * <li>false: Failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * <p>The total number of entries.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * <p>The total number of pages.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder totalPage(Integer totalPage) {
            this.totalPage = totalPage;
            return this;
        }

        public DescribeNamespacesResponseBody build() {
            return new DescribeNamespacesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeNamespacesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeNamespacesResponseBody</p>
     */
    public static class ElasticResourceSpec extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Cpu")
        private Integer cpu;

        @com.aliyun.core.annotation.NameInMap("MemoryGB")
        private Integer memoryGB;

        private ElasticResourceSpec(Builder builder) {
            this.cpu = builder.cpu;
            this.memoryGB = builder.memoryGB;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ElasticResourceSpec create() {
            return builder().build();
        }

        /**
         * @return cpu
         */
        public Integer getCpu() {
            return this.cpu;
        }

        /**
         * @return memoryGB
         */
        public Integer getMemoryGB() {
            return this.memoryGB;
        }

        public static final class Builder {
            private Integer cpu; 
            private Integer memoryGB; 

            private Builder() {
            } 

            private Builder(ElasticResourceSpec model) {
                this.cpu = model.cpu;
                this.memoryGB = model.memoryGB;
            } 

            /**
             * Cpu.
             */
            public Builder cpu(Integer cpu) {
                this.cpu = cpu;
                return this;
            }

            /**
             * MemoryGB.
             */
            public Builder memoryGB(Integer memoryGB) {
                this.memoryGB = memoryGB;
                return this;
            }

            public ElasticResourceSpec build() {
                return new ElasticResourceSpec(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeNamespacesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeNamespacesResponseBody</p>
     */
    public static class GuaranteedResourceSpec extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Cpu")
        private Integer cpu;

        @com.aliyun.core.annotation.NameInMap("MemoryGB")
        private Integer memoryGB;

        private GuaranteedResourceSpec(Builder builder) {
            this.cpu = builder.cpu;
            this.memoryGB = builder.memoryGB;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static GuaranteedResourceSpec create() {
            return builder().build();
        }

        /**
         * @return cpu
         */
        public Integer getCpu() {
            return this.cpu;
        }

        /**
         * @return memoryGB
         */
        public Integer getMemoryGB() {
            return this.memoryGB;
        }

        public static final class Builder {
            private Integer cpu; 
            private Integer memoryGB; 

            private Builder() {
            } 

            private Builder(GuaranteedResourceSpec model) {
                this.cpu = model.cpu;
                this.memoryGB = model.memoryGB;
            } 

            /**
             * Cpu.
             */
            public Builder cpu(Integer cpu) {
                this.cpu = cpu;
                return this;
            }

            /**
             * MemoryGB.
             */
            public Builder memoryGB(Integer memoryGB) {
                this.memoryGB = memoryGB;
                return this;
            }

            public GuaranteedResourceSpec build() {
                return new GuaranteedResourceSpec(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeNamespacesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeNamespacesResponseBody</p>
     */
    public static class ResourceSpec extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Cpu")
        private Integer cpu;

        @com.aliyun.core.annotation.NameInMap("MemoryGB")
        private Integer memoryGB;

        private ResourceSpec(Builder builder) {
            this.cpu = builder.cpu;
            this.memoryGB = builder.memoryGB;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResourceSpec create() {
            return builder().build();
        }

        /**
         * @return cpu
         */
        public Integer getCpu() {
            return this.cpu;
        }

        /**
         * @return memoryGB
         */
        public Integer getMemoryGB() {
            return this.memoryGB;
        }

        public static final class Builder {
            private Integer cpu; 
            private Integer memoryGB; 

            private Builder() {
            } 

            private Builder(ResourceSpec model) {
                this.cpu = model.cpu;
                this.memoryGB = model.memoryGB;
            } 

            /**
             * <p>The number of CPUs.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder cpu(Integer cpu) {
                this.cpu = cpu;
                return this;
            }

            /**
             * <p>The memory size.</p>
             * 
             * <strong>example:</strong>
             * <p>40</p>
             */
            public Builder memoryGB(Integer memoryGB) {
                this.memoryGB = memoryGB;
                return this;
            }

            public ResourceSpec build() {
                return new ResourceSpec(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeNamespacesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeNamespacesResponseBody</p>
     */
    public static class ResourceUsed extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Cpu")
        private Float cpu;

        @com.aliyun.core.annotation.NameInMap("Cu")
        private Float cu;

        @com.aliyun.core.annotation.NameInMap("MemoryGB")
        private Float memoryGB;

        private ResourceUsed(Builder builder) {
            this.cpu = builder.cpu;
            this.cu = builder.cu;
            this.memoryGB = builder.memoryGB;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResourceUsed create() {
            return builder().build();
        }

        /**
         * @return cpu
         */
        public Float getCpu() {
            return this.cpu;
        }

        /**
         * @return cu
         */
        public Float getCu() {
            return this.cu;
        }

        /**
         * @return memoryGB
         */
        public Float getMemoryGB() {
            return this.memoryGB;
        }

        public static final class Builder {
            private Float cpu; 
            private Float cu; 
            private Float memoryGB; 

            private Builder() {
            } 

            private Builder(ResourceUsed model) {
                this.cpu = model.cpu;
                this.cu = model.cu;
                this.memoryGB = model.memoryGB;
            } 

            /**
             * <p>The number of used CPUs.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder cpu(Float cpu) {
                this.cpu = cpu;
                return this;
            }

            /**
             * Cu.
             */
            public Builder cu(Float cu) {
                this.cu = cu;
                return this;
            }

            /**
             * <p>The amount of used memory.</p>
             * 
             * <strong>example:</strong>
             * <p>4</p>
             */
            public Builder memoryGB(Float memoryGB) {
                this.memoryGB = memoryGB;
                return this;
            }

            public ResourceUsed build() {
                return new ResourceUsed(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeNamespacesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeNamespacesResponseBody</p>
     */
    public static class Tags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Tags(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tags create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            private Builder() {
            } 

            private Builder(Tags model) {
                this.key = model.key;
                this.value = model.value;
            } 

            /**
             * <p>The tag key.</p>
             * 
             * <strong>example:</strong>
             * <p>flink</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The tag value.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeNamespacesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeNamespacesResponseBody</p>
     */
    public static class Namespaces extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ElasticResourceSpec")
        private ElasticResourceSpec elasticResourceSpec;

        @com.aliyun.core.annotation.NameInMap("GmtCreate")
        private Long gmtCreate;

        @com.aliyun.core.annotation.NameInMap("GmtModified")
        private Long gmtModified;

        @com.aliyun.core.annotation.NameInMap("GuaranteedResourceSpec")
        private GuaranteedResourceSpec guaranteedResourceSpec;

        @com.aliyun.core.annotation.NameInMap("Ha")
        private Boolean ha;

        @com.aliyun.core.annotation.NameInMap("Namespace")
        private String namespace;

        @com.aliyun.core.annotation.NameInMap("ResourceSpec")
        private ResourceSpec resourceSpec;

        @com.aliyun.core.annotation.NameInMap("ResourceUsed")
        private ResourceUsed resourceUsed;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("Tags")
        private java.util.List<Tags> tags;

        private Namespaces(Builder builder) {
            this.elasticResourceSpec = builder.elasticResourceSpec;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.guaranteedResourceSpec = builder.guaranteedResourceSpec;
            this.ha = builder.ha;
            this.namespace = builder.namespace;
            this.resourceSpec = builder.resourceSpec;
            this.resourceUsed = builder.resourceUsed;
            this.status = builder.status;
            this.tags = builder.tags;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Namespaces create() {
            return builder().build();
        }

        /**
         * @return elasticResourceSpec
         */
        public ElasticResourceSpec getElasticResourceSpec() {
            return this.elasticResourceSpec;
        }

        /**
         * @return gmtCreate
         */
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return gmtModified
         */
        public Long getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return guaranteedResourceSpec
         */
        public GuaranteedResourceSpec getGuaranteedResourceSpec() {
            return this.guaranteedResourceSpec;
        }

        /**
         * @return ha
         */
        public Boolean getHa() {
            return this.ha;
        }

        /**
         * @return namespace
         */
        public String getNamespace() {
            return this.namespace;
        }

        /**
         * @return resourceSpec
         */
        public ResourceSpec getResourceSpec() {
            return this.resourceSpec;
        }

        /**
         * @return resourceUsed
         */
        public ResourceUsed getResourceUsed() {
            return this.resourceUsed;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return tags
         */
        public java.util.List<Tags> getTags() {
            return this.tags;
        }

        public static final class Builder {
            private ElasticResourceSpec elasticResourceSpec; 
            private Long gmtCreate; 
            private Long gmtModified; 
            private GuaranteedResourceSpec guaranteedResourceSpec; 
            private Boolean ha; 
            private String namespace; 
            private ResourceSpec resourceSpec; 
            private ResourceUsed resourceUsed; 
            private String status; 
            private java.util.List<Tags> tags; 

            private Builder() {
            } 

            private Builder(Namespaces model) {
                this.elasticResourceSpec = model.elasticResourceSpec;
                this.gmtCreate = model.gmtCreate;
                this.gmtModified = model.gmtModified;
                this.guaranteedResourceSpec = model.guaranteedResourceSpec;
                this.ha = model.ha;
                this.namespace = model.namespace;
                this.resourceSpec = model.resourceSpec;
                this.resourceUsed = model.resourceUsed;
                this.status = model.status;
                this.tags = model.tags;
            } 

            /**
             * ElasticResourceSpec.
             */
            public Builder elasticResourceSpec(ElasticResourceSpec elasticResourceSpec) {
                this.elasticResourceSpec = elasticResourceSpec;
                return this;
            }

            /**
             * <p>The creation time.</p>
             * 
             * <strong>example:</strong>
             * <p>1629879567394</p>
             */
            public Builder gmtCreate(Long gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * <p>The modification time.</p>
             * 
             * <strong>example:</strong>
             * <p>1629879567394</p>
             */
            public Builder gmtModified(Long gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * GuaranteedResourceSpec.
             */
            public Builder guaranteedResourceSpec(GuaranteedResourceSpec guaranteedResourceSpec) {
                this.guaranteedResourceSpec = guaranteedResourceSpec;
                return this;
            }

            /**
             * Ha.
             */
            public Builder ha(Boolean ha) {
                this.ha = ha;
                return this;
            }

            /**
             * <p>The name of the namespace.</p>
             * 
             * <strong>example:</strong>
             * <p>ns-1</p>
             */
            public Builder namespace(String namespace) {
                this.namespace = namespace;
                return this;
            }

            /**
             * <p>The resource specification information.</p>
             */
            public Builder resourceSpec(ResourceSpec resourceSpec) {
                this.resourceSpec = resourceSpec;
                return this;
            }

            /**
             * <p>The used resources.</p>
             */
            public Builder resourceUsed(ResourceUsed resourceUsed) {
                this.resourceUsed = resourceUsed;
                return this;
            }

            /**
             * <p>The status of the namespace. Valid values:</p>
             * <ul>
             * <li>CREATING: Being created.</li>
             * <li>DELETING: Being deleted.</li>
             * <li>MODIFYING: Resource specifications are being modified.</li>
             * <li>SUCCESS: The last operation was successful.</li>
             * <li>FAILED: The last operation failed.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>SUCCESS</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The list of tags.</p>
             */
            public Builder tags(java.util.List<Tags> tags) {
                this.tags = tags;
                return this;
            }

            public Namespaces build() {
                return new Namespaces(this);
            } 

        } 

    }
}
