// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rdsai20250507.models;

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
 * {@link GetModelOperatorOrderResponseBody} extends {@link TeaModel}
 *
 * <p>GetModelOperatorOrderResponseBody</p>
 */
public class GetModelOperatorOrderResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GetModelOperatorOrderResponseBody(Builder builder) {
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetModelOperatorOrderResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
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
        private Data data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(GetModelOperatorOrderResponseBody model) {
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
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
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>FE9C65D7-930F-57A5-A207-8C396329241C</p>
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

        public GetModelOperatorOrderResponseBody build() {
            return new GetModelOperatorOrderResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetModelOperatorOrderResponseBody} extends {@link TeaModel}
     *
     * <p>GetModelOperatorOrderResponseBody</p>
     */
    public static class InstanceList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EndTime")
        private Long endTime;

        @com.aliyun.core.annotation.NameInMap("InstanceClass")
        private String instanceClass;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private Long startTime;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private InstanceList(Builder builder) {
            this.endTime = builder.endTime;
            this.instanceClass = builder.instanceClass;
            this.instanceId = builder.instanceId;
            this.startTime = builder.startTime;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InstanceList create() {
            return builder().build();
        }

        /**
         * @return endTime
         */
        public Long getEndTime() {
            return this.endTime;
        }

        /**
         * @return instanceClass
         */
        public String getInstanceClass() {
            return this.instanceClass;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return startTime
         */
        public Long getStartTime() {
            return this.startTime;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private Long endTime; 
            private String instanceClass; 
            private String instanceId; 
            private Long startTime; 
            private String status; 

            private Builder() {
            } 

            private Builder(InstanceList model) {
                this.endTime = model.endTime;
                this.instanceClass = model.instanceClass;
                this.instanceId = model.instanceId;
                this.startTime = model.startTime;
                this.status = model.status;
            } 

            /**
             * EndTime.
             */
            public Builder endTime(Long endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * InstanceClass.
             */
            public Builder instanceClass(String instanceClass) {
                this.instanceClass = instanceClass;
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
             * StartTime.
             */
            public Builder startTime(Long startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public InstanceList build() {
                return new InstanceList(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetModelOperatorOrderResponseBody} extends {@link TeaModel}
     *
     * <p>GetModelOperatorOrderResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("HasValidOrder")
        private Boolean hasValidOrder;

        @com.aliyun.core.annotation.NameInMap("InstanceList")
        private java.util.List<InstanceList> instanceList;

        private Data(Builder builder) {
            this.hasValidOrder = builder.hasValidOrder;
            this.instanceList = builder.instanceList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return hasValidOrder
         */
        public Boolean getHasValidOrder() {
            return this.hasValidOrder;
        }

        /**
         * @return instanceList
         */
        public java.util.List<InstanceList> getInstanceList() {
            return this.instanceList;
        }

        public static final class Builder {
            private Boolean hasValidOrder; 
            private java.util.List<InstanceList> instanceList; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.hasValidOrder = model.hasValidOrder;
                this.instanceList = model.instanceList;
            } 

            /**
             * HasValidOrder.
             */
            public Builder hasValidOrder(Boolean hasValidOrder) {
                this.hasValidOrder = hasValidOrder;
                return this;
            }

            /**
             * InstanceList.
             */
            public Builder instanceList(java.util.List<InstanceList> instanceList) {
                this.instanceList = instanceList;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
