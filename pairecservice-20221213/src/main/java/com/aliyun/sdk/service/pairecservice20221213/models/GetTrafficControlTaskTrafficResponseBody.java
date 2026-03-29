// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pairecservice20221213.models;

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
 * {@link GetTrafficControlTaskTrafficResponseBody} extends {@link TeaModel}
 *
 * <p>GetTrafficControlTaskTrafficResponseBody</p>
 */
public class GetTrafficControlTaskTrafficResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TrafficControlTaskTrafficInfo")
    private TrafficControlTaskTrafficInfo trafficControlTaskTrafficInfo;

    private GetTrafficControlTaskTrafficResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.trafficControlTaskTrafficInfo = builder.trafficControlTaskTrafficInfo;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetTrafficControlTaskTrafficResponseBody create() {
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
     * @return trafficControlTaskTrafficInfo
     */
    public TrafficControlTaskTrafficInfo getTrafficControlTaskTrafficInfo() {
        return this.trafficControlTaskTrafficInfo;
    }

    public static final class Builder {
        private String requestId; 
        private TrafficControlTaskTrafficInfo trafficControlTaskTrafficInfo; 

        private Builder() {
        } 

        private Builder(GetTrafficControlTaskTrafficResponseBody model) {
            this.requestId = model.requestId;
            this.trafficControlTaskTrafficInfo = model.trafficControlTaskTrafficInfo;
        } 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TrafficControlTaskTrafficInfo.
         */
        public Builder trafficControlTaskTrafficInfo(TrafficControlTaskTrafficInfo trafficControlTaskTrafficInfo) {
            this.trafficControlTaskTrafficInfo = trafficControlTaskTrafficInfo;
            return this;
        }

        public GetTrafficControlTaskTrafficResponseBody build() {
            return new GetTrafficControlTaskTrafficResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetTrafficControlTaskTrafficResponseBody} extends {@link TeaModel}
     *
     * <p>GetTrafficControlTaskTrafficResponseBody</p>
     */
    public static class TargetTraffics extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Data")
        private java.util.Map<String, TrafficControlTaskTrafficInfoTargetTrafficsDataValue> data;

        @com.aliyun.core.annotation.NameInMap("TrafficContorlTargetId")
        private String trafficContorlTargetId;

        private TargetTraffics(Builder builder) {
            this.data = builder.data;
            this.trafficContorlTargetId = builder.trafficContorlTargetId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TargetTraffics create() {
            return builder().build();
        }

        /**
         * @return data
         */
        public java.util.Map<String, TrafficControlTaskTrafficInfoTargetTrafficsDataValue> getData() {
            return this.data;
        }

        /**
         * @return trafficContorlTargetId
         */
        public String getTrafficContorlTargetId() {
            return this.trafficContorlTargetId;
        }

        public static final class Builder {
            private java.util.Map<String, TrafficControlTaskTrafficInfoTargetTrafficsDataValue> data; 
            private String trafficContorlTargetId; 

            private Builder() {
            } 

            private Builder(TargetTraffics model) {
                this.data = model.data;
                this.trafficContorlTargetId = model.trafficContorlTargetId;
            } 

            /**
             * Data.
             */
            public Builder data(java.util.Map<String, TrafficControlTaskTrafficInfoTargetTrafficsDataValue> data) {
                this.data = data;
                return this;
            }

            /**
             * TrafficContorlTargetId.
             */
            public Builder trafficContorlTargetId(String trafficContorlTargetId) {
                this.trafficContorlTargetId = trafficContorlTargetId;
                return this;
            }

            public TargetTraffics build() {
                return new TargetTraffics(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetTrafficControlTaskTrafficResponseBody} extends {@link TeaModel}
     *
     * <p>GetTrafficControlTaskTrafficResponseBody</p>
     */
    public static class TrafficControlTaskTrafficInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("TargetTraffics")
        private java.util.List<TargetTraffics> targetTraffics;

        @com.aliyun.core.annotation.NameInMap("TaskTraffics")
        private java.util.Map<String, TrafficControlTaskTrafficInfoTaskTrafficsValue> taskTraffics;

        private TrafficControlTaskTrafficInfo(Builder builder) {
            this.targetTraffics = builder.targetTraffics;
            this.taskTraffics = builder.taskTraffics;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TrafficControlTaskTrafficInfo create() {
            return builder().build();
        }

        /**
         * @return targetTraffics
         */
        public java.util.List<TargetTraffics> getTargetTraffics() {
            return this.targetTraffics;
        }

        /**
         * @return taskTraffics
         */
        public java.util.Map<String, TrafficControlTaskTrafficInfoTaskTrafficsValue> getTaskTraffics() {
            return this.taskTraffics;
        }

        public static final class Builder {
            private java.util.List<TargetTraffics> targetTraffics; 
            private java.util.Map<String, TrafficControlTaskTrafficInfoTaskTrafficsValue> taskTraffics; 

            private Builder() {
            } 

            private Builder(TrafficControlTaskTrafficInfo model) {
                this.targetTraffics = model.targetTraffics;
                this.taskTraffics = model.taskTraffics;
            } 

            /**
             * TargetTraffics.
             */
            public Builder targetTraffics(java.util.List<TargetTraffics> targetTraffics) {
                this.targetTraffics = targetTraffics;
                return this;
            }

            /**
             * TaskTraffics.
             */
            public Builder taskTraffics(java.util.Map<String, TrafficControlTaskTrafficInfoTaskTrafficsValue> taskTraffics) {
                this.taskTraffics = taskTraffics;
                return this;
            }

            public TrafficControlTaskTrafficInfo build() {
                return new TrafficControlTaskTrafficInfo(this);
            } 

        } 

    }
}
