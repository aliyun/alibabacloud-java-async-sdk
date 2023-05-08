// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeSecurityStatInfoResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSecurityStatInfoResponseBody</p>
 */
public class DescribeSecurityStatInfoResponseBody extends TeaModel {
    @NameInMap("AttackEvent")
    private AttackEvent attackEvent;

    @NameInMap("HealthCheck")
    private HealthCheck healthCheck;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("SecurityEvent")
    private SecurityEvent securityEvent;

    @NameInMap("Success")
    private Boolean success;

    @NameInMap("Vulnerability")
    private Vulnerability vulnerability;

    private DescribeSecurityStatInfoResponseBody(Builder builder) {
        this.attackEvent = builder.attackEvent;
        this.healthCheck = builder.healthCheck;
        this.requestId = builder.requestId;
        this.securityEvent = builder.securityEvent;
        this.success = builder.success;
        this.vulnerability = builder.vulnerability;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSecurityStatInfoResponseBody create() {
        return builder().build();
    }

    /**
     * @return attackEvent
     */
    public AttackEvent getAttackEvent() {
        return this.attackEvent;
    }

    /**
     * @return healthCheck
     */
    public HealthCheck getHealthCheck() {
        return this.healthCheck;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return securityEvent
     */
    public SecurityEvent getSecurityEvent() {
        return this.securityEvent;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    /**
     * @return vulnerability
     */
    public Vulnerability getVulnerability() {
        return this.vulnerability;
    }

    public static final class Builder {
        private AttackEvent attackEvent; 
        private HealthCheck healthCheck; 
        private String requestId; 
        private SecurityEvent securityEvent; 
        private Boolean success; 
        private Vulnerability vulnerability; 

        /**
         * The numbers of baseline risk items that have the high-risk level at all points in time.
         */
        public Builder attackEvent(AttackEvent attackEvent) {
            this.attackEvent = attackEvent;
            return this;
        }

        /**
         * The number of **serious** alerts at each point in time.
         */
        public Builder healthCheck(HealthCheck healthCheck) {
            this.healthCheck = healthCheck;
            return this;
        }

        /**
         * The points in time when data of unfixed vulnerabilities is collected in the trend chart.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The risk levels of baseline risk items.
         */
        public Builder securityEvent(SecurityEvent securityEvent) {
            this.securityEvent = securityEvent;
            return this;
        }

        /**
         * The number of baseline risk items that have the medium-risk level at each point in time.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * The number of baseline risk items that have the low-risk level at each point in time.
         */
        public Builder vulnerability(Vulnerability vulnerability) {
            this.vulnerability = vulnerability;
            return this;
        }

        public DescribeSecurityStatInfoResponseBody build() {
            return new DescribeSecurityStatInfoResponseBody(this);
        } 

    } 

    public static class AttackEvent extends TeaModel {
        @NameInMap("DateArray")
        private java.util.List < String > dateArray;

        @NameInMap("TotalCount")
        private Integer totalCount;

        @NameInMap("ValueArray")
        private java.util.List < String > valueArray;

        private AttackEvent(Builder builder) {
            this.dateArray = builder.dateArray;
            this.totalCount = builder.totalCount;
            this.valueArray = builder.valueArray;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AttackEvent create() {
            return builder().build();
        }

        /**
         * @return dateArray
         */
        public java.util.List < String > getDateArray() {
            return this.dateArray;
        }

        /**
         * @return totalCount
         */
        public Integer getTotalCount() {
            return this.totalCount;
        }

        /**
         * @return valueArray
         */
        public java.util.List < String > getValueArray() {
            return this.valueArray;
        }

        public static final class Builder {
            private java.util.List < String > dateArray; 
            private Integer totalCount; 
            private java.util.List < String > valueArray; 

            /**
             * The total number of baseline risk items at all points in time.
             */
            public Builder dateArray(java.util.List < String > dateArray) {
                this.dateArray = dateArray;
                return this;
            }

            /**
             * The time periods during which data of the same alert is collected.
             */
            public Builder totalCount(Integer totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            /**
             * The number of **medium-risk** unfixed vulnerabilities on the current day.
             */
            public Builder valueArray(java.util.List < String > valueArray) {
                this.valueArray = valueArray;
                return this;
            }

            public AttackEvent build() {
                return new AttackEvent(this);
            } 

        } 

    }
    public static class HealthCheck extends TeaModel {
        @NameInMap("DateArray")
        private java.util.List < String > dateArray;

        @NameInMap("HighCount")
        private Integer highCount;

        @NameInMap("HighList")
        private java.util.List < String > highList;

        @NameInMap("LevelsOn")
        private java.util.List < String > levelsOn;

        @NameInMap("LowCount")
        private Integer lowCount;

        @NameInMap("LowList")
        private java.util.List < String > lowList;

        @NameInMap("MediumCount")
        private Integer mediumCount;

        @NameInMap("MediumList")
        private java.util.List < String > mediumList;

        @NameInMap("TimeArray")
        private java.util.List < String > timeArray;

        @NameInMap("TotalCount")
        private Integer totalCount;

        @NameInMap("ValueArray")
        private java.util.List < String > valueArray;

        private HealthCheck(Builder builder) {
            this.dateArray = builder.dateArray;
            this.highCount = builder.highCount;
            this.highList = builder.highList;
            this.levelsOn = builder.levelsOn;
            this.lowCount = builder.lowCount;
            this.lowList = builder.lowList;
            this.mediumCount = builder.mediumCount;
            this.mediumList = builder.mediumList;
            this.timeArray = builder.timeArray;
            this.totalCount = builder.totalCount;
            this.valueArray = builder.valueArray;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static HealthCheck create() {
            return builder().build();
        }

        /**
         * @return dateArray
         */
        public java.util.List < String > getDateArray() {
            return this.dateArray;
        }

        /**
         * @return highCount
         */
        public Integer getHighCount() {
            return this.highCount;
        }

        /**
         * @return highList
         */
        public java.util.List < String > getHighList() {
            return this.highList;
        }

        /**
         * @return levelsOn
         */
        public java.util.List < String > getLevelsOn() {
            return this.levelsOn;
        }

        /**
         * @return lowCount
         */
        public Integer getLowCount() {
            return this.lowCount;
        }

        /**
         * @return lowList
         */
        public java.util.List < String > getLowList() {
            return this.lowList;
        }

        /**
         * @return mediumCount
         */
        public Integer getMediumCount() {
            return this.mediumCount;
        }

        /**
         * @return mediumList
         */
        public java.util.List < String > getMediumList() {
            return this.mediumList;
        }

        /**
         * @return timeArray
         */
        public java.util.List < String > getTimeArray() {
            return this.timeArray;
        }

        /**
         * @return totalCount
         */
        public Integer getTotalCount() {
            return this.totalCount;
        }

        /**
         * @return valueArray
         */
        public java.util.List < String > getValueArray() {
            return this.valueArray;
        }

        public static final class Builder {
            private java.util.List < String > dateArray; 
            private Integer highCount; 
            private java.util.List < String > highList; 
            private java.util.List < String > levelsOn; 
            private Integer lowCount; 
            private java.util.List < String > lowList; 
            private Integer mediumCount; 
            private java.util.List < String > mediumList; 
            private java.util.List < String > timeArray; 
            private Integer totalCount; 
            private java.util.List < String > valueArray; 

            /**
             * The number of **medium-risk** unfixed vulnerabilities at each point in time.
             */
            public Builder dateArray(java.util.List < String > dateArray) {
                this.dateArray = dateArray;
                return this;
            }

            /**
             * The risk level of the unhandled alert. Valid values:
             * <p>
             * 
             * *   **remind**
             * *   **suspicious**
             * *   **serious**
             */
            public Builder highCount(Integer highCount) {
                this.highCount = highCount;
                return this;
            }

            /**
             * The point in time when data of unfixed vulnerabilities is collected in the trend chart.
             */
            public Builder highList(java.util.List < String > highList) {
                this.highList = highList;
                return this;
            }

            /**
             * The time periods during which data of baseline risk items is collected.
             */
            public Builder levelsOn(java.util.List < String > levelsOn) {
                this.levelsOn = levelsOn;
                return this;
            }

            /**
             * The total number of unhandled alerts on the current day.
             */
            public Builder lowCount(Integer lowCount) {
                this.lowCount = lowCount;
                return this;
            }

            /**
             * The numbers of suspicious alerts at all points in time.
             */
            public Builder lowList(java.util.List < String > lowList) {
                this.lowList = lowList;
                return this;
            }

            /**
             * The numbers of attacks at all points in time.
             */
            public Builder mediumCount(Integer mediumCount) {
                this.mediumCount = mediumCount;
                return this;
            }

            /**
             * The number of baseline risk items that have the high-risk level on the current day.
             */
            public Builder mediumList(java.util.List < String > mediumList) {
                this.mediumList = mediumList;
                return this;
            }

            /**
             * The risk level of the unfixed vulnerability. Valid values:
             * <p>
             * 
             * *   **asap**: high
             * *   **later**: medium
             * *   **Nntf**: low
             */
            public Builder timeArray(java.util.List < String > timeArray) {
                this.timeArray = timeArray;
                return this;
            }

            /**
             * The detailed statistics of attacks.
             */
            public Builder totalCount(Integer totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            /**
             * The numbers of baseline risk items that have the low-risk level at all points in time.
             */
            public Builder valueArray(java.util.List < String > valueArray) {
                this.valueArray = valueArray;
                return this;
            }

            public HealthCheck build() {
                return new HealthCheck(this);
            } 

        } 

    }
    public static class SecurityEvent extends TeaModel {
        @NameInMap("DateArray")
        private java.util.List < String > dateArray;

        @NameInMap("LevelsOn")
        private java.util.List < String > levelsOn;

        @NameInMap("RemindCount")
        private Integer remindCount;

        @NameInMap("RemindList")
        private java.util.List < String > remindList;

        @NameInMap("SeriousCount")
        private Integer seriousCount;

        @NameInMap("SeriousList")
        private java.util.List < String > seriousList;

        @NameInMap("SuspiciousCount")
        private Integer suspiciousCount;

        @NameInMap("SuspiciousList")
        private java.util.List < String > suspiciousList;

        @NameInMap("TimeArray")
        private java.util.List < String > timeArray;

        @NameInMap("TotalCount")
        private Integer totalCount;

        @NameInMap("ValueArray")
        private java.util.List < String > valueArray;

        private SecurityEvent(Builder builder) {
            this.dateArray = builder.dateArray;
            this.levelsOn = builder.levelsOn;
            this.remindCount = builder.remindCount;
            this.remindList = builder.remindList;
            this.seriousCount = builder.seriousCount;
            this.seriousList = builder.seriousList;
            this.suspiciousCount = builder.suspiciousCount;
            this.suspiciousList = builder.suspiciousList;
            this.timeArray = builder.timeArray;
            this.totalCount = builder.totalCount;
            this.valueArray = builder.valueArray;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SecurityEvent create() {
            return builder().build();
        }

        /**
         * @return dateArray
         */
        public java.util.List < String > getDateArray() {
            return this.dateArray;
        }

        /**
         * @return levelsOn
         */
        public java.util.List < String > getLevelsOn() {
            return this.levelsOn;
        }

        /**
         * @return remindCount
         */
        public Integer getRemindCount() {
            return this.remindCount;
        }

        /**
         * @return remindList
         */
        public java.util.List < String > getRemindList() {
            return this.remindList;
        }

        /**
         * @return seriousCount
         */
        public Integer getSeriousCount() {
            return this.seriousCount;
        }

        /**
         * @return seriousList
         */
        public java.util.List < String > getSeriousList() {
            return this.seriousList;
        }

        /**
         * @return suspiciousCount
         */
        public Integer getSuspiciousCount() {
            return this.suspiciousCount;
        }

        /**
         * @return suspiciousList
         */
        public java.util.List < String > getSuspiciousList() {
            return this.suspiciousList;
        }

        /**
         * @return timeArray
         */
        public java.util.List < String > getTimeArray() {
            return this.timeArray;
        }

        /**
         * @return totalCount
         */
        public Integer getTotalCount() {
            return this.totalCount;
        }

        /**
         * @return valueArray
         */
        public java.util.List < String > getValueArray() {
            return this.valueArray;
        }

        public static final class Builder {
            private java.util.List < String > dateArray; 
            private java.util.List < String > levelsOn; 
            private Integer remindCount; 
            private java.util.List < String > remindList; 
            private Integer seriousCount; 
            private java.util.List < String > seriousList; 
            private Integer suspiciousCount; 
            private java.util.List < String > suspiciousList; 
            private java.util.List < String > timeArray; 
            private Integer totalCount; 
            private java.util.List < String > valueArray; 

            /**
             * The numbers of high-risk unfixed vulnerabilities at all points in time.
             */
            public Builder dateArray(java.util.List < String > dateArray) {
                this.dateArray = dateArray;
                return this;
            }

            /**
             * The point in time when the number of attacks is collected in the trend chart.
             */
            public Builder levelsOn(java.util.List < String > levelsOn) {
                this.levelsOn = levelsOn;
                return this;
            }

            /**
             * The points in time when data of unhandled alerts is collected in the trend chart.
             */
            public Builder remindCount(Integer remindCount) {
                this.remindCount = remindCount;
                return this;
            }

            /**
             * The numbers of unhandled alerts at all points in time.
             */
            public Builder remindList(java.util.List < String > remindList) {
                this.remindList = remindList;
                return this;
            }

            /**
             * The language of the content within the request and response. Default value: **zh**. Valid values:
             * <p>
             * 
             * *   **zh**: Chinese
             * *   **en**: English
             */
            public Builder seriousCount(Integer seriousCount) {
                this.seriousCount = seriousCount;
                return this;
            }

            /**
             * The number of **low-risk** unfixed vulnerabilities on the current day.
             */
            public Builder seriousList(java.util.List < String > seriousList) {
                this.seriousList = seriousList;
                return this;
            }

            /**
             * The number of baseline risk items that have the high-risk level at each point in time.
             */
            public Builder suspiciousCount(Integer suspiciousCount) {
                this.suspiciousCount = suspiciousCount;
                return this;
            }

            /**
             * The number of **remind** alerts on the current day.
             */
            public Builder suspiciousList(java.util.List < String > suspiciousList) {
                this.suspiciousList = suspiciousList;
                return this;
            }

            /**
             * The numbers of medium-risk unfixed vulnerabilities at all points in time.
             */
            public Builder timeArray(java.util.List < String > timeArray) {
                this.timeArray = timeArray;
                return this;
            }

            /**
             * The number of baseline risk items that have the low-risk level on the current day.
             */
            public Builder totalCount(Integer totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            /**
             * The total number of unfixed vulnerabilities on the current day.
             */
            public Builder valueArray(java.util.List < String > valueArray) {
                this.valueArray = valueArray;
                return this;
            }

            public SecurityEvent build() {
                return new SecurityEvent(this);
            } 

        } 

    }
    public static class Vulnerability extends TeaModel {
        @NameInMap("AsapCount")
        private Integer asapCount;

        @NameInMap("AsapList")
        private java.util.List < String > asapList;

        @NameInMap("DateArray")
        private java.util.List < String > dateArray;

        @NameInMap("LaterCount")
        private Integer laterCount;

        @NameInMap("LaterList")
        private java.util.List < String > laterList;

        @NameInMap("LevelsOn")
        private java.util.List < String > levelsOn;

        @NameInMap("NntfCount")
        private Integer nntfCount;

        @NameInMap("NntfList")
        private java.util.List < String > nntfList;

        @NameInMap("TimeArray")
        private java.util.List < String > timeArray;

        @NameInMap("TotalCount")
        private Integer totalCount;

        @NameInMap("ValueArray")
        private java.util.List < String > valueArray;

        private Vulnerability(Builder builder) {
            this.asapCount = builder.asapCount;
            this.asapList = builder.asapList;
            this.dateArray = builder.dateArray;
            this.laterCount = builder.laterCount;
            this.laterList = builder.laterList;
            this.levelsOn = builder.levelsOn;
            this.nntfCount = builder.nntfCount;
            this.nntfList = builder.nntfList;
            this.timeArray = builder.timeArray;
            this.totalCount = builder.totalCount;
            this.valueArray = builder.valueArray;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Vulnerability create() {
            return builder().build();
        }

        /**
         * @return asapCount
         */
        public Integer getAsapCount() {
            return this.asapCount;
        }

        /**
         * @return asapList
         */
        public java.util.List < String > getAsapList() {
            return this.asapList;
        }

        /**
         * @return dateArray
         */
        public java.util.List < String > getDateArray() {
            return this.dateArray;
        }

        /**
         * @return laterCount
         */
        public Integer getLaterCount() {
            return this.laterCount;
        }

        /**
         * @return laterList
         */
        public java.util.List < String > getLaterList() {
            return this.laterList;
        }

        /**
         * @return levelsOn
         */
        public java.util.List < String > getLevelsOn() {
            return this.levelsOn;
        }

        /**
         * @return nntfCount
         */
        public Integer getNntfCount() {
            return this.nntfCount;
        }

        /**
         * @return nntfList
         */
        public java.util.List < String > getNntfList() {
            return this.nntfList;
        }

        /**
         * @return timeArray
         */
        public java.util.List < String > getTimeArray() {
            return this.timeArray;
        }

        /**
         * @return totalCount
         */
        public Integer getTotalCount() {
            return this.totalCount;
        }

        /**
         * @return valueArray
         */
        public java.util.List < String > getValueArray() {
            return this.valueArray;
        }

        public static final class Builder {
            private Integer asapCount; 
            private java.util.List < String > asapList; 
            private java.util.List < String > dateArray; 
            private Integer laterCount; 
            private java.util.List < String > laterList; 
            private java.util.List < String > levelsOn; 
            private Integer nntfCount; 
            private java.util.List < String > nntfList; 
            private java.util.List < String > timeArray; 
            private Integer totalCount; 
            private java.util.List < String > valueArray; 

            /**
             * The points in time when the number of attacks is collected in the trend chart.
             */
            public Builder asapCount(Integer asapCount) {
                this.asapCount = asapCount;
                return this;
            }

            /**
             * The risk levels of unhandled alerts.
             */
            public Builder asapList(java.util.List < String > asapList) {
                this.asapList = asapList;
                return this;
            }

            /**
             * The numbers of high-risk unfixed vulnerabilities at all points in time.
             */
            public Builder dateArray(java.util.List < String > dateArray) {
                this.dateArray = dateArray;
                return this;
            }

            /**
             * The number of **suspicious** alerts on the current day.
             */
            public Builder laterCount(Integer laterCount) {
                this.laterCount = laterCount;
                return this;
            }

            /**
             * LaterList.
             */
            public Builder laterList(java.util.List < String > laterList) {
                this.laterList = laterList;
                return this;
            }

            /**
             * The point in time when the number of attacks is collected in the trend chart.
             */
            public Builder levelsOn(java.util.List < String > levelsOn) {
                this.levelsOn = levelsOn;
                return this;
            }

            /**
             * The points in time when data of baseline risk items is collected in the trend chart.
             */
            public Builder nntfCount(Integer nntfCount) {
                this.nntfCount = nntfCount;
                return this;
            }

            /**
             * The time periods during which data of unfixed vulnerabilities is collected.
             */
            public Builder nntfList(java.util.List < String > nntfList) {
                this.nntfList = nntfList;
                return this;
            }

            /**
             * Queries the statistics of each security check item and the daily statistics in the trend chart based on each security check item.
             */
            public Builder timeArray(java.util.List < String > timeArray) {
                this.timeArray = timeArray;
                return this;
            }

            /**
             * The numbers of remind alerts at all points in time.
             */
            public Builder totalCount(Integer totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            /**
             * The ID of the request, which is used to locate and troubleshoot issues.
             */
            public Builder valueArray(java.util.List < String > valueArray) {
                this.valueArray = valueArray;
                return this;
            }

            public Vulnerability build() {
                return new Vulnerability(this);
            } 

        } 

    }
}
