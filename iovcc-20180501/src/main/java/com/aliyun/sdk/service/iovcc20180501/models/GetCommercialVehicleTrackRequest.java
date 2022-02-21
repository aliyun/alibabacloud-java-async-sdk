// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iovcc20180501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetCommercialVehicleTrackRequest} extends {@link RequestModel}
 *
 * <p>GetCommercialVehicleTrackRequest</p>
 */
public class GetCommercialVehicleTrackRequest extends Request {
    @Query
    @NameInMap("ClientId")
    @Validation(required = true)
    private String clientId;

    @Query
    @NameInMap("EndTime")
    @Validation(required = true)
    private Long endTime;

    @Query
    @NameInMap("ProjectId")
    @Validation(required = true)
    private String projectId;

    @Query
    @NameInMap("StartTime")
    @Validation(required = true)
    private Long startTime;

    private GetCommercialVehicleTrackRequest(Builder builder) {
        super(builder);
        this.clientId = builder.clientId;
        this.endTime = builder.endTime;
        this.projectId = builder.projectId;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetCommercialVehicleTrackRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clientId
     */
    public String getClientId() {
        return this.clientId;
    }

    /**
     * @return endTime
     */
    public Long getEndTime() {
        return this.endTime;
    }

    /**
     * @return projectId
     */
    public String getProjectId() {
        return this.projectId;
    }

    /**
     * @return startTime
     */
    public Long getStartTime() {
        return this.startTime;
    }

    public static final class Builder extends Request.Builder<GetCommercialVehicleTrackRequest, Builder> {
        private String clientId; 
        private Long endTime; 
        private String projectId; 
        private Long startTime; 

        private Builder() {
            super();
        } 

        private Builder(GetCommercialVehicleTrackRequest response) {
            super(response);
            this.clientId = response.clientId;
            this.endTime = response.endTime;
            this.projectId = response.projectId;
            this.startTime = response.startTime;
        } 

        /**
         * ClientId.
         */
        public Builder clientId(String clientId) {
            this.putQueryParameter("ClientId", clientId);
            this.clientId = clientId;
            return this;
        }

        /**
         * EndTime.
         */
        public Builder endTime(Long endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * 项目ID
         */
        public Builder projectId(String projectId) {
            this.putQueryParameter("ProjectId", projectId);
            this.projectId = projectId;
            return this;
        }

        /**
         * StartTime.
         */
        public Builder startTime(Long startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        @Override
        public GetCommercialVehicleTrackRequest build() {
            return new GetCommercialVehicleTrackRequest(this);
        } 

    } 

}
