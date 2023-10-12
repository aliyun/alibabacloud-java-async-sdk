// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cmn20200825.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateSetupProjectRequest} extends {@link RequestModel}
 *
 * <p>CreateSetupProjectRequest</p>
 */
public class CreateSetupProjectRequest extends Request {
    @Body
    @NameInMap("DeliveryTime")
    private String deliveryTime;

    @Body
    @NameInMap("Description")
    private String description;

    @Query
    @NameInMap("InstanceId")
    private String instanceId;

    @Body
    @NameInMap("SpaceId")
    @Validation(required = true)
    private String spaceId;

    private CreateSetupProjectRequest(Builder builder) {
        super(builder);
        this.deliveryTime = builder.deliveryTime;
        this.description = builder.description;
        this.instanceId = builder.instanceId;
        this.spaceId = builder.spaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateSetupProjectRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return deliveryTime
     */
    public String getDeliveryTime() {
        return this.deliveryTime;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return spaceId
     */
    public String getSpaceId() {
        return this.spaceId;
    }

    public static final class Builder extends Request.Builder<CreateSetupProjectRequest, Builder> {
        private String deliveryTime; 
        private String description; 
        private String instanceId; 
        private String spaceId; 

        private Builder() {
            super();
        } 

        private Builder(CreateSetupProjectRequest request) {
            super(request);
            this.deliveryTime = request.deliveryTime;
            this.description = request.description;
            this.instanceId = request.instanceId;
            this.spaceId = request.spaceId;
        } 

        /**
         * 代表创建时间的资源属性字段
         */
        public Builder deliveryTime(String deliveryTime) {
            this.putBodyParameter("DeliveryTime", deliveryTime);
            this.deliveryTime = deliveryTime;
            return this;
        }

        /**
         * 描述
         */
        public Builder description(String description) {
            this.putBodyParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * 物理空间uId
         */
        public Builder spaceId(String spaceId) {
            this.putBodyParameter("SpaceId", spaceId);
            this.spaceId = spaceId;
            return this;
        }

        @Override
        public CreateSetupProjectRequest build() {
            return new CreateSetupProjectRequest(this);
        } 

    } 

}
