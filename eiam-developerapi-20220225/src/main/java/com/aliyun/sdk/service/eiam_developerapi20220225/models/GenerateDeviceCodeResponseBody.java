// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eiam_developerapi20220225.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.eiam.dev.models.*;

/**
 * {@link GenerateDeviceCodeResponseBody} extends {@link TeaModel}
 *
 * <p>GenerateDeviceCodeResponseBody</p>
 */
public class GenerateDeviceCodeResponseBody extends TeaModel {
    @NameInMap("device_code")
    private String deviceCode;

    @NameInMap("expires_at")
    private Long expiresAt;

    @NameInMap("expires_in")
    private Long expiresIn;

    @NameInMap("interval")
    private Long interval;

    @NameInMap("user_code")
    private String userCode;

    @NameInMap("verification_uri")
    private String verificationUri;

    @NameInMap("verification_uri_complete")
    private String verificationUriComplete;

    private GenerateDeviceCodeResponseBody(Builder builder) {
        this.deviceCode = builder.deviceCode;
        this.expiresAt = builder.expiresAt;
        this.expiresIn = builder.expiresIn;
        this.interval = builder.interval;
        this.userCode = builder.userCode;
        this.verificationUri = builder.verificationUri;
        this.verificationUriComplete = builder.verificationUriComplete;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GenerateDeviceCodeResponseBody create() {
        return builder().build();
    }

    /**
     * @return deviceCode
     */
    public String getDeviceCode() {
        return this.deviceCode;
    }

    /**
     * @return expiresAt
     */
    public Long getExpiresAt() {
        return this.expiresAt;
    }

    /**
     * @return expiresIn
     */
    public Long getExpiresIn() {
        return this.expiresIn;
    }

    /**
     * @return interval
     */
    public Long getInterval() {
        return this.interval;
    }

    /**
     * @return userCode
     */
    public String getUserCode() {
        return this.userCode;
    }

    /**
     * @return verificationUri
     */
    public String getVerificationUri() {
        return this.verificationUri;
    }

    /**
     * @return verificationUriComplete
     */
    public String getVerificationUriComplete() {
        return this.verificationUriComplete;
    }

    public static final class Builder {
        private String deviceCode; 
        private Long expiresAt; 
        private Long expiresIn; 
        private Long interval; 
        private String userCode; 
        private String verificationUri; 
        private String verificationUriComplete; 

        /**
         * 设备验证码
         */
        public Builder deviceCode(String deviceCode) {
            this.deviceCode = deviceCode;
            return this;
        }

        /**
         * 过期时间
         */
        public Builder expiresAt(Long expiresAt) {
            this.expiresAt = expiresAt;
            return this;
        }

        /**
         * device_code和user_code的有效时长，单位秒
         */
        public Builder expiresIn(Long expiresIn) {
            this.expiresIn = expiresIn;
            return this;
        }

        /**
         * 请求token节点的超时时间，单位秒
         */
        public Builder interval(Long interval) {
            this.interval = interval;
            return this;
        }

        /**
         * 终端用户验证码
         */
        public Builder userCode(String userCode) {
            this.userCode = userCode;
            return this;
        }

        /**
         * 验证URI
         */
        public Builder verificationUri(String verificationUri) {
            this.verificationUri = verificationUri;
            return this;
        }

        /**
         * 包含user_code的完整验证URI
         */
        public Builder verificationUriComplete(String verificationUriComplete) {
            this.verificationUriComplete = verificationUriComplete;
            return this;
        }

        public GenerateDeviceCodeResponseBody build() {
            return new GenerateDeviceCodeResponseBody(this);
        } 

    } 

}
