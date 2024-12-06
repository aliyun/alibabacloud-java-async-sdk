// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListShardRecoveriesResponseBody} extends {@link TeaModel}
 *
 * <p>ListShardRecoveriesResponseBody</p>
 */
public class ListShardRecoveriesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Result")
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
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>F99407AB-2FA9-489E-A259-40CF6DCC47D9</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The returned result.</p>
         */
        public Builder result(java.util.List < Result> result) {
            this.result = result;
            return this;
        }

        public ListShardRecoveriesResponseBody build() {
            return new ListShardRecoveriesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListShardRecoveriesResponseBody} extends {@link TeaModel}
     *
     * <p>ListShardRecoveriesResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("bytesPercent")
        private String bytesPercent;

        @com.aliyun.core.annotation.NameInMap("bytesTotal")
        private Long bytesTotal;

        @com.aliyun.core.annotation.NameInMap("filesPercent")
        private String filesPercent;

        @com.aliyun.core.annotation.NameInMap("filesTotal")
        private Long filesTotal;

        @com.aliyun.core.annotation.NameInMap("index")
        private String index;

        @com.aliyun.core.annotation.NameInMap("sourceHost")
        private String sourceHost;

        @com.aliyun.core.annotation.NameInMap("sourceNode")
        private String sourceNode;

        @com.aliyun.core.annotation.NameInMap("stage")
        private String stage;

        @com.aliyun.core.annotation.NameInMap("targetHost")
        private String targetHost;

        @com.aliyun.core.annotation.NameInMap("targetNode")
        private String targetNode;

        @com.aliyun.core.annotation.NameInMap("translogOps")
        private Long translogOps;

        @com.aliyun.core.annotation.NameInMap("translogOpsPercent")
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
             * <p>The data restoration progress.</p>
             * 
             * <strong>example:</strong>
             * <p>80%</p>
             */
            public Builder bytesPercent(String bytesPercent) {
                this.bytesPercent = bytesPercent;
                return this;
            }

            /**
             * <p>The total amount of data that is restored.</p>
             * 
             * <strong>example:</strong>
             * <p>12086</p>
             */
            public Builder bytesTotal(Long bytesTotal) {
                this.bytesTotal = bytesTotal;
                return this;
            }

            /**
             * <p>The file execution progress.</p>
             * 
             * <strong>example:</strong>
             * <p>80.0%</p>
             */
            public Builder filesPercent(String filesPercent) {
                this.filesPercent = filesPercent;
                return this;
            }

            /**
             * <p>The total number of files.</p>
             * 
             * <strong>example:</strong>
             * <p>79</p>
             */
            public Builder filesTotal(Long filesTotal) {
                this.filesTotal = filesTotal;
                return this;
            }

            /**
             * <p>The name of the index.</p>
             * 
             * <strong>example:</strong>
             * <p>my-index-000001</p>
             */
            public Builder index(String index) {
                this.index = index;
                return this;
            }

            /**
             * <p>The IP address of the source node.</p>
             * 
             * <strong>example:</strong>
             * <p>192.168.XX.XX</p>
             */
            public Builder sourceHost(String sourceHost) {
                this.sourceHost = sourceHost;
                return this;
            }

            /**
             * <p>The name of the source node.</p>
             * 
             * <strong>example:</strong>
             * <p>2Kni3dJ</p>
             */
            public Builder sourceNode(String sourceNode) {
                this.sourceNode = sourceNode;
                return this;
            }

            /**
             * <p>The data restoration status. Valid values:</p>
             * <ul>
             * <li>done: Data restoration is complete.</li>
             * <li>finalize: Data is being cleared.</li>
             * <li>index: Index metadata is being read, and bytes are being copied from source to destination.</li>
             * <li>init: Data restoration is not started.</li>
             * <li>start: Data restoration is started.</li>
             * <li>translog: Translogs are being redone.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>done</p>
             */
            public Builder stage(String stage) {
                this.stage = stage;
                return this;
            }

            /**
             * <p>The IP address of the destination node.</p>
             * 
             * <strong>example:</strong>
             * <p>192.168.XX.XX</p>
             */
            public Builder targetHost(String targetHost) {
                this.targetHost = targetHost;
                return this;
            }

            /**
             * <p>The name of the destination node.</p>
             * 
             * <strong>example:</strong>
             * <p>YVVKLmW</p>
             */
            public Builder targetNode(String targetNode) {
                this.targetNode = targetNode;
                return this;
            }

            /**
             * <p>The number of translog operations to be restored.</p>
             * 
             * <strong>example:</strong>
             * <p>12086</p>
             */
            public Builder translogOps(Long translogOps) {
                this.translogOps = translogOps;
                return this;
            }

            /**
             * <p>The restoration progress of translog operations.</p>
             * 
             * <strong>example:</strong>
             * <p>80%</p>
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
