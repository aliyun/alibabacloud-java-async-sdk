// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mssp20161228.models;

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
 * {@link CreateServiceWorkOrderResponseBody} extends {@link TeaModel}
 *
 * <p>CreateServiceWorkOrderResponseBody</p>
 */
public class CreateServiceWorkOrderResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private CreateServiceWorkOrderResponseBody(Builder builder) {
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

    public static CreateServiceWorkOrderResponseBody create() {
        return builder().build();
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

        /**
         * <p>Interface status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>Data returned by the interface.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>HTTP status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>The prompt message of the returned result.</p>
         * 
         * <strong>example:</strong>
         * <p>successful</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>Request ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>7DC44321-7AAE-51CD-8E5F-CEB968569042</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Whether the call was successful.</p>
         * <ul>
         * <li><strong>true</strong>: The call was successful. - <strong>false</strong>: The call failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public CreateServiceWorkOrderResponseBody build() {
            return new CreateServiceWorkOrderResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CreateServiceWorkOrderResponseBody} extends {@link TeaModel}
     *
     * <p>CreateServiceWorkOrderResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CompleteTime")
        private Long completeTime;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private Long createTime;

        @com.aliyun.core.annotation.NameInMap("Creator")
        private String creator;

        @com.aliyun.core.annotation.NameInMap("CustomerId")
        private String customerId;

        @com.aliyun.core.annotation.NameInMap("EndTime")
        private Long endTime;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("OwnerId")
        private String ownerId;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private Long startTime;

        @com.aliyun.core.annotation.NameInMap("WorkOrderDetail")
        private String workOrderDetail;

        @com.aliyun.core.annotation.NameInMap("WorkOrderName")
        private String workOrderName;

        @com.aliyun.core.annotation.NameInMap("WorkOrderSource")
        private String workOrderSource;

        @com.aliyun.core.annotation.NameInMap("WorkOrderStatus")
        private String workOrderStatus;

        @com.aliyun.core.annotation.NameInMap("WorkOrderType")
        private String workOrderType;

        private Data(Builder builder) {
            this.completeTime = builder.completeTime;
            this.createTime = builder.createTime;
            this.creator = builder.creator;
            this.customerId = builder.customerId;
            this.endTime = builder.endTime;
            this.id = builder.id;
            this.ownerId = builder.ownerId;
            this.startTime = builder.startTime;
            this.workOrderDetail = builder.workOrderDetail;
            this.workOrderName = builder.workOrderName;
            this.workOrderSource = builder.workOrderSource;
            this.workOrderStatus = builder.workOrderStatus;
            this.workOrderType = builder.workOrderType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return completeTime
         */
        public Long getCompleteTime() {
            return this.completeTime;
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return creator
         */
        public String getCreator() {
            return this.creator;
        }

        /**
         * @return customerId
         */
        public String getCustomerId() {
            return this.customerId;
        }

        /**
         * @return endTime
         */
        public Long getEndTime() {
            return this.endTime;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return ownerId
         */
        public String getOwnerId() {
            return this.ownerId;
        }

        /**
         * @return startTime
         */
        public Long getStartTime() {
            return this.startTime;
        }

        /**
         * @return workOrderDetail
         */
        public String getWorkOrderDetail() {
            return this.workOrderDetail;
        }

        /**
         * @return workOrderName
         */
        public String getWorkOrderName() {
            return this.workOrderName;
        }

        /**
         * @return workOrderSource
         */
        public String getWorkOrderSource() {
            return this.workOrderSource;
        }

        /**
         * @return workOrderStatus
         */
        public String getWorkOrderStatus() {
            return this.workOrderStatus;
        }

        /**
         * @return workOrderType
         */
        public String getWorkOrderType() {
            return this.workOrderType;
        }

        public static final class Builder {
            private Long completeTime; 
            private Long createTime; 
            private String creator; 
            private String customerId; 
            private Long endTime; 
            private Long id; 
            private String ownerId; 
            private Long startTime; 
            private String workOrderDetail; 
            private String workOrderName; 
            private String workOrderSource; 
            private String workOrderStatus; 
            private String workOrderType; 

            /**
             * <p>Completion time.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-03-07 16:45:01</p>
             */
            public Builder completeTime(Long completeTime) {
                this.completeTime = completeTime;
                return this;
            }

            /**
             * <p>Creation time.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-10-04T02:19:55Z</p>
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>Creator.</p>
             * 
             * <strong>example:</strong>
             * <p>426556</p>
             */
            public Builder creator(String creator) {
                this.creator = creator;
                return this;
            }

            /**
             * <p>Customer ID.</p>
             * 
             * <strong>example:</strong>
             * <p>1477832102462645</p>
             */
            public Builder customerId(String customerId) {
                this.customerId = customerId;
                return this;
            }

            /**
             * <p>End time.</p>
             * 
             * <strong>example:</strong>
             * <p>24-03-11 00:00:00</p>
             */
            public Builder endTime(Long endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * <p>Primary key.</p>
             * 
             * <strong>example:</strong>
             * <p>1978941</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>Owner.</p>
             * 
             * <strong>example:</strong>
             * <p>426556</p>
             */
            public Builder ownerId(String ownerId) {
                this.ownerId = ownerId;
                return this;
            }

            /**
             * <p>Start time.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-01-21 15:25:25</p>
             */
            public Builder startTime(Long startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * <p>Work order details.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;questionDetail&quot;:&quot;测试工单&quot;,&quot;answerDetail&quot;:&quot;&quot;}</p>
             */
            public Builder workOrderDetail(String workOrderDetail) {
                this.workOrderDetail = workOrderDetail;
                return this;
            }

            /**
             * <p>Work order name.</p>
             * 
             * <strong>example:</strong>
             * <p>安全月报交付任务</p>
             */
            public Builder workOrderName(String workOrderName) {
                this.workOrderName = workOrderName;
                return this;
            }

            /**
             * <p>Work order source.</p>
             * 
             * <strong>example:</strong>
             * <p>工单迁移</p>
             */
            public Builder workOrderSource(String workOrderSource) {
                this.workOrderSource = workOrderSource;
                return this;
            }

            /**
             * <p>Work order status.</p>
             * 
             * <strong>example:</strong>
             * <p>UNPROCESSED</p>
             */
            public Builder workOrderStatus(String workOrderStatus) {
                this.workOrderStatus = workOrderStatus;
                return this;
            }

            /**
             * <p>Work order type.</p>
             * 
             * <strong>example:</strong>
             * <p>MONTH_REPORT</p>
             */
            public Builder workOrderType(String workOrderType) {
                this.workOrderType = workOrderType;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
