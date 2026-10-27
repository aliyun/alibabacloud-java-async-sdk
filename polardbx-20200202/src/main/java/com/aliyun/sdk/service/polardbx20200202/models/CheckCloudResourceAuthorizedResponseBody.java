// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardbx20200202.models;

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
 * {@link CheckCloudResourceAuthorizedResponseBody} extends {@link TeaModel}
 *
 * <p>CheckCloudResourceAuthorizedResponseBody</p>
 */
public class CheckCloudResourceAuthorizedResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CheckCloudResourceAuthorizedResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CheckCloudResourceAuthorizedResponseBody create() {
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

        private Builder(CheckCloudResourceAuthorizedResponseBody model) {
            this.data = model.data;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The response body.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>A501A191-BD70-5E50-98A9-C2A486A82****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CheckCloudResourceAuthorizedResponseBody build() {
            return new CheckCloudResourceAuthorizedResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CheckCloudResourceAuthorizedResponseBody} extends {@link TeaModel}
     *
     * <p>CheckCloudResourceAuthorizedResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AuthorizationState")
        private String authorizationState;

        @com.aliyun.core.annotation.NameInMap("RoleArn")
        private String roleArn;

        private Data(Builder builder) {
            this.authorizationState = builder.authorizationState;
            this.roleArn = builder.roleArn;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return authorizationState
         */
        public String getAuthorizationState() {
            return this.authorizationState;
        }

        /**
         * @return roleArn
         */
        public String getRoleArn() {
            return this.roleArn;
        }

        public static final class Builder {
            private String authorizationState; 
            private String roleArn; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.authorizationState = model.authorizationState;
                this.roleArn = model.roleArn;
            } 

            /**
             * <p>The authorization status. Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: not authorized.</li>
             * <li><strong>1</strong>: authorized.</li>
             * <li><strong>2</strong>: KMS is not activated.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder authorizationState(String authorizationState) {
                this.authorizationState = authorizationState;
                return this;
            }

            /**
             * <p>The global resource descriptor ARN (Alibaba Cloud Resource Name) of the authorized role. After the authorization of the role is complete, the related KMS can be used. Format: acs:ram::$accountID:role/$roleName.</p>
             * 
             * <strong>example:</strong>
             * <p>acs:ram::123456789012****:role/AliyunRdsInstanceEncryptionDefaultRole</p>
             */
            public Builder roleArn(String roleArn) {
                this.roleArn = roleArn;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
