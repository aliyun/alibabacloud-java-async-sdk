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
    @com.aliyun.core.annotation.NameInMap("tableBlackList")
    private java.util.List<String> tableBlackList;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("tableWhiteList")
    private java.util.List<String> tableWhiteList;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("value")
    private String value;

    private UpdateMmsTimerRequest(Builder builder) {
        super(builder);
        this.sourceId = builder.sourceId;
        this.timerId = builder.timerId;
        this.scheduleType = builder.scheduleType;
        this.stopped = builder.stopped;
        this.tableBlackList = builder.tableBlackList;
        this.tableWhiteList = builder.tableWhiteList;
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
     * @return tableBlackList
     */
    public java.util.List<String> getTableBlackList() {
        return this.tableBlackList;
    }

    /**
     * @return tableWhiteList
     */
    public java.util.List<String> getTableWhiteList() {
        return this.tableWhiteList;
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
        private java.util.List<String> tableBlackList; 
        private java.util.List<String> tableWhiteList; 
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
            this.tableBlackList = request.tableBlackList;
            this.tableWhiteList = request.tableWhiteList;
            this.value = request.value;
        } 

        /**
         * <p>The data source ID.</p>
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
         * <p>The scheduled task ID.</p>
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
         * <p>The scheduling type of the scheduled task.</p>
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
         * <p>Indicates whether the scheduled task is stopped.</p>
         */
        public Builder stopped(Boolean stopped) {
            this.putBodyParameter("stopped", stopped);
            this.stopped = stopped;
            return this;
        }

        /**
         * <p>The tables to exclude when type is set to Database.</p>
         */
        public Builder tableBlackList(java.util.List<String> tableBlackList) {
            this.putBodyParameter("tableBlackList", tableBlackList);
            this.tableBlackList = tableBlackList;
            return this;
        }

        /**
         * <p>The tables to migrate when type is set to Database.</p>
         */
        public Builder tableWhiteList(java.util.List<String> tableWhiteList) {
            this.putBodyParameter("tableWhiteList", tableWhiteList);
            this.tableWhiteList = tableWhiteList;
            return this;
        }

        /**
         * <p>The scheduling time of the scheduled task. If scheduleType is set to Daily, the value is in the HH:MM format. If scheduleType is set to Hourly, the value is in the MM format.</p>
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
