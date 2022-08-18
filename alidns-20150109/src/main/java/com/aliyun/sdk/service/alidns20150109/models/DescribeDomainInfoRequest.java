// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDomainInfoRequest} extends {@link RequestModel}
 *
 * <p>DescribeDomainInfoRequest</p>
 */
public class DescribeDomainInfoRequest extends Request {
    @Query
    @NameInMap("DomainName")
    @Validation(required = true)
    private String domainName;

    @Query
    @NameInMap("Lang")
    private String lang;

    @Query
    @NameInMap("NeedDetailAttributes")
    private Boolean needDetailAttributes;

    private DescribeDomainInfoRequest(Builder builder) {
        super(builder);
        this.domainName = builder.domainName;
        this.lang = builder.lang;
        this.needDetailAttributes = builder.needDetailAttributes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDomainInfoRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return domainName
     */
    public String getDomainName() {
        return this.domainName;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return needDetailAttributes
     */
    public Boolean getNeedDetailAttributes() {
        return this.needDetailAttributes;
    }

    public static final class Builder extends Request.Builder<DescribeDomainInfoRequest, Builder> {
        private String domainName; 
        private String lang; 
        private Boolean needDetailAttributes; 

        private Builder() {
            super();
        } 

        private Builder(DescribeDomainInfoRequest request) {
            super(request);
            this.domainName = request.domainName;
            this.lang = request.lang;
            this.needDetailAttributes = request.needDetailAttributes;
        } 

        /**
         * DomainName.
         */
        public Builder domainName(String domainName) {
            this.putQueryParameter("DomainName", domainName);
            this.domainName = domainName;
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
         * NeedDetailAttributes.
         */
        public Builder needDetailAttributes(Boolean needDetailAttributes) {
            this.putQueryParameter("NeedDetailAttributes", needDetailAttributes);
            this.needDetailAttributes = needDetailAttributes;
            return this;
        }

        @Override
        public DescribeDomainInfoRequest build() {
            return new DescribeDomainInfoRequest(this);
        } 

    } 

}
