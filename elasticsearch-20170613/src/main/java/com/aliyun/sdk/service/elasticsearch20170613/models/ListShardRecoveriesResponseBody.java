// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListShardRecoveriesResponseBody} extends {@link TeaModel}
 *
 * <p>ListShardRecoveriesResponseBody</p>
 */
public class ListShardRecoveriesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Result")
    private java.util.List < Result> result;

    private ListShardRecoveriesResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListShardRecoveriesResponseBody create() {
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
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The returned result.
         */
        public Builder result(java.util.List < Result> result) {
            this.result = result;
            return this;
        }

        public ListShardRecoveriesResponseBody build() {
            return new ListShardRecoveriesResponseBody(this);
        } 

    } 

    public static class Result extends TeaModel {
        @NameInMap("bytesPercent")
        private String bytesPercent;

        @NameInMap("bytesTotal")
        private Long bytesTotal;

        @NameInMap("filesPercent")
        private String filesPercent;

        @NameInMap("filesTotal")
        private Long filesTotal;

        @NameInMap("index")
        private String index;

        @NameInMap("sourceHost")
        private String sourceHost;

        @NameInMap("sourceNode")
        private String sourceNode;

        @NameInMap("stage")
        private String stage;

        @NameInMap("targetHost")
        private String targetHost;

        @NameInMap("targetNode")
        private String targetNode;

        @NameInMap("translogOps")
        private Long translogOps;

        @NameInMap("translogOpsPercent")
        private String translogOpsPercent;

        private Result(Builder builder) {
            this.bytesPercent = builder.bytesPercent;
            this.bytesTotal = builder.bytesTotal;
            this.filesPercent = builder.filesPercent;
            this.filesTotal = builder.filesTotal;
            this.index = builder.index;
            this.sourceHost = builder.sourceHost;
            this.sourceNode = builder.sourceNode;
            this.stage = builder.stage;
            this.targetHost = builder.targetHost;
            this.targetNode = builder.targetNode;
            this.translogOps = builder.translogOps;
            this.translogOpsPercent = builder.translogOpsPercent;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return bytesPercent
         */
        public String getBytesPercent() {
            return this.bytesPercent;
        }

        /**
         * @return bytesTotal
         */
        public Long getBytesTotal() {
            return this.bytesTotal;
        }

        /**
         * @return filesPercent
         */
        public String getFilesPercent() {
            return this.filesPercent;
        }

        /**
         * @return filesTotal
         */
        public Long getFilesTotal() {
            return this.filesTotal;
        }

        /**
         * @return index
         */
        public String getIndex() {
            return this.index;
        }

        /**
         * @return sourceHost
         */
        public String getSourceHost() {
            return this.sourceHost;
        }

        /**
         * @return sourceNode
         */
        public String getSourceNode() {
            return this.sourceNode;
        }

        /**
         * @return stage
         */
        public String getStage() {
            return this.stage;
        }

        /**
         * @return targetHost
         */
        public String getTargetHost() {
            return this.targetHost;
        }

        /**
         * @return targetNode
         */
        public String getTargetNode() {
            return this.targetNode;
        }

        /**
         * @return translogOps
         */
        public Long getTranslogOps() {
            return this.translogOps;
        }

        /**
         * @return translogOpsPercent
         */
        public String getTranslogOpsPercent() {
            return this.translogOpsPercent;
        }

        public static final class Builder {
            private String bytesPercent; 
            private Long bytesTotal; 
            private String filesPercent; 
            private Long filesTotal; 
            private String index; 
            private String sourceHost; 
            private String sourceNode; 
            private String stage; 
            private String targetHost; 
            private String targetNode; 
            private Long translogOps; 
            private String translogOpsPercent; 

            /**
             * The data restoration progress.
             */
            public Builder bytesPercent(String bytesPercent) {
                this.bytesPercent = bytesPercent;
                return this;
            }

            /**
             * The total amount of data that is restored.
             */
            public Builder bytesTotal(Long bytesTotal) {
                this.bytesTotal = bytesTotal;
                return this;
            }

            /**
             * The file execution progress.
             */
            public Builder filesPercent(String filesPercent) {
                this.filesPercent = filesPercent;
                return this;
            }

            /**
             * The total number of files.
             */
            public Builder filesTotal(Long filesTotal) {
                this.filesTotal = filesTotal;
                return this;
            }

            /**
             * The name of the index.
             */
            public Builder index(String index) {
                this.index = index;
                return this;
            }

            /**
             * The IP address of the source node.
             */
            public Builder sourceHost(String sourceHost) {
                this.sourceHost = sourceHost;
                return this;
            }

            /**
             * The name of the source node.
             */
            public Builder sourceNode(String sourceNode) {
                this.sourceNode = sourceNode;
                return this;
            }

            /**
             * The data restoration status. Valid values:
             * <p>
             * 
             * *   done: Data restoration is complete.
             * *   finalize: Data is being cleared.
             * *   index: Index metadata is being read, and bytes are being copied from source to destination.
             * *   init: Data restoration is not started.
             * *   start: Data restoration is started.
             * *   translog: Translogs are being redone.
             */
            public Builder stage(String stage) {
                this.stage = stage;
                return this;
            }

            /**
             * The IP address of the destination node.
             */
            public Builder targetHost(String targetHost) {
                this.targetHost = targetHost;
                return this;
            }

            /**
             * The name of the destination node.
             */
            public Builder targetNode(String targetNode) {
                this.targetNode = targetNode;
                return this;
            }

            /**
             * The number of translog operations to be restored.
             */
            public Builder translogOps(Long translogOps) {
                this.translogOps = translogOps;
                return this;
            }

            /**
             * The restoration progress of translog operations.
             */
            public Builder translogOpsPercent(String translogOpsPercent) {
                this.translogOpsPercent = translogOpsPercent;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
