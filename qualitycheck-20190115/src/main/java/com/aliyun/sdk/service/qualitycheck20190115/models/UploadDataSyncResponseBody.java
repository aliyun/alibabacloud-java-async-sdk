// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.qualitycheck20190115.models;

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
 * {@link UploadDataSyncResponseBody} extends {@link TeaModel}
 *
 * <p>UploadDataSyncResponseBody</p>
 */
public class UploadDataSyncResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private UploadDataSyncResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UploadDataSyncResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
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
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        /**
         * Code.
         */
        public Builder code(String code) {
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

        public UploadDataSyncResponseBody build() {
            return new UploadDataSyncResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link UploadDataSyncResponseBody} extends {@link TeaModel}
     *
     * <p>UploadDataSyncResponseBody</p>
     */
    public static class HandScoreIdList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("HandScoreIdList")
        private java.util.List<String> handScoreIdList;

        private HandScoreIdList(Builder builder) {
            this.handScoreIdList = builder.handScoreIdList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static HandScoreIdList create() {
            return builder().build();
        }

        /**
         * @return handScoreIdList
         */
        public java.util.List<String> getHandScoreIdList() {
            return this.handScoreIdList;
        }

        public static final class Builder {
            private java.util.List<String> handScoreIdList; 

            /**
             * HandScoreIdList.
             */
            public Builder handScoreIdList(java.util.List<String> handScoreIdList) {
                this.handScoreIdList = handScoreIdList;
                return this;
            }

            public HandScoreIdList build() {
                return new HandScoreIdList(this);
            } 

        } 

    }
    /**
     * 
     * {@link UploadDataSyncResponseBody} extends {@link TeaModel}
     *
     * <p>UploadDataSyncResponseBody</p>
     */
    public static class ConditionBasicInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ConditionInfoCid")
        private String conditionInfoCid;

        private ConditionBasicInfo(Builder builder) {
            this.conditionInfoCid = builder.conditionInfoCid;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ConditionBasicInfo create() {
            return builder().build();
        }

        /**
         * @return conditionInfoCid
         */
        public String getConditionInfoCid() {
            return this.conditionInfoCid;
        }

        public static final class Builder {
            private String conditionInfoCid; 

            /**
             * ConditionInfoCid.
             */
            public Builder conditionInfoCid(String conditionInfoCid) {
                this.conditionInfoCid = conditionInfoCid;
                return this;
            }

            public ConditionBasicInfo build() {
                return new ConditionBasicInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link UploadDataSyncResponseBody} extends {@link TeaModel}
     *
     * <p>UploadDataSyncResponseBody</p>
     */
    public static class ConditionInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ConditionBasicInfo")
        private java.util.List<ConditionBasicInfo> conditionBasicInfo;

        private ConditionInfo(Builder builder) {
            this.conditionBasicInfo = builder.conditionBasicInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ConditionInfo create() {
            return builder().build();
        }

        /**
         * @return conditionBasicInfo
         */
        public java.util.List<ConditionBasicInfo> getConditionBasicInfo() {
            return this.conditionBasicInfo;
        }

        public static final class Builder {
            private java.util.List<ConditionBasicInfo> conditionBasicInfo; 

            /**
             * ConditionBasicInfo.
             */
            public Builder conditionBasicInfo(java.util.List<ConditionBasicInfo> conditionBasicInfo) {
                this.conditionBasicInfo = conditionBasicInfo;
                return this;
            }

            public ConditionInfo build() {
                return new ConditionInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link UploadDataSyncResponseBody} extends {@link TeaModel}
     *
     * <p>UploadDataSyncResponseBody</p>
     */
    public static class HitCids extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CidItem")
        private java.util.List<String> cidItem;

        private HitCids(Builder builder) {
            this.cidItem = builder.cidItem;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static HitCids create() {
            return builder().build();
        }

        /**
         * @return cidItem
         */
        public java.util.List<String> getCidItem() {
            return this.cidItem;
        }

        public static final class Builder {
            private java.util.List<String> cidItem; 

            /**
             * CidItem.
             */
            public Builder cidItem(java.util.List<String> cidItem) {
                this.cidItem = cidItem;
                return this;
            }

            public HitCids build() {
                return new HitCids(this);
            } 

        } 

    }
    /**
     * 
     * {@link UploadDataSyncResponseBody} extends {@link TeaModel}
     *
     * <p>UploadDataSyncResponseBody</p>
     */
    public static class HitKeyWord extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("From")
        private Integer from;

        @com.aliyun.core.annotation.NameInMap("Pid")
        private Integer pid;

        @com.aliyun.core.annotation.NameInMap("Tid")
        private String tid;

        @com.aliyun.core.annotation.NameInMap("To")
        private Integer to;

        @com.aliyun.core.annotation.NameInMap("Val")
        private String val;

        private HitKeyWord(Builder builder) {
            this.from = builder.from;
            this.pid = builder.pid;
            this.tid = builder.tid;
            this.to = builder.to;
            this.val = builder.val;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static HitKeyWord create() {
            return builder().build();
        }

        /**
         * @return from
         */
        public Integer getFrom() {
            return this.from;
        }

        /**
         * @return pid
         */
        public Integer getPid() {
            return this.pid;
        }

        /**
         * @return tid
         */
        public String getTid() {
            return this.tid;
        }

        /**
         * @return to
         */
        public Integer getTo() {
            return this.to;
        }

        /**
         * @return val
         */
        public String getVal() {
            return this.val;
        }

        public static final class Builder {
            private Integer from; 
            private Integer pid; 
            private String tid; 
            private Integer to; 
            private String val; 

            /**
             * From.
             */
            public Builder from(Integer from) {
                this.from = from;
                return this;
            }

            /**
             * Pid.
             */
            public Builder pid(Integer pid) {
                this.pid = pid;
                return this;
            }

            /**
             * Tid.
             */
            public Builder tid(String tid) {
                this.tid = tid;
                return this;
            }

            /**
             * To.
             */
            public Builder to(Integer to) {
                this.to = to;
                return this;
            }

            /**
             * Val.
             */
            public Builder val(String val) {
                this.val = val;
                return this;
            }

            public HitKeyWord build() {
                return new HitKeyWord(this);
            } 

        } 

    }
    /**
     * 
     * {@link UploadDataSyncResponseBody} extends {@link TeaModel}
     *
     * <p>UploadDataSyncResponseBody</p>
     */
    public static class HitKeyWords extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("HitKeyWord")
        private java.util.List<HitKeyWord> hitKeyWord;

        private HitKeyWords(Builder builder) {
            this.hitKeyWord = builder.hitKeyWord;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static HitKeyWords create() {
            return builder().build();
        }

        /**
         * @return hitKeyWord
         */
        public java.util.List<HitKeyWord> getHitKeyWord() {
            return this.hitKeyWord;
        }

        public static final class Builder {
            private java.util.List<HitKeyWord> hitKeyWord; 

            /**
             * HitKeyWord.
             */
            public Builder hitKeyWord(java.util.List<HitKeyWord> hitKeyWord) {
                this.hitKeyWord = hitKeyWord;
                return this;
            }

            public HitKeyWords build() {
                return new HitKeyWords(this);
            } 

        } 

    }
    /**
     * 
     * {@link UploadDataSyncResponseBody} extends {@link TeaModel}
     *
     * <p>UploadDataSyncResponseBody</p>
     */
    public static class Phrase extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Begin")
        private Long begin;

        @com.aliyun.core.annotation.NameInMap("BeginTime")
        private String beginTime;

        @com.aliyun.core.annotation.NameInMap("End")
        private Long end;

        @com.aliyun.core.annotation.NameInMap("Identity")
        private String identity;

        @com.aliyun.core.annotation.NameInMap("Role")
        private String role;

        @com.aliyun.core.annotation.NameInMap("Words")
        private String words;

        private Phrase(Builder builder) {
            this.begin = builder.begin;
            this.beginTime = builder.beginTime;
            this.end = builder.end;
            this.identity = builder.identity;
            this.role = builder.role;
            this.words = builder.words;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Phrase create() {
            return builder().build();
        }

        /**
         * @return begin
         */
        public Long getBegin() {
            return this.begin;
        }

        /**
         * @return beginTime
         */
        public String getBeginTime() {
            return this.beginTime;
        }

        /**
         * @return end
         */
        public Long getEnd() {
            return this.end;
        }

        /**
         * @return identity
         */
        public String getIdentity() {
            return this.identity;
        }

        /**
         * @return role
         */
        public String getRole() {
            return this.role;
        }

        /**
         * @return words
         */
        public String getWords() {
            return this.words;
        }

        public static final class Builder {
            private Long begin; 
            private String beginTime; 
            private Long end; 
            private String identity; 
            private String role; 
            private String words; 

            /**
             * Begin.
             */
            public Builder begin(Long begin) {
                this.begin = begin;
                return this;
            }

            /**
             * BeginTime.
             */
            public Builder beginTime(String beginTime) {
                this.beginTime = beginTime;
                return this;
            }

            /**
             * End.
             */
            public Builder end(Long end) {
                this.end = end;
                return this;
            }

            /**
             * Identity.
             */
            public Builder identity(String identity) {
                this.identity = identity;
                return this;
            }

            /**
             * Role.
             */
            public Builder role(String role) {
                this.role = role;
                return this;
            }

            /**
             * Words.
             */
            public Builder words(String words) {
                this.words = words;
                return this;
            }

            public Phrase build() {
                return new Phrase(this);
            } 

        } 

    }
    /**
     * 
     * {@link UploadDataSyncResponseBody} extends {@link TeaModel}
     *
     * <p>UploadDataSyncResponseBody</p>
     */
    public static class ConditionHitInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("HitCids")
        private HitCids hitCids;

        @com.aliyun.core.annotation.NameInMap("HitKeyWords")
        private HitKeyWords hitKeyWords;

        @com.aliyun.core.annotation.NameInMap("Phrase")
        private Phrase phrase;

        private ConditionHitInfo(Builder builder) {
            this.hitCids = builder.hitCids;
            this.hitKeyWords = builder.hitKeyWords;
            this.phrase = builder.phrase;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ConditionHitInfo create() {
            return builder().build();
        }

        /**
         * @return hitCids
         */
        public HitCids getHitCids() {
            return this.hitCids;
        }

        /**
         * @return hitKeyWords
         */
        public HitKeyWords getHitKeyWords() {
            return this.hitKeyWords;
        }

        /**
         * @return phrase
         */
        public Phrase getPhrase() {
            return this.phrase;
        }

        public static final class Builder {
            private HitCids hitCids; 
            private HitKeyWords hitKeyWords; 
            private Phrase phrase; 

            /**
             * HitCids.
             */
            public Builder hitCids(HitCids hitCids) {
                this.hitCids = hitCids;
                return this;
            }

            /**
             * HitKeyWords.
             */
            public Builder hitKeyWords(HitKeyWords hitKeyWords) {
                this.hitKeyWords = hitKeyWords;
                return this;
            }

            /**
             * Phrase.
             */
            public Builder phrase(Phrase phrase) {
                this.phrase = phrase;
                return this;
            }

            public ConditionHitInfo build() {
                return new ConditionHitInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link UploadDataSyncResponseBody} extends {@link TeaModel}
     *
     * <p>UploadDataSyncResponseBody</p>
     */
    public static class Hit extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ConditionHitInfo")
        private java.util.List<ConditionHitInfo> conditionHitInfo;

        private Hit(Builder builder) {
            this.conditionHitInfo = builder.conditionHitInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Hit create() {
            return builder().build();
        }

        /**
         * @return conditionHitInfo
         */
        public java.util.List<ConditionHitInfo> getConditionHitInfo() {
            return this.conditionHitInfo;
        }

        public static final class Builder {
            private java.util.List<ConditionHitInfo> conditionHitInfo; 

            /**
             * ConditionHitInfo.
             */
            public Builder conditionHitInfo(java.util.List<ConditionHitInfo> conditionHitInfo) {
                this.conditionHitInfo = conditionHitInfo;
                return this;
            }

            public Hit build() {
                return new Hit(this);
            } 

        } 

    }
    /**
     * 
     * {@link UploadDataSyncResponseBody} extends {@link TeaModel}
     *
     * <p>UploadDataSyncResponseBody</p>
     */
    public static class RuleHitInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ConditionInfo")
        private ConditionInfo conditionInfo;

        @com.aliyun.core.annotation.NameInMap("Hit")
        private Hit hit;

        @com.aliyun.core.annotation.NameInMap("Rid")
        private String rid;

        @com.aliyun.core.annotation.NameInMap("Tid")
        private String tid;

        private RuleHitInfo(Builder builder) {
            this.conditionInfo = builder.conditionInfo;
            this.hit = builder.hit;
            this.rid = builder.rid;
            this.tid = builder.tid;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RuleHitInfo create() {
            return builder().build();
        }

        /**
         * @return conditionInfo
         */
        public ConditionInfo getConditionInfo() {
            return this.conditionInfo;
        }

        /**
         * @return hit
         */
        public Hit getHit() {
            return this.hit;
        }

        /**
         * @return rid
         */
        public String getRid() {
            return this.rid;
        }

        /**
         * @return tid
         */
        public String getTid() {
            return this.tid;
        }

        public static final class Builder {
            private ConditionInfo conditionInfo; 
            private Hit hit; 
            private String rid; 
            private String tid; 

            /**
             * ConditionInfo.
             */
            public Builder conditionInfo(ConditionInfo conditionInfo) {
                this.conditionInfo = conditionInfo;
                return this;
            }

            /**
             * Hit.
             */
            public Builder hit(Hit hit) {
                this.hit = hit;
                return this;
            }

            /**
             * Rid.
             */
            public Builder rid(String rid) {
                this.rid = rid;
                return this;
            }

            /**
             * Tid.
             */
            public Builder tid(String tid) {
                this.tid = tid;
                return this;
            }

            public RuleHitInfo build() {
                return new RuleHitInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link UploadDataSyncResponseBody} extends {@link TeaModel}
     *
     * <p>UploadDataSyncResponseBody</p>
     */
    public static class Rules extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("RuleHitInfo")
        private java.util.List<RuleHitInfo> ruleHitInfo;

        private Rules(Builder builder) {
            this.ruleHitInfo = builder.ruleHitInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Rules create() {
            return builder().build();
        }

        /**
         * @return ruleHitInfo
         */
        public java.util.List<RuleHitInfo> getRuleHitInfo() {
            return this.ruleHitInfo;
        }

        public static final class Builder {
            private java.util.List<RuleHitInfo> ruleHitInfo; 

            /**
             * RuleHitInfo.
             */
            public Builder ruleHitInfo(java.util.List<RuleHitInfo> ruleHitInfo) {
                this.ruleHitInfo = ruleHitInfo;
                return this;
            }

            public Rules build() {
                return new Rules(this);
            } 

        } 

    }
    /**
     * 
     * {@link UploadDataSyncResponseBody} extends {@link TeaModel}
     *
     * <p>UploadDataSyncResponseBody</p>
     */
    public static class ResultInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("HandScoreIdList")
        private HandScoreIdList handScoreIdList;

        @com.aliyun.core.annotation.NameInMap("Rules")
        private Rules rules;

        @com.aliyun.core.annotation.NameInMap("Score")
        private Integer score;

        private ResultInfo(Builder builder) {
            this.handScoreIdList = builder.handScoreIdList;
            this.rules = builder.rules;
            this.score = builder.score;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResultInfo create() {
            return builder().build();
        }

        /**
         * @return handScoreIdList
         */
        public HandScoreIdList getHandScoreIdList() {
            return this.handScoreIdList;
        }

        /**
         * @return rules
         */
        public Rules getRules() {
            return this.rules;
        }

        /**
         * @return score
         */
        public Integer getScore() {
            return this.score;
        }

        public static final class Builder {
            private HandScoreIdList handScoreIdList; 
            private Rules rules; 
            private Integer score; 

            /**
             * HandScoreIdList.
             */
            public Builder handScoreIdList(HandScoreIdList handScoreIdList) {
                this.handScoreIdList = handScoreIdList;
                return this;
            }

            /**
             * Rules.
             */
            public Builder rules(Rules rules) {
                this.rules = rules;
                return this;
            }

            /**
             * Score.
             */
            public Builder score(Integer score) {
                this.score = score;
                return this;
            }

            public ResultInfo build() {
                return new ResultInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link UploadDataSyncResponseBody} extends {@link TeaModel}
     *
     * <p>UploadDataSyncResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ResultInfo")
        private java.util.List<ResultInfo> resultInfo;

        private Data(Builder builder) {
            this.resultInfo = builder.resultInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return resultInfo
         */
        public java.util.List<ResultInfo> getResultInfo() {
            return this.resultInfo;
        }

        public static final class Builder {
            private java.util.List<ResultInfo> resultInfo; 

            /**
             * ResultInfo.
             */
            public Builder resultInfo(java.util.List<ResultInfo> resultInfo) {
                this.resultInfo = resultInfo;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
