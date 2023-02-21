// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dt_oc_info20220829.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetOcIcAbnormalOperationResponseBody} extends {@link TeaModel}
 *
 * <p>GetOcIcAbnormalOperationResponseBody</p>
 */
public class GetOcIcAbnormalOperationResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Data")
    private java.util.List < Data> data;

    @NameInMap("Message")
    private String message;

    @NameInMap("PageIndex")
    private Integer pageIndex;

    @NameInMap("PageNum")
    private Integer pageNum;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    @NameInMap("TotalNum")
    private Integer totalNum;

    private GetOcIcAbnormalOperationResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.pageIndex = builder.pageIndex;
        this.pageNum = builder.pageNum;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.totalNum = builder.totalNum;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetOcIcAbnormalOperationResponseBody create() {
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
    public java.util.List < Data> getData() {
        return this.data;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return pageIndex
     */
    public Integer getPageIndex() {
        return this.pageIndex;
    }

    /**
     * @return pageNum
     */
    public Integer getPageNum() {
        return this.pageNum;
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
     * @return totalNum
     */
    public Integer getTotalNum() {
        return this.totalNum;
    }

    public static final class Builder {
        private String code; 
        private java.util.List < Data> data; 
        private String message; 
        private Integer pageIndex; 
        private Integer pageNum; 
        private String requestId; 
        private Boolean success; 
        private Integer totalNum; 

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
        public Builder data(java.util.List < Data> data) {
            this.data = data;
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
         * PageIndex.
         */
        public Builder pageIndex(Integer pageIndex) {
            this.pageIndex = pageIndex;
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
         * TotalNum.
         */
        public Builder totalNum(Integer totalNum) {
            this.totalNum = totalNum;
            return this;
        }

        public GetOcIcAbnormalOperationResponseBody build() {
            return new GetOcIcAbnormalOperationResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("InDate")
        private String inDate;

        @NameInMap("InDepartment")
        private String inDepartment;

        @NameInMap("InReason")
        private String inReason;

        @NameInMap("OutDate")
        private String outDate;

        @NameInMap("OutDepartment")
        private String outDepartment;

        @NameInMap("OutReason")
        private String outReason;

        private Data(Builder builder) {
            this.inDate = builder.inDate;
            this.inDepartment = builder.inDepartment;
            this.inReason = builder.inReason;
            this.outDate = builder.outDate;
            this.outDepartment = builder.outDepartment;
            this.outReason = builder.outReason;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return inDate
         */
        public String getInDate() {
            return this.inDate;
        }

        /**
         * @return inDepartment
         */
        public String getInDepartment() {
            return this.inDepartment;
        }

        /**
         * @return inReason
         */
        public String getInReason() {
            return this.inReason;
        }

        /**
         * @return outDate
         */
        public String getOutDate() {
            return this.outDate;
        }

        /**
         * @return outDepartment
         */
        public String getOutDepartment() {
            return this.outDepartment;
        }

        /**
         * @return outReason
         */
        public String getOutReason() {
            return this.outReason;
        }

        public static final class Builder {
            private String inDate; 
            private String inDepartment; 
            private String inReason; 
            private String outDate; 
            private String outDepartment; 
            private String outReason; 

            /**
             * 列入日期
             */
            public Builder inDate(String inDate) {
                this.inDate = inDate;
                return this;
            }

            /**
             * 列入决定机关
             */
            public Builder inDepartment(String inDepartment) {
                this.inDepartment = inDepartment;
                return this;
            }

            /**
             * 列入原因
             */
            public Builder inReason(String inReason) {
                this.inReason = inReason;
                return this;
            }

            /**
             * 移出日期
             */
            public Builder outDate(String outDate) {
                this.outDate = outDate;
                return this;
            }

            /**
             * 移出决定机关
             */
            public Builder outDepartment(String outDepartment) {
                this.outDepartment = outDepartment;
                return this;
            }

            /**
             * 移出原因
             */
            public Builder outReason(String outReason) {
                this.outReason = outReason;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
