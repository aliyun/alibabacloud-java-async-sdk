// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.companyreg20200306.models;

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
 * {@link ListUserProduceOperateLogsResponseBody} extends {@link TeaModel}
 *
 * <p>ListUserProduceOperateLogsResponseBody</p>
 */
public class ListUserProduceOperateLogsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("PageNum")
    private Integer pageNum;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("TotalItemNum")
    private Integer totalItemNum;

    @com.aliyun.core.annotation.NameInMap("TotalPageNum")
    private Integer totalPageNum;

    private ListUserProduceOperateLogsResponseBody(Builder builder) {
        this.data = builder.data;
        this.pageNum = builder.pageNum;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.totalItemNum = builder.totalItemNum;
        this.totalPageNum = builder.totalPageNum;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListUserProduceOperateLogsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public java.util.List<Data> getData() {
        return this.data;
    }

    /**
     * @return pageNum
     */
    public Integer getPageNum() {
        return this.pageNum;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
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
     * @return totalItemNum
     */
    public Integer getTotalItemNum() {
        return this.totalItemNum;
    }

    /**
     * @return totalPageNum
     */
    public Integer getTotalPageNum() {
        return this.totalPageNum;
    }

    public static final class Builder {
        private java.util.List<Data> data; 
        private Integer pageNum; 
        private Integer pageSize; 
        private String requestId; 
        private Boolean success; 
        private Integer totalItemNum; 
        private Integer totalPageNum; 

        private Builder() {
        } 

        private Builder(ListUserProduceOperateLogsResponseBody model) {
            this.data = model.data;
            this.pageNum = model.pageNum;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.success = model.success;
            this.totalItemNum = model.totalItemNum;
            this.totalPageNum = model.totalPageNum;
        } 

        /**
         * Data.
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * PageNum.
         */
        public Builder pageNum(Integer pageNum) {
            this.pageNum = pageNum;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
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

        /**
         * TotalItemNum.
         */
        public Builder totalItemNum(Integer totalItemNum) {
            this.totalItemNum = totalItemNum;
            return this;
        }

        /**
         * TotalPageNum.
         */
        public Builder totalPageNum(Integer totalPageNum) {
            this.totalPageNum = totalPageNum;
            return this;
        }

        public ListUserProduceOperateLogsResponseBody build() {
            return new ListUserProduceOperateLogsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListUserProduceOperateLogsResponseBody} extends {@link TeaModel}
     *
     * <p>ListUserProduceOperateLogsResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BizId")
        private String bizId;

        @com.aliyun.core.annotation.NameInMap("BizStatus")
        private Integer bizStatus;

        @com.aliyun.core.annotation.NameInMap("BizType")
        private String bizType;

        @com.aliyun.core.annotation.NameInMap("Note")
        private String note;

        @com.aliyun.core.annotation.NameInMap("OperateName")
        private String operateName;

        @com.aliyun.core.annotation.NameInMap("OperateTime")
        private Long operateTime;

        @com.aliyun.core.annotation.NameInMap("OperateUserType")
        private String operateUserType;

        @com.aliyun.core.annotation.NameInMap("ToBizStatus")
        private Integer toBizStatus;

        private Data(Builder builder) {
            this.bizId = builder.bizId;
            this.bizStatus = builder.bizStatus;
            this.bizType = builder.bizType;
            this.note = builder.note;
            this.operateName = builder.operateName;
            this.operateTime = builder.operateTime;
            this.operateUserType = builder.operateUserType;
            this.toBizStatus = builder.toBizStatus;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return bizId
         */
        public String getBizId() {
            return this.bizId;
        }

        /**
         * @return bizStatus
         */
        public Integer getBizStatus() {
            return this.bizStatus;
        }

        /**
         * @return bizType
         */
        public String getBizType() {
            return this.bizType;
        }

        /**
         * @return note
         */
        public String getNote() {
            return this.note;
        }

        /**
         * @return operateName
         */
        public String getOperateName() {
            return this.operateName;
        }

        /**
         * @return operateTime
         */
        public Long getOperateTime() {
            return this.operateTime;
        }

        /**
         * @return operateUserType
         */
        public String getOperateUserType() {
            return this.operateUserType;
        }

        /**
         * @return toBizStatus
         */
        public Integer getToBizStatus() {
            return this.toBizStatus;
        }

        public static final class Builder {
            private String bizId; 
            private Integer bizStatus; 
            private String bizType; 
            private String note; 
            private String operateName; 
            private Long operateTime; 
            private String operateUserType; 
            private Integer toBizStatus; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.bizId = model.bizId;
                this.bizStatus = model.bizStatus;
                this.bizType = model.bizType;
                this.note = model.note;
                this.operateName = model.operateName;
                this.operateTime = model.operateTime;
                this.operateUserType = model.operateUserType;
                this.toBizStatus = model.toBizStatus;
            } 

            /**
             * BizId.
             */
            public Builder bizId(String bizId) {
                this.bizId = bizId;
                return this;
            }

            /**
             * BizStatus.
             */
            public Builder bizStatus(Integer bizStatus) {
                this.bizStatus = bizStatus;
                return this;
            }

            /**
             * BizType.
             */
            public Builder bizType(String bizType) {
                this.bizType = bizType;
                return this;
            }

            /**
             * Note.
             */
            public Builder note(String note) {
                this.note = note;
                return this;
            }

            /**
             * OperateName.
             */
            public Builder operateName(String operateName) {
                this.operateName = operateName;
                return this;
            }

            /**
             * OperateTime.
             */
            public Builder operateTime(Long operateTime) {
                this.operateTime = operateTime;
                return this;
            }

            /**
             * OperateUserType.
             */
            public Builder operateUserType(String operateUserType) {
                this.operateUserType = operateUserType;
                return this;
            }

            /**
             * ToBizStatus.
             */
            public Builder toBizStatus(Integer toBizStatus) {
                this.toBizStatus = toBizStatus;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
