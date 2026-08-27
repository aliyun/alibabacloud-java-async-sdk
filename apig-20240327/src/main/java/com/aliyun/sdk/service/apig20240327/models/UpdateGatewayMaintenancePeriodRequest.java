// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.apig20240327.models;

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
 * {@link UpdateGatewayMaintenancePeriodRequest} extends {@link RequestModel}
 *
 * <p>UpdateGatewayMaintenancePeriodRequest</p>
 */
public class UpdateGatewayMaintenancePeriodRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("gatewayId")
    private String gatewayId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("maintenancePeriod")
    private MaintenancePeriod maintenancePeriod;

    private UpdateGatewayMaintenancePeriodRequest(Builder builder) {
        super(builder);
        this.gatewayId = builder.gatewayId;
        this.maintenancePeriod = builder.maintenancePeriod;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateGatewayMaintenancePeriodRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return gatewayId
     */
    public String getGatewayId() {
        return this.gatewayId;
    }

    /**
     * @return maintenancePeriod
     */
    public MaintenancePeriod getMaintenancePeriod() {
        return this.maintenancePeriod;
    }

    public static final class Builder extends Request.Builder<UpdateGatewayMaintenancePeriodRequest, Builder> {
        private String gatewayId; 
        private MaintenancePeriod maintenancePeriod; 

        private Builder() {
            super();
        } 

        private Builder(UpdateGatewayMaintenancePeriodRequest request) {
            super(request);
            this.gatewayId = request.gatewayId;
            this.maintenancePeriod = request.maintenancePeriod;
        } 

        /**
         * gatewayId.
         */
        public Builder gatewayId(String gatewayId) {
            this.putPathParameter("gatewayId", gatewayId);
            this.gatewayId = gatewayId;
            return this;
        }

        /**
         * maintenancePeriod.
         */
        public Builder maintenancePeriod(MaintenancePeriod maintenancePeriod) {
            this.putBodyParameter("maintenancePeriod", maintenancePeriod);
            this.maintenancePeriod = maintenancePeriod;
            return this;
        }

        @Override
        public UpdateGatewayMaintenancePeriodRequest build() {
            return new UpdateGatewayMaintenancePeriodRequest(this);
        } 

    } 

    /**
     * 
     * {@link UpdateGatewayMaintenancePeriodRequest} extends {@link TeaModel}
     *
     * <p>UpdateGatewayMaintenancePeriodRequest</p>
     */
    public static class MaintenancePeriod extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("endTime")
        private String endTime;

        @com.aliyun.core.annotation.NameInMap("startTime")
        private String startTime;

        private MaintenancePeriod(Builder builder) {
            this.endTime = builder.endTime;
            this.startTime = builder.startTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MaintenancePeriod create() {
            return builder().build();
        }

        /**
         * @return endTime
         */
        public String getEndTime() {
            return this.endTime;
        }

        /**
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
        }

        public static final class Builder {
            private String endTime; 
            private String startTime; 

            private Builder() {
            } 

            private Builder(MaintenancePeriod model) {
                this.endTime = model.endTime;
                this.startTime = model.startTime;
            } 

            /**
             * endTime.
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * startTime.
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            public MaintenancePeriod build() {
                return new MaintenancePeriod(this);
            } 

        } 

    }
}
