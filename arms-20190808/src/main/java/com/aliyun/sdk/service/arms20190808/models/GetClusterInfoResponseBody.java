// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetClusterInfoResponseBody} extends {@link TeaModel}
 *
 * <p>GetClusterInfoResponseBody</p>
 */
public class GetClusterInfoResponseBody extends TeaModel {
    @NameInMap("Data")
    private Data data;

    @NameInMap("RequestId")
    private String requestId;

    private GetClusterInfoResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetClusterInfoResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Data data; 
        private String requestId; 

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * Id of the request
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetClusterInfoResponseBody build() {
            return new GetClusterInfoResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("AckNotRunning")
        private Boolean ackNotRunning;

        @NameInMap("AgentHelmNotExist")
        private Boolean agentHelmNotExist;

        @NameInMap("AgentServiceNotExist")
        private Boolean agentServiceNotExist;

        @NameInMap("ArmsDBNotExist")
        private Boolean armsDBNotExist;

        @NameInMap("CheckType")
        private String checkType;

        @NameInMap("GetClusterInfo")
        private String getClusterInfo;

        @NameInMap("HaveAgentNodeIsNotReady")
        private Boolean haveAgentNodeIsNotReady;

        @NameInMap("IsFlink")
        private Boolean isFlink;

        @NameInMap("NeedIntervention")
        private Boolean needIntervention;

        @NameInMap("NodeSizeIsZero")
        private Boolean nodeSizeIsZero;

        @NameInMap("PodIsNotRestart")
        private Boolean podIsNotRestart;

        private Data(Builder builder) {
            this.ackNotRunning = builder.ackNotRunning;
            this.agentHelmNotExist = builder.agentHelmNotExist;
            this.agentServiceNotExist = builder.agentServiceNotExist;
            this.armsDBNotExist = builder.armsDBNotExist;
            this.checkType = builder.checkType;
            this.getClusterInfo = builder.getClusterInfo;
            this.haveAgentNodeIsNotReady = builder.haveAgentNodeIsNotReady;
            this.isFlink = builder.isFlink;
            this.needIntervention = builder.needIntervention;
            this.nodeSizeIsZero = builder.nodeSizeIsZero;
            this.podIsNotRestart = builder.podIsNotRestart;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return ackNotRunning
         */
        public Boolean getAckNotRunning() {
            return this.ackNotRunning;
        }

        /**
         * @return agentHelmNotExist
         */
        public Boolean getAgentHelmNotExist() {
            return this.agentHelmNotExist;
        }

        /**
         * @return agentServiceNotExist
         */
        public Boolean getAgentServiceNotExist() {
            return this.agentServiceNotExist;
        }

        /**
         * @return armsDBNotExist
         */
        public Boolean getArmsDBNotExist() {
            return this.armsDBNotExist;
        }

        /**
         * @return checkType
         */
        public String getCheckType() {
            return this.checkType;
        }

        /**
         * @return getClusterInfo
         */
        public String getGetClusterInfo() {
            return this.getClusterInfo;
        }

        /**
         * @return haveAgentNodeIsNotReady
         */
        public Boolean getHaveAgentNodeIsNotReady() {
            return this.haveAgentNodeIsNotReady;
        }

        /**
         * @return isFlink
         */
        public Boolean getIsFlink() {
            return this.isFlink;
        }

        /**
         * @return needIntervention
         */
        public Boolean getNeedIntervention() {
            return this.needIntervention;
        }

        /**
         * @return nodeSizeIsZero
         */
        public Boolean getNodeSizeIsZero() {
            return this.nodeSizeIsZero;
        }

        /**
         * @return podIsNotRestart
         */
        public Boolean getPodIsNotRestart() {
            return this.podIsNotRestart;
        }

        public static final class Builder {
            private Boolean ackNotRunning; 
            private Boolean agentHelmNotExist; 
            private Boolean agentServiceNotExist; 
            private Boolean armsDBNotExist; 
            private String checkType; 
            private String getClusterInfo; 
            private Boolean haveAgentNodeIsNotReady; 
            private Boolean isFlink; 
            private Boolean needIntervention; 
            private Boolean nodeSizeIsZero; 
            private Boolean podIsNotRestart; 

            /**
             * AckNotRunning.
             */
            public Builder ackNotRunning(Boolean ackNotRunning) {
                this.ackNotRunning = ackNotRunning;
                return this;
            }

            /**
             * AgentHelmNotExist.
             */
            public Builder agentHelmNotExist(Boolean agentHelmNotExist) {
                this.agentHelmNotExist = agentHelmNotExist;
                return this;
            }

            /**
             * AgentServiceNotExist.
             */
            public Builder agentServiceNotExist(Boolean agentServiceNotExist) {
                this.agentServiceNotExist = agentServiceNotExist;
                return this;
            }

            /**
             * ArmsDBNotExist.
             */
            public Builder armsDBNotExist(Boolean armsDBNotExist) {
                this.armsDBNotExist = armsDBNotExist;
                return this;
            }

            /**
             * CheckType.
             */
            public Builder checkType(String checkType) {
                this.checkType = checkType;
                return this;
            }

            /**
             * GetClusterInfo.
             */
            public Builder getClusterInfo(String getClusterInfo) {
                this.getClusterInfo = getClusterInfo;
                return this;
            }

            /**
             * HaveAgentNodeIsNotReady.
             */
            public Builder haveAgentNodeIsNotReady(Boolean haveAgentNodeIsNotReady) {
                this.haveAgentNodeIsNotReady = haveAgentNodeIsNotReady;
                return this;
            }

            /**
             * IsFlink.
             */
            public Builder isFlink(Boolean isFlink) {
                this.isFlink = isFlink;
                return this;
            }

            /**
             * NeedIntervention.
             */
            public Builder needIntervention(Boolean needIntervention) {
                this.needIntervention = needIntervention;
                return this;
            }

            /**
             * NodeSizeIsZero.
             */
            public Builder nodeSizeIsZero(Boolean nodeSizeIsZero) {
                this.nodeSizeIsZero = nodeSizeIsZero;
                return this;
            }

            /**
             * PodIsNotRestart.
             */
            public Builder podIsNotRestart(Boolean podIsNotRestart) {
                this.podIsNotRestart = podIsNotRestart;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
