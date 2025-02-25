// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

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
 * {@link ChangeDomainOfDnsProductRequest} extends {@link RequestModel}
 *
 * <p>ChangeDomainOfDnsProductRequest</p>
 */
public class ChangeDomainOfDnsProductRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Force")
    private Boolean force;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NewDomain")
    private String newDomain;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserClientIp")
    private String userClientIp;

    private ChangeDomainOfDnsProductRequest(Builder builder) {
        super(builder);
        this.force = builder.force;
        this.instanceId = builder.instanceId;
        this.lang = builder.lang;
        this.newDomain = builder.newDomain;
        this.userClientIp = builder.userClientIp;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ChangeDomainOfDnsProductRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return force
     */
    public Boolean getForce() {
        return this.force;
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
     * @return newDomain
     */
    public String getNewDomain() {
        return this.newDomain;
    }

    /**
     * @return userClientIp
     */
    public String getUserClientIp() {
        return this.userClientIp;
    }

    public static final class Builder extends Request.Builder<ChangeDomainOfDnsProductRequest, Builder> {
        private Boolean force; 
        private String instanceId; 
        private String lang; 
        private String newDomain; 
        private String userClientIp; 

        private Builder() {
            super();
        } 

        private Builder(ChangeDomainOfDnsProductRequest request) {
            super(request);
            this.force = request.force;
            this.instanceId = request.instanceId;
            this.lang = request.lang;
            this.newDomain = request.newDomain;
            this.userClientIp = request.userClientIp;
        } 

        /**
         * <p>Specifies whether to force bind a domain name to the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder force(Boolean force) {
            this.putQueryParameter("Force", force);
            this.force = force;
            return this;
        }

        /**
         * <p>The ID of the Alibaba Cloud DNS instance.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>i-7sb</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The language in which you want the values of some response parameters to be returned. These response parameters support multiple languages.</p>
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
         * <p>The domain name that you want to bind to the instance. If you leave this parameter empty, the domain name that is bound to the instance is unbound from the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>newdomain.com</p>
         */
        public Builder newDomain(String newDomain) {
            this.putQueryParameter("NewDomain", newDomain);
            this.newDomain = newDomain;
            return this;
        }

        /**
         * <p>The IP address of the client.</p>
         * 
         * <strong>example:</strong>
         * <p>1.1.1.1</p>
         */
        public Builder userClientIp(String userClientIp) {
            this.putQueryParameter("UserClientIp", userClientIp);
            this.userClientIp = userClientIp;
            return this;
        }

        @Override
        public ChangeDomainOfDnsProductRequest build() {
            return new ChangeDomainOfDnsProductRequest(this);
        } 

    } 

}
