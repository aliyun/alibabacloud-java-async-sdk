// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BindInstanceDomainsRequest} extends {@link RequestModel}
 *
 * <p>BindInstanceDomainsRequest</p>
 */
public class BindInstanceDomainsRequest extends Request {
    @Query
    @NameInMap("DomainNames")
    @Validation(required = true)
    private String domainNames;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("Lang")
    private String lang;

    private BindInstanceDomainsRequest(Builder builder) {
        super(builder);
        this.domainNames = builder.domainNames;
        this.instanceId = builder.instanceId;
        this.lang = builder.lang;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BindInstanceDomainsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return domainNames
     */
    public String getDomainNames() {
        return this.domainNames;
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

    public static final class Builder extends Request.Builder<BindInstanceDomainsRequest, Builder> {
        private String domainNames; 
        private String instanceId; 
        private String lang; 

        private Builder() {
            super();
        } 

        private Builder(BindInstanceDomainsRequest request) {
            super(request);
            this.domainNames = request.domainNames;
            this.instanceId = request.instanceId;
            this.lang = request.lang;
        } 

        /**
         * DomainNames.
         */
        public Builder domainNames(String domainNames) {
            this.putQueryParameter("DomainNames", domainNames);
            this.domainNames = domainNames;
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

        @Override
        public BindInstanceDomainsRequest build() {
            return new BindInstanceDomainsRequest(this);
        } 

    } 

}
