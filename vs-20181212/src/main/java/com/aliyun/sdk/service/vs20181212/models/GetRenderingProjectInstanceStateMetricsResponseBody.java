// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vs20181212.models;

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
 * {@link GetRenderingProjectInstanceStateMetricsResponseBody} extends {@link TeaModel}
 *
 * <p>GetRenderingProjectInstanceStateMetricsResponseBody</p>
 */
public class GetRenderingProjectInstanceStateMetricsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("StateMetrics")
    private java.util.List<StateMetrics> stateMetrics;

    private GetRenderingProjectInstanceStateMetricsResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.stateMetrics = builder.stateMetrics;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetRenderingProjectInstanceStateMetricsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return stateMetrics
     */
    public java.util.List<StateMetrics> getStateMetrics() {
        return this.stateMetrics;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List<StateMetrics> stateMetrics; 

        private Builder() {
        } 

        private Builder(GetRenderingProjectInstanceStateMetricsResponseBody model) {
            this.requestId = model.requestId;
            this.stateMetrics = model.stateMetrics;
        } 

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>BEA5625F-8FCF-48F4-851B-CA63946DA664</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * StateMetrics.
         */
        public Builder stateMetrics(java.util.List<StateMetrics> stateMetrics) {
            this.stateMetrics = stateMetrics;
            return this;
        }

        public GetRenderingProjectInstanceStateMetricsResponseBody build() {
            return new GetRenderingProjectInstanceStateMetricsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetRenderingProjectInstanceStateMetricsResponseBody} extends {@link TeaModel}
     *
     * <p>GetRenderingProjectInstanceStateMetricsResponseBody</p>
     */
    public static class StateMetrics extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Count")
        private String count;

        @com.aliyun.core.annotation.NameInMap("State")
        private String state;

        private StateMetrics(Builder builder) {
            this.count = builder.count;
            this.state = builder.state;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static StateMetrics create() {
            return builder().build();
        }

        /**
         * @return count
         */
        public String getCount() {
            return this.count;
        }

        /**
         * @return state
         */
        public String getState() {
            return this.state;
        }

        public static final class Builder {
            private String count; 
            private String state; 

            private Builder() {
            } 

            private Builder(StateMetrics model) {
                this.count = model.count;
                this.state = model.state;
            } 

            /**
             * Count.
             */
            public Builder count(String count) {
                this.count = count;
                return this;
            }

            /**
             * State.
             */
            public Builder state(String state) {
                this.state = state;
                return this;
            }

            public StateMetrics build() {
                return new StateMetrics(this);
            } 

        } 

    }
}
