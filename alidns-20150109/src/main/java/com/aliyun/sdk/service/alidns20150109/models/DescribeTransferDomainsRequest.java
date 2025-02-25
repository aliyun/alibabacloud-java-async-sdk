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
 * {@link DescribeTransferDomainsRequest} extends {@link RequestModel}
 *
 * <p>DescribeTransferDomainsRequest</p>
 */
public class DescribeTransferDomainsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DomainName")
    private String domainName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FromUserId")
    private Long fromUserId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Long pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(maximum = 100, minimum = 1)
    private Long pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TargetUserId")
    private Long targetUserId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TransferType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String transferType;

    private DescribeTransferDomainsRequest(Builder builder) {
        super(builder);
        this.domainName = builder.domainName;
        this.fromUserId = builder.fromUserId;
        this.lang = builder.lang;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.targetUserId = builder.targetUserId;
        this.transferType = builder.transferType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeTransferDomainsRequest create() {
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
     * @return fromUserId
     */
    public Long getFromUserId() {
        return this.fromUserId;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
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
     * @return targetUserId
     */
    public Long getTargetUserId() {
        return this.targetUserId;
    }

    /**
     * @return transferType
     */
    public String getTransferType() {
        return this.transferType;
    }

    public static final class Builder extends Request.Builder<DescribeTransferDomainsRequest, Builder> {
        private String domainName; 
        private Long fromUserId; 
        private String lang; 
        private Long pageNumber; 
        private Long pageSize; 
        private Long targetUserId; 
        private String transferType; 

        private Builder() {
            super();
        } 

        private Builder(DescribeTransferDomainsRequest request) {
            super(request);
            this.domainName = request.domainName;
            this.fromUserId = request.fromUserId;
            this.lang = request.lang;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.targetUserId = request.targetUserId;
            this.transferType = request.transferType;
        } 

        /**
         * <p>Specifies the domain name for which you want to view the transfer record.</p>
         * 
         * <strong>example:</strong>
         * <p>alidns.com</p>
         */
        public Builder domainName(String domainName) {
            this.putQueryParameter("DomainName", domainName);
            this.domainName = domainName;
            return this;
        }

        /**
         * <p>The user ID from which the domain name was transferred to the current account.</p>
         * 
         * <strong>example:</strong>
         * <p>123456</p>
         */
        public Builder fromUserId(Long fromUserId) {
            this.putQueryParameter("FromUserId", fromUserId);
            this.fromUserId = fromUserId;
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
         * <p>The page number. Pages start from page 1. Default value: 1.</p>
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
         * <p>The number of entries per page. Valid values: 1 to 100. Default value: 20.</p>
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
         * <p>The user ID to which the domain name was transferred from the current account.</p>
         * 
         * <strong>example:</strong>
         * <p>123456</p>
         */
        public Builder targetUserId(Long targetUserId) {
            this.putQueryParameter("TargetUserId", targetUserId);
            this.targetUserId = targetUserId;
            return this;
        }

        /**
         * <p>The transfer type. Valid values:</p>
         * <ul>
         * <li>IN: The domain name was transferred to the current account.</li>
         * <li>OUT: The domain name was transferred from the current account.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>IN</p>
         */
        public Builder transferType(String transferType) {
            this.putQueryParameter("TransferType", transferType);
            this.transferType = transferType;
            return this;
        }

        @Override
        public DescribeTransferDomainsRequest build() {
            return new DescribeTransferDomainsRequest(this);
        } 

    } 

}
