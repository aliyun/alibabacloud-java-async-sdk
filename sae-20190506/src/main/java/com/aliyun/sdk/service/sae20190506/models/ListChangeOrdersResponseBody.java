// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sae20190506.models;

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
 * {@link ListChangeOrdersResponseBody} extends {@link TeaModel}
 *
 * <p>ListChangeOrdersResponseBody</p>
 */
public class ListChangeOrdersResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("ErrorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("TraceId")
    private String traceId;

    private ListChangeOrdersResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.errorCode = builder.errorCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.traceId = builder.traceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListChangeOrdersResponseBody create() {
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
     * @return errorCode
     */
    public String getErrorCode() {
        return this.errorCode;
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

    /**
     * @return traceId
     */
    public String getTraceId() {
        return this.traceId;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private String errorCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 
        private String traceId; 

        /**
         * <p>Indicates whether the list of change orders was obtained. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: indicates that the list was obtained.</li>
         * <li><strong>false</strong>: indicates that the list could not be obtained.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The number of the returned page.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The HTTP status code. Valid values:</p>
         * <ul>
         * <li><strong>2xx</strong>: indicates that the request was successful.</li>
         * <li><strong>3xx</strong>: indicates that the request was redirected.</li>
         * <li><strong>4xx</strong>: indicates that the request was invalid.</li>
         * <li><strong>5xx</strong>: indicates that a server error occurred.</li>
         * </ul>
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * <p>The ID of the trace. It is used to query the details of a request.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The returned message.</p>
         * 
         * <strong>example:</strong>
         * <p>65E1F-43BA-4D0C-8E61-E4D1337F****</p>
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

        /**
         * <p>The information about change orders.</p>
         * 
         * <strong>example:</strong>
         * <p>0bb6f815638568884597879d****</p>
         */
        public Builder traceId(String traceId) {
            this.traceId = traceId;
            return this;
        }

        public ListChangeOrdersResponseBody build() {
            return new ListChangeOrdersResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListChangeOrdersResponseBody} extends {@link TeaModel}
     *
     * <p>ListChangeOrdersResponseBody</p>
     */
    public static class ChangeOrderList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppId")
        private String appId;

        @com.aliyun.core.annotation.NameInMap("BatchCount")
        private Integer batchCount;

        @com.aliyun.core.annotation.NameInMap("BatchType")
        private String batchType;

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

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

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

        private ChangeOrderList(Builder builder) {
            this.appId = builder.appId;
            this.batchCount = builder.batchCount;
            this.batchType = builder.batchType;
            this.changeOrderId = builder.changeOrderId;
            this.coType = builder.coType;
            this.coTypeCode = builder.coTypeCode;
            this.createTime = builder.createTime;
            this.createUserId = builder.createUserId;
            this.description = builder.description;
            this.finishTime = builder.finishTime;
            this.groupId = builder.groupId;
            this.source = builder.source;
            this.status = builder.status;
            this.userId = builder.userId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ChangeOrderList create() {
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
         * @return description
         */
        public String getDescription() {
            return this.description;
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
            private String changeOrderId; 
            private String coType; 
            private String coTypeCode; 
            private String createTime; 
            private String createUserId; 
            private String description; 
            private String finishTime; 
            private String groupId; 
            private String source; 
            private Integer status; 
            private String userId; 

            /**
             * <p>The number of entries returned on each page.</p>
             * 
             * <strong>example:</strong>
             * <p>164341c-9708-4967-b3ec-24933767****</p>
             */
            public Builder appId(String appId) {
                this.appId = appId;
                return this;
            }

            /**
             * <p>The ID of the user who created the change order.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder batchCount(Integer batchCount) {
                this.batchCount = batchCount;
                return this;
            }

            /**
             * <p>The ID of the group.</p>
             * 
             * <strong>example:</strong>
             * <p>auto</p>
             */
            public Builder batchType(String batchType) {
                this.batchType = batchType;
                return this;
            }

            /**
             * <p>The mode in which the release batches are determined. Valid values:</p>
             * <ul>
             * <li><strong>auto</strong>: SAE automatically determines the release batches.</li>
             * <li><strong>manual</strong>: You must manually determine the release batches.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>7fa5c0-9ebb-4bb4-b383-1f885447****</p>
             */
            public Builder changeOrderId(String changeOrderId) {
                this.changeOrderId = changeOrderId;
                return this;
            }

            /**
             * <p>The ID of the application.</p>
             */
            public Builder coType(String coType) {
                this.coType = coType;
                return this;
            }

            /**
             * <p>The ID of the change order.</p>
             * 
             * <strong>example:</strong>
             * <p>CoCreateApp</p>
             */
            public Builder coTypeCode(String coTypeCode) {
                this.coTypeCode = coTypeCode;
                return this;
            }

            /**
             * <p>The ID of the user.</p>
             * 
             * <strong>example:</strong>
             * <p>2019-07-11 15:54:49</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The code of the change type. Valid values:</p>
             * <ul>
             * <li><strong>CoBindSlb</strong>: associates an SLB instance with the application.</li>
             * <li><strong>CoUnbindSlb</strong>: disassociates the SLB instance from the application.</li>
             * <li><strong>CoCreateApp</strong>: creates the application.</li>
             * <li><strong>CoDeleteApp</strong>: deletes the application.</li>
             * <li><strong>CoDeploy</strong>: deploys the application.</li>
             * <li><strong>CoRestartApplication</strong>: restarts the application.</li>
             * <li><strong>CoRollback</strong>: rolls back the application.</li>
             * <li><strong>CoScaleIn</strong>: scales in the application.</li>
             * <li><strong>CoScaleOut</strong>: scales out the application.</li>
             * <li><strong>CoStart</strong>: starts the application.</li>
             * <li><strong>CoStop</strong>: stops the application.</li>
             * <li><strong>CoRescaleApplicationVertically</strong>: modifies the instance specifications.</li>
             * <li><strong>CoDeployHistroy</strong>: rolls back the application to a historical version.</li>
             * <li><strong>CoBindNas</strong>: associates a NAS file system with the application.</li>
             * <li><strong>CoUnbindNas</strong>: disassociates the NAS file system from the application.</li>
             * <li><strong>CoBatchStartApplication</strong>: starts multiple applications concurrently.</li>
             * <li><strong>CoBatchStopApplication</strong>: stops multiple applications concurrently.</li>
             * <li><strong>CoRestartInstances</strong>: restarts the instances.</li>
             * <li><strong>CoDeleteInstances</strong>: deletes the instances.</li>
             * <li><strong>CoScaleInAppWithInstances</strong>: reduces the number of the specified application instances.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>sae-beta-test</p>
             */
            public Builder createUserId(String createUserId) {
                this.createUserId = createUserId;
                return this;
            }

            /**
             * <p>The change type, which corresponds to the <strong>CoTypeCode</strong> parameter.</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The time when the change order was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2019-07-11 20:12:58</p>
             */
            public Builder finishTime(String finishTime) {
                this.finishTime = finishTime;
                return this;
            }

            /**
             * <p>The description about the application.</p>
             * 
             * <strong>example:</strong>
             * <p>c9ecd2-cf6c-46c3-9f20-525de202****</p>
             */
            public Builder groupId(String groupId) {
                this.groupId = groupId;
                return this;
            }

            /**
             * <p>The number of release batches.</p>
             * 
             * <strong>example:</strong>
             * <p>console</p>
             */
            public Builder source(String source) {
                this.source = source;
                return this;
            }

            /**
             * <p>The time when the change order was completed.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The source of the change order.</p>
             * 
             * <strong>example:</strong>
             * <p>sae-beta-test</p>
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            public ChangeOrderList build() {
                return new ChangeOrderList(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListChangeOrdersResponseBody} extends {@link TeaModel}
     *
     * <p>ListChangeOrdersResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ChangeOrderList")
        private java.util.List<ChangeOrderList> changeOrderList;

        @com.aliyun.core.annotation.NameInMap("CurrentPage")
        private Integer currentPage;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("TotalSize")
        private Integer totalSize;

        private Data(Builder builder) {
            this.changeOrderList = builder.changeOrderList;
            this.currentPage = builder.currentPage;
            this.pageSize = builder.pageSize;
            this.totalSize = builder.totalSize;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return changeOrderList
         */
        public java.util.List<ChangeOrderList> getChangeOrderList() {
            return this.changeOrderList;
        }

        /**
         * @return currentPage
         */
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        /**
         * @return pageSize
         */
        public Integer getPageSize() {
            return this.pageSize;
        }

        /**
         * @return totalSize
         */
        public Integer getTotalSize() {
            return this.totalSize;
        }

        public static final class Builder {
            private java.util.List<ChangeOrderList> changeOrderList; 
            private Integer currentPage; 
            private Integer pageSize; 
            private Integer totalSize; 

            /**
             * <p>The status of the change order. Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: The change order is being prepared.</li>
             * <li><strong>1</strong>: The change order is being executed.</li>
             * <li><strong>2</strong>: The change order was executed.</li>
             * <li><strong>3</strong>: The change order could not be executed.</li>
             * <li><strong>6</strong>: The change order was terminated.</li>
             * <li><strong>8</strong>: The execution process is pending. You must manually determine the release batch.</li>
             * <li><strong>9</strong>: The execution process is pending. SAE will automatically determine the release batch.</li>
             * <li><strong>10</strong>: The change order could not be executed due to a system exception.</li>
             * <li><strong>11</strong>: The change order is pending approval.</li>
             * <li><strong>12</strong>: The change order is approved and is pending execution.</li>
             * </ul>
             */
            public Builder changeOrderList(java.util.List<ChangeOrderList> changeOrderList) {
                this.changeOrderList = changeOrderList;
                return this;
            }

            /**
             * <p>The total number of change orders.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder currentPage(Integer currentPage) {
                this.currentPage = currentPage;
                return this;
            }

            /**
             * <p>The error code.</p>
             * <ul>
             * <li>The <strong>ErrorCode</strong> parameter is not returned when the request succeeds.</li>
             * <li>The <strong>ErrorCode</strong> parameter is returned when the request fails. For more information, see <strong>Error codes</strong> in this topic.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * <p>The list of change orders.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder totalSize(Integer totalSize) {
                this.totalSize = totalSize;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
