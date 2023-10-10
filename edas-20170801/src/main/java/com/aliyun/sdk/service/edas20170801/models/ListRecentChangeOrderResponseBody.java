// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.edas20170801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListRecentChangeOrderResponseBody} extends {@link TeaModel}
 *
 * <p>ListRecentChangeOrderResponseBody</p>
 */
public class ListRecentChangeOrderResponseBody extends TeaModel {
    @NameInMap("ChangeOrderList")
    private ChangeOrderList changeOrderList;

    @NameInMap("Code")
    private Integer code;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    private ListRecentChangeOrderResponseBody(Builder builder) {
        this.changeOrderList = builder.changeOrderList;
        this.code = builder.code;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListRecentChangeOrderResponseBody create() {
        return builder().build();
    }

    /**
     * @return changeOrderList
     */
    public ChangeOrderList getChangeOrderList() {
        return this.changeOrderList;
    }

    /**
     * @return code
     */
    public Integer getCode() {
        return this.code;
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

    public static final class Builder {
        private ChangeOrderList changeOrderList; 
        private Integer code; 
        private String message; 
        private String requestId; 

        /**
         * The information about change processes.
         */
        public Builder changeOrderList(ChangeOrderList changeOrderList) {
            this.changeOrderList = changeOrderList;
            return this;
        }

        /**
         * The HTTP status code that is returned.
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * The additional information that is returned.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListRecentChangeOrderResponseBody build() {
            return new ListRecentChangeOrderResponseBody(this);
        } 

    } 

    public static class ChangeOrder extends TeaModel {
        @NameInMap("AppId")
        private String appId;

        @NameInMap("BatchCount")
        private Integer batchCount;

        @NameInMap("BatchType")
        private String batchType;

        @NameInMap("ChangeOrderDescription")
        private String changeOrderDescription;

        @NameInMap("ChangeOrderId")
        private String changeOrderId;

        @NameInMap("CoType")
        private String coType;

        @NameInMap("CoTypeCode")
        private String coTypeCode;

        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("CreateUserId")
        private String createUserId;

        @NameInMap("FinishTime")
        private String finishTime;

        @NameInMap("GroupId")
        private String groupId;

        @NameInMap("Source")
        private String source;

        @NameInMap("Status")
        private Integer status;

        @NameInMap("UserId")
        private String userId;

        private ChangeOrder(Builder builder) {
            this.appId = builder.appId;
            this.batchCount = builder.batchCount;
            this.batchType = builder.batchType;
            this.changeOrderDescription = builder.changeOrderDescription;
            this.changeOrderId = builder.changeOrderId;
            this.coType = builder.coType;
            this.coTypeCode = builder.coTypeCode;
            this.createTime = builder.createTime;
            this.createUserId = builder.createUserId;
            this.finishTime = builder.finishTime;
            this.groupId = builder.groupId;
            this.source = builder.source;
            this.status = builder.status;
            this.userId = builder.userId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ChangeOrder create() {
            return builder().build();
        }

        /**
         * @return appId
         */
        public String getAppId() {
            return this.appId;
        }

        /**
         * @return batchCount
         */
        public Integer getBatchCount() {
            return this.batchCount;
        }

        /**
         * @return batchType
         */
        public String getBatchType() {
            return this.batchType;
        }

        /**
         * @return changeOrderDescription
         */
        public String getChangeOrderDescription() {
            return this.changeOrderDescription;
        }

        /**
         * @return changeOrderId
         */
        public String getChangeOrderId() {
            return this.changeOrderId;
        }

        /**
         * @return coType
         */
        public String getCoType() {
            return this.coType;
        }

        /**
         * @return coTypeCode
         */
        public String getCoTypeCode() {
            return this.coTypeCode;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return createUserId
         */
        public String getCreateUserId() {
            return this.createUserId;
        }

        /**
         * @return finishTime
         */
        public String getFinishTime() {
            return this.finishTime;
        }

        /**
         * @return groupId
         */
        public String getGroupId() {
            return this.groupId;
        }

        /**
         * @return source
         */
        public String getSource() {
            return this.source;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        public static final class Builder {
            private String appId; 
            private Integer batchCount; 
            private String batchType; 
            private String changeOrderDescription; 
            private String changeOrderId; 
            private String coType; 
            private String coTypeCode; 
            private String createTime; 
            private String createUserId; 
            private String finishTime; 
            private String groupId; 
            private String source; 
            private Integer status; 
            private String userId; 

            /**
             * The ID of the application.
             */
            public Builder appId(String appId) {
                this.appId = appId;
                return this;
            }

            /**
             * The number of batches for the change. Valid values: 1 to 5.
             */
            public Builder batchCount(Integer batchCount) {
                this.batchCount = batchCount;
                return this;
            }

            /**
             * The way in which the next batch is triggered during a phased release. Valid values:
             * <p>
             * 
             * *   Automatic
             * *   Manual
             */
            public Builder batchType(String batchType) {
                this.batchType = batchType;
                return this;
            }

            /**
             * The description of the change process.
             */
            public Builder changeOrderDescription(String changeOrderDescription) {
                this.changeOrderDescription = changeOrderDescription;
                return this;
            }

            /**
             * The unique ID of the change process.
             */
            public Builder changeOrderId(String changeOrderId) {
                this.changeOrderId = changeOrderId;
                return this;
            }

            /**
             * The type of the change process.
             */
            public Builder coType(String coType) {
                this.coType = coType;
                return this;
            }

            /**
             * The type of the change process.
             */
            public Builder coTypeCode(String coTypeCode) {
                this.coTypeCode = coTypeCode;
                return this;
            }

            /**
             * The time when the change process was created.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * The user who created the change process.
             */
            public Builder createUserId(String createUserId) {
                this.createUserId = createUserId;
                return this;
            }

            /**
             * The time when the change process ended.
             */
            public Builder finishTime(String finishTime) {
                this.finishTime = finishTime;
                return this;
            }

            /**
             * The ID of the application instance group on which the change was performed.
             */
            public Builder groupId(String groupId) {
                this.groupId = groupId;
                return this;
            }

            /**
             * The source of the change. Valid values:
             * <p>
             * 
             * *   console: the Enterprise Distributed Application Service (EDAS) console
             * *   pop: the POP API or tool
             */
            public Builder source(String source) {
                this.source = source;
                return this;
            }

            /**
             * The state of the change process. Valid values:
             * <p>
             * 
             * *   0: ready to start execution
             * *   1: in progress
             * *   2: successful
             * *   3: failed
             * *   6: terminated
             * *   8: waiting for manual confirmation (You can see the state when you manually confirm the execution of the next batch of the change.)
             * *   9: waiting for automatic execution
             * *   10: failed due to a system error
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * The ID of the user who created the change process.
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            public ChangeOrder build() {
                return new ChangeOrder(this);
            } 

        } 

    }
    public static class ChangeOrderList extends TeaModel {
        @NameInMap("ChangeOrder")
        private java.util.List < ChangeOrder> changeOrder;

        private ChangeOrderList(Builder builder) {
            this.changeOrder = builder.changeOrder;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ChangeOrderList create() {
            return builder().build();
        }

        /**
         * @return changeOrder
         */
        public java.util.List < ChangeOrder> getChangeOrder() {
            return this.changeOrder;
        }

        public static final class Builder {
            private java.util.List < ChangeOrder> changeOrder; 

            /**
             * ChangeOrder.
             */
            public Builder changeOrder(java.util.List < ChangeOrder> changeOrder) {
                this.changeOrder = changeOrder;
                return this;
            }

            public ChangeOrderList build() {
                return new ChangeOrderList(this);
            } 

        } 

    }
}
