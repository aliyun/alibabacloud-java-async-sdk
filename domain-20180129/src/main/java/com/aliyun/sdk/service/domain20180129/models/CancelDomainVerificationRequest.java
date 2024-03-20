// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.domain20180129.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CancelDomainVerificationRequest} extends {@link RequestModel}
 *
 * <p>CancelDomainVerificationRequest</p>
 */
public class CancelDomainVerificationRequest extends Request {
    @Query
    @NameInMap("ActionType")
    @Validation(required = true)
    private String actionType;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("Lang")
    private String lang;

    @Query
    @NameInMap("UserClientIp")
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
         * The action type. Valid values:
         * <p>
         * 
         * *   **DOMAINAUDIT**: review a domain name review.
         * *   **AUDITCONTACT**: review a contact.
         */
        public Builder actionType(String actionType) {
            this.putQueryParameter("ActionType", actionType);
            this.actionType = actionType;
            return this;
        }

        /**
         * Thee instance ID of the domain name. You can call the [QueryDomainList](~~67712~~) operation to query the instance ID.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * The language of the error message to return if the request fails. Valid values:
         * <p>
         * 
         * *   **zh**: Chinese.
         * *   **en**: English.
         * 
         * Default value: **en**.
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * The IP address of the client. Set the value to **127.0.0.1**.
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
