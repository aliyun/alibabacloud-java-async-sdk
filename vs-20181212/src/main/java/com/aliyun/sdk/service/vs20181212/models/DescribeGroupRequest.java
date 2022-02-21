// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vs20181212.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeGroupRequest} extends {@link RequestModel}
 *
 * <p>DescribeGroupRequest</p>
 */
public class DescribeGroupRequest extends Request {
    @Query
    @NameInMap("Id")
    @Validation(required = true)
    private String id;

    @Query
    @NameInMap("IncludeStats")
    private Boolean includeStats;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    private DescribeGroupRequest(Builder builder) {
        super(builder);
        this.id = builder.id;
        this.includeStats = builder.includeStats;
        this.ownerId = builder.ownerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeGroupRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return id
     */
    public String getId() {
        return this.id;
    }

    /**
     * @return includeStats
     */
    public Boolean getIncludeStats() {
        return this.includeStats;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    public static final class Builder extends Request.Builder<DescribeGroupRequest, Builder> {
        private String id; 
        private Boolean includeStats; 
        private Long ownerId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeGroupRequest response) {
            super(response);
            this.id = response.id;
            this.includeStats = response.includeStats;
            this.ownerId = response.ownerId;
        } 

        /**
         * Id.
         */
        public Builder id(String id) {
            this.putQueryParameter("Id", id);
            this.id = id;
            return this;
        }

        /**
         * IncludeStats.
         */
        public Builder includeStats(Boolean includeStats) {
            this.putQueryParameter("IncludeStats", includeStats);
            this.includeStats = includeStats;
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
        public DescribeGroupRequest build() {
            return new DescribeGroupRequest(this);
        } 

    } 

}
