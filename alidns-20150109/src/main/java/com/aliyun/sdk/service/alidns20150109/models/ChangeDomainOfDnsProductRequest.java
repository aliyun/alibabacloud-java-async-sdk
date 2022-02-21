// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ChangeDomainOfDnsProductRequest} extends {@link RequestModel}
 *
 * <p>ChangeDomainOfDnsProductRequest</p>
 */
public class ChangeDomainOfDnsProductRequest extends Request {
    @Query
    @NameInMap("Force")
    private Boolean force;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("Lang")
    private String lang;

    @Query
    @NameInMap("NewDomain")
    private String newDomain;

    @Query
    @NameInMap("UserClientIp")
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

        private Builder(ChangeDomainOfDnsProductRequest response) {
            super(response);
            this.force = response.force;
            this.instanceId = response.instanceId;
            this.lang = response.lang;
            this.newDomain = response.newDomain;
            this.userClientIp = response.userClientIp;
        } 

        /**
         * Force.
         */
        public Builder force(Boolean force) {
            this.putQueryParameter("Force", force);
            this.force = force;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * Lang.
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * NewDomain.
         */
        public Builder newDomain(String newDomain) {
            this.putQueryParameter("NewDomain", newDomain);
            this.newDomain = newDomain;
            return this;
        }

        /**
         * UserClientIp.
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
