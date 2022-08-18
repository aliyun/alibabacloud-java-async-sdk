// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeSubDomainRecordsRequest} extends {@link RequestModel}
 *
 * <p>DescribeSubDomainRecordsRequest</p>
 */
public class DescribeSubDomainRecordsRequest extends Request {
    @Query
    @NameInMap("DomainName")
    private String domainName;

    @Query
    @NameInMap("Lang")
    private String lang;

    @Query
    @NameInMap("Line")
    private String line;

    @Query
    @NameInMap("PageNumber")
    private Long pageNumber;

    @Query
    @NameInMap("PageSize")
    @Validation(maximum = 500, minimum = 1)
    private Long pageSize;

    @Query
    @NameInMap("SubDomain")
    @Validation(required = true)
    private String subDomain;

    @Query
    @NameInMap("Type")
    private String type;

    @Query
    @NameInMap("UserClientIp")
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
         * Line.
         */
        public Builder line(String line) {
            this.putQueryParameter("Line", line);
            this.line = line;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Long pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Long pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * SubDomain.
         */
        public Builder subDomain(String subDomain) {
            this.putQueryParameter("SubDomain", subDomain);
            this.subDomain = subDomain;
            return this;
        }

        /**
         * Type.
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        /**
         * UserClientIp.
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
