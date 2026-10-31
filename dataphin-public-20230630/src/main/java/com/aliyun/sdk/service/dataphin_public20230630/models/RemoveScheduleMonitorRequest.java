// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataphin_public20230630.models;

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
 * {@link RemoveScheduleMonitorRequest} extends {@link RequestModel}
 *
 * <p>RemoveScheduleMonitorRequest</p>
 */
public class RemoveScheduleMonitorRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OpTenantId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long opTenantId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OpUserId")
    private String opUserId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RemoveCommand")
    @com.aliyun.core.annotation.Validation(required = true)
    private RemoveCommand removeCommand;

    private RemoveScheduleMonitorRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.opTenantId = builder.opTenantId;
        this.opUserId = builder.opUserId;
        this.removeCommand = builder.removeCommand;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RemoveScheduleMonitorRequest create() {
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
     * @return opTenantId
     */
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    /**
     * @return opUserId
     */
    public String getOpUserId() {
        return this.opUserId;
    }

    /**
     * @return removeCommand
     */
    public RemoveCommand getRemoveCommand() {
        return this.removeCommand;
    }

    public static final class Builder extends Request.Builder<RemoveScheduleMonitorRequest, Builder> {
        private String regionId; 
        private Long opTenantId; 
        private String opUserId; 
        private RemoveCommand removeCommand; 

        private Builder() {
            super();
        } 

        private Builder(RemoveScheduleMonitorRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.opTenantId = request.opTenantId;
            this.opUserId = request.opUserId;
            this.removeCommand = request.removeCommand;
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
         * <p>The tenant ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>30001011</p>
         */
        public Builder opTenantId(Long opTenantId) {
            this.putQueryParameter("OpTenantId", opTenantId);
            this.opTenantId = opTenantId;
            return this;
        }

        /**
         * <p>The ID of the operator.</p>
         * 
         * <strong>example:</strong>
         * <p>30001011</p>
         */
        public Builder opUserId(String opUserId) {
            this.putQueryParameter("OpUserId", opUserId);
            this.opUserId = opUserId;
            return this;
        }

        /**
         * <p>The request body for removing scheduling monitoring.</p>
         * <p>This parameter is required.</p>
         */
        public Builder removeCommand(RemoveCommand removeCommand) {
            String removeCommandShrink = shrink(removeCommand, "RemoveCommand", "json");
            this.putBodyParameter("RemoveCommand", removeCommandShrink);
            this.removeCommand = removeCommand;
            return this;
        }

        @Override
        public RemoveScheduleMonitorRequest build() {
            return new RemoveScheduleMonitorRequest(this);
        } 

    } 

    /**
     * 
     * {@link RemoveScheduleMonitorRequest} extends {@link TeaModel}
     *
     * <p>RemoveScheduleMonitorRequest</p>
     */
    public static class RemoveCommand extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("MonitoredItemId")
        @com.aliyun.core.annotation.Validation(required = true)
        private Long monitoredItemId;

        @com.aliyun.core.annotation.NameInMap("MonitoredItemType")
        @com.aliyun.core.annotation.Validation(required = true)
        private String monitoredItemType;

        private RemoveCommand(Builder builder) {
            this.monitoredItemId = builder.monitoredItemId;
            this.monitoredItemType = builder.monitoredItemType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RemoveCommand create() {
            return builder().build();
        }

        /**
         * @return monitoredItemId
         */
        public Long getMonitoredItemId() {
            return this.monitoredItemId;
        }

        /**
         * @return monitoredItemType
         */
        public String getMonitoredItemType() {
            return this.monitoredItemType;
        }

        public static final class Builder {
            private Long monitoredItemId; 
            private String monitoredItemType; 

            private Builder() {
            } 

            private Builder(RemoveCommand model) {
                this.monitoredItemId = model.monitoredItemId;
                this.monitoredItemType = model.monitoredItemType;
            } 

            /**
             * <p>The ID of the monitored item.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>6912345678901234</p>
             */
            public Builder monitoredItemId(Long monitoredItemId) {
                this.monitoredItemId = monitoredItemId;
                return this;
            }

            /**
             * <p>The type of the monitored item. Valid values: LOGICAL_FIELD, OND_ID_NODE, SCHEDULE_PHYSICAL_NODE, MANUAL_PHYSICAL_NODE, ODM_NODE, LOGICAL_TABLE_NODE, and PROJECT.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>SCHEDULE_PHYSICAL_NODE</p>
             */
            public Builder monitoredItemType(String monitoredItemType) {
                this.monitoredItemType = monitoredItemType;
                return this;
            }

            public RemoveCommand build() {
                return new RemoveCommand(this);
            } 

        } 

    }
}
