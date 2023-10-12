// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cmn20200825.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AlarmOverview} extends {@link TeaModel}
 *
 * <p>AlarmOverview</p>
 */
public class AlarmOverview extends TeaModel {
    @NameInMap("AlarmOverviewId")
    private String alarmOverviewId;

    @NameInMap("AlarmOverviewName")
    private String alarmOverviewName;

    @NameInMap("ConditionList")
    private java.util.List < ConditionList> conditionList;

    @NameInMap("SerialNumber")
    private Integer serialNumber;

    private AlarmOverview(Builder builder) {
        this.alarmOverviewId = builder.alarmOverviewId;
        this.alarmOverviewName = builder.alarmOverviewName;
        this.conditionList = builder.conditionList;
        this.serialNumber = builder.serialNumber;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AlarmOverview create() {
        return builder().build();
    }

    /**
     * @return alarmOverviewId
     */
    public String getAlarmOverviewId() {
        return this.alarmOverviewId;
    }

    /**
     * @return alarmOverviewName
     */
    public String getAlarmOverviewName() {
        return this.alarmOverviewName;
    }

    /**
     * @return conditionList
     */
    public java.util.List < ConditionList> getConditionList() {
        return this.conditionList;
    }

    /**
     * @return serialNumber
     */
    public Integer getSerialNumber() {
        return this.serialNumber;
    }

    public static final class Builder {
        private String alarmOverviewId; 
        private String alarmOverviewName; 
        private java.util.List < ConditionList> conditionList; 
        private Integer serialNumber; 

        /**
         * AlarmOverviewId.
         */
        public Builder alarmOverviewId(String alarmOverviewId) {
            this.alarmOverviewId = alarmOverviewId;
            return this;
        }

        /**
         * AlarmOverviewName.
         */
        public Builder alarmOverviewName(String alarmOverviewName) {
            this.alarmOverviewName = alarmOverviewName;
            return this;
        }

        /**
         * ConditionList.
         */
        public Builder conditionList(java.util.List < ConditionList> conditionList) {
            this.conditionList = conditionList;
            return this;
        }

        /**
         * SerialNumber.
         */
        public Builder serialNumber(Integer serialNumber) {
            this.serialNumber = serialNumber;
            return this;
        }

        public AlarmOverview build() {
            return new AlarmOverview(this);
        } 

    } 

    public static class ConditionList extends TeaModel {
        @NameInMap("ConditionName")
        private String conditionName;

        @NameInMap("ConditionValue")
        private String conditionValue;

        private ConditionList(Builder builder) {
            this.conditionName = builder.conditionName;
            this.conditionValue = builder.conditionValue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ConditionList create() {
            return builder().build();
        }

        /**
         * @return conditionName
         */
        public String getConditionName() {
            return this.conditionName;
        }

        /**
         * @return conditionValue
         */
        public String getConditionValue() {
            return this.conditionValue;
        }

        public static final class Builder {
            private String conditionName; 
            private String conditionValue; 

            /**
             * ConditionName.
             */
            public Builder conditionName(String conditionName) {
                this.conditionName = conditionName;
                return this;
            }

            /**
             * ConditionValue.
             */
            public Builder conditionValue(String conditionValue) {
                this.conditionValue = conditionValue;
                return this;
            }

            public ConditionList build() {
                return new ConditionList(this);
            } 

        } 

    }
}
