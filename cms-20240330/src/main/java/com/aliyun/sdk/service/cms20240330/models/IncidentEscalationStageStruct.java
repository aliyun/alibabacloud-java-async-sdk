// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20240330.models;

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
 * {@link IncidentEscalationStageStruct} extends {@link TeaModel}
 *
 * <p>IncidentEscalationStageStruct</p>
 */
public class IncidentEscalationStageStruct extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("contact")
    private java.util.List<IncidentContactStruct> contact;

    @com.aliyun.core.annotation.NameInMap("cycleNotifyCount")
    private Integer cycleNotifyCount;

    @com.aliyun.core.annotation.NameInMap("cycleNotifyTime")
    private Integer cycleNotifyTime;

    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("effectTime")
    private String effectTime;

    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("stageIndex")
    private Integer stageIndex;

    @com.aliyun.core.annotation.NameInMap("timeZone")
    private String timeZone;

    @com.aliyun.core.annotation.NameInMap("waitToNextStageTime")
    private Integer waitToNextStageTime;

    private IncidentEscalationStageStruct(Builder builder) {
        this.contact = builder.contact;
        this.cycleNotifyCount = builder.cycleNotifyCount;
        this.cycleNotifyTime = builder.cycleNotifyTime;
        this.description = builder.description;
        this.effectTime = builder.effectTime;
        this.name = builder.name;
        this.stageIndex = builder.stageIndex;
        this.timeZone = builder.timeZone;
        this.waitToNextStageTime = builder.waitToNextStageTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static IncidentEscalationStageStruct create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return contact
     */
    public java.util.List<IncidentContactStruct> getContact() {
        return this.contact;
    }

    /**
     * @return cycleNotifyCount
     */
    public Integer getCycleNotifyCount() {
        return this.cycleNotifyCount;
    }

    /**
     * @return cycleNotifyTime
     */
    public Integer getCycleNotifyTime() {
        return this.cycleNotifyTime;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return effectTime
     */
    public String getEffectTime() {
        return this.effectTime;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return stageIndex
     */
    public Integer getStageIndex() {
        return this.stageIndex;
    }

    /**
     * @return timeZone
     */
    public String getTimeZone() {
        return this.timeZone;
    }

    /**
     * @return waitToNextStageTime
     */
    public Integer getWaitToNextStageTime() {
        return this.waitToNextStageTime;
    }

    public static final class Builder {
        private java.util.List<IncidentContactStruct> contact; 
        private Integer cycleNotifyCount; 
        private Integer cycleNotifyTime; 
        private String description; 
        private String effectTime; 
        private String name; 
        private Integer stageIndex; 
        private String timeZone; 
        private Integer waitToNextStageTime; 

        private Builder() {
        } 

        private Builder(IncidentEscalationStageStruct model) {
            this.contact = model.contact;
            this.cycleNotifyCount = model.cycleNotifyCount;
            this.cycleNotifyTime = model.cycleNotifyTime;
            this.description = model.description;
            this.effectTime = model.effectTime;
            this.name = model.name;
            this.stageIndex = model.stageIndex;
            this.timeZone = model.timeZone;
            this.waitToNextStageTime = model.waitToNextStageTime;
        } 

        /**
         * contact.
         */
        public Builder contact(java.util.List<IncidentContactStruct> contact) {
            this.contact = contact;
            return this;
        }

        /**
         * cycleNotifyCount.
         */
        public Builder cycleNotifyCount(Integer cycleNotifyCount) {
            this.cycleNotifyCount = cycleNotifyCount;
            return this;
        }

        /**
         * cycleNotifyTime.
         */
        public Builder cycleNotifyTime(Integer cycleNotifyTime) {
            this.cycleNotifyTime = cycleNotifyTime;
            return this;
        }

        /**
         * description.
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * effectTime.
         */
        public Builder effectTime(String effectTime) {
            this.effectTime = effectTime;
            return this;
        }

        /**
         * name.
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * stageIndex.
         */
        public Builder stageIndex(Integer stageIndex) {
            this.stageIndex = stageIndex;
            return this;
        }

        /**
         * timeZone.
         */
        public Builder timeZone(String timeZone) {
            this.timeZone = timeZone;
            return this;
        }

        /**
         * waitToNextStageTime.
         */
        public Builder waitToNextStageTime(Integer waitToNextStageTime) {
            this.waitToNextStageTime = waitToNextStageTime;
            return this;
        }

        public IncidentEscalationStageStruct build() {
            return new IncidentEscalationStageStruct(this);
        } 

    } 

}
