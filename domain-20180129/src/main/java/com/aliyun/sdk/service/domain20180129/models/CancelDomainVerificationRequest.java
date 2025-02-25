// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.domain20180129.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CancelDomainVerificationRequest} extends {@link RequestModel}
 *
 * <p>CancelDomainVerificationRequest</p>
 */
public class CancelDomainVerificationRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ActionType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String actionType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserClientIp")
    private String userClientIp;

    private CancelDomainVerificationRequest(Builder builder) {
        super(builder);
        this.actionType = builder.actionType;
        this.instanceId = builder.instanceId;
        this.lang = builder.lang;
        this.userClientIp = builder.userClientIp;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CancelDomainVerificationRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return actionType
     */
    public String getActionType() {
        return this.actionType;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return userClientIp
     */
    public String getUserClientIp() {
        return this.userClientIp;
    }

    public static final class Builder extends Request.Builder<CancelDomainVerificationRequest, Builder> {
        private String actionType; 
        private String instanceId; 
        private String lang; 
        private String userClientIp; 

        private Builder() {
            super();
        } 

        private Builder(CancelDomainVerificationRequest request) {
            super(request);
            this.actionType = request.actionType;
            this.instanceId = request.instanceId;
            this.lang = request.lang;
            this.userClientIp = request.userClientIp;
        } 

        /**
         * <p>The action type. Valid values:</p>
         * <ul>
         * <li><strong>DOMAINAUDIT</strong>: review a domain name review.</li>
         * <li><strong>AUDITCONTACT</strong>: review a contact.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>AUDITCONTACT</p>
         */
        public Builder actionType(String actionType) {
            this.putQueryParameter("ActionType", actionType);
            this.actionType = actionType;
            return this;
        }

        /**
         * <p>Thee instance ID of the domain name. You can call the <a href="https://help.aliyun.com/document_detail/67712.html">QueryDomainList</a> operation to query the instance ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>S2019270W570xxxx</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The language of the error message to return if the request fails. Valid values:</p>
         * <ul>
         * <li><strong>zh</strong>: Chinese.</li>
         * <li><strong>en</strong>: English.</li>
         * </ul>
         * <p>Default value: <strong>en</strong>.</p>
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
         * <p>The IP address of the client. Set the value to <strong>127.0.0.1</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>127.0.0.1</p>
         */
        public Builder userClientIp(String userClientIp) {
            this.putQueryParameter("UserClientIp", userClientIp);
            this.userClientIp = userClientIp;
            return this;
        }

        @Override
        public CancelDomainVerificationRequest build() {
            return new CancelDomainVerificationRequest(this);
        } 

    } 

}
