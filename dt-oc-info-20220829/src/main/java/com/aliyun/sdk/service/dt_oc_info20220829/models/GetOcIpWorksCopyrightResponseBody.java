// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dt_oc_info20220829.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetOcIpWorksCopyrightResponseBody} extends {@link TeaModel}
 *
 * <p>GetOcIpWorksCopyrightResponseBody</p>
 */
public class GetOcIpWorksCopyrightResponseBody extends TeaModel {
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

    private GetOcIpWorksCopyrightResponseBody(Builder builder) {
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

    public static GetOcIpWorksCopyrightResponseBody create() {
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

        public GetOcIpWorksCopyrightResponseBody build() {
            return new GetOcIpWorksCopyrightResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("ApprovalDate")
        private String approvalDate;

        @NameInMap("CopyName")
        private String copyName;

        @NameInMap("CopyNum")
        private String copyNum;

        @NameInMap("EntName")
        private String entName;

        @NameInMap("FirstDate")
        private String firstDate;

        @NameInMap("SuccessDate")
        private String successDate;

        @NameInMap("TypeName")
        private String typeName;

        private Data(Builder builder) {
            this.approvalDate = builder.approvalDate;
            this.copyName = builder.copyName;
            this.copyNum = builder.copyNum;
            this.entName = builder.entName;
            this.firstDate = builder.firstDate;
            this.successDate = builder.successDate;
            this.typeName = builder.typeName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return approvalDate
         */
        public String getApprovalDate() {
            return this.approvalDate;
        }

        /**
         * @return copyName
         */
        public String getCopyName() {
            return this.copyName;
        }

        /**
         * @return copyNum
         */
        public String getCopyNum() {
            return this.copyNum;
        }

        /**
         * @return entName
         */
        public String getEntName() {
            return this.entName;
        }

        /**
         * @return firstDate
         */
        public String getFirstDate() {
            return this.firstDate;
        }

        /**
         * @return successDate
         */
        public String getSuccessDate() {
            return this.successDate;
        }

        /**
         * @return typeName
         */
        public String getTypeName() {
            return this.typeName;
        }

        public static final class Builder {
            private String approvalDate; 
            private String copyName; 
            private String copyNum; 
            private String entName; 
            private String firstDate; 
            private String successDate; 
            private String typeName; 

            /**
             * 登记批准日期
             */
            public Builder approvalDate(String approvalDate) {
                this.approvalDate = approvalDate;
                return this;
            }

            /**
             * 作品名称
             */
            public Builder copyName(String copyName) {
                this.copyName = copyName;
                return this;
            }

            /**
             * 登记号
             */
            public Builder copyNum(String copyNum) {
                this.copyNum = copyNum;
                return this;
            }

            /**
             * 企业名称
             */
            public Builder entName(String entName) {
                this.entName = entName;
                return this;
            }

            /**
             * 首次发表时间
             */
            public Builder firstDate(String firstDate) {
                this.firstDate = firstDate;
                return this;
            }

            /**
             * 创作完成日期
             */
            public Builder successDate(String successDate) {
                this.successDate = successDate;
                return this;
            }

            /**
             * 作品类别
             */
            public Builder typeName(String typeName) {
                this.typeName = typeName;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
