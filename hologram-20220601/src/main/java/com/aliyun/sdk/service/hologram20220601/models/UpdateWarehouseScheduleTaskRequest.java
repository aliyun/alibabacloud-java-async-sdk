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
 * {@link UpdateWarehouseScheduleTaskRequest} extends {@link RequestModel}
 *
 * <p>UpdateWarehouseScheduleTaskRequest</p>
 */
public class UpdateWarehouseScheduleTaskRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("instanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("elasticCu")
    private Long elasticCu;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("endTime")
    private String endTime;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("id")
    private String id;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("startTime")
    private String startTime;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("warehouseId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long warehouseId;

    private UpdateWarehouseScheduleTaskRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.elasticCu = builder.elasticCu;
        this.endTime = builder.endTime;
        this.id = builder.id;
        this.startTime = builder.startTime;
        this.warehouseId = builder.warehouseId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateWarehouseScheduleTaskRequest create() {
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
     * @return id
     */
    public String getId() {
        return this.id;
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

    public static final class Builder extends Request.Builder<UpdateWarehouseScheduleTaskRequest, Builder> {
        private String instanceId; 
        private Long elasticCu; 
        private String endTime; 
        private String id; 
        private String startTime; 
        private Long warehouseId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateWarehouseScheduleTaskRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.elasticCu = request.elasticCu;
            this.endTime = request.endTime;
            this.id = request.id;
            this.startTime = request.startTime;
            this.warehouseId = request.warehouseId;
        } 

        /**
         * <p>The instance ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>hgprecn-cn-xxxxxxx</p>
         */
        public Builder instanceId(String instanceId) {
            this.putPathParameter("instanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The number of CPU cores to scale out. The value must be a multiple of 16, greater than or equal to 16, and less than or equal to the specifications of the current compute group.</p>
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
         * <p>The end time. The format is HHmm (four digits, 24-hour clock). The time must be on the hour or half hour, such as 0030, 0100, or 0400. The end time must be later than the start time.</p>
         * 
         * <strong>example:</strong>
         * <p>0400</p>
         */
        public Builder endTime(String endTime) {
            this.putBodyParameter("endTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>The elastic plan ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1980869072412614657</p>
         */
        public Builder id(String id) {
            this.putBodyParameter("id", id);
            this.id = id;
            return this;
        }

        /**
         * <p>The start time. The format is HHmm (four digits, 24-hour clock). The time must be on the hour or half hour, such as 0030, 0100, or 0400.</p>
         * 
         * <strong>example:</strong>
         * <p>0200</p>
         */
        public Builder startTime(String startTime) {
            this.putBodyParameter("startTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * <p>The compute group ID.</p>
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
        public UpdateWarehouseScheduleTaskRequest build() {
            return new UpdateWarehouseScheduleTaskRequest(this);
        } 

    } 

}
