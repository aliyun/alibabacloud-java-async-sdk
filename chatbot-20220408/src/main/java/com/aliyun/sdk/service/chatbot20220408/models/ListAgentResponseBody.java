// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.chatbot20220408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListAgentResponseBody} extends {@link TeaModel}
 *
 * <p>ListAgentResponseBody</p>
 */
public class ListAgentResponseBody extends TeaModel {
    @NameInMap("Data")
    private java.util.List < Data> data;

    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private ListAgentResponseBody(Builder builder) {
        this.data = builder.data;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAgentResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public java.util.List < Data> getData() {
        return this.data;
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
        private java.util.List < Data> data; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * Data.
         */
        public Builder data(java.util.List < Data> data) {
            this.data = data;
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
         * Id of the request
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

        public ListAgentResponseBody build() {
            return new ListAgentResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("AgentId")
        private Long agentId;

        @NameInMap("AgentKey")
        private String agentKey;

        @NameInMap("AgentName")
        private String agentName;

        @NameInMap("DefaultAgent")
        private Boolean defaultAgent;

        @NameInMap("InstanceInfos")
        private java.util.Map < String, ? > instanceInfos;

        private Data(Builder builder) {
            this.agentId = builder.agentId;
            this.agentKey = builder.agentKey;
            this.agentName = builder.agentName;
            this.defaultAgent = builder.defaultAgent;
            this.instanceInfos = builder.instanceInfos;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return agentId
         */
        public Long getAgentId() {
            return this.agentId;
        }

        /**
         * @return agentKey
         */
        public String getAgentKey() {
            return this.agentKey;
        }

        /**
         * @return agentName
         */
        public String getAgentName() {
            return this.agentName;
        }

        /**
         * @return defaultAgent
         */
        public Boolean getDefaultAgent() {
            return this.defaultAgent;
        }

        /**
         * @return instanceInfos
         */
        public java.util.Map < String, ? > getInstanceInfos() {
            return this.instanceInfos;
        }

        public static final class Builder {
            private Long agentId; 
            private String agentKey; 
            private String agentName; 
            private Boolean defaultAgent; 
            private java.util.Map < String, ? > instanceInfos; 

            /**
             * AgentId.
             */
            public Builder agentId(Long agentId) {
                this.agentId = agentId;
                return this;
            }

            /**
             * AgentKey.
             */
            public Builder agentKey(String agentKey) {
                this.agentKey = agentKey;
                return this;
            }

            /**
             * AgentName.
             */
            public Builder agentName(String agentName) {
                this.agentName = agentName;
                return this;
            }

            /**
             * DefaultAgent.
             */
            public Builder defaultAgent(Boolean defaultAgent) {
                this.defaultAgent = defaultAgent;
                return this;
            }

            /**
             * InstanceInfos.
             */
            public Builder instanceInfos(java.util.Map < String, ? > instanceInfos) {
                this.instanceInfos = instanceInfos;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
