// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeLiveDomainStreamWaterLevelResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeLiveDomainStreamWaterLevelResponseBody</p>
 */
public class DescribeLiveDomainStreamWaterLevelResponseBody extends TeaModel {
    @NameInMap("LiveDomainWaterLevelList")
    private LiveDomainWaterLevelList liveDomainWaterLevelList;

    @NameInMap("LiveUidWaterLevel")
    private LiveUidWaterLevel liveUidWaterLevel;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeLiveDomainStreamWaterLevelResponseBody(Builder builder) {
        this.liveDomainWaterLevelList = builder.liveDomainWaterLevelList;
        this.liveUidWaterLevel = builder.liveUidWaterLevel;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeLiveDomainStreamWaterLevelResponseBody create() {
        return builder().build();
    }

    /**
     * @return liveDomainWaterLevelList
     */
    public LiveDomainWaterLevelList getLiveDomainWaterLevelList() {
        return this.liveDomainWaterLevelList;
    }

    /**
     * @return liveUidWaterLevel
     */
    public LiveUidWaterLevel getLiveUidWaterLevel() {
        return this.liveUidWaterLevel;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private LiveDomainWaterLevelList liveDomainWaterLevelList; 
        private LiveUidWaterLevel liveUidWaterLevel; 
        private String requestId; 

        /**
         * LiveDomainWaterLevelList.
         */
        public Builder liveDomainWaterLevelList(LiveDomainWaterLevelList liveDomainWaterLevelList) {
            this.liveDomainWaterLevelList = liveDomainWaterLevelList;
            return this;
        }

        /**
         * LiveUidWaterLevel.
         */
        public Builder liveUidWaterLevel(LiveUidWaterLevel liveUidWaterLevel) {
            this.liveUidWaterLevel = liveUidWaterLevel;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeLiveDomainStreamWaterLevelResponseBody build() {
            return new DescribeLiveDomainStreamWaterLevelResponseBody(this);
        } 

    } 

    public static class LiveDomainWaterLevel extends TeaModel {
        @NameInMap("DomainName")
        private String domainName;

        @NameInMap("DomainRawCount")
        private Integer domainRawCount;

        @NameInMap("DomainRawLimit")
        private Integer domainRawLimit;

        @NameInMap("DomainTranscodeCount")
        private Integer domainTranscodeCount;

        @NameInMap("DomainTranscodeLimit")
        private Integer domainTranscodeLimit;

        private LiveDomainWaterLevel(Builder builder) {
            this.domainName = builder.domainName;
            this.domainRawCount = builder.domainRawCount;
            this.domainRawLimit = builder.domainRawLimit;
            this.domainTranscodeCount = builder.domainTranscodeCount;
            this.domainTranscodeLimit = builder.domainTranscodeLimit;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LiveDomainWaterLevel create() {
            return builder().build();
        }

        /**
         * @return domainName
         */
        public String getDomainName() {
            return this.domainName;
        }

        /**
         * @return domainRawCount
         */
        public Integer getDomainRawCount() {
            return this.domainRawCount;
        }

        /**
         * @return domainRawLimit
         */
        public Integer getDomainRawLimit() {
            return this.domainRawLimit;
        }

        /**
         * @return domainTranscodeCount
         */
        public Integer getDomainTranscodeCount() {
            return this.domainTranscodeCount;
        }

        /**
         * @return domainTranscodeLimit
         */
        public Integer getDomainTranscodeLimit() {
            return this.domainTranscodeLimit;
        }

        public static final class Builder {
            private String domainName; 
            private Integer domainRawCount; 
            private Integer domainRawLimit; 
            private Integer domainTranscodeCount; 
            private Integer domainTranscodeLimit; 

            /**
             * DomainName.
             */
            public Builder domainName(String domainName) {
                this.domainName = domainName;
                return this;
            }

            /**
             * DomainRawCount.
             */
            public Builder domainRawCount(Integer domainRawCount) {
                this.domainRawCount = domainRawCount;
                return this;
            }

            /**
             * DomainRawLimit.
             */
            public Builder domainRawLimit(Integer domainRawLimit) {
                this.domainRawLimit = domainRawLimit;
                return this;
            }

            /**
             * DomainTranscodeCount.
             */
            public Builder domainTranscodeCount(Integer domainTranscodeCount) {
                this.domainTranscodeCount = domainTranscodeCount;
                return this;
            }

            /**
             * DomainTranscodeLimit.
             */
            public Builder domainTranscodeLimit(Integer domainTranscodeLimit) {
                this.domainTranscodeLimit = domainTranscodeLimit;
                return this;
            }

            public LiveDomainWaterLevel build() {
                return new LiveDomainWaterLevel(this);
            } 

        } 

    }
    public static class LiveDomainWaterLevelList extends TeaModel {
        @NameInMap("LiveDomainWaterLevel")
        private java.util.List < LiveDomainWaterLevel> liveDomainWaterLevel;

        private LiveDomainWaterLevelList(Builder builder) {
            this.liveDomainWaterLevel = builder.liveDomainWaterLevel;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LiveDomainWaterLevelList create() {
            return builder().build();
        }

        /**
         * @return liveDomainWaterLevel
         */
        public java.util.List < LiveDomainWaterLevel> getLiveDomainWaterLevel() {
            return this.liveDomainWaterLevel;
        }

        public static final class Builder {
            private java.util.List < LiveDomainWaterLevel> liveDomainWaterLevel; 

            /**
             * LiveDomainWaterLevel.
             */
            public Builder liveDomainWaterLevel(java.util.List < LiveDomainWaterLevel> liveDomainWaterLevel) {
                this.liveDomainWaterLevel = liveDomainWaterLevel;
                return this;
            }

            public LiveDomainWaterLevelList build() {
                return new LiveDomainWaterLevelList(this);
            } 

        } 

    }
    public static class LiveUidWaterLevel extends TeaModel {
        @NameInMap("AliUid")
        private String aliUid;

        @NameInMap("UidRawCount")
        private Integer uidRawCount;

        @NameInMap("UidRawLimit")
        private Integer uidRawLimit;

        @NameInMap("UidTranscodeCount")
        private Integer uidTranscodeCount;

        @NameInMap("UidTranscodeLimit")
        private Integer uidTranscodeLimit;

        private LiveUidWaterLevel(Builder builder) {
            this.aliUid = builder.aliUid;
            this.uidRawCount = builder.uidRawCount;
            this.uidRawLimit = builder.uidRawLimit;
            this.uidTranscodeCount = builder.uidTranscodeCount;
            this.uidTranscodeLimit = builder.uidTranscodeLimit;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LiveUidWaterLevel create() {
            return builder().build();
        }

        /**
         * @return aliUid
         */
        public String getAliUid() {
            return this.aliUid;
        }

        /**
         * @return uidRawCount
         */
        public Integer getUidRawCount() {
            return this.uidRawCount;
        }

        /**
         * @return uidRawLimit
         */
        public Integer getUidRawLimit() {
            return this.uidRawLimit;
        }

        /**
         * @return uidTranscodeCount
         */
        public Integer getUidTranscodeCount() {
            return this.uidTranscodeCount;
        }

        /**
         * @return uidTranscodeLimit
         */
        public Integer getUidTranscodeLimit() {
            return this.uidTranscodeLimit;
        }

        public static final class Builder {
            private String aliUid; 
            private Integer uidRawCount; 
            private Integer uidRawLimit; 
            private Integer uidTranscodeCount; 
            private Integer uidTranscodeLimit; 

            /**
             * AliUid.
             */
            public Builder aliUid(String aliUid) {
                this.aliUid = aliUid;
                return this;
            }

            /**
             * UidRawCount.
             */
            public Builder uidRawCount(Integer uidRawCount) {
                this.uidRawCount = uidRawCount;
                return this;
            }

            /**
             * UidRawLimit.
             */
            public Builder uidRawLimit(Integer uidRawLimit) {
                this.uidRawLimit = uidRawLimit;
                return this;
            }

            /**
             * UidTranscodeCount.
             */
            public Builder uidTranscodeCount(Integer uidTranscodeCount) {
                this.uidTranscodeCount = uidTranscodeCount;
                return this;
            }

            /**
             * UidTranscodeLimit.
             */
            public Builder uidTranscodeLimit(Integer uidTranscodeLimit) {
                this.uidTranscodeLimit = uidTranscodeLimit;
                return this;
            }

            public LiveUidWaterLevel build() {
                return new LiveUidWaterLevel(this);
            } 

        } 

    }
}
