// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dyplsapi20170525.models;

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
 * {@link QuerySecretAPhoneNoToCustResponseBody} extends {@link TeaModel}
 *
 * <p>QuerySecretAPhoneNoToCustResponseBody</p>
 */
public class QuerySecretAPhoneNoToCustResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AccessDeniedDetail")
    private String accessDeniedDetail;

    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private QuerySecretAPhoneNoToCustResponseBody(Builder builder) {
        this.accessDeniedDetail = builder.accessDeniedDetail;
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QuerySecretAPhoneNoToCustResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accessDeniedDetail
     */
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
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
        private String accessDeniedDetail; 
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(QuerySecretAPhoneNoToCustResponseBody model) {
            this.accessDeniedDetail = model.accessDeniedDetail;
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * AccessDeniedDetail.
         */
        public Builder accessDeniedDetail(String accessDeniedDetail) {
            this.accessDeniedDetail = accessDeniedDetail;
            return this;
        }

        /**
         * <p>请求状态码</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>A号码报备状态查询结构体</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>失败错误提示</p>
         * 
         * <strong>example:</strong>
         * <p>号码组不存在</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>返回id</p>
         * 
         * <strong>example:</strong>
         * <p>1D73E648-0978-18A5-B089-3BB2</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>请求是否成功</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public QuerySecretAPhoneNoToCustResponseBody build() {
            return new QuerySecretAPhoneNoToCustResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QuerySecretAPhoneNoToCustResponseBody} extends {@link TeaModel}
     *
     * <p>QuerySecretAPhoneNoToCustResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ANoWhiteGroupId")
        private String aNoWhiteGroupId;

        @com.aliyun.core.annotation.NameInMap("CustPhoneNo")
        private String custPhoneNo;

        @com.aliyun.core.annotation.NameInMap("NoType")
        private String noType;

        @com.aliyun.core.annotation.NameInMap("PhoneNoA")
        private String phoneNoA;

        @com.aliyun.core.annotation.NameInMap("Remark")
        private String remark;

        @com.aliyun.core.annotation.NameInMap("ReportResult")
        private String reportResult;

        @com.aliyun.core.annotation.NameInMap("ReportStatus")
        private String reportStatus;

        private Data(Builder builder) {
            this.aNoWhiteGroupId = builder.aNoWhiteGroupId;
            this.custPhoneNo = builder.custPhoneNo;
            this.noType = builder.noType;
            this.phoneNoA = builder.phoneNoA;
            this.remark = builder.remark;
            this.reportResult = builder.reportResult;
            this.reportStatus = builder.reportStatus;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return aNoWhiteGroupId
         */
        public String getANoWhiteGroupId() {
            return this.aNoWhiteGroupId;
        }

        /**
         * @return custPhoneNo
         */
        public String getCustPhoneNo() {
            return this.custPhoneNo;
        }

        /**
         * @return noType
         */
        public String getNoType() {
            return this.noType;
        }

        /**
         * @return phoneNoA
         */
        public String getPhoneNoA() {
            return this.phoneNoA;
        }

        /**
         * @return remark
         */
        public String getRemark() {
            return this.remark;
        }

        /**
         * @return reportResult
         */
        public String getReportResult() {
            return this.reportResult;
        }

        /**
         * @return reportStatus
         */
        public String getReportStatus() {
            return this.reportStatus;
        }

        public static final class Builder {
            private String aNoWhiteGroupId; 
            private String custPhoneNo; 
            private String noType; 
            private String phoneNoA; 
            private String remark; 
            private String reportResult; 
            private String reportStatus; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.aNoWhiteGroupId = model.aNoWhiteGroupId;
                this.custPhoneNo = model.custPhoneNo;
                this.noType = model.noType;
                this.phoneNoA = model.phoneNoA;
                this.remark = model.remark;
                this.reportResult = model.reportResult;
                this.reportStatus = model.reportStatus;
            } 

            /**
             * <p>所属a号码组id</p>
             * 
             * <strong>example:</strong>
             * <p>19</p>
             */
            public Builder aNoWhiteGroupId(String aNoWhiteGroupId) {
                this.aNoWhiteGroupId = aNoWhiteGroupId;
                return this;
            }

            /**
             * <p>固话报备的经办人/法人电话</p>
             * 
             * <strong>example:</strong>
             * <p>130*****8888</p>
             */
            public Builder custPhoneNo(String custPhoneNo) {
                this.custPhoneNo = custPhoneNo;
                return this;
            }

            /**
             * <p>号码类型</p>
             * 
             * <strong>example:</strong>
             * <p>Mobile</p>
             */
            public Builder noType(String noType) {
                this.noType = noType;
                return this;
            }

            /**
             * <p>A号码</p>
             * 
             * <strong>example:</strong>
             * <p>130*****1234</p>
             */
            public Builder phoneNoA(String phoneNoA) {
                this.phoneNoA = phoneNoA;
                return this;
            }

            /**
             * <p>备注（客户自己的业务备注，可编辑）</p>
             * 
             * <strong>example:</strong>
             * <p>***报备</p>
             */
            public Builder remark(String remark) {
                this.remark = remark;
                return this;
            }

            /**
             * <p>报备失败原因</p>
             * 
             * <strong>example:</strong>
             * <p>[&quot;系统判断为不同人&quot;]</p>
             */
            public Builder reportResult(String reportResult) {
                this.reportResult = reportResult;
                return this;
            }

            /**
             * <p>报备结果</p>
             * 
             * <strong>example:</strong>
             * <p>REVIEWING</p>
             */
            public Builder reportStatus(String reportStatus) {
                this.reportStatus = reportStatus;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
