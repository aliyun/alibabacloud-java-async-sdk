// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

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
 * {@link UpdateScheduledPreloadExecutionRequest} extends {@link RequestModel}
 *
 * <p>UpdateScheduledPreloadExecutionRequest</p>
 */
public class UpdateScheduledPreloadExecutionRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EndTime")
    private String endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Id")
    @com.aliyun.core.annotation.Validation(required = true)
    private String id;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Interval")
    private Integer interval;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SliceLen")
    private Integer sliceLen;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("StartTime")
    private String startTime;

    private UpdateScheduledPreloadExecutionRequest(Builder builder) {
        super(builder);
        this.endTime = builder.endTime;
        this.id = builder.id;
        this.interval = builder.interval;
        this.sliceLen = builder.sliceLen;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateScheduledPreloadExecutionRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
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
     * @return interval
     */
    public Integer getInterval() {
        return this.interval;
    }

    /**
     * @return sliceLen
     */
    public Integer getSliceLen() {
        return this.sliceLen;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    public static final class Builder extends Request.Builder<UpdateScheduledPreloadExecutionRequest, Builder> {
        private String endTime; 
        private String id; 
        private Integer interval; 
        private Integer sliceLen; 
        private String startTime; 

        private Builder() {
            super();
        } 

        private Builder(UpdateScheduledPreloadExecutionRequest request) {
            super(request);
            this.endTime = request.endTime;
            this.id = request.id;
            this.interval = request.interval;
            this.sliceLen = request.sliceLen;
            this.startTime = request.startTime;
        } 

        /**
         * <p>The end time of the prefetch plan.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-05-31T18:10:48.849+08:00</p>
         */
        public Builder endTime(String endTime) {
            this.putBodyParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>The ID of the prefetch plan.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>UpdateScheduledPreloadExecution</p>
         */
        public Builder id(String id) {
            this.putQueryParameter("Id", id);
            this.id = id;
            return this;
        }

        /**
         * <p>The time interval between each batch execution. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>60</p>
         */
        public Builder interval(Integer interval) {
            this.putBodyParameter("Interval", interval);
            this.interval = interval;
            return this;
        }

        /**
         * <p>The number of URLs prefetched in each batch.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder sliceLen(Integer sliceLen) {
            this.putBodyParameter("SliceLen", sliceLen);
            this.sliceLen = sliceLen;
            return this;
        }

        /**
         * <p>The start time of the prefetch plan.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-05-31T17:10:48.849+08:00</p>
         */
        public Builder startTime(String startTime) {
            this.putBodyParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        @Override
        public UpdateScheduledPreloadExecutionRequest build() {
            return new UpdateScheduledPreloadExecutionRequest(this);
        } 

    } 

}
