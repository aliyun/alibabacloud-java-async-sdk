// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pai_dlc20201203.models;

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
 * {@link RLProgressStage} extends {@link TeaModel}
 *
 * <p>RLProgressStage</p>
 */
public class RLProgressStage extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Duration")
    private Double duration;

    @com.aliyun.core.annotation.NameInMap("EndTime")
    private Long endTime;

    @com.aliyun.core.annotation.NameInMap("Key")
    private String key;

    @com.aliyun.core.annotation.NameInMap("Label")
    private String label;

    @com.aliyun.core.annotation.NameInMap("Marker")
    private String marker;

    @com.aliyun.core.annotation.NameInMap("Optional")
    private Boolean optional;

    @com.aliyun.core.annotation.NameInMap("StartTime")
    private Long startTime;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    private RLProgressStage(Builder builder) {
        this.duration = builder.duration;
        this.endTime = builder.endTime;
        this.key = builder.key;
        this.label = builder.label;
        this.marker = builder.marker;
        this.optional = builder.optional;
        this.startTime = builder.startTime;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RLProgressStage create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return duration
     */
    public Double getDuration() {
        return this.duration;
    }

    /**
     * @return endTime
     */
    public Long getEndTime() {
        return this.endTime;
    }

    /**
     * @return key
     */
    public String getKey() {
        return this.key;
    }

    /**
     * @return label
     */
    public String getLabel() {
        return this.label;
    }

    /**
     * @return marker
     */
    public String getMarker() {
        return this.marker;
    }

    /**
     * @return optional
     */
    public Boolean getOptional() {
        return this.optional;
    }

    /**
     * @return startTime
     */
    public Long getStartTime() {
        return this.startTime;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder {
        private Double duration; 
        private Long endTime; 
        private String key; 
        private String label; 
        private String marker; 
        private Boolean optional; 
        private Long startTime; 
        private String status; 

        private Builder() {
        } 

        private Builder(RLProgressStage model) {
            this.duration = model.duration;
            this.endTime = model.endTime;
            this.key = model.key;
            this.label = model.label;
            this.marker = model.marker;
            this.optional = model.optional;
            this.startTime = model.startTime;
            this.status = model.status;
        } 

        /**
         * <p>阶段耗时（秒，保留 3 位小数）；一个 step 常整体落在同一秒内，故不取整</p>
         * 
         * <strong>example:</strong>
         * <p>0.483</p>
         */
        public Builder duration(Double duration) {
            this.duration = duration;
            return this;
        }

        /**
         * <p>阶段结束时间（unix 秒）</p>
         * 
         * <strong>example:</strong>
         * <p>1787474487</p>
         */
        public Builder endTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>阶段标识</p>
         * 
         * <strong>example:</strong>
         * <p>traj</p>
         */
        public Builder key(String key) {
            this.key = key;
            return this;
        }

        /**
         * <p>阶段中文名</p>
         * 
         * <strong>example:</strong>
         * <p>生成轨迹</p>
         */
        public Builder label(String label) {
            this.label = label;
            return this;
        }

        /**
         * <p>匹配该阶段的日志标记文案</p>
         * 
         * <strong>example:</strong>
         * <p>start/end generation</p>
         */
        public Builder marker(String marker) {
            this.marker = marker;
            return this;
        }

        /**
         * <p>是否为可选阶段；可选阶段未出现时状态记为 skipped</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder optional(Boolean optional) {
            this.optional = optional;
            return this;
        }

        /**
         * <p>阶段开始时间（unix 秒）</p>
         * 
         * <strong>example:</strong>
         * <p>1787474487</p>
         */
        public Builder startTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }

        /**
         * <p>done / running / waiting / pending / skipped</p>
         * 
         * <strong>example:</strong>
         * <p>done</p>
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        public RLProgressStage build() {
            return new RLProgressStage(this);
        } 

    } 

}
