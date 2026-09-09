// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.maxcompute20220104.models;

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
 * {@link UpdateMmsTimerRequest} extends {@link RequestModel}
 *
 * <p>UpdateMmsTimerRequest</p>
 */
public class UpdateMmsTimerRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("sourceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long sourceId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("timerId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long timerId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("scheduleType")
    private String scheduleType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("stopped")
    private Boolean stopped;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("value")
    private String value;

    private UpdateMmsTimerRequest(Builder builder) {
        super(builder);
        this.sourceId = builder.sourceId;
        this.timerId = builder.timerId;
        this.scheduleType = builder.scheduleType;
        this.stopped = builder.stopped;
        this.value = builder.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateMmsTimerRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return sourceId
     */
    public Long getSourceId() {
        return this.sourceId;
    }

    /**
     * @return timerId
     */
    public Long getTimerId() {
        return this.timerId;
    }

    /**
     * @return scheduleType
     */
    public String getScheduleType() {
        return this.scheduleType;
    }

    /**
     * @return stopped
     */
    public Boolean getStopped() {
        return this.stopped;
    }

    /**
     * @return value
     */
    public String getValue() {
        return this.value;
    }

    public static final class Builder extends Request.Builder<UpdateMmsTimerRequest, Builder> {
        private Long sourceId; 
        private Long timerId; 
        private String scheduleType; 
        private Boolean stopped; 
        private String value; 

        private Builder() {
            super();
        } 

        private Builder(UpdateMmsTimerRequest request) {
            super(request);
            this.sourceId = request.sourceId;
            this.timerId = request.timerId;
            this.scheduleType = request.scheduleType;
            this.stopped = request.stopped;
            this.value = request.value;
        } 

        /**
         * <p>The ID of the data source.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2000014</p>
         */
        public Builder sourceId(Long sourceId) {
            this.putPathParameter("sourceId", sourceId);
            this.sourceId = sourceId;
            return this;
        }

        /**
         * <p>The ID of the scheduled task.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder timerId(Long timerId) {
            this.putPathParameter("timerId", timerId);
            this.timerId = timerId;
            return this;
        }

        /**
         * <p>The scheduling type of the task. Valid values: <code>Daily</code> and <code>Hourly</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>Daily</p>
         */
        public Builder scheduleType(String scheduleType) {
            this.putBodyParameter("scheduleType", scheduleType);
            this.scheduleType = scheduleType;
            return this;
        }

        /**
         * <p>Specifies whether the scheduled task is stopped.</p>
         */
        public Builder stopped(Boolean stopped) {
            this.putBodyParameter("stopped", stopped);
            this.stopped = stopped;
            return this;
        }

        /**
         * <p>The execution time of the scheduled task. If <code>scheduleType</code> is set to <code>Daily</code>, specify the time in the HH:mm format. If <code>scheduleType</code> is set to <code>Hourly</code>, specify the minute in the mm format.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-09-20</p>
         */
        public Builder value(String value) {
            this.putBodyParameter("value", value);
            this.value = value;
            return this;
        }

        @Override
        public UpdateMmsTimerRequest build() {
            return new UpdateMmsTimerRequest(this);
        } 

    } 

}
