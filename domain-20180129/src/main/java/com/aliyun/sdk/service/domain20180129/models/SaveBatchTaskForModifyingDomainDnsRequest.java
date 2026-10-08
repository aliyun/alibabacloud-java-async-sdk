// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.domain20180129.models;

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
 * {@link SaveBatchTaskForModifyingDomainDnsRequest} extends {@link RequestModel}
 *
 * <p>SaveBatchTaskForModifyingDomainDnsRequest</p>
 */
public class SaveBatchTaskForModifyingDomainDnsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AliyunDns")
    @com.aliyun.core.annotation.Validation(required = true)
    private Boolean aliyunDns;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DomainName")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> domainName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DomainNameServer")
    private java.util.List<String> domainNameServer;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserClientIp")
    private String userClientIp;

    private SaveBatchTaskForModifyingDomainDnsRequest(Builder builder) {
        super(builder);
        this.aliyunDns = builder.aliyunDns;
        this.domainName = builder.domainName;
        this.domainNameServer = builder.domainNameServer;
        this.lang = builder.lang;
        this.userClientIp = builder.userClientIp;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SaveBatchTaskForModifyingDomainDnsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return aliyunDns
     */
    public Boolean getAliyunDns() {
        return this.aliyunDns;
    }

    /**
     * @return domainName
     */
    public java.util.List<String> getDomainName() {
        return this.domainName;
    }

    /**
     * @return domainNameServer
     */
    public java.util.List<String> getDomainNameServer() {
        return this.domainNameServer;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return userClientIp
     */
    public String getUserClientIp() {
        return this.userClientIp;
    }

    public static final class Builder extends Request.Builder<SaveBatchTaskForModifyingDomainDnsRequest, Builder> {
        private Boolean aliyunDns; 
        private java.util.List<String> domainName; 
        private java.util.List<String> domainNameServer; 
        private String lang; 
        private String userClientIp; 

        private Builder() {
            super();
        } 

        private Builder(SaveBatchTaskForModifyingDomainDnsRequest request) {
            super(request);
            this.aliyunDns = request.aliyunDns;
            this.domainName = request.domainName;
            this.domainNameServer = request.domainNameServer;
            this.lang = request.lang;
            this.userClientIp = request.userClientIp;
        } 

        /**
         * <p>Specifies whether to use Alibaba Cloud DNS servers. Valid values:</p>
         * <ul>
         * <li><p><strong>true</strong>: Yes.</p>
         * </li>
         * <li><p><strong>false</strong>: No.</p>
         * </li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder aliyunDns(Boolean aliyunDns) {
            this.putQueryParameter("AliyunDns", aliyunDns);
            this.aliyunDns = aliyunDns;
            return this;
        }

        /**
         * <p>The domain names.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>example.com</p>
         */
        public Builder domainName(java.util.List<String> domainName) {
            this.putQueryParameter("DomainName", domainName);
            this.domainName = domainName;
            return this;
        }

        /**
         * <p>The new DNS servers. This parameter is required if <strong>AliyunDns</strong> is set to <strong>false</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>ns1.test.com</p>
         */
        public Builder domainNameServer(java.util.List<String> domainNameServer) {
            this.putQueryParameter("DomainNameServer", domainNameServer);
            this.domainNameServer = domainNameServer;
            return this;
        }

        /**
         * <p>The language of API error messages. Valid values:</p>
         * <ul>
         * <li><p><strong>zh</strong>: Chinese.</p>
         * </li>
         * <li><p><strong>en</strong>: English.</p>
         * </li>
         * </ul>
         * <p>Default value: <strong>en</strong>.</p>
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
         * <p>The user IP address. You can set this parameter to <strong>127.0.0.1</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>127.0.0.1</p>
         */
        public Builder userClientIp(String userClientIp) {
            this.putQueryParameter("UserClientIp", userClientIp);
            this.userClientIp = userClientIp;
            return this;
        }

        @Override
        public SaveBatchTaskForModifyingDomainDnsRequest build() {
            return new SaveBatchTaskForModifyingDomainDnsRequest(this);
        } 

    } 

}
