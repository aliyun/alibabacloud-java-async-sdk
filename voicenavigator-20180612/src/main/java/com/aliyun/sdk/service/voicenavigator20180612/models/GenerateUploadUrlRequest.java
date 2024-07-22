// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.voicenavigator20180612.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GenerateUploadUrlRequest} extends {@link RequestModel}
 *
 * <p>GenerateUploadUrlRequest</p>
 */
public class GenerateUploadUrlRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CallerBid")
    private String callerBid;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CallerIp")
    private String callerIp;

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
    @com.aliyun.core.annotation.NameInMap("ClientIp")
    private String clientIp;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Environment")
    private Integer environment;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("FileName")
    private String fileName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("InstanceOwnerId")
    private Long instanceOwnerId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Key")
    private String key;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("MfaPresent")
    private Boolean mfaPresent;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ProxyOriginalSecurityTransport")
    private Boolean proxyOriginalSecurityTransport;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ProxyOriginalSourceIp")
    private String proxyOriginalSourceIp;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ProxyTrustTransportInfo")
    private Boolean proxyTrustTransportInfo;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SecurityToken")
    private String securityToken;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SecurityTransport")
    private Boolean securityTransport;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TenantId")
    private Long tenantId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TenantName")
    private String tenantName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("UserId")
    private Long userId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("UserName")
    private String userName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("XspaceServicerId")
    private Long xspaceServicerId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("XspaceTenantBuId")
    private Long xspaceTenantBuId;

    private GenerateUploadUrlRequest(Builder builder) {
        super(builder);
        this.callerBid = builder.callerBid;
        this.callerIp = builder.callerIp;
        this.callerParentId = builder.callerParentId;
        this.callerType = builder.callerType;
        this.callerUid = builder.callerUid;
        this.clientIp = builder.clientIp;
        this.environment = builder.environment;
        this.fileName = builder.fileName;
        this.instanceId = builder.instanceId;
        this.instanceOwnerId = builder.instanceOwnerId;
        this.key = builder.key;
        this.mfaPresent = builder.mfaPresent;
        this.proxyOriginalSecurityTransport = builder.proxyOriginalSecurityTransport;
        this.proxyOriginalSourceIp = builder.proxyOriginalSourceIp;
        this.proxyTrustTransportInfo = builder.proxyTrustTransportInfo;
        this.requestId = builder.requestId;
        this.securityToken = builder.securityToken;
        this.securityTransport = builder.securityTransport;
        this.tenantId = builder.tenantId;
        this.tenantName = builder.tenantName;
        this.userId = builder.userId;
        this.userName = builder.userName;
        this.xspaceServicerId = builder.xspaceServicerId;
        this.xspaceTenantBuId = builder.xspaceTenantBuId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GenerateUploadUrlRequest create() {
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
     * @return callerIp
     */
    public String getCallerIp() {
        return this.callerIp;
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
     * @return environment
     */
    public Integer getEnvironment() {
        return this.environment;
    }

    /**
     * @return fileName
     */
    public String getFileName() {
        return this.fileName;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return instanceOwnerId
     */
    public Long getInstanceOwnerId() {
        return this.instanceOwnerId;
    }

    /**
     * @return key
     */
    public String getKey() {
        return this.key;
    }

    /**
     * @return mfaPresent
     */
    public Boolean getMfaPresent() {
        return this.mfaPresent;
    }

    /**
     * @return proxyOriginalSecurityTransport
     */
    public Boolean getProxyOriginalSecurityTransport() {
        return this.proxyOriginalSecurityTransport;
    }

    /**
     * @return proxyOriginalSourceIp
     */
    public String getProxyOriginalSourceIp() {
        return this.proxyOriginalSourceIp;
    }

    /**
     * @return proxyTrustTransportInfo
     */
    public Boolean getProxyTrustTransportInfo() {
        return this.proxyTrustTransportInfo;
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
     * @return securityTransport
     */
    public Boolean getSecurityTransport() {
        return this.securityTransport;
    }

    /**
     * @return tenantId
     */
    public Long getTenantId() {
        return this.tenantId;
    }

    /**
     * @return tenantName
     */
    public String getTenantName() {
        return this.tenantName;
    }

    /**
     * @return userId
     */
    public Long getUserId() {
        return this.userId;
    }

    /**
     * @return userName
     */
    public String getUserName() {
        return this.userName;
    }

    /**
     * @return xspaceServicerId
     */
    public Long getXspaceServicerId() {
        return this.xspaceServicerId;
    }

    /**
     * @return xspaceTenantBuId
     */
    public Long getXspaceTenantBuId() {
        return this.xspaceTenantBuId;
    }

    public static final class Builder extends Request.Builder<GenerateUploadUrlRequest, Builder> {
        private String callerBid; 
        private String callerIp; 
        private Long callerParentId; 
        private String callerType; 
        private Long callerUid; 
        private String clientIp; 
        private Integer environment; 
        private String fileName; 
        private String instanceId; 
        private Long instanceOwnerId; 
        private String key; 
        private Boolean mfaPresent; 
        private Boolean proxyOriginalSecurityTransport; 
        private String proxyOriginalSourceIp; 
        private Boolean proxyTrustTransportInfo; 
        private String requestId; 
        private String securityToken; 
        private Boolean securityTransport; 
        private Long tenantId; 
        private String tenantName; 
        private Long userId; 
        private String userName; 
        private Long xspaceServicerId; 
        private Long xspaceTenantBuId; 

        private Builder() {
            super();
        } 

        private Builder(GenerateUploadUrlRequest request) {
            super(request);
            this.callerBid = request.callerBid;
            this.callerIp = request.callerIp;
            this.callerParentId = request.callerParentId;
            this.callerType = request.callerType;
            this.callerUid = request.callerUid;
            this.clientIp = request.clientIp;
            this.environment = request.environment;
            this.fileName = request.fileName;
            this.instanceId = request.instanceId;
            this.instanceOwnerId = request.instanceOwnerId;
            this.key = request.key;
            this.mfaPresent = request.mfaPresent;
            this.proxyOriginalSecurityTransport = request.proxyOriginalSecurityTransport;
            this.proxyOriginalSourceIp = request.proxyOriginalSourceIp;
            this.proxyTrustTransportInfo = request.proxyTrustTransportInfo;
            this.requestId = request.requestId;
            this.securityToken = request.securityToken;
            this.securityTransport = request.securityTransport;
            this.tenantId = request.tenantId;
            this.tenantName = request.tenantName;
            this.userId = request.userId;
            this.userName = request.userName;
            this.xspaceServicerId = request.xspaceServicerId;
            this.xspaceTenantBuId = request.xspaceTenantBuId;
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
         * CallerIp.
         */
        public Builder callerIp(String callerIp) {
            this.putBodyParameter("CallerIp", callerIp);
            this.callerIp = callerIp;
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
         * Environment.
         */
        public Builder environment(Integer environment) {
            this.putBodyParameter("Environment", environment);
            this.environment = environment;
            return this;
        }

        /**
         * FileName.
         */
        public Builder fileName(String fileName) {
            this.putBodyParameter("FileName", fileName);
            this.fileName = fileName;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putBodyParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * InstanceOwnerId.
         */
        public Builder instanceOwnerId(Long instanceOwnerId) {
            this.putBodyParameter("InstanceOwnerId", instanceOwnerId);
            this.instanceOwnerId = instanceOwnerId;
            return this;
        }

        /**
         * Key.
         */
        public Builder key(String key) {
            this.putBodyParameter("Key", key);
            this.key = key;
            return this;
        }

        /**
         * MfaPresent.
         */
        public Builder mfaPresent(Boolean mfaPresent) {
            this.putBodyParameter("MfaPresent", mfaPresent);
            this.mfaPresent = mfaPresent;
            return this;
        }

        /**
         * ProxyOriginalSecurityTransport.
         */
        public Builder proxyOriginalSecurityTransport(Boolean proxyOriginalSecurityTransport) {
            this.putBodyParameter("ProxyOriginalSecurityTransport", proxyOriginalSecurityTransport);
            this.proxyOriginalSecurityTransport = proxyOriginalSecurityTransport;
            return this;
        }

        /**
         * ProxyOriginalSourceIp.
         */
        public Builder proxyOriginalSourceIp(String proxyOriginalSourceIp) {
            this.putBodyParameter("ProxyOriginalSourceIp", proxyOriginalSourceIp);
            this.proxyOriginalSourceIp = proxyOriginalSourceIp;
            return this;
        }

        /**
         * ProxyTrustTransportInfo.
         */
        public Builder proxyTrustTransportInfo(Boolean proxyTrustTransportInfo) {
            this.putBodyParameter("ProxyTrustTransportInfo", proxyTrustTransportInfo);
            this.proxyTrustTransportInfo = proxyTrustTransportInfo;
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
         * SecurityTransport.
         */
        public Builder securityTransport(Boolean securityTransport) {
            this.putBodyParameter("SecurityTransport", securityTransport);
            this.securityTransport = securityTransport;
            return this;
        }

        /**
         * TenantId.
         */
        public Builder tenantId(Long tenantId) {
            this.putBodyParameter("TenantId", tenantId);
            this.tenantId = tenantId;
            return this;
        }

        /**
         * TenantName.
         */
        public Builder tenantName(String tenantName) {
            this.putBodyParameter("TenantName", tenantName);
            this.tenantName = tenantName;
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

        /**
         * UserName.
         */
        public Builder userName(String userName) {
            this.putBodyParameter("UserName", userName);
            this.userName = userName;
            return this;
        }

        /**
         * XspaceServicerId.
         */
        public Builder xspaceServicerId(Long xspaceServicerId) {
            this.putBodyParameter("XspaceServicerId", xspaceServicerId);
            this.xspaceServicerId = xspaceServicerId;
            return this;
        }

        /**
         * XspaceTenantBuId.
         */
        public Builder xspaceTenantBuId(Long xspaceTenantBuId) {
            this.putBodyParameter("XspaceTenantBuId", xspaceTenantBuId);
            this.xspaceTenantBuId = xspaceTenantBuId;
            return this;
        }

        @Override
        public GenerateUploadUrlRequest build() {
            return new GenerateUploadUrlRequest(this);
        } 

    } 

}
