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
 * {@link PullRpaModelRequest} extends {@link RequestModel}
 *
 * <p>PullRpaModelRequest</p>
 */
public class PullRpaModelRequest extends Request {
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
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OriginalRequest")
    private String originalRequest;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TemplateId")
    private Long templateId;

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

    private PullRpaModelRequest(Builder builder) {
        super(builder);
        this.aliyunKp = builder.aliyunKp;
        this.apiType = builder.apiType;
        this.bid = builder.bid;
        this.lang = builder.lang;
        this.originalRequest = builder.originalRequest;
        this.templateId = builder.templateId;
        this.userAccessKeyId = builder.userAccessKeyId;
        this.userBid = builder.userBid;
        this.userCallerParentId = builder.userCallerParentId;
        this.userCallerType = builder.userCallerType;
        this.userClientIp = builder.userClientIp;
        this.userKp = builder.userKp;
        this.userMfaPresent = builder.userMfaPresent;
        this.userSecurityToken = builder.userSecurityToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PullRpaModelRequest create() {
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
     * @return templateId
     */
    public Long getTemplateId() {
        return this.templateId;
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

    public static final class Builder extends Request.Builder<PullRpaModelRequest, Builder> {
        private String aliyunKp; 
        private String apiType; 
        private String bid; 
        private String lang; 
        private String originalRequest; 
        private Long templateId; 
        private String userAccessKeyId; 
        private String userBid; 
        private Long userCallerParentId; 
        private String userCallerType; 
        private String userClientIp; 
        private String userKp; 
        private Boolean userMfaPresent; 
        private String userSecurityToken; 

        private Builder() {
            super();
        } 

        private Builder(PullRpaModelRequest request) {
            super(request);
            this.aliyunKp = request.aliyunKp;
            this.apiType = request.apiType;
            this.bid = request.bid;
            this.lang = request.lang;
            this.originalRequest = request.originalRequest;
            this.templateId = request.templateId;
            this.userAccessKeyId = request.userAccessKeyId;
            this.userBid = request.userBid;
            this.userCallerParentId = request.userCallerParentId;
            this.userCallerType = request.userCallerType;
            this.userClientIp = request.userClientIp;
            this.userKp = request.userKp;
            this.userMfaPresent = request.userMfaPresent;
            this.userSecurityToken = request.userSecurityToken;
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
         * <p>openAPI</p>
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
         * <p>templateId</p>
         * 
         * <strong>example:</strong>
         * <p>17</p>
         */
        public Builder templateId(Long templateId) {
            this.putQueryParameter("TemplateId", templateId);
            this.templateId = templateId;
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

        @Override
        public PullRpaModelRequest build() {
            return new PullRpaModelRequest(this);
        } 

    } 

}
