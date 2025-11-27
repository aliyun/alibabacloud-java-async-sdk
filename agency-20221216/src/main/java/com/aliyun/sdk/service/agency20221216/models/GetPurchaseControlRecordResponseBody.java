// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agency20221216.models;

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
 * {@link GetPurchaseControlRecordResponseBody} extends {@link TeaModel}
 *
 * <p>GetPurchaseControlRecordResponseBody</p>
 */
public class GetPurchaseControlRecordResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("PageNo")
    private Integer pageNo;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("Total")
    private Integer total;

    private GetPurchaseControlRecordResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.pageNo = builder.pageNo;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.total = builder.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetPurchaseControlRecordResponseBody create() {
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
    public java.util.List<Data> getData() {
        return this.data;
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
     * @return total
     */
    public Integer getTotal() {
        return this.total;
    }

    public static final class Builder {
        private String code; 
        private java.util.List<Data> data; 
        private Integer pageNo; 
        private Integer pageSize; 
        private String requestId; 
        private Boolean success; 
        private Integer total; 

        private Builder() {
        } 

        private Builder(GetPurchaseControlRecordResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.pageNo = model.pageNo;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.success = model.success;
            this.total = model.total;
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
        public Builder data(java.util.List<Data> data) {
            this.data = data;
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
         * <p>RequestId</p>
         * 
         * <strong>example:</strong>
         * <p>9C14ADFE-DF0A-54D4-8BD5-45D0839246B4</p>
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
         * Total.
         */
        public Builder total(Integer total) {
            this.total = total;
            return this;
        }

        public GetPurchaseControlRecordResponseBody build() {
            return new GetPurchaseControlRecordResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetPurchaseControlRecordResponseBody} extends {@link TeaModel}
     *
     * <p>GetPurchaseControlRecordResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ChangedType")
        private String changedType;

        @com.aliyun.core.annotation.NameInMap("OperationPath")
        private String operationPath;

        @com.aliyun.core.annotation.NameInMap("OperationTime")
        private String operationTime;

        @com.aliyun.core.annotation.NameInMap("Operator")
        private String operator;

        private Data(Builder builder) {
            this.changedType = builder.changedType;
            this.operationPath = builder.operationPath;
            this.operationTime = builder.operationTime;
            this.operator = builder.operator;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return changedType
         */
        public String getChangedType() {
            return this.changedType;
        }

        /**
         * @return operationPath
         */
        public String getOperationPath() {
            return this.operationPath;
        }

        /**
         * @return operationTime
         */
        public String getOperationTime() {
            return this.operationTime;
        }

        /**
         * @return operator
         */
        public String getOperator() {
            return this.operator;
        }

        public static final class Builder {
            private String changedType; 
            private String operationPath; 
            private String operationTime; 
            private String operator; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.changedType = model.changedType;
                this.operationPath = model.operationPath;
                this.operationTime = model.operationTime;
                this.operator = model.operator;
            } 

            /**
             * ChangedType.
             */
            public Builder changedType(String changedType) {
                this.changedType = changedType;
                return this;
            }

            /**
             * OperationPath.
             */
            public Builder operationPath(String operationPath) {
                this.operationPath = operationPath;
                return this;
            }

            /**
             * OperationTime.
             */
            public Builder operationTime(String operationTime) {
                this.operationTime = operationTime;
                return this;
            }

            /**
             * Operator.
             */
            public Builder operator(String operator) {
                this.operator = operator;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
