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
         * <p>The information about change processes.</p>
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
             * <p>The ID of the application.</p>
             * 
             * <strong>example:</strong>
             * <p>3616cdca-4f92-4413-<strong><strong>-</strong></strong>********</p>
             */
            public Builder appId(String appId) {
                this.appId = appId;
                return this;
            }

            /**
             * <p>The number of batches for the change. Valid values: 1 to 5.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder batchCount(Integer batchCount) {
                this.batchCount = batchCount;
                return this;
            }

            /**
             * <p>The way in which the next batch is triggered during a phased release. Valid values:</p>
             * <ul>
             * <li>Automatic</li>
             * <li>Manual</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Automatic</p>
             */
            public Builder batchType(String batchType) {
                this.batchType = batchType;
                return this;
            }

            /**
             * <p>The description of the change process.</p>
             * 
             * <strong>example:</strong>
             * <p>Version: 2020-05-14 20:02:33 | Deployment Package: hsf-pandora-boot-provider-1.0.jar | Deploy to: all groups</p>
             */
            public Builder changeOrderDescription(String changeOrderDescription) {
                this.changeOrderDescription = changeOrderDescription;
                return this;
            }

            /**
             * <p>The unique ID of the change process.</p>
             * 
             * <strong>example:</strong>
             * <p>1074f3e2-e974-4a0e-<strong><strong>-</strong></strong>********</p>
             */
            public Builder changeOrderId(String changeOrderId) {
                this.changeOrderId = changeOrderId;
                return this;
            }

            /**
             * <p>The type of the change process.</p>
             * 
             * <strong>example:</strong>
             * <p>Application Scale Out</p>
             */
            public Builder coType(String coType) {
                this.coType = coType;
                return this;
            }

            /**
             * <p>The type of the change process.</p>
             * 
             * <strong>example:</strong>
             * <p>CoDeploy</p>
             */
            public Builder coTypeCode(String coTypeCode) {
                this.coTypeCode = coTypeCode;
                return this;
            }

            /**
             * <p>The time when the change process was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2019-11-13 14:23:46</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The user who created the change process.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="mailto:edas_test1@aliyun-test.com">edas_test1@aliyun-test.com</a></p>
             */
            public Builder createUserId(String createUserId) {
                this.createUserId = createUserId;
                return this;
            }

            /**
             * <p>The time when the change process ended.</p>
             * 
             * <strong>example:</strong>
             * <p>2019-11-13 14:24:02</p>
             */
            public Builder finishTime(String finishTime) {
                this.finishTime = finishTime;
                return this;
            }

            /**
             * <p>The ID of the application instance group on which the change was performed.</p>
             * 
             * <strong>example:</strong>
             * <p>8123db90-880f-486f-<strong><strong>-</strong></strong>********</p>
             */
            public Builder groupId(String groupId) {
                this.groupId = groupId;
                return this;
            }

            /**
             * <p>The source of the change. Valid values:</p>
             * <ul>
             * <li>console: the Enterprise Distributed Application Service (EDAS) console</li>
             * <li>pop: the POP API or tool</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>pop</p>
             */
            public Builder source(String source) {
                this.source = source;
                return this;
            }

            /**
             * <p>The state of the change process. Valid values:</p>
             * <ul>
             * <li>0: ready to start execution</li>
             * <li>1: in progress</li>
             * <li>2: successful</li>
             * <li>3: failed</li>
             * <li>6: terminated</li>
             * <li>8: waiting for manual confirmation (You can see the state when you manually confirm the execution of the next batch of the change.)</li>
             * <li>9: waiting for automatic execution</li>
             * <li>10: failed due to a system error</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The ID of the user who created the change process.</p>
             * 
             * <strong>example:</strong>
             * <p>1432536****</p>
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
