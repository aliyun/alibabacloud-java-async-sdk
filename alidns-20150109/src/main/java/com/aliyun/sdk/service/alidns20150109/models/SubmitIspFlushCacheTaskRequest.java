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
 * {@link SubmitIspFlushCacheTaskRequest} extends {@link RequestModel}
 *
 * <p>SubmitIspFlushCacheTaskRequest</p>
 */
public class SubmitIspFlushCacheTaskRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DomainName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String domainName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Isp")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> isp;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    private SubmitIspFlushCacheTaskRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.domainName = builder.domainName;
        this.isp = builder.isp;
        this.lang = builder.lang;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SubmitIspFlushCacheTaskRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return domainName
     */
    public String getDomainName() {
        return this.domainName;
    }

    /**
     * @return isp
     */
    public java.util.List<String> getIsp() {
        return this.isp;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    public static final class Builder extends Request.Builder<SubmitIspFlushCacheTaskRequest, Builder> {
        private String clientToken; 
        private String domainName; 
        private java.util.List<String> isp; 
        private String lang; 

        private Builder() {
            super();
        } 

        private Builder(SubmitIspFlushCacheTaskRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.domainName = request.domainName;
            this.isp = request.isp;
            this.lang = request.lang;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder domainName(String domainName) {
            this.putQueryParameter("DomainName", domainName);
            this.domainName = domainName;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder isp(java.util.List<String> isp) {
            this.putQueryParameter("Isp", isp);
            this.isp = isp;
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
        public SubmitIspFlushCacheTaskRequest build() {
            return new SubmitIspFlushCacheTaskRequest(this);
        } 

    } 

}
