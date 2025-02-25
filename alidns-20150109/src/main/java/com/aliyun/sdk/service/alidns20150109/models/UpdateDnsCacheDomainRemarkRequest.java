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
 * {@link UpdateDnsCacheDomainRemarkRequest} extends {@link RequestModel}
 *
 * <p>UpdateDnsCacheDomainRemarkRequest</p>
 */
public class UpdateDnsCacheDomainRemarkRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DomainName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String domainName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Remark")
    private String remark;

    private UpdateDnsCacheDomainRemarkRequest(Builder builder) {
        super(builder);
        this.domainName = builder.domainName;
        this.lang = builder.lang;
        this.remark = builder.remark;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateDnsCacheDomainRemarkRequest create() {
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
     * @return remark
     */
    public String getRemark() {
        return this.remark;
    }

    public static final class Builder extends Request.Builder<UpdateDnsCacheDomainRemarkRequest, Builder> {
        private String domainName; 
        private String lang; 
        private String remark; 

        private Builder() {
            super();
        } 

        private Builder(UpdateDnsCacheDomainRemarkRequest request) {
            super(request);
            this.domainName = request.domainName;
            this.lang = request.lang;
            this.remark = request.remark;
        } 

        /**
         * <p>The domain name.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>dns-example.com</p>
         */
        public Builder domainName(String domainName) {
            this.putQueryParameter("DomainName", domainName);
            this.domainName = domainName;
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

        /**
         * <p>The remarks. The remarks can be up to 50 characters in length and can contain only letters, digits, periods (.), underscores (_), and hyphens (-).</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder remark(String remark) {
            this.putQueryParameter("Remark", remark);
            this.remark = remark;
            return this;
        }

        @Override
        public UpdateDnsCacheDomainRemarkRequest build() {
            return new UpdateDnsCacheDomainRemarkRequest(this);
        } 

    } 

}
