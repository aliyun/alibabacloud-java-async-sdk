// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cmn20200825.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ScheduleType} extends {@link TeaModel}
 *
 * <p>ScheduleType</p>
 */
public class ScheduleType extends TeaModel {
    @NameInMap("CreateTime")
    private String createTime;

    @NameInMap("Key")
    private String key;

    @NameInMap("RelatedWorker")
    private java.util.List < String > relatedWorker;

    @NameInMap("ScheduleTypeId")
    private String scheduleTypeId;

    @NameInMap("Status")
    private String status;

    @NameInMap("UpdateTime")
    private String updateTime;

    @NameInMap("Value")
    private String value;

    private ScheduleType(Builder builder) {
        this.createTime = builder.createTime;
        this.key = builder.key;
        this.relatedWorker = builder.relatedWorker;
        this.scheduleTypeId = builder.scheduleTypeId;
        this.status = builder.status;
        this.updateTime = builder.updateTime;
        this.value = builder.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ScheduleType create() {
        return builder().build();
    }

    /**
     * @return createTime
     */
    public String getCreateTime() {
        return this.createTime;
    }

    /**
     * @return key
     */
    public String getKey() {
        return this.key;
    }

    /**
     * @return relatedWorker
     */
    public java.util.List < String > getRelatedWorker() {
        return this.relatedWorker;
    }

    /**
     * @return scheduleTypeId
     */
    public String getScheduleTypeId() {
        return this.scheduleTypeId;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return updateTime
     */
    public String getUpdateTime() {
        return this.updateTime;
    }

    /**
     * @return value
     */
    public String getValue() {
        return this.value;
    }

    public static final class Builder {
        private String createTime; 
        private String key; 
        private java.util.List < String > relatedWorker; 
        private String scheduleTypeId; 
        private String status; 
        private String updateTime; 
        private String value; 

        /**
         * CreateTime.
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * Key.
         */
        public Builder key(String key) {
            this.key = key;
            return this;
        }

        /**
         * RelatedWorker.
         */
        public Builder relatedWorker(java.util.List < String > relatedWorker) {
            this.relatedWorker = relatedWorker;
            return this;
        }

        /**
         * ScheduleTypeId.
         */
        public Builder scheduleTypeId(String scheduleTypeId) {
            this.scheduleTypeId = scheduleTypeId;
            return this;
        }

        /**
         * Status.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * UpdateTime.
         */
        public Builder updateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }

        /**
         * Value.
         */
        public Builder value(String value) {
            this.value = value;
            return this;
        }

        public ScheduleType build() {
            return new ScheduleType(this);
        } 

    } 

}
