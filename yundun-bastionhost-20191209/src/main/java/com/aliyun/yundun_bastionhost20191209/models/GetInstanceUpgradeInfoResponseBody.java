// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link GetInstanceUpgradeInfoResponseBody} extends {@link TeaModel}
 *
 * <p>GetInstanceUpgradeInfoResponseBody</p>
 */
public class GetInstanceUpgradeInfoResponseBody extends TeaModel {
    @NameInMap("InstanceUpgradeInfo")
    private InstanceUpgradeInfo instanceUpgradeInfo;

    @NameInMap("RequestId")
    private String requestId;


    private GetInstanceUpgradeInfoResponseBody(Builder builder) {
        this.instanceUpgradeInfo = builder.instanceUpgradeInfo;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetInstanceUpgradeInfoResponseBody create() {
        return builder().build();
    }

    /**
     * @return instanceUpgradeInfo
     */
    public InstanceUpgradeInfo getInstanceUpgradeInfo() {
        return this.instanceUpgradeInfo;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private InstanceUpgradeInfo instanceUpgradeInfo; 
        private String requestId; 

        /**
         * <p>InstanceUpgradeInfo.</p>
         */
        public Builder instanceUpgradeInfo(InstanceUpgradeInfo instanceUpgradeInfo) {
            this.instanceUpgradeInfo = instanceUpgradeInfo;
            return this;
        }

        /**
         * <p>RequestId.</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetInstanceUpgradeInfoResponseBody build() {
            return new GetInstanceUpgradeInfoResponseBody(this);
        } 

    } 

    public static class CandidatePeriodList extends TeaModel {
        @NameInMap("CandidateEndTime")
        private Long candidateEndTime;

        @NameInMap("CandidateStartTime")
        private Long candidateStartTime;


        private CandidatePeriodList(Builder builder) {
            this.candidateEndTime = builder.candidateEndTime;
            this.candidateStartTime = builder.candidateStartTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CandidatePeriodList create() {
            return builder().build();
        }

        /**
         * @return candidateEndTime
         */
        public Long getCandidateEndTime() {
            return this.candidateEndTime;
        }

        /**
         * @return candidateStartTime
         */
        public Long getCandidateStartTime() {
            return this.candidateStartTime;
        }

        public static final class Builder {
            private Long candidateEndTime; 
            private Long candidateStartTime; 

            /**
             * <p>CandidateEndTime.</p>
             */
            public Builder candidateEndTime(Long candidateEndTime) {
                this.candidateEndTime = candidateEndTime;
                return this;
            }

            /**
             * <p>CandidateStartTime.</p>
             */
            public Builder candidateStartTime(Long candidateStartTime) {
                this.candidateStartTime = candidateStartTime;
                return this;
            }

            public CandidatePeriodList build() {
                return new CandidatePeriodList(this);
            } 

        } 

    }
    public static class InvalidPeriodList extends TeaModel {
        @NameInMap("InvalidEndTime")
        private Long invalidEndTime;

        @NameInMap("InvalidStartTime")
        private Long invalidStartTime;


        private InvalidPeriodList(Builder builder) {
            this.invalidEndTime = builder.invalidEndTime;
            this.invalidStartTime = builder.invalidStartTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InvalidPeriodList create() {
            return builder().build();
        }

        /**
         * @return invalidEndTime
         */
        public Long getInvalidEndTime() {
            return this.invalidEndTime;
        }

        /**
         * @return invalidStartTime
         */
        public Long getInvalidStartTime() {
            return this.invalidStartTime;
        }

        public static final class Builder {
            private Long invalidEndTime; 
            private Long invalidStartTime; 

            /**
             * <p>InvalidEndTime.</p>
             */
            public Builder invalidEndTime(Long invalidEndTime) {
                this.invalidEndTime = invalidEndTime;
                return this;
            }

            /**
             * <p>InvalidStartTime.</p>
             */
            public Builder invalidStartTime(Long invalidStartTime) {
                this.invalidStartTime = invalidStartTime;
                return this;
            }

            public InvalidPeriodList build() {
                return new InvalidPeriodList(this);
            } 

        } 

    }
    public static class InstanceUpgradeInfo extends TeaModel {
        @NameInMap("AliUid")
        private Long aliUid;

        @NameInMap("CandidatePeriodList")
        private java.util.List < CandidatePeriodList> candidatePeriodList;

        @NameInMap("ImageVersion")
        private String imageVersion;

        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("InvalidPeriodList")
        private java.util.List < InvalidPeriodList> invalidPeriodList;

        @NameInMap("LatestStartTime")
        private Long latestStartTime;

        @NameInMap("Operable")
        private Boolean operable;

        @NameInMap("PeriodInterval")
        private Integer periodInterval;

        @NameInMap("UpgradeEndTime")
        private Long upgradeEndTime;

        @NameInMap("UpgradeMode")
        private String upgradeMode;

        @NameInMap("UpgradeStartTime")
        private Long upgradeStartTime;


        private InstanceUpgradeInfo(Builder builder) {
            this.aliUid = builder.aliUid;
            this.candidatePeriodList = builder.candidatePeriodList;
            this.imageVersion = builder.imageVersion;
            this.instanceId = builder.instanceId;
            this.invalidPeriodList = builder.invalidPeriodList;
            this.latestStartTime = builder.latestStartTime;
            this.operable = builder.operable;
            this.periodInterval = builder.periodInterval;
            this.upgradeEndTime = builder.upgradeEndTime;
            this.upgradeMode = builder.upgradeMode;
            this.upgradeStartTime = builder.upgradeStartTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InstanceUpgradeInfo create() {
            return builder().build();
        }

        /**
         * @return aliUid
         */
        public Long getAliUid() {
            return this.aliUid;
        }

        /**
         * @return candidatePeriodList
         */
        public java.util.List < CandidatePeriodList> getCandidatePeriodList() {
            return this.candidatePeriodList;
        }

        /**
         * @return imageVersion
         */
        public String getImageVersion() {
            return this.imageVersion;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return invalidPeriodList
         */
        public java.util.List < InvalidPeriodList> getInvalidPeriodList() {
            return this.invalidPeriodList;
        }

        /**
         * @return latestStartTime
         */
        public Long getLatestStartTime() {
            return this.latestStartTime;
        }

        /**
         * @return operable
         */
        public Boolean getOperable() {
            return this.operable;
        }

        /**
         * @return periodInterval
         */
        public Integer getPeriodInterval() {
            return this.periodInterval;
        }

        /**
         * @return upgradeEndTime
         */
        public Long getUpgradeEndTime() {
            return this.upgradeEndTime;
        }

        /**
         * @return upgradeMode
         */
        public String getUpgradeMode() {
            return this.upgradeMode;
        }

        /**
         * @return upgradeStartTime
         */
        public Long getUpgradeStartTime() {
            return this.upgradeStartTime;
        }

        public static final class Builder {
            private Long aliUid; 
            private java.util.List < CandidatePeriodList> candidatePeriodList; 
            private String imageVersion; 
            private String instanceId; 
            private java.util.List < InvalidPeriodList> invalidPeriodList; 
            private Long latestStartTime; 
            private Boolean operable; 
            private Integer periodInterval; 
            private Long upgradeEndTime; 
            private String upgradeMode; 
            private Long upgradeStartTime; 

            /**
             * <p>AliUid.</p>
             */
            public Builder aliUid(Long aliUid) {
                this.aliUid = aliUid;
                return this;
            }

            /**
             * <p>CandidatePeriodList.</p>
             */
            public Builder candidatePeriodList(java.util.List < CandidatePeriodList> candidatePeriodList) {
                this.candidatePeriodList = candidatePeriodList;
                return this;
            }

            /**
             * <p>ImageVersion.</p>
             */
            public Builder imageVersion(String imageVersion) {
                this.imageVersion = imageVersion;
                return this;
            }

            /**
             * <p>InstanceId.</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>InvalidPeriodList.</p>
             */
            public Builder invalidPeriodList(java.util.List < InvalidPeriodList> invalidPeriodList) {
                this.invalidPeriodList = invalidPeriodList;
                return this;
            }

            /**
             * <p>LatestStartTime.</p>
             */
            public Builder latestStartTime(Long latestStartTime) {
                this.latestStartTime = latestStartTime;
                return this;
            }

            /**
             * <p>Operable.</p>
             */
            public Builder operable(Boolean operable) {
                this.operable = operable;
                return this;
            }

            /**
             * <p>PeriodInterval.</p>
             */
            public Builder periodInterval(Integer periodInterval) {
                this.periodInterval = periodInterval;
                return this;
            }

            /**
             * <p>UpgradeEndTime.</p>
             */
            public Builder upgradeEndTime(Long upgradeEndTime) {
                this.upgradeEndTime = upgradeEndTime;
                return this;
            }

            /**
             * <p>UpgradeMode.</p>
             */
            public Builder upgradeMode(String upgradeMode) {
                this.upgradeMode = upgradeMode;
                return this;
            }

            /**
             * <p>UpgradeStartTime.</p>
             */
            public Builder upgradeStartTime(Long upgradeStartTime) {
                this.upgradeStartTime = upgradeStartTime;
                return this;
            }

            public InstanceUpgradeInfo build() {
                return new InstanceUpgradeInfo(this);
            } 

        } 

    }
}
