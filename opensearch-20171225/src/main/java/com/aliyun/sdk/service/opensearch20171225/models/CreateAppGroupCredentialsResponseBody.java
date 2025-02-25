// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.opensearch20171225.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateAppGroupCredentialsResponseBody} extends {@link TeaModel}
 *
 * <p>CreateAppGroupCredentialsResponseBody</p>
 */
public class CreateAppGroupCredentialsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("result")
    private Result result;

    private CreateAppGroupCredentialsResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateAppGroupCredentialsResponseBody create() {
        return builder().build();
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

        public CreateAppGroupCredentialsResponseBody build() {
            return new CreateAppGroupCredentialsResponseBody(this);
        } 

    } 

    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("appGroupId")
        private Long appGroupId;

        @com.aliyun.core.annotation.NameInMap("enabled")
        private Boolean enabled;

        @com.aliyun.core.annotation.NameInMap("token")
        private String token;

        @com.aliyun.core.annotation.NameInMap("type")
        private String type;

        private Result(Builder builder) {
            this.appGroupId = builder.appGroupId;
            this.enabled = builder.enabled;
            this.token = builder.token;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return appGroupId
         */
        public Long getAppGroupId() {
            return this.appGroupId;
        }

        /**
         * @return enabled
         */
        public Boolean getEnabled() {
            return this.enabled;
        }

        /**
         * @return token
         */
        public String getToken() {
            return this.token;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private Long appGroupId; 
            private Boolean enabled; 
            private String token; 
            private String type; 

            /**
             * appGroupId.
             */
            public Builder appGroupId(Long appGroupId) {
                this.appGroupId = appGroupId;
                return this;
            }

            /**
             * enabled.
             */
            public Builder enabled(Boolean enabled) {
                this.enabled = enabled;
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
