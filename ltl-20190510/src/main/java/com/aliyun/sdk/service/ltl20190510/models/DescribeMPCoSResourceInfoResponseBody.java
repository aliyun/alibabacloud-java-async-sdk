// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ltl20190510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeMPCoSResourceInfoResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeMPCoSResourceInfoResponseBody</p>
 */
public class DescribeMPCoSResourceInfoResponseBody extends TeaModel {
    @NameInMap("Code")
    private Integer code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private DescribeMPCoSResourceInfoResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeMPCoSResourceInfoResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public Integer getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private Integer code; 
        private Data data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        /**
         * Code.
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public DescribeMPCoSResourceInfoResponseBody build() {
            return new DescribeMPCoSResourceInfoResponseBody(this);
        } 

    } 

    public static class PhaseQuotaInfoList extends TeaModel {
        @NameInMap("PhaseGroupId")
        private String phaseGroupId;

        @NameInMap("PhaseGroupName")
        private String phaseGroupName;

        @NameInMap("PhaseQuota")
        private Long phaseQuota;

        @NameInMap("UsedPhase")
        private Long usedPhase;

        private PhaseQuotaInfoList(Builder builder) {
            this.phaseGroupId = builder.phaseGroupId;
            this.phaseGroupName = builder.phaseGroupName;
            this.phaseQuota = builder.phaseQuota;
            this.usedPhase = builder.usedPhase;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PhaseQuotaInfoList create() {
            return builder().build();
        }

        /**
         * @return phaseGroupId
         */
        public String getPhaseGroupId() {
            return this.phaseGroupId;
        }

        /**
         * @return phaseGroupName
         */
        public String getPhaseGroupName() {
            return this.phaseGroupName;
        }

        /**
         * @return phaseQuota
         */
        public Long getPhaseQuota() {
            return this.phaseQuota;
        }

        /**
         * @return usedPhase
         */
        public Long getUsedPhase() {
            return this.usedPhase;
        }

        public static final class Builder {
            private String phaseGroupId; 
            private String phaseGroupName; 
            private Long phaseQuota; 
            private Long usedPhase; 

            /**
             * PhaseGroupId.
             */
            public Builder phaseGroupId(String phaseGroupId) {
                this.phaseGroupId = phaseGroupId;
                return this;
            }

            /**
             * PhaseGroupName.
             */
            public Builder phaseGroupName(String phaseGroupName) {
                this.phaseGroupName = phaseGroupName;
                return this;
            }

            /**
             * PhaseQuota.
             */
            public Builder phaseQuota(Long phaseQuota) {
                this.phaseQuota = phaseQuota;
                return this;
            }

            /**
             * UsedPhase.
             */
            public Builder usedPhase(Long usedPhase) {
                this.usedPhase = usedPhase;
                return this;
            }

            public PhaseQuotaInfoList build() {
                return new PhaseQuotaInfoList(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("MemberQuota")
        private Long memberQuota;

        @NameInMap("PhaseGroupQuota")
        private Long phaseGroupQuota;

        @NameInMap("PhaseQuotaInfoList")
        private java.util.List < PhaseQuotaInfoList> phaseQuotaInfoList;

        @NameInMap("UsedMember")
        private Long usedMember;

        @NameInMap("UsedPhaseGroup")
        private Long usedPhaseGroup;

        private Data(Builder builder) {
            this.memberQuota = builder.memberQuota;
            this.phaseGroupQuota = builder.phaseGroupQuota;
            this.phaseQuotaInfoList = builder.phaseQuotaInfoList;
            this.usedMember = builder.usedMember;
            this.usedPhaseGroup = builder.usedPhaseGroup;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return memberQuota
         */
        public Long getMemberQuota() {
            return this.memberQuota;
        }

        /**
         * @return phaseGroupQuota
         */
        public Long getPhaseGroupQuota() {
            return this.phaseGroupQuota;
        }

        /**
         * @return phaseQuotaInfoList
         */
        public java.util.List < PhaseQuotaInfoList> getPhaseQuotaInfoList() {
            return this.phaseQuotaInfoList;
        }

        /**
         * @return usedMember
         */
        public Long getUsedMember() {
            return this.usedMember;
        }

        /**
         * @return usedPhaseGroup
         */
        public Long getUsedPhaseGroup() {
            return this.usedPhaseGroup;
        }

        public static final class Builder {
            private Long memberQuota; 
            private Long phaseGroupQuota; 
            private java.util.List < PhaseQuotaInfoList> phaseQuotaInfoList; 
            private Long usedMember; 
            private Long usedPhaseGroup; 

            /**
             * MemberQuota.
             */
            public Builder memberQuota(Long memberQuota) {
                this.memberQuota = memberQuota;
                return this;
            }

            /**
             * PhaseGroupQuota.
             */
            public Builder phaseGroupQuota(Long phaseGroupQuota) {
                this.phaseGroupQuota = phaseGroupQuota;
                return this;
            }

            /**
             * PhaseQuotaInfoList.
             */
            public Builder phaseQuotaInfoList(java.util.List < PhaseQuotaInfoList> phaseQuotaInfoList) {
                this.phaseQuotaInfoList = phaseQuotaInfoList;
                return this;
            }

            /**
             * UsedMember.
             */
            public Builder usedMember(Long usedMember) {
                this.usedMember = usedMember;
                return this;
            }

            /**
             * UsedPhaseGroup.
             */
            public Builder usedPhaseGroup(Long usedPhaseGroup) {
                this.usedPhaseGroup = usedPhaseGroup;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
