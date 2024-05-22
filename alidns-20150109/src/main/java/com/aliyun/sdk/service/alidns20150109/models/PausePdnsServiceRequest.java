// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PausePdnsServiceRequest} extends {@link RequestModel}
 *
 * <p>PausePdnsServiceRequest</p>
 */
public class PausePdnsServiceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ServiceType")
    private String serviceType;

    private PausePdnsServiceRequest(Builder builder) {
        super(builder);
        this.lang = builder.lang;
        this.serviceType = builder.serviceType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PausePdnsServiceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return serviceType
     */
    public String getServiceType() {
        return this.serviceType;
    }

    public static final class Builder extends Request.Builder<PausePdnsServiceRequest, Builder> {
        private String lang; 
        private String serviceType; 

        private Builder() {
            super();
        } 

        private Builder(PausePdnsServiceRequest request) {
            super(request);
            this.lang = request.lang;
            this.serviceType = request.serviceType;
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
         * ServiceType.
         */
        public Builder serviceType(String serviceType) {
            this.putQueryParameter("ServiceType", serviceType);
            this.serviceType = serviceType;
            return this;
        }

        @Override
        public PausePdnsServiceRequest build() {
            return new PausePdnsServiceRequest(this);
        } 

    } 

}
