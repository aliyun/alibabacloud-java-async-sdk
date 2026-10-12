// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.voicenavigator20180612.models;

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
 * {@link ListInstancesResponseBody} extends {@link TeaModel}
 *
 * <p>ListInstancesResponseBody</p>
 */
public class ListInstancesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Instances")
    private java.util.List<Instances> instances;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private ListInstancesResponseBody(Builder builder) {
        this.instances = builder.instances;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListInstancesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instances
     */
    public java.util.List<Instances> getInstances() {
        return this.instances;
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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List<Instances> instances; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(ListInstancesResponseBody model) {
            this.instances = model.instances;
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The array of instances.</p>
         */
        public Builder instances(java.util.List<Instances> instances) {
            this.instances = instances;
            return this;
        }

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
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
         * <p>A8AED3C8-F57B-5D71-9A34-4A170287533F</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListInstancesResponseBody build() {
            return new ListInstancesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>ListInstancesResponseBody</p>
     */
    public static class Instances extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ApplicableOperations")
        private java.util.List<String> applicableOperations;

        @com.aliyun.core.annotation.NameInMap("Concurrency")
        private Long concurrency;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private Long createTime;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("ModifyTime")
        private Long modifyTime;

        @com.aliyun.core.annotation.NameInMap("ModifyUserName")
        private String modifyUserName;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("NluServiceParamsJson")
        private String nluServiceParamsJson;

        @com.aliyun.core.annotation.NameInMap("Numbers")
        private java.util.List<String> numbers;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("UnionInstanceId")
        private String unionInstanceId;

        @com.aliyun.core.annotation.NameInMap("UnionSource")
        private String unionSource;

        private Instances(Builder builder) {
            this.applicableOperations = builder.applicableOperations;
            this.concurrency = builder.concurrency;
            this.createTime = builder.createTime;
            this.description = builder.description;
            this.instanceId = builder.instanceId;
            this.modifyTime = builder.modifyTime;
            this.modifyUserName = builder.modifyUserName;
            this.name = builder.name;
            this.nluServiceParamsJson = builder.nluServiceParamsJson;
            this.numbers = builder.numbers;
            this.status = builder.status;
            this.unionInstanceId = builder.unionInstanceId;
            this.unionSource = builder.unionSource;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Instances create() {
            return builder().build();
        }

        /**
         * @return applicableOperations
         */
        public java.util.List<String> getApplicableOperations() {
            return this.applicableOperations;
        }

        /**
         * @return concurrency
         */
        public Long getConcurrency() {
            return this.concurrency;
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return modifyTime
         */
        public Long getModifyTime() {
            return this.modifyTime;
        }

        /**
         * @return modifyUserName
         */
        public String getModifyUserName() {
            return this.modifyUserName;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return nluServiceParamsJson
         */
        public String getNluServiceParamsJson() {
            return this.nluServiceParamsJson;
        }

        /**
         * @return numbers
         */
        public java.util.List<String> getNumbers() {
            return this.numbers;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return unionInstanceId
         */
        public String getUnionInstanceId() {
            return this.unionInstanceId;
        }

        /**
         * @return unionSource
         */
        public String getUnionSource() {
            return this.unionSource;
        }

        public static final class Builder {
            private java.util.List<String> applicableOperations; 
            private Long concurrency; 
            private Long createTime; 
            private String description; 
            private String instanceId; 
            private Long modifyTime; 
            private String modifyUserName; 
            private String name; 
            private String nluServiceParamsJson; 
            private java.util.List<String> numbers; 
            private String status; 
            private String unionInstanceId; 
            private String unionSource; 

            private Builder() {
            } 

            private Builder(Instances model) {
                this.applicableOperations = model.applicableOperations;
                this.concurrency = model.concurrency;
                this.createTime = model.createTime;
                this.description = model.description;
                this.instanceId = model.instanceId;
                this.modifyTime = model.modifyTime;
                this.modifyUserName = model.modifyUserName;
                this.name = model.name;
                this.nluServiceParamsJson = model.nluServiceParamsJson;
                this.numbers = model.numbers;
                this.status = model.status;
                this.unionInstanceId = model.unionInstanceId;
                this.unionSource = model.unionSource;
            } 

            /**
             * <p>The list of applicable operations for the instance.</p>
             */
            public Builder applicableOperations(java.util.List<String> applicableOperations) {
                this.applicableOperations = applicableOperations;
                return this;
            }

            /**
             * <p>The concurrency.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder concurrency(Long concurrency) {
                this.concurrency = concurrency;
                return this;
            }

            /**
             * <p>The creation time.</p>
             * 
             * <strong>example:</strong>
             * <p>1658202465000</p>
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The description.</p>
             * 
             * <strong>example:</strong>
             * <p>测试的实例</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>dc437bba-5a25-4bbc-b4c2-f268864bebb5</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The modification time.</p>
             * 
             * <strong>example:</strong>
             * <p>1582266750353</p>
             */
            public Builder modifyTime(Long modifyTime) {
                this.modifyTime = modifyTime;
                return this;
            }

            /**
             * <p>The operator who performed the operation.</p>
             * 
             * <strong>example:</strong>
             * <p>xxx</p>
             */
            public Builder modifyUserName(String modifyUserName) {
                this.modifyUserName = modifyUserName;
                return this;
            }

            /**
             * <p>The name.</p>
             * 
             * <strong>example:</strong>
             * <p>测试实例</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The large language model service parameters in JSON format.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;agentId&quot;:&quot;1213503&quot;,&quot;isCCCAgent&quot;:&quot;true&quot;,&quot;agentKey&quot;:&quot;107e04a7519243eb83c9b549ea3b6829_p_ccc_public&quot;}</p>
             */
            public Builder nluServiceParamsJson(String nluServiceParamsJson) {
                this.nluServiceParamsJson = nluServiceParamsJson;
                return this;
            }

            /**
             * <p>The list of inbound numbers.</p>
             */
            public Builder numbers(java.util.List<String> numbers) {
                this.numbers = numbers;
                return this;
            }

            /**
             * <p>The instance status.</p>
             * 
             * <strong>example:</strong>
             * <p>Published</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The instance ID.</p>
             * <blockquote>
             * <p>When UnionSource is set to CCC, UnionInstanceId is set to the instance ID of Cloud Call Center.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>zhyl</p>
             */
            public Builder unionInstanceId(String unionInstanceId) {
                this.unionInstanceId = unionInstanceId;
                return this;
            }

            /**
             * <p>The source.</p>
             * <ul>
             * <li>CCC: Cloud Call Center.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>CCC</p>
             */
            public Builder unionSource(String unionSource) {
                this.unionSource = unionSource;
                return this;
            }

            public Instances build() {
                return new Instances(this);
            } 

        } 

    }
}
