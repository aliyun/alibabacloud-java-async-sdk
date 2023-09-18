// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.partnerintl20181227.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeProductRequest} extends {@link RequestModel}
 *
 * <p>DescribeProductRequest</p>
 */
public class DescribeProductRequest extends Request {
    @Body
    @NameInMap("CallerBid")
    private String callerBid;

    @Body
    @NameInMap("CallerParentId")
    private Long callerParentId;

    @Body
    @NameInMap("CallerType")
    private String callerType;

    @Body
    @NameInMap("CallerUid")
    private Long callerUid;

    @Body
    @NameInMap("ClientIp")
    private String clientIp;

    @Body
    @NameInMap("Code")
    private String code;

    @Body
    @NameInMap("EagleEyeRpcId")
    private String eagleEyeRpcId;

    @Body
    @NameInMap("EagleEyeTraceId")
    private String eagleEyeTraceId;

    @Body
    @NameInMap("EagleEyeUserData")
    private String eagleEyeUserData;

    @Body
    @NameInMap("OwnerId")
    private Long ownerId;

    @Body
    @NameInMap("QueryDraft")
    private Boolean queryDraft;

    @Body
    @NameInMap("RequestId")
    private String requestId;

    @Body
    @NameInMap("SecurityToken")
    private String securityToken;

    @Body
    @NameInMap("SourceIp")
    private String sourceIp;

    @Body
    @NameInMap("StsTokenCallerBid")
    private Long stsTokenCallerBid;

    @Body
    @NameInMap("StsTokenCallerUid")
    private Long stsTokenCallerUid;

    @Body
    @NameInMap("StsTokenPrincipalId")
    private String stsTokenPrincipalId;

    @Body
    @NameInMap("StsTokenRoleId")
    private Long stsTokenRoleId;

    @Body
    @NameInMap("StsTokenUserId")
    private Long stsTokenUserId;

    @Body
    @NameInMap("UserId")
    private Long userId;

