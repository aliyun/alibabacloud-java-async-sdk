// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vs20181212.models;

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
 * {@link DescribeGroupRequest} extends {@link RequestModel}
 *
 * <p>DescribeGroupRequest</p>
 */
public class DescribeGroupRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Id")
    @com.aliyun.core.annotation.Validation(required = true)
    private String id;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IncludeStats")
    private Boolean includeStats;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
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

        private Builder(DescribeGroupRequest request) {
            super(request);
            this.id = request.id;
            this.includeStats = request.includeStats;
            this.ownerId = request.ownerId;
        } 

        /**
         * <p>This parameter is required.</p>
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
