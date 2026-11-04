// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20170705.models;

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
 * {@link ListAgentStatesResponseBody} extends {@link TeaModel}
 *
 * <p>ListAgentStatesResponseBody</p>
 */
public class ListAgentStatesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private ListAgentStatesResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAgentStatesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private Integer httpStatusCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(ListAgentStatesResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * HttpStatusCode.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
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
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ListAgentStatesResponseBody build() {
            return new ListAgentStatesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListAgentStatesResponseBody} extends {@link TeaModel}
     *
     * <p>ListAgentStatesResponseBody</p>
     */
    public static class RealTimeAgentState extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AgentId")
        private String agentId;

        @com.aliyun.core.annotation.NameInMap("AgentName")
        private String agentName;

        @com.aliyun.core.annotation.NameInMap("Dn")
        private String dn;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("LoginName")
        private String loginName;

        @com.aliyun.core.annotation.NameInMap("State")
        private String state;

        @com.aliyun.core.annotation.NameInMap("StateDuration")
        private String stateDuration;

        private RealTimeAgentState(Builder builder) {
            this.agentId = builder.agentId;
            this.agentName = builder.agentName;
            this.dn = builder.dn;
            this.instanceId = builder.instanceId;
            this.loginName = builder.loginName;
            this.state = builder.state;
            this.stateDuration = builder.stateDuration;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RealTimeAgentState create() {
            return builder().build();
        }

        /**
         * @return agentId
         */
        public String getAgentId() {
            return this.agentId;
        }

        /**
         * @return agentName
         */
        public String getAgentName() {
            return this.agentName;
        }

        /**
         * @return dn
         */
        public String getDn() {
            return this.dn;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return loginName
         */
        public String getLoginName() {
            return this.loginName;
        }

        /**
         * @return state
         */
        public String getState() {
            return this.state;
        }

        /**
         * @return stateDuration
         */
        public String getStateDuration() {
            return this.stateDuration;
        }

        public static final class Builder {
            private String agentId; 
            private String agentName; 
            private String dn; 
            private String instanceId; 
            private String loginName; 
            private String state; 
            private String stateDuration; 

            private Builder() {
            } 

            private Builder(RealTimeAgentState model) {
                this.agentId = model.agentId;
                this.agentName = model.agentName;
                this.dn = model.dn;
                this.instanceId = model.instanceId;
                this.loginName = model.loginName;
                this.state = model.state;
                this.stateDuration = model.stateDuration;
            } 

            /**
             * AgentId.
             */
            public Builder agentId(String agentId) {
                this.agentId = agentId;
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
             * Dn.
             */
            public Builder dn(String dn) {
                this.dn = dn;
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
             * LoginName.
             */
            public Builder loginName(String loginName) {
                this.loginName = loginName;
                return this;
            }

            /**
             * State.
             */
            public Builder state(String state) {
                this.state = state;
                return this;
            }

            /**
             * StateDuration.
             */
            public Builder stateDuration(String stateDuration) {
                this.stateDuration = stateDuration;
                return this;
            }

            public RealTimeAgentState build() {
                return new RealTimeAgentState(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListAgentStatesResponseBody} extends {@link TeaModel}
     *
     * <p>ListAgentStatesResponseBody</p>
     */
    public static class List extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("RealTimeAgentState")
        private java.util.List<RealTimeAgentState> realTimeAgentState;

        private List(Builder builder) {
            this.realTimeAgentState = builder.realTimeAgentState;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static List create() {
            return builder().build();
        }

        /**
         * @return realTimeAgentState
         */
        public java.util.List<RealTimeAgentState> getRealTimeAgentState() {
            return this.realTimeAgentState;
        }

        public static final class Builder {
            private java.util.List<RealTimeAgentState> realTimeAgentState; 

            private Builder() {
            } 

            private Builder(List model) {
                this.realTimeAgentState = model.realTimeAgentState;
            } 

            /**
             * RealTimeAgentState.
             */
            public Builder realTimeAgentState(java.util.List<RealTimeAgentState> realTimeAgentState) {
                this.realTimeAgentState = realTimeAgentState;
                return this;
            }

            public List build() {
                return new List(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListAgentStatesResponseBody} extends {@link TeaModel}
     *
     * <p>ListAgentStatesResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("List")
        private List list;

        @com.aliyun.core.annotation.NameInMap("PageNumber")
        private Integer pageNumber;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Integer totalCount;

        private Data(Builder builder) {
            this.list = builder.list;
            this.pageNumber = builder.pageNumber;
            this.pageSize = builder.pageSize;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return list
         */
        public List getList() {
            return this.list;
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
         * @return totalCount
         */
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private List list; 
            private Integer pageNumber; 
            private Integer pageSize; 
            private Integer totalCount; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.list = model.list;
                this.pageNumber = model.pageNumber;
                this.pageSize = model.pageSize;
                this.totalCount = model.totalCount;
            } 

            /**
             * List.
             */
            public Builder list(List list) {
                this.list = list;
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
             * TotalCount.
             */
            public Builder totalCount(Integer totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
