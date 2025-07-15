// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

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
 * {@link ModifyLiveMessageAppAuditResponseBody} extends {@link TeaModel}
 *
 * <p>ModifyLiveMessageAppAuditResponseBody</p>
 */
public class ModifyLiveMessageAppAuditResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AppId")
    private String appId;

    @com.aliyun.core.annotation.NameInMap("AppSign")
    private String appSign;

    @com.aliyun.core.annotation.NameInMap("AuditNeedAuthentication")
    private Boolean auditNeedAuthentication;

    @com.aliyun.core.annotation.NameInMap("AuditType")
    private Integer auditType;

    @com.aliyun.core.annotation.NameInMap("AuditUrl")
    private String auditUrl;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ModifyLiveMessageAppAuditResponseBody(Builder builder) {
        this.appId = builder.appId;
        this.appSign = builder.appSign;
        this.auditNeedAuthentication = builder.auditNeedAuthentication;
        this.auditType = builder.auditType;
        this.auditUrl = builder.auditUrl;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyLiveMessageAppAuditResponseBody create() {
        return builder().build();
    }

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
     * @return appSign
     */
    public String getAppSign() {
        return this.appSign;
    }

    /**
     * @return auditNeedAuthentication
     */
    public Boolean getAuditNeedAuthentication() {
        return this.auditNeedAuthentication;
    }

    /**
     * @return auditType
     */
    public Integer getAuditType() {
        return this.auditType;
    }

    /**
     * @return auditUrl
     */
    public String getAuditUrl() {
        return this.auditUrl;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String appId; 
        private String appSign; 
        private Boolean auditNeedAuthentication; 
        private Integer auditType; 
        private String auditUrl; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ModifyLiveMessageAppAuditResponseBody model) {
            this.appId = model.appId;
            this.appSign = model.appSign;
            this.auditNeedAuthentication = model.auditNeedAuthentication;
            this.auditType = model.auditType;
            this.auditUrl = model.auditUrl;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The ID of the interactive messaging application.</p>
         * 
         * <strong>example:</strong>
         * <p>demo</p>
         */
        public Builder appId(String appId) {
            this.appId = appId;
            return this;
        }

        /**
         * <p>The signature of the interactive messaging application. It is required by the interactive messaging SDK.</p>
         * 
         * <strong>example:</strong>
         * <hr>
         */
        public Builder appSign(String appSign) {
            this.appSign = appSign;
            return this;
        }

        /**
         * <p>Indicates whether authentication is enabled. If custom content moderation is used, the value of this parameter is true by default.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder auditNeedAuthentication(Boolean auditNeedAuthentication) {
            this.auditNeedAuthentication = auditNeedAuthentication;
            return this;
        }

        /**
         * <p>The content moderation method.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder auditType(Integer auditType) {
            this.auditType = auditType;
            return this;
        }

        /**
         * <p>The URL for content moderation. This parameter is returned when the value of AuditType is 2.</p>
         * 
         * <strong>example:</strong>
         * <p>http: //example.aliyundoc.com/exampleaudit</p>
         */
        public Builder auditUrl(String auditUrl) {
            this.auditUrl = auditUrl;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>4C4E8440-3838-1831-9BDE-AFC15803****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ModifyLiveMessageAppAuditResponseBody build() {
            return new ModifyLiveMessageAppAuditResponseBody(this);
        } 

    } 

}
