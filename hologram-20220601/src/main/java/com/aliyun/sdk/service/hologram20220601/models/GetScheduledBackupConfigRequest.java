// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hologram20220601.models;

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
 * {@link GetScheduledBackupConfigRequest} extends {@link RequestModel}
 *
 * <p>GetScheduledBackupConfigRequest</p>
 */
public class GetScheduledBackupConfigRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("instanceId")
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("scheduleType")
    private String scheduleType;

    private GetScheduledBackupConfigRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.instanceId = builder.instanceId;
        this.scheduleType = builder.scheduleType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetScheduledBackupConfigRequest create() {
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
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return scheduleType
     */
    public String getScheduleType() {
        return this.scheduleType;
    }

    public static final class Builder extends Request.Builder<GetScheduledBackupConfigRequest, Builder> {
        private String regionId; 
        private String instanceId; 
        private String scheduleType; 

        private Builder() {
            super();
        } 

        private Builder(GetScheduledBackupConfigRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.instanceId = request.instanceId;
            this.scheduleType = request.scheduleType;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * instanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("instanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * scheduleType.
         */
        public Builder scheduleType(String scheduleType) {
            this.putQueryParameter("scheduleType", scheduleType);
            this.scheduleType = scheduleType;
            return this;
        }

        @Override
        public GetScheduledBackupConfigRequest build() {
            return new GetScheduledBackupConfigRequest(this);
        } 

    } 

}
