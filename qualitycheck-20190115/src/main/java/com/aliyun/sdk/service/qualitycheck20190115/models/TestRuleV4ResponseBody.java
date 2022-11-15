// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.qualitycheck20190115.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link TestRuleV4ResponseBody} extends {@link TeaModel}
 *
 * <p>TestRuleV4ResponseBody</p>
 */
public class TestRuleV4ResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private TestRuleV4ResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static TestRuleV4ResponseBody create() {
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
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
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
        private Integer httpStatusCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        /**
         * 结果代码，200表示成功，若为别的值则表示失败，调用方可根据此字段判断失败原因。
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
         * HTTP状态码。
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * 出错时表示出错详情，成功时为successful。
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * 请求Id。
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * 请求是否成功，调用方可根据此字段来判断请求是否成功：true表示成功；false/null表示失败。
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public TestRuleV4ResponseBody build() {
            return new TestRuleV4ResponseBody(this);
        } 

    } 

    public static class BranchInfoList extends TeaModel {
        @NameInMap("CheckType")
        private Integer checkType;

        @NameInMap("Index")
        private Integer index;

        @NameInMap("Lambda")
        private String lambda;

        @NameInMap("Name")
        private String name;

        @NameInMap("NextNodeId")
        private Long nextNodeId;

        @NameInMap("Situation")
        private NextNodeSituations situation;

        @NameInMap("Triggers")
        private java.util.List < String > triggers;

        private BranchInfoList(Builder builder) {
            this.checkType = builder.checkType;
            this.index = builder.index;
            this.lambda = builder.lambda;
            this.name = builder.name;
            this.nextNodeId = builder.nextNodeId;
            this.situation = builder.situation;
            this.triggers = builder.triggers;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BranchInfoList create() {
            return builder().build();
        }

        /**
         * @return checkType
         */
        public Integer getCheckType() {
            return this.checkType;
        }

        /**
         * @return index
         */
        public Integer getIndex() {
            return this.index;
        }

