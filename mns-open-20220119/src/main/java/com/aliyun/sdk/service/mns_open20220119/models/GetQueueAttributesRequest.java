// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mns_open20220119.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetQueueAttributesRequest} extends {@link RequestModel}
 *
 * <p>GetQueueAttributesRequest</p>
 */
public class GetQueueAttributesRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("QueueName")
    @Validation(required = true)
    private String queueName;

    private GetQueueAttributesRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.queueName = builder.queueName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetQueueAttributesRequest create() {
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
     * @return queueName
     */
    public String getQueueName() {
        return this.queueName;
    }

    public static final class Builder extends Request.Builder<GetQueueAttributesRequest, Builder> {
        private String regionId; 
        private String queueName; 

        private Builder() {
            super();
        } 

        private Builder(GetQueueAttributesRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.queueName = request.queueName;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * QueueName.
         */
        public Builder queueName(String queueName) {
            this.putQueryParameter("QueueName", queueName);
            this.queueName = queueName;
            return this;
        }

        @Override
        public GetQueueAttributesRequest build() {
            return new GetQueueAttributesRequest(this);
        } 

    } 

}
