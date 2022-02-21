// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20170705.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetAgentDataRequest} extends {@link RequestModel}
 *
 * <p>GetAgentDataRequest</p>
 */
public class GetAgentDataRequest extends Request {
    @Query
    @NameInMap("EndDay")
    @Validation(required = true)
    private String endDay;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("PageNumber")
    @Validation(required = true)
    private Integer pageNumber;

    @Query
    @NameInMap("PageSize")
    @Validation(required = true)
    private Integer pageSize;

    @Query
    @NameInMap("StartDay")
    @Validation(required = true)
    private String startDay;

    @Query
    @NameInMap("UserId")
    private String userId;

    private GetAgentDataRequest(Builder builder) {
        super(builder);
        this.endDay = builder.endDay;
        this.instanceId = builder.instanceId;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.startDay = builder.startDay;
        this.userId = builder.userId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAgentDataRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return endDay
     */
    public String getEndDay() {
        return this.endDay;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return startDay
     */
    public String getStartDay() {
        return this.startDay;
    }

    /**
     * @return userId
     */
    public String getUserId() {
        return this.userId;
    }

    public static final class Builder extends Request.Builder<GetAgentDataRequest, Builder> {
        private String endDay; 
        private String instanceId; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String startDay; 
        private String userId; 

        private Builder() {
            super();
        } 

        private Builder(GetAgentDataRequest response) {
            super(response);
            this.endDay = response.endDay;
            this.instanceId = response.instanceId;
            this.pageNumber = response.pageNumber;
            this.pageSize = response.pageSize;
            this.startDay = response.startDay;
            this.userId = response.userId;
        } 

        /**
         * EndDay.
         */
        public Builder endDay(String endDay) {
            this.putQueryParameter("EndDay", endDay);
            this.endDay = endDay;
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
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * StartDay.
         */
        public Builder startDay(String startDay) {
            this.putQueryParameter("StartDay", startDay);
            this.startDay = startDay;
            return this;
        }

        /**
         * UserId.
         */
        public Builder userId(String userId) {
            this.putQueryParameter("UserId", userId);
            this.userId = userId;
            return this;
        }

        @Override
        public GetAgentDataRequest build() {
            return new GetAgentDataRequest(this);
        } 

    } 

}
