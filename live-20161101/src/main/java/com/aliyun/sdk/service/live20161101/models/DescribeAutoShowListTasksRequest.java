// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

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
 * {@link DescribeAutoShowListTasksRequest} extends {@link RequestModel}
 *
 * <p>DescribeAutoShowListTasksRequest</p>
 */
public class DescribeAutoShowListTasksRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CasterId")
    private String casterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    private DescribeAutoShowListTasksRequest(Builder builder) {
        super(builder);
        this.casterId = builder.casterId;
        this.ownerId = builder.ownerId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAutoShowListTasksRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return casterId
     */
    public String getCasterId() {
        return this.casterId;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<DescribeAutoShowListTasksRequest, Builder> {
        private String casterId; 
        private Long ownerId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeAutoShowListTasksRequest request) {
            super(request);
            this.casterId = request.casterId;
            this.ownerId = request.ownerId;
            this.regionId = request.regionId;
        } 

        /**
         * <p>The ID of the production studio for which you want to query scheduled tasks.</p>
         * <blockquote>
         * <p> If the scheduled tasks were created by calling the <a href="https://help.aliyun.com/document_detail/2848056.html">InitializeAutoShowListTask</a> operation, check the value of the response parameter CasterId to obtain the ID. If you do not specify this parameter, the system queries all the scheduled tasks that belong to the user specified by the OwnerId parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>53200b81-b761-4c10-842a-a0726d97****</p>
         */
        public Builder casterId(String casterId) {
            this.putQueryParameter("CasterId", casterId);
            this.casterId = casterId;
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
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public DescribeAutoShowListTasksRequest build() {
            return new DescribeAutoShowListTasksRequest(this);
        } 

    } 

}
