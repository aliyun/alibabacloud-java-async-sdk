// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dbs20190306.models;

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
 * {@link DescribePreCheckProgressListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribePreCheckProgressListResponseBody</p>
 */
public class DescribePreCheckProgressListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ErrCode")
    private String errCode;

    @com.aliyun.core.annotation.NameInMap("ErrMessage")
    private String errMessage;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Items")
    private Items items;

    @com.aliyun.core.annotation.NameInMap("Progress")
    private Integer progress;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private DescribePreCheckProgressListResponseBody(Builder builder) {
        this.errCode = builder.errCode;
        this.errMessage = builder.errMessage;
        this.httpStatusCode = builder.httpStatusCode;
        this.items = builder.items;
        this.progress = builder.progress;
        this.requestId = builder.requestId;
        this.status = builder.status;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribePreCheckProgressListResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return errCode
     */
    public String getErrCode() {
        return this.errCode;
    }

    /**
     * @return errMessage
     */
    public String getErrMessage() {
        return this.errMessage;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    /**
     * @return items
     */
    public Items getItems() {
        return this.items;
    }

    /**
     * @return progress
     */
    public Integer getProgress() {
        return this.progress;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String errCode; 
        private String errMessage; 
        private Integer httpStatusCode; 
        private Items items; 
        private Integer progress; 
        private String requestId; 
        private String status; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(DescribePreCheckProgressListResponseBody model) {
            this.errCode = model.errCode;
            this.errMessage = model.errMessage;
            this.httpStatusCode = model.httpStatusCode;
            this.items = model.items;
            this.progress = model.progress;
            this.requestId = model.requestId;
            this.status = model.status;
            this.success = model.success;
        } 

        /**
         * <p>The error code.</p>
         * 
         * <strong>example:</strong>
         * <p>Param.NotFound</p>
         */
        public Builder errCode(String errCode) {
            this.errCode = errCode;
            return this;
        }

        /**
         * <p>The error message.</p>
         * 
         * <strong>example:</strong>
         * <p>The specified parameter %s value is not valid.</p>
         */
        public Builder errMessage(String errMessage) {
            this.errMessage = errMessage;
            return this;
        }

        /**
         * <p>The HTTP status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>The details of check items.</p>
         */
        public Builder items(Items items) {
            this.items = items;
            return this;
        }

        /**
         * <p>The precheck progress. Valid values: 0 to 100.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder progress(Integer progress) {
            this.progress = progress;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>C4A45FE1-A903-470D-B113-F12A4DF942AB</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The status of the precheck. Valid values:</p>
         * <ul>
         * <li><strong>running</strong>: The precheck is in progress.</li>
         * <li><strong>failed</strong>: The precheck failed.</li>
         * <li><strong>finish</strong>: The precheck is complete.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>failed</p>
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public DescribePreCheckProgressListResponseBody build() {
            return new DescribePreCheckProgressListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribePreCheckProgressListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribePreCheckProgressListResponseBody</p>
     */
    public static class PreCheckProgressDetail extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BootTime")
        private Long bootTime;

        @com.aliyun.core.annotation.NameInMap("ErrMsg")
        private String errMsg;

        @com.aliyun.core.annotation.NameInMap("FinishTime")
        private Long finishTime;

        @com.aliyun.core.annotation.NameInMap("Item")
        private String item;

        @com.aliyun.core.annotation.NameInMap("JobId")
        private String jobId;

        @com.aliyun.core.annotation.NameInMap("Names")
        private String names;

        @com.aliyun.core.annotation.NameInMap("OrderNum")
        private String orderNum;

        @com.aliyun.core.annotation.NameInMap("State")
        private String state;

        private PreCheckProgressDetail(Builder builder) {
            this.bootTime = builder.bootTime;
            this.errMsg = builder.errMsg;
            this.finishTime = builder.finishTime;
            this.item = builder.item;
            this.jobId = builder.jobId;
            this.names = builder.names;
            this.orderNum = builder.orderNum;
            this.state = builder.state;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PreCheckProgressDetail create() {
            return builder().build();
        }

        /**
         * @return bootTime
         */
        public Long getBootTime() {
            return this.bootTime;
        }

        /**
         * @return errMsg
         */
        public String getErrMsg() {
            return this.errMsg;
        }

        /**
         * @return finishTime
         */
        public Long getFinishTime() {
            return this.finishTime;
        }

        /**
         * @return item
         */
        public String getItem() {
            return this.item;
        }

        /**
         * @return jobId
         */
        public String getJobId() {
            return this.jobId;
        }

        /**
         * @return names
         */
        public String getNames() {
            return this.names;
        }

        /**
         * @return orderNum
         */
        public String getOrderNum() {
            return this.orderNum;
        }

        /**
         * @return state
         */
        public String getState() {
            return this.state;
        }

        public static final class Builder {
            private Long bootTime; 
            private String errMsg; 
            private Long finishTime; 
            private String item; 
            private String jobId; 
            private String names; 
            private String orderNum; 
            private String state; 

            private Builder() {
            } 

            private Builder(PreCheckProgressDetail model) {
                this.bootTime = model.bootTime;
                this.errMsg = model.errMsg;
                this.finishTime = model.finishTime;
                this.item = model.item;
                this.jobId = model.jobId;
                this.names = model.names;
                this.orderNum = model.orderNum;
                this.state = model.state;
            } 

            /**
             * <p>The time when the check for the item started. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>1583734969000</p>
             */
            public Builder bootTime(Long bootTime) {
                this.bootTime = bootTime;
                return this;
            }

            /**
             * <p>The error message.</p>
             * 
             * <strong>example:</strong>
             * <p>java.lang.RuntimeException: Could not find any schema ......</p>
             */
            public Builder errMsg(String errMsg) {
                this.errMsg = errMsg;
                return this;
            }

            /**
             * <p>The time when the check for the item was complete. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>1583734969000</p>
             */
            public Builder finishTime(Long finishTime) {
                this.finishTime = finishTime;
                return this;
            }

            /**
             * <p>The name of the check item.</p>
             * 
             * <strong>example:</strong>
             * <p>CHECK_OTHER</p>
             */
            public Builder item(String item) {
                this.item = item;
                return this;
            }

            /**
             * <p>The ID of the job for the check item.</p>
             * 
             * <strong>example:</strong>
             * <p>uvk8f6fxnq5s</p>
             */
            public Builder jobId(String jobId) {
                this.jobId = jobId;
                return this;
            }

            /**
             * <p>The name of the group to which the check item belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>CHECK_OTHER</p>
             */
            public Builder names(String names) {
                this.names = names;
                return this;
            }

            /**
             * <p>The sequence number of the check item.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder orderNum(String orderNum) {
                this.orderNum = orderNum;
                return this;
            }

            /**
             * <p>The state of the check for the item. Valid values:</p>
             * <ul>
             * <li><strong>init</strong>: The check for the item is being initialized.</li>
             * <li><strong>warning</strong>: A warning is reported.</li>
             * <li><strong>catched</strong>: An exception occurs.</li>
             * <li><strong>running</strong>: The check for the item is in progress.</li>
             * <li><strong>failed</strong>: The check for the item fails.</li>
             * <li><strong>finish</strong>: The check for the item is completed.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>warning</p>
             */
            public Builder state(String state) {
                this.state = state;
                return this;
            }

            public PreCheckProgressDetail build() {
                return new PreCheckProgressDetail(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribePreCheckProgressListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribePreCheckProgressListResponseBody</p>
     */
    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PreCheckProgressDetail")
        private java.util.List<PreCheckProgressDetail> preCheckProgressDetail;

        private Items(Builder builder) {
            this.preCheckProgressDetail = builder.preCheckProgressDetail;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
        }

        /**
         * @return preCheckProgressDetail
         */
        public java.util.List<PreCheckProgressDetail> getPreCheckProgressDetail() {
            return this.preCheckProgressDetail;
        }

        public static final class Builder {
            private java.util.List<PreCheckProgressDetail> preCheckProgressDetail; 

            private Builder() {
            } 

            private Builder(Items model) {
                this.preCheckProgressDetail = model.preCheckProgressDetail;
            } 

            /**
             * PreCheckProgressDetail.
             */
            public Builder preCheckProgressDetail(java.util.List<PreCheckProgressDetail> preCheckProgressDetail) {
                this.preCheckProgressDetail = preCheckProgressDetail;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
}
