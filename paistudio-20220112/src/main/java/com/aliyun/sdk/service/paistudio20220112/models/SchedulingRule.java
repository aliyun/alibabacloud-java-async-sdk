// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paistudio20220112.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link SchedulingRule} extends {@link TeaModel}
 *
 * <p>SchedulingRule</p>
 */
public class SchedulingRule extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CronTab")
    private String cronTab;

    @com.aliyun.core.annotation.NameInMap("EndAt")
    private String endAt;

    @com.aliyun.core.annotation.NameInMap("ExecuteOnce")
    private Boolean executeOnce;

    @com.aliyun.core.annotation.NameInMap("StartAt")
    private String startAt;

    private SchedulingRule(Builder builder) {
        this.cronTab = builder.cronTab;
        this.endAt = builder.endAt;
        this.executeOnce = builder.executeOnce;
        this.startAt = builder.startAt;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SchedulingRule create() {
        return builder().build();
    }

    /**
     * @return cronTab
     */
    public String getCronTab() {
        return this.cronTab;
    }

    /**
     * @return endAt
     */
    public String getEndAt() {
        return this.endAt;
    }

    /**
     * @return executeOnce
     */
    public Boolean getExecuteOnce() {
        return this.executeOnce;
    }

    /**
     * @return startAt
     */
    public String getStartAt() {
        return this.startAt;
    }

    public static final class Builder {
        private String cronTab; 
        private String endAt; 
        private Boolean executeOnce; 
        private String startAt; 

        /**
         * CronTab.
         */
        public Builder cronTab(String cronTab) {
            this.cronTab = cronTab;
            return this;
        }

        /**
         * EndAt.
         */
        public Builder endAt(String endAt) {
            this.endAt = endAt;
            return this;
        }

        /**
         * ExecuteOnce.
         */
        public Builder executeOnce(Boolean executeOnce) {
            this.executeOnce = executeOnce;
            return this;
        }

        /**
         * StartAt.
         */
        public Builder startAt(String startAt) {
            this.startAt = startAt;
            return this;
        }

        public SchedulingRule build() {
            return new SchedulingRule(this);
        } 

    } 

}
