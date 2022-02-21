// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link InvokeDataAPIServiceResponseBody} extends {@link TeaModel}
 *
 * <p>InvokeDataAPIServiceResponseBody</p>
 */
public class InvokeDataAPIServiceResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("ErrorMessage")
    private String errorMessage;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private InvokeDataAPIServiceResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.errorMessage = builder.errorMessage;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static InvokeDataAPIServiceResponseBody create() {
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
     * @return errorMessage
     */
    public String getErrorMessage() {
        return this.errorMessage;
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
        private String code; 
        private Data data; 
        private String errorMessage; 
        private String requestId; 
        private Boolean success; 

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
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * ErrorMessage.
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
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

        public InvokeDataAPIServiceResponseBody build() {
            return new InvokeDataAPIServiceResponseBody(this);
        } 

    } 

    public static class FieldNameList extends TeaModel {
        @NameInMap("FieldNameList")
        private java.util.List < String > fieldNameList;

        private FieldNameList(Builder builder) {
            this.fieldNameList = builder.fieldNameList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FieldNameList create() {
            return builder().build();
        }

        /**
         * @return fieldNameList
         */
        public java.util.List < String > getFieldNameList() {
            return this.fieldNameList;
        }

        public static final class Builder {
            private java.util.List < String > fieldNameList; 

            /**
             * FieldNameList.
             */
            public Builder fieldNameList(java.util.List < String > fieldNameList) {
                this.fieldNameList = fieldNameList;
                return this;
            }

            public FieldNameList build() {
                return new FieldNameList(this);
            } 

        } 

    }
    public static class ResultList extends TeaModel {
        @NameInMap("ResultList")
        private java.util.List < java.util.Map<String, String>> resultList;

        private ResultList(Builder builder) {
            this.resultList = builder.resultList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResultList create() {
            return builder().build();
        }

        /**
         * @return resultList
         */
        public java.util.List < java.util.Map<String, String>> getResultList() {
            return this.resultList;
        }

        public static final class Builder {
            private java.util.List < java.util.Map<String, String>> resultList; 

            /**
             * ResultList.
             */
            public Builder resultList(java.util.List < java.util.Map<String, String>> resultList) {
                this.resultList = resultList;
                return this;
            }

            public ResultList build() {
                return new ResultList(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("ApiSrn")
        private String apiSrn;

        @NameInMap("FieldNameList")
        private FieldNameList fieldNameList;

        @NameInMap("PageNo")
        private Integer pageNo;

        @NameInMap("PageSize")
        private Integer pageSize;

        @NameInMap("ResultList")
        private ResultList resultList;

        private Data(Builder builder) {
            this.apiSrn = builder.apiSrn;
            this.fieldNameList = builder.fieldNameList;
            this.pageNo = builder.pageNo;
            this.pageSize = builder.pageSize;
            this.resultList = builder.resultList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return apiSrn
         */
        public String getApiSrn() {
            return this.apiSrn;
        }

        /**
         * @return fieldNameList
         */
        public FieldNameList getFieldNameList() {
            return this.fieldNameList;
        }

        /**
         * @return pageNo
         */
        public Integer getPageNo() {
            return this.pageNo;
        }

        /**
         * @return pageSize
         */
        public Integer getPageSize() {
            return this.pageSize;
        }

        /**
         * @return resultList
         */
        public ResultList getResultList() {
            return this.resultList;
        }

        public static final class Builder {
            private String apiSrn; 
            private FieldNameList fieldNameList; 
            private Integer pageNo; 
            private Integer pageSize; 
            private ResultList resultList; 

            /**
             * ApiSrn.
             */
            public Builder apiSrn(String apiSrn) {
                this.apiSrn = apiSrn;
                return this;
            }

            /**
             * FieldNameList.
             */
            public Builder fieldNameList(FieldNameList fieldNameList) {
                this.fieldNameList = fieldNameList;
                return this;
            }

            /**
             * PageNo.
             */
            public Builder pageNo(Integer pageNo) {
                this.pageNo = pageNo;
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
             * ResultList.
             */
            public Builder resultList(ResultList resultList) {
                this.resultList = resultList;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
