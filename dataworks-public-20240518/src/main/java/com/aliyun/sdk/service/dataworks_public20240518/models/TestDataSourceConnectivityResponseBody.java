// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20240518.models;

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
 * {@link TestDataSourceConnectivityResponseBody} extends {@link TeaModel}
 *
 * <p>TestDataSourceConnectivityResponseBody</p>
 */
public class TestDataSourceConnectivityResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Connectivity")
    private Connectivity connectivity;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private TestDataSourceConnectivityResponseBody(Builder builder) {
        this.connectivity = builder.connectivity;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static TestDataSourceConnectivityResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return connectivity
     */
    public Connectivity getConnectivity() {
        return this.connectivity;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Connectivity connectivity; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(TestDataSourceConnectivityResponseBody model) {
            this.connectivity = model.connectivity;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The details of the connectivity test.</p>
         */
        public Builder connectivity(Connectivity connectivity) {
            this.connectivity = connectivity;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>4CDF7B72-020B-542A-8465-21CFFA81****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public TestDataSourceConnectivityResponseBody build() {
            return new TestDataSourceConnectivityResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link TestDataSourceConnectivityResponseBody} extends {@link TeaModel}
     *
     * <p>TestDataSourceConnectivityResponseBody</p>
     */
    public static class DetailLogs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Code")
        private String code;

        @com.aliyun.core.annotation.NameInMap("EndTime")
        private Long endTime;

        @com.aliyun.core.annotation.NameInMap("Message")
        private String message;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private Long startTime;

        private DetailLogs(Builder builder) {
            this.code = builder.code;
            this.endTime = builder.endTime;
            this.message = builder.message;
            this.startTime = builder.startTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DetailLogs create() {
            return builder().build();
        }

        /**
         * @return code
         */
        public String getCode() {
            return this.code;
        }

        /**
         * @return endTime
         */
        public Long getEndTime() {
            return this.endTime;
        }

        /**
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        /**
         * @return startTime
         */
        public Long getStartTime() {
            return this.startTime;
        }

        public static final class Builder {
            private String code; 
            private Long endTime; 
            private String message; 
            private Long startTime; 

            private Builder() {
            } 

            private Builder(DetailLogs model) {
                this.code = model.code;
                this.endTime = model.endTime;
                this.message = model.message;
                this.startTime = model.startTime;
            } 

            /**
             * <p>The code of the test item.</p>
             * 
             * <strong>example:</strong>
             * <p>validate_input_parameters</p>
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * <p>The end time of a step.</p>
             * 
             * <strong>example:</strong>
             * <p>1730217604002</p>
             */
            public Builder endTime(Long endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * <p>The name of the step.</p>
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * <p>The start time of a step.</p>
             * 
             * <strong>example:</strong>
             * <p>1730217600001</p>
             */
            public Builder startTime(Long startTime) {
                this.startTime = startTime;
                return this;
            }

            public DetailLogs build() {
                return new DetailLogs(this);
            } 

        } 

    }
    /**
     * 
     * {@link TestDataSourceConnectivityResponseBody} extends {@link TeaModel}
     *
     * <p>TestDataSourceConnectivityResponseBody</p>
     */
    public static class Connectivity extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ConnectMessage")
        private String connectMessage;

        @com.aliyun.core.annotation.NameInMap("ConnectState")
        private String connectState;

        @com.aliyun.core.annotation.NameInMap("DetailLogs")
        private java.util.List<DetailLogs> detailLogs;

        private Connectivity(Builder builder) {
            this.connectMessage = builder.connectMessage;
            this.connectState = builder.connectState;
            this.detailLogs = builder.detailLogs;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Connectivity create() {
            return builder().build();
        }

        /**
         * @return connectMessage
         */
        public String getConnectMessage() {
            return this.connectMessage;
        }

        /**
         * @return connectState
         */
        public String getConnectState() {
            return this.connectState;
        }

        /**
         * @return detailLogs
         */
        public java.util.List<DetailLogs> getDetailLogs() {
            return this.detailLogs;
        }

        public static final class Builder {
            private String connectMessage; 
            private String connectState; 
            private java.util.List<DetailLogs> detailLogs; 

            private Builder() {
            } 

            private Builder(Connectivity model) {
                this.connectMessage = model.connectMessage;
                this.connectState = model.connectState;
                this.detailLogs = model.detailLogs;
            } 

            /**
             * <p>The error message returned if the connectivity test fails. No such a message is returned if the connectivity test is successful.</p>
             */
            public Builder connectMessage(String connectMessage) {
                this.connectMessage = connectMessage;
                return this;
            }

            /**
             * <p>The result of the connectivity test. Valid values: Connectable: The network can be connected. ConfigError: The network can be connected, but the configurations are incorrect. Unreachable: The network cannot be connected. Unsupport: An error is reported due to other causes. For example, the desired resource group is being initialized.</p>
             * 
             * <strong>example:</strong>
             * <p>Connectable</p>
             */
            public Builder connectState(String connectState) {
                this.connectState = connectState;
                return this;
            }

            /**
             * <p>The detailed logs of each step in the connectivity test.</p>
             */
            public Builder detailLogs(java.util.List<DetailLogs> detailLogs) {
                this.detailLogs = detailLogs;
                return this;
            }

            public Connectivity build() {
                return new Connectivity(this);
            } 

        } 

    }
}
