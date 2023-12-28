// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dytnsapi20200217.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryUsageStatisticsByTagIdResponseBody} extends {@link TeaModel}
 *
 * <p>QueryUsageStatisticsByTagIdResponseBody</p>
 */
public class QueryUsageStatisticsByTagIdResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Data")
    private java.util.List < Data> data;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private QueryUsageStatisticsByTagIdResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryUsageStatisticsByTagIdResponseBody create() {
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
        private java.util.List < Data> data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        /**
         * The response code. **OK** indicates that the request is successful.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * The returned data.
         */
        public Builder data(java.util.List < Data> data) {
            this.data = data;
            return this;
        }

        /**
         * The returned message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Indicates whether the call is successful.
         * <p>
         * 
         * *   true
         * *   false
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public QueryUsageStatisticsByTagIdResponseBody build() {
            return new QueryUsageStatisticsByTagIdResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("AuthorizationCode")
        private String authorizationCode;

        @NameInMap("FailTotal")
        private Long failTotal;

        @NameInMap("GmtDateStr")
        private String gmtDateStr;

        @NameInMap("Id")
        private Long id;

        @NameInMap("IndustryName")
        private String industryName;

        @NameInMap("PartnerId")
        private Long partnerId;

        @NameInMap("SceneName")
        private String sceneName;

        @NameInMap("SuccessTotal")
        private Long successTotal;

        @NameInMap("TagId")
        private Long tagId;

        @NameInMap("TagName")
        private String tagName;

        @NameInMap("Total")
        private Long total;

        private Data(Builder builder) {
            this.authorizationCode = builder.authorizationCode;
            this.failTotal = builder.failTotal;
            this.gmtDateStr = builder.gmtDateStr;
            this.id = builder.id;
            this.industryName = builder.industryName;
            this.partnerId = builder.partnerId;
            this.sceneName = builder.sceneName;
            this.successTotal = builder.successTotal;
            this.tagId = builder.tagId;
            this.tagName = builder.tagName;
            this.total = builder.total;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return authorizationCode
         */
        public String getAuthorizationCode() {
            return this.authorizationCode;
        }

        /**
         * @return failTotal
         */
        public Long getFailTotal() {
            return this.failTotal;
        }

        /**
         * @return gmtDateStr
         */
        public String getGmtDateStr() {
            return this.gmtDateStr;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return industryName
         */
        public String getIndustryName() {
            return this.industryName;
        }

        /**
         * @return partnerId
         */
        public Long getPartnerId() {
            return this.partnerId;
        }

        /**
         * @return sceneName
         */
        public String getSceneName() {
            return this.sceneName;
        }

        /**
         * @return successTotal
         */
        public Long getSuccessTotal() {
            return this.successTotal;
        }

        /**
         * @return tagId
         */
        public Long getTagId() {
            return this.tagId;
        }

        /**
         * @return tagName
         */
        public String getTagName() {
            return this.tagName;
        }

        /**
         * @return total
         */
        public Long getTotal() {
            return this.total;
        }

        public static final class Builder {
            private String authorizationCode; 
            private Long failTotal; 
            private String gmtDateStr; 
            private Long id; 
            private String industryName; 
            private Long partnerId; 
            private String sceneName; 
            private Long successTotal; 
            private Long tagId; 
            private String tagName; 
            private Long total; 

            /**
             * The authorization code.
             */
            public Builder authorizationCode(String authorizationCode) {
                this.authorizationCode = authorizationCode;
                return this;
            }

            /**
             * The numbers for which the query failed.
             */
            public Builder failTotal(Long failTotal) {
                this.failTotal = failTotal;
                return this;
            }

            /**
             * The creation time.
             */
            public Builder gmtDateStr(String gmtDateStr) {
                this.gmtDateStr = gmtDateStr;
                return this;
            }

            /**
             * The ID of the authorization code usage record.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * The industry name.
             */
            public Builder industryName(String industryName) {
                this.industryName = industryName;
                return this;
            }

            /**
             * The customer product ID (PID).
             */
            public Builder partnerId(Long partnerId) {
                this.partnerId = partnerId;
                return this;
            }

            /**
             * The scene name.
             */
            public Builder sceneName(String sceneName) {
                this.sceneName = sceneName;
                return this;
            }

            /**
             * The numbers for which the query succeeded.
             */
            public Builder successTotal(Long successTotal) {
                this.successTotal = successTotal;
                return this;
            }

            /**
             * The tag name.
             */
            public Builder tagId(Long tagId) {
                this.tagId = tagId;
                return this;
            }

            /**
             * The tag name.
             */
            public Builder tagName(String tagName) {
                this.tagName = tagName;
                return this;
            }

            /**
             * The total quantity of numbers that are involved in the query.
             */
            public Builder total(Long total) {
                this.total = total;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
