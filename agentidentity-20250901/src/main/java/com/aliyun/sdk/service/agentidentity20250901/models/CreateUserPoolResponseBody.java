// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agentidentity20250901.models;

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
 * {@link CreateUserPoolResponseBody} extends {@link TeaModel}
 *
 * <p>CreateUserPoolResponseBody</p>
 */
public class CreateUserPoolResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("UserPool")
    private UserPool userPool;

    private CreateUserPoolResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.userPool = builder.userPool;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateUserPoolResponseBody create() {
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
     * @return userPool
     */
    public UserPool getUserPool() {
        return this.userPool;
    }

    public static final class Builder {
        private String requestId; 
        private UserPool userPool; 

        private Builder() {
        } 

        private Builder(CreateUserPoolResponseBody model) {
            this.requestId = model.requestId;
            this.userPool = model.userPool;
        } 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * UserPool.
         */
        public Builder userPool(UserPool userPool) {
            this.userPool = userPool;
            return this;
        }

        public CreateUserPoolResponseBody build() {
            return new CreateUserPoolResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CreateUserPoolResponseBody} extends {@link TeaModel}
     *
     * <p>CreateUserPoolResponseBody</p>
     */
    public static class UserPool extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("UpdateTime")
        private String updateTime;

        @com.aliyun.core.annotation.NameInMap("UserPoolId")
        private String userPoolId;

        @com.aliyun.core.annotation.NameInMap("UserPoolName")
        private String userPoolName;

        private UserPool(Builder builder) {
            this.createTime = builder.createTime;
            this.description = builder.description;
            this.updateTime = builder.updateTime;
            this.userPoolId = builder.userPoolId;
            this.userPoolName = builder.userPoolName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UserPool create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return updateTime
         */
        public String getUpdateTime() {
            return this.updateTime;
        }

        /**
         * @return userPoolId
         */
        public String getUserPoolId() {
            return this.userPoolId;
        }

        /**
         * @return userPoolName
         */
        public String getUserPoolName() {
            return this.userPoolName;
        }

        public static final class Builder {
            private String createTime; 
            private String description; 
            private String updateTime; 
            private String userPoolId; 
            private String userPoolName; 

            private Builder() {
            } 

            private Builder(UserPool model) {
                this.createTime = model.createTime;
                this.description = model.description;
                this.updateTime = model.updateTime;
                this.userPoolId = model.userPoolId;
                this.userPoolName = model.userPoolName;
            } 

            /**
             * CreateTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * UpdateTime.
             */
            public Builder updateTime(String updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            /**
             * UserPoolId.
             */
            public Builder userPoolId(String userPoolId) {
                this.userPoolId = userPoolId;
                return this;
            }

            /**
             * UserPoolName.
             */
            public Builder userPoolName(String userPoolName) {
                this.userPoolName = userPoolName;
                return this;
            }

            public UserPool build() {
                return new UserPool(this);
            } 

        } 

    }
}
