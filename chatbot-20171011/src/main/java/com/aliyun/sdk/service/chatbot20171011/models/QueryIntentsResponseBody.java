// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.chatbot20171011.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryIntentsResponseBody} extends {@link TeaModel}
 *
 * <p>QueryIntentsResponseBody</p>
 */
public class QueryIntentsResponseBody extends TeaModel {
    @NameInMap("Intents")
    private java.util.List < Intents> intents;

    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private QueryIntentsResponseBody(Builder builder) {
        this.intents = builder.intents;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryIntentsResponseBody create() {
        return builder().build();
    }

    /**
     * @return intents
     */
    public java.util.List < Intents> getIntents() {
        return this.intents;
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
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List < Intents> intents; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * Intents.
         */
        public Builder intents(java.util.List < Intents> intents) {
            this.intents = intents;
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
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public QueryIntentsResponseBody build() {
            return new QueryIntentsResponseBody(this);
        } 

    } 

    public static class RuleCheck extends TeaModel {
        @NameInMap("Error")
        private java.util.List < String > error;

        @NameInMap("Strict")
        private Boolean strict;

        @NameInMap("Text")
        private String text;

        @NameInMap("Warning")
        private java.util.List < String > warning;

        private RuleCheck(Builder builder) {
            this.error = builder.error;
            this.strict = builder.strict;
            this.text = builder.text;
            this.warning = builder.warning;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RuleCheck create() {
            return builder().build();
        }

        /**
         * @return error
         */
        public java.util.List < String > getError() {
            return this.error;
        }

        /**
         * @return strict
         */
        public Boolean getStrict() {
            return this.strict;
        }

        /**
         * @return text
         */
        public String getText() {
            return this.text;
        }

        /**
         * @return warning
         */
        public java.util.List < String > getWarning() {
            return this.warning;
        }

        public static final class Builder {
            private java.util.List < String > error; 
            private Boolean strict; 
            private String text; 
            private java.util.List < String > warning; 

            /**
             * Error.
             */
            public Builder error(java.util.List < String > error) {
                this.error = error;
                return this;
            }

            /**
             * Strict.
             */
            public Builder strict(Boolean strict) {
                this.strict = strict;
                return this;
            }

            /**
             * Text.
             */
            public Builder text(String text) {
                this.text = text;
                return this;
            }

            /**
             * Warning.
             */
            public Builder warning(java.util.List < String > warning) {
                this.warning = warning;
                return this;
            }

            public RuleCheck build() {
                return new RuleCheck(this);
            } 

        } 

    }
    public static class Tags extends TeaModel {
        @NameInMap("UserSayId")
        private String userSayId;

        @NameInMap("Value")
        private String value;

        private Tags(Builder builder) {
            this.userSayId = builder.userSayId;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tags create() {
            return builder().build();
        }

        /**
         * @return userSayId
         */
        public String getUserSayId() {
            return this.userSayId;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String userSayId; 
            private String value; 

            /**
             * UserSayId.
             */
            public Builder userSayId(String userSayId) {
                this.userSayId = userSayId;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
    public static class Slot extends TeaModel {
        @NameInMap("IsArray")
        private Boolean isArray;

        @NameInMap("IsNecessary")
        private Boolean isNecessary;

        @NameInMap("LifeSpan")
        private Integer lifeSpan;

        @NameInMap("Name")
        private String name;

        @NameInMap("Question")
        private java.util.List < String > question;

        @NameInMap("SlotId")
        private String slotId;

        @NameInMap("Tags")
        private java.util.List < Tags> tags;

        @NameInMap("Value")
        private String value;

        private Slot(Builder builder) {
            this.isArray = builder.isArray;
            this.isNecessary = builder.isNecessary;
            this.lifeSpan = builder.lifeSpan;
            this.name = builder.name;
            this.question = builder.question;
            this.slotId = builder.slotId;
            this.tags = builder.tags;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Slot create() {
            return builder().build();
        }

        /**
         * @return isArray
         */
        public Boolean getIsArray() {
            return this.isArray;
        }

        /**
         * @return isNecessary
         */
        public Boolean getIsNecessary() {
            return this.isNecessary;
        }

        /**
         * @return lifeSpan
         */
        public Integer getLifeSpan() {
            return this.lifeSpan;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return question
         */
        public java.util.List < String > getQuestion() {
            return this.question;
        }

        /**
         * @return slotId
         */
        public String getSlotId() {
            return this.slotId;
        }

        /**
         * @return tags
         */
        public java.util.List < Tags> getTags() {
            return this.tags;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private Boolean isArray; 
            private Boolean isNecessary; 
            private Integer lifeSpan; 
            private String name; 
            private java.util.List < String > question; 
            private String slotId; 
            private java.util.List < Tags> tags; 
            private String value; 

            /**
             * IsArray.
             */
            public Builder isArray(Boolean isArray) {
                this.isArray = isArray;
                return this;
            }

            /**
             * IsNecessary.
             */
            public Builder isNecessary(Boolean isNecessary) {
                this.isNecessary = isNecessary;
                return this;
            }

            /**
             * LifeSpan.
             */
            public Builder lifeSpan(Integer lifeSpan) {
                this.lifeSpan = lifeSpan;
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
             * Question.
             */
            public Builder question(java.util.List < String > question) {
                this.question = question;
                return this;
            }

            /**
             * SlotId.
             */
            public Builder slotId(String slotId) {
                this.slotId = slotId;
                return this;
            }

            /**
             * Tags.
             */
            public Builder tags(java.util.List < Tags> tags) {
                this.tags = tags;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Slot build() {
                return new Slot(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("SlotId")
        private String slotId;

        @NameInMap("Text")
        private String text;

        private Data(Builder builder) {
            this.slotId = builder.slotId;
            this.text = builder.text;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return slotId
         */
        public String getSlotId() {
            return this.slotId;
        }

        /**
         * @return text
         */
        public String getText() {
            return this.text;
        }

        public static final class Builder {
            private String slotId; 
            private String text; 

            /**
             * SlotId.
             */
            public Builder slotId(String slotId) {
                this.slotId = slotId;
                return this;
            }

            /**
             * Text.
             */
            public Builder text(String text) {
                this.text = text;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
    public static class UserSay extends TeaModel {
        @NameInMap("Data")
        private java.util.List < Data> data;

        @NameInMap("Strict")
        private Boolean strict;

        @NameInMap("UserSayId")
        private String userSayId;

        private UserSay(Builder builder) {
            this.data = builder.data;
            this.strict = builder.strict;
            this.userSayId = builder.userSayId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UserSay create() {
            return builder().build();
        }

        /**
         * @return data
         */
        public java.util.List < Data> getData() {
            return this.data;
        }

        /**
         * @return strict
         */
        public Boolean getStrict() {
            return this.strict;
        }

        /**
         * @return userSayId
         */
        public String getUserSayId() {
            return this.userSayId;
        }

        public static final class Builder {
            private java.util.List < Data> data; 
            private Boolean strict; 
            private String userSayId; 

            /**
             * Data.
             */
            public Builder data(java.util.List < Data> data) {
                this.data = data;
                return this;
            }

            /**
             * Strict.
             */
            public Builder strict(Boolean strict) {
                this.strict = strict;
                return this;
            }

            /**
             * UserSayId.
             */
            public Builder userSayId(String userSayId) {
                this.userSayId = userSayId;
                return this;
            }

            public UserSay build() {
                return new UserSay(this);
            } 

        } 

    }
    public static class Intents extends TeaModel {
        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("CreateUserId")
        private String createUserId;

        @NameInMap("CreateUserName")
        private String createUserName;

        @NameInMap("IntentId")
        private Long intentId;

        @NameInMap("ModifyTime")
        private String modifyTime;

        @NameInMap("ModifyUserId")
        private String modifyUserId;

        @NameInMap("ModifyUserName")
        private String modifyUserName;

        @NameInMap("Name")
        private String name;

        @NameInMap("RuleCheck")
        private java.util.List < RuleCheck> ruleCheck;

        @NameInMap("Slot")
        private java.util.List < Slot> slot;

        @NameInMap("UserSay")
        private java.util.List < UserSay> userSay;

        private Intents(Builder builder) {
            this.createTime = builder.createTime;
            this.createUserId = builder.createUserId;
            this.createUserName = builder.createUserName;
            this.intentId = builder.intentId;
            this.modifyTime = builder.modifyTime;
            this.modifyUserId = builder.modifyUserId;
            this.modifyUserName = builder.modifyUserName;
            this.name = builder.name;
            this.ruleCheck = builder.ruleCheck;
            this.slot = builder.slot;
            this.userSay = builder.userSay;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Intents create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return createUserId
         */
        public String getCreateUserId() {
            return this.createUserId;
        }

        /**
         * @return createUserName
         */
        public String getCreateUserName() {
            return this.createUserName;
        }

        /**
         * @return intentId
         */
        public Long getIntentId() {
            return this.intentId;
        }

        /**
         * @return modifyTime
         */
        public String getModifyTime() {
            return this.modifyTime;
        }

        /**
         * @return modifyUserId
         */
        public String getModifyUserId() {
            return this.modifyUserId;
        }

        /**
         * @return modifyUserName
         */
        public String getModifyUserName() {
            return this.modifyUserName;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return ruleCheck
         */
        public java.util.List < RuleCheck> getRuleCheck() {
            return this.ruleCheck;
        }

        /**
         * @return slot
         */
        public java.util.List < Slot> getSlot() {
            return this.slot;
        }

        /**
         * @return userSay
         */
        public java.util.List < UserSay> getUserSay() {
            return this.userSay;
        }

        public static final class Builder {
            private String createTime; 
            private String createUserId; 
            private String createUserName; 
            private Long intentId; 
            private String modifyTime; 
            private String modifyUserId; 
            private String modifyUserName; 
            private String name; 
            private java.util.List < RuleCheck> ruleCheck; 
            private java.util.List < Slot> slot; 
            private java.util.List < UserSay> userSay; 

            /**
             * CreateTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * CreateUserId.
             */
            public Builder createUserId(String createUserId) {
                this.createUserId = createUserId;
                return this;
            }

            /**
             * CreateUserName.
             */
            public Builder createUserName(String createUserName) {
                this.createUserName = createUserName;
                return this;
            }

            /**
             * IntentId.
             */
            public Builder intentId(Long intentId) {
                this.intentId = intentId;
                return this;
            }

            /**
             * ModifyTime.
             */
            public Builder modifyTime(String modifyTime) {
                this.modifyTime = modifyTime;
                return this;
            }

            /**
             * ModifyUserId.
             */
            public Builder modifyUserId(String modifyUserId) {
                this.modifyUserId = modifyUserId;
                return this;
            }

            /**
             * ModifyUserName.
             */
            public Builder modifyUserName(String modifyUserName) {
                this.modifyUserName = modifyUserName;
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
             * RuleCheck.
             */
            public Builder ruleCheck(java.util.List < RuleCheck> ruleCheck) {
                this.ruleCheck = ruleCheck;
                return this;
            }

            /**
             * Slot.
             */
            public Builder slot(java.util.List < Slot> slot) {
                this.slot = slot;
                return this;
            }

            /**
             * UserSay.
             */
            public Builder userSay(java.util.List < UserSay> userSay) {
                this.userSay = userSay;
                return this;
            }

            public Intents build() {
                return new Intents(this);
            } 

        } 

    }
}
