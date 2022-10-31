// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeLiveUserDomainsRequest} extends {@link RequestModel}
 *
 * <p>DescribeLiveUserDomainsRequest</p>
 */
public class DescribeLiveUserDomainsRequest extends Request {
    @Query
    @NameInMap("DomainName")
    private String domainName;

    @Query
    @NameInMap("DomainSearchType")
    private String domainSearchType;

    @Query
    @NameInMap("DomainStatus")
    private String domainStatus;

    @Query
    @NameInMap("LiveDomainType")
    private String liveDomainType;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("PageNumber")
    private Integer pageNumber;

    @Query
    @NameInMap("PageSize")
    @Validation(maximum = 500)
    private Integer pageSize;

    @Query
    @NameInMap("RegionName")
    private String regionName;

    @Query
    @NameInMap("SecurityToken")
    private String securityToken;

    @Query
    @NameInMap("Tag")
    private java.util.List < Tag> tag;

    private DescribeLiveUserDomainsRequest(Builder builder) {
        super(builder);
        this.domainName = builder.domainName;
        this.domainSearchType = builder.domainSearchType;
        this.domainStatus = builder.domainStatus;
        this.liveDomainType = builder.liveDomainType;
        this.ownerId = builder.ownerId;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.regionName = builder.regionName;
        this.securityToken = builder.securityToken;
        this.tag = builder.tag;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeLiveUserDomainsRequest create() {
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
     * @return domainSearchType
     */
    public String getDomainSearchType() {
        return this.domainSearchType;
    }

    /**
     * @return domainStatus
     */
    public String getDomainStatus() {
        return this.domainStatus;
    }

    /**
     * @return liveDomainType
     */
    public String getLiveDomainType() {
        return this.liveDomainType;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return regionName
     */
    public String getRegionName() {
        return this.regionName;
    }

    /**
     * @return securityToken
     */
    public String getSecurityToken() {
        return this.securityToken;
    }

    /**
     * @return tag
     */
    public java.util.List < Tag> getTag() {
        return this.tag;
    }

    public static final class Builder extends Request.Builder<DescribeLiveUserDomainsRequest, Builder> {
        private String domainName; 
        private String domainSearchType; 
        private String domainStatus; 
        private String liveDomainType; 
        private Long ownerId; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String regionName; 
        private String securityToken; 
        private java.util.List < Tag> tag; 

        private Builder() {
            super();
        } 

        private Builder(DescribeLiveUserDomainsRequest request) {
            super(request);
            this.domainName = request.domainName;
            this.domainSearchType = request.domainSearchType;
            this.domainStatus = request.domainStatus;
            this.liveDomainType = request.liveDomainType;
            this.ownerId = request.ownerId;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.regionName = request.regionName;
            this.securityToken = request.securityToken;
            this.tag = request.tag;
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
         * DomainSearchType.
         */
        public Builder domainSearchType(String domainSearchType) {
            this.putQueryParameter("DomainSearchType", domainSearchType);
            this.domainSearchType = domainSearchType;
            return this;
        }

        /**
         * DomainStatus.
         */
        public Builder domainStatus(String domainStatus) {
            this.putQueryParameter("DomainStatus", domainStatus);
            this.domainStatus = domainStatus;
            return this;
        }

        /**
         * LiveDomainType.
         */
        public Builder liveDomainType(String liveDomainType) {
            this.putQueryParameter("LiveDomainType", liveDomainType);
            this.liveDomainType = liveDomainType;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * RegionName.
         */
        public Builder regionName(String regionName) {
            this.putQueryParameter("RegionName", regionName);
            this.regionName = regionName;
            return this;
        }

        /**
         * SecurityToken.
         */
        public Builder securityToken(String securityToken) {
            this.putQueryParameter("SecurityToken", securityToken);
            this.securityToken = securityToken;
            return this;
        }

        /**
         * Tag.
         */
        public Builder tag(java.util.List < Tag> tag) {
            this.putQueryParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        @Override
        public DescribeLiveUserDomainsRequest build() {
            return new DescribeLiveUserDomainsRequest(this);
        } 

    } 

    public static class Tag extends TeaModel {
        @NameInMap("Key")
        private String key;

        @NameInMap("Value")
        private String value;

        private Tag(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tag create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            /**
             * Key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Tag build() {
                return new Tag(this);
            } 

        } 

    }
}
