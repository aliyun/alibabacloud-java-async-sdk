// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ledgerdb20191122.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeLedgersResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeLedgersResponseBody</p>
 */
public class DescribeLedgersResponseBody extends TeaModel {
    @NameInMap("Ledgers")
    private java.util.List < Ledgers> ledgers;

    @NameInMap("MaxResults")
    private Integer maxResults;

    @NameInMap("NextToken")
    private String nextToken;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeLedgersResponseBody(Builder builder) {
        this.ledgers = builder.ledgers;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeLedgersResponseBody create() {
        return builder().build();
    }

    /**
     * @return ledgers
     */
    public java.util.List < Ledgers> getLedgers() {
        return this.ledgers;
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < Ledgers> ledgers; 
        private Integer maxResults; 
        private String nextToken; 
        private String requestId; 

        /**
         * Ledgers.
         */
        public Builder ledgers(java.util.List < Ledgers> ledgers) {
            this.ledgers = ledgers;
            return this;
        }

        /**
         * MaxResults.
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeLedgersResponseBody build() {
            return new DescribeLedgersResponseBody(this);
        } 

    } 

    public static class LastTimeAnchor extends TeaModel {
        @NameInMap("JournalId")
        private String journalId;

        @NameInMap("LedgerDigest")
        private String ledgerDigest;

        @NameInMap("LedgerDigestType")
        private String ledgerDigestType;

        @NameInMap("LedgerVersion")
        private String ledgerVersion;

        @NameInMap("Proof")
        private String proof;

        @NameInMap("TimeStamp")
        private String timeStamp;

        private LastTimeAnchor(Builder builder) {
            this.journalId = builder.journalId;
            this.ledgerDigest = builder.ledgerDigest;
            this.ledgerDigestType = builder.ledgerDigestType;
            this.ledgerVersion = builder.ledgerVersion;
            this.proof = builder.proof;
            this.timeStamp = builder.timeStamp;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LastTimeAnchor create() {
            return builder().build();
        }

        /**
         * @return journalId
         */
        public String getJournalId() {
            return this.journalId;
        }

        /**
         * @return ledgerDigest
         */
        public String getLedgerDigest() {
            return this.ledgerDigest;
        }

        /**
         * @return ledgerDigestType
         */
        public String getLedgerDigestType() {
            return this.ledgerDigestType;
        }

        /**
         * @return ledgerVersion
         */
        public String getLedgerVersion() {
            return this.ledgerVersion;
        }

        /**
         * @return proof
         */
        public String getProof() {
            return this.proof;
        }

        /**
         * @return timeStamp
         */
        public String getTimeStamp() {
            return this.timeStamp;
        }

        public static final class Builder {
            private String journalId; 
            private String ledgerDigest; 
            private String ledgerDigestType; 
            private String ledgerVersion; 
            private String proof; 
            private String timeStamp; 

            /**
             * JournalId.
             */
            public Builder journalId(String journalId) {
                this.journalId = journalId;
                return this;
            }

            /**
             * LedgerDigest.
             */
            public Builder ledgerDigest(String ledgerDigest) {
                this.ledgerDigest = ledgerDigest;
                return this;
            }

            /**
             * LedgerDigestType.
             */
            public Builder ledgerDigestType(String ledgerDigestType) {
                this.ledgerDigestType = ledgerDigestType;
                return this;
            }

            /**
             * LedgerVersion.
             */
            public Builder ledgerVersion(String ledgerVersion) {
                this.ledgerVersion = ledgerVersion;
                return this;
            }

            /**
             * Proof.
             */
            public Builder proof(String proof) {
                this.proof = proof;
                return this;
            }

            /**
             * TimeStamp.
             */
            public Builder timeStamp(String timeStamp) {
                this.timeStamp = timeStamp;
                return this;
            }

            public LastTimeAnchor build() {
                return new LastTimeAnchor(this);
            } 

        } 

    }
    public static class Ledgers extends TeaModel {
        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("JournalCount")
        private Long journalCount;

        @NameInMap("LastTimeAnchor")
        private LastTimeAnchor lastTimeAnchor;

        @NameInMap("LedgerDescription")
        private String ledgerDescription;

        @NameInMap("LedgerId")
        private String ledgerId;

        @NameInMap("LedgerName")
        private String ledgerName;

        @NameInMap("LedgerStatus")
        private String ledgerStatus;

        @NameInMap("LedgerType")
        private String ledgerType;

        @NameInMap("MemberCount")
        private Long memberCount;

        @NameInMap("OwnerAliUid")
        private String ownerAliUid;

        @NameInMap("RegionId")
        private String regionId;

        @NameInMap("StorageClass")
        private String storageClass;

        @NameInMap("TimeAnchorCount")
        private Long timeAnchorCount;

        @NameInMap("UpdateTime")
        private String updateTime;

        @NameInMap("ZoneId")
        private String zoneId;

        private Ledgers(Builder builder) {
            this.createTime = builder.createTime;
            this.journalCount = builder.journalCount;
            this.lastTimeAnchor = builder.lastTimeAnchor;
            this.ledgerDescription = builder.ledgerDescription;
            this.ledgerId = builder.ledgerId;
            this.ledgerName = builder.ledgerName;
            this.ledgerStatus = builder.ledgerStatus;
            this.ledgerType = builder.ledgerType;
            this.memberCount = builder.memberCount;
            this.ownerAliUid = builder.ownerAliUid;
            this.regionId = builder.regionId;
            this.storageClass = builder.storageClass;
            this.timeAnchorCount = builder.timeAnchorCount;
            this.updateTime = builder.updateTime;
            this.zoneId = builder.zoneId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Ledgers create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return journalCount
         */
        public Long getJournalCount() {
            return this.journalCount;
        }

        /**
         * @return lastTimeAnchor
         */
        public LastTimeAnchor getLastTimeAnchor() {
            return this.lastTimeAnchor;
        }

        /**
         * @return ledgerDescription
         */
        public String getLedgerDescription() {
            return this.ledgerDescription;
        }

        /**
         * @return ledgerId
         */
        public String getLedgerId() {
            return this.ledgerId;
        }

        /**
         * @return ledgerName
         */
        public String getLedgerName() {
            return this.ledgerName;
        }

        /**
         * @return ledgerStatus
         */
        public String getLedgerStatus() {
            return this.ledgerStatus;
        }

        /**
         * @return ledgerType
         */
        public String getLedgerType() {
            return this.ledgerType;
        }

        /**
         * @return memberCount
         */
        public Long getMemberCount() {
            return this.memberCount;
        }

        /**
         * @return ownerAliUid
         */
        public String getOwnerAliUid() {
            return this.ownerAliUid;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return storageClass
         */
        public String getStorageClass() {
            return this.storageClass;
        }

        /**
         * @return timeAnchorCount
         */
        public Long getTimeAnchorCount() {
            return this.timeAnchorCount;
        }

        /**
         * @return updateTime
         */
        public String getUpdateTime() {
            return this.updateTime;
        }

        /**
         * @return zoneId
         */
        public String getZoneId() {
            return this.zoneId;
        }

        public static final class Builder {
            private String createTime; 
            private Long journalCount; 
            private LastTimeAnchor lastTimeAnchor; 
            private String ledgerDescription; 
            private String ledgerId; 
            private String ledgerName; 
            private String ledgerStatus; 
            private String ledgerType; 
            private Long memberCount; 
            private String ownerAliUid; 
            private String regionId; 
            private String storageClass; 
            private Long timeAnchorCount; 
            private String updateTime; 
            private String zoneId; 

            /**
             * CreateTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * JournalCount.
             */
            public Builder journalCount(Long journalCount) {
                this.journalCount = journalCount;
                return this;
            }

            /**
             * LastTimeAnchor.
             */
            public Builder lastTimeAnchor(LastTimeAnchor lastTimeAnchor) {
                this.lastTimeAnchor = lastTimeAnchor;
                return this;
            }

            /**
             * LedgerDescription.
             */
            public Builder ledgerDescription(String ledgerDescription) {
                this.ledgerDescription = ledgerDescription;
                return this;
            }

            /**
             * LedgerId.
             */
            public Builder ledgerId(String ledgerId) {
                this.ledgerId = ledgerId;
                return this;
            }

            /**
             * LedgerName.
             */
            public Builder ledgerName(String ledgerName) {
                this.ledgerName = ledgerName;
                return this;
            }

            /**
             * LedgerStatus.
             */
            public Builder ledgerStatus(String ledgerStatus) {
                this.ledgerStatus = ledgerStatus;
                return this;
            }

            /**
             * LedgerType.
             */
            public Builder ledgerType(String ledgerType) {
                this.ledgerType = ledgerType;
                return this;
            }

            /**
             * MemberCount.
             */
            public Builder memberCount(Long memberCount) {
                this.memberCount = memberCount;
                return this;
            }

            /**
             * OwnerAliUid.
             */
            public Builder ownerAliUid(String ownerAliUid) {
                this.ownerAliUid = ownerAliUid;
                return this;
            }

            /**
             * RegionId.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * StorageClass.
             */
            public Builder storageClass(String storageClass) {
                this.storageClass = storageClass;
                return this;
            }

            /**
             * TimeAnchorCount.
             */
            public Builder timeAnchorCount(Long timeAnchorCount) {
                this.timeAnchorCount = timeAnchorCount;
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
             * ZoneId.
             */
            public Builder zoneId(String zoneId) {
                this.zoneId = zoneId;
                return this;
            }

            public Ledgers build() {
                return new Ledgers(this);
            } 

        } 

    }
}
