// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.account_crm20160606.models;

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
 * {@link QueryAgRelationCountAndQuotaRequest} extends {@link RequestModel}
 *
 * <p>QueryAgRelationCountAndQuotaRequest</p>
 */
public class QueryAgRelationCountAndQuotaRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AppName")
    private String appName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CallerBid")
    private Long callerBid;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CallerParentId")
    private Long callerParentId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CallerType")
    private String callerType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CallerUid")
    private Long callerUid;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Mpk")
    private String mpk;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("NullObject")
    private Boolean nullObject;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SecurityToken")
    private String securityToken;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SourceIp")
    private String sourceIp;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("StsTokenCallerBid")
    private Long stsTokenCallerBid;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("StsTokenCallerUid")
    private Long stsTokenCallerUid;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("StsTokenRoleId")
    private Long stsTokenRoleId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Version")
    private String version;

    private QueryAgRelationCountAndQuotaRequest(Builder builder) {
        super(builder);
        this.appName = builder.appName;
        this.callerBid = builder.callerBid;
        this.callerParentId = builder.callerParentId;
        this.callerType = builder.callerType;
        this.callerUid = builder.callerUid;
        this.mpk = builder.mpk;
        this.nullObject = builder.nullObject;
        this.requestId = builder.requestId;
        this.securityToken = builder.securityToken;
        this.sourceIp = builder.sourceIp;
        this.stsTokenCallerBid = builder.stsTokenCallerBid;
        this.stsTokenCallerUid = builder.stsTokenCallerUid;
        this.stsTokenRoleId = builder.stsTokenRoleId;
        this.version = builder.version;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryAgRelationCountAndQuotaRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appName
     */
    public String getAppName() {
        return this.appName;
    }

    /**
     * @return callerBid
     */
    public Long getCallerBid() {
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
     * @return mpk
     */
    public String getMpk() {
        return this.mpk;
    }

    /**
     * @return nullObject
     */
    public Boolean getNullObject() {
        return this.nullObject;
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
     * @return stsTokenRoleId
     */
    public Long getStsTokenRoleId() {
        return this.stsTokenRoleId;
    }

    /**
     * @return version
     */
    public String getVersion() {
        return this.version;
    }

    public static final class Builder extends Request.Builder<QueryAgRelationCountAndQuotaRequest, Builder> {
        private String appName; 
        private Long callerBid; 
        private Long callerParentId; 
        private String callerType; 
        private Long callerUid; 
        private String mpk; 
        private Boolean nullObject; 
        private String requestId; 
        private String securityToken; 
        private String sourceIp; 
        private Long stsTokenCallerBid; 
        private Long stsTokenCallerUid; 
        private Long stsTokenRoleId; 
        private String version; 

        private Builder() {
            super();
        } 

        private Builder(QueryAgRelationCountAndQuotaRequest request) {
            super(request);
            this.appName = request.appName;
            this.callerBid = request.callerBid;
            this.callerParentId = request.callerParentId;
            this.callerType = request.callerType;
            this.callerUid = request.callerUid;
            this.mpk = request.mpk;
            this.nullObject = request.nullObject;
            this.requestId = request.requestId;
            this.securityToken = request.securityToken;
            this.sourceIp = request.sourceIp;
            this.stsTokenCallerBid = request.stsTokenCallerBid;
            this.stsTokenCallerUid = request.stsTokenCallerUid;
            this.stsTokenRoleId = request.stsTokenRoleId;
            this.version = request.version;
        } 

        /**
         * AppName.
         */
        public Builder appName(String appName) {
            this.putBodyParameter("AppName", appName);
            this.appName = appName;
            return this;
        }

        /**
         * CallerBid.
         */
        public Builder callerBid(Long callerBid) {
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
         * Mpk.
         */
        public Builder mpk(String mpk) {
            this.putBodyParameter("Mpk", mpk);
            this.mpk = mpk;
            return this;
        }

        /**
         * NullObject.
         */
        public Builder nullObject(Boolean nullObject) {
            this.putBodyParameter("NullObject", nullObject);
            this.nullObject = nullObject;
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
         * StsTokenRoleId.
         */
        public Builder stsTokenRoleId(Long stsTokenRoleId) {
            this.putBodyParameter("StsTokenRoleId", stsTokenRoleId);
            this.stsTokenRoleId = stsTokenRoleId;
            return this;
        }

        /**
         * Version.
         */
        public Builder version(String version) {
            this.putBodyParameter("Version", version);
            this.version = version;
            return this;
        }

        @Override
        public QueryAgRelationCountAndQuotaRequest build() {
            return new QueryAgRelationCountAndQuotaRequest(this);
        } 

    } 

}
