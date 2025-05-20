// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mseap20210118.models;

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
 * {@link SetRedisValueRequest} extends {@link RequestModel}
 *
 * <p>SetRedisValueRequest</p>
 */
public class SetRedisValueRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AliyunKp")
    private String aliyunKp;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ApiType")
    private String apiType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Bid")
    private String bid;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Key")
    private String key;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OriginalRequest")
    private String originalRequest;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Timeout")
    private Long timeout;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserAccessKeyId")
    private String userAccessKeyId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserBid")
    private String userBid;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserCallerParentId")
    private Long userCallerParentId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserCallerType")
    private String userCallerType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserClientIp")
    private String userClientIp;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserKp")
    private String userKp;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserMfaPresent")
    private Boolean userMfaPresent;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserSecurityToken")
    private String userSecurityToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Value")
    private String value;

    private SetRedisValueRequest(Builder builder) {
        super(builder);
        this.aliyunKp = builder.aliyunKp;
        this.apiType = builder.apiType;
        this.bid = builder.bid;
        this.key = builder.key;
        this.lang = builder.lang;
        this.originalRequest = builder.originalRequest;
        this.requestId = builder.requestId;
        this.timeout = builder.timeout;
        this.userAccessKeyId = builder.userAccessKeyId;
        this.userBid = builder.userBid;
        this.userCallerParentId = builder.userCallerParentId;
        this.userCallerType = builder.userCallerType;
        this.userClientIp = builder.userClientIp;
        this.userKp = builder.userKp;
        this.userMfaPresent = builder.userMfaPresent;
        this.userSecurityToken = builder.userSecurityToken;
        this.value = builder.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetRedisValueRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return aliyunKp
     */
    public String getAliyunKp() {
        return this.aliyunKp;
    }

    /**
     * @return apiType
     */
    public String getApiType() {
        return this.apiType;
    }

    /**
     * @return bid
     */
    public String getBid() {
        return this.bid;
    }

    /**
     * @return key
     */
    public String getKey() {
        return this.key;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return originalRequest
     */
    public String getOriginalRequest() {
        return this.originalRequest;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return timeout
     */
    public Long getTimeout() {
        return this.timeout;
    }

    /**
     * @return userAccessKeyId
     */
    public String getUserAccessKeyId() {
        return this.userAccessKeyId;
    }

    /**
     * @return userBid
     */
    public String getUserBid() {
        return this.userBid;
    }

    /**
     * @return userCallerParentId
     */
    public Long getUserCallerParentId() {
        return this.userCallerParentId;
    }

    /**
     * @return userCallerType
     */
    public String getUserCallerType() {
        return this.userCallerType;
    }

    /**
     * @return userClientIp
     */
    public String getUserClientIp() {
        return this.userClientIp;
    }

    /**
     * @return userKp
     */
    public String getUserKp() {
        return this.userKp;
    }

    /**
     * @return userMfaPresent
     */
    public Boolean getUserMfaPresent() {
        return this.userMfaPresent;
    }

    /**
     * @return userSecurityToken
     */
    public String getUserSecurityToken() {
        return this.userSecurityToken;
    }

    /**
     * @return value
     */
    public String getValue() {
        return this.value;
    }

    public static final class Builder extends Request.Builder<SetRedisValueRequest, Builder> {
        private String aliyunKp; 
        private String apiType; 
        private String bid; 
        private String key; 
        private String lang; 
        private String originalRequest; 
        private String requestId; 
        private Long timeout; 
        private String userAccessKeyId; 
        private String userBid; 
        private Long userCallerParentId; 
        private String userCallerType; 
        private String userClientIp; 
        private String userKp; 
        private Boolean userMfaPresent; 
        private String userSecurityToken; 
        private String value; 

        private Builder() {
            super();
        } 

        private Builder(SetRedisValueRequest request) {
            super(request);
            this.aliyunKp = request.aliyunKp;
            this.apiType = request.apiType;
            this.bid = request.bid;
            this.key = request.key;
            this.lang = request.lang;
            this.originalRequest = request.originalRequest;
            this.requestId = request.requestId;
            this.timeout = request.timeout;
            this.userAccessKeyId = request.userAccessKeyId;
            this.userBid = request.userBid;
            this.userCallerParentId = request.userCallerParentId;
            this.userCallerType = request.userCallerType;
            this.userClientIp = request.userClientIp;
            this.userKp = request.userKp;
            this.userMfaPresent = request.userMfaPresent;
            this.userSecurityToken = request.userSecurityToken;
            this.value = request.value;
        } 

        /**
         * <p>aliyunKp</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder aliyunKp(String aliyunKp) {
            this.putQueryParameter("AliyunKp", aliyunKp);
            this.aliyunKp = aliyunKp;
            return this;
        }

        /**
         * <p>apiType</p>
         * 
         * <strong>example:</strong>
         * <p>part_config_data</p>
         */
        public Builder apiType(String apiType) {
            this.putQueryParameter("ApiType", apiType);
            this.apiType = apiType;
            return this;
        }

        /**
         * <p>bid</p>
         * 
         * <strong>example:</strong>
         * <p>26842</p>
         */
        public Builder bid(String bid) {
            this.putQueryParameter("Bid", bid);
            this.bid = bid;
            return this;
        }

        /**
         * Key.
         */
        public Builder key(String key) {
            this.putQueryParameter("Key", key);
            this.key = key;
            return this;
        }

        /**
         * <p>lang</p>
         * 
         * <strong>example:</strong>
         * <p>zh</p>
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * <p>originalRequest</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder originalRequest(String originalRequest) {
            this.putQueryParameter("OriginalRequest", originalRequest);
            this.originalRequest = originalRequest;
            return this;
        }

        /**
         * <p>requestId</p>
         * 
         * <strong>example:</strong>
         * <p>F864A883-AD76-53D5-9A24-A6DAD5177697</p>
         */
        public Builder requestId(String requestId) {
            this.putQueryParameter("RequestId", requestId);
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>timeout</p>
         * 
         * <strong>example:</strong>
         * <p>5000</p>
         */
        public Builder timeout(Long timeout) {
            this.putQueryParameter("Timeout", timeout);
            this.timeout = timeout;
            return this;
        }

        /**
         * <p>userAccessKeyId</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder userAccessKeyId(String userAccessKeyId) {
            this.putQueryParameter("UserAccessKeyId", userAccessKeyId);
            this.userAccessKeyId = userAccessKeyId;
            return this;
        }

        /**
         * <p>userBid</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder userBid(String userBid) {
            this.putQueryParameter("UserBid", userBid);
            this.userBid = userBid;
            return this;
        }

        /**
         * <p>userCallerParentId</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder userCallerParentId(Long userCallerParentId) {
            this.putQueryParameter("UserCallerParentId", userCallerParentId);
            this.userCallerParentId = userCallerParentId;
            return this;
        }

        /**
         * <p>userCallerType</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder userCallerType(String userCallerType) {
            this.putQueryParameter("UserCallerType", userCallerType);
            this.userCallerType = userCallerType;
            return this;
        }

        /**
         * <p>userClientIp</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder userClientIp(String userClientIp) {
            this.putQueryParameter("UserClientIp", userClientIp);
            this.userClientIp = userClientIp;
            return this;
        }

        /**
         * <p>userKp</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder userKp(String userKp) {
            this.putQueryParameter("UserKp", userKp);
            this.userKp = userKp;
            return this;
        }

        /**
         * <p>userMfaPresent</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder userMfaPresent(Boolean userMfaPresent) {
            this.putQueryParameter("UserMfaPresent", userMfaPresent);
            this.userMfaPresent = userMfaPresent;
            return this;
        }

        /**
         * <p>userSecurityToken</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder userSecurityToken(String userSecurityToken) {
            this.putQueryParameter("UserSecurityToken", userSecurityToken);
            this.userSecurityToken = userSecurityToken;
            return this;
        }

        /**
         * Value.
         */
        public Builder value(String value) {
            this.putQueryParameter("Value", value);
            this.value = value;
            return this;
        }

        @Override
        public SetRedisValueRequest build() {
            return new SetRedisValueRequest(this);
        } 

    } 

}
