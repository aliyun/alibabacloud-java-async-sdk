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
 * {@link DescribeDeviceRequest} extends {@link RequestModel}
 *
 * <p>DescribeDeviceRequest</p>
 */
public class DescribeDeviceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Id")
    @com.aliyun.core.annotation.Validation(required = true)
    private String id;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IncludeDirectory")
    private Boolean includeDirectory;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IncludeStats")
    private Boolean includeStats;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    private DescribeDeviceRequest(Builder builder) {
        super(builder);
        this.id = builder.id;
        this.includeDirectory = builder.includeDirectory;
        this.includeStats = builder.includeStats;
        this.ownerId = builder.ownerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDeviceRequest create() {
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
     * @return includeDirectory
     */
    public Boolean getIncludeDirectory() {
        return this.includeDirectory;
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

    public static final class Builder extends Request.Builder<DescribeDeviceRequest, Builder> {
        private String id; 
        private Boolean includeDirectory; 
        private Boolean includeStats; 
        private Long ownerId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeDeviceRequest request) {
            super(request);
            this.id = request.id;
            this.includeDirectory = request.includeDirectory;
            this.includeStats = request.includeStats;
            this.ownerId = request.ownerId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>3238848****092996-cn-qingdao</p>
         */
        public Builder id(String id) {
            this.putQueryParameter("Id", id);
            this.id = id;
            return this;
        }

        /**
         * IncludeDirectory.
         */
        public Builder includeDirectory(Boolean includeDirectory) {
            this.putQueryParameter("IncludeDirectory", includeDirectory);
            this.includeDirectory = includeDirectory;
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
        public DescribeDeviceRequest build() {
            return new DescribeDeviceRequest(this);
        } 

    } 

}
