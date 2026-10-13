// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.chatbot20220408.models;

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
 * {@link ListIntentResponseBody} extends {@link TeaModel}
 *
 * <p>ListIntentResponseBody</p>
 */
public class ListIntentResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Intents")
    private java.util.List<Intents> intents;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private ListIntentResponseBody(Builder builder) {
        this.intents = builder.intents;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListIntentResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return intents
     */
    public java.util.List<Intents> getIntents() {
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
        private java.util.List<Intents> intents; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(ListIntentResponseBody model) {
            this.intents = model.intents;
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The list of intents.</p>
         */
        public Builder intents(java.util.List<Intents> intents) {
            this.intents = intents;
            return this;
        }

        /**
         * <p>The page number. Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page. Default value: 10.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>23dsfa34r2s2s2sd12</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListIntentResponseBody build() {
            return new ListIntentResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListIntentResponseBody} extends {@link TeaModel}
     *
     * <p>ListIntentResponseBody</p>
     */
    public static class SlotInfos extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Array")
        private Boolean array;

        @com.aliyun.core.annotation.NameInMap("Encrypt")
        private Boolean encrypt;

        @com.aliyun.core.annotation.NameInMap("Interactive")
        private Boolean interactive;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("SlotId")
        private String slotId;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private SlotInfos(Builder builder) {
            this.array = builder.array;
            this.encrypt = builder.encrypt;
            this.interactive = builder.interactive;
            this.name = builder.name;
            this.slotId = builder.slotId;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SlotInfos create() {
            return builder().build();
        }

        /**
         * @return array
         */
        public Boolean getArray() {
            return this.array;
        }

        /**
         * @return encrypt
         */
        public Boolean getEncrypt() {
            return this.encrypt;
        }

        /**
         * @return interactive
         */
        public Boolean getInteractive() {
            return this.interactive;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return slotId
         */
        public String getSlotId() {
            return this.slotId;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private Boolean array; 
            private Boolean encrypt; 
            private Boolean interactive; 
            private String name; 
            private String slotId; 
            private String value; 

            private Builder() {
            } 

            private Builder(SlotInfos model) {
                this.array = model.array;
                this.encrypt = model.encrypt;
                this.interactive = model.interactive;
                this.name = model.name;
                this.slotId = model.slotId;
                this.value = model.value;
            } 

            /**
             * <p>Indicates whether the slot is an array.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder array(Boolean array) {
                this.array = array;
                return this;
            }

            /**
             * <p>Indicates whether the slot is sensitive.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder encrypt(Boolean encrypt) {
                this.encrypt = encrypt;
                return this;
            }

            /**
             * <p>Indicates whether the slot is collected interactively.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder interactive(Boolean interactive) {
                this.interactive = interactive;
                return this;
            }

            /**
             * <p>The slot name.</p>
             * 
             * <strong>example:</strong>
             * <p>Weather</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The slot ID.</p>
             * 
             * <strong>example:</strong>
             * <p>12134223</p>
             */
            public Builder slotId(String slotId) {
                this.slotId = slotId;
                return this;
            }

            /**
             * <p>The slot value (entity name).</p>
             * 
             * <strong>example:</strong>
             * <p>Weather</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public SlotInfos build() {
                return new SlotInfos(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListIntentResponseBody} extends {@link TeaModel}
     *
     * <p>ListIntentResponseBody</p>
     */
    public static class Intents extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AliasName")
        private String aliasName;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("CreateUserId")
        private String createUserId;

        @com.aliyun.core.annotation.NameInMap("CreateUserName")
        private String createUserName;

        @com.aliyun.core.annotation.NameInMap("IntentId")
        private Long intentId;

        @com.aliyun.core.annotation.NameInMap("IntentName")
        private String intentName;

        @com.aliyun.core.annotation.NameInMap("ModifyTime")
        private String modifyTime;

        @com.aliyun.core.annotation.NameInMap("ModifyUserId")
        private String modifyUserId;

        @com.aliyun.core.annotation.NameInMap("ModifyUserName")
        private String modifyUserName;

        @com.aliyun.core.annotation.NameInMap("SlotInfos")
        private java.util.List<SlotInfos> slotInfos;

        private Intents(Builder builder) {
            this.aliasName = builder.aliasName;
            this.createTime = builder.createTime;
            this.createUserId = builder.createUserId;
            this.createUserName = builder.createUserName;
            this.intentId = builder.intentId;
            this.intentName = builder.intentName;
            this.modifyTime = builder.modifyTime;
            this.modifyUserId = builder.modifyUserId;
            this.modifyUserName = builder.modifyUserName;
            this.slotInfos = builder.slotInfos;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Intents create() {
            return builder().build();
        }

        /**
         * @return aliasName
         */
        public String getAliasName() {
            return this.aliasName;
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
         * @return intentName
         */
        public String getIntentName() {
            return this.intentName;
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
         * @return slotInfos
         */
        public java.util.List<SlotInfos> getSlotInfos() {
            return this.slotInfos;
        }

        public static final class Builder {
            private String aliasName; 
            private String createTime; 
            private String createUserId; 
            private String createUserName; 
            private Long intentId; 
            private String intentName; 
            private String modifyTime; 
            private String modifyUserId; 
            private String modifyUserName; 
            private java.util.List<SlotInfos> slotInfos; 

            private Builder() {
            } 

            private Builder(Intents model) {
                this.aliasName = model.aliasName;
                this.createTime = model.createTime;
                this.createUserId = model.createUserId;
                this.createUserName = model.createUserName;
                this.intentId = model.intentId;
                this.intentName = model.intentName;
                this.modifyTime = model.modifyTime;
                this.modifyUserId = model.modifyUserId;
                this.modifyUserName = model.modifyUserName;
                this.slotInfos = model.slotInfos;
            } 

            /**
             * <p>The alias of the intent.</p>
             * 
             * <strong>example:</strong>
             * <p>CheckWeatherIntent</p>
             */
            public Builder aliasName(String aliasName) {
                this.aliasName = aliasName;
                return this;
            }

            /**
             * <p>The creation time in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-08-12T16:00:01Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The unique identifier of the creator.</p>
             * 
             * <strong>example:</strong>
             * <p>123231</p>
             */
            public Builder createUserId(String createUserId) {
                this.createUserId = createUserId;
                return this;
            }

            /**
             * <p>The name of the creator.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder createUserName(String createUserName) {
                this.createUserName = createUserName;
                return this;
            }

            /**
             * <p>The intent ID.</p>
             * 
             * <strong>example:</strong>
             * <p>234234234234</p>
             */
            public Builder intentId(Long intentId) {
                this.intentId = intentId;
                return this;
            }

            /**
             * <p>The intent name.</p>
             * 
             * <strong>example:</strong>
             * <p>CheckWeatherIntent</p>
             */
            public Builder intentName(String intentName) {
                this.intentName = intentName;
                return this;
            }

            /**
             * <p>The modification time in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-08-12T16:00:01Z</p>
             */
            public Builder modifyTime(String modifyTime) {
                this.modifyTime = modifyTime;
                return this;
            }

            /**
             * <p>The unique identifier of the user who last modified the intent.</p>
             * 
             * <strong>example:</strong>
             * <p>123231</p>
             */
            public Builder modifyUserId(String modifyUserId) {
                this.modifyUserId = modifyUserId;
                return this;
            }

            /**
             * <p>The name of the user who last modified the intent.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder modifyUserName(String modifyUserName) {
                this.modifyUserName = modifyUserName;
                return this;
            }

            /**
             * <p>The slot information associated with the intent.</p>
             */
            public Builder slotInfos(java.util.List<SlotInfos> slotInfos) {
                this.slotInfos = slotInfos;
                return this;
            }

            public Intents build() {
                return new Intents(this);
            } 

        } 

    }
}
