// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aideepsign20260511.models;

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
 * {@link GetSensitiveScanResultResponseBody} extends {@link TeaModel}
 *
 * <p>GetSensitiveScanResultResponseBody</p>
 */
public class GetSensitiveScanResultResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Result")
    private Result result;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GetSensitiveScanResultResponseBody(Builder builder) {
        this.code = builder.code;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.result = builder.result;
        this.status = builder.status;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetSensitiveScanResultResponseBody create() {
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
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
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
     * @return result
     */
    public Result getResult() {
        return this.result;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private Integer httpStatusCode; 
        private String message; 
        private String requestId; 
        private Result result; 
        private String status; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(GetSensitiveScanResultResponseBody model) {
            this.code = model.code;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.requestId = model.requestId;
            this.result = model.result;
            this.status = model.status;
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
         * HttpStatusCode.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
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
         * Result.
         */
        public Builder result(Result result) {
            this.result = result;
            return this;
        }

        /**
         * Status.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetSensitiveScanResultResponseBody build() {
            return new GetSensitiveScanResultResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetSensitiveScanResultResponseBody} extends {@link TeaModel}
     *
     * <p>GetSensitiveScanResultResponseBody</p>
     */
    public static class RuleList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CategoryName")
        private String categoryName;

        @com.aliyun.core.annotation.NameInMap("Count")
        private Integer count;

        @com.aliyun.core.annotation.NameInMap("RiskLevelName")
        private String riskLevelName;

        @com.aliyun.core.annotation.NameInMap("RuleName")
        private String ruleName;

        private RuleList(Builder builder) {
            this.categoryName = builder.categoryName;
            this.count = builder.count;
            this.riskLevelName = builder.riskLevelName;
            this.ruleName = builder.ruleName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RuleList create() {
            return builder().build();
        }

        /**
         * @return categoryName
         */
        public String getCategoryName() {
            return this.categoryName;
        }

        /**
         * @return count
         */
        public Integer getCount() {
            return this.count;
        }

        /**
         * @return riskLevelName
         */
        public String getRiskLevelName() {
            return this.riskLevelName;
        }

        /**
         * @return ruleName
         */
        public String getRuleName() {
            return this.ruleName;
        }

        public static final class Builder {
            private String categoryName; 
            private Integer count; 
            private String riskLevelName; 
            private String ruleName; 

            private Builder() {
            } 

            private Builder(RuleList model) {
                this.categoryName = model.categoryName;
                this.count = model.count;
                this.riskLevelName = model.riskLevelName;
                this.ruleName = model.ruleName;
            } 

            /**
             * CategoryName.
             */
            public Builder categoryName(String categoryName) {
                this.categoryName = categoryName;
                return this;
            }

            /**
             * Count.
             */
            public Builder count(Integer count) {
                this.count = count;
                return this;
            }

            /**
             * RiskLevelName.
             */
            public Builder riskLevelName(String riskLevelName) {
                this.riskLevelName = riskLevelName;
                return this;
            }

            /**
             * RuleName.
             */
            public Builder ruleName(String ruleName) {
                this.ruleName = ruleName;
                return this;
            }

            public RuleList build() {
                return new RuleList(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetSensitiveScanResultResponseBody} extends {@link TeaModel}
     *
     * <p>GetSensitiveScanResultResponseBody</p>
     */
    public static class OssObjectDetail extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BucketName")
        private String bucketName;

        @com.aliyun.core.annotation.NameInMap("CategoryName")
        private String categoryName;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("RiskLevelName")
        private String riskLevelName;

        @com.aliyun.core.annotation.NameInMap("RuleList")
        private java.util.List<RuleList> ruleList;

        private OssObjectDetail(Builder builder) {
            this.bucketName = builder.bucketName;
            this.categoryName = builder.categoryName;
            this.name = builder.name;
            this.riskLevelName = builder.riskLevelName;
            this.ruleList = builder.ruleList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OssObjectDetail create() {
            return builder().build();
        }

        /**
         * @return bucketName
         */
        public String getBucketName() {
            return this.bucketName;
        }

        /**
         * @return categoryName
         */
        public String getCategoryName() {
            return this.categoryName;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return riskLevelName
         */
        public String getRiskLevelName() {
            return this.riskLevelName;
        }

        /**
         * @return ruleList
         */
        public java.util.List<RuleList> getRuleList() {
            return this.ruleList;
        }

        public static final class Builder {
            private String bucketName; 
            private String categoryName; 
            private String name; 
            private String riskLevelName; 
            private java.util.List<RuleList> ruleList; 

            private Builder() {
            } 

            private Builder(OssObjectDetail model) {
                this.bucketName = model.bucketName;
                this.categoryName = model.categoryName;
                this.name = model.name;
                this.riskLevelName = model.riskLevelName;
                this.ruleList = model.ruleList;
            } 

            /**
             * BucketName.
             */
            public Builder bucketName(String bucketName) {
                this.bucketName = bucketName;
                return this;
            }

            /**
             * CategoryName.
             */
            public Builder categoryName(String categoryName) {
                this.categoryName = categoryName;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * RiskLevelName.
             */
            public Builder riskLevelName(String riskLevelName) {
                this.riskLevelName = riskLevelName;
                return this;
            }

            /**
             * RuleList.
             */
            public Builder ruleList(java.util.List<RuleList> ruleList) {
                this.ruleList = ruleList;
                return this;
            }

            public OssObjectDetail build() {
                return new OssObjectDetail(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetSensitiveScanResultResponseBody} extends {@link TeaModel}
     *
     * <p>GetSensitiveScanResultResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("OssObjectDetail")
        private OssObjectDetail ossObjectDetail;

        private Result(Builder builder) {
            this.ossObjectDetail = builder.ossObjectDetail;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return ossObjectDetail
         */
        public OssObjectDetail getOssObjectDetail() {
            return this.ossObjectDetail;
        }

        public static final class Builder {
            private OssObjectDetail ossObjectDetail; 

            private Builder() {
            } 

            private Builder(Result model) {
                this.ossObjectDetail = model.ossObjectDetail;
            } 

            /**
             * OssObjectDetail.
             */
            public Builder ossObjectDetail(OssObjectDetail ossObjectDetail) {
                this.ossObjectDetail = ossObjectDetail;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
