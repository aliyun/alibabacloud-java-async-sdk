// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20240518.models;

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
 * {@link RemoveTaskInstanceDependenciesRequest} extends {@link RequestModel}
 *
 * <p>RemoveTaskInstanceDependenciesRequest</p>
 */
public class RemoveTaskInstanceDependenciesRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Comment")
    private String comment;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Id")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long id;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("UpstreamTaskInstanceIds")
    private java.util.List<Long> upstreamTaskInstanceIds;

    private RemoveTaskInstanceDependenciesRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.comment = builder.comment;
        this.id = builder.id;
        this.upstreamTaskInstanceIds = builder.upstreamTaskInstanceIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RemoveTaskInstanceDependenciesRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return comment
     */
    public String getComment() {
        return this.comment;
    }

    /**
     * @return id
     */
    public Long getId() {
        return this.id;
    }

    /**
     * @return upstreamTaskInstanceIds
     */
    public java.util.List<Long> getUpstreamTaskInstanceIds() {
        return this.upstreamTaskInstanceIds;
    }

    public static final class Builder extends Request.Builder<RemoveTaskInstanceDependenciesRequest, Builder> {
        private String regionId; 
        private String comment; 
        private Long id; 
        private java.util.List<Long> upstreamTaskInstanceIds; 

        private Builder() {
            super();
        } 

        private Builder(RemoveTaskInstanceDependenciesRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.comment = request.comment;
            this.id = request.id;
            this.upstreamTaskInstanceIds = request.upstreamTaskInstanceIds;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The remarks.</p>
         * 
         * <strong>example:</strong>
         * <p>this is a comment</p>
         */
        public Builder comment(String comment) {
            this.putBodyParameter("Comment", comment);
            this.comment = comment;
            return this;
        }

        /**
         * <p>The instance ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1234</p>
         */
        public Builder id(Long id) {
            this.putQueryParameter("Id", id);
            this.id = id;
            return this;
        }

        /**
         * <p>The IDs of ancestor instances of the instance</p>
         */
        public Builder upstreamTaskInstanceIds(java.util.List<Long> upstreamTaskInstanceIds) {
            String upstreamTaskInstanceIdsShrink = shrink(upstreamTaskInstanceIds, "UpstreamTaskInstanceIds", "json");
            this.putBodyParameter("UpstreamTaskInstanceIds", upstreamTaskInstanceIdsShrink);
            this.upstreamTaskInstanceIds = upstreamTaskInstanceIds;
            return this;
        }

        @Override
        public RemoveTaskInstanceDependenciesRequest build() {
            return new RemoveTaskInstanceDependenciesRequest(this);
        } 

    } 

}
