// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.voicenavigator20180612.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListInstancesResponseBody} extends {@link TeaModel}
 *
 * <p>ListInstancesResponseBody</p>
 */
public class ListInstancesResponseBody extends TeaModel {
    @NameInMap("Instances")
    private java.util.List < Instances> instances;

    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
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

    /**
     * @return instances
     */
    public java.util.List < Instances> getInstances() {
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
        private java.util.List < Instances> instances; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * Instances.
         */
        public Builder instances(java.util.List < Instances> instances) {
            this.instances = instances;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
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
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListInstancesResponseBody build() {
            return new ListInstancesResponseBody(this);
        } 

    } 

    public static class Instances extends TeaModel {
        @NameInMap("ApplicableOperations")
        private java.util.List < String > applicableOperations;

        @NameInMap("Concurrency")
        private Long concurrency;

        @NameInMap("CreateTime")
        private Long createTime;

        @NameInMap("Description")
        private String description;

        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("ModifyTime")
        private Long modifyTime;

        @NameInMap("ModifyUserName")
        private String modifyUserName;

        @NameInMap("Name")
        private String name;

        @NameInMap("NluServiceParamsJson")
        private String nluServiceParamsJson;

        @NameInMap("Numbers")
        private java.util.List < String > numbers;

        @NameInMap("Status")
        private String status;

        @NameInMap("UnionInstanceId")
        private String unionInstanceId;

        @NameInMap("UnionSource")
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
        public java.util.List < String > getApplicableOperations() {
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
        public java.util.List < String > getNumbers() {
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
            private java.util.List < String > applicableOperations; 
            private Long concurrency; 
            private Long createTime; 
            private String description; 
            private String instanceId; 
            private Long modifyTime; 
            private String modifyUserName; 
            private String name; 
            private String nluServiceParamsJson; 
            private java.util.List < String > numbers; 
            private String status; 
            private String unionInstanceId; 
            private String unionSource; 

            /**
             * ApplicableOperations.
             */
            public Builder applicableOperations(java.util.List < String > applicableOperations) {
                this.applicableOperations = applicableOperations;
                return this;
            }

            /**
             * Concurrency.
             */
            public Builder concurrency(Long concurrency) {
                this.concurrency = concurrency;
                return this;
            }

            /**
             * CreateTime.
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * InstanceId.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * ModifyTime.
             */
            public Builder modifyTime(Long modifyTime) {
                this.modifyTime = modifyTime;
                return this;
            }

            /**
             * ModifyUserName.
             */
            public Builder modifyUserName(String modifyUserName) {
                this.modifyUserName = modifyUserName;
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
             * NluServiceParamsJson.
             */
            public Builder nluServiceParamsJson(String nluServiceParamsJson) {
                this.nluServiceParamsJson = nluServiceParamsJson;
                return this;
            }

            /**
             * Numbers.
             */
            public Builder numbers(java.util.List < String > numbers) {
                this.numbers = numbers;
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
             * UnionInstanceId.
             */
            public Builder unionInstanceId(String unionInstanceId) {
                this.unionInstanceId = unionInstanceId;
                return this;
            }

            /**
             * UnionSource.
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
