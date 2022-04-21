// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mpserverless20190615.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListFunctionResponseBody} extends {@link TeaModel}
 *
 * <p>ListFunctionResponseBody</p>
 */
public class ListFunctionResponseBody extends TeaModel {
    @NameInMap("DataList")
    private java.util.List < DataList> dataList;

    @NameInMap("Paginator")
    private Paginator paginator;

    @NameInMap("RequestId")
    private String requestId;

    private ListFunctionResponseBody(Builder builder) {
        this.dataList = builder.dataList;
        this.paginator = builder.paginator;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListFunctionResponseBody create() {
        return builder().build();
    }

    /**
     * @return dataList
     */
    public java.util.List < DataList> getDataList() {
        return this.dataList;
    }

    /**
     * @return paginator
     */
    public Paginator getPaginator() {
        return this.paginator;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < DataList> dataList; 
        private Paginator paginator; 
        private String requestId; 

        /**
         * DataList.
         */
        public Builder dataList(java.util.List < DataList> dataList) {
            this.dataList = dataList;
            return this;
        }

        /**
         * Paginator.
         */
        public Builder paginator(Paginator paginator) {
            this.paginator = paginator;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListFunctionResponseBody build() {
            return new ListFunctionResponseBody(this);
        } 

    } 

    public static class Spec extends TeaModel {
        @NameInMap("InstanceConcurrency")
        private Integer instanceConcurrency;

        @NameInMap("Memory")
        private String memory;

        @NameInMap("Runtime")
        private String runtime;

        @NameInMap("Timeout")
        private String timeout;

        private Spec(Builder builder) {
            this.instanceConcurrency = builder.instanceConcurrency;
            this.memory = builder.memory;
            this.runtime = builder.runtime;
            this.timeout = builder.timeout;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Spec create() {
            return builder().build();
        }

        /**
         * @return instanceConcurrency
         */
        public Integer getInstanceConcurrency() {
            return this.instanceConcurrency;
        }

        /**
         * @return memory
         */
        public String getMemory() {
            return this.memory;
        }

        /**
         * @return runtime
         */
        public String getRuntime() {
            return this.runtime;
        }

        /**
         * @return timeout
         */
        public String getTimeout() {
            return this.timeout;
        }

        public static final class Builder {
            private Integer instanceConcurrency; 
            private String memory; 
            private String runtime; 
            private String timeout; 

            /**
             * InstanceConcurrency.
             */
            public Builder instanceConcurrency(Integer instanceConcurrency) {
                this.instanceConcurrency = instanceConcurrency;
                return this;
            }

            /**
             * Memory.
             */
            public Builder memory(String memory) {
                this.memory = memory;
                return this;
            }

            /**
             * Runtime.
             */
            public Builder runtime(String runtime) {
                this.runtime = runtime;
                return this;
            }

            /**
             * Timeout.
             */
            public Builder timeout(String timeout) {
                this.timeout = timeout;
                return this;
            }

            public Spec build() {
                return new Spec(this);
            } 

        } 

    }
    public static class DataList extends TeaModel {
        @NameInMap("CreatedAt")
        private String createdAt;

        @NameInMap("Desc")
        private String desc;

        @NameInMap("HttpTriggerPath")
        private String httpTriggerPath;

        @NameInMap("ModifiedAt")
        private String modifiedAt;

        @NameInMap("Name")
        private String name;

        @NameInMap("Spec")
        private Spec spec;

        @NameInMap("TimingTriggerConfig")
        private String timingTriggerConfig;

        private DataList(Builder builder) {
            this.createdAt = builder.createdAt;
            this.desc = builder.desc;
            this.httpTriggerPath = builder.httpTriggerPath;
            this.modifiedAt = builder.modifiedAt;
            this.name = builder.name;
            this.spec = builder.spec;
            this.timingTriggerConfig = builder.timingTriggerConfig;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataList create() {
            return builder().build();
        }

        /**
         * @return createdAt
         */
        public String getCreatedAt() {
            return this.createdAt;
        }

        /**
         * @return desc
         */
        public String getDesc() {
            return this.desc;
        }

        /**
         * @return httpTriggerPath
         */
        public String getHttpTriggerPath() {
            return this.httpTriggerPath;
        }

        /**
         * @return modifiedAt
         */
        public String getModifiedAt() {
            return this.modifiedAt;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return spec
         */
        public Spec getSpec() {
            return this.spec;
        }

        /**
         * @return timingTriggerConfig
         */
        public String getTimingTriggerConfig() {
            return this.timingTriggerConfig;
        }

        public static final class Builder {
            private String createdAt; 
            private String desc; 
            private String httpTriggerPath; 
            private String modifiedAt; 
            private String name; 
            private Spec spec; 
            private String timingTriggerConfig; 

            /**
             * CreatedAt.
             */
            public Builder createdAt(String createdAt) {
                this.createdAt = createdAt;
                return this;
            }

            /**
             * Desc.
             */
            public Builder desc(String desc) {
                this.desc = desc;
                return this;
            }

            /**
             * HttpTriggerPath.
             */
            public Builder httpTriggerPath(String httpTriggerPath) {
                this.httpTriggerPath = httpTriggerPath;
                return this;
            }

            /**
             * ModifiedAt.
             */
            public Builder modifiedAt(String modifiedAt) {
                this.modifiedAt = modifiedAt;
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
             * Spec.
             */
            public Builder spec(Spec spec) {
                this.spec = spec;
                return this;
            }

            /**
             * TimingTriggerConfig.
             */
            public Builder timingTriggerConfig(String timingTriggerConfig) {
                this.timingTriggerConfig = timingTriggerConfig;
                return this;
            }

            public DataList build() {
                return new DataList(this);
            } 

        } 

    }
    public static class Paginator extends TeaModel {
        @NameInMap("PageCount")
        private Integer pageCount;

        @NameInMap("PageNum")
        private Integer pageNum;

        @NameInMap("PageSize")
        private Integer pageSize;

        @NameInMap("Total")
        private Integer total;

        private Paginator(Builder builder) {
            this.pageCount = builder.pageCount;
            this.pageNum = builder.pageNum;
            this.pageSize = builder.pageSize;
            this.total = builder.total;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Paginator create() {
            return builder().build();
        }

        /**
         * @return pageCount
         */
        public Integer getPageCount() {
            return this.pageCount;
        }

        /**
         * @return pageNum
         */
        public Integer getPageNum() {
            return this.pageNum;
        }

        /**
         * @return pageSize
         */
        public Integer getPageSize() {
            return this.pageSize;
        }

        /**
         * @return total
         */
        public Integer getTotal() {
            return this.total;
        }

        public static final class Builder {
            private Integer pageCount; 
            private Integer pageNum; 
            private Integer pageSize; 
            private Integer total; 

            /**
             * PageCount.
             */
            public Builder pageCount(Integer pageCount) {
                this.pageCount = pageCount;
                return this;
            }

            /**
             * PageNum.
             */
            public Builder pageNum(Integer pageNum) {
                this.pageNum = pageNum;
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
             * Total.
             */
            public Builder total(Integer total) {
                this.total = total;
                return this;
            }

            public Paginator build() {
                return new Paginator(this);
            } 

        } 

    }
}
