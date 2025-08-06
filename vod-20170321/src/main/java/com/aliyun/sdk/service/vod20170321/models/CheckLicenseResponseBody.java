// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

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
 * {@link CheckLicenseResponseBody} extends {@link TeaModel}
 *
 * <p>CheckLicenseResponseBody</p>
 */
public class CheckLicenseResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AuthInfo")
    private String authInfo;

    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CheckLicenseResponseBody(Builder builder) {
        this.authInfo = builder.authInfo;
        this.code = builder.code;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CheckLicenseResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return authInfo
     */
    public String getAuthInfo() {
        return this.authInfo;
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
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

    public static final class Builder {
        private String authInfo; 
        private String code; 
        private String message; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(CheckLicenseResponseBody model) {
            this.authInfo = model.authInfo;
            this.code = model.code;
            this.message = model.message;
            this.requestId = model.requestId;
        } 

        /**
         * AuthInfo.
         */
        public Builder authInfo(String authInfo) {
            this.authInfo = authInfo;
            return this;
        }

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
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
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CheckLicenseResponseBody build() {
            return new CheckLicenseResponseBody(this);
        } 

    } 

}
