// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeUserVipsByDomainRequest} extends {@link RequestModel}
 *
 * <p>DescribeUserVipsByDomainRequest</p>
 */
public class DescribeUserVipsByDomainRequest extends Request {
    @Query
    @NameInMap("Available")
    private String available;

    @Query
    @NameInMap("DomainName")
    @Validation(required = true)
    private String domainName;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    private DescribeUserVipsByDomainRequest(Builder builder) {
        super(builder);
        this.available = builder.available;
        this.domainName = builder.domainName;
        this.ownerId = builder.ownerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeUserVipsByDomainRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return available
     */
    public String getAvailable() {
        return this.available;
    }

    /**
     * @return domainName
     */
    public String getDomainName() {
        return this.domainName;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    public static final class Builder extends Request.Builder<DescribeUserVipsByDomainRequest, Builder> {
        private String available; 
        private String domainName; 
        private Long ownerId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeUserVipsByDomainRequest response) {
            super(response);
            this.available = response.available;
            this.domainName = response.domainName;
            this.ownerId = response.ownerId;
        } 

        /**
         * Available.
         */
        public Builder available(String available) {
            this.putQueryParameter("Available", available);
            this.available = available;
            return this;
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
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        @Override
        public DescribeUserVipsByDomainRequest build() {
            return new DescribeUserVipsByDomainRequest(this);
        } 

    } 

}
