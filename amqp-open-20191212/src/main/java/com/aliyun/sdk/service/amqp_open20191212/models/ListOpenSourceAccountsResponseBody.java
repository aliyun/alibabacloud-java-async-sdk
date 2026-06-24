// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.amqp_open20191212.models;

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
 * {@link ListOpenSourceAccountsResponseBody} extends {@link TeaModel}
 *
 * <p>ListOpenSourceAccountsResponseBody</p>
 */
public class ListOpenSourceAccountsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private ListOpenSourceAccountsResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.maxResults = builder.maxResults;
        this.message = builder.message;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListOpenSourceAccountsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public Integer getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public java.util.List<Data> getData() {
        return this.data;
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
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
        private Integer code; 
        private java.util.List<Data> data; 
        private Integer maxResults; 
        private String message; 
        private String nextToken; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(ListOpenSourceAccountsResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.maxResults = model.maxResults;
            this.message = model.message;
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * Code.
         */
        public Builder code(Integer code) {
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
         * MaxResults.
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
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
         * NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>021788F6-E50C-4BD6-9F80-66B0A19A****</p>
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

        public ListOpenSourceAccountsResponseBody build() {
            return new ListOpenSourceAccountsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListOpenSourceAccountsResponseBody} extends {@link TeaModel}
     *
     * <p>ListOpenSourceAccountsResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AliyunUserId")
        private Long aliyunUserId;

        @com.aliyun.core.annotation.NameInMap("CInstanceId")
        private String cInstanceId;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("ExtraJson")
        private String extraJson;

        @com.aliyun.core.annotation.NameInMap("HashingAlgorithm")
        private String hashingAlgorithm;

        @com.aliyun.core.annotation.NameInMap("Limits")
        private String limits;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("PasswordHash")
        private String passwordHash;

        @com.aliyun.core.annotation.NameInMap("Tags")
        private String tags;

        @com.aliyun.core.annotation.NameInMap("WeakPassword")
        private Boolean weakPassword;

        private Data(Builder builder) {
            this.aliyunUserId = builder.aliyunUserId;
            this.cInstanceId = builder.cInstanceId;
            this.createTime = builder.createTime;
            this.extraJson = builder.extraJson;
            this.hashingAlgorithm = builder.hashingAlgorithm;
            this.limits = builder.limits;
            this.name = builder.name;
            this.passwordHash = builder.passwordHash;
            this.tags = builder.tags;
            this.weakPassword = builder.weakPassword;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return aliyunUserId
         */
        public Long getAliyunUserId() {
            return this.aliyunUserId;
        }

        /**
         * @return cInstanceId
         */
        public String getCInstanceId() {
            return this.cInstanceId;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return extraJson
         */
        public String getExtraJson() {
            return this.extraJson;
        }

        /**
         * @return hashingAlgorithm
         */
        public String getHashingAlgorithm() {
            return this.hashingAlgorithm;
        }

        /**
         * @return limits
         */
        public String getLimits() {
            return this.limits;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return passwordHash
         */
        public String getPasswordHash() {
            return this.passwordHash;
        }

        /**
         * @return tags
         */
        public String getTags() {
            return this.tags;
        }

        /**
         * @return weakPassword
         */
        public Boolean getWeakPassword() {
            return this.weakPassword;
        }

        public static final class Builder {
            private Long aliyunUserId; 
            private String cInstanceId; 
            private String createTime; 
            private String extraJson; 
            private String hashingAlgorithm; 
            private String limits; 
            private String name; 
            private String passwordHash; 
            private String tags; 
            private Boolean weakPassword; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.aliyunUserId = model.aliyunUserId;
                this.cInstanceId = model.cInstanceId;
                this.createTime = model.createTime;
                this.extraJson = model.extraJson;
                this.hashingAlgorithm = model.hashingAlgorithm;
                this.limits = model.limits;
                this.name = model.name;
                this.passwordHash = model.passwordHash;
                this.tags = model.tags;
                this.weakPassword = model.weakPassword;
            } 

            /**
             * AliyunUserId.
             */
            public Builder aliyunUserId(Long aliyunUserId) {
                this.aliyunUserId = aliyunUserId;
                return this;
            }

            /**
             * CInstanceId.
             */
            public Builder cInstanceId(String cInstanceId) {
                this.cInstanceId = cInstanceId;
                return this;
            }

            /**
             * CreateTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * ExtraJson.
             */
            public Builder extraJson(String extraJson) {
                this.extraJson = extraJson;
                return this;
            }

            /**
             * HashingAlgorithm.
             */
            public Builder hashingAlgorithm(String hashingAlgorithm) {
                this.hashingAlgorithm = hashingAlgorithm;
                return this;
            }

            /**
             * Limits.
             */
            public Builder limits(String limits) {
                this.limits = limits;
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
             * PasswordHash.
             */
            public Builder passwordHash(String passwordHash) {
                this.passwordHash = passwordHash;
                return this;
            }

            /**
             * Tags.
             */
            public Builder tags(String tags) {
                this.tags = tags;
                return this;
            }

            /**
             * WeakPassword.
             */
            public Builder weakPassword(Boolean weakPassword) {
                this.weakPassword = weakPassword;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
