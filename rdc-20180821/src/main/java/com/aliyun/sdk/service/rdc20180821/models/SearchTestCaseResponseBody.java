// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rdc20180821.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SearchTestCaseResponseBody} extends {@link TeaModel}
 *
 * <p>SearchTestCaseResponseBody</p>
 */
public class SearchTestCaseResponseBody extends TeaModel {
    @NameInMap("Code")
    private Integer code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private SearchTestCaseResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SearchTestCaseResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public Integer getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
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

    public static final class Builder {
        private Integer code; 
        private Data data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        /**
         * Code.
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(Data data) {
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

        public SearchTestCaseResponseBody build() {
            return new SearchTestCaseResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("Cases")
        private String cases;

        @NameInMap("PageNum")
        private String pageNum;

        @NameInMap("PageSize")
        private String pageSize;

        @NameInMap("PageTotal")
        private String pageTotal;

        @NameInMap("TotalCount")
        private String totalCount;

        private Data(Builder builder) {
            this.cases = builder.cases;
            this.pageNum = builder.pageNum;
            this.pageSize = builder.pageSize;
            this.pageTotal = builder.pageTotal;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return cases
         */
        public String getCases() {
            return this.cases;
        }

        /**
         * @return pageNum
         */
        public String getPageNum() {
            return this.pageNum;
        }

        /**
         * @return pageSize
         */
        public String getPageSize() {
            return this.pageSize;
        }

        /**
         * @return pageTotal
         */
        public String getPageTotal() {
            return this.pageTotal;
        }

        /**
         * @return totalCount
         */
        public String getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private String cases; 
            private String pageNum; 
            private String pageSize; 
            private String pageTotal; 
            private String totalCount; 

            /**
             * Cases.
             */
            public Builder cases(String cases) {
                this.cases = cases;
                return this;
            }

            /**
             * PageNum.
             */
            public Builder pageNum(String pageNum) {
                this.pageNum = pageNum;
                return this;
            }

            /**
             * PageSize.
             */
            public Builder pageSize(String pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * PageTotal.
             */
            public Builder pageTotal(String pageTotal) {
                this.pageTotal = pageTotal;
                return this;
            }

            /**
             * TotalCount.
             */
            public Builder totalCount(String totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
