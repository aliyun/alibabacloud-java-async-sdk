// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cmn20200825.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link TimePeriod} extends {@link TeaModel}
 *
 * <p>TimePeriod</p>
 */
public class TimePeriod extends TeaModel {
    @NameInMap("CronExpression")
    private String cronExpression;

    @NameInMap("GmtCreate")
    private String gmtCreate;

    @NameInMap("GmtModified")
    private String gmtModified;

    @NameInMap("Source")
    private String source;

    @NameInMap("TimePeriodDescription")
    private String timePeriodDescription;

    @NameInMap("TimePeriodId")
    private String timePeriodId;

    @NameInMap("TimePeriodName")
    private String timePeriodName;

    private TimePeriod(Builder builder) {
        this.cronExpression = builder.cronExpression;
        this.gmtCreate = builder.gmtCreate;
        this.gmtModified = builder.gmtModified;
        this.source = builder.source;
        this.timePeriodDescription = builder.timePeriodDescription;
        this.timePeriodId = builder.timePeriodId;
        this.timePeriodName = builder.timePeriodName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static TimePeriod create() {
        return builder().build();
    }

    /**
     * @return cronExpression
     */
    public String getCronExpression() {
        return this.cronExpression;
    }

    /**
     * @return gmtCreate
     */
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    /**
     * @return gmtModified
     */
    public String getGmtModified() {
        return this.gmtModified;
    }

    /**
     * @return source
     */
    public String getSource() {
        return this.source;
    }

    /**
     * @return timePeriodDescription
     */
    public String getTimePeriodDescription() {
        return this.timePeriodDescription;
    }

    /**
     * @return timePeriodId
     */
    public String getTimePeriodId() {
        return this.timePeriodId;
    }

    /**
     * @return timePeriodName
     */
    public String getTimePeriodName() {
        return this.timePeriodName;
    }

    public static final class Builder {
        private String cronExpression; 
        private String gmtCreate; 
        private String gmtModified; 
        private String source; 
        private String timePeriodDescription; 
        private String timePeriodId; 
        private String timePeriodName; 

        /**
         * CronExpression.
         */
        public Builder cronExpression(String cronExpression) {
            this.cronExpression = cronExpression;
            return this;
        }

        /**
         * GmtCreate.
         */
        public Builder gmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }

        /**
         * GmtModified.
         */
        public Builder gmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }

        /**
         * Source.
         */
        public Builder source(String source) {
            this.source = source;
            return this;
        }

        /**
         * TimePeriodDescription.
         */
        public Builder timePeriodDescription(String timePeriodDescription) {
            this.timePeriodDescription = timePeriodDescription;
            return this;
        }

        /**
         * TimePeriodId.
         */
        public Builder timePeriodId(String timePeriodId) {
            this.timePeriodId = timePeriodId;
            return this;
        }

        /**
         * TimePeriodName.
         */
        public Builder timePeriodName(String timePeriodName) {
            this.timePeriodName = timePeriodName;
            return this;
        }

        public TimePeriod build() {
            return new TimePeriod(this);
        } 

    } 

}
