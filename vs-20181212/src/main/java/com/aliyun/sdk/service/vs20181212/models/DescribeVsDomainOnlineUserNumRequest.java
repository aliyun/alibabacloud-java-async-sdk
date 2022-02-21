// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vs20181212.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeVsDomainOnlineUserNumRequest} extends {@link RequestModel}
 *
 * <p>DescribeVsDomainOnlineUserNumRequest</p>
 */
public class DescribeVsDomainOnlineUserNumRequest extends Request {
    @Query
    @NameInMap("DomainName")
    @Validation(required = true)
    private String domainName;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("QueryTime")
    private String queryTime;

    private DescribeVsDomainOnlineUserNumRequest(Builder builder) {
        super(builder);
        this.domainName = builder.domainName;
        this.ownerId = builder.ownerId;
        this.queryTime = builder.queryTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeVsDomainOnlineUserNumRequest create() {
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
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return queryTime
     */
    public String getQueryTime() {
        return this.queryTime;
    }

    public static final class Builder extends Request.Builder<DescribeVsDomainOnlineUserNumRequest, Builder> {
        private String domainName; 
        private Long ownerId; 
        private String queryTime; 

        private Builder() {
            super();
        } 

        private Builder(DescribeVsDomainOnlineUserNumRequest response) {
            super(response);
            this.domainName = response.domainName;
            this.ownerId = response.ownerId;
            this.queryTime = response.queryTime;
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

        /**
         * QueryTime.
         */
        public Builder queryTime(String queryTime) {
            this.putQueryParameter("QueryTime", queryTime);
            this.queryTime = queryTime;
            return this;
        }

        @Override
        public DescribeVsDomainOnlineUserNumRequest build() {
            return new DescribeVsDomainOnlineUserNumRequest(this);
        } 

    } 

}
