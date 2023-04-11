// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreatePublishGroupTaskRequest} extends {@link RequestModel}
 *
 * <p>CreatePublishGroupTaskRequest</p>
 */
public class CreatePublishGroupTaskRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("DbId")
    @Validation(required = true)
    private Integer dbId;

    @Query
    @NameInMap("Logic")
    @Validation(required = true)
    private Boolean logic;

    @Query
    @NameInMap("OrderId")
    @Validation(required = true)
    private Long orderId;

    @Query
    @NameInMap("PlanTime")
    private String planTime;

    @Query
    @NameInMap("PublishStrategy")
    @Validation(required = true)
    private String publishStrategy;

    @Query
    @NameInMap("Tid")
    private Long tid;

    private CreatePublishGroupTaskRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.dbId = builder.dbId;
        this.logic = builder.logic;
        this.orderId = builder.orderId;
        this.planTime = builder.planTime;
        this.publishStrategy = builder.publishStrategy;
        this.tid = builder.tid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreatePublishGroupTaskRequest create() {
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
     * @return dbId
     */
    public Integer getDbId() {
        return this.dbId;
    }

    /**
     * @return logic
     */
    public Boolean getLogic() {
        return this.logic;
    }

    /**
     * @return orderId
     */
    public Long getOrderId() {
        return this.orderId;
    }

    /**
     * @return planTime
     */
    public String getPlanTime() {
        return this.planTime;
    }

    /**
     * @return publishStrategy
     */
    public String getPublishStrategy() {
        return this.publishStrategy;
    }

    /**
     * @return tid
     */
    public Long getTid() {
        return this.tid;
    }

    public static final class Builder extends Request.Builder<CreatePublishGroupTaskRequest, Builder> {
        private String regionId; 
        private Integer dbId; 
        private Boolean logic; 
        private Long orderId; 
        private String planTime; 
        private String publishStrategy; 
        private Long tid; 

        private Builder() {
            super();
        } 

        private Builder(CreatePublishGroupTaskRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.dbId = request.dbId;
            this.logic = request.logic;
            this.orderId = request.orderId;
            this.planTime = request.planTime;
            this.publishStrategy = request.publishStrategy;
            this.tid = request.tid;
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
         * The ID of the database for which the schema design is executed.
         */
        public Builder dbId(Integer dbId) {
            this.putQueryParameter("DbId", dbId);
            this.dbId = dbId;
            return this;
        }

        /**
         * Indicates whether the database is a logical database.
         */
        public Builder logic(Boolean logic) {
            this.putQueryParameter("Logic", logic);
            this.logic = logic;
            return this;
        }

        /**
         * The ID of the ticket.
         * <p>
         * 
         * > : You can create a schema design ticket in the DMS console. For more information, see [Design schemas](~~69711~~). You can also create a schema design ticket by calling the [CreateOrder](~~144649~~) operation and obtain the ticket ID.
         */
        public Builder orderId(Long orderId) {
            this.putQueryParameter("OrderId", orderId);
            this.orderId = orderId;
            return this;
        }

        /**
         * The time to execute the schema design ticket.
         */
        public Builder planTime(String planTime) {
            this.putQueryParameter("PlanTime", planTime);
            this.planTime = planTime;
            return this;
        }

        /**
         * The policy to execute the schema design ticket. Valid values:
         * <p>
         * 
         * *   IMMEDIATELY: immediately executes the schema design ticket.
         * *   REGULARLY: executes the schema design ticket at a scheduled time.
         */
        public Builder publishStrategy(String publishStrategy) {
            this.putQueryParameter("PublishStrategy", publishStrategy);
            this.publishStrategy = publishStrategy;
            return this;
        }

        /**
         * The ID of the tenant.
         * <p>
         * 
         * > : To view the ID of the tenant, log on to the Data Management (DMS) console and move the pointer over the profile picture in the upper-right corner. For more information, see [Manage DMS tenants](~~181330~~).
         */
        public Builder tid(Long tid) {
            this.putQueryParameter("Tid", tid);
            this.tid = tid;
            return this;
        }

        @Override
        public CreatePublishGroupTaskRequest build() {
            return new CreatePublishGroupTaskRequest(this);
        } 

    } 

}
