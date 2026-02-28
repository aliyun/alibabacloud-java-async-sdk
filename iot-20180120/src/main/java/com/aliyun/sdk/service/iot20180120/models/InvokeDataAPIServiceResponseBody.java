// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

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
 * {@link InvokeDataAPIServiceResponseBody} extends {@link TeaModel}
 *
 * <p>InvokeDataAPIServiceResponseBody</p>
 */
public class InvokeDataAPIServiceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("ErrorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(InvokeDataAPIServiceResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.errorMessage = model.errorMessage;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

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

    /**
     * 
     * {@link InvokeDataAPIServiceResponseBody} extends {@link TeaModel}
     *
     * <p>InvokeDataAPIServiceResponseBody</p>
     */
    public static class FieldNameList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FieldNameList")
        private java.util.List<String> fieldNameList;

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
        public java.util.List<String> getFieldNameList() {
            return this.fieldNameList;
        }

        public static final class Builder {
            private java.util.List<String> fieldNameList; 

            private Builder() {
            } 

            private Builder(FieldNameList model) {
                this.fieldNameList = model.fieldNameList;
            } 

            /**
             * FieldNameList.
             */
            public Builder fieldNameList(java.util.List<String> fieldNameList) {
                this.fieldNameList = fieldNameList;
                return this;
            }

            public FieldNameList build() {
                return new FieldNameList(this);
            } 

        } 

    }
    /**
     * 
     * {@link InvokeDataAPIServiceResponseBody} extends {@link TeaModel}
     *
     * <p>InvokeDataAPIServiceResponseBody</p>
     */
    public static class ResultList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ResultList")
        private java.util.List<java.util.Map<String, ?>> resultList;

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
        public java.util.List<java.util.Map<String, ?>> getResultList() {
            return this.resultList;
        }

        public static final class Builder {
            private java.util.List<java.util.Map<String, ?>> resultList; 

            private Builder() {
            } 

            private Builder(ResultList model) {
                this.resultList = model.resultList;
            } 

            /**
             * ResultList.
             */
            public Builder resultList(java.util.List<java.util.Map<String, ?>> resultList) {
                this.resultList = resultList;
                return this;
            }

            public ResultList build() {
                return new ResultList(this);
            } 

        } 

    }
    /**
     * 
     * {@link InvokeDataAPIServiceResponseBody} extends {@link TeaModel}
     *
     * <p>InvokeDataAPIServiceResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ApiSrn")
        private String apiSrn;

        @com.aliyun.core.annotation.NameInMap("FieldNameList")
        private FieldNameList fieldNameList;

        @com.aliyun.core.annotation.NameInMap("PageNo")
        private Integer pageNo;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("ResultList")
        private ResultList resultList;

        @com.aliyun.core.annotation.NameInMap("TotalSize")
        private Integer totalSize;

        private Data(Builder builder) {
            this.apiSrn = builder.apiSrn;
            this.fieldNameList = builder.fieldNameList;
            this.pageNo = builder.pageNo;
            this.pageSize = builder.pageSize;
            this.resultList = builder.resultList;
            this.totalSize = builder.totalSize;
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

        /**
         * @return totalSize
         */
        public Integer getTotalSize() {
            return this.totalSize;
        }

        public static final class Builder {
            private String apiSrn; 
            private FieldNameList fieldNameList; 
            private Integer pageNo; 
            private Integer pageSize; 
            private ResultList resultList; 
            private Integer totalSize; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.apiSrn = model.apiSrn;
                this.fieldNameList = model.fieldNameList;
                this.pageNo = model.pageNo;
                this.pageSize = model.pageSize;
                this.resultList = model.resultList;
                this.totalSize = model.totalSize;
            } 

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

            /**
             * TotalSize.
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
