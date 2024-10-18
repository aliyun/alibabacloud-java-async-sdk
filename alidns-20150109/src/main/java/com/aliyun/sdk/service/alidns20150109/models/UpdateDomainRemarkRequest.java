// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link UpdateDomainRemarkRequest} extends {@link RequestModel}
 *
 * <p>UpdateDomainRemarkRequest</p>
 */
public class UpdateDomainRemarkRequest extends Request {
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

    private UpdateDomainRemarkRequest(Builder builder) {
        super(builder);
        this.domainName = builder.domainName;
        this.lang = builder.lang;
        this.remark = builder.remark;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateDomainRemarkRequest create() {
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

    public static final class Builder extends Request.Builder<UpdateDomainRemarkRequest, Builder> {
        private String domainName; 
        private String lang; 
        private String remark; 

        private Builder() {
            super();
        } 

        private Builder(UpdateDomainRemarkRequest request) {
            super(request);
            this.domainName = request.domainName;
            this.lang = request.lang;
            this.remark = request.remark;
        } 

        /**
         * <p>The domain name that already exists in Alibaba Cloud DNS.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>mydomain.com</p>
         */
        public Builder domainName(String domainName) {
            this.putQueryParameter("DomainName", domainName);
            this.domainName = domainName;
            return this;
        }

        /**
         * <p>The language of the response. Valid values:</p>
         * <ul>
         * <li>zh: Chinese</li>
         * <li>en: English</li>
         * </ul>
         * <p>Default value: en</p>
         * 
         * <strong>example:</strong>
         * <p>cn</p>
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * <p>The description of your domain name.</p>
         * <p>It can be up to 50 characters in length and can contain digits, letters, and the following special characters: _ - , .</p>
         */
        public Builder remark(String remark) {
            this.putQueryParameter("Remark", remark);
            this.remark = remark;
            return this;
        }

        @Override
        public UpdateDomainRemarkRequest build() {
            return new UpdateDomainRemarkRequest(this);
        } 

    } 

}
