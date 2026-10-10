// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aicontent20240611.models;

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
 * {@link CreateAccessWarrantRequest} extends {@link RequestModel}
 *
 * <p>CreateAccessWarrantRequest</p>
 */
public class CreateAccessWarrantRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("appId")
    private String appId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("requestSign")
    private String requestSign;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("timestamp")
    private String timestamp;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("userClientIp")
    private String userClientIp;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("userId")
    private String userId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("warrantAvailable")
    private Integer warrantAvailable;

    private CreateAccessWarrantRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.requestSign = builder.requestSign;
        this.timestamp = builder.timestamp;
        this.userClientIp = builder.userClientIp;
        this.userId = builder.userId;
        this.warrantAvailable = builder.warrantAvailable;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateAccessWarrantRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appId
     */
    public String getAppId() {
        return this.appId;
    }

    /**
     * @return requestSign
     */
    public String getRequestSign() {
        return this.requestSign;
    }

    /**
     * @return timestamp
     */
    public String getTimestamp() {
        return this.timestamp;
    }

    /**
     * @return userClientIp
     */
    public String getUserClientIp() {
        return this.userClientIp;
    }

    /**
     * @return userId
     */
    public String getUserId() {
        return this.userId;
    }

    /**
     * @return warrantAvailable
     */
    public Integer getWarrantAvailable() {
        return this.warrantAvailable;
    }

    public static final class Builder extends Request.Builder<CreateAccessWarrantRequest, Builder> {
        private String appId; 
        private String requestSign; 
        private String timestamp; 
        private String userClientIp; 
        private String userId; 
        private Integer warrantAvailable; 

        private Builder() {
            super();
        } 

        private Builder(CreateAccessWarrantRequest request) {
            super(request);
            this.appId = request.appId;
            this.requestSign = request.requestSign;
            this.timestamp = request.timestamp;
            this.userClientIp = request.userClientIp;
            this.userId = request.userId;
            this.warrantAvailable = request.warrantAvailable;
        } 

        /**
         * <p>The merchant\&quot;s application ID.</p>
         * 
         * <strong>example:</strong>
         * <p>a123</p>
         */
        public Builder appId(String appId) {
            this.putBodyParameter("appId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * <p>The signature for the request parameters.</p>
         * 
         * <strong>example:</strong>
         * <p>e32fac43df0b0b0be32fac43df0b0b0b</p>
         */
        public Builder requestSign(String requestSign) {
            this.putBodyParameter("requestSign", requestSign);
            this.requestSign = requestSign;
            return this;
        }

        /**
         * <p>The 10-digit request timestamp in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1701000000</p>
         */
        public Builder timestamp(String timestamp) {
            this.putBodyParameter("timestamp", timestamp);
            this.timestamp = timestamp;
            return this;
        }

        /**
         * <p>The public IP address of the client device.</p>
         * 
         * <strong>example:</strong>
         * <p>110.25.23.12</p>
         */
        public Builder userClientIp(String userClientIp) {
            this.putBodyParameter("userClientIp", userClientIp);
            this.userClientIp = userClientIp;
            return this;
        }

        /**
         * <p>The merchant\&quot;s user ID.</p>
         * 
         * <strong>example:</strong>
         * <p>sn123</p>
         */
        public Builder userId(String userId) {
            this.putBodyParameter("userId", userId);
            this.userId = userId;
            return this;
        }

        /**
         * <p>The duration, in seconds, for which the access warrant is valid.</p>
         * 
         * <strong>example:</strong>
         * <p>7200</p>
         */
        public Builder warrantAvailable(Integer warrantAvailable) {
            this.putBodyParameter("warrantAvailable", warrantAvailable);
            this.warrantAvailable = warrantAvailable;
            return this;
        }

        @Override
        public CreateAccessWarrantRequest build() {
            return new CreateAccessWarrantRequest(this);
        } 

    } 

}
