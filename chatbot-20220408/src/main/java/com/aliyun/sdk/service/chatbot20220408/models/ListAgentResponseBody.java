// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.chatbot20220408.models;

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
 * {@link ListAgentResponseBody} extends {@link TeaModel}
 *
 * <p>ListAgentResponseBody</p>
 */
public class ListAgentResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
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
        private java.util.List<Data> data; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(ListAgentResponseBody model) {
            this.data = model.data;
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The list of business spaces.</p>
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The current page number. Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of records per page in the response. Maximum value: 100. Default value: 10.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>F55D90C1-31BE-4B2A-AA3F-25EFC36F9419</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of records.</p>
         * 
         * <strong>example:</strong>
         * <p>6</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListAgentResponseBody build() {
            return new ListAgentResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListAgentResponseBody} extends {@link TeaModel}
     *
     * <p>ListAgentResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AgentId")
        private Long agentId;

        @com.aliyun.core.annotation.NameInMap("AgentKey")
        private String agentKey;

        @com.aliyun.core.annotation.NameInMap("AgentName")
        private String agentName;

        @com.aliyun.core.annotation.NameInMap("InstanceInfos")
        private java.util.Map<String, ?> instanceInfos;

        private Data(Builder builder) {
            this.agentId = builder.agentId;
            this.agentKey = builder.agentKey;
            this.agentName = builder.agentName;
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
         * @return instanceInfos
         */
        public java.util.Map<String, ?> getInstanceInfos() {
            return this.instanceInfos;
        }

        public static final class Builder {
            private Long agentId; 
            private String agentKey; 
            private String agentName; 
            private java.util.Map<String, ?> instanceInfos; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.agentId = model.agentId;
                this.agentKey = model.agentKey;
                this.agentName = model.agentName;
                this.instanceInfos = model.instanceInfos;
            } 

            /**
             * <p>The business space ID.</p>
             * 
             * <strong>example:</strong>
             * <p>881</p>
             */
            public Builder agentId(Long agentId) {
                this.agentId = agentId;
                return this;
            }

            /**
             * <p>The business space signature, which is used to specify the business space when calling PaaS API operations.</p>
             * 
             * <strong>example:</strong>
             * <p>4e7400028e6f4a7393ed3acf6a7b8927_p_beebot_public</p>
             */
            public Builder agentKey(String agentKey) {
                this.agentKey = agentKey;
                return this;
            }

            /**
             * <p>The business space name.</p>
             * 
             * <strong>example:</strong>
             * <p>BusinessSpace_881</p>
             */
            public Builder agentName(String agentName) {
                this.agentName = agentName;
                return this;
            }

            /**
             * <p>The commodity instance information.</p>
             */
            public Builder instanceInfos(java.util.Map<String, ?> instanceInfos) {
                this.instanceInfos = instanceInfos;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
