// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.searchengine20211025.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListDateSourceGenerationsResponseBody} extends {@link TeaModel}
 *
 * <p>ListDateSourceGenerationsResponseBody</p>
 */
public class ListDateSourceGenerationsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("result")
    private java.util.List < Result> result;

    private ListDateSourceGenerationsResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDateSourceGenerationsResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return result
     */
    public java.util.List < Result> getResult() {
        return this.result;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List < Result> result; 

        /**
         * id of request
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * List
         */
        public Builder result(java.util.List < Result> result) {
            this.result = result;
            return this;
        }

        public ListDateSourceGenerationsResponseBody build() {
            return new ListDateSourceGenerationsResponseBody(this);
        } 

    } 

    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("buildDeployId")
        private Integer buildDeployId;

        @com.aliyun.core.annotation.NameInMap("createTime")
        private Long createTime;

        @com.aliyun.core.annotation.NameInMap("dataDumpRoot")
        private String dataDumpRoot;

        @com.aliyun.core.annotation.NameInMap("generation")
        private Long generation;

        @com.aliyun.core.annotation.NameInMap("partition")
        private java.util.Map < String, Integer > partition;

        @com.aliyun.core.annotation.NameInMap("status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("timestamp")
        private Long timestamp;

        private Result(Builder builder) {
            this.buildDeployId = builder.buildDeployId;
            this.createTime = builder.createTime;
            this.dataDumpRoot = builder.dataDumpRoot;
            this.generation = builder.generation;
            this.partition = builder.partition;
            this.status = builder.status;
            this.timestamp = builder.timestamp;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return buildDeployId
         */
        public Integer getBuildDeployId() {
            return this.buildDeployId;
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return dataDumpRoot
         */
        public String getDataDumpRoot() {
            return this.dataDumpRoot;
        }

        /**
         * @return generation
         */
        public Long getGeneration() {
            return this.generation;
        }

        /**
         * @return partition
         */
        public java.util.Map < String, Integer > getPartition() {
            return this.partition;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return timestamp
         */
        public Long getTimestamp() {
            return this.timestamp;
        }

        public static final class Builder {
            private Integer buildDeployId; 
            private Long createTime; 
            private String dataDumpRoot; 
            private Long generation; 
            private java.util.Map < String, Integer > partition; 
            private String status; 
            private Long timestamp; 

            /**
             * The ID of the offline deployment.
             */
            public Builder buildDeployId(Integer buildDeployId) {
                this.buildDeployId = buildDeployId;
                return this;
            }

            /**
             * The timestamp that was generated when the index building was started.
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * The path of the dumped index in the Apsara File Storage for HDFS file system.
             */
            public Builder dataDumpRoot(String dataDumpRoot) {
                this.dataDumpRoot = dataDumpRoot;
                return this;
            }

            /**
             * The ID of the full index version.
             */
            public Builder generation(Long generation) {
                this.generation = generation;
                return this;
            }

            /**
             * The shards of the index version. The value is a key-value pair in which the key indicates the index name and the value indicates the number of shards. The number of value shards.
             */
            public Builder partition(java.util.Map < String, Integer > partition) {
                this.partition = partition;
                return this;
            }

            /**
             * The status of the index version.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * The start timestamp from which incremental data is retrieved.
             */
            public Builder timestamp(Long timestamp) {
                this.timestamp = timestamp;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
