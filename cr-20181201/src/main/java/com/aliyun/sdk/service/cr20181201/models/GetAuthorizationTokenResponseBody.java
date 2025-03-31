// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cr20181201.models;

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
 * {@link GetAuthorizationTokenResponseBody} extends {@link TeaModel}
 *
 * <p>GetAuthorizationTokenResponseBody</p>
 */
public class GetAuthorizationTokenResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AuthorizationToken")
    private String authorizationToken;

    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("ExpireTime")
    private Long expireTime;

    @com.aliyun.core.annotation.NameInMap("IsSuccess")
    private Boolean isSuccess;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TempUsername")
    private String tempUsername;

    private GetAuthorizationTokenResponseBody(Builder builder) {
        this.authorizationToken = builder.authorizationToken;
        this.code = builder.code;
        this.expireTime = builder.expireTime;
        this.isSuccess = builder.isSuccess;
        this.requestId = builder.requestId;
        this.tempUsername = builder.tempUsername;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAuthorizationTokenResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return authorizationToken
     */
    public String getAuthorizationToken() {
        return this.authorizationToken;
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return expireTime
     */
    public Long getExpireTime() {
        return this.expireTime;
    }

    /**
     * @return isSuccess
     */
    public Boolean getIsSuccess() {
        return this.isSuccess;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return tempUsername
     */
    public String getTempUsername() {
        return this.tempUsername;
    }

    public static final class Builder {
        private String authorizationToken; 
        private String code; 
        private Long expireTime; 
        private Boolean isSuccess; 
        private String requestId; 
        private String tempUsername; 

        private Builder() {
        } 

        private Builder(GetAuthorizationTokenResponseBody model) {
            this.authorizationToken = model.authorizationToken;
            this.code = model.code;
            this.expireTime = model.expireTime;
            this.isSuccess = model.isSuccess;
            this.requestId = model.requestId;
            this.tempUsername = model.tempUsername;
        } 

        /**
         * <p>The temporary password returned after you call this API operation is a Security Token Service (STS) token whose validity period is 1 hour. Take note of the following items when you log on to Container Registry instances by using an STS token:</p>
         * <ul>
         * <li>If the STS token belongs to an Alibaba Cloud account, you can use the STS token to log on to all Container Registry instances that belong to the Alibaba Cloud account.</li>
         * <li>If the STS token belongs to a Resource Access Management (RAM) user, you can use the STS token to log on to all Container Registry instances that belong to the RAM user.</li>
         * <li>You can use an STS token to access only Container Registry instances to which the STS token is scoped.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>shaunadadakks:uuczxnjcyeyhdjadkkajsjdjadhyucb</p>
         */
        public Builder authorizationToken(String authorizationToken) {
            this.authorizationToken = authorizationToken;
            return this;
        }

        /**
         * <p>Indicates whether the API call is successful.</p>
         * <ul>
         * <li><code>true</code>: successful</li>
         * <li><code>false</code>: failed</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The return value.</p>
         * 
         * <strong>example:</strong>
         * <p>1571242083000</p>
         */
        public Builder expireTime(Long expireTime) {
            this.expireTime = expireTime;
            return this;
        }

        /**
         * <p>The username that is used to log on to the Container Registry instance.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder isSuccess(Boolean isSuccess) {
            this.isSuccess = isSuccess;
            return this;
        }

        /**
         * <p>The timestamp when the temporary password expires. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>E069EB86-E6AD-4A98-ADDE-0E993390239A</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The password that is used to log on to the Container Registry instance.</p>
         * 
         * <strong>example:</strong>
         * <p>temp_user_cr</p>
         */
        public Builder tempUsername(String tempUsername) {
            this.tempUsername = tempUsername;
            return this;
        }

        public GetAuthorizationTokenResponseBody build() {
            return new GetAuthorizationTokenResponseBody(this);
        } 

    } 

}
