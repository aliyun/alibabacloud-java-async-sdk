// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dbs20190306.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribePreCheckProgressListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribePreCheckProgressListResponseBody</p>
 */
public class DescribePreCheckProgressListResponseBody extends TeaModel {
    @NameInMap("ErrCode")
    private String errCode;

    @NameInMap("ErrMessage")
    private String errMessage;

    @NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @NameInMap("Items")
    private Items items;

    @NameInMap("Progress")
    private Integer progress;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Status")
    private String status;

    @NameInMap("Success")
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

        /**
         * ErrCode.
         */
        public Builder errCode(String errCode) {
            this.errCode = errCode;
            return this;
        }

        /**
         * ErrMessage.
         */
        public Builder errMessage(String errMessage) {
            this.errMessage = errMessage;
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
         * Items.
         */
        public Builder items(Items items) {
            this.items = items;
            return this;
        }

        /**
         * Progress.
         */
        public Builder progress(Integer progress) {
            this.progress = progress;
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
         * Status.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public DescribePreCheckProgressListResponseBody build() {
            return new DescribePreCheckProgressListResponseBody(this);
        } 

    } 

    public static class PreCheckProgressDetail extends TeaModel {
        @NameInMap("BootTime")
        private Long bootTime;

        @NameInMap("ErrMsg")
        private String errMsg;

        @NameInMap("FinishTime")
        private Long finishTime;

        @NameInMap("Item")
        private String item;

        @NameInMap("JobId")
        private String jobId;

        @NameInMap("Names")
        private String names;

        @NameInMap("OrderNum")
        private String orderNum;

        @NameInMap("State")
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

            /**
             * BootTime.
             */
            public Builder bootTime(Long bootTime) {
                this.bootTime = bootTime;
                return this;
            }

            /**
             * ErrMsg.
             */
            public Builder errMsg(String errMsg) {
                this.errMsg = errMsg;
                return this;
            }

            /**
             * FinishTime.
             */
            public Builder finishTime(Long finishTime) {
                this.finishTime = finishTime;
                return this;
            }

            /**
             * Item.
             */
            public Builder item(String item) {
                this.item = item;
                return this;
            }

            /**
             * JobId.
             */
            public Builder jobId(String jobId) {
                this.jobId = jobId;
                return this;
            }

            /**
             * Names.
             */
            public Builder names(String names) {
                this.names = names;
                return this;
            }

            /**
             * OrderNum.
             */
            public Builder orderNum(String orderNum) {
                this.orderNum = orderNum;
                return this;
            }

            /**
             * State.
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
    public static class Items extends TeaModel {
        @NameInMap("PreCheckProgressDetail")
        private java.util.List < PreCheckProgressDetail> preCheckProgressDetail;

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
        public java.util.List < PreCheckProgressDetail> getPreCheckProgressDetail() {
            return this.preCheckProgressDetail;
        }

        public static final class Builder {
            private java.util.List < PreCheckProgressDetail> preCheckProgressDetail; 

            /**
             * PreCheckProgressDetail.
             */
            public Builder preCheckProgressDetail(java.util.List < PreCheckProgressDetail> preCheckProgressDetail) {
                this.preCheckProgressDetail = preCheckProgressDetail;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
}
