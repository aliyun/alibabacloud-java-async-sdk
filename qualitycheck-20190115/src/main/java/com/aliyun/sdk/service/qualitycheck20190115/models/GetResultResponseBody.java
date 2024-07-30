// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.qualitycheck20190115.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetResultResponseBody} extends {@link TeaModel}
 *
 * <p>GetResultResponseBody</p>
 */
public class GetResultResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Count")
    private Integer count;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ResultCountId")
    private String resultCountId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GetResultResponseBody(Builder builder) {
        this.code = builder.code;
        this.count = builder.count;
        this.data = builder.data;
        this.message = builder.message;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.resultCountId = builder.resultCountId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetResultResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return count
     */
    public Integer getCount() {
        return this.count;
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
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return resultCountId
     */
    public String getResultCountId() {
        return this.resultCountId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private Integer count; 
        private Data data; 
        private String message; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private String resultCountId; 
        private Boolean success; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Count.
         */
        public Builder count(Integer count) {
            this.count = count;
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
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
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
         * ResultCountId.
         */
        public Builder resultCountId(String resultCountId) {
            this.resultCountId = resultCountId;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetResultResponseBody build() {
            return new GetResultResponseBody(this);
        } 

    } 

    public static class Agent extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("SkillGroup")
        private String skillGroup;

        private Agent(Builder builder) {
            this.id = builder.id;
            this.name = builder.name;
            this.skillGroup = builder.skillGroup;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Agent create() {
            return builder().build();
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return skillGroup
         */
        public String getSkillGroup() {
            return this.skillGroup;
        }

        public static final class Builder {
            private String id; 
            private String name; 
            private String skillGroup; 

            /**
             * Id.
             */
            public Builder id(String id) {
                this.id = id;
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
             * SkillGroup.
             */
            public Builder skillGroup(String skillGroup) {
                this.skillGroup = skillGroup;
                return this;
            }

            public Agent build() {
                return new Agent(this);
            } 

        } 

    }
    public static class AsrResult extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Begin")
        private Long begin;

        @com.aliyun.core.annotation.NameInMap("EmotionValue")
        private Integer emotionValue;

        @com.aliyun.core.annotation.NameInMap("End")
        private Long end;

        @com.aliyun.core.annotation.NameInMap("Identity")
        private String identity;

        @com.aliyun.core.annotation.NameInMap("Role")
        private String role;

        @com.aliyun.core.annotation.NameInMap("SpeechRate")
        private Integer speechRate;

        @com.aliyun.core.annotation.NameInMap("Words")
        private String words;

        private AsrResult(Builder builder) {
            this.begin = builder.begin;
            this.emotionValue = builder.emotionValue;
            this.end = builder.end;
            this.identity = builder.identity;
            this.role = builder.role;
            this.speechRate = builder.speechRate;
            this.words = builder.words;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AsrResult create() {
            return builder().build();
        }

        /**
         * @return begin
         */
        public Long getBegin() {
            return this.begin;
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
         * @return speechRate
         */
        public Integer getSpeechRate() {
            return this.speechRate;
        }

        /**
         * @return words
         */
        public String getWords() {
            return this.words;
        }

        public static final class Builder {
            private Long begin; 
            private Integer emotionValue; 
            private Long end; 
            private String identity; 
            private String role; 
            private Integer speechRate; 
            private String words; 

            /**
             * Begin.
             */
            public Builder begin(Long begin) {
                this.begin = begin;
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
             * SpeechRate.
             */
            public Builder speechRate(Integer speechRate) {
                this.speechRate = speechRate;
                return this;
            }

            /**
             * Words.
             */
            public Builder words(String words) {
                this.words = words;
                return this;
            }

            public AsrResult build() {
                return new AsrResult(this);
            } 

        } 

    }
    public static class ResultInfoAsrResult extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AsrResult")
        private java.util.List < AsrResult> asrResult;

        private ResultInfoAsrResult(Builder builder) {
            this.asrResult = builder.asrResult;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResultInfoAsrResult create() {
            return builder().build();
        }

        /**
         * @return asrResult
         */
        public java.util.List < AsrResult> getAsrResult() {
            return this.asrResult;
        }

        public static final class Builder {
            private java.util.List < AsrResult> asrResult; 

            /**
             * AsrResult.
             */
            public Builder asrResult(java.util.List < AsrResult> asrResult) {
                this.asrResult = asrResult;
                return this;
            }

            public ResultInfoAsrResult build() {
                return new ResultInfoAsrResult(this);
            } 

        } 

    }
    public static class Anchor extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Cid")
        private String cid;

        @com.aliyun.core.annotation.NameInMap("Hit_time")
        private Integer hitTime;

        @com.aliyun.core.annotation.NameInMap("Location")
        private String location;

        private Anchor(Builder builder) {
            this.cid = builder.cid;
            this.hitTime = builder.hitTime;
            this.location = builder.location;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Anchor create() {
            return builder().build();
        }

        /**
         * @return cid
         */
        public String getCid() {
            return this.cid;
        }

        /**
         * @return hitTime
         */
        public Integer getHitTime() {
            return this.hitTime;
        }

        /**
         * @return location
         */
        public String getLocation() {
            return this.location;
        }

        public static final class Builder {
            private String cid; 
            private Integer hitTime; 
            private String location; 

            /**
             * 条件ID
             */
            public Builder cid(String cid) {
                this.cid = cid;
                return this;
            }

            /**
             * 命中次数
             */
            public Builder hitTime(Integer hitTime) {
                this.hitTime = hitTime;
                return this;
            }

            /**
             * 位置
             */
            public Builder location(String location) {
                this.location = location;
                return this;
            }

            public Anchor build() {
                return new Anchor(this);
            } 

        } 

    }
    public static class Range extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("From")
        private Integer from;

        @com.aliyun.core.annotation.NameInMap("To")
        private Integer to;

        private Range(Builder builder) {
            this.from = builder.from;
            this.to = builder.to;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Range create() {
            return builder().build();
        }

        /**
         * @return from
         */
        public Integer getFrom() {
            return this.from;
        }

        /**
         * @return to
         */
        public Integer getTo() {
            return this.to;
        }

        public static final class Builder {
            private Integer from; 
            private Integer to; 

            /**
             * 对话开始索引
             */
            public Builder from(Integer from) {
                this.from = from;
                return this;
            }

            /**
             * 对话结束索引
             */
            public Builder to(Integer to) {
                this.to = to;
                return this;
            }

            public Range build() {
                return new Range(this);
            } 

        } 

    }
    public static class TimeRange extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("From")
        private Long from;

        @com.aliyun.core.annotation.NameInMap("To")
        private Long to;

        private TimeRange(Builder builder) {
            this.from = builder.from;
            this.to = builder.to;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TimeRange create() {
            return builder().build();
        }

        /**
         * @return from
         */
        public Long getFrom() {
            return this.from;
        }

        /**
         * @return to
         */
        public Long getTo() {
            return this.to;
        }

        public static final class Builder {
            private Long from; 
            private Long to; 

            /**
             * 对话开始索引
             */
            public Builder from(Long from) {
                this.from = from;
                return this;
            }

            /**
             * 对话结束索引
             */
            public Builder to(Long to) {
                this.to = to;
                return this;
            }

            public TimeRange build() {
                return new TimeRange(this);
            } 

        } 

    }
    public static class CheckRange extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Absolute")
        private Boolean absolute;

        @com.aliyun.core.annotation.NameInMap("AllSentencesSatisfy")
        private Boolean allSentencesSatisfy;

        @com.aliyun.core.annotation.NameInMap("Anchor")
        private Anchor anchor;

        @com.aliyun.core.annotation.NameInMap("Range")
        private Range range;

        @com.aliyun.core.annotation.NameInMap("Role")
        private String role;

        @com.aliyun.core.annotation.NameInMap("RoleId")
        private Integer roleId;

        @com.aliyun.core.annotation.NameInMap("TimeRange")
        private TimeRange timeRange;

        private CheckRange(Builder builder) {
            this.absolute = builder.absolute;
            this.allSentencesSatisfy = builder.allSentencesSatisfy;
            this.anchor = builder.anchor;
            this.range = builder.range;
            this.role = builder.role;
            this.roleId = builder.roleId;
            this.timeRange = builder.timeRange;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CheckRange create() {
            return builder().build();
        }

        /**
         * @return absolute
         */
        public Boolean getAbsolute() {
            return this.absolute;
        }

        /**
         * @return allSentencesSatisfy
         */
        public Boolean getAllSentencesSatisfy() {
            return this.allSentencesSatisfy;
        }

        /**
         * @return anchor
         */
        public Anchor getAnchor() {
            return this.anchor;
        }

        /**
         * @return range
         */
        public Range getRange() {
            return this.range;
        }

        /**
         * @return role
         */
        public String getRole() {
            return this.role;
        }

        /**
         * @return roleId
         */
        public Integer getRoleId() {
            return this.roleId;
        }

        /**
         * @return timeRange
         */
        public TimeRange getTimeRange() {
            return this.timeRange;
        }

        public static final class Builder {
            private Boolean absolute; 
            private Boolean allSentencesSatisfy; 
            private Anchor anchor; 
            private Range range; 
            private String role; 
            private Integer roleId; 
            private TimeRange timeRange; 

            /**
             * false: 相对位置; 会结合anchor以及角色来决定句子位置
             */
            public Builder absolute(Boolean absolute) {
                this.absolute = absolute;
                return this;
            }

            /**
             * true: 每句话都必须满足条件；
             */
            public Builder allSentencesSatisfy(Boolean allSentencesSatisfy) {
                this.allSentencesSatisfy = allSentencesSatisfy;
                return this;
            }

            /**
             * 前置后置条件
             */
            public Builder anchor(Anchor anchor) {
                this.anchor = anchor;
                return this;
            }

            /**
             * 相对范围
             */
            public Builder range(Range range) {
                this.range = range;
                return this;
            }

            /**
             * 对应 RoleType.type
             */
            public Builder role(String role) {
                this.role = role;
                return this;
            }

            /**
             * 对应 RoleType.id
             */
            public Builder roleId(Integer roleId) {
                this.roleId = roleId;
                return this;
            }

            /**
             * TimeRange.
             */
            public Builder timeRange(TimeRange timeRange) {
                this.timeRange = timeRange;
                return this;
            }

            public CheckRange build() {
                return new CheckRange(this);
            } 

        } 

    }
    public static class Excludes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Exclude")
        private java.util.List < String > exclude;

        private Excludes(Builder builder) {
            this.exclude = builder.exclude;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Excludes create() {
            return builder().build();
        }

        /**
         * @return exclude
         */
        public java.util.List < String > getExclude() {
            return this.exclude;
        }

        public static final class Builder {
            private java.util.List < String > exclude; 

            /**
             * Exclude.
             */
            public Builder exclude(java.util.List < String > exclude) {
                this.exclude = exclude;
                return this;
            }

            public Excludes build() {
                return new Excludes(this);
            } 

        } 

    }
    public static class FlowNodePrerequisiteParam extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("NodeId")
        private Long nodeId;

        @com.aliyun.core.annotation.NameInMap("NodeMatchStatus")
        private Integer nodeMatchStatus;

        @com.aliyun.core.annotation.NameInMap("NodeName")
        private String nodeName;

        private FlowNodePrerequisiteParam(Builder builder) {
            this.nodeId = builder.nodeId;
            this.nodeMatchStatus = builder.nodeMatchStatus;
            this.nodeName = builder.nodeName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FlowNodePrerequisiteParam create() {
            return builder().build();
        }

        /**
         * @return nodeId
         */
        public Long getNodeId() {
            return this.nodeId;
        }

        /**
         * @return nodeMatchStatus
         */
        public Integer getNodeMatchStatus() {
            return this.nodeMatchStatus;
        }

        /**
         * @return nodeName
         */
        public String getNodeName() {
            return this.nodeName;
        }

        public static final class Builder {
            private Long nodeId; 
            private Integer nodeMatchStatus; 
            private String nodeName; 

            /**
             * 节点id
             */
            public Builder nodeId(Long nodeId) {
                this.nodeId = nodeId;
                return this;
            }

            /**
             * 节点匹配状态。
             */
            public Builder nodeMatchStatus(Integer nodeMatchStatus) {
                this.nodeMatchStatus = nodeMatchStatus;
                return this;
            }

            /**
             * 冗余的节点名称
             */
            public Builder nodeName(String nodeName) {
                this.nodeName = nodeName;
                return this;
            }

            public FlowNodePrerequisiteParam build() {
                return new FlowNodePrerequisiteParam(this);
            } 

        } 

    }
    public static class Intent extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        private Intent(Builder builder) {
            this.id = builder.id;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Intent create() {
            return builder().build();
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private Long id; 
            private String name; 

            /**
             * 意图模型ID
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * 意图模型名称
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public Intent build() {
                return new Intent(this);
            } 

        } 

    }
    public static class Intents extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Intent")
        private java.util.List < Intent> intent;

        private Intents(Builder builder) {
            this.intent = builder.intent;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Intents create() {
            return builder().build();
        }

        /**
         * @return intent
         */
        public java.util.List < Intent> getIntent() {
            return this.intent;
        }

        public static final class Builder {
            private java.util.List < Intent> intent; 

            /**
             * Intent.
             */
            public Builder intent(java.util.List < Intent> intent) {
                this.intent = intent;
                return this;
            }

            public Intents build() {
                return new Intents(this);
            } 

        } 

    }
    public static class IntentModelCheckParm extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Intents")
        private Intents intents;

        @com.aliyun.core.annotation.NameInMap("ModelScene")
        private String modelScene;

        private IntentModelCheckParm(Builder builder) {
            this.intents = builder.intents;
            this.modelScene = builder.modelScene;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static IntentModelCheckParm create() {
            return builder().build();
        }

        /**
         * @return intents
         */
        public Intents getIntents() {
            return this.intents;
        }

        /**
         * @return modelScene
         */
        public String getModelScene() {
            return this.modelScene;
        }

        public static final class Builder {
            private Intents intents; 
            private String modelScene; 

            /**
             * 引用的意图模型
             */
            public Builder intents(Intents intents) {
                this.intents = intents;
                return this;
            }

            /**
             * 模型应用的场景 AGENT:客户场景、CUSTOMER:客服场景 (CUSTOMER: 客户场景, AGENT: 坐席场景)
             */
            public Builder modelScene(String modelScene) {
                this.modelScene = modelScene;
                return this;
            }

            public IntentModelCheckParm build() {
                return new IntentModelCheckParm(this);
            } 

        } 

    }
    public static class Keywords extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Keyword")
        private java.util.List < String > keyword;

        private Keywords(Builder builder) {
            this.keyword = builder.keyword;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Keywords create() {
            return builder().build();
        }

        /**
         * @return keyword
         */
        public java.util.List < String > getKeyword() {
            return this.keyword;
        }

        public static final class Builder {
            private java.util.List < String > keyword; 

            /**
             * Keyword.
             */
            public Builder keyword(java.util.List < String > keyword) {
                this.keyword = keyword;
                return this;
            }

            public Keywords build() {
                return new Keywords(this);
            } 

        } 

    }
    public static class Param extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Average")
        private Boolean average;

        @com.aliyun.core.annotation.NameInMap("BeginType")
        private String beginType;

        @com.aliyun.core.annotation.NameInMap("Case_sensitive")
        private Boolean caseSensitive;

        @com.aliyun.core.annotation.NameInMap("CheckFirstSentence")
        private Boolean checkFirstSentence;

        @com.aliyun.core.annotation.NameInMap("CheckType")
        private Integer checkType;

        @com.aliyun.core.annotation.NameInMap("CompareOperator")
        private String compareOperator;

        @com.aliyun.core.annotation.NameInMap("ContextChatMatch")
        private Boolean contextChatMatch;

        @com.aliyun.core.annotation.NameInMap("DelayTime")
        private Integer delayTime;

        @com.aliyun.core.annotation.NameInMap("EndType")
        private String endType;

        @com.aliyun.core.annotation.NameInMap("Excludes")
        private Excludes excludes;

        @com.aliyun.core.annotation.NameInMap("FlowNodePrerequisiteParam")
        private FlowNodePrerequisiteParam flowNodePrerequisiteParam;

        @com.aliyun.core.annotation.NameInMap("From")
        private Integer from;

        @com.aliyun.core.annotation.NameInMap("From_end")
        private Boolean fromEnd;

        @com.aliyun.core.annotation.NameInMap("Hit_time")
        private Integer hitTime;

        @com.aliyun.core.annotation.NameInMap("In_sentence")
        private Boolean inSentence;

        @com.aliyun.core.annotation.NameInMap("IntentModelCheckParm")
        private IntentModelCheckParm intentModelCheckParm;

        @com.aliyun.core.annotation.NameInMap("Interval")
        private Integer interval;

        @com.aliyun.core.annotation.NameInMap("IntervalEnd")
        private Integer intervalEnd;

        @com.aliyun.core.annotation.NameInMap("KeywordExtension")
        private Integer keywordExtension;

        @com.aliyun.core.annotation.NameInMap("KeywordMatchSize")
        private Integer keywordMatchSize;

        @com.aliyun.core.annotation.NameInMap("Keywords")
        private Keywords keywords;

        @com.aliyun.core.annotation.NameInMap("MaxEmotionChangeValue")
        private Integer maxEmotionChangeValue;

        @com.aliyun.core.annotation.NameInMap("MinWordSize")
        private Integer minWordSize;

        @com.aliyun.core.annotation.NameInMap("Near_dialogue")
        private Boolean nearDialogue;

        @com.aliyun.core.annotation.NameInMap("NotRegex")
        private String notRegex;

        @com.aliyun.core.annotation.NameInMap("Phrase")
        private String phrase;

        @com.aliyun.core.annotation.NameInMap("Regex")
        private String regex;

        @com.aliyun.core.annotation.NameInMap("Target")
        private Integer target;

        @com.aliyun.core.annotation.NameInMap("Threshold")
        private Float threshold;

        private Param(Builder builder) {
            this.average = builder.average;
            this.beginType = builder.beginType;
            this.caseSensitive = builder.caseSensitive;
            this.checkFirstSentence = builder.checkFirstSentence;
            this.checkType = builder.checkType;
            this.compareOperator = builder.compareOperator;
            this.contextChatMatch = builder.contextChatMatch;
            this.delayTime = builder.delayTime;
            this.endType = builder.endType;
            this.excludes = builder.excludes;
            this.flowNodePrerequisiteParam = builder.flowNodePrerequisiteParam;
            this.from = builder.from;
            this.fromEnd = builder.fromEnd;
            this.hitTime = builder.hitTime;
            this.inSentence = builder.inSentence;
            this.intentModelCheckParm = builder.intentModelCheckParm;
            this.interval = builder.interval;
            this.intervalEnd = builder.intervalEnd;
            this.keywordExtension = builder.keywordExtension;
            this.keywordMatchSize = builder.keywordMatchSize;
            this.keywords = builder.keywords;
            this.maxEmotionChangeValue = builder.maxEmotionChangeValue;
            this.minWordSize = builder.minWordSize;
            this.nearDialogue = builder.nearDialogue;
            this.notRegex = builder.notRegex;
            this.phrase = builder.phrase;
            this.regex = builder.regex;
            this.target = builder.target;
            this.threshold = builder.threshold;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Param create() {
            return builder().build();
        }

        /**
         * @return average
         */
        public Boolean getAverage() {
            return this.average;
        }

        /**
         * @return beginType
         */
        public String getBeginType() {
            return this.beginType;
        }

        /**
         * @return caseSensitive
         */
        public Boolean getCaseSensitive() {
            return this.caseSensitive;
        }

        /**
         * @return checkFirstSentence
         */
        public Boolean getCheckFirstSentence() {
            return this.checkFirstSentence;
        }

        /**
         * @return checkType
         */
        public Integer getCheckType() {
            return this.checkType;
        }

        /**
         * @return compareOperator
         */
        public String getCompareOperator() {
            return this.compareOperator;
        }

        /**
         * @return contextChatMatch
         */
        public Boolean getContextChatMatch() {
            return this.contextChatMatch;
        }

        /**
         * @return delayTime
         */
        public Integer getDelayTime() {
            return this.delayTime;
        }

        /**
         * @return endType
         */
        public String getEndType() {
            return this.endType;
        }

        /**
         * @return excludes
         */
        public Excludes getExcludes() {
            return this.excludes;
        }

        /**
         * @return flowNodePrerequisiteParam
         */
        public FlowNodePrerequisiteParam getFlowNodePrerequisiteParam() {
            return this.flowNodePrerequisiteParam;
        }

        /**
         * @return from
         */
        public Integer getFrom() {
            return this.from;
        }

        /**
         * @return fromEnd
         */
        public Boolean getFromEnd() {
            return this.fromEnd;
        }

        /**
         * @return hitTime
         */
        public Integer getHitTime() {
            return this.hitTime;
        }

        /**
         * @return inSentence
         */
        public Boolean getInSentence() {
            return this.inSentence;
        }

        /**
         * @return intentModelCheckParm
         */
        public IntentModelCheckParm getIntentModelCheckParm() {
            return this.intentModelCheckParm;
        }

        /**
         * @return interval
         */
        public Integer getInterval() {
            return this.interval;
        }

        /**
         * @return intervalEnd
         */
        public Integer getIntervalEnd() {
            return this.intervalEnd;
        }

        /**
         * @return keywordExtension
         */
        public Integer getKeywordExtension() {
            return this.keywordExtension;
        }

        /**
         * @return keywordMatchSize
         */
        public Integer getKeywordMatchSize() {
            return this.keywordMatchSize;
        }

        /**
         * @return keywords
         */
        public Keywords getKeywords() {
            return this.keywords;
        }

        /**
         * @return maxEmotionChangeValue
         */
        public Integer getMaxEmotionChangeValue() {
            return this.maxEmotionChangeValue;
        }

        /**
         * @return minWordSize
         */
        public Integer getMinWordSize() {
            return this.minWordSize;
        }

        /**
         * @return nearDialogue
         */
        public Boolean getNearDialogue() {
            return this.nearDialogue;
        }

        /**
         * @return notRegex
         */
        public String getNotRegex() {
            return this.notRegex;
        }

        /**
         * @return phrase
         */
        public String getPhrase() {
            return this.phrase;
        }

        /**
         * @return regex
         */
        public String getRegex() {
            return this.regex;
        }

        /**
         * @return target
         */
        public Integer getTarget() {
            return this.target;
        }

        /**
         * @return threshold
         */
        public Float getThreshold() {
            return this.threshold;
        }

        public static final class Builder {
            private Boolean average; 
            private String beginType; 
            private Boolean caseSensitive; 
            private Boolean checkFirstSentence; 
            private Integer checkType; 
            private String compareOperator; 
            private Boolean contextChatMatch; 
            private Integer delayTime; 
            private String endType; 
            private Excludes excludes; 
            private FlowNodePrerequisiteParam flowNodePrerequisiteParam; 
            private Integer from; 
            private Boolean fromEnd; 
            private Integer hitTime; 
            private Boolean inSentence; 
            private IntentModelCheckParm intentModelCheckParm; 
            private Integer interval; 
            private Integer intervalEnd; 
            private Integer keywordExtension; 
            private Integer keywordMatchSize; 
            private Keywords keywords; 
            private Integer maxEmotionChangeValue; 
            private Integer minWordSize; 
            private Boolean nearDialogue; 
            private String notRegex; 
            private String phrase; 
            private String regex; 
            private Integer target; 
            private Float threshold; 

            /**
             * 语速检测，是否计算整个对话平均语速，默认false
             */
            public Builder average(Boolean average) {
                this.average = average;
                return this;
            }

            /**
             * 时长算子，时长计算开始类型，录音开始，还是某句对话开始
             */
            public Builder beginType(String beginType) {
                this.beginType = beginType;
                return this;
            }

            /**
             * 区分大小写
             */
            public Builder caseSensitive(Boolean caseSensitive) {
                this.caseSensitive = caseSensitive;
                return this;
            }

            /**
             * 静音检测：要不要检测第一句话
             */
            public Builder checkFirstSentence(Boolean checkFirstSentence) {
                this.checkFirstSentence = checkFirstSentence;
                return this;
            }

            /**
             * 检测方式，1 相邻句能量波动 2 最大能量跨度 默认1
             */
            public Builder checkType(Integer checkType) {
                this.checkType = checkType;
                return this;
            }

            /**
             * 大于，还是小于，gt/lt
             */
            public Builder compareOperator(String compareOperator) {
                this.compareOperator = compareOperator;
                return this;
            }

            /**
             * 是否单句话匹配；
             */
            public Builder contextChatMatch(Boolean contextChatMatch) {
                this.contextChatMatch = contextChatMatch;
                return this;
            }

            /**
             * 抢话算子 延时时长
             */
            public Builder delayTime(Integer delayTime) {
                this.delayTime = delayTime;
                return this;
            }

            /**
             * 时长算子，时长计算结束类型，录音结束，还是某句对话结束
             */
            public Builder endType(String endType) {
                this.endType = endType;
                return this;
            }

            /**
             * 上下文重复算子：排除掉某些对话
             */
            public Builder excludes(Excludes excludes) {
                this.excludes = excludes;
                return this;
            }

            /**
             * 流程节点前置条件参数
             */
            public Builder flowNodePrerequisiteParam(FlowNodePrerequisiteParam flowNodePrerequisiteParam) {
                this.flowNodePrerequisiteParam = flowNodePrerequisiteParam;
                return this;
            }

            /**
             * 上下文重复算子：检测当前句的前from句是否有重复；0表示前面的所有句
             */
            public Builder from(Integer from) {
                this.from = from;
                return this;
            }

            /**
             * from_end
             */
            public Builder fromEnd(Boolean fromEnd) {
                this.fromEnd = fromEnd;
                return this;
            }

            /**
             * 上下文重复算子：重复几次
             */
            public Builder hitTime(Integer hitTime) {
                this.hitTime = hitTime;
                return this;
            }

            /**
             * 生效句子， true单个句子，false多个句子
             */
            public Builder inSentence(Boolean inSentence) {
                this.inSentence = inSentence;
                return this;
            }

            /**
             * 意图模型检查参数
             */
            public Builder intentModelCheckParm(IntentModelCheckParm intentModelCheckParm) {
                this.intentModelCheckParm = intentModelCheckParm;
                return this;
            }

            /**
             * interval代表区间范围开始
             */
            public Builder interval(Integer interval) {
                this.interval = interval;
                return this;
            }

            /**
             * intervalEnd 代表区间范围结束
             */
            public Builder intervalEnd(Integer intervalEnd) {
                this.intervalEnd = intervalEnd;
                return this;
            }

            /**
             * 关键字扩展
             */
            public Builder keywordExtension(Integer keywordExtension) {
                this.keywordExtension = keywordExtension;
                return this;
            }

            /**
             * 匹配到的关键字数量
             */
            public Builder keywordMatchSize(Integer keywordMatchSize) {
                this.keywordMatchSize = keywordMatchSize;
                return this;
            }

            /**
             * 关键词
             */
            public Builder keywords(Keywords keywords) {
                this.keywords = keywords;
                return this;
            }

            /**
             * 能量值变化，默认3, 1~9
             */
            public Builder maxEmotionChangeValue(Integer maxEmotionChangeValue) {
                this.maxEmotionChangeValue = maxEmotionChangeValue;
                return this;
            }

            /**
             * 句子中最少字数，小于此字数的句子不检查
             */
            public Builder minWordSize(Integer minWordSize) {
                this.minWordSize = minWordSize;
                return this;
            }

            /**
             * true表示取不同角色相邻的两句话，false表示取不同角色的第一句话比较响应时间（默认）
             */
            public Builder nearDialogue(Boolean nearDialogue) {
                this.nearDialogue = nearDialogue;
                return this;
            }

            /**
             * 排除的正则表达式
             */
            public Builder notRegex(String notRegex) {
                this.notRegex = notRegex;
                return this;
            }

            /**
             * 语句
             */
            public Builder phrase(String phrase) {
                this.phrase = phrase;
                return this;
            }

            /**
             * 正则表达式
             */
            public Builder regex(String regex) {
                this.regex = regex;
                return this;
            }

            /**
             * target
             */
            public Builder target(Integer target) {
                this.target = target;
                return this;
            }

            /**
             * 阈值
             */
            public Builder threshold(Float threshold) {
                this.threshold = threshold;
                return this;
            }

            public Param build() {
                return new Param(this);
            } 

        } 

    }
    public static class Operator extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Oid")
        private String oid;

        @com.aliyun.core.annotation.NameInMap("Param")
        private Param param;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private Operator(Builder builder) {
            this.id = builder.id;
            this.name = builder.name;
            this.oid = builder.oid;
            this.param = builder.param;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Operator create() {
            return builder().build();
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return oid
         */
        public String getOid() {
            return this.oid;
        }

        /**
         * @return param
         */
        public Param getParam() {
            return this.param;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private Long id; 
            private String name; 
            private String oid; 
            private Param param; 
            private String type; 

            /**
             * 主键id
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * 算子名
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * 可能是主键id，也可能是前端生成的id
             */
            public Builder oid(String oid) {
                this.oid = oid;
                return this;
            }

            /**
             * 算子参数
             */
            public Builder param(Param param) {
                this.param = param;
                return this;
            }

            /**
             * 算子类别
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Operator build() {
                return new Operator(this);
            } 

        } 

    }
    public static class Operators extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Operator")
        private java.util.List < Operator> operator;

        private Operators(Builder builder) {
            this.operator = builder.operator;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Operators create() {
            return builder().build();
        }

        /**
         * @return operator
         */
        public java.util.List < Operator> getOperator() {
            return this.operator;
        }

        public static final class Builder {
            private java.util.List < Operator> operator; 

            /**
             * Operator.
             */
            public Builder operator(java.util.List < Operator> operator) {
                this.operator = operator;
                return this;
            }

            public Operators build() {
                return new Operators(this);
            } 

        } 

    }
    public static class Conditions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Check_range")
        private CheckRange checkRange;

        @com.aliyun.core.annotation.NameInMap("Cid")
        private String cid;

        @com.aliyun.core.annotation.NameInMap("Exclusion")
        private Integer exclusion;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("Lambda")
        private String lambda;

        @com.aliyun.core.annotation.NameInMap("Operators")
        private Operators operators;

        @com.aliyun.core.annotation.NameInMap("Rid")
        private String rid;

        private Conditions(Builder builder) {
            this.checkRange = builder.checkRange;
            this.cid = builder.cid;
            this.exclusion = builder.exclusion;
            this.id = builder.id;
            this.lambda = builder.lambda;
            this.operators = builder.operators;
            this.rid = builder.rid;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Conditions create() {
            return builder().build();
        }

        /**
         * @return checkRange
         */
        public CheckRange getCheckRange() {
            return this.checkRange;
        }

        /**
         * @return cid
         */
        public String getCid() {
            return this.cid;
        }

        /**
         * @return exclusion
         */
        public Integer getExclusion() {
            return this.exclusion;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return lambda
         */
        public String getLambda() {
            return this.lambda;
        }

        /**
         * @return operators
         */
        public Operators getOperators() {
            return this.operators;
        }

        /**
         * @return rid
         */
        public String getRid() {
            return this.rid;
        }

        public static final class Builder {
            private CheckRange checkRange; 
            private String cid; 
            private Integer exclusion; 
            private Long id; 
            private String lambda; 
            private Operators operators; 
            private String rid; 

            /**
             * 检测范围
             */
            public Builder checkRange(CheckRange checkRange) {
                this.checkRange = checkRange;
                return this;
            }

            /**
             * 条件id，可能是db中的主键，也可能是转换成的a, b, c
             */
            public Builder cid(String cid) {
                this.cid = cid;
                return this;
            }

            /**
             * 排除
             */
            public Builder exclusion(Integer exclusion) {
                this.exclusion = exclusion;
                return this;
            }

            /**
             * 在db中的主键
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * Lambda表达式：例如:a&&b
             */
            public Builder lambda(String lambda) {
                this.lambda = lambda;
                return this;
            }

            /**
             * 算子列表
             */
            public Builder operators(Operators operators) {
                this.operators = operators;
                return this;
            }

            /**
             * 条件所属的规则id
             */
            public Builder rid(String rid) {
                this.rid = rid;
                return this;
            }

            public Conditions build() {
                return new Conditions(this);
            } 

        } 

    }
    public static class HitResultConditions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Conditions")
        private java.util.List < Conditions> conditions;

        private HitResultConditions(Builder builder) {
            this.conditions = builder.conditions;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static HitResultConditions create() {
            return builder().build();
        }

        /**
         * @return conditions
         */
        public java.util.List < Conditions> getConditions() {
            return this.conditions;
        }

        public static final class Builder {
            private java.util.List < Conditions> conditions; 

            /**
             * Conditions.
             */
            public Builder conditions(java.util.List < Conditions> conditions) {
                this.conditions = conditions;
                return this;
            }

            public HitResultConditions build() {
                return new HitResultConditions(this);
            } 

        } 

    }
    public static class Cid extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Cid")
        private java.util.List < String > cid;

        private Cid(Builder builder) {
            this.cid = builder.cid;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Cid create() {
            return builder().build();
        }

        /**
         * @return cid
         */
        public java.util.List < String > getCid() {
            return this.cid;
        }

        public static final class Builder {
            private java.util.List < String > cid; 

            /**
             * 条件id，可能是db中的主键，也可能是转换成的a, b, c
             */
            public Builder cid(java.util.List < String > cid) {
                this.cid = cid;
                return this;
            }

            public Cid build() {
                return new Cid(this);
            } 

        } 

    }
    public static class KeyWord extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Cid")
        private String cid;

        @com.aliyun.core.annotation.NameInMap("From")
        private Integer from;

        @com.aliyun.core.annotation.NameInMap("To")
        private Integer to;

        @com.aliyun.core.annotation.NameInMap("Val")
        private String val;

        private KeyWord(Builder builder) {
            this.cid = builder.cid;
            this.from = builder.from;
            this.to = builder.to;
            this.val = builder.val;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static KeyWord create() {
            return builder().build();
        }

        /**
         * @return cid
         */
        public String getCid() {
            return this.cid;
        }

        /**
         * @return from
         */
        public Integer getFrom() {
            return this.from;
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
            private String cid; 
            private Integer from; 
            private Integer to; 
            private String val; 

            /**
             * 条件id，可能是db中的主键，也可能是转换成的a, b, c
             */
            public Builder cid(String cid) {
                this.cid = cid;
                return this;
            }

            /**
             * 上下文重复算子：检测当前句的前from句是否有重复；0表示前面的所有句
             */
            public Builder from(Integer from) {
                this.from = from;
                return this;
            }

            /**
             * 对话结束索引
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

            public KeyWord build() {
                return new KeyWord(this);
            } 

        } 

    }
    public static class KeyWords extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("KeyWord")
        private java.util.List < KeyWord> keyWord;

        private KeyWords(Builder builder) {
            this.keyWord = builder.keyWord;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static KeyWords create() {
            return builder().build();
        }

        /**
         * @return keyWord
         */
        public java.util.List < KeyWord> getKeyWord() {
            return this.keyWord;
        }

        public static final class Builder {
            private java.util.List < KeyWord> keyWord; 

            /**
             * KeyWord.
             */
            public Builder keyWord(java.util.List < KeyWord> keyWord) {
                this.keyWord = keyWord;
                return this;
            }

            public KeyWords build() {
                return new KeyWords(this);
            } 

        } 

    }
    public static class Phrase extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Begin")
        private Long begin;

        @com.aliyun.core.annotation.NameInMap("EmotionValue")
        private Integer emotionValue;

        @com.aliyun.core.annotation.NameInMap("End")
        private Integer end;

        @com.aliyun.core.annotation.NameInMap("Role")
        private String role;

        @com.aliyun.core.annotation.NameInMap("Words")
        private String words;

        private Phrase(Builder builder) {
            this.begin = builder.begin;
            this.emotionValue = builder.emotionValue;
            this.end = builder.end;
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
         * @return emotionValue
         */
        public Integer getEmotionValue() {
            return this.emotionValue;
        }

        /**
         * @return end
         */
        public Integer getEnd() {
            return this.end;
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
            private Integer emotionValue; 
            private Integer end; 
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
             * EmotionValue.
             */
            public Builder emotionValue(Integer emotionValue) {
                this.emotionValue = emotionValue;
                return this;
            }

            /**
             * End.
             */
            public Builder end(Integer end) {
                this.end = end;
                return this;
            }

            /**
             * 对应 RoleType.type
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
    public static class Hit extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Cid")
        private Cid cid;

        @com.aliyun.core.annotation.NameInMap("KeyWords")
        private KeyWords keyWords;

        @com.aliyun.core.annotation.NameInMap("Phrase")
        private Phrase phrase;

        private Hit(Builder builder) {
            this.cid = builder.cid;
            this.keyWords = builder.keyWords;
            this.phrase = builder.phrase;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Hit create() {
            return builder().build();
        }

        /**
         * @return cid
         */
        public Cid getCid() {
            return this.cid;
        }

        /**
         * @return keyWords
         */
        public KeyWords getKeyWords() {
            return this.keyWords;
        }

        /**
         * @return phrase
         */
        public Phrase getPhrase() {
            return this.phrase;
        }

        public static final class Builder {
            private Cid cid; 
            private KeyWords keyWords; 
            private Phrase phrase; 

            /**
             * 条件id，可能是db中的主键，也可能是转换成的a, b, c
             */
            public Builder cid(Cid cid) {
                this.cid = cid;
                return this;
            }

            /**
             * KeyWords.
             */
            public Builder keyWords(KeyWords keyWords) {
                this.keyWords = keyWords;
                return this;
            }

            /**
             * 语句
             */
            public Builder phrase(Phrase phrase) {
                this.phrase = phrase;
                return this;
            }

            public Hit build() {
                return new Hit(this);
            } 

        } 

    }
    public static class Hits extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Hit")
        private java.util.List < Hit> hit;

        private Hits(Builder builder) {
            this.hit = builder.hit;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Hits create() {
            return builder().build();
        }

        /**
         * @return hit
         */
        public java.util.List < Hit> getHit() {
            return this.hit;
        }

        public static final class Builder {
            private java.util.List < Hit> hit; 

            /**
             * Hit.
             */
            public Builder hit(java.util.List < Hit> hit) {
                this.hit = hit;
                return this;
            }

            public Hits build() {
                return new Hits(this);
            } 

        } 

    }
    public static class HitResult extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Conditions")
        private HitResultConditions conditions;

        @com.aliyun.core.annotation.NameInMap("Hits")
        private Hits hits;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("ReviewResult")
        private Integer reviewResult;

        @com.aliyun.core.annotation.NameInMap("Rid")
        private String rid;

        @com.aliyun.core.annotation.NameInMap("SchemeId")
        private Long schemeId;

        @com.aliyun.core.annotation.NameInMap("SchemeVersion")
        private Long schemeVersion;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private HitResult(Builder builder) {
            this.conditions = builder.conditions;
            this.hits = builder.hits;
            this.name = builder.name;
            this.reviewResult = builder.reviewResult;
            this.rid = builder.rid;
            this.schemeId = builder.schemeId;
            this.schemeVersion = builder.schemeVersion;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static HitResult create() {
            return builder().build();
        }

        /**
         * @return conditions
         */
        public HitResultConditions getConditions() {
            return this.conditions;
        }

        /**
         * @return hits
         */
        public Hits getHits() {
            return this.hits;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return reviewResult
         */
        public Integer getReviewResult() {
            return this.reviewResult;
        }

        /**
         * @return rid
         */
        public String getRid() {
            return this.rid;
        }

        /**
         * @return schemeId
         */
        public Long getSchemeId() {
            return this.schemeId;
        }

        /**
         * @return schemeVersion
         */
        public Long getSchemeVersion() {
            return this.schemeVersion;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private HitResultConditions conditions; 
            private Hits hits; 
            private String name; 
            private Integer reviewResult; 
            private String rid; 
            private Long schemeId; 
            private Long schemeVersion; 
            private String type; 

            /**
             * Conditions.
             */
            public Builder conditions(HitResultConditions conditions) {
                this.conditions = conditions;
                return this;
            }

            /**
             * Hits.
             */
            public Builder hits(Hits hits) {
                this.hits = hits;
                return this;
            }

            /**
             * 算子名
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * ReviewResult.
             */
            public Builder reviewResult(Integer reviewResult) {
                this.reviewResult = reviewResult;
                return this;
            }

            /**
             * 条件所属的规则id
             */
            public Builder rid(String rid) {
                this.rid = rid;
                return this;
            }

            /**
             * SchemeId.
             */
            public Builder schemeId(Long schemeId) {
                this.schemeId = schemeId;
                return this;
            }

            /**
             * SchemeVersion.
             */
            public Builder schemeVersion(Long schemeVersion) {
                this.schemeVersion = schemeVersion;
                return this;
            }

            /**
             * 算子类别
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public HitResult build() {
                return new HitResult(this);
            } 

        } 

    }
    public static class ResultInfoHitResult extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("HitResult")
        private java.util.List < HitResult> hitResult;

        private ResultInfoHitResult(Builder builder) {
            this.hitResult = builder.hitResult;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResultInfoHitResult create() {
            return builder().build();
        }

        /**
         * @return hitResult
         */
        public java.util.List < HitResult> getHitResult() {
            return this.hitResult;
        }

        public static final class Builder {
            private java.util.List < HitResult> hitResult; 

            /**
             * HitResult.
             */
            public Builder hitResult(java.util.List < HitResult> hitResult) {
                this.hitResult = hitResult;
                return this;
            }

            public ResultInfoHitResult build() {
                return new ResultInfoHitResult(this);
            } 

        } 

    }
    public static class HitScore extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("RuleId")
        private String ruleId;

        @com.aliyun.core.annotation.NameInMap("ScoreId")
        private String scoreId;

        @com.aliyun.core.annotation.NameInMap("ScoreName")
        private String scoreName;

        @com.aliyun.core.annotation.NameInMap("ScoreNumber")
        private String scoreNumber;

        private HitScore(Builder builder) {
            this.ruleId = builder.ruleId;
            this.scoreId = builder.scoreId;
            this.scoreName = builder.scoreName;
            this.scoreNumber = builder.scoreNumber;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static HitScore create() {
            return builder().build();
        }

        /**
         * @return ruleId
         */
        public String getRuleId() {
            return this.ruleId;
        }

        /**
         * @return scoreId
         */
        public String getScoreId() {
            return this.scoreId;
        }

        /**
         * @return scoreName
         */
        public String getScoreName() {
            return this.scoreName;
        }

        /**
         * @return scoreNumber
         */
        public String getScoreNumber() {
            return this.scoreNumber;
        }

        public static final class Builder {
            private String ruleId; 
            private String scoreId; 
            private String scoreName; 
            private String scoreNumber; 

            /**
             * RuleId.
             */
            public Builder ruleId(String ruleId) {
                this.ruleId = ruleId;
                return this;
            }

            /**
             * ScoreId.
             */
            public Builder scoreId(String scoreId) {
                this.scoreId = scoreId;
                return this;
            }

            /**
             * ScoreName.
             */
            public Builder scoreName(String scoreName) {
                this.scoreName = scoreName;
                return this;
            }

            /**
             * ScoreNumber.
             */
            public Builder scoreNumber(String scoreNumber) {
                this.scoreNumber = scoreNumber;
                return this;
            }

            public HitScore build() {
                return new HitScore(this);
            } 

        } 

    }
    public static class ResultInfoHitScore extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("HitScore")
        private java.util.List < HitScore> hitScore;

        private ResultInfoHitScore(Builder builder) {
            this.hitScore = builder.hitScore;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResultInfoHitScore create() {
            return builder().build();
        }

        /**
         * @return hitScore
         */
        public java.util.List < HitScore> getHitScore() {
            return this.hitScore;
        }

        public static final class Builder {
            private java.util.List < HitScore> hitScore; 

            /**
             * HitScore.
             */
            public Builder hitScore(java.util.List < HitScore> hitScore) {
                this.hitScore = hitScore;
                return this;
            }

            public ResultInfoHitScore build() {
                return new ResultInfoHitScore(this);
            } 

        } 

    }
    public static class Recording extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Business")
        private String business;

        @com.aliyun.core.annotation.NameInMap("CallId")
        private String callId;

        @com.aliyun.core.annotation.NameInMap("CallTime")
        private String callTime;

        @com.aliyun.core.annotation.NameInMap("CallType")
        private Integer callType;

        @com.aliyun.core.annotation.NameInMap("Callee")
        private String callee;

        @com.aliyun.core.annotation.NameInMap("Caller")
        private String caller;

        @com.aliyun.core.annotation.NameInMap("DataSetName")
        private String dataSetName;

        @com.aliyun.core.annotation.NameInMap("DialogueSize")
        private Integer dialogueSize;

        @com.aliyun.core.annotation.NameInMap("Duration")
        private Long duration;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("PrimaryId")
        private String primaryId;

        @com.aliyun.core.annotation.NameInMap("Remark1")
        private String remark1;

        @com.aliyun.core.annotation.NameInMap("Remark10")
        private String remark10;

        @com.aliyun.core.annotation.NameInMap("Remark11")
        private String remark11;

        @com.aliyun.core.annotation.NameInMap("Remark12")
        private String remark12;

        @com.aliyun.core.annotation.NameInMap("Remark13")
        private String remark13;

        @com.aliyun.core.annotation.NameInMap("Remark2")
        private String remark2;

        @com.aliyun.core.annotation.NameInMap("Remark3")
        private String remark3;

        @com.aliyun.core.annotation.NameInMap("Remark4")
        private String remark4;

        @com.aliyun.core.annotation.NameInMap("Remark5")
        private Long remark5;

        @com.aliyun.core.annotation.NameInMap("Remark6")
        private String remark6;

        @com.aliyun.core.annotation.NameInMap("Remark7")
        private String remark7;

        @com.aliyun.core.annotation.NameInMap("Remark8")
        private String remark8;

        @com.aliyun.core.annotation.NameInMap("Remark9")
        private String remark9;

        @com.aliyun.core.annotation.NameInMap("TaskConfigId")
        private Long taskConfigId;

        @com.aliyun.core.annotation.NameInMap("TaskConfigName")
        private String taskConfigName;

        @com.aliyun.core.annotation.NameInMap("Url")
        private String url;

        private Recording(Builder builder) {
            this.business = builder.business;
            this.callId = builder.callId;
            this.callTime = builder.callTime;
            this.callType = builder.callType;
            this.callee = builder.callee;
            this.caller = builder.caller;
            this.dataSetName = builder.dataSetName;
            this.dialogueSize = builder.dialogueSize;
            this.duration = builder.duration;
            this.id = builder.id;
            this.name = builder.name;
            this.primaryId = builder.primaryId;
            this.remark1 = builder.remark1;
            this.remark10 = builder.remark10;
            this.remark11 = builder.remark11;
            this.remark12 = builder.remark12;
            this.remark13 = builder.remark13;
            this.remark2 = builder.remark2;
            this.remark3 = builder.remark3;
            this.remark4 = builder.remark4;
            this.remark5 = builder.remark5;
            this.remark6 = builder.remark6;
            this.remark7 = builder.remark7;
            this.remark8 = builder.remark8;
            this.remark9 = builder.remark9;
            this.taskConfigId = builder.taskConfigId;
            this.taskConfigName = builder.taskConfigName;
            this.url = builder.url;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Recording create() {
            return builder().build();
        }

        /**
         * @return business
         */
        public String getBusiness() {
            return this.business;
        }

        /**
         * @return callId
         */
        public String getCallId() {
            return this.callId;
        }

        /**
         * @return callTime
         */
        public String getCallTime() {
            return this.callTime;
        }

        /**
         * @return callType
         */
        public Integer getCallType() {
            return this.callType;
        }

        /**
         * @return callee
         */
        public String getCallee() {
            return this.callee;
        }

        /**
         * @return caller
         */
        public String getCaller() {
            return this.caller;
        }

        /**
         * @return dataSetName
         */
        public String getDataSetName() {
            return this.dataSetName;
        }

        /**
         * @return dialogueSize
         */
        public Integer getDialogueSize() {
            return this.dialogueSize;
        }

        /**
         * @return duration
         */
        public Long getDuration() {
            return this.duration;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return primaryId
         */
        public String getPrimaryId() {
            return this.primaryId;
        }

        /**
         * @return remark1
         */
        public String getRemark1() {
            return this.remark1;
        }

        /**
         * @return remark10
         */
        public String getRemark10() {
            return this.remark10;
        }

        /**
         * @return remark11
         */
        public String getRemark11() {
            return this.remark11;
        }

        /**
         * @return remark12
         */
        public String getRemark12() {
            return this.remark12;
        }

        /**
         * @return remark13
         */
        public String getRemark13() {
            return this.remark13;
        }

        /**
         * @return remark2
         */
        public String getRemark2() {
            return this.remark2;
        }

        /**
         * @return remark3
         */
        public String getRemark3() {
            return this.remark3;
        }

        /**
         * @return remark4
         */
        public String getRemark4() {
            return this.remark4;
        }

        /**
         * @return remark5
         */
        public Long getRemark5() {
            return this.remark5;
        }

        /**
         * @return remark6
         */
        public String getRemark6() {
            return this.remark6;
        }

        /**
         * @return remark7
         */
        public String getRemark7() {
            return this.remark7;
        }

        /**
         * @return remark8
         */
        public String getRemark8() {
            return this.remark8;
        }

        /**
         * @return remark9
         */
        public String getRemark9() {
            return this.remark9;
        }

        /**
         * @return taskConfigId
         */
        public Long getTaskConfigId() {
            return this.taskConfigId;
        }

        /**
         * @return taskConfigName
         */
        public String getTaskConfigName() {
            return this.taskConfigName;
        }

        /**
         * @return url
         */
        public String getUrl() {
            return this.url;
        }

        public static final class Builder {
            private String business; 
            private String callId; 
            private String callTime; 
            private Integer callType; 
            private String callee; 
            private String caller; 
            private String dataSetName; 
            private Integer dialogueSize; 
            private Long duration; 
            private String id; 
            private String name; 
            private String primaryId; 
            private String remark1; 
            private String remark10; 
            private String remark11; 
            private String remark12; 
            private String remark13; 
            private String remark2; 
            private String remark3; 
            private String remark4; 
            private Long remark5; 
            private String remark6; 
            private String remark7; 
            private String remark8; 
            private String remark9; 
            private Long taskConfigId; 
            private String taskConfigName; 
            private String url; 

            /**
             * Business.
             */
            public Builder business(String business) {
                this.business = business;
                return this;
            }

            /**
             * CallId.
             */
            public Builder callId(String callId) {
                this.callId = callId;
                return this;
            }

            /**
             * CallTime.
             */
            public Builder callTime(String callTime) {
                this.callTime = callTime;
                return this;
            }

            /**
             * CallType.
             */
            public Builder callType(Integer callType) {
                this.callType = callType;
                return this;
            }

            /**
             * Callee.
             */
            public Builder callee(String callee) {
                this.callee = callee;
                return this;
            }

            /**
             * Caller.
             */
            public Builder caller(String caller) {
                this.caller = caller;
                return this;
            }

            /**
             * DataSetName.
             */
            public Builder dataSetName(String dataSetName) {
                this.dataSetName = dataSetName;
                return this;
            }

            /**
             * DialogueSize.
             */
            public Builder dialogueSize(Integer dialogueSize) {
                this.dialogueSize = dialogueSize;
                return this;
            }

            /**
             * Duration.
             */
            public Builder duration(Long duration) {
                this.duration = duration;
                return this;
            }

            /**
             * 在db中的主键
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * 算子名
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * PrimaryId.
             */
            public Builder primaryId(String primaryId) {
                this.primaryId = primaryId;
                return this;
            }

            /**
             * Remark1.
             */
            public Builder remark1(String remark1) {
                this.remark1 = remark1;
                return this;
            }

            /**
             * Remark10.
             */
            public Builder remark10(String remark10) {
                this.remark10 = remark10;
                return this;
            }

            /**
             * Remark11.
             */
            public Builder remark11(String remark11) {
                this.remark11 = remark11;
                return this;
            }

            /**
             * Remark12.
             */
            public Builder remark12(String remark12) {
                this.remark12 = remark12;
                return this;
            }

            /**
             * Remark13.
             */
            public Builder remark13(String remark13) {
                this.remark13 = remark13;
                return this;
            }

            /**
             * Remark2.
             */
            public Builder remark2(String remark2) {
                this.remark2 = remark2;
                return this;
            }

            /**
             * Remark3.
             */
            public Builder remark3(String remark3) {
                this.remark3 = remark3;
                return this;
            }

            /**
             * Remark4.
             */
            public Builder remark4(String remark4) {
                this.remark4 = remark4;
                return this;
            }

            /**
             * Remark5.
             */
            public Builder remark5(Long remark5) {
                this.remark5 = remark5;
                return this;
            }

            /**
             * Remark6.
             */
            public Builder remark6(String remark6) {
                this.remark6 = remark6;
                return this;
            }

            /**
             * Remark7.
             */
            public Builder remark7(String remark7) {
                this.remark7 = remark7;
                return this;
            }

            /**
             * Remark8.
             */
            public Builder remark8(String remark8) {
                this.remark8 = remark8;
                return this;
            }

            /**
             * Remark9.
             */
            public Builder remark9(String remark9) {
                this.remark9 = remark9;
                return this;
            }

            /**
             * TaskConfigId.
             */
            public Builder taskConfigId(Long taskConfigId) {
                this.taskConfigId = taskConfigId;
                return this;
            }

            /**
             * TaskConfigName.
             */
            public Builder taskConfigName(String taskConfigName) {
                this.taskConfigName = taskConfigName;
                return this;
            }

            /**
             * Url.
             */
            public Builder url(String url) {
                this.url = url;
                return this;
            }

            public Recording build() {
                return new Recording(this);
            } 

        } 

    }
    public static class ReviewRightRule extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("rid")
        private Long rid;

        @com.aliyun.core.annotation.NameInMap("ruleName")
        private String ruleName;

        private ReviewRightRule(Builder builder) {
            this.rid = builder.rid;
            this.ruleName = builder.ruleName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ReviewRightRule create() {
            return builder().build();
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

        public static final class Builder {
            private Long rid; 
            private String ruleName; 

            /**
             * rid.
             */
            public Builder rid(Long rid) {
                this.rid = rid;
                return this;
            }

            /**
             * ruleName.
             */
            public Builder ruleName(String ruleName) {
                this.ruleName = ruleName;
                return this;
            }

            public ReviewRightRule build() {
                return new ReviewRightRule(this);
            } 

        } 

    }
    public static class ReviewHistoryReviewRightRule extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ReviewRightRule")
        private java.util.List < ReviewRightRule> reviewRightRule;

        private ReviewHistoryReviewRightRule(Builder builder) {
            this.reviewRightRule = builder.reviewRightRule;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ReviewHistoryReviewRightRule create() {
            return builder().build();
        }

        /**
         * @return reviewRightRule
         */
        public java.util.List < ReviewRightRule> getReviewRightRule() {
            return this.reviewRightRule;
        }

        public static final class Builder {
            private java.util.List < ReviewRightRule> reviewRightRule; 

            /**
             * ReviewRightRule.
             */
            public Builder reviewRightRule(java.util.List < ReviewRightRule> reviewRightRule) {
                this.reviewRightRule = reviewRightRule;
                return this;
            }

            public ReviewHistoryReviewRightRule build() {
                return new ReviewHistoryReviewRightRule(this);
            } 

        } 

    }
    public static class ReviewHistory extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Comments")
        private String comments;

        @com.aliyun.core.annotation.NameInMap("ComplainResult")
        private Integer complainResult;

        @com.aliyun.core.annotation.NameInMap("OldScore")
        private Integer oldScore;

        @com.aliyun.core.annotation.NameInMap("Operator")
        private Long operator;

        @com.aliyun.core.annotation.NameInMap("OperatorName")
        private String operatorName;

        @com.aliyun.core.annotation.NameInMap("ReviewManagerType")
        private String reviewManagerType;

        @com.aliyun.core.annotation.NameInMap("ReviewResult")
        private Integer reviewResult;

        @com.aliyun.core.annotation.NameInMap("ReviewRightRule")
        private ReviewHistoryReviewRightRule reviewRightRule;

        @com.aliyun.core.annotation.NameInMap("Score")
        private Integer score;

        @com.aliyun.core.annotation.NameInMap("Time")
        private Long time;

        @com.aliyun.core.annotation.NameInMap("TimeStr")
        private String timeStr;

        @com.aliyun.core.annotation.NameInMap("Type")
        private Integer type;

        private ReviewHistory(Builder builder) {
            this.comments = builder.comments;
            this.complainResult = builder.complainResult;
            this.oldScore = builder.oldScore;
            this.operator = builder.operator;
            this.operatorName = builder.operatorName;
            this.reviewManagerType = builder.reviewManagerType;
            this.reviewResult = builder.reviewResult;
            this.reviewRightRule = builder.reviewRightRule;
            this.score = builder.score;
            this.time = builder.time;
            this.timeStr = builder.timeStr;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ReviewHistory create() {
            return builder().build();
        }

        /**
         * @return comments
         */
        public String getComments() {
            return this.comments;
        }

        /**
         * @return complainResult
         */
        public Integer getComplainResult() {
            return this.complainResult;
        }

        /**
         * @return oldScore
         */
        public Integer getOldScore() {
            return this.oldScore;
        }

        /**
         * @return operator
         */
        public Long getOperator() {
            return this.operator;
        }

        /**
         * @return operatorName
         */
        public String getOperatorName() {
            return this.operatorName;
        }

        /**
         * @return reviewManagerType
         */
        public String getReviewManagerType() {
            return this.reviewManagerType;
        }

        /**
         * @return reviewResult
         */
        public Integer getReviewResult() {
            return this.reviewResult;
        }

        /**
         * @return reviewRightRule
         */
        public ReviewHistoryReviewRightRule getReviewRightRule() {
            return this.reviewRightRule;
        }

        /**
         * @return score
         */
        public Integer getScore() {
            return this.score;
        }

        /**
         * @return time
         */
        public Long getTime() {
            return this.time;
        }

        /**
         * @return timeStr
         */
        public String getTimeStr() {
            return this.timeStr;
        }

        /**
         * @return type
         */
        public Integer getType() {
            return this.type;
        }

        public static final class Builder {
            private String comments; 
            private Integer complainResult; 
            private Integer oldScore; 
            private Long operator; 
            private String operatorName; 
            private String reviewManagerType; 
            private Integer reviewResult; 
            private ReviewHistoryReviewRightRule reviewRightRule; 
            private Integer score; 
            private Long time; 
            private String timeStr; 
            private Integer type; 

            /**
             * Comments.
             */
            public Builder comments(String comments) {
                this.comments = comments;
                return this;
            }

            /**
             * ComplainResult.
             */
            public Builder complainResult(Integer complainResult) {
                this.complainResult = complainResult;
                return this;
            }

            /**
             * OldScore.
             */
            public Builder oldScore(Integer oldScore) {
                this.oldScore = oldScore;
                return this;
            }

            /**
             * Operator.
             */
            public Builder operator(Long operator) {
                this.operator = operator;
                return this;
            }

            /**
             * OperatorName.
             */
            public Builder operatorName(String operatorName) {
                this.operatorName = operatorName;
                return this;
            }

            /**
             * ReviewManagerType.
             */
            public Builder reviewManagerType(String reviewManagerType) {
                this.reviewManagerType = reviewManagerType;
                return this;
            }

            /**
             * ReviewResult.
             */
            public Builder reviewResult(Integer reviewResult) {
                this.reviewResult = reviewResult;
                return this;
            }

            /**
             * ReviewRightRule.
             */
            public Builder reviewRightRule(ReviewHistoryReviewRightRule reviewRightRule) {
                this.reviewRightRule = reviewRightRule;
                return this;
            }

            /**
             * Score.
             */
            public Builder score(Integer score) {
                this.score = score;
                return this;
            }

            /**
             * Time.
             */
            public Builder time(Long time) {
                this.time = time;
                return this;
            }

            /**
             * TimeStr.
             */
            public Builder timeStr(String timeStr) {
                this.timeStr = timeStr;
                return this;
            }

            /**
             * 算子类别
             */
            public Builder type(Integer type) {
                this.type = type;
                return this;
            }

            public ReviewHistory build() {
                return new ReviewHistory(this);
            } 

        } 

    }
    public static class ReviewHistoryList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ReviewHistory")
        private java.util.List < ReviewHistory> reviewHistory;

        private ReviewHistoryList(Builder builder) {
            this.reviewHistory = builder.reviewHistory;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ReviewHistoryList create() {
            return builder().build();
        }

        /**
         * @return reviewHistory
         */
        public java.util.List < ReviewHistory> getReviewHistory() {
            return this.reviewHistory;
        }

        public static final class Builder {
            private java.util.List < ReviewHistory> reviewHistory; 

            /**
             * ReviewHistory.
             */
            public Builder reviewHistory(java.util.List < ReviewHistory> reviewHistory) {
                this.reviewHistory = reviewHistory;
                return this;
            }

            public ReviewHistoryList build() {
                return new ReviewHistoryList(this);
            } 

        } 

    }
    public static class ReviewKeyIdList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ReviewKeyIdList")
        private java.util.List < Long > reviewKeyIdList;

        private ReviewKeyIdList(Builder builder) {
            this.reviewKeyIdList = builder.reviewKeyIdList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ReviewKeyIdList create() {
            return builder().build();
        }

        /**
         * @return reviewKeyIdList
         */
        public java.util.List < Long > getReviewKeyIdList() {
            return this.reviewKeyIdList;
        }

        public static final class Builder {
            private java.util.List < Long > reviewKeyIdList; 

            /**
             * ReviewKeyIdList.
             */
            public Builder reviewKeyIdList(java.util.List < Long > reviewKeyIdList) {
                this.reviewKeyIdList = reviewKeyIdList;
                return this;
            }

            public ReviewKeyIdList build() {
                return new ReviewKeyIdList(this);
            } 

        } 

    }
    public static class ReviewTypeIdList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ReviewKeyIdList")
        private ReviewKeyIdList reviewKeyIdList;

        @com.aliyun.core.annotation.NameInMap("ReviewTypeId")
        private Long reviewTypeId;

        private ReviewTypeIdList(Builder builder) {
            this.reviewKeyIdList = builder.reviewKeyIdList;
            this.reviewTypeId = builder.reviewTypeId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ReviewTypeIdList create() {
            return builder().build();
        }

        /**
         * @return reviewKeyIdList
         */
        public ReviewKeyIdList getReviewKeyIdList() {
            return this.reviewKeyIdList;
        }

        /**
         * @return reviewTypeId
         */
        public Long getReviewTypeId() {
            return this.reviewTypeId;
        }

        public static final class Builder {
            private ReviewKeyIdList reviewKeyIdList; 
            private Long reviewTypeId; 

            /**
             * ReviewKeyIdList.
             */
            public Builder reviewKeyIdList(ReviewKeyIdList reviewKeyIdList) {
                this.reviewKeyIdList = reviewKeyIdList;
                return this;
            }

            /**
             * ReviewTypeId.
             */
            public Builder reviewTypeId(Long reviewTypeId) {
                this.reviewTypeId = reviewTypeId;
                return this;
            }

            public ReviewTypeIdList build() {
                return new ReviewTypeIdList(this);
            } 

        } 

    }
    public static class ResultInfoReviewTypeIdList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ReviewTypeIdList")
        private java.util.List < ReviewTypeIdList> reviewTypeIdList;

        private ResultInfoReviewTypeIdList(Builder builder) {
            this.reviewTypeIdList = builder.reviewTypeIdList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResultInfoReviewTypeIdList create() {
            return builder().build();
        }

        /**
         * @return reviewTypeIdList
         */
        public java.util.List < ReviewTypeIdList> getReviewTypeIdList() {
            return this.reviewTypeIdList;
        }

        public static final class Builder {
            private java.util.List < ReviewTypeIdList> reviewTypeIdList; 

            /**
             * ReviewTypeIdList.
             */
            public Builder reviewTypeIdList(java.util.List < ReviewTypeIdList> reviewTypeIdList) {
                this.reviewTypeIdList = reviewTypeIdList;
                return this;
            }

            public ResultInfoReviewTypeIdList build() {
                return new ResultInfoReviewTypeIdList(this);
            } 

        } 

    }
    public static class SchemeIdList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SchemeIdList")
        private java.util.List < Long > schemeIdList;

        private SchemeIdList(Builder builder) {
            this.schemeIdList = builder.schemeIdList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SchemeIdList create() {
            return builder().build();
        }

        /**
         * @return schemeIdList
         */
        public java.util.List < Long > getSchemeIdList() {
            return this.schemeIdList;
        }

        public static final class Builder {
            private java.util.List < Long > schemeIdList; 

            /**
             * SchemeIdList.
             */
            public Builder schemeIdList(java.util.List < Long > schemeIdList) {
                this.schemeIdList = schemeIdList;
                return this;
            }

            public SchemeIdList build() {
                return new SchemeIdList(this);
            } 

        } 

    }
    public static class SchemeNameList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SchemeNameList")
        private java.util.List < String > schemeNameList;

        private SchemeNameList(Builder builder) {
            this.schemeNameList = builder.schemeNameList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SchemeNameList create() {
            return builder().build();
        }

        /**
         * @return schemeNameList
         */
        public java.util.List < String > getSchemeNameList() {
            return this.schemeNameList;
        }

        public static final class Builder {
            private java.util.List < String > schemeNameList; 

            /**
             * SchemeNameList.
             */
            public Builder schemeNameList(java.util.List < String > schemeNameList) {
                this.schemeNameList = schemeNameList;
                return this;
            }

            public SchemeNameList build() {
                return new SchemeNameList(this);
            } 

        } 

    }
    public static class ResultInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Agent")
        private Agent agent;

        @com.aliyun.core.annotation.NameInMap("AsrResult")
        private ResultInfoAsrResult asrResult;

        @com.aliyun.core.annotation.NameInMap("AssignmentTime")
        private String assignmentTime;

        @com.aliyun.core.annotation.NameInMap("Comments")
        private String comments;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("CreateTimeLong")
        private String createTimeLong;

        @com.aliyun.core.annotation.NameInMap("ErrorMessage")
        private String errorMessage;

        @com.aliyun.core.annotation.NameInMap("HitResult")
        private ResultInfoHitResult hitResult;

        @com.aliyun.core.annotation.NameInMap("HitScore")
        private ResultInfoHitScore hitScore;

        @com.aliyun.core.annotation.NameInMap("LastDataId")
        private String lastDataId;

        @com.aliyun.core.annotation.NameInMap("Recording")
        private Recording recording;

        @com.aliyun.core.annotation.NameInMap("Resolver")
        private String resolver;

        @com.aliyun.core.annotation.NameInMap("ReviewHistoryList")
        private ReviewHistoryList reviewHistoryList;

        @com.aliyun.core.annotation.NameInMap("ReviewResult")
        private Integer reviewResult;

        @com.aliyun.core.annotation.NameInMap("ReviewStatus")
        private Integer reviewStatus;

        @com.aliyun.core.annotation.NameInMap("ReviewTime")
        private String reviewTime;

        @com.aliyun.core.annotation.NameInMap("ReviewTimeLong")
        private String reviewTimeLong;

        @com.aliyun.core.annotation.NameInMap("ReviewType")
        private Integer reviewType;

        @com.aliyun.core.annotation.NameInMap("ReviewTypeIdList")
        private ResultInfoReviewTypeIdList reviewTypeIdList;

        @com.aliyun.core.annotation.NameInMap("Reviewer")
        private String reviewer;

        @com.aliyun.core.annotation.NameInMap("SchemeIdList")
        private SchemeIdList schemeIdList;

        @com.aliyun.core.annotation.NameInMap("SchemeNameList")
        private SchemeNameList schemeNameList;

        @com.aliyun.core.annotation.NameInMap("Score")
        private Integer score;

        @com.aliyun.core.annotation.NameInMap("Status")
        private Integer status;

        @com.aliyun.core.annotation.NameInMap("TaskId")
        private String taskId;

        @com.aliyun.core.annotation.NameInMap("TaskName")
        private String taskName;

        private ResultInfo(Builder builder) {
            this.agent = builder.agent;
            this.asrResult = builder.asrResult;
            this.assignmentTime = builder.assignmentTime;
            this.comments = builder.comments;
            this.createTime = builder.createTime;
            this.createTimeLong = builder.createTimeLong;
            this.errorMessage = builder.errorMessage;
            this.hitResult = builder.hitResult;
            this.hitScore = builder.hitScore;
            this.lastDataId = builder.lastDataId;
            this.recording = builder.recording;
            this.resolver = builder.resolver;
            this.reviewHistoryList = builder.reviewHistoryList;
            this.reviewResult = builder.reviewResult;
            this.reviewStatus = builder.reviewStatus;
            this.reviewTime = builder.reviewTime;
            this.reviewTimeLong = builder.reviewTimeLong;
            this.reviewType = builder.reviewType;
            this.reviewTypeIdList = builder.reviewTypeIdList;
            this.reviewer = builder.reviewer;
            this.schemeIdList = builder.schemeIdList;
            this.schemeNameList = builder.schemeNameList;
            this.score = builder.score;
            this.status = builder.status;
            this.taskId = builder.taskId;
            this.taskName = builder.taskName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResultInfo create() {
            return builder().build();
        }

        /**
         * @return agent
         */
        public Agent getAgent() {
            return this.agent;
        }

        /**
         * @return asrResult
         */
        public ResultInfoAsrResult getAsrResult() {
            return this.asrResult;
        }

        /**
         * @return assignmentTime
         */
        public String getAssignmentTime() {
            return this.assignmentTime;
        }

        /**
         * @return comments
         */
        public String getComments() {
            return this.comments;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return createTimeLong
         */
        public String getCreateTimeLong() {
            return this.createTimeLong;
        }

        /**
         * @return errorMessage
         */
        public String getErrorMessage() {
            return this.errorMessage;
        }

        /**
         * @return hitResult
         */
        public ResultInfoHitResult getHitResult() {
            return this.hitResult;
        }

        /**
         * @return hitScore
         */
        public ResultInfoHitScore getHitScore() {
            return this.hitScore;
        }

        /**
         * @return lastDataId
         */
        public String getLastDataId() {
            return this.lastDataId;
        }

        /**
         * @return recording
         */
        public Recording getRecording() {
            return this.recording;
        }

        /**
         * @return resolver
         */
        public String getResolver() {
            return this.resolver;
        }

        /**
         * @return reviewHistoryList
         */
        public ReviewHistoryList getReviewHistoryList() {
            return this.reviewHistoryList;
        }

        /**
         * @return reviewResult
         */
        public Integer getReviewResult() {
            return this.reviewResult;
        }

        /**
         * @return reviewStatus
         */
        public Integer getReviewStatus() {
            return this.reviewStatus;
        }

        /**
         * @return reviewTime
         */
        public String getReviewTime() {
            return this.reviewTime;
        }

        /**
         * @return reviewTimeLong
         */
        public String getReviewTimeLong() {
            return this.reviewTimeLong;
        }

        /**
         * @return reviewType
         */
        public Integer getReviewType() {
            return this.reviewType;
        }

        /**
         * @return reviewTypeIdList
         */
        public ResultInfoReviewTypeIdList getReviewTypeIdList() {
            return this.reviewTypeIdList;
        }

        /**
         * @return reviewer
         */
        public String getReviewer() {
            return this.reviewer;
        }

        /**
         * @return schemeIdList
         */
        public SchemeIdList getSchemeIdList() {
            return this.schemeIdList;
        }

        /**
         * @return schemeNameList
         */
        public SchemeNameList getSchemeNameList() {
            return this.schemeNameList;
        }

        /**
         * @return score
         */
        public Integer getScore() {
            return this.score;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        /**
         * @return taskId
         */
        public String getTaskId() {
            return this.taskId;
        }

        /**
         * @return taskName
         */
        public String getTaskName() {
            return this.taskName;
        }

        public static final class Builder {
            private Agent agent; 
            private ResultInfoAsrResult asrResult; 
            private String assignmentTime; 
            private String comments; 
            private String createTime; 
            private String createTimeLong; 
            private String errorMessage; 
            private ResultInfoHitResult hitResult; 
            private ResultInfoHitScore hitScore; 
            private String lastDataId; 
            private Recording recording; 
            private String resolver; 
            private ReviewHistoryList reviewHistoryList; 
            private Integer reviewResult; 
            private Integer reviewStatus; 
            private String reviewTime; 
            private String reviewTimeLong; 
            private Integer reviewType; 
            private ResultInfoReviewTypeIdList reviewTypeIdList; 
            private String reviewer; 
            private SchemeIdList schemeIdList; 
            private SchemeNameList schemeNameList; 
            private Integer score; 
            private Integer status; 
            private String taskId; 
            private String taskName; 

            /**
             * Agent.
             */
            public Builder agent(Agent agent) {
                this.agent = agent;
                return this;
            }

            /**
             * AsrResult.
             */
            public Builder asrResult(ResultInfoAsrResult asrResult) {
                this.asrResult = asrResult;
                return this;
            }

            /**
             * AssignmentTime.
             */
            public Builder assignmentTime(String assignmentTime) {
                this.assignmentTime = assignmentTime;
                return this;
            }

            /**
             * Comments.
             */
            public Builder comments(String comments) {
                this.comments = comments;
                return this;
            }

            /**
             * CreateTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * CreateTimeLong.
             */
            public Builder createTimeLong(String createTimeLong) {
                this.createTimeLong = createTimeLong;
                return this;
            }

            /**
             * ErrorMessage.
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * HitResult.
             */
            public Builder hitResult(ResultInfoHitResult hitResult) {
                this.hitResult = hitResult;
                return this;
            }

            /**
             * HitScore.
             */
            public Builder hitScore(ResultInfoHitScore hitScore) {
                this.hitScore = hitScore;
                return this;
            }

            /**
             * LastDataId.
             */
            public Builder lastDataId(String lastDataId) {
                this.lastDataId = lastDataId;
                return this;
            }

            /**
             * Recording.
             */
            public Builder recording(Recording recording) {
                this.recording = recording;
                return this;
            }

            /**
             * Resolver.
             */
            public Builder resolver(String resolver) {
                this.resolver = resolver;
                return this;
            }

            /**
             * ReviewHistoryList.
             */
            public Builder reviewHistoryList(ReviewHistoryList reviewHistoryList) {
                this.reviewHistoryList = reviewHistoryList;
                return this;
            }

            /**
             * ReviewResult.
             */
            public Builder reviewResult(Integer reviewResult) {
                this.reviewResult = reviewResult;
                return this;
            }

            /**
             * ReviewStatus.
             */
            public Builder reviewStatus(Integer reviewStatus) {
                this.reviewStatus = reviewStatus;
                return this;
            }

            /**
             * ReviewTime.
             */
            public Builder reviewTime(String reviewTime) {
                this.reviewTime = reviewTime;
                return this;
            }

            /**
             * ReviewTimeLong.
             */
            public Builder reviewTimeLong(String reviewTimeLong) {
                this.reviewTimeLong = reviewTimeLong;
                return this;
            }

            /**
             * ReviewType.
             */
            public Builder reviewType(Integer reviewType) {
                this.reviewType = reviewType;
                return this;
            }

            /**
             * ReviewTypeIdList.
             */
            public Builder reviewTypeIdList(ResultInfoReviewTypeIdList reviewTypeIdList) {
                this.reviewTypeIdList = reviewTypeIdList;
                return this;
            }

            /**
             * Reviewer.
             */
            public Builder reviewer(String reviewer) {
                this.reviewer = reviewer;
                return this;
            }

            /**
             * SchemeIdList.
             */
            public Builder schemeIdList(SchemeIdList schemeIdList) {
                this.schemeIdList = schemeIdList;
                return this;
            }

            /**
             * SchemeNameList.
             */
            public Builder schemeNameList(SchemeNameList schemeNameList) {
                this.schemeNameList = schemeNameList;
                return this;
            }

            /**
             * Score.
             */
            public Builder score(Integer score) {
                this.score = score;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * TaskId.
             */
            public Builder taskId(String taskId) {
                this.taskId = taskId;
                return this;
            }

            /**
             * TaskName.
             */
            public Builder taskName(String taskName) {
                this.taskName = taskName;
                return this;
            }

            public ResultInfo build() {
                return new ResultInfo(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ResultInfo")
        private java.util.List < ResultInfo> resultInfo;

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
        public java.util.List < ResultInfo> getResultInfo() {
            return this.resultInfo;
        }

        public static final class Builder {
            private java.util.List < ResultInfo> resultInfo; 

            /**
             * ResultInfo.
             */
            public Builder resultInfo(java.util.List < ResultInfo> resultInfo) {
                this.resultInfo = resultInfo;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
