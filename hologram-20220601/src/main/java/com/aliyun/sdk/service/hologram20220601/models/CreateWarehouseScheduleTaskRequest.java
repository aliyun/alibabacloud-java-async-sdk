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
 * {@link CreateWarehouseScheduleTaskRequest} extends {@link RequestModel}
 *
 * <p>CreateWarehouseScheduleTaskRequest</p>
 */
public class CreateWarehouseScheduleTaskRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("instanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("elasticCu")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long elasticCu;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("endTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private String endTime;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("startTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private String startTime;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("warehouseId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long warehouseId;

    private CreateWarehouseScheduleTaskRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.description = builder.description;
        this.elasticCu = builder.elasticCu;
        this.endTime = builder.endTime;
        this.startTime = builder.startTime;
        this.warehouseId = builder.warehouseId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateWarehouseScheduleTaskRequest create() {
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
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return elasticCu
     */
    public Long getElasticCu() {
        return this.elasticCu;
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

    /**
     * @return warehouseId
     */
    public Long getWarehouseId() {
        return this.warehouseId;
    }

    public static final class Builder extends Request.Builder<CreateWarehouseScheduleTaskRequest, Builder> {
        private String instanceId; 
        private String description; 
        private Long elasticCu; 
        private String endTime; 
        private String startTime; 
        private Long warehouseId; 

        private Builder() {
            super();
        } 

        private Builder(CreateWarehouseScheduleTaskRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.description = request.description;
            this.elasticCu = request.elasticCu;
            this.endTime = request.endTime;
            this.startTime = request.startTime;
            this.warehouseId = request.warehouseId;
        } 

        /**
         * <p>The ID of the Hologres instance.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>hgpostcn-cn-lbj33559x001</p>
         */
        public Builder instanceId(String instanceId) {
            this.putPathParameter("instanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The description of the time-based elastic plan.</p>
         * 
         * <strong>example:</strong>
         * <p>user stat</p>
         */
        public Builder description(String description) {
            this.putBodyParameter("description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The number of elastic CPU cores. The value must be a multiple of 16, greater than or equal to 16, and less than or equal to the specifications of the current compute group.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>32</p>
         */
        public Builder elasticCu(Long elasticCu) {
            this.putBodyParameter("elasticCu", elasticCu);
            this.elasticCu = elasticCu;
            return this;
        }

        /**
         * <p>The end time. The format is HHmm (four digits, 24-hour clock). The time must be on the hour or half hour, such as 0030, 0100, or 0400.
         * The end time must be later than the start time.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>0200</p>
         */
        public Builder endTime(String endTime) {
            this.putBodyParameter("endTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>The start time. The format is HHmm (four digits, 24-hour clock). The time must be on the hour or half hour, such as 0030, 0100, or 0400.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>0100</p>
         */
        public Builder startTime(String startTime) {
            this.putBodyParameter("startTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * <p>The ID of the compute group. You can call ListWarehouses to obtain the ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder warehouseId(Long warehouseId) {
            this.putBodyParameter("warehouseId", warehouseId);
            this.warehouseId = warehouseId;
            return this;
        }

        @Override
        public CreateWarehouseScheduleTaskRequest build() {
            return new CreateWarehouseScheduleTaskRequest(this);
        } 

    } 

}
