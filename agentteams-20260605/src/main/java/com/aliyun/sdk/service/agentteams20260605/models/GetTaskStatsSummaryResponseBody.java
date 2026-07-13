// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agentteams20260605.models;

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
 * {@link GetTaskStatsSummaryResponseBody} extends {@link TeaModel}
 *
 * <p>GetTaskStatsSummaryResponseBody</p>
 */
public class GetTaskStatsSummaryResponseBody extends TeaModel {
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

    private GetTaskStatsSummaryResponseBody(Builder builder) {
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

    public static GetTaskStatsSummaryResponseBody create() {
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

        private Builder(GetTaskStatsSummaryResponseBody model) {
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

        public GetTaskStatsSummaryResponseBody build() {
            return new GetTaskStatsSummaryResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetTaskStatsSummaryResponseBody} extends {@link TeaModel}
     *
     * <p>GetTaskStatsSummaryResponseBody</p>
     */
    public static class StatusDistribution extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Count")
        private Integer count;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private StatusDistribution(Builder builder) {
            this.count = builder.count;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static StatusDistribution create() {
            return builder().build();
        }

        /**
         * @return count
         */
        public Integer getCount() {
            return this.count;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private Integer count; 
            private String status; 

            private Builder() {
            } 

            private Builder(StatusDistribution model) {
                this.count = model.count;
                this.status = model.status;
            } 

            /**
             * Count.
             */
            public Builder count(Integer count) {
                this.count = count;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public StatusDistribution build() {
                return new StatusDistribution(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetTaskStatsSummaryResponseBody} extends {@link TeaModel}
     *
     * <p>GetTaskStatsSummaryResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AverageTaskDuration")
        private Double averageTaskDuration;

        @com.aliyun.core.annotation.NameInMap("StatusDistribution")
        private java.util.List<StatusDistribution> statusDistribution;

        @com.aliyun.core.annotation.NameInMap("TaskTokenConsumption")
        private Long taskTokenConsumption;

        @com.aliyun.core.annotation.NameInMap("TotalTasks")
        private Integer totalTasks;

        private Data(Builder builder) {
            this.averageTaskDuration = builder.averageTaskDuration;
            this.statusDistribution = builder.statusDistribution;
            this.taskTokenConsumption = builder.taskTokenConsumption;
            this.totalTasks = builder.totalTasks;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return averageTaskDuration
         */
        public Double getAverageTaskDuration() {
            return this.averageTaskDuration;
        }

        /**
         * @return statusDistribution
         */
        public java.util.List<StatusDistribution> getStatusDistribution() {
            return this.statusDistribution;
        }

        /**
         * @return taskTokenConsumption
         */
        public Long getTaskTokenConsumption() {
            return this.taskTokenConsumption;
        }

        /**
         * @return totalTasks
         */
        public Integer getTotalTasks() {
            return this.totalTasks;
        }

        public static final class Builder {
            private Double averageTaskDuration; 
            private java.util.List<StatusDistribution> statusDistribution; 
            private Long taskTokenConsumption; 
            private Integer totalTasks; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.averageTaskDuration = model.averageTaskDuration;
                this.statusDistribution = model.statusDistribution;
                this.taskTokenConsumption = model.taskTokenConsumption;
                this.totalTasks = model.totalTasks;
            } 

            /**
             * AverageTaskDuration.
             */
            public Builder averageTaskDuration(Double averageTaskDuration) {
                this.averageTaskDuration = averageTaskDuration;
                return this;
            }

            /**
             * StatusDistribution.
             */
            public Builder statusDistribution(java.util.List<StatusDistribution> statusDistribution) {
                this.statusDistribution = statusDistribution;
                return this;
            }

            /**
             * TaskTokenConsumption.
             */
            public Builder taskTokenConsumption(Long taskTokenConsumption) {
                this.taskTokenConsumption = taskTokenConsumption;
                return this;
            }

            /**
             * TotalTasks.
             */
            public Builder totalTasks(Integer totalTasks) {
                this.totalTasks = totalTasks;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
