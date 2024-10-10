// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeSecurityStatInfoResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSecurityStatInfoResponseBody</p>
 */
public class DescribeSecurityStatInfoResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AttackEvent")
    private AttackEvent attackEvent;

    @com.aliyun.core.annotation.NameInMap("HealthCheck")
    private HealthCheck healthCheck;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SecurityEvent")
    private SecurityEvent securityEvent;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("Vulnerability")
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
         * <p>The detailed statistics of attacks.</p>
         */
        public Builder attackEvent(AttackEvent attackEvent) {
            this.attackEvent = attackEvent;
            return this;
        }

        /**
         * <p>The detailed statistics of baseline risk items.</p>
         */
        public Builder healthCheck(HealthCheck healthCheck) {
            this.healthCheck = healthCheck;
            return this;
        }

        /**
         * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>A3E61730-85E2-4789-8017-B9B1B70F0568</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The detailed statistics of unhandled alerts.</p>
         */
        public Builder securityEvent(SecurityEvent securityEvent) {
            this.securityEvent = securityEvent;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: The request was successful.</li>
         * <li><strong>false</strong>: The request failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * <p>The detailed statistics of unfixed vulnerabilities.</p>
         */
        public Builder vulnerability(Vulnerability vulnerability) {
            this.vulnerability = vulnerability;
            return this;
        }

        public DescribeSecurityStatInfoResponseBody build() {
            return new DescribeSecurityStatInfoResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeSecurityStatInfoResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSecurityStatInfoResponseBody</p>
     */
    public static class AttackEvent extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DateArray")
        private java.util.List < String > dateArray;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Integer totalCount;

        @com.aliyun.core.annotation.NameInMap("ValueArray")
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
             * <p>The points in time when the number of attacks is collected in the trend chart.</p>
             */
            public Builder dateArray(java.util.List < String > dateArray) {
                this.dateArray = dateArray;
                return this;
            }

            /**
             * <p>The total number of attacks on the current day.</p>
             * 
             * <strong>example:</strong>
             * <p>1096</p>
             */
            public Builder totalCount(Integer totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            /**
             * <p>The numbers of attacks at all points in time.</p>
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
    /**
     * 
     * {@link DescribeSecurityStatInfoResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSecurityStatInfoResponseBody</p>
     */
    public static class HealthCheck extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DateArray")
        private java.util.List < String > dateArray;

        @com.aliyun.core.annotation.NameInMap("HighCount")
        private Integer highCount;

        @com.aliyun.core.annotation.NameInMap("HighList")
        private java.util.List < String > highList;

        @com.aliyun.core.annotation.NameInMap("LevelsOn")
        private java.util.List < String > levelsOn;

        @com.aliyun.core.annotation.NameInMap("LowCount")
        private Integer lowCount;

        @com.aliyun.core.annotation.NameInMap("LowList")
        private java.util.List < String > lowList;

        @com.aliyun.core.annotation.NameInMap("MediumCount")
        private Integer mediumCount;

        @com.aliyun.core.annotation.NameInMap("MediumList")
        private java.util.List < String > mediumList;

        @com.aliyun.core.annotation.NameInMap("TimeArray")
        private java.util.List < String > timeArray;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Integer totalCount;

        @com.aliyun.core.annotation.NameInMap("ValueArray")
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
             * <p>The points in time when data of baseline risk items is collected in the trend chart.</p>
             */
            public Builder dateArray(java.util.List < String > dateArray) {
                this.dateArray = dateArray;
                return this;
            }

            /**
             * <p>The number of baseline risk items that have the high-risk level on the current day.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder highCount(Integer highCount) {
                this.highCount = highCount;
                return this;
            }

            /**
             * <p>The numbers of baseline risk items that have the high-risk level at all points in time.</p>
             */
            public Builder highList(java.util.List < String > highList) {
                this.highList = highList;
                return this;
            }

            /**
             * <p>The risk levels of baseline risk items.</p>
             */
            public Builder levelsOn(java.util.List < String > levelsOn) {
                this.levelsOn = levelsOn;
                return this;
            }

            /**
             * <p>The number of baseline risk items that have the low-risk level on the current day.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder lowCount(Integer lowCount) {
                this.lowCount = lowCount;
                return this;
            }

            /**
             * <p>The numbers of baseline risk items that have the low-risk level at all points in time.</p>
             */
            public Builder lowList(java.util.List < String > lowList) {
                this.lowList = lowList;
                return this;
            }

            /**
             * <p>The number of baseline risk items that have the medium-risk level on the current day.</p>
             * 
             * <strong>example:</strong>
             * <p>21</p>
             */
            public Builder mediumCount(Integer mediumCount) {
                this.mediumCount = mediumCount;
                return this;
            }

            /**
             * <p>The numbers of baseline risk items that have the medium-risk level at all points in time.</p>
             */
            public Builder mediumList(java.util.List < String > mediumList) {
                this.mediumList = mediumList;
                return this;
            }

            /**
             * <p>The time periods during which data of baseline risk items is collected.</p>
             */
            public Builder timeArray(java.util.List < String > timeArray) {
                this.timeArray = timeArray;
                return this;
            }

            /**
             * <p>The total number of baseline risk items on the current day.</p>
             * 
             * <strong>example:</strong>
             * <p>32</p>
             */
            public Builder totalCount(Integer totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            /**
             * <p>The total number of baseline risk items at all points in time.</p>
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
    /**
     * 
     * {@link DescribeSecurityStatInfoResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSecurityStatInfoResponseBody</p>
     */
    public static class SecurityEvent extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DateArray")
        private java.util.List < String > dateArray;

        @com.aliyun.core.annotation.NameInMap("LevelsOn")
        private java.util.List < String > levelsOn;

        @com.aliyun.core.annotation.NameInMap("RemindCount")
        private Integer remindCount;

        @com.aliyun.core.annotation.NameInMap("RemindList")
        private java.util.List < String > remindList;

        @com.aliyun.core.annotation.NameInMap("SeriousCount")
        private Integer seriousCount;

        @com.aliyun.core.annotation.NameInMap("SeriousList")
        private java.util.List < String > seriousList;

        @com.aliyun.core.annotation.NameInMap("SuspiciousCount")
        private Integer suspiciousCount;

        @com.aliyun.core.annotation.NameInMap("SuspiciousList")
        private java.util.List < String > suspiciousList;

        @com.aliyun.core.annotation.NameInMap("TimeArray")
        private java.util.List < String > timeArray;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Integer totalCount;

        @com.aliyun.core.annotation.NameInMap("ValueArray")
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
             * <p>The points in time when data of unhandled alerts is collected in the trend chart.</p>
             */
            public Builder dateArray(java.util.List < String > dateArray) {
                this.dateArray = dateArray;
                return this;
            }

            /**
             * <p>The risk levels of unhandled alerts.</p>
             */
            public Builder levelsOn(java.util.List < String > levelsOn) {
                this.levelsOn = levelsOn;
                return this;
            }

            /**
             * <p>The number of <strong>remind</strong> alerts on the current day.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder remindCount(Integer remindCount) {
                this.remindCount = remindCount;
                return this;
            }

            /**
             * <p>The numbers of remind alerts at all points in time.</p>
             */
            public Builder remindList(java.util.List < String > remindList) {
                this.remindList = remindList;
                return this;
            }

            /**
             * <p>The number of <strong>serious</strong> alerts on the current day.</p>
             * 
             * <strong>example:</strong>
             * <p>404</p>
             */
            public Builder seriousCount(Integer seriousCount) {
                this.seriousCount = seriousCount;
                return this;
            }

            /**
             * <p>The numbers of serious alerts at all points in time.</p>
             */
            public Builder seriousList(java.util.List < String > seriousList) {
                this.seriousList = seriousList;
                return this;
            }

            /**
             * <p>The number of <strong>suspicious</strong> alerts on the current day.</p>
             * 
             * <strong>example:</strong>
             * <p>148</p>
             */
            public Builder suspiciousCount(Integer suspiciousCount) {
                this.suspiciousCount = suspiciousCount;
                return this;
            }

            /**
             * <p>The numbers of suspicious alerts at all points in time.</p>
             */
            public Builder suspiciousList(java.util.List < String > suspiciousList) {
                this.suspiciousList = suspiciousList;
                return this;
            }

            /**
             * <p>The time periods during which data of the same alert is collected.</p>
             */
            public Builder timeArray(java.util.List < String > timeArray) {
                this.timeArray = timeArray;
                return this;
            }

            /**
             * <p>The total number of unhandled alerts on the current day.</p>
             * 
             * <strong>example:</strong>
             * <p>552</p>
             */
            public Builder totalCount(Integer totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            /**
             * <p>The numbers of unhandled alerts at all points in time.</p>
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
    /**
     * 
     * {@link DescribeSecurityStatInfoResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSecurityStatInfoResponseBody</p>
     */
    public static class Vulnerability extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AsapCount")
        private Integer asapCount;

        @com.aliyun.core.annotation.NameInMap("AsapList")
        private java.util.List < String > asapList;

        @com.aliyun.core.annotation.NameInMap("DateArray")
        private java.util.List < String > dateArray;

        @com.aliyun.core.annotation.NameInMap("LaterCount")
        private Integer laterCount;

        @com.aliyun.core.annotation.NameInMap("LaterList")
        private java.util.List < String > laterList;

        @com.aliyun.core.annotation.NameInMap("LevelsOn")
        private java.util.List < String > levelsOn;

        @com.aliyun.core.annotation.NameInMap("NntfCount")
        private Integer nntfCount;

        @com.aliyun.core.annotation.NameInMap("NntfList")
        private java.util.List < String > nntfList;

        @com.aliyun.core.annotation.NameInMap("TimeArray")
        private java.util.List < String > timeArray;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Integer totalCount;

        @com.aliyun.core.annotation.NameInMap("ValueArray")
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
             * <p>The number of <strong>high-risk</strong> unfixed vulnerabilities on the current day.</p>
             * 
             * <strong>example:</strong>
             * <p>109</p>
             */
            public Builder asapCount(Integer asapCount) {
                this.asapCount = asapCount;
                return this;
            }

            /**
             * <p>The numbers of high-risk unfixed vulnerabilities at all points in time.</p>
             */
            public Builder asapList(java.util.List < String > asapList) {
                this.asapList = asapList;
                return this;
            }

            /**
             * <p>The points in time when data of unfixed vulnerabilities is collected in the trend chart.</p>
             */
            public Builder dateArray(java.util.List < String > dateArray) {
                this.dateArray = dateArray;
                return this;
            }

            /**
             * <p>The number of <strong>medium-risk</strong> unfixed vulnerabilities on the current day.</p>
             * 
             * <strong>example:</strong>
             * <p>275</p>
             */
            public Builder laterCount(Integer laterCount) {
                this.laterCount = laterCount;
                return this;
            }

            /**
             * <p>The numbers of medium-risk unfixed vulnerabilities at all points in time.</p>
             */
            public Builder laterList(java.util.List < String > laterList) {
                this.laterList = laterList;
                return this;
            }

            /**
             * <p>The risk levels of unfixed vulnerabilities.</p>
             */
            public Builder levelsOn(java.util.List < String > levelsOn) {
                this.levelsOn = levelsOn;
                return this;
            }

            /**
             * <p>The number of <strong>low-risk</strong> unfixed vulnerabilities on the current day.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder nntfCount(Integer nntfCount) {
                this.nntfCount = nntfCount;
                return this;
            }

            /**
             * <p>The numbers of low-risk unfixed vulnerabilities at all points in time.</p>
             */
            public Builder nntfList(java.util.List < String > nntfList) {
                this.nntfList = nntfList;
                return this;
            }

            /**
             * <p>The time periods during which data of unfixed vulnerabilities is collected.</p>
             */
            public Builder timeArray(java.util.List < String > timeArray) {
                this.timeArray = timeArray;
                return this;
            }

            /**
             * <p>The total number of unfixed vulnerabilities on the current day.</p>
             * 
             * <strong>example:</strong>
             * <p>384</p>
             */
            public Builder totalCount(Integer totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            /**
             * <p>The numbers of unfixed vulnerabilities at all points in time.</p>
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
