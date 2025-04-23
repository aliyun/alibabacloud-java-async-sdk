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
 * {@link DescribeSubDomainRecordsRequest} extends {@link RequestModel}
 *
 * <p>DescribeSubDomainRecordsRequest</p>
 */
public class DescribeSubDomainRecordsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DomainName")
    private String domainName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Line")
    private String line;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Long pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(maximum = 500, minimum = 1)
    private Long pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SubDomain")
    @com.aliyun.core.annotation.Validation(required = true)
    private String subDomain;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Type")
    private String type;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserClientIp")
    private String userClientIp;

    private DescribeSubDomainRecordsRequest(Builder builder) {
        super(builder);
        this.domainName = builder.domainName;
        this.lang = builder.lang;
        this.line = builder.line;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.subDomain = builder.subDomain;
        this.type = builder.type;
        this.userClientIp = builder.userClientIp;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSubDomainRecordsRequest create() {
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
     * @return line
     */
    public String getLine() {
        return this.line;
    }

    /**
     * @return pageNumber
     */
    public Long getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Long getPageSize() {
        return this.pageSize;
    }

    /**
     * @return subDomain
     */
    public String getSubDomain() {
        return this.subDomain;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    /**
     * @return userClientIp
     */
    public String getUserClientIp() {
        return this.userClientIp;
    }

    public static final class Builder extends Request.Builder<DescribeSubDomainRecordsRequest, Builder> {
        private String domainName; 
        private String lang; 
        private String line; 
        private Long pageNumber; 
        private Long pageSize; 
        private String subDomain; 
        private String type; 
        private String userClientIp; 

        private Builder() {
            super();
        } 

        private Builder(DescribeSubDomainRecordsRequest request) {
            super(request);
            this.domainName = request.domainName;
            this.lang = request.lang;
            this.line = request.line;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.subDomain = request.subDomain;
            this.type = request.type;
            this.userClientIp = request.userClientIp;
        } 

        /**
         * <p>The domain name.</p>
         * 
         * <strong>example:</strong>
         * <p>example.com</p>
         */
        public Builder domainName(String domainName) {
            this.putQueryParameter("DomainName", domainName);
            this.domainName = domainName;
            return this;
        }

        /**
         * <p>The language of the content within the request and response. Default value: <strong>zh</strong>. Valid values:</p>
         * <ul>
         * <li><strong>zh</strong>: Chinese</li>
         * <li><strong>en</strong>: English</li>
         * </ul>
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
         * <p>The DNS resolution line.</p>
         * 
         * <strong>example:</strong>
         * <p>default</p>
         */
        public Builder line(String line) {
            this.putQueryParameter("Line", line);
            this.line = line;
            return this;
        }

        /**
         * <p>The page number. Pages start from page <strong>1</strong>. Default value: <strong>1</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Long pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page. Valid values: <strong>1 to 100</strong>. Default value: <strong>20</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder pageSize(Long pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>If you set SubDomain to <code>a.www.example.com</code> and leave</p>
         * <p>DomainName empty, the system returns the DNS records that contain the hostname <code>a.www</code> for the domain name example.com. If you set SubDomain to a.<a href="http://www.example.com">www.example.com</a> and set DomainName to <a href="http://www.example.com">www.example.com</a>, the system returns the DNS records that contain the hostname <code>a</code> for the domain name <a href="http://www.example.com">www.example.com</a>. If you set SubDomain to a.<a href="http://www.example.com">www.example.com</a> and set DomainName to a.<a href="http://www.example.com">www.example.com</a>, the system returns the DNS records that contain the hostname <code>@</code> for the domain name a.<a href="http://www.example.com">www.example.com</a>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>a.<a href="http://www.example.com">www.example.com</a></p>
         */
        public Builder subDomain(String subDomain) {
            this.putQueryParameter("SubDomain", subDomain);
            this.subDomain = subDomain;
            return this;
        }

        /**
         * <p>The type of DNS records. If you do not specify this parameter, all types of DNS records for the subdomain name are returned.</p>
         * <p>Valid values: <strong>A, MX, CNAME, TXT, REDIRECT_URL, FORWORD_URL, NS, AAAA, and SRV</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>MX</p>
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        /**
         * <p>The IP address of the client.</p>
         * 
         * <strong>example:</strong>
         * <p>192.0.2.0</p>
         */
        public Builder userClientIp(String userClientIp) {
            this.putQueryParameter("UserClientIp", userClientIp);
            this.userClientIp = userClientIp;
            return this;
        }

        @Override
        public DescribeSubDomainRecordsRequest build() {
            return new DescribeSubDomainRecordsRequest(this);
        } 

    } 

}
