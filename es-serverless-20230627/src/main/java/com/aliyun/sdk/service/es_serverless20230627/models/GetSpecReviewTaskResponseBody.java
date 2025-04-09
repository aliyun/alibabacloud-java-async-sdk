// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.es_serverless20230627.models;

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
 * {@link GetSpecReviewTaskResponseBody} extends {@link TeaModel}
 *
 * <p>GetSpecReviewTaskResponseBody</p>
 */
public class GetSpecReviewTaskResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("result")
    private Result result;

    private GetSpecReviewTaskResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetSpecReviewTaskResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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

    public static final class Builder {
        private String requestId; 
        private Result result; 

        private Builder() {
        } 

        private Builder(GetSpecReviewTaskResponseBody model) {
            this.requestId = model.requestId;
            this.result = model.result;
        } 

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * result.
         */
        public Builder result(Result result) {
            this.result = result;
            return this;
        }

        public GetSpecReviewTaskResponseBody build() {
            return new GetSpecReviewTaskResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetSpecReviewTaskResponseBody} extends {@link TeaModel}
     *
     * <p>GetSpecReviewTaskResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("appName")
        private String appName;

        @com.aliyun.core.annotation.NameInMap("applyLimiter")
        private java.util.Map<String, ?> applyLimiter;

        @com.aliyun.core.annotation.NameInMap("applyQuota")
        private java.util.Map<String, ?> applyQuota;

        @com.aliyun.core.annotation.NameInMap("applyReason")
        private String applyReason;

        @com.aliyun.core.annotation.NameInMap("effectiveLimiter")
        private java.util.Map<String, ?> effectiveLimiter;

        @com.aliyun.core.annotation.NameInMap("effectiveQuota")
        private java.util.Map<String, ?> effectiveQuota;

        @com.aliyun.core.annotation.NameInMap("gmtCreate")
        private String gmtCreate;

        @com.aliyun.core.annotation.NameInMap("gmtModified")
        private String gmtModified;

        @com.aliyun.core.annotation.NameInMap("oldLimiter")
        private java.util.Map<String, ?> oldLimiter;

        @com.aliyun.core.annotation.NameInMap("oldQuota")
        private java.util.Map<String, ?> oldQuota;

        @com.aliyun.core.annotation.NameInMap("source")
        private String source;

        @com.aliyun.core.annotation.NameInMap("status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("type")
        private String type;

        private Result(Builder builder) {
            this.id = builder.id;
            this.appName = builder.appName;
            this.applyLimiter = builder.applyLimiter;
            this.applyQuota = builder.applyQuota;
            this.applyReason = builder.applyReason;
            this.effectiveLimiter = builder.effectiveLimiter;
            this.effectiveQuota = builder.effectiveQuota;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.oldLimiter = builder.oldLimiter;
            this.oldQuota = builder.oldQuota;
            this.source = builder.source;
            this.status = builder.status;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return appName
         */
        public String getAppName() {
            return this.appName;
        }

        /**
         * @return applyLimiter
         */
        public java.util.Map<String, ?> getApplyLimiter() {
            return this.applyLimiter;
        }

        /**
         * @return applyQuota
         */
        public java.util.Map<String, ?> getApplyQuota() {
            return this.applyQuota;
        }

        /**
         * @return applyReason
         */
        public String getApplyReason() {
            return this.applyReason;
        }

        /**
         * @return effectiveLimiter
         */
        public java.util.Map<String, ?> getEffectiveLimiter() {
            return this.effectiveLimiter;
        }

        /**
         * @return effectiveQuota
         */
        public java.util.Map<String, ?> getEffectiveQuota() {
            return this.effectiveQuota;
        }

        /**
         * @return gmtCreate
         */
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return gmtModified
         */
        public String getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return oldLimiter
         */
        public java.util.Map<String, ?> getOldLimiter() {
            return this.oldLimiter;
        }

        /**
         * @return oldQuota
         */
        public java.util.Map<String, ?> getOldQuota() {
            return this.oldQuota;
        }

        /**
         * @return source
         */
        public String getSource() {
            return this.source;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String id; 
            private String appName; 
            private java.util.Map<String, ?> applyLimiter; 
            private java.util.Map<String, ?> applyQuota; 
            private String applyReason; 
            private java.util.Map<String, ?> effectiveLimiter; 
            private java.util.Map<String, ?> effectiveQuota; 
            private String gmtCreate; 
            private String gmtModified; 
            private java.util.Map<String, ?> oldLimiter; 
            private java.util.Map<String, ?> oldQuota; 
            private String source; 
            private String status; 
            private String type; 

            private Builder() {
            } 

            private Builder(Result model) {
                this.id = model.id;
                this.appName = model.appName;
                this.applyLimiter = model.applyLimiter;
                this.applyQuota = model.applyQuota;
                this.applyReason = model.applyReason;
                this.effectiveLimiter = model.effectiveLimiter;
                this.effectiveQuota = model.effectiveQuota;
                this.gmtCreate = model.gmtCreate;
                this.gmtModified = model.gmtModified;
                this.oldLimiter = model.oldLimiter;
                this.oldQuota = model.oldQuota;
                this.source = model.source;
                this.status = model.status;
                this.type = model.type;
            } 

            /**
             * <p>代表资源一级ID的资源属性字段</p>
             * 
             * <strong>example:</strong>
             * <p>339</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * appName.
             */
            public Builder appName(String appName) {
                this.appName = appName;
                return this;
            }

            /**
             * applyLimiter.
             */
            public Builder applyLimiter(java.util.Map<String, ?> applyLimiter) {
                this.applyLimiter = applyLimiter;
                return this;
            }

            /**
             * applyQuota.
             */
            public Builder applyQuota(java.util.Map<String, ?> applyQuota) {
                this.applyQuota = applyQuota;
                return this;
            }

            /**
             * applyReason.
             */
            public Builder applyReason(String applyReason) {
                this.applyReason = applyReason;
                return this;
            }

            /**
             * effectiveLimiter.
             */
            public Builder effectiveLimiter(java.util.Map<String, ?> effectiveLimiter) {
                this.effectiveLimiter = effectiveLimiter;
                return this;
            }

            /**
             * effectiveQuota.
             */
            public Builder effectiveQuota(java.util.Map<String, ?> effectiveQuota) {
                this.effectiveQuota = effectiveQuota;
                return this;
            }

            /**
             * gmtCreate.
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * gmtModified.
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * oldLimiter.
             */
            public Builder oldLimiter(java.util.Map<String, ?> oldLimiter) {
                this.oldLimiter = oldLimiter;
                return this;
            }

            /**
             * oldQuota.
             */
            public Builder oldQuota(java.util.Map<String, ?> oldQuota) {
                this.oldQuota = oldQuota;
                return this;
            }

            /**
             * source.
             */
            public Builder source(String source) {
                this.source = source;
                return this;
            }

            /**
             * status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
