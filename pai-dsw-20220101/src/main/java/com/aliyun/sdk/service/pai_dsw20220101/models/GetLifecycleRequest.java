// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pai_dsw20220101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetLifecycleRequest} extends {@link RequestModel}
 *
 * <p>GetLifecycleRequest</p>
 */
public class GetLifecycleRequest extends Request {
    @Path
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("EndTime")
    private String endTime;

    @Query
    @NameInMap("Limit")
    private Integer limit;

    @Query
    @NameInMap("Order")
    private String order;

    @Query
    @NameInMap("SessionNumber")
    private Integer sessionNumber;

    @Query
    @NameInMap("StartTime")
    private String startTime;

    private GetLifecycleRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.endTime = builder.endTime;
        this.limit = builder.limit;
        this.order = builder.order;
        this.sessionNumber = builder.sessionNumber;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetLifecycleRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return limit
     */
    public Integer getLimit() {
        return this.limit;
    }

    /**
     * @return order
     */
    public String getOrder() {
        return this.order;
    }

    /**
     * @return sessionNumber
     */
    public Integer getSessionNumber() {
        return this.sessionNumber;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    public static final class Builder extends Request.Builder<GetLifecycleRequest, Builder> {
        private String instanceId; 
        private String endTime; 
        private Integer limit; 
        private String order; 
        private Integer sessionNumber; 
        private String startTime; 

        private Builder() {
            super();
        } 

        private Builder(GetLifecycleRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.endTime = request.endTime;
            this.limit = request.limit;
            this.order = request.order;
            this.sessionNumber = request.sessionNumber;
            this.startTime = request.startTime;
        } 

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putPathParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * EndTime.
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * Limit.
         */
        public Builder limit(Integer limit) {
            this.putQueryParameter("Limit", limit);
            this.limit = limit;
            return this;
        }

        /**
         * Order.
         */
        public Builder order(String order) {
            this.putQueryParameter("Order", order);
            this.order = order;
            return this;
        }

        /**
         * SessionNumber.
         */
        public Builder sessionNumber(Integer sessionNumber) {
            this.putQueryParameter("SessionNumber", sessionNumber);
            this.sessionNumber = sessionNumber;
            return this;
        }

        /**
         * StartTime.
         */
        public Builder startTime(String startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        @Override
        public GetLifecycleRequest build() {
            return new GetLifecycleRequest(this);
        } 

    } 

}
