// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.green20220926.models;

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
 * {@link GetAiAppDetailTopoResponseBody} extends {@link TeaModel}
 *
 * <p>GetAiAppDetailTopoResponseBody</p>
 */
public class GetAiAppDetailTopoResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetAiAppDetailTopoResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAiAppDetailTopoResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public java.util.List<Data> getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<Data> data; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetAiAppDetailTopoResponseBody model) {
            this.data = model.data;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The returned data.</p>
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The ID assigned by the backend to uniquely identify a request. You can use this ID to troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>AAAAAA-BBBB-CCCCC-DDDD-EEEEEEEE****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetAiAppDetailTopoResponseBody build() {
            return new GetAiAppDetailTopoResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetAiAppDetailTopoResponseBody} extends {@link TeaModel}
     *
     * <p>GetAiAppDetailTopoResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("NodeCategory")
        private String nodeCategory;

        @com.aliyun.core.annotation.NameInMap("NodeId")
        private String nodeId;

        @com.aliyun.core.annotation.NameInMap("NodeName")
        private String nodeName;

        @com.aliyun.core.annotation.NameInMap("NodeType")
        private String nodeType;

        @com.aliyun.core.annotation.NameInMap("RequestCount")
        private Long requestCount;

        @com.aliyun.core.annotation.NameInMap("RiskLevel")
        private String riskLevel;

        @com.aliyun.core.annotation.NameInMap("WarningCount")
        private Integer warningCount;

        private Data(Builder builder) {
            this.nodeCategory = builder.nodeCategory;
            this.nodeId = builder.nodeId;
            this.nodeName = builder.nodeName;
            this.nodeType = builder.nodeType;
            this.requestCount = builder.requestCount;
            this.riskLevel = builder.riskLevel;
            this.warningCount = builder.warningCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return nodeCategory
         */
        public String getNodeCategory() {
            return this.nodeCategory;
        }

        /**
         * @return nodeId
         */
        public String getNodeId() {
            return this.nodeId;
        }

        /**
         * @return nodeName
         */
        public String getNodeName() {
            return this.nodeName;
        }

        /**
         * @return nodeType
         */
        public String getNodeType() {
            return this.nodeType;
        }

        /**
         * @return requestCount
         */
        public Long getRequestCount() {
            return this.requestCount;
        }

        /**
         * @return riskLevel
         */
        public String getRiskLevel() {
            return this.riskLevel;
        }

        /**
         * @return warningCount
         */
        public Integer getWarningCount() {
            return this.warningCount;
        }

        public static final class Builder {
            private String nodeCategory; 
            private String nodeId; 
            private String nodeName; 
            private String nodeType; 
            private Long requestCount; 
            private String riskLevel; 
            private Integer warningCount; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.nodeCategory = model.nodeCategory;
                this.nodeId = model.nodeId;
                this.nodeName = model.nodeName;
                this.nodeType = model.nodeType;
                this.requestCount = model.requestCount;
                this.riskLevel = model.riskLevel;
                this.warningCount = model.warningCount;
            } 

            /**
             * <p>The node category.</p>
             * <ul>
             * <li><p>LLM</p>
             * </li>
             * <li><p>Knowledge</p>
             * </li>
             * <li><p>Tools</p>
             * </li>
             * <li><p>Others</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>LLM</p>
             */
            public Builder nodeCategory(String nodeCategory) {
                this.nodeCategory = nodeCategory;
                return this;
            }

            /**
             * <p>The node ID.</p>
             * 
             * <strong>example:</strong>
             * <p>idxxx</p>
             */
            public Builder nodeId(String nodeId) {
                this.nodeId = nodeId;
                return this;
            }

            /**
             * <p>The node name.</p>
             * 
             * <strong>example:</strong>
             * <p>namexxx</p>
             */
            public Builder nodeName(String nodeName) {
                this.nodeName = nodeName;
                return this;
            }

            /**
             * <p>The node type. Valid values:</p>
             * <ul>
             * <li><strong>APP</strong>: end-to-end agent.</li>
             * <li><strong>MODEL</strong>: large language model.</li>
             * <li><strong>TOOL</strong>: tool.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>TOOL</p>
             */
            public Builder nodeType(String nodeType) {
                this.nodeType = nodeType;
                return this;
            }

            /**
             * <p>The request count.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder requestCount(Long requestCount) {
                this.requestCount = requestCount;
                return this;
            }

            /**
             * <p>The risk level.</p>
             * 
             * <strong>example:</strong>
             * <p>high</p>
             */
            public Builder riskLevel(String riskLevel) {
                this.riskLevel = riskLevel;
                return this;
            }

            /**
             * <p>The alert count.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder warningCount(Integer warningCount) {
                this.warningCount = warningCount;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
