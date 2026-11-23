// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.appstream_center20210218.models;

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
 * {@link GetAuthCodeResponseBody} extends {@link TeaModel}
 *
 * <p>GetAuthCodeResponseBody</p>
 */
public class GetAuthCodeResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AuthModel")
    private AuthModel authModel;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetAuthCodeResponseBody(Builder builder) {
        this.authModel = builder.authModel;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAuthCodeResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return authModel
     */
    public AuthModel getAuthModel() {
        return this.authModel;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private AuthModel authModel; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetAuthCodeResponseBody model) {
            this.authModel = model.authModel;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The authorization code information.</p>
         */
        public Builder authModel(AuthModel authModel) {
            this.authModel = authModel;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1CBAFFAB-B697-4049-A9B1-67E1FC5F****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetAuthCodeResponseBody build() {
            return new GetAuthCodeResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetAuthCodeResponseBody} extends {@link TeaModel}
     *
     * <p>GetAuthCodeResponseBody</p>
     */
    public static class AuthModel extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AuthCode")
        private String authCode;

        @com.aliyun.core.annotation.NameInMap("EndUserId")
        private String endUserId;

        @com.aliyun.core.annotation.NameInMap("ExpireTime")
        private String expireTime;

        private AuthModel(Builder builder) {
            this.authCode = builder.authCode;
            this.endUserId = builder.endUserId;
            this.expireTime = builder.expireTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AuthModel create() {
            return builder().build();
        }

        /**
         * @return authCode
         */
        public String getAuthCode() {
            return this.authCode;
        }

        /**
         * @return endUserId
         */
        public String getEndUserId() {
            return this.endUserId;
        }

        /**
         * @return expireTime
         */
        public String getExpireTime() {
            return this.expireTime;
        }

        public static final class Builder {
            private String authCode; 
            private String endUserId; 
            private String expireTime; 

            private Builder() {
            } 

            private Builder(AuthModel model) {
                this.authCode = model.authCode;
                this.endUserId = model.endUserId;
                this.expireTime = model.expireTime;
            } 

            /**
             * <p>The authorization code. The authorization code is valid for 3 minutes and can be used only once regardless of whether the verification succeeds or fails. If multiple authorization codes are generated for a user, only the last generated one is valid.</p>
             * 
             * <strong>example:</strong>
             * <p>acv2ZEq2TNSqOlX+DvyetHGRT08iPhbWg/os1W4HojpBxkMQZkAnbKSfz/wNvS0E149IQZ5TogvBUE8ghCSVV+QBnv48Y+sn4z9fY5ywZA1peI5s4TplQI0TADBhPZXEIzMOdmbNsDGGlGcKOAq8ixd1Epzdu9XfvRzdLOO6o3zQwTZxXsjOgGBW8JTcgCP9W9iYiIjHIdZ2VCAnmMzuyVkyED8gymEevH10QoclyH/O3s8Yq6VF34gMXihDQeiI8PyiAZrW0JWXSWpdy3n4yGtAqMAgv46FzTA+XJ6C********</p>
             */
            public Builder authCode(String authCode) {
                this.authCode = authCode;
                return this;
            }

            /**
             * <p>The username of the Wuying convenience account.</p>
             * 
             * <strong>example:</strong>
             * <p>alice</p>
             */
            public Builder endUserId(String endUserId) {
                this.endUserId = endUserId;
                return this;
            }

            /**
             * <p>The expiration time of the authorization code. The time is displayed in UTC and follows the ISO 8601 standard.</p>
             * 
             * <strong>example:</strong>
             * <p>2015-01-23T12:33:18Z</p>
             */
            public Builder expireTime(String expireTime) {
                this.expireTime = expireTime;
                return this;
            }

            public AuthModel build() {
                return new AuthModel(this);
            } 

        } 

    }
}
