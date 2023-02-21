// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dt_oc_info20220829.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetOcIcChangeRecordResponseBody} extends {@link TeaModel}
 *
 * <p>GetOcIcChangeRecordResponseBody</p>
 */
public class GetOcIcChangeRecordResponseBody extends TeaModel {
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

    private GetOcIcChangeRecordResponseBody(Builder builder) {
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

    public static GetOcIcChangeRecordResponseBody create() {
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

        public GetOcIcChangeRecordResponseBody build() {
            return new GetOcIcChangeRecordResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("AfterContent")
        private String afterContent;

        @NameInMap("BeforeContent")
        private String beforeContent;

        @NameInMap("ChangeDate")
        private String changeDate;

        @NameInMap("Type")
        private String type;

        private Data(Builder builder) {
            this.afterContent = builder.afterContent;
            this.beforeContent = builder.beforeContent;
            this.changeDate = builder.changeDate;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return afterContent
         */
        public String getAfterContent() {
            return this.afterContent;
        }

        /**
         * @return beforeContent
         */
        public String getBeforeContent() {
            return this.beforeContent;
        }

        /**
         * @return changeDate
         */
        public String getChangeDate() {
            return this.changeDate;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String afterContent; 
            private String beforeContent; 
            private String changeDate; 
            private String type; 

            /**
             * 变更后
             */
            public Builder afterContent(String afterContent) {
                this.afterContent = afterContent;
                return this;
            }

            /**
             * 变更前
             */
            public Builder beforeContent(String beforeContent) {
                this.beforeContent = beforeContent;
                return this;
            }

            /**
             * 变更日期
             */
            public Builder changeDate(String changeDate) {
                this.changeDate = changeDate;
                return this;
            }

            /**
             * 变更事项
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
