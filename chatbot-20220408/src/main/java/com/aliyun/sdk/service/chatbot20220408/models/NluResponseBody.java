// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.chatbot20220408.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link NluResponseBody} extends {@link TeaModel}
 *
 * <p>NluResponseBody</p>
 */
public class NluResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("MessageId")
    private String messageId;

    @com.aliyun.core.annotation.NameInMap("Messages")
    private java.util.List < Messages> messages;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private NluResponseBody(Builder builder) {
        this.messageId = builder.messageId;
        this.messages = builder.messages;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static NluResponseBody create() {
        return builder().build();
    }

    /**
     * @return messageId
     */
    public String getMessageId() {
        return this.messageId;
    }

    /**
     * @return messages
     */
    public java.util.List < Messages> getMessages() {
        return this.messages;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String messageId; 
        private java.util.List < Messages> messages; 
        private String requestId; 

        /**
         * MessageId.
         */
        public Builder messageId(String messageId) {
            this.messageId = messageId;
            return this;
        }

        /**
         * Messages.
         */
        public Builder messages(java.util.List < Messages> messages) {
            this.messages = messages;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public NluResponseBody build() {
            return new NluResponseBody(this);
        } 

    } 

    public static class GlobalDictList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("StandardWord")
        private String standardWord;

        @com.aliyun.core.annotation.NameInMap("Word")
        private String word;

        private GlobalDictList(Builder builder) {
            this.standardWord = builder.standardWord;
            this.word = builder.word;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static GlobalDictList create() {
            return builder().build();
        }

        /**
         * @return standardWord
         */
        public String getStandardWord() {
            return this.standardWord;
        }

        /**
         * @return word
         */
        public String getWord() {
            return this.word;
        }

        public static final class Builder {
            private String standardWord; 
            private String word; 

            /**
             * StandardWord.
             */
            public Builder standardWord(String standardWord) {
                this.standardWord = standardWord;
                return this;
            }

            /**
             * Word.
             */
            public Builder word(String word) {
                this.word = word;
                return this;
            }

            public GlobalDictList build() {
                return new GlobalDictList(this);
            } 

        } 

    }
    public static class GlobalSensitiveWordList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("StandardWord")
        private String standardWord;

        @com.aliyun.core.annotation.NameInMap("Word")
        private String word;

        private GlobalSensitiveWordList(Builder builder) {
            this.standardWord = builder.standardWord;
            this.word = builder.word;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static GlobalSensitiveWordList create() {
            return builder().build();
        }

        /**
         * @return standardWord
         */
        public String getStandardWord() {
            return this.standardWord;
        }

        /**
         * @return word
         */
        public String getWord() {
            return this.word;
        }

        public static final class Builder {
            private String standardWord; 
            private String word; 

            /**
             * StandardWord.
             */
            public Builder standardWord(String standardWord) {
                this.standardWord = standardWord;
                return this;
            }

            /**
             * Word.
             */
            public Builder word(String word) {
                this.word = word;
                return this;
            }

            public GlobalSensitiveWordList build() {
                return new GlobalSensitiveWordList(this);
            } 

        } 

    }
    public static class DialogHubNluInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("GlobalDictList")
        private java.util.List < GlobalDictList> globalDictList;

        @com.aliyun.core.annotation.NameInMap("GlobalSensitiveWordList")
        private java.util.List < GlobalSensitiveWordList> globalSensitiveWordList;

        private DialogHubNluInfo(Builder builder) {
            this.globalDictList = builder.globalDictList;
            this.globalSensitiveWordList = builder.globalSensitiveWordList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DialogHubNluInfo create() {
            return builder().build();
        }

        /**
         * @return globalDictList
         */
        public java.util.List < GlobalDictList> getGlobalDictList() {
            return this.globalDictList;
        }

        /**
         * @return globalSensitiveWordList
         */
        public java.util.List < GlobalSensitiveWordList> getGlobalSensitiveWordList() {
            return this.globalSensitiveWordList;
        }

        public static final class Builder {
            private java.util.List < GlobalDictList> globalDictList; 
            private java.util.List < GlobalSensitiveWordList> globalSensitiveWordList; 

            /**
             * GlobalDictList.
             */
            public Builder globalDictList(java.util.List < GlobalDictList> globalDictList) {
                this.globalDictList = globalDictList;
                return this;
            }

            /**
             * GlobalSensitiveWordList.
             */
            public Builder globalSensitiveWordList(java.util.List < GlobalSensitiveWordList> globalSensitiveWordList) {
                this.globalSensitiveWordList = globalSensitiveWordList;
                return this;
            }

            public DialogHubNluInfo build() {
                return new DialogHubNluInfo(this);
            } 

        } 

    }
    public static class EntityList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Origin")
        private String origin;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private EntityList(Builder builder) {
            this.name = builder.name;
            this.origin = builder.origin;
            this.type = builder.type;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EntityList create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return origin
         */
        public String getOrigin() {
            return this.origin;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String name; 
            private String origin; 
            private String type; 
            private String value; 

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Origin.
             */
            public Builder origin(String origin) {
                this.origin = origin;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public EntityList build() {
                return new EntityList(this);
            } 

        } 

    }
    public static class SlotList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Origin")
        private String origin;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private SlotList(Builder builder) {
            this.name = builder.name;
            this.origin = builder.origin;
            this.type = builder.type;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SlotList create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return origin
         */
        public String getOrigin() {
            return this.origin;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String name; 
            private String origin; 
            private String type; 
            private String value; 

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Origin.
             */
            public Builder origin(String origin) {
                this.origin = origin;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public SlotList build() {
                return new SlotList(this);
            } 

        } 

    }
    public static class IntentList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("IntentId")
        private Long intentId;

        @com.aliyun.core.annotation.NameInMap("MatchDetail")
        private String matchDetail;

        @com.aliyun.core.annotation.NameInMap("MatchType")
        private String matchType;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Score")
        private Double score;

        @com.aliyun.core.annotation.NameInMap("SlotList")
        private java.util.List < SlotList> slotList;

        private IntentList(Builder builder) {
            this.intentId = builder.intentId;
            this.matchDetail = builder.matchDetail;
            this.matchType = builder.matchType;
            this.name = builder.name;
            this.score = builder.score;
            this.slotList = builder.slotList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static IntentList create() {
            return builder().build();
        }

        /**
         * @return intentId
         */
        public Long getIntentId() {
            return this.intentId;
        }

        /**
         * @return matchDetail
         */
        public String getMatchDetail() {
            return this.matchDetail;
        }

        /**
         * @return matchType
         */
        public String getMatchType() {
            return this.matchType;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return score
         */
        public Double getScore() {
            return this.score;
        }

        /**
         * @return slotList
         */
        public java.util.List < SlotList> getSlotList() {
            return this.slotList;
        }

        public static final class Builder {
            private Long intentId; 
            private String matchDetail; 
            private String matchType; 
            private String name; 
            private Double score; 
            private java.util.List < SlotList> slotList; 

            /**
             * IntentId.
             */
            public Builder intentId(Long intentId) {
                this.intentId = intentId;
                return this;
            }

            /**
             * MatchDetail.
             */
            public Builder matchDetail(String matchDetail) {
                this.matchDetail = matchDetail;
                return this;
            }

            /**
             * MatchType.
             */
            public Builder matchType(String matchType) {
                this.matchType = matchType;
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
             * Score.
             */
            public Builder score(Double score) {
                this.score = score;
                return this;
            }

            /**
             * SlotList.
             */
            public Builder slotList(java.util.List < SlotList> slotList) {
                this.slotList = slotList;
                return this;
            }

            public IntentList build() {
                return new IntentList(this);
            } 

        } 

    }
    public static class DsNluInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EntityList")
        private java.util.List < EntityList> entityList;

        @com.aliyun.core.annotation.NameInMap("IntentList")
        private java.util.List < IntentList> intentList;

        private DsNluInfo(Builder builder) {
            this.entityList = builder.entityList;
            this.intentList = builder.intentList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DsNluInfo create() {
            return builder().build();
        }

        /**
         * @return entityList
         */
        public java.util.List < EntityList> getEntityList() {
            return this.entityList;
        }

        /**
         * @return intentList
         */
        public java.util.List < IntentList> getIntentList() {
            return this.intentList;
        }

        public static final class Builder {
            private java.util.List < EntityList> entityList; 
            private java.util.List < IntentList> intentList; 

            /**
             * EntityList.
             */
            public Builder entityList(java.util.List < EntityList> entityList) {
                this.entityList = entityList;
                return this;
            }

            /**
             * IntentList.
             */
            public Builder intentList(java.util.List < IntentList> intentList) {
                this.intentList = intentList;
                return this;
            }

            public DsNluInfo build() {
                return new DsNluInfo(this);
            } 

        } 

    }
    public static class Messages extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DialogHubNluInfo")
        private DialogHubNluInfo dialogHubNluInfo;

        @com.aliyun.core.annotation.NameInMap("DsNluInfo")
        private DsNluInfo dsNluInfo;

        private Messages(Builder builder) {
            this.dialogHubNluInfo = builder.dialogHubNluInfo;
            this.dsNluInfo = builder.dsNluInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Messages create() {
            return builder().build();
        }

        /**
         * @return dialogHubNluInfo
         */
        public DialogHubNluInfo getDialogHubNluInfo() {
            return this.dialogHubNluInfo;
        }

        /**
         * @return dsNluInfo
         */
        public DsNluInfo getDsNluInfo() {
            return this.dsNluInfo;
        }

        public static final class Builder {
            private DialogHubNluInfo dialogHubNluInfo; 
            private DsNluInfo dsNluInfo; 

            /**
             * DialogHubNluInfo.
             */
            public Builder dialogHubNluInfo(DialogHubNluInfo dialogHubNluInfo) {
                this.dialogHubNluInfo = dialogHubNluInfo;
                return this;
            }

            /**
             * DsNluInfo.
             */
            public Builder dsNluInfo(DsNluInfo dsNluInfo) {
                this.dsNluInfo = dsNluInfo;
                return this;
            }

            public Messages build() {
                return new Messages(this);
            } 

        } 

    }
}
