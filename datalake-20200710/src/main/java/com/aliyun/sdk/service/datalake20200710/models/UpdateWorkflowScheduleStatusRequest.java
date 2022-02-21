// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.datalake20200710.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateWorkflowScheduleStatusRequest} extends {@link RequestModel}
 *
 * <p>UpdateWorkflowScheduleStatusRequest</p>
 */
public class UpdateWorkflowScheduleStatusRequest extends Request {
    @Query
    @NameInMap("BlueprintInstanceId")
    @Validation(required = true)
    private String blueprintInstanceId;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("UnderSchedule")
    @Validation(required = true)
    private Boolean underSchedule;

    private UpdateWorkflowScheduleStatusRequest(Builder builder) {
        super(builder);
        this.blueprintInstanceId = builder.blueprintInstanceId;
        this.regionId = builder.regionId;
        this.underSchedule = builder.underSchedule;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateWorkflowScheduleStatusRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return blueprintInstanceId
     */
    public String getBlueprintInstanceId() {
        return this.blueprintInstanceId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return underSchedule
     */
    public Boolean getUnderSchedule() {
        return this.underSchedule;
    }

    public static final class Builder extends Request.Builder<UpdateWorkflowScheduleStatusRequest, Builder> {
        private String blueprintInstanceId; 
        private String regionId; 
        private Boolean underSchedule; 

        private Builder() {
            super();
        } 

        private Builder(UpdateWorkflowScheduleStatusRequest response) {
            super(response);
            this.blueprintInstanceId = response.blueprintInstanceId;
            this.regionId = response.regionId;
            this.underSchedule = response.underSchedule;
        } 

        /**
         * BlueprintInstanceId.
         */
        public Builder blueprintInstanceId(String blueprintInstanceId) {
            this.putQueryParameter("BlueprintInstanceId", blueprintInstanceId);
            this.blueprintInstanceId = blueprintInstanceId;
            return this;
        }

        /**
         * RegionId
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * UnderSchedule.
         */
        public Builder underSchedule(Boolean underSchedule) {
            this.putQueryParameter("UnderSchedule", underSchedule);
            this.underSchedule = underSchedule;
            return this;
        }

        @Override
        public UpdateWorkflowScheduleStatusRequest build() {
            return new UpdateWorkflowScheduleStatusRequest(this);
        } 

    } 

}
