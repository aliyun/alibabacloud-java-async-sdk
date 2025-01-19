// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dytnsapi20200217.models;

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
 * {@link QueryUsageStatisticsByTagIdResponseBody} extends {@link TeaModel}
 *
 * <p>QueryUsageStatisticsByTagIdResponseBody</p>
 */
public class QueryUsageStatisticsByTagIdResponseBody extends TeaModel {
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
        private String code; 
        private java.util.List<Data> data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        /**
         * <p>The response code. <strong>OK</strong> indicates that the request is successful.</p>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The returned data.</p>
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The returned message.</p>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>D45CC751-34DF-5797-81FB-9A2ED6DC024B</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the call is successful.</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public QueryUsageStatisticsByTagIdResponseBody build() {
            return new QueryUsageStatisticsByTagIdResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryUsageStatisticsByTagIdResponseBody} extends {@link TeaModel}
     *
     * <p>QueryUsageStatisticsByTagIdResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AuthorizationCode")
        private String authorizationCode;

        @com.aliyun.core.annotation.NameInMap("FailTotal")
        private Long failTotal;

        @com.aliyun.core.annotation.NameInMap("GmtDateStr")
        private String gmtDateStr;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("IndustryName")
        private String industryName;

        @com.aliyun.core.annotation.NameInMap("PartnerId")
        private Long partnerId;

        @com.aliyun.core.annotation.NameInMap("SceneName")
        private String sceneName;

        @com.aliyun.core.annotation.NameInMap("SuccessTotal")
        private Long successTotal;

        @com.aliyun.core.annotation.NameInMap("TagId")
        private Long tagId;

        @com.aliyun.core.annotation.NameInMap("TagName")
        private String tagName;

        @com.aliyun.core.annotation.NameInMap("Total")
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
             * <p>The authorization code.</p>
             * 
             * <strong>example:</strong>
             * <p>g61I8UV5zd</p>
             */
            public Builder authorizationCode(String authorizationCode) {
                this.authorizationCode = authorizationCode;
                return this;
            }

            /**
             * <p>The numbers for which the query failed.</p>
             * 
             * <strong>example:</strong>
             * <p>71</p>
             */
            public Builder failTotal(Long failTotal) {
                this.failTotal = failTotal;
                return this;
            }

            /**
             * <p>The creation time.</p>
             * 
             * <strong>example:</strong>
             * <p>20230312</p>
             */
            public Builder gmtDateStr(String gmtDateStr) {
                this.gmtDateStr = gmtDateStr;
                return this;
            }

            /**
             * <p>The ID of the authorization code usage record.</p>
             * 
             * <strong>example:</strong>
             * <p>17</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The industry name.</p>
             * 
             * <strong>example:</strong>
             * <p>Home security</p>
             */
            public Builder industryName(String industryName) {
                this.industryName = industryName;
                return this;
            }

            /**
             * <p>The customer product ID (PID).</p>
             * 
             * <strong>example:</strong>
             * <p>89</p>
             */
            public Builder partnerId(Long partnerId) {
                this.partnerId = partnerId;
                return this;
            }

            /**
             * <p>The scene name.</p>
             * 
             * <strong>example:</strong>
             * <p>Return visit</p>
             */
            public Builder sceneName(String sceneName) {
                this.sceneName = sceneName;
                return this;
            }

            /**
             * <p>The numbers for which the query succeeded.</p>
             * 
             * <strong>example:</strong>
             * <p>93</p>
             */
            public Builder successTotal(Long successTotal) {
                this.successTotal = successTotal;
                return this;
            }

            /**
             * <p>The tag name.</p>
             * 
             * <strong>example:</strong>
             * <p>69</p>
             */
            public Builder tagId(Long tagId) {
                this.tagId = tagId;
                return this;
            }

            /**
             * <p>The tag name.</p>
             * 
             * <strong>example:</strong>
             * <p>Alibaba Cloud Query</p>
             */
            public Builder tagName(String tagName) {
                this.tagName = tagName;
                return this;
            }

            /**
             * <p>The total quantity of numbers that are involved in the query.</p>
             * 
             * <strong>example:</strong>
             * <p>41</p>
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
