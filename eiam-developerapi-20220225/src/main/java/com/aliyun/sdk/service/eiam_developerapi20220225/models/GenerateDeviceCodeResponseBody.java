// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eiam_developerapi20220225.models;

import com.aliyun.sdk.gateway.eiam.dev.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.eiam.dev.models.*;

/**
 * 
 * {@link GenerateDeviceCodeResponseBody} extends {@link TeaModel}
 *
 * <p>GenerateDeviceCodeResponseBody</p>
 */
public class GenerateDeviceCodeResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("device_code")
    private String deviceCode;

    @com.aliyun.core.annotation.NameInMap("expires_at")
    private Long expiresAt;

    @com.aliyun.core.annotation.NameInMap("expires_in")
    private Long expiresIn;

    @com.aliyun.core.annotation.NameInMap("interval")
    private Long interval;

    @com.aliyun.core.annotation.NameInMap("user_code")
    private String userCode;

    @com.aliyun.core.annotation.NameInMap("verification_uri")
    private String verificationUri;

    @com.aliyun.core.annotation.NameInMap("verification_uri_complete")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(GenerateDeviceCodeResponseBody model) {
            this.deviceCode = model.deviceCode;
            this.expiresAt = model.expiresAt;
            this.expiresIn = model.expiresIn;
            this.interval = model.interval;
            this.userCode = model.userCode;
            this.verificationUri = model.verificationUri;
            this.verificationUriComplete = model.verificationUriComplete;
        } 

        /**
         * <p>The device code.</p>
         * 
         * <strong>example:</strong>
         * <p>xxxxx</p>
         */
        public Builder deviceCode(String deviceCode) {
            this.deviceCode = deviceCode;
            return this;
        }

        /**
         * <p>The time when the token expires. This value is a UNIX timestamp representing the number of seconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>1653288641</p>
         */
        public Builder expiresAt(Long expiresAt) {
            this.expiresAt = expiresAt;
            return this;
        }

        /**
         * <p>The remaining validity period of the device code. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1200</p>
         */
        public Builder expiresIn(Long expiresIn) {
            this.expiresIn = expiresIn;
            return this;
        }

        /**
         * <p>The timeout period of the request token. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        public Builder interval(Long interval) {
            this.interval = interval;
            return this;
        }

        /**
         * <p>The user authorization code.</p>
         * 
         * <strong>example:</strong>
         * <p>xxxxx</p>
         */
        public Builder userCode(String userCode) {
            this.userCode = userCode;
            return this;
        }

        /**
         * <p>The verification URI.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://example.com/authorize/device">https://example.com/authorize/device</a></p>
         */
        public Builder verificationUri(String verificationUri) {
            this.verificationUri = verificationUri;
            return this;
        }

        /**
         * <p>The complete verification URI.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://example.com/authorize/device?user_code=">https://example.com/authorize/device?user_code=</a>
         * xxxx</p>
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
