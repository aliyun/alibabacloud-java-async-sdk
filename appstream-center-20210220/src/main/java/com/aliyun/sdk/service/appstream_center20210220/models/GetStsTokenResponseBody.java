// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.appstream_center20210220.models;

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
 * {@link GetStsTokenResponseBody} extends {@link TeaModel}
 *
 * <p>GetStsTokenResponseBody</p>
 */
public class GetStsTokenResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("StsTokenModel")
    private StsTokenModel stsTokenModel;

    private GetStsTokenResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.stsTokenModel = builder.stsTokenModel;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetStsTokenResponseBody create() {
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
     * @return stsTokenModel
     */
    public StsTokenModel getStsTokenModel() {
        return this.stsTokenModel;
    }

    public static final class Builder {
        private String requestId; 
        private StsTokenModel stsTokenModel; 

        private Builder() {
        } 

        private Builder(GetStsTokenResponseBody model) {
            this.requestId = model.requestId;
            this.stsTokenModel = model.stsTokenModel;
        } 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * StsTokenModel.
         */
        public Builder stsTokenModel(StsTokenModel stsTokenModel) {
            this.stsTokenModel = stsTokenModel;
            return this;
        }

        public GetStsTokenResponseBody build() {
            return new GetStsTokenResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetStsTokenResponseBody} extends {@link TeaModel}
     *
     * <p>GetStsTokenResponseBody</p>
     */
    public static class StsTokenModel extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EndUserId")
        private String endUserId;

        @com.aliyun.core.annotation.NameInMap("LoginToken")
        private String loginToken;

        @com.aliyun.core.annotation.NameInMap("ProfileRegion")
        private String profileRegion;

        @com.aliyun.core.annotation.NameInMap("SessionId")
        private String sessionId;

        @com.aliyun.core.annotation.NameInMap("StsToken")
        private String stsToken;

        @com.aliyun.core.annotation.NameInMap("TenantId")
        private Long tenantId;

        private StsTokenModel(Builder builder) {
            this.endUserId = builder.endUserId;
            this.loginToken = builder.loginToken;
            this.profileRegion = builder.profileRegion;
            this.sessionId = builder.sessionId;
            this.stsToken = builder.stsToken;
            this.tenantId = builder.tenantId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static StsTokenModel create() {
            return builder().build();
        }

        /**
         * @return endUserId
         */
        public String getEndUserId() {
            return this.endUserId;
        }

        /**
         * @return loginToken
         */
        public String getLoginToken() {
            return this.loginToken;
        }

        /**
         * @return profileRegion
         */
        public String getProfileRegion() {
            return this.profileRegion;
        }

        /**
         * @return sessionId
         */
        public String getSessionId() {
            return this.sessionId;
        }

        /**
         * @return stsToken
         */
        public String getStsToken() {
            return this.stsToken;
        }

        /**
         * @return tenantId
         */
        public Long getTenantId() {
            return this.tenantId;
        }

        public static final class Builder {
            private String endUserId; 
            private String loginToken; 
            private String profileRegion; 
            private String sessionId; 
            private String stsToken; 
            private Long tenantId; 

            private Builder() {
            } 

            private Builder(StsTokenModel model) {
                this.endUserId = model.endUserId;
                this.loginToken = model.loginToken;
                this.profileRegion = model.profileRegion;
                this.sessionId = model.sessionId;
                this.stsToken = model.stsToken;
                this.tenantId = model.tenantId;
            } 

            /**
             * EndUserId.
             */
            public Builder endUserId(String endUserId) {
                this.endUserId = endUserId;
                return this;
            }

            /**
             * LoginToken.
             */
            public Builder loginToken(String loginToken) {
                this.loginToken = loginToken;
                return this;
            }

            /**
             * ProfileRegion.
             */
            public Builder profileRegion(String profileRegion) {
                this.profileRegion = profileRegion;
                return this;
            }

            /**
             * SessionId.
             */
            public Builder sessionId(String sessionId) {
                this.sessionId = sessionId;
                return this;
            }

            /**
             * StsToken.
             */
            public Builder stsToken(String stsToken) {
                this.stsToken = stsToken;
                return this;
            }

            /**
             * TenantId.
             */
            public Builder tenantId(Long tenantId) {
                this.tenantId = tenantId;
                return this;
            }

            public StsTokenModel build() {
                return new StsTokenModel(this);
            } 

        } 

    }
}
