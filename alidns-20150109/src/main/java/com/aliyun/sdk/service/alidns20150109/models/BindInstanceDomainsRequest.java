// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link BindInstanceDomainsRequest} extends {@link RequestModel}
 *
 * <p>BindInstanceDomainsRequest</p>
 */
public class BindInstanceDomainsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DomainNames")
    @com.aliyun.core.annotation.Validation(required = true)
    private String domainNames;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
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
         * <p>The domain names.</p>
         * <blockquote>
         * <p> Separate multiple domain names with commas (,). Up to 100 domain names can be entered.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>example.com,example.net</p>
         */
        public Builder domainNames(String domainNames) {
            this.putQueryParameter("DomainNames", domainNames);
            this.domainNames = domainNames;
            return this;
        }

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>sdfasdf</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The language.</p>
         * 
         * <strong>example:</strong>
         * <p>en</p>
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
