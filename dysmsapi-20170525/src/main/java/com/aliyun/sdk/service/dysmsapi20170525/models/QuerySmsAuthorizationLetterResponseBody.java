// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dysmsapi20170525.models;

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
 * {@link QuerySmsAuthorizationLetterResponseBody} extends {@link TeaModel}
 *
 * <p>QuerySmsAuthorizationLetterResponseBody</p>
 */
public class QuerySmsAuthorizationLetterResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AccessDeniedDetail")
    private String accessDeniedDetail;

    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private QuerySmsAuthorizationLetterResponseBody(Builder builder) {
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

    public static QuerySmsAuthorizationLetterResponseBody create() {
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
    public java.util.List<Data> getData() {
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
        private java.util.List<Data> data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(QuerySmsAuthorizationLetterResponseBody model) {
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

        public QuerySmsAuthorizationLetterResponseBody build() {
            return new QuerySmsAuthorizationLetterResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QuerySmsAuthorizationLetterResponseBody} extends {@link TeaModel}
     *
     * <p>QuerySmsAuthorizationLetterResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Authorization")
        private String authorization;

        @com.aliyun.core.annotation.NameInMap("AuthorizationLetterExpDate")
        private String authorizationLetterExpDate;

        @com.aliyun.core.annotation.NameInMap("AuthorizationLetterId")
        private Long authorizationLetterId;

        @com.aliyun.core.annotation.NameInMap("AuthorizationLetterName")
        private String authorizationLetterName;

        @com.aliyun.core.annotation.NameInMap("AuthorizationLetterPic")
        private String authorizationLetterPic;

        @com.aliyun.core.annotation.NameInMap("OrganizationCode")
        private String organizationCode;

        @com.aliyun.core.annotation.NameInMap("ProxyAuthorization")
        private String proxyAuthorization;

        @com.aliyun.core.annotation.NameInMap("SignScope")
        private String signScope;

        @com.aliyun.core.annotation.NameInMap("State")
        private String state;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private Data(Builder builder) {
            this.authorization = builder.authorization;
            this.authorizationLetterExpDate = builder.authorizationLetterExpDate;
            this.authorizationLetterId = builder.authorizationLetterId;
            this.authorizationLetterName = builder.authorizationLetterName;
            this.authorizationLetterPic = builder.authorizationLetterPic;
            this.organizationCode = builder.organizationCode;
            this.proxyAuthorization = builder.proxyAuthorization;
            this.signScope = builder.signScope;
            this.state = builder.state;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return authorization
         */
        public String getAuthorization() {
            return this.authorization;
        }

        /**
         * @return authorizationLetterExpDate
         */
        public String getAuthorizationLetterExpDate() {
            return this.authorizationLetterExpDate;
        }

        /**
         * @return authorizationLetterId
         */
        public Long getAuthorizationLetterId() {
            return this.authorizationLetterId;
        }

        /**
         * @return authorizationLetterName
         */
        public String getAuthorizationLetterName() {
            return this.authorizationLetterName;
        }

        /**
         * @return authorizationLetterPic
         */
        public String getAuthorizationLetterPic() {
            return this.authorizationLetterPic;
        }

        /**
         * @return organizationCode
         */
        public String getOrganizationCode() {
            return this.organizationCode;
        }

        /**
         * @return proxyAuthorization
         */
        public String getProxyAuthorization() {
            return this.proxyAuthorization;
        }

        /**
         * @return signScope
         */
        public String getSignScope() {
            return this.signScope;
        }

        /**
         * @return state
         */
        public String getState() {
            return this.state;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String authorization; 
            private String authorizationLetterExpDate; 
            private Long authorizationLetterId; 
            private String authorizationLetterName; 
            private String authorizationLetterPic; 
            private String organizationCode; 
            private String proxyAuthorization; 
            private String signScope; 
            private String state; 
            private String status; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.authorization = model.authorization;
                this.authorizationLetterExpDate = model.authorizationLetterExpDate;
                this.authorizationLetterId = model.authorizationLetterId;
                this.authorizationLetterName = model.authorizationLetterName;
                this.authorizationLetterPic = model.authorizationLetterPic;
                this.organizationCode = model.organizationCode;
                this.proxyAuthorization = model.proxyAuthorization;
                this.signScope = model.signScope;
                this.state = model.state;
                this.status = model.status;
            } 

            /**
             * <p>委托授权方</p>
             * 
             * <strong>example:</strong>
             * <p>示例值示例值</p>
             */
            public Builder authorization(String authorization) {
                this.authorization = authorization;
                return this;
            }

            /**
             * <p>委托授权书有效期</p>
             * 
             * <strong>example:</strong>
             * <p>2023-01-01~2026-01-01</p>
             */
            public Builder authorizationLetterExpDate(String authorizationLetterExpDate) {
                this.authorizationLetterExpDate = authorizationLetterExpDate;
                return this;
            }

            /**
             * <p>委托授权书id</p>
             * 
             * <strong>example:</strong>
             * <p>10000******</p>
             */
            public Builder authorizationLetterId(Long authorizationLetterId) {
                this.authorizationLetterId = authorizationLetterId;
                return this;
            }

            /**
             * <p>委托授权书命名</p>
             * 
             * <strong>example:</strong>
             * <p>示例值示例值</p>
             */
            public Builder authorizationLetterName(String authorizationLetterName) {
                this.authorizationLetterName = authorizationLetterName;
                return this;
            }

            /**
             * <p>委托授权书图片地址</p>
             */
            public Builder authorizationLetterPic(String authorizationLetterPic) {
                this.authorizationLetterPic = authorizationLetterPic;
                return this;
            }

            /**
             * <p>授权方统一社会信用代码</p>
             * 
             * <strong>example:</strong>
             * <p>9****************A</p>
             */
            public Builder organizationCode(String organizationCode) {
                this.organizationCode = organizationCode;
                return this;
            }

            /**
             * <p>被委托授权方</p>
             * 
             * <strong>example:</strong>
             * <p>示例值示例值示例值</p>
             */
            public Builder proxyAuthorization(String proxyAuthorization) {
                this.proxyAuthorization = proxyAuthorization;
                return this;
            }

            /**
             * <p>委托授权签名范围</p>
             * 
             * <strong>example:</strong>
             * <p>示例值</p>
             */
            public Builder signScope(String signScope) {
                this.signScope = signScope;
                return this;
            }

            /**
             * <p>委托授权书审核状态（初始化INT/审核通过PASSED）</p>
             * 
             * <strong>example:</strong>
             * <p>PASSED</p>
             */
            public Builder state(String state) {
                this.state = state;
                return this;
            }

            /**
             * <p>委托授权书可用状态（可用VALID/不可用INVALID）</p>
             * 
             * <strong>example:</strong>
             * <p>VALID</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
