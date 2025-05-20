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
 * {@link GetNodeByFlowIdRequest} extends {@link RequestModel}
 *
 * <p>GetNodeByFlowIdRequest</p>
 */
public class GetNodeByFlowIdRequest extends Request {
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
    @com.aliyun.core.annotation.NameInMap("FlowId")
    private Long flowId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OriginalRequest")
    private String originalRequest;

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
    @com.aliyun.core.annotation.NameInMap("UserCallerSecurityTransport")
    private Boolean userCallerSecurityTransport;

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

    private GetNodeByFlowIdRequest(Builder builder) {
        super(builder);
        this.aliyunKp = builder.aliyunKp;
        this.apiType = builder.apiType;
        this.bid = builder.bid;
        this.flowId = builder.flowId;
        this.lang = builder.lang;
        this.originalRequest = builder.originalRequest;
        this.userAccessKeyId = builder.userAccessKeyId;
        this.userBid = builder.userBid;
        this.userCallerParentId = builder.userCallerParentId;
        this.userCallerSecurityTransport = builder.userCallerSecurityTransport;
        this.userCallerType = builder.userCallerType;
        this.userClientIp = builder.userClientIp;
        this.userKp = builder.userKp;
        this.userMfaPresent = builder.userMfaPresent;
        this.userSecurityToken = builder.userSecurityToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetNodeByFlowIdRequest create() {
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
     * @return flowId
     */
    public Long getFlowId() {
        return this.flowId;
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
     * @return userCallerSecurityTransport
     */
    public Boolean getUserCallerSecurityTransport() {
        return this.userCallerSecurityTransport;
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

    public static final class Builder extends Request.Builder<GetNodeByFlowIdRequest, Builder> {
        private String aliyunKp; 
        private String apiType; 
        private String bid; 
        private Long flowId; 
        private String lang; 
        private String originalRequest; 
        private String userAccessKeyId; 
        private String userBid; 
        private Long userCallerParentId; 
        private Boolean userCallerSecurityTransport; 
        private String userCallerType; 
        private String userClientIp; 
        private String userKp; 
        private Boolean userMfaPresent; 
        private String userSecurityToken; 

        private Builder() {
            super();
        } 

        private Builder(GetNodeByFlowIdRequest request) {
            super(request);
            this.aliyunKp = request.aliyunKp;
            this.apiType = request.apiType;
            this.bid = request.bid;
            this.flowId = request.flowId;
            this.lang = request.lang;
            this.originalRequest = request.originalRequest;
            this.userAccessKeyId = request.userAccessKeyId;
            this.userBid = request.userBid;
            this.userCallerParentId = request.userCallerParentId;
            this.userCallerSecurityTransport = request.userCallerSecurityTransport;
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
         * <p>MPC</p>
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
         * FlowId.
         */
        public Builder flowId(Long flowId) {
            this.putQueryParameter("FlowId", flowId);
            this.flowId = flowId;
            return this;
        }

        /**
         * <p>lang</p>
         * 
         * <strong>example:</strong>
         * <p>en</p>
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
         * <p>userCallerSecurityTransport</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder userCallerSecurityTransport(Boolean userCallerSecurityTransport) {
            this.putQueryParameter("UserCallerSecurityTransport", userCallerSecurityTransport);
            this.userCallerSecurityTransport = userCallerSecurityTransport;
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
         * <p>true</p>
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
        public GetNodeByFlowIdRequest build() {
            return new GetNodeByFlowIdRequest(this);
        } 

    } 

}