        /**
         * @return lambda
         */
        public String getLambda() {
            return this.lambda;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return nextNodeId
         */
        public Long getNextNodeId() {
            return this.nextNodeId;
        }

        /**
         * @return situation
         */
        public NextNodeSituations getSituation() {
            return this.situation;
        }

        /**
         * @return triggers
         */
        public java.util.List < String > getTriggers() {
            return this.triggers;
        }

        public static final class Builder {
            private Integer checkType; 
            private Integer index; 
            private String lambda; 
            private String name; 
            private Long nextNodeId; 
            private NextNodeSituations situation; 
            private java.util.List < String > triggers; 

            /**
             * CheckType.
             */
            public Builder checkType(Integer checkType) {
                this.checkType = checkType;
                return this;
            }

            /**
             * Index.
             */
            public Builder index(Integer index) {
                this.index = index;
                return this;
            }

            /**
             * Lambda.
             */
            public Builder lambda(String lambda) {
                this.lambda = lambda;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * NextNodeId.
             */
            public Builder nextNodeId(Long nextNodeId) {
                this.nextNodeId = nextNodeId;
                return this;
            }

            /**
             * Situation.
             */
            public Builder situation(NextNodeSituations situation) {
                this.situation = situation;
                return this;
            }

            /**
             * Triggers.
             */
            public Builder triggers(java.util.List < String > triggers) {
                this.triggers = triggers;
                return this;
            }

            public BranchInfoList build() {
                return new BranchInfoList(this);
            } 

        } 

    }
    public static class KeyWords extends TeaModel {
        @NameInMap("Cid")
        private String cid;

        @NameInMap("CustomizeCode")
        private String customizeCode;

        @NameInMap("From")
        private Integer from;

        @NameInMap("Oid")
        private String oid;

        @NameInMap("OperatorKey")
        private String operatorKey;

        @NameInMap("Pid")
        private Integer pid;

        @NameInMap("SimilarPhrase")
        private String similarPhrase;

        @NameInMap("Tid")
        private String tid;

        @NameInMap("To")
        private Integer to;

        @NameInMap("Uuid")
        private String uuid;

        @NameInMap("Val")
        private String val;

        private KeyWords(Builder builder) {
            this.cid = builder.cid;
            this.customizeCode = builder.customizeCode;
            this.from = builder.from;
            this.oid = builder.oid;
            this.operatorKey = builder.operatorKey;
            this.pid = builder.pid;
            this.similarPhrase = builder.similarPhrase;
            this.tid = builder.tid;
            this.to = builder.to;
            this.uuid = builder.uuid;
            this.val = builder.val;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static KeyWords create() {
            return builder().build();
        }

        /**
         * @return cid
         */
        public String getCid() {
            return this.cid;
        }

        /**
         * @return customizeCode
         */
        public String getCustomizeCode() {
            return this.customizeCode;
        }

        /**
         * @return from
         */
        public Integer getFrom() {
            return this.from;
        }

        /**
         * @return oid
         */
        public String getOid() {
            return this.oid;
        }

        /**
         * @return operatorKey
         */
        public String getOperatorKey() {
            return this.operatorKey;
        }

        /**
         * @return pid
         */
        public Integer getPid() {
            return this.pid;
        }

        /**
         * @return similarPhrase
         */
        public String getSimilarPhrase() {
            return this.similarPhrase;
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
         * @return uuid
         */
        public String getUuid() {
            return this.uuid;
        }

        /**
         * @return val
         */
        public String getVal() {
            return this.val;
        }

        public static final class Builder {
            private String cid; 
            private String customizeCode; 
            private Integer from; 
            private String oid; 
            private String operatorKey; 
            private Integer pid; 
            private String similarPhrase; 
            private String tid; 
            private Integer to; 
            private String uuid; 
            private String val; 

            /**
             * Cid.
             */
            public Builder cid(String cid) {
                this.cid = cid;
                return this;
            }

            /**
             * CustomizeCode.
             */
            public Builder customizeCode(String customizeCode) {
                this.customizeCode = customizeCode;
                return this;
            }

            /**
             * From.
             */
            public Builder from(Integer from) {
                this.from = from;
                return this;
            }

            /**
             * Oid.
             */
            public Builder oid(String oid) {
                this.oid = oid;
                return this;
            }

            /**
             * OperatorKey.
             */
            public Builder operatorKey(String operatorKey) {
                this.operatorKey = operatorKey;
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
             * SimilarPhrase.
             */
            public Builder similarPhrase(String similarPhrase) {
                this.similarPhrase = similarPhrase;
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
             * Uuid.
             */
            public Builder uuid(String uuid) {
                this.uuid = uuid;
                return this;
            }

            /**
             * Val.
             */
            public Builder val(String val) {
                this.val = val;
                return this;
            }

            public KeyWords build() {
                return new KeyWords(this);
            } 

        } 

    }
    public static class Phrase extends TeaModel {
        @NameInMap("Begin")
        private Long begin;

        @NameInMap("BeginTime")
        private String beginTime;

        @NameInMap("ChannelId")
        private Integer channelId;

        @NameInMap("EmotionFineGrainedValue")
        private Integer emotionFineGrainedValue;

        @NameInMap("EmotionValue")
        private Integer emotionValue;

        @NameInMap("End")
        private Long end;

        @NameInMap("HitStatus")
        private Integer hitStatus;

        @NameInMap("HourMinSec")
        private String hourMinSec;

        @NameInMap("Identity")
        private String identity;

        @NameInMap("Pid")
        private Integer pid;

        @NameInMap("RenterId")
        private Long renterId;

        @NameInMap("Role")
        private String role;

        @NameInMap("Sid")
        private Long sid;

        @NameInMap("SilenceDuration")
        private Integer silenceDuration;

        @NameInMap("SpeechRate")
        private Integer speechRate;

        @NameInMap("Uuid")
        private String uuid;

        @NameInMap("Words")
        private String words;

        private Phrase(Builder builder) {
            this.begin = builder.begin;
            this.beginTime = builder.beginTime;
            this.channelId = builder.channelId;
            this.emotionFineGrainedValue = builder.emotionFineGrainedValue;
            this.emotionValue = builder.emotionValue;
            this.end = builder.end;
            this.hitStatus = builder.hitStatus;
            this.hourMinSec = builder.hourMinSec;
            this.identity = builder.identity;
            this.pid = builder.pid;
            this.renterId = builder.renterId;
            this.role = builder.role;
            this.sid = builder.sid;
            this.silenceDuration = builder.silenceDuration;
            this.speechRate = builder.speechRate;
            this.uuid = builder.uuid;
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
         * @return channelId
         */
        public Integer getChannelId() {
            return this.channelId;
        }

        /**
         * @return emotionFineGrainedValue
         */
        public Integer getEmotionFineGrainedValue() {
            return this.emotionFineGrainedValue;
        }

        /**
         * @return emotionValue
         */
        public Integer getEmotionValue() {
            return this.emotionValue;
        }

        /**
         * @return end
         */
        public Long getEnd() {
            return this.end;
        }

        /**
         * @return hitStatus
         */
        public Integer getHitStatus() {
            return this.hitStatus;
        }

        /**
         * @return hourMinSec
         */
        public String getHourMinSec() {
            return this.hourMinSec;
        }

        /**
         * @return identity
         */
        public String getIdentity() {
            return this.identity;
        }

        /**
         * @return pid
         */
        public Integer getPid() {
            return this.pid;
        }

        /**
         * @return renterId
         */
        public Long getRenterId() {
            return this.renterId;
        }

        /**
         * @return role
         */
        public String getRole() {
            return this.role;
        }

        /**
         * @return sid
         */
        public Long getSid() {
            return this.sid;
        }

        /**
         * @return silenceDuration
         */
        public Integer getSilenceDuration() {
            return this.silenceDuration;
        }

        /**
         * @return speechRate
         */
        public Integer getSpeechRate() {
            return this.speechRate;
        }

        /**
         * @return uuid
         */
        public String getUuid() {
            return this.uuid;
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
            private Integer channelId; 
            private Integer emotionFineGrainedValue; 
            private Integer emotionValue; 
            private Long end; 
            private Integer hitStatus; 
            private String hourMinSec; 
            private String identity; 
            private Integer pid; 
            private Long renterId; 
            private String role; 
            private Long sid; 
            private Integer silenceDuration; 
            private Integer speechRate; 
            private String uuid; 
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
             * ChannelId.
             */
            public Builder channelId(Integer channelId) {
                this.channelId = channelId;
                return this;
            }

            /**
             * EmotionFineGrainedValue.
             */
            public Builder emotionFineGrainedValue(Integer emotionFineGrainedValue) {
                this.emotionFineGrainedValue = emotionFineGrainedValue;
                return this;
            }

            /**
             * EmotionValue.
             */
            public Builder emotionValue(Integer emotionValue) {
                this.emotionValue = emotionValue;
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
             * HitStatus.
             */
            public Builder hitStatus(Integer hitStatus) {
                this.hitStatus = hitStatus;
                return this;
            }

            /**
             * HourMinSec.
             */
            public Builder hourMinSec(String hourMinSec) {
                this.hourMinSec = hourMinSec;
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
             * Pid.
             */
            public Builder pid(Integer pid) {
                this.pid = pid;
                return this;
            }

            /**
             * RenterId.
             */
            public Builder renterId(Long renterId) {
                this.renterId = renterId;
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
             * Sid.
             */
            public Builder sid(Long sid) {
                this.sid = sid;
                return this;
            }

            /**
             * SilenceDuration.
             */
            public Builder silenceDuration(Integer silenceDuration) {
                this.silenceDuration = silenceDuration;
                return this;
            }

            /**
             * SpeechRate.
             */
            public Builder speechRate(Integer speechRate) {
                this.speechRate = speechRate;
                return this;
            }

            /**
             * Uuid.
             */
            public Builder uuid(String uuid) {
                this.uuid = uuid;
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
    public static class ConditionHitInfoList extends TeaModel {
        @NameInMap("Cid")
        private java.util.List < String > cid;

        @NameInMap("KeyWords")
        private java.util.List < KeyWords> keyWords;

        @NameInMap("Phrase")
        private Phrase phrase;

        private ConditionHitInfoList(Builder builder) {
            this.cid = builder.cid;
            this.keyWords = builder.keyWords;
            this.phrase = builder.phrase;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ConditionHitInfoList create() {
            return builder().build();
        }

        /**
         * @return cid
         */
        public java.util.List < String > getCid() {
            return this.cid;
        }

        /**
         * @return keyWords
         */
        public java.util.List < KeyWords> getKeyWords() {
            return this.keyWords;
        }

        /**
         * @return phrase
         */
        public Phrase getPhrase() {
            return this.phrase;
        }

        public static final class Builder {
            private java.util.List < String > cid; 
            private java.util.List < KeyWords> keyWords; 
            private Phrase phrase; 

            /**
             * Cid.
             */
            public Builder cid(java.util.List < String > cid) {
                this.cid = cid;
                return this;
            }

            /**
             * KeyWords.
             */
            public Builder keyWords(java.util.List < KeyWords> keyWords) {
                this.keyWords = keyWords;
                return this;
            }

            /**
             * Phrase.
             */
            public Builder phrase(Phrase phrase) {
                this.phrase = phrase;
                return this;
            }

            public ConditionHitInfoList build() {
                return new ConditionHitInfoList(this);
            } 

        } 

    }
    public static class HitRuleReviewInfoList extends TeaModel {
        @NameInMap("BranchHitId")
        private Long branchHitId;

        @NameInMap("BranchInfoList")
        private java.util.List < BranchInfoList> branchInfoList;

        @NameInMap("ConditionHitInfoList")
        private java.util.List < ConditionHitInfoList> conditionHitInfoList;

        @NameInMap("ConditionInfoList")
        private java.util.List < ConditionBasicInfo > conditionInfoList;

        @NameInMap("JudgeNodeName")
        private String judgeNodeName;

        @NameInMap("Lambda")
        private String lambda;

        @NameInMap("Matched")
        private Boolean matched;

        @NameInMap("NodeType")
        private String nodeType;

        @NameInMap("Rid")
        private Long rid;

        @NameInMap("RuleName")
        private String ruleName;

        @NameInMap("RuleScoreType")
        private Integer ruleScoreType;

        @NameInMap("ScoreNumType")
        private Integer scoreNumType;

        @NameInMap("TaskFlowId")
        private Long taskFlowId;

        private HitRuleReviewInfoList(Builder builder) {
            this.branchHitId = builder.branchHitId;
            this.branchInfoList = builder.branchInfoList;
            this.conditionHitInfoList = builder.conditionHitInfoList;
            this.conditionInfoList = builder.conditionInfoList;
            this.judgeNodeName = builder.judgeNodeName;
            this.lambda = builder.lambda;
            this.matched = builder.matched;
            this.nodeType = builder.nodeType;
            this.rid = builder.rid;
            this.ruleName = builder.ruleName;
            this.ruleScoreType = builder.ruleScoreType;
            this.scoreNumType = builder.scoreNumType;
            this.taskFlowId = builder.taskFlowId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static HitRuleReviewInfoList create() {
            return builder().build();
        }

        /**
         * @return branchHitId
         */
        public Long getBranchHitId() {
            return this.branchHitId;
        }

        /**
         * @return branchInfoList
         */
        public java.util.List < BranchInfoList> getBranchInfoList() {
            return this.branchInfoList;
        }

        /**
         * @return conditionHitInfoList
         */
        public java.util.List < ConditionHitInfoList> getConditionHitInfoList() {
            return this.conditionHitInfoList;
        }

        /**
         * @return conditionInfoList
         */
        public java.util.List < ConditionBasicInfo > getConditionInfoList() {
            return this.conditionInfoList;
        }

        /**
         * @return judgeNodeName
         */
        public String getJudgeNodeName() {
            return this.judgeNodeName;
        }

        /**
         * @return lambda
         */
        public String getLambda() {
            return this.lambda;
        }

        /**
         * @return matched
         */
        public Boolean getMatched() {
            return this.matched;
        }

        /**
         * @return nodeType
         */
        public String getNodeType() {
            return this.nodeType;
        }

        /**
         * @return rid
         */
        public Long getRid() {
            return this.rid;
        }

        /**
         * @return ruleName
         */
        public String getRuleName() {
            return this.ruleName;
        }

        /**
         * @return ruleScoreType
         */
        public Integer getRuleScoreType() {
            return this.ruleScoreType;
        }

        /**
         * @return scoreNumType
         */
        public Integer getScoreNumType() {
            return this.scoreNumType;
        }

        /**
         * @return taskFlowId
         */
        public Long getTaskFlowId() {
            return this.taskFlowId;
        }

        public static final class Builder {
            private Long branchHitId; 
            private java.util.List < BranchInfoList> branchInfoList; 
            private java.util.List < ConditionHitInfoList> conditionHitInfoList; 
            private java.util.List < ConditionBasicInfo > conditionInfoList; 
            private String judgeNodeName; 
            private String lambda; 
            private Boolean matched; 
            private String nodeType; 
            private Long rid; 
            private String ruleName; 
            private Integer ruleScoreType; 
            private Integer scoreNumType; 
            private Long taskFlowId; 

            /**
             * BranchHitId.
             */
            public Builder branchHitId(Long branchHitId) {
                this.branchHitId = branchHitId;
                return this;
            }

            /**
             * BranchInfoList.
             */
            public Builder branchInfoList(java.util.List < BranchInfoList> branchInfoList) {
                this.branchInfoList = branchInfoList;
                return this;
            }

            /**
             * ConditionHitInfoList.
             */
            public Builder conditionHitInfoList(java.util.List < ConditionHitInfoList> conditionHitInfoList) {
                this.conditionHitInfoList = conditionHitInfoList;
                return this;
            }

            /**
             * ConditionInfoList.
             */
            public Builder conditionInfoList(java.util.List < ConditionBasicInfo > conditionInfoList) {
                this.conditionInfoList = conditionInfoList;
                return this;
            }

            /**
             * JudgeNodeName.
             */
            public Builder judgeNodeName(String judgeNodeName) {
                this.judgeNodeName = judgeNodeName;
                return this;
            }

            /**
             * Lambda.
             */
            public Builder lambda(String lambda) {
                this.lambda = lambda;
                return this;
            }

            /**
             * Matched.
             */
            public Builder matched(Boolean matched) {
                this.matched = matched;
                return this;
            }

            /**
             * NodeType.
             */
            public Builder nodeType(String nodeType) {
                this.nodeType = nodeType;
                return this;
            }

            /**
             * Rid.
             */
            public Builder rid(Long rid) {
                this.rid = rid;
                return this;
            }

            /**
             * RuleName.
             */
            public Builder ruleName(String ruleName) {
                this.ruleName = ruleName;
                return this;
            }

            /**
             * RuleScoreType.
             */
            public Builder ruleScoreType(Integer ruleScoreType) {
                this.ruleScoreType = ruleScoreType;
                return this;
            }

            /**
             * ScoreNumType.
             */
            public Builder scoreNumType(Integer scoreNumType) {
                this.scoreNumType = scoreNumType;
                return this;
            }

            /**
             * TaskFlowId.
             */
            public Builder taskFlowId(Long taskFlowId) {
                this.taskFlowId = taskFlowId;
                return this;
            }

            public HitRuleReviewInfoList build() {
                return new HitRuleReviewInfoList(this);
            } 

        } 

    }
    public static class HitTaskFlowList extends TeaModel {
        @NameInMap("GraphFlow")
        private TaskGraphFlow graphFlow;

        @NameInMap("Rid")
        private Long rid;

        @NameInMap("TaskFlowType")
        private Integer taskFlowType;

        private HitTaskFlowList(Builder builder) {
            this.graphFlow = builder.graphFlow;
            this.rid = builder.rid;
            this.taskFlowType = builder.taskFlowType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static HitTaskFlowList create() {
            return builder().build();
        }

        /**
         * @return graphFlow
         */
        public TaskGraphFlow getGraphFlow() {
            return this.graphFlow;
        }

        /**
         * @return rid
         */
        public Long getRid() {
            return this.rid;
        }

        /**
         * @return taskFlowType
         */
        public Integer getTaskFlowType() {
            return this.taskFlowType;
        }

        public static final class Builder {
            private TaskGraphFlow graphFlow; 
            private Long rid; 
            private Integer taskFlowType; 

            /**
             * GraphFlow.
             */
            public Builder graphFlow(TaskGraphFlow graphFlow) {
                this.graphFlow = graphFlow;
                return this;
            }

            /**
             * Rid.
             */
            public Builder rid(Long rid) {
                this.rid = rid;
                return this;
            }

            /**
             * TaskFlowType.
             */
            public Builder taskFlowType(Integer taskFlowType) {
                this.taskFlowType = taskFlowType;
                return this;
            }

            public HitTaskFlowList build() {
                return new HitTaskFlowList(this);
            } 

        } 

    }
    public static class UnhitRuleReviewInfoList extends TeaModel {
        @NameInMap("ConditionInfoList")
        private java.util.List < ConditionBasicInfo > conditionInfoList;

        @NameInMap("Matched")
        private Boolean matched;

        @NameInMap("Rid")
        private Long rid;

        @NameInMap("TaskFlowType")
        private Integer taskFlowType;

        private UnhitRuleReviewInfoList(Builder builder) {
            this.conditionInfoList = builder.conditionInfoList;
            this.matched = builder.matched;
            this.rid = builder.rid;
            this.taskFlowType = builder.taskFlowType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UnhitRuleReviewInfoList create() {
            return builder().build();
        }

        /**
         * @return conditionInfoList
         */
        public java.util.List < ConditionBasicInfo > getConditionInfoList() {
            return this.conditionInfoList;
        }

        /**
         * @return matched
         */
        public Boolean getMatched() {
            return this.matched;
        }

        /**
         * @return rid
         */
        public Long getRid() {
            return this.rid;
        }

        /**
         * @return taskFlowType
         */
        public Integer getTaskFlowType() {
            return this.taskFlowType;
        }

        public static final class Builder {
            private java.util.List < ConditionBasicInfo > conditionInfoList; 
            private Boolean matched; 
            private Long rid; 
            private Integer taskFlowType; 

            /**
             * ConditionInfoList.
             */
            public Builder conditionInfoList(java.util.List < ConditionBasicInfo > conditionInfoList) {
                this.conditionInfoList = conditionInfoList;
                return this;
            }

            /**
             * Matched.
             */
            public Builder matched(Boolean matched) {
                this.matched = matched;
                return this;
            }

            /**
             * Rid.
             */
            public Builder rid(Long rid) {
                this.rid = rid;
                return this;
            }

            /**
             * TaskFlowType.
             */
            public Builder taskFlowType(Integer taskFlowType) {
                this.taskFlowType = taskFlowType;
                return this;
            }

            public UnhitRuleReviewInfoList build() {
                return new UnhitRuleReviewInfoList(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("HitRuleReviewInfoList")
        private java.util.List < HitRuleReviewInfoList> hitRuleReviewInfoList;

        @NameInMap("HitTaskFlowList")
        private java.util.List < HitTaskFlowList> hitTaskFlowList;

        @NameInMap("UnhitRuleReviewInfoList")
        private java.util.List < UnhitRuleReviewInfoList> unhitRuleReviewInfoList;

        private Data(Builder builder) {
            this.hitRuleReviewInfoList = builder.hitRuleReviewInfoList;
            this.hitTaskFlowList = builder.hitTaskFlowList;
            this.unhitRuleReviewInfoList = builder.unhitRuleReviewInfoList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return hitRuleReviewInfoList
         */
        public java.util.List < HitRuleReviewInfoList> getHitRuleReviewInfoList() {
            return this.hitRuleReviewInfoList;
        }

        /**
         * @return hitTaskFlowList
         */
        public java.util.List < HitTaskFlowList> getHitTaskFlowList() {
            return this.hitTaskFlowList;
        }

        /**
         * @return unhitRuleReviewInfoList
         */
        public java.util.List < UnhitRuleReviewInfoList> getUnhitRuleReviewInfoList() {
            return this.unhitRuleReviewInfoList;
        }

        public static final class Builder {
            private java.util.List < HitRuleReviewInfoList> hitRuleReviewInfoList; 
            private java.util.List < HitTaskFlowList> hitTaskFlowList; 
            private java.util.List < UnhitRuleReviewInfoList> unhitRuleReviewInfoList; 

            /**
             * HitRuleReviewInfoList.
             */
            public Builder hitRuleReviewInfoList(java.util.List < HitRuleReviewInfoList> hitRuleReviewInfoList) {
                this.hitRuleReviewInfoList = hitRuleReviewInfoList;
                return this;
            }

            /**
             * HitTaskFlowList.
             */
            public Builder hitTaskFlowList(java.util.List < HitTaskFlowList> hitTaskFlowList) {
                this.hitTaskFlowList = hitTaskFlowList;
                return this;
            }

            /**
             * UnhitRuleReviewInfoList.
             */
            public Builder unhitRuleReviewInfoList(java.util.List < UnhitRuleReviewInfoList> unhitRuleReviewInfoList) {
                this.unhitRuleReviewInfoList = unhitRuleReviewInfoList;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
