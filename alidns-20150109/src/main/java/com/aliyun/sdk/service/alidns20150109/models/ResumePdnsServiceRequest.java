// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ResumePdnsServiceRequest} extends {@link RequestModel}
 *
 * <p>ResumePdnsServiceRequest</p>
 */
public class ResumePdnsServiceRequest extends Request {
    @Query
    @NameInMap("Lang")
    private String lang;

    @Query
    @NameInMap("ServiceType")
    private String serviceType;

    private ResumePdnsServiceRequest(Builder builder) {
        super(builder);
        this.lang = builder.lang;
        this.serviceType = builder.serviceType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ResumePdnsServiceRequest create() {
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

    public static final class Builder extends Request.Builder<ResumePdnsServiceRequest, Builder> {
        private String lang; 
        private String serviceType; 

        private Builder() {
            super();
        } 

        private Builder(ResumePdnsServiceRequest response) {
            super(response);
            this.lang = response.lang;
            this.serviceType = response.serviceType;
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
        public ResumePdnsServiceRequest build() {
            return new ResumePdnsServiceRequest(this);
        } 

    } 

}
