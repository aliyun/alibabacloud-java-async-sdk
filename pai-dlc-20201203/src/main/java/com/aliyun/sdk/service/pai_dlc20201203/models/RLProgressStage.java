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
         * <p>The duration of the stage in seconds, with three decimal places. A step often falls entirely within the same second, so the value is not rounded to an integer.</p>
         * 
         * <strong>example:</strong>
         * <p>0.483</p>
         */
        public Builder duration(Double duration) {
            this.duration = duration;
            return this;
        }

        /**
         * <p>The end time of the stage in UNIX seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1787474487</p>
         */
        public Builder endTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>The stage identifier.</p>
         * 
         * <strong>example:</strong>
         * <p>traj</p>
         */
        public Builder key(String key) {
            this.key = key;
            return this;
        }

        /**
         * <p>The Chinese name of the stage.</p>
         * 
         * <strong>example:</strong>
         * <p>Generate trace</p>
         */
        public Builder label(String label) {
            this.label = label;
            return this;
        }

        /**
         * <p>The log marker text used to match the stage.</p>
         * 
         * <strong>example:</strong>
         * <p>start/end generation</p>
         */
        public Builder marker(String marker) {
            this.marker = marker;
            return this;
        }

        /**
         * <p>Specifies whether the stage is optional. If an optional stage does not occur, its status is recorded as skipped.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder optional(Boolean optional) {
            this.optional = optional;
            return this;
        }

        /**
         * <p>The start time of the stage in UNIX seconds.</p>
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
