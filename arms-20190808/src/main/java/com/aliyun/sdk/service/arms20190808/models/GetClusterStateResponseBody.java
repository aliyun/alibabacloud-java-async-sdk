// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetClusterStateResponseBody} extends {@link TeaModel}
 *
 * <p>GetClusterStateResponseBody</p>
 */
public class GetClusterStateResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("result")
    private Result result;

    private GetClusterStateResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetClusterStateResponseBody create() {
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
    public Result getResult() {
        return this.result;
    }

    public static final class Builder {
        private String requestId; 
        private Result result; 

        /**
         * Id of the request
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * result.
         */
        public Builder result(Result result) {
            this.result = result;
            return this;
        }

        public GetClusterStateResponseBody build() {
            return new GetClusterStateResponseBody(this);
        } 

    } 

    public static class Result extends TeaModel {
        @NameInMap("agentState")
        private Boolean agentState;

        @NameInMap("clusterState")
        private String clusterState;

        @NameInMap("isFlink")
        private Boolean isFlink;

        private Result(Builder builder) {
            this.agentState = builder.agentState;
            this.clusterState = builder.clusterState;
            this.isFlink = builder.isFlink;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return agentState
         */
        public Boolean getAgentState() {
            return this.agentState;
        }

        /**
         * @return clusterState
         */
        public String getClusterState() {
            return this.clusterState;
        }

        /**
         * @return isFlink
         */
        public Boolean getIsFlink() {
            return this.isFlink;
        }

        public static final class Builder {
            private Boolean agentState; 
            private String clusterState; 
            private Boolean isFlink; 

            /**
             * agentState.
             */
            public Builder agentState(Boolean agentState) {
                this.agentState = agentState;
                return this;
            }

            /**
             * clusterState.
             */
            public Builder clusterState(String clusterState) {
                this.clusterState = clusterState;
                return this;
            }

            /**
             * isFlink.
             */
            public Builder isFlink(Boolean isFlink) {
                this.isFlink = isFlink;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
