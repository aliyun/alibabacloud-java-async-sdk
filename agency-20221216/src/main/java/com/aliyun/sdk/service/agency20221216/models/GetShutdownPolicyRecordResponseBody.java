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
 * {@link GetShutdownPolicyRecordResponseBody} extends {@link TeaModel}
 *
 * <p>GetShutdownPolicyRecordResponseBody</p>
 */
public class GetShutdownPolicyRecordResponseBody extends TeaModel {
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

    private GetShutdownPolicyRecordResponseBody(Builder builder) {
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

    public static GetShutdownPolicyRecordResponseBody create() {
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

        private Builder(GetShutdownPolicyRecordResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.pageNo = model.pageNo;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.success = model.success;
            this.total = model.total;
        } 

        /**
         * <p>The result code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>Indicates whether the customer was created. If the value is true, the Message contains the CID.</p>
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNo(Integer pageNo) {
            this.pageNo = pageNo;
            return this;
        }

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>210e876f16704666020714468dab35</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the call was successful.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * <p>The total number of entries.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder total(Integer total) {
            this.total = total;
            return this;
        }

        public GetShutdownPolicyRecordResponseBody build() {
            return new GetShutdownPolicyRecordResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetShutdownPolicyRecordResponseBody} extends {@link TeaModel}
     *
     * <p>GetShutdownPolicyRecordResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CurrentPolicy")
        private String currentPolicy;

        @com.aliyun.core.annotation.NameInMap("OperationPath")
        private String operationPath;

        @com.aliyun.core.annotation.NameInMap("OperationTime")
        private String operationTime;

        @com.aliyun.core.annotation.NameInMap("Operator")
        private String operator;

        @com.aliyun.core.annotation.NameInMap("PreviousPolicy")
        private String previousPolicy;

        private Data(Builder builder) {
            this.currentPolicy = builder.currentPolicy;
            this.operationPath = builder.operationPath;
            this.operationTime = builder.operationTime;
            this.operator = builder.operator;
            this.previousPolicy = builder.previousPolicy;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return currentPolicy
         */
        public String getCurrentPolicy() {
            return this.currentPolicy;
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

        /**
         * @return previousPolicy
         */
        public String getPreviousPolicy() {
            return this.previousPolicy;
        }

        public static final class Builder {
            private String currentPolicy; 
            private String operationPath; 
            private String operationTime; 
            private String operator; 
            private String previousPolicy; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.currentPolicy = model.currentPolicy;
                this.operationPath = model.operationPath;
                this.operationTime = model.operationTime;
                this.operator = model.operator;
                this.previousPolicy = model.previousPolicy;
            } 

            /**
             * <p>The current policy. Valid values:</p>
             * <ul>
             * <li>immediatelyStop: immediate shutdown upon overdue payment.</li>
             * <li>delayStop: deferred shutdown quota applied.</li>
             * <li>noStop: no shutdown upon overdue payment.
             * [_single.resp.200.props.Data.items.CurrentPolicy.enum.immediatelyStop ]Immediate shutdown upon overdue payment.
             * [_single.resp.200.props.Data.items.CurrentPolicy.enum.noStop ]No shutdown upon overdue payment.
             * [_single.resp.200.props.Data.items.CurrentPolicy.enum.delayStop ]Deferred shutdown quota applied.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>noStop</p>
             */
            public Builder currentPolicy(String currentPolicy) {
                this.currentPolicy = currentPolicy;
                return this;
            }

            /**
             * <p>The method by which the operation was initiated. Valid values:</p>
             * <ul>
             * <li>API: API.</li>
             * <li>ACPN: ACPN.</li>
             * <li>ALIYUN_BIZ: Alibaba Cloud internal.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>ACPN</p>
             */
            public Builder operationPath(String operationPath) {
                this.operationPath = operationPath;
                return this;
            }

            /**
             * <p>The operation time (UTC+8).</p>
             * 
             * <strong>example:</strong>
             * <p>2023-12-15 10:34:36</p>
             */
            public Builder operationTime(String operationTime) {
                this.operationTime = operationTime;
                return this;
            }

            /**
             * <p>The operator.</p>
             * 
             * <strong>example:</strong>
             * <p>11111111111</p>
             */
            public Builder operator(String operator) {
                this.operator = operator;
                return this;
            }

            /**
             * <p>The policy before the change. Valid values:</p>
             * <ul>
             * <li>immediatelyStop: immediate shutdown upon overdue payment.</li>
             * <li>delayStop: deferred shutdown quota applied.</li>
             * <li>noStop: no shutdown upon overdue payment.
             * [_single.resp.200.props.Data.items.PreviousPolicy.enum.immediatelyStop ]Immediate shutdown upon overdue payment.
             * [_single.resp.200.props.Data.items.PreviousPolicy.enum.noStop ]No shutdown upon overdue payment.
             * [_single.resp.200.props.Data.items.PreviousPolicy.enum.delayStop ]Deferred shutdown quota applied.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>immediatelyStop</p>
             */
            public Builder previousPolicy(String previousPolicy) {
                this.previousPolicy = previousPolicy;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
