// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cmn20200825.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AutoDutyRequest} extends {@link RequestModel}
 *
 * <p>AutoDutyRequest</p>
 */
public class AutoDutyRequest extends Request {
    @Body
    @NameInMap("DutyBatch")
    private String dutyBatch;

    @Body
    @NameInMap("DutyName")
    private String dutyName;

    @Body
    @NameInMap("EndDate")
    private String endDate;

    @Body
    @NameInMap("InstanceId")
    private String instanceId;

    @Body
    @NameInMap("StartDate")
    private String startDate;

    private AutoDutyRequest(Builder builder) {
        super(builder);
        this.dutyBatch = builder.dutyBatch;
        this.dutyName = builder.dutyName;
        this.endDate = builder.endDate;
        this.instanceId = builder.instanceId;
        this.startDate = builder.startDate;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AutoDutyRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dutyBatch
     */
    public String getDutyBatch() {
        return this.dutyBatch;
    }

    /**
     * @return dutyName
     */
    public String getDutyName() {
        return this.dutyName;
    }

    /**
     * @return endDate
     */
    public String getEndDate() {
        return this.endDate;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return startDate
     */
    public String getStartDate() {
        return this.startDate;
    }

    public static final class Builder extends Request.Builder<AutoDutyRequest, Builder> {
        private String dutyBatch; 
        private String dutyName; 
        private String endDate; 
        private String instanceId; 
        private String startDate; 

        private Builder() {
            super();
        } 

        private Builder(AutoDutyRequest request) {
            super(request);
            this.dutyBatch = request.dutyBatch;
            this.dutyName = request.dutyName;
            this.endDate = request.endDate;
            this.instanceId = request.instanceId;
            this.startDate = request.startDate;
        } 

        /**
         * DutyBatch.
         */
        public Builder dutyBatch(String dutyBatch) {
            this.putBodyParameter("DutyBatch", dutyBatch);
            this.dutyBatch = dutyBatch;
            return this;
        }

        /**
         * DutyName.
         */
        public Builder dutyName(String dutyName) {
            this.putBodyParameter("DutyName", dutyName);
            this.dutyName = dutyName;
            return this;
        }

        /**
         * EndDate.
         */
        public Builder endDate(String endDate) {
            this.putBodyParameter("EndDate", endDate);
            this.endDate = endDate;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putBodyParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * StartDate.
         */
        public Builder startDate(String startDate) {
            this.putBodyParameter("StartDate", startDate);
            this.startDate = startDate;
            return this;
        }

        @Override
        public AutoDutyRequest build() {
            return new AutoDutyRequest(this);
        } 

    } 

}
