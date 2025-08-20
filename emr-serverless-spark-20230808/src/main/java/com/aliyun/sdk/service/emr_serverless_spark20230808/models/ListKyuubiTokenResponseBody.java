// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr_serverless_spark20230808.models;

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
 * {@link ListKyuubiTokenResponseBody} extends {@link TeaModel}
 *
 * <p>ListKyuubiTokenResponseBody</p>
 */
public class ListKyuubiTokenResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private ListKyuubiTokenResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListKyuubiTokenResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Data data; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ListKyuubiTokenResponseBody model) {
            this.data = model.data;
            this.requestId = model.requestId;
        } 

        /**
         * data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListKyuubiTokenResponseBody build() {
            return new ListKyuubiTokenResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListKyuubiTokenResponseBody} extends {@link TeaModel}
     *
     * <p>ListKyuubiTokenResponseBody</p>
     */
    public static class Tokens extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("accountNames")
        private java.util.List<String> accountNames;

        @com.aliyun.core.annotation.NameInMap("createTime")
        private Long createTime;

        @com.aliyun.core.annotation.NameInMap("createdBy")
        private String createdBy;

        @com.aliyun.core.annotation.NameInMap("expireTime")
        private Long expireTime;

        @com.aliyun.core.annotation.NameInMap("lastUsedTime")
        private Long lastUsedTime;

        @com.aliyun.core.annotation.NameInMap("memberArns")
        private java.util.List<String> memberArns;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("token")
        private String token;

        @com.aliyun.core.annotation.NameInMap("tokenId")
        private String tokenId;

        private Tokens(Builder builder) {
            this.accountNames = builder.accountNames;
            this.createTime = builder.createTime;
            this.createdBy = builder.createdBy;
            this.expireTime = builder.expireTime;
            this.lastUsedTime = builder.lastUsedTime;
            this.memberArns = builder.memberArns;
            this.name = builder.name;
            this.token = builder.token;
            this.tokenId = builder.tokenId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tokens create() {
            return builder().build();
        }

        /**
         * @return accountNames
         */
        public java.util.List<String> getAccountNames() {
            return this.accountNames;
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return createdBy
         */
        public String getCreatedBy() {
            return this.createdBy;
        }

        /**
         * @return expireTime
         */
        public Long getExpireTime() {
            return this.expireTime;
        }

        /**
         * @return lastUsedTime
         */
        public Long getLastUsedTime() {
            return this.lastUsedTime;
        }

        /**
         * @return memberArns
         */
        public java.util.List<String> getMemberArns() {
            return this.memberArns;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return token
         */
        public String getToken() {
            return this.token;
        }

        /**
         * @return tokenId
         */
        public String getTokenId() {
            return this.tokenId;
        }

        public static final class Builder {
            private java.util.List<String> accountNames; 
            private Long createTime; 
            private String createdBy; 
            private Long expireTime; 
            private Long lastUsedTime; 
            private java.util.List<String> memberArns; 
            private String name; 
            private String token; 
            private String tokenId; 

            private Builder() {
            } 

            private Builder(Tokens model) {
                this.accountNames = model.accountNames;
                this.createTime = model.createTime;
                this.createdBy = model.createdBy;
                this.expireTime = model.expireTime;
                this.lastUsedTime = model.lastUsedTime;
                this.memberArns = model.memberArns;
                this.name = model.name;
                this.token = model.token;
                this.tokenId = model.tokenId;
            } 

            /**
             * accountNames.
             */
            public Builder accountNames(java.util.List<String> accountNames) {
                this.accountNames = accountNames;
                return this;
            }

            /**
             * createTime.
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * createdBy.
             */
            public Builder createdBy(String createdBy) {
                this.createdBy = createdBy;
                return this;
            }

            /**
             * expireTime.
             */
            public Builder expireTime(Long expireTime) {
                this.expireTime = expireTime;
                return this;
            }

            /**
             * lastUsedTime.
             */
            public Builder lastUsedTime(Long lastUsedTime) {
                this.lastUsedTime = lastUsedTime;
                return this;
            }

            /**
             * memberArns.
             */
            public Builder memberArns(java.util.List<String> memberArns) {
                this.memberArns = memberArns;
                return this;
            }

            /**
             * name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * token.
             */
            public Builder token(String token) {
                this.token = token;
                return this;
            }

            /**
             * <p>Token ID。</p>
             * 
             * <strong>example:</strong>
             * <p>f14c1347-dcfd-4082-b101-77aa96b5de36</p>
             */
            public Builder tokenId(String tokenId) {
                this.tokenId = tokenId;
                return this;
            }

            public Tokens build() {
                return new Tokens(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListKyuubiTokenResponseBody} extends {@link TeaModel}
     *
     * <p>ListKyuubiTokenResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("tokens")
        private java.util.List<Tokens> tokens;

        private Data(Builder builder) {
            this.tokens = builder.tokens;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return tokens
         */
        public java.util.List<Tokens> getTokens() {
            return this.tokens;
        }

        public static final class Builder {
            private java.util.List<Tokens> tokens; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.tokens = model.tokens;
            } 

            /**
             * tokens.
             */
            public Builder tokens(java.util.List<Tokens> tokens) {
                this.tokens = tokens;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
