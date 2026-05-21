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
 * {@link UpdateOperationEventScheduleTimeRequest} extends {@link RequestModel}
 *
 * <p>UpdateOperationEventScheduleTimeRequest</p>
 */
public class UpdateOperationEventScheduleTimeRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("instanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("id")
    @com.aliyun.core.annotation.Validation(required = true)
    private String id;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("scheduleTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private String scheduleTime;

    private UpdateOperationEventScheduleTimeRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.id = builder.id;
        this.scheduleTime = builder.scheduleTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateOperationEventScheduleTimeRequest create() {
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
     * @return id
     */
    public String getId() {
        return this.id;
    }

    /**
     * @return scheduleTime
     */
    public String getScheduleTime() {
        return this.scheduleTime;
    }

    public static final class Builder extends Request.Builder<UpdateOperationEventScheduleTimeRequest, Builder> {
        private String instanceId; 
        private String id; 
        private String scheduleTime; 

        private Builder() {
            super();
        } 

        private Builder(UpdateOperationEventScheduleTimeRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.id = request.id;
            this.scheduleTime = request.scheduleTime;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>hgprecn-cn-zvp2qfwecxxxx</p>
         */
        public Builder instanceId(String instanceId) {
            this.putPathParameter("instanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2034449120420339713</p>
         */
        public Builder id(String id) {
            this.putBodyParameter("id", id);
            this.id = id;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-08-23 14:55:00</p>
         */
        public Builder scheduleTime(String scheduleTime) {
            this.putBodyParameter("scheduleTime", scheduleTime);
            this.scheduleTime = scheduleTime;
            return this;
        }

        @Override
        public UpdateOperationEventScheduleTimeRequest build() {
            return new UpdateOperationEventScheduleTimeRequest(this);
        } 

    } 

}
