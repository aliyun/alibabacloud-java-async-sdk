// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
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
         * Specifies whether to force bind a domain name to the instance.
         */
        public Builder force(Boolean force) {
            this.putQueryParameter("Force", force);
            this.force = force;
            return this;
        }

        /**
         * The ID of the Alibaba Cloud DNS instance.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * The language in which you want the values of some response parameters to be returned. These response parameters support multiple languages.
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * The domain name that you want to bind to the instance. If you do not specify this parameter, this operation unbinds the original domain name from the instance.
         */
        public Builder newDomain(String newDomain) {
            this.putQueryParameter("NewDomain", newDomain);
            this.newDomain = newDomain;
            return this;
        }

        /**
         * The IP address of the client.
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