    private DescribeProductRequest(Builder builder) {
        super(builder);
        this.callerBid = builder.callerBid;
        this.callerParentId = builder.callerParentId;
        this.callerType = builder.callerType;
        this.callerUid = builder.callerUid;
        this.clientIp = builder.clientIp;
        this.code = builder.code;
        this.eagleEyeRpcId = builder.eagleEyeRpcId;
        this.eagleEyeTraceId = builder.eagleEyeTraceId;
        this.eagleEyeUserData = builder.eagleEyeUserData;
        this.ownerId = builder.ownerId;
        this.queryDraft = builder.queryDraft;
        this.requestId = builder.requestId;
        this.securityToken = builder.securityToken;
        this.sourceIp = builder.sourceIp;
        this.stsTokenCallerBid = builder.stsTokenCallerBid;
        this.stsTokenCallerUid = builder.stsTokenCallerUid;
        this.stsTokenPrincipalId = builder.stsTokenPrincipalId;
        this.stsTokenRoleId = builder.stsTokenRoleId;
        this.stsTokenUserId = builder.stsTokenUserId;
        this.userId = builder.userId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeProductRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return callerBid
     */
    public String getCallerBid() {
        return this.callerBid;
    }

    /**
     * @return callerParentId
     */
    public Long getCallerParentId() {
        return this.callerParentId;
    }

    /**
     * @return callerType
     */
    public String getCallerType() {
        return this.callerType;
    }

    /**
     * @return callerUid
     */
    public Long getCallerUid() {
        return this.callerUid;
    }

    /**
     * @return clientIp
     */
    public String getClientIp() {
        return this.clientIp;
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return eagleEyeRpcId
     */
    public String getEagleEyeRpcId() {
        return this.eagleEyeRpcId;
    }

    /**
     * @return eagleEyeTraceId
     */
    public String getEagleEyeTraceId() {
        return this.eagleEyeTraceId;
    }

    /**
     * @return eagleEyeUserData
     */
    public String getEagleEyeUserData() {
        return this.eagleEyeUserData;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return queryDraft
     */
    public Boolean getQueryDraft() {
        return this.queryDraft;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return securityToken
     */
    public String getSecurityToken() {
        return this.securityToken;
    }

    /**
     * @return sourceIp
     */
    public String getSourceIp() {
        return this.sourceIp;
    }

    /**
     * @return stsTokenCallerBid
     */
    public Long getStsTokenCallerBid() {
        return this.stsTokenCallerBid;
    }

    /**
     * @return stsTokenCallerUid
     */
    public Long getStsTokenCallerUid() {
        return this.stsTokenCallerUid;
    }

    /**
     * @return stsTokenPrincipalId
     */
    public String getStsTokenPrincipalId() {
        return this.stsTokenPrincipalId;
    }

    /**
     * @return stsTokenRoleId
     */
    public Long getStsTokenRoleId() {
        return this.stsTokenRoleId;
    }

    /**
     * @return stsTokenUserId
     */
    public Long getStsTokenUserId() {
        return this.stsTokenUserId;
    }

    /**
     * @return userId
     */
    public Long getUserId() {
        return this.userId;
    }

    public static final class Builder extends Request.Builder<DescribeProductRequest, Builder> {
        private String callerBid; 
        private Long callerParentId; 
        private String callerType; 
        private Long callerUid; 
        private String clientIp; 
        private String code; 
        private String eagleEyeRpcId; 
        private String eagleEyeTraceId; 
        private String eagleEyeUserData; 
        private Long ownerId; 
        private Boolean queryDraft; 
        private String requestId; 
        private String securityToken; 
        private String sourceIp; 
        private Long stsTokenCallerBid; 
        private Long stsTokenCallerUid; 
        private String stsTokenPrincipalId; 
        private Long stsTokenRoleId; 
        private Long stsTokenUserId; 
        private Long userId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeProductRequest request) {
            super(request);
            this.callerBid = request.callerBid;
            this.callerParentId = request.callerParentId;
            this.callerType = request.callerType;
            this.callerUid = request.callerUid;
            this.clientIp = request.clientIp;
            this.code = request.code;
            this.eagleEyeRpcId = request.eagleEyeRpcId;
            this.eagleEyeTraceId = request.eagleEyeTraceId;
            this.eagleEyeUserData = request.eagleEyeUserData;
            this.ownerId = request.ownerId;
            this.queryDraft = request.queryDraft;
            this.requestId = request.requestId;
            this.securityToken = request.securityToken;
            this.sourceIp = request.sourceIp;
            this.stsTokenCallerBid = request.stsTokenCallerBid;
            this.stsTokenCallerUid = request.stsTokenCallerUid;
            this.stsTokenPrincipalId = request.stsTokenPrincipalId;
            this.stsTokenRoleId = request.stsTokenRoleId;
            this.stsTokenUserId = request.stsTokenUserId;
            this.userId = request.userId;
        } 

        /**
         * CallerBid.
         */
        public Builder callerBid(String callerBid) {
            this.putBodyParameter("CallerBid", callerBid);
            this.callerBid = callerBid;
            return this;
        }

        /**
         * CallerParentId.
         */
        public Builder callerParentId(Long callerParentId) {
            this.putBodyParameter("CallerParentId", callerParentId);
            this.callerParentId = callerParentId;
            return this;
        }

        /**
         * CallerType.
         */
        public Builder callerType(String callerType) {
            this.putBodyParameter("CallerType", callerType);
            this.callerType = callerType;
            return this;
        }

        /**
         * CallerUid.
         */
        public Builder callerUid(Long callerUid) {
            this.putBodyParameter("CallerUid", callerUid);
            this.callerUid = callerUid;
            return this;
        }

        /**
         * ClientIp.
         */
        public Builder clientIp(String clientIp) {
            this.putBodyParameter("ClientIp", clientIp);
            this.clientIp = clientIp;
            return this;
        }

        /**
         * Code.
         */
        public Builder code(String code) {
            this.putBodyParameter("Code", code);
            this.code = code;
            return this;
        }

        /**
         * EagleEyeRpcId.
         */
        public Builder eagleEyeRpcId(String eagleEyeRpcId) {
            this.putBodyParameter("EagleEyeRpcId", eagleEyeRpcId);
            this.eagleEyeRpcId = eagleEyeRpcId;
            return this;
        }

        /**
         * EagleEyeTraceId.
         */
        public Builder eagleEyeTraceId(String eagleEyeTraceId) {
            this.putBodyParameter("EagleEyeTraceId", eagleEyeTraceId);
            this.eagleEyeTraceId = eagleEyeTraceId;
            return this;
        }

        /**
         * EagleEyeUserData.
         */
        public Builder eagleEyeUserData(String eagleEyeUserData) {
            this.putBodyParameter("EagleEyeUserData", eagleEyeUserData);
            this.eagleEyeUserData = eagleEyeUserData;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putBodyParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * QueryDraft.
         */
        public Builder queryDraft(Boolean queryDraft) {
            this.putBodyParameter("QueryDraft", queryDraft);
            this.queryDraft = queryDraft;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.putBodyParameter("RequestId", requestId);
            this.requestId = requestId;
            return this;
        }

        /**
         * SecurityToken.
         */
        public Builder securityToken(String securityToken) {
            this.putBodyParameter("SecurityToken", securityToken);
            this.securityToken = securityToken;
            return this;
        }

        /**
         * SourceIp.
         */
        public Builder sourceIp(String sourceIp) {
            this.putBodyParameter("SourceIp", sourceIp);
            this.sourceIp = sourceIp;
            return this;
        }

        /**
         * StsTokenCallerBid.
         */
        public Builder stsTokenCallerBid(Long stsTokenCallerBid) {
            this.putBodyParameter("StsTokenCallerBid", stsTokenCallerBid);
            this.stsTokenCallerBid = stsTokenCallerBid;
            return this;
        }

        /**
         * StsTokenCallerUid.
         */
        public Builder stsTokenCallerUid(Long stsTokenCallerUid) {
            this.putBodyParameter("StsTokenCallerUid", stsTokenCallerUid);
            this.stsTokenCallerUid = stsTokenCallerUid;
            return this;
        }

        /**
         * StsTokenPrincipalId.
         */
        public Builder stsTokenPrincipalId(String stsTokenPrincipalId) {
            this.putBodyParameter("StsTokenPrincipalId", stsTokenPrincipalId);
            this.stsTokenPrincipalId = stsTokenPrincipalId;
            return this;
        }

        /**
         * StsTokenRoleId.
         */
        public Builder stsTokenRoleId(Long stsTokenRoleId) {
            this.putBodyParameter("StsTokenRoleId", stsTokenRoleId);
            this.stsTokenRoleId = stsTokenRoleId;
            return this;
        }

        /**
         * StsTokenUserId.
         */
        public Builder stsTokenUserId(Long stsTokenUserId) {
            this.putBodyParameter("StsTokenUserId", stsTokenUserId);
            this.stsTokenUserId = stsTokenUserId;
            return this;
        }

        /**
         * UserId.
         */
        public Builder userId(Long userId) {
            this.putBodyParameter("UserId", userId);
            this.userId = userId;
            return this;
        }

        @Override
        public DescribeProductRequest build() {
            return new DescribeProductRequest(this);
        } 

    } 

}
