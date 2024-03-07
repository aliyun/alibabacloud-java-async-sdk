// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.foasconsole20211028.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeNamespacesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeNamespacesResponseBody</p>
 */
public class DescribeNamespacesResponseBody extends TeaModel {
    @NameInMap("Namespaces")
    private java.util.List < Namespaces> namespaces;

    @NameInMap("PageIndex")
    private Integer pageIndex;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    @NameInMap("TotalCount")
    private Long totalCount;

    @NameInMap("TotalPage")
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

    /**
     * @return namespaces
     */
    public java.util.List < Namespaces> getNamespaces() {
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
        private java.util.List < Namespaces> namespaces; 
        private Integer pageIndex; 
        private Integer pageSize; 
        private String requestId; 
        private Boolean success; 
        private Long totalCount; 
        private Integer totalPage; 

        /**
         * Namespaces.
         */
        public Builder namespaces(java.util.List < Namespaces> namespaces) {
            this.namespaces = namespaces;
            return this;
        }

        /**
         * PageIndex.
         */
        public Builder pageIndex(Integer pageIndex) {
            this.pageIndex = pageIndex;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * TotalPage.
         */
        public Builder totalPage(Integer totalPage) {
            this.totalPage = totalPage;
            return this;
        }

        public DescribeNamespacesResponseBody build() {
            return new DescribeNamespacesResponseBody(this);
        } 

    } 

    public static class ResourceSpec extends TeaModel {
        @NameInMap("Cpu")
        private Integer cpu;

        @NameInMap("MemoryGB")
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

            public ResourceSpec build() {
                return new ResourceSpec(this);
            } 

        } 

    }
    public static class ResourceUsed extends TeaModel {
        @NameInMap("Cpu")
        private Float cpu;

        @NameInMap("Cu")
        private Float cu;

        @NameInMap("MemoryGB")
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

            /**
             * Cpu.
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
             * MemoryGB.
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
    public static class Tags extends TeaModel {
        @NameInMap("Key")
        private String key;

        @NameInMap("Value")
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

            /**
             * Key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * Value.
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
    public static class Namespaces extends TeaModel {
        @NameInMap("GmtCreate")
        private Long gmtCreate;

        @NameInMap("GmtModified")
        private Long gmtModified;

        @NameInMap("Ha")
        private Boolean ha;

        @NameInMap("Namespace")
        private String namespace;

        @NameInMap("ResourceSpec")
        private ResourceSpec resourceSpec;

        @NameInMap("ResourceUsed")
        private ResourceUsed resourceUsed;

        @NameInMap("Status")
        private String status;

        @NameInMap("Tags")
        private java.util.List < Tags> tags;

        private Namespaces(Builder builder) {
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
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
        public java.util.List < Tags> getTags() {
            return this.tags;
        }

        public static final class Builder {
            private Long gmtCreate; 
            private Long gmtModified; 
            private Boolean ha; 
            private String namespace; 
            private ResourceSpec resourceSpec; 
            private ResourceUsed resourceUsed; 
            private String status; 
            private java.util.List < Tags> tags; 

            /**
             * GmtCreate.
             */
            public Builder gmtCreate(Long gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * GmtModified.
             */
            public Builder gmtModified(Long gmtModified) {
                this.gmtModified = gmtModified;
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
             * Namespace.
             */
            public Builder namespace(String namespace) {
                this.namespace = namespace;
                return this;
            }

            /**
             * ResourceSpec.
             */
            public Builder resourceSpec(ResourceSpec resourceSpec) {
                this.resourceSpec = resourceSpec;
                return this;
            }

            /**
             * ResourceUsed.
             */
            public Builder resourceUsed(ResourceUsed resourceUsed) {
                this.resourceUsed = resourceUsed;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * Tags.
             */
            public Builder tags(java.util.List < Tags> tags) {
                this.tags = tags;
                return this;
            }

            public Namespaces build() {
                return new Namespaces(this);
            } 

        } 

    }
}
