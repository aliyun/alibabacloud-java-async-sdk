// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeTransferDomainsRequest} extends {@link RequestModel}
 *
 * <p>DescribeTransferDomainsRequest</p>
 */
public class DescribeTransferDomainsRequest extends Request {
    @Query
    @NameInMap("DomainName")
    private String domainName;

    @Query
    @NameInMap("FromUserId")
    private Long fromUserId;

    @Query
    @NameInMap("Lang")
    private String lang;

    @Query
    @NameInMap("PageNumber")
    private Long pageNumber;

    @Query
    @NameInMap("PageSize")
    @Validation(maximum = 100, minimum = 1)
    private Long pageSize;

    @Query
    @NameInMap("TargetUserId")
    private Long targetUserId;

    @Query
    @NameInMap("TransferType")
    @Validation(required = true)
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
         * Specifies the domain name for which you want to view the transfer record.
         */
        public Builder domainName(String domainName) {
            this.putQueryParameter("DomainName", domainName);
            this.domainName = domainName;
            return this;
        }

        /**
         * The user ID from which the domain name was transferred to the current account.
         */
        public Builder fromUserId(Long fromUserId) {
            this.putQueryParameter("FromUserId", fromUserId);
            this.fromUserId = fromUserId;
            return this;
        }

        /**
         * The language.
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * The page number. Pages start from page 1. Default value: 1.
         */
        public Builder pageNumber(Long pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries per page. Valid values: 1 to 100. Default value: 20.
         */
        public Builder pageSize(Long pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The user ID to which the domain name was transferred from the current account.
         */
        public Builder targetUserId(Long targetUserId) {
            this.putQueryParameter("TargetUserId", targetUserId);
            this.targetUserId = targetUserId;
            return this;
        }

        /**
         * The transfer type. Valid values:
         * <p>
         * 
         * *   IN: The domain name was transferred to the current account.
         * *   OUT: The domain name was transferred from the current account.
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
