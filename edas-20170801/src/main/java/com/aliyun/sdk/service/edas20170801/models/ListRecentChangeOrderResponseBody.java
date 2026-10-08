// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.edas20170801.models;

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
 * {@link ListRecentChangeOrderResponseBody} extends {@link TeaModel}
 *
 * <p>ListRecentChangeOrderResponseBody</p>
 */
public class ListRecentChangeOrderResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ChangeOrderList")
    private ChangeOrderList changeOrderList;

    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(ListRecentChangeOrderResponseBody model) {
            this.changeOrderList = model.changeOrderList;
            this.code = model.code;
            this.message = model.message;
            this.requestId = model.requestId;
        } 

        /**
         * ChangeOrderList.
         */
        public Builder changeOrderList(ChangeOrderList changeOrderList) {
            this.changeOrderList = changeOrderList;
            return this;
        }

        /**
         * <p>The HTTP status code that is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The additional information that is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>D16979DC-4D42-************</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListRecentChangeOrderResponseBody build() {
            return new ListRecentChangeOrderResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListRecentChangeOrderResponseBody} extends {@link TeaModel}
     *
     * <p>ListRecentChangeOrderResponseBody</p>
     */
    public static class ChangeOrder extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppId")
        private String appId;

        @com.aliyun.core.annotation.NameInMap("BatchCount")
        private Integer batchCount;

        @com.aliyun.core.annotation.NameInMap("BatchType")
        private String batchType;

        @com.aliyun.core.annotation.NameInMap("ChangeOrderDescription")
        private String changeOrderDescription;

        @com.aliyun.core.annotation.NameInMap("ChangeOrderId")
        private String changeOrderId;

        @com.aliyun.core.annotation.NameInMap("CoType")
        private String coType;

        @com.aliyun.core.annotation.NameInMap("CoTypeCode")
        private String coTypeCode;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("CreateUserId")
        private String createUserId;

        @com.aliyun.core.annotation.NameInMap("FinishTime")
        private String finishTime;

        @com.aliyun.core.annotation.NameInMap("GroupId")
        private String groupId;

        @com.aliyun.core.annotation.NameInMap("Source")
        private String source;

        @com.aliyun.core.annotation.NameInMap("Status")
        private Integer status;

        @com.aliyun.core.annotation.NameInMap("UserId")
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

            private Builder() {
            } 

            private Builder(ChangeOrder model) {
                this.appId = model.appId;
                this.batchCount = model.batchCount;
                this.batchType = model.batchType;
                this.changeOrderDescription = model.changeOrderDescription;
                this.changeOrderId = model.changeOrderId;
                this.coType = model.coType;
                this.coTypeCode = model.coTypeCode;
                this.createTime = model.createTime;
                this.createUserId = model.createUserId;
                this.finishTime = model.finishTime;
                this.groupId = model.groupId;
                this.source = model.source;
                this.status = model.status;
                this.userId = model.userId;
            } 

            /**
             * AppId.
             */
            public Builder appId(String appId) {
                this.appId = appId;
                return this;
            }

            /**
             * BatchCount.
             */
            public Builder batchCount(Integer batchCount) {
                this.batchCount = batchCount;
                return this;
            }

            /**
             * BatchType.
             */
            public Builder batchType(String batchType) {
                this.batchType = batchType;
                return this;
            }

            /**
             * ChangeOrderDescription.
             */
            public Builder changeOrderDescription(String changeOrderDescription) {
                this.changeOrderDescription = changeOrderDescription;
                return this;
            }

            /**
             * ChangeOrderId.
             */
            public Builder changeOrderId(String changeOrderId) {
                this.changeOrderId = changeOrderId;
                return this;
            }

            /**
             * CoType.
             */
            public Builder coType(String coType) {
                this.coType = coType;
                return this;
            }

            /**
             * CoTypeCode.
             */
            public Builder coTypeCode(String coTypeCode) {
                this.coTypeCode = coTypeCode;
                return this;
            }

            /**
             * CreateTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * CreateUserId.
             */
            public Builder createUserId(String createUserId) {
                this.createUserId = createUserId;
                return this;
            }

            /**
             * FinishTime.
             */
            public Builder finishTime(String finishTime) {
                this.finishTime = finishTime;
                return this;
            }

            /**
             * GroupId.
             */
            public Builder groupId(String groupId) {
                this.groupId = groupId;
                return this;
            }

            /**
             * Source.
             */
            public Builder source(String source) {
                this.source = source;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * UserId.
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
    /**
     * 
     * {@link ListRecentChangeOrderResponseBody} extends {@link TeaModel}
     *
     * <p>ListRecentChangeOrderResponseBody</p>
     */
    public static class ChangeOrderList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ChangeOrder")
        private java.util.List<ChangeOrder> changeOrder;

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
        public java.util.List<ChangeOrder> getChangeOrder() {
            return this.changeOrder;
        }

        public static final class Builder {
            private java.util.List<ChangeOrder> changeOrder; 

            private Builder() {
            } 

            private Builder(ChangeOrderList model) {
                this.changeOrder = model.changeOrder;
            } 

            /**
             * ChangeOrder.
             */
            public Builder changeOrder(java.util.List<ChangeOrder> changeOrder) {
                this.changeOrder = changeOrder;
                return this;
            }

            public ChangeOrderList build() {
                return new ChangeOrderList(this);
            } 

        } 

    }
}
