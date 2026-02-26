// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aliding20230426.models;

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
 * {@link InvokeAssistantRequest} extends {@link RequestModel}
 *
 * <p>InvokeAssistantRequest</p>
 */
public class InvokeAssistantRequest extends Request {
    @com.aliyun.core.annotation.Header
    @com.aliyun.core.annotation.NameInMap("accountId")
    private String accountId;

    @com.aliyun.core.annotation.Header
    @com.aliyun.core.annotation.NameInMap("alidingSsoTicket")
    private String alidingSsoTicket;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("assistantId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String assistantId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("clientEnum")
    private String clientEnum;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("extLoginUser")
    private ExtLoginUser extLoginUser;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("messages")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<Messages> messages;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("originalAssistantId")
    private String originalAssistantId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("sessionId")
    private String sessionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("sourceIdOfOriginalAssistantId")
    private String sourceIdOfOriginalAssistantId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("sourceTypeOfOriginalAssistantId")
    private String sourceTypeOfOriginalAssistantId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("stream")
    private Boolean stream;

    private InvokeAssistantRequest(Builder builder) {
        super(builder);
        this.accountId = builder.accountId;
        this.alidingSsoTicket = builder.alidingSsoTicket;
        this.assistantId = builder.assistantId;
        this.clientEnum = builder.clientEnum;
        this.extLoginUser = builder.extLoginUser;
        this.messages = builder.messages;
        this.originalAssistantId = builder.originalAssistantId;
        this.sessionId = builder.sessionId;
        this.sourceIdOfOriginalAssistantId = builder.sourceIdOfOriginalAssistantId;
        this.sourceTypeOfOriginalAssistantId = builder.sourceTypeOfOriginalAssistantId;
        this.stream = builder.stream;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static InvokeAssistantRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accountId
     */
    public String getAccountId() {
        return this.accountId;
    }

    /**
     * @return alidingSsoTicket
     */
    public String getAlidingSsoTicket() {
        return this.alidingSsoTicket;
    }

    /**
     * @return assistantId
     */
    public String getAssistantId() {
        return this.assistantId;
    }

    /**
     * @return clientEnum
     */
    public String getClientEnum() {
        return this.clientEnum;
    }

    /**
     * @return extLoginUser
     */
    public ExtLoginUser getExtLoginUser() {
        return this.extLoginUser;
    }

    /**
     * @return messages
     */
    public java.util.List<Messages> getMessages() {
        return this.messages;
    }

    /**
     * @return originalAssistantId
     */
    public String getOriginalAssistantId() {
        return this.originalAssistantId;
    }

    /**
     * @return sessionId
     */
    public String getSessionId() {
        return this.sessionId;
    }

    /**
     * @return sourceIdOfOriginalAssistantId
     */
    public String getSourceIdOfOriginalAssistantId() {
        return this.sourceIdOfOriginalAssistantId;
    }

    /**
     * @return sourceTypeOfOriginalAssistantId
     */
    public String getSourceTypeOfOriginalAssistantId() {
        return this.sourceTypeOfOriginalAssistantId;
    }

    /**
     * @return stream
     */
    public Boolean getStream() {
        return this.stream;
    }

    public static final class Builder extends Request.Builder<InvokeAssistantRequest, Builder> {
        private String accountId; 
        private String alidingSsoTicket; 
        private String assistantId; 
        private String clientEnum; 
        private ExtLoginUser extLoginUser; 
        private java.util.List<Messages> messages; 
        private String originalAssistantId; 
        private String sessionId; 
        private String sourceIdOfOriginalAssistantId; 
        private String sourceTypeOfOriginalAssistantId; 
        private Boolean stream; 

        private Builder() {
            super();
        } 

        private Builder(InvokeAssistantRequest request) {
            super(request);
            this.accountId = request.accountId;
            this.alidingSsoTicket = request.alidingSsoTicket;
            this.assistantId = request.assistantId;
            this.clientEnum = request.clientEnum;
            this.extLoginUser = request.extLoginUser;
            this.messages = request.messages;
            this.originalAssistantId = request.originalAssistantId;
            this.sessionId = request.sessionId;
            this.sourceIdOfOriginalAssistantId = request.sourceIdOfOriginalAssistantId;
            this.sourceTypeOfOriginalAssistantId = request.sourceTypeOfOriginalAssistantId;
            this.stream = request.stream;
        } 

        /**
         * accountId.
         */
        public Builder accountId(String accountId) {
            this.putHeaderParameter("accountId", accountId);
            this.accountId = accountId;
            return this;
        }

        /**
         * alidingSsoTicket.
         */
        public Builder alidingSsoTicket(String alidingSsoTicket) {
            this.putHeaderParameter("alidingSsoTicket", alidingSsoTicket);
            this.alidingSsoTicket = alidingSsoTicket;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>assistantId1</p>
         */
        public Builder assistantId(String assistantId) {
            this.putBodyParameter("assistantId", assistantId);
            this.assistantId = assistantId;
            return this;
        }

        /**
         * clientEnum.
         */
        public Builder clientEnum(String clientEnum) {
            this.putBodyParameter("clientEnum", clientEnum);
            this.clientEnum = clientEnum;
            return this;
        }

        /**
         * extLoginUser.
         */
        public Builder extLoginUser(ExtLoginUser extLoginUser) {
            this.putBodyParameter("extLoginUser", extLoginUser);
            this.extLoginUser = extLoginUser;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder messages(java.util.List<Messages> messages) {
            this.putBodyParameter("messages", messages);
            this.messages = messages;
            return this;
        }

        /**
         * originalAssistantId.
         */
        public Builder originalAssistantId(String originalAssistantId) {
            this.putBodyParameter("originalAssistantId", originalAssistantId);
            this.originalAssistantId = originalAssistantId;
            return this;
        }

        /**
         * sessionId.
         */
        public Builder sessionId(String sessionId) {
            this.putBodyParameter("sessionId", sessionId);
            this.sessionId = sessionId;
            return this;
        }

        /**
         * sourceIdOfOriginalAssistantId.
         */
        public Builder sourceIdOfOriginalAssistantId(String sourceIdOfOriginalAssistantId) {
            this.putBodyParameter("sourceIdOfOriginalAssistantId", sourceIdOfOriginalAssistantId);
            this.sourceIdOfOriginalAssistantId = sourceIdOfOriginalAssistantId;
            return this;
        }

        /**
         * sourceTypeOfOriginalAssistantId.
         */
        public Builder sourceTypeOfOriginalAssistantId(String sourceTypeOfOriginalAssistantId) {
            this.putBodyParameter("sourceTypeOfOriginalAssistantId", sourceTypeOfOriginalAssistantId);
            this.sourceTypeOfOriginalAssistantId = sourceTypeOfOriginalAssistantId;
            return this;
        }

        /**
         * stream.
         */
        public Builder stream(Boolean stream) {
            this.putBodyParameter("stream", stream);
            this.stream = stream;
            return this;
        }

        @Override
        public InvokeAssistantRequest build() {
            return new InvokeAssistantRequest(this);
        } 

    } 

    /**
     * 
     * {@link InvokeAssistantRequest} extends {@link TeaModel}
     *
     * <p>InvokeAssistantRequest</p>
     */
    public static class ExtLoginUser extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("extLoginUserDomain")
        private String extLoginUserDomain;

        @com.aliyun.core.annotation.NameInMap("extLoginUserId")
        private String extLoginUserId;

        @com.aliyun.core.annotation.NameInMap("extLoginUserName")
        private String extLoginUserName;

        private ExtLoginUser(Builder builder) {
            this.extLoginUserDomain = builder.extLoginUserDomain;
            this.extLoginUserId = builder.extLoginUserId;
            this.extLoginUserName = builder.extLoginUserName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ExtLoginUser create() {
            return builder().build();
        }

        /**
         * @return extLoginUserDomain
         */
        public String getExtLoginUserDomain() {
            return this.extLoginUserDomain;
        }

        /**
         * @return extLoginUserId
         */
        public String getExtLoginUserId() {
            return this.extLoginUserId;
        }

        /**
         * @return extLoginUserName
         */
        public String getExtLoginUserName() {
            return this.extLoginUserName;
        }

        public static final class Builder {
            private String extLoginUserDomain; 
            private String extLoginUserId; 
            private String extLoginUserName; 

            private Builder() {
            } 

            private Builder(ExtLoginUser model) {
                this.extLoginUserDomain = model.extLoginUserDomain;
                this.extLoginUserId = model.extLoginUserId;
                this.extLoginUserName = model.extLoginUserName;
            } 

            /**
             * extLoginUserDomain.
             */
            public Builder extLoginUserDomain(String extLoginUserDomain) {
                this.extLoginUserDomain = extLoginUserDomain;
                return this;
            }

            /**
             * extLoginUserId.
             */
            public Builder extLoginUserId(String extLoginUserId) {
                this.extLoginUserId = extLoginUserId;
                return this;
            }

            /**
             * extLoginUserName.
             */
            public Builder extLoginUserName(String extLoginUserName) {
                this.extLoginUserName = extLoginUserName;
                return this;
            }

            public ExtLoginUser build() {
                return new ExtLoginUser(this);
            } 

        } 

    }
    /**
     * 
     * {@link InvokeAssistantRequest} extends {@link TeaModel}
     *
     * <p>InvokeAssistantRequest</p>
     */
    public static class CardCallback extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("content")
        @com.aliyun.core.annotation.Validation(required = true)
        private String content;

        @com.aliyun.core.annotation.NameInMap("relatedMessageId")
        @com.aliyun.core.annotation.Validation(required = true)
        private String relatedMessageId;

        private CardCallback(Builder builder) {
            this.content = builder.content;
            this.relatedMessageId = builder.relatedMessageId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CardCallback create() {
            return builder().build();
        }

        /**
         * @return content
         */
        public String getContent() {
            return this.content;
        }

        /**
         * @return relatedMessageId
         */
        public String getRelatedMessageId() {
            return this.relatedMessageId;
        }

        public static final class Builder {
            private String content; 
            private String relatedMessageId; 

            private Builder() {
            } 

            private Builder(CardCallback model) {
                this.content = model.content;
                this.relatedMessageId = model.relatedMessageId;
            } 

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>{}</p>
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>aliding_messageId123</p>
             */
            public Builder relatedMessageId(String relatedMessageId) {
                this.relatedMessageId = relatedMessageId;
                return this;
            }

            public CardCallback build() {
                return new CardCallback(this);
            } 

        } 

    }
    /**
     * 
     * {@link InvokeAssistantRequest} extends {@link TeaModel}
     *
     * <p>InvokeAssistantRequest</p>
     */
    public static class DingCard extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("content")
        private String content;

        @com.aliyun.core.annotation.NameInMap("contentType")
        @com.aliyun.core.annotation.Validation(required = true)
        private String contentType;

        @com.aliyun.core.annotation.NameInMap("finished")
        private Boolean finished;

        @com.aliyun.core.annotation.NameInMap("templateId")
        private String templateId;

        private DingCard(Builder builder) {
            this.content = builder.content;
            this.contentType = builder.contentType;
            this.finished = builder.finished;
            this.templateId = builder.templateId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DingCard create() {
            return builder().build();
        }

        /**
         * @return content
         */
        public String getContent() {
            return this.content;
        }

        /**
         * @return contentType
         */
        public String getContentType() {
            return this.contentType;
        }

        /**
         * @return finished
         */
        public Boolean getFinished() {
            return this.finished;
        }

        /**
         * @return templateId
         */
        public String getTemplateId() {
            return this.templateId;
        }

        public static final class Builder {
            private String content; 
            private String contentType; 
            private Boolean finished; 
            private String templateId; 

            private Builder() {
            } 

            private Builder(DingCard model) {
                this.content = model.content;
                this.contentType = model.contentType;
                this.finished = model.finished;
                this.templateId = model.templateId;
            } 

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>{}</p>
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>basic_card_schema</p>
             */
            public Builder contentType(String contentType) {
                this.contentType = contentType;
                return this;
            }

            /**
             * finished.
             */
            public Builder finished(Boolean finished) {
                this.finished = finished;
                return this;
            }

            /**
             * templateId.
             */
            public Builder templateId(String templateId) {
                this.templateId = templateId;
                return this;
            }

            public DingCard build() {
                return new DingCard(this);
            } 

        } 

    }
    /**
     * 
     * {@link InvokeAssistantRequest} extends {@link TeaModel}
     *
     * <p>InvokeAssistantRequest</p>
     */
    public static class CardData extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("cardParamMap")
        private java.util.Map<String, ?> cardParamMap;

        private CardData(Builder builder) {
            this.cardParamMap = builder.cardParamMap;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CardData create() {
            return builder().build();
        }

        /**
         * @return cardParamMap
         */
        public java.util.Map<String, ?> getCardParamMap() {
            return this.cardParamMap;
        }

        public static final class Builder {
            private java.util.Map<String, ?> cardParamMap; 

            private Builder() {
            } 

            private Builder(CardData model) {
                this.cardParamMap = model.cardParamMap;
            } 

            /**
             * cardParamMap.
             */
            public Builder cardParamMap(java.util.Map<String, ?> cardParamMap) {
                this.cardParamMap = cardParamMap;
                return this;
            }

            public CardData build() {
                return new CardData(this);
            } 

        } 

    }
    /**
     * 
     * {@link InvokeAssistantRequest} extends {@link TeaModel}
     *
     * <p>InvokeAssistantRequest</p>
     */
    public static class CardUpdateOptions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("updateCardDataByKey")
        private Boolean updateCardDataByKey;

        @com.aliyun.core.annotation.NameInMap("updatePrivateDataByKey")
        private Boolean updatePrivateDataByKey;

        private CardUpdateOptions(Builder builder) {
            this.updateCardDataByKey = builder.updateCardDataByKey;
            this.updatePrivateDataByKey = builder.updatePrivateDataByKey;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CardUpdateOptions create() {
            return builder().build();
        }

        /**
         * @return updateCardDataByKey
         */
        public Boolean getUpdateCardDataByKey() {
            return this.updateCardDataByKey;
        }

        /**
         * @return updatePrivateDataByKey
         */
        public Boolean getUpdatePrivateDataByKey() {
            return this.updatePrivateDataByKey;
        }

        public static final class Builder {
            private Boolean updateCardDataByKey; 
            private Boolean updatePrivateDataByKey; 

            private Builder() {
            } 

            private Builder(CardUpdateOptions model) {
                this.updateCardDataByKey = model.updateCardDataByKey;
                this.updatePrivateDataByKey = model.updatePrivateDataByKey;
            } 

            /**
             * updateCardDataByKey.
             */
            public Builder updateCardDataByKey(Boolean updateCardDataByKey) {
                this.updateCardDataByKey = updateCardDataByKey;
                return this;
            }

            /**
             * updatePrivateDataByKey.
             */
            public Builder updatePrivateDataByKey(Boolean updatePrivateDataByKey) {
                this.updatePrivateDataByKey = updatePrivateDataByKey;
                return this;
            }

            public CardUpdateOptions build() {
                return new CardUpdateOptions(this);
            } 

        } 

    }
    /**
     * 
     * {@link InvokeAssistantRequest} extends {@link TeaModel}
     *
     * <p>InvokeAssistantRequest</p>
     */
    public static class PullConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("interval")
        private Integer interval;

        @com.aliyun.core.annotation.NameInMap("pullStrategy")
        private String pullStrategy;

        @com.aliyun.core.annotation.NameInMap("timeUnit")
        private String timeUnit;

        private PullConfig(Builder builder) {
            this.interval = builder.interval;
            this.pullStrategy = builder.pullStrategy;
            this.timeUnit = builder.timeUnit;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PullConfig create() {
            return builder().build();
        }

        /**
         * @return interval
         */
        public Integer getInterval() {
            return this.interval;
        }

        /**
         * @return pullStrategy
         */
        public String getPullStrategy() {
            return this.pullStrategy;
        }

        /**
         * @return timeUnit
         */
        public String getTimeUnit() {
            return this.timeUnit;
        }

        public static final class Builder {
            private Integer interval; 
            private String pullStrategy; 
            private String timeUnit; 

            private Builder() {
            } 

            private Builder(PullConfig model) {
                this.interval = model.interval;
                this.pullStrategy = model.pullStrategy;
                this.timeUnit = model.timeUnit;
            } 

            /**
             * interval.
             */
            public Builder interval(Integer interval) {
                this.interval = interval;
                return this;
            }

            /**
             * pullStrategy.
             */
            public Builder pullStrategy(String pullStrategy) {
                this.pullStrategy = pullStrategy;
                return this;
            }

            /**
             * timeUnit.
             */
            public Builder timeUnit(String timeUnit) {
                this.timeUnit = timeUnit;
                return this;
            }

            public PullConfig build() {
                return new PullConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link InvokeAssistantRequest} extends {@link TeaModel}
     *
     * <p>InvokeAssistantRequest</p>
     */
    public static class DynamicDataSourceConfigs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("constParams")
        private java.util.Map<String, ?> constParams;

        @com.aliyun.core.annotation.NameInMap("dynamicDataSourceId")
        private String dynamicDataSourceId;

        @com.aliyun.core.annotation.NameInMap("pullConfig")
        private PullConfig pullConfig;

        private DynamicDataSourceConfigs(Builder builder) {
            this.constParams = builder.constParams;
            this.dynamicDataSourceId = builder.dynamicDataSourceId;
            this.pullConfig = builder.pullConfig;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DynamicDataSourceConfigs create() {
            return builder().build();
        }

        /**
         * @return constParams
         */
        public java.util.Map<String, ?> getConstParams() {
            return this.constParams;
        }

        /**
         * @return dynamicDataSourceId
         */
        public String getDynamicDataSourceId() {
            return this.dynamicDataSourceId;
        }

        /**
         * @return pullConfig
         */
        public PullConfig getPullConfig() {
            return this.pullConfig;
        }

        public static final class Builder {
            private java.util.Map<String, ?> constParams; 
            private String dynamicDataSourceId; 
            private PullConfig pullConfig; 

            private Builder() {
            } 

            private Builder(DynamicDataSourceConfigs model) {
                this.constParams = model.constParams;
                this.dynamicDataSourceId = model.dynamicDataSourceId;
                this.pullConfig = model.pullConfig;
            } 

            /**
             * constParams.
             */
            public Builder constParams(java.util.Map<String, ?> constParams) {
                this.constParams = constParams;
                return this;
            }

            /**
             * dynamicDataSourceId.
             */
            public Builder dynamicDataSourceId(String dynamicDataSourceId) {
                this.dynamicDataSourceId = dynamicDataSourceId;
                return this;
            }

            /**
             * pullConfig.
             */
            public Builder pullConfig(PullConfig pullConfig) {
                this.pullConfig = pullConfig;
                return this;
            }

            public DynamicDataSourceConfigs build() {
                return new DynamicDataSourceConfigs(this);
            } 

        } 

    }
    /**
     * 
     * {@link InvokeAssistantRequest} extends {@link TeaModel}
     *
     * <p>InvokeAssistantRequest</p>
     */
    public static class DingNormalCard extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("cardData")
        private CardData cardData;

        @com.aliyun.core.annotation.NameInMap("cardTemplateId")
        private String cardTemplateId;

        @com.aliyun.core.annotation.NameInMap("cardUpdateOptions")
        private CardUpdateOptions cardUpdateOptions;

        @com.aliyun.core.annotation.NameInMap("dynamicDataSourceConfigs")
        private java.util.List<DynamicDataSourceConfigs> dynamicDataSourceConfigs;

        @com.aliyun.core.annotation.NameInMap("privateData")
        private java.util.Map<String, java.util.Map<String, ?>> privateData;

        private DingNormalCard(Builder builder) {
            this.cardData = builder.cardData;
            this.cardTemplateId = builder.cardTemplateId;
            this.cardUpdateOptions = builder.cardUpdateOptions;
            this.dynamicDataSourceConfigs = builder.dynamicDataSourceConfigs;
            this.privateData = builder.privateData;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DingNormalCard create() {
            return builder().build();
        }

        /**
         * @return cardData
         */
        public CardData getCardData() {
            return this.cardData;
        }

        /**
         * @return cardTemplateId
         */
        public String getCardTemplateId() {
            return this.cardTemplateId;
        }

        /**
         * @return cardUpdateOptions
         */
        public CardUpdateOptions getCardUpdateOptions() {
            return this.cardUpdateOptions;
        }

        /**
         * @return dynamicDataSourceConfigs
         */
        public java.util.List<DynamicDataSourceConfigs> getDynamicDataSourceConfigs() {
            return this.dynamicDataSourceConfigs;
        }

        /**
         * @return privateData
         */
        public java.util.Map<String, java.util.Map<String, ?>> getPrivateData() {
            return this.privateData;
        }

        public static final class Builder {
            private CardData cardData; 
            private String cardTemplateId; 
            private CardUpdateOptions cardUpdateOptions; 
            private java.util.List<DynamicDataSourceConfigs> dynamicDataSourceConfigs; 
            private java.util.Map<String, java.util.Map<String, ?>> privateData; 

            private Builder() {
            } 

            private Builder(DingNormalCard model) {
                this.cardData = model.cardData;
                this.cardTemplateId = model.cardTemplateId;
                this.cardUpdateOptions = model.cardUpdateOptions;
                this.dynamicDataSourceConfigs = model.dynamicDataSourceConfigs;
                this.privateData = model.privateData;
            } 

            /**
             * cardData.
             */
            public Builder cardData(CardData cardData) {
                this.cardData = cardData;
                return this;
            }

            /**
             * cardTemplateId.
             */
            public Builder cardTemplateId(String cardTemplateId) {
                this.cardTemplateId = cardTemplateId;
                return this;
            }

            /**
             * cardUpdateOptions.
             */
            public Builder cardUpdateOptions(CardUpdateOptions cardUpdateOptions) {
                this.cardUpdateOptions = cardUpdateOptions;
                return this;
            }

            /**
             * dynamicDataSourceConfigs.
             */
            public Builder dynamicDataSourceConfigs(java.util.List<DynamicDataSourceConfigs> dynamicDataSourceConfigs) {
                this.dynamicDataSourceConfigs = dynamicDataSourceConfigs;
                return this;
            }

            /**
             * privateData.
             */
            public Builder privateData(java.util.Map<String, java.util.Map<String, ?>> privateData) {
                this.privateData = privateData;
                return this;
            }

            public DingNormalCard build() {
                return new DingNormalCard(this);
            } 

        } 

    }
    /**
     * 
     * {@link InvokeAssistantRequest} extends {@link TeaModel}
     *
     * <p>InvokeAssistantRequest</p>
     */
    public static class Markdown extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("value")
        private String value;

        private Markdown(Builder builder) {
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Markdown create() {
            return builder().build();
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String value; 

            private Builder() {
            } 

            private Builder(Markdown model) {
                this.value = model.value;
            } 

            /**
             * value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Markdown build() {
                return new Markdown(this);
            } 

        } 

    }
    /**
     * 
     * {@link InvokeAssistantRequest} extends {@link TeaModel}
     *
     * <p>InvokeAssistantRequest</p>
     */
    public static class DataPart extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("data")
        private Object data;

        private DataPart(Builder builder) {
            this.data = builder.data;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataPart create() {
            return builder().build();
        }

        /**
         * @return data
         */
        public Object getData() {
            return this.data;
        }

        public static final class Builder {
            private Object data; 

            private Builder() {
            } 

            private Builder(DataPart model) {
                this.data = model.data;
            } 

            /**
             * data.
             */
            public Builder data(Object data) {
                this.data = data;
                return this;
            }

            public DataPart build() {
                return new DataPart(this);
            } 

        } 

    }
    /**
     * 
     * {@link InvokeAssistantRequest} extends {@link TeaModel}
     *
     * <p>InvokeAssistantRequest</p>
     */
    public static class ReasonPart extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("reason")
        private String reason;

        private ReasonPart(Builder builder) {
            this.reason = builder.reason;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ReasonPart create() {
            return builder().build();
        }

        /**
         * @return reason
         */
        public String getReason() {
            return this.reason;
        }

        public static final class Builder {
            private String reason; 

            private Builder() {
            } 

            private Builder(ReasonPart model) {
                this.reason = model.reason;
            } 

            /**
             * reason.
             */
            public Builder reason(String reason) {
                this.reason = reason;
                return this;
            }

            public ReasonPart build() {
                return new ReasonPart(this);
            } 

        } 

    }
    /**
     * 
     * {@link InvokeAssistantRequest} extends {@link TeaModel}
     *
     * <p>InvokeAssistantRequest</p>
     */
    public static class Recommends extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("mobileUrl")
        private String mobileUrl;

        @com.aliyun.core.annotation.NameInMap("text")
        private String text;

        @com.aliyun.core.annotation.NameInMap("url")
        private String url;

        private Recommends(Builder builder) {
            this.mobileUrl = builder.mobileUrl;
            this.text = builder.text;
            this.url = builder.url;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Recommends create() {
            return builder().build();
        }

        /**
         * @return mobileUrl
         */
        public String getMobileUrl() {
            return this.mobileUrl;
        }

        /**
         * @return text
         */
        public String getText() {
            return this.text;
        }

        /**
         * @return url
         */
        public String getUrl() {
            return this.url;
        }

        public static final class Builder {
            private String mobileUrl; 
            private String text; 
            private String url; 

            private Builder() {
            } 

            private Builder(Recommends model) {
                this.mobileUrl = model.mobileUrl;
                this.text = model.text;
                this.url = model.url;
            } 

            /**
             * mobileUrl.
             */
            public Builder mobileUrl(String mobileUrl) {
                this.mobileUrl = mobileUrl;
                return this;
            }

            /**
             * text.
             */
            public Builder text(String text) {
                this.text = text;
                return this;
            }

            /**
             * url.
             */
            public Builder url(String url) {
                this.url = url;
                return this;
            }

            public Recommends build() {
                return new Recommends(this);
            } 

        } 

    }
    /**
     * 
     * {@link InvokeAssistantRequest} extends {@link TeaModel}
     *
     * <p>InvokeAssistantRequest</p>
     */
    public static class RecommendPart extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("recommends")
        private java.util.List<Recommends> recommends;

        private RecommendPart(Builder builder) {
            this.recommends = builder.recommends;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RecommendPart create() {
            return builder().build();
        }

        /**
         * @return recommends
         */
        public java.util.List<Recommends> getRecommends() {
            return this.recommends;
        }

        public static final class Builder {
            private java.util.List<Recommends> recommends; 

            private Builder() {
            } 

            private Builder(RecommendPart model) {
                this.recommends = model.recommends;
            } 

            /**
             * recommends.
             */
            public Builder recommends(java.util.List<Recommends> recommends) {
                this.recommends = recommends;
                return this;
            }

            public RecommendPart build() {
                return new RecommendPart(this);
            } 

        } 

    }
    /**
     * 
     * {@link InvokeAssistantRequest} extends {@link TeaModel}
     *
     * <p>InvokeAssistantRequest</p>
     */
    public static class References extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("index")
        private String index;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("sourceCode")
        private String sourceCode;

        @com.aliyun.core.annotation.NameInMap("sourceIcon")
        private String sourceIcon;

        @com.aliyun.core.annotation.NameInMap("summary")
        private String summary;

        @com.aliyun.core.annotation.NameInMap("title")
        private String title;

        @com.aliyun.core.annotation.NameInMap("url")
        private String url;

        private References(Builder builder) {
            this.index = builder.index;
            this.name = builder.name;
            this.sourceCode = builder.sourceCode;
            this.sourceIcon = builder.sourceIcon;
            this.summary = builder.summary;
            this.title = builder.title;
            this.url = builder.url;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static References create() {
            return builder().build();
        }

        /**
         * @return index
         */
        public String getIndex() {
            return this.index;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return sourceCode
         */
        public String getSourceCode() {
            return this.sourceCode;
        }

        /**
         * @return sourceIcon
         */
        public String getSourceIcon() {
            return this.sourceIcon;
        }

        /**
         * @return summary
         */
        public String getSummary() {
            return this.summary;
        }

        /**
         * @return title
         */
        public String getTitle() {
            return this.title;
        }

        /**
         * @return url
         */
        public String getUrl() {
            return this.url;
        }

        public static final class Builder {
            private String index; 
            private String name; 
            private String sourceCode; 
            private String sourceIcon; 
            private String summary; 
            private String title; 
            private String url; 

            private Builder() {
            } 

            private Builder(References model) {
                this.index = model.index;
                this.name = model.name;
                this.sourceCode = model.sourceCode;
                this.sourceIcon = model.sourceIcon;
                this.summary = model.summary;
                this.title = model.title;
                this.url = model.url;
            } 

            /**
             * index.
             */
            public Builder index(String index) {
                this.index = index;
                return this;
            }

            /**
             * name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * sourceCode.
             */
            public Builder sourceCode(String sourceCode) {
                this.sourceCode = sourceCode;
                return this;
            }

            /**
             * sourceIcon.
             */
            public Builder sourceIcon(String sourceIcon) {
                this.sourceIcon = sourceIcon;
                return this;
            }

            /**
             * summary.
             */
            public Builder summary(String summary) {
                this.summary = summary;
                return this;
            }

            /**
             * title.
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            /**
             * url.
             */
            public Builder url(String url) {
                this.url = url;
                return this;
            }

            public References build() {
                return new References(this);
            } 

        } 

    }
    /**
     * 
     * {@link InvokeAssistantRequest} extends {@link TeaModel}
     *
     * <p>InvokeAssistantRequest</p>
     */
    public static class ReferencePart extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("references")
        private java.util.List<References> references;

        private ReferencePart(Builder builder) {
            this.references = builder.references;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ReferencePart create() {
            return builder().build();
        }

        /**
         * @return references
         */
        public java.util.List<References> getReferences() {
            return this.references;
        }

        public static final class Builder {
            private java.util.List<References> references; 

            private Builder() {
            } 

            private Builder(ReferencePart model) {
                this.references = model.references;
            } 

            /**
             * references.
             */
            public Builder references(java.util.List<References> references) {
                this.references = references;
                return this;
            }

            public ReferencePart build() {
                return new ReferencePart(this);
            } 

        } 

    }
    /**
     * 
     * {@link InvokeAssistantRequest} extends {@link TeaModel}
     *
     * <p>InvokeAssistantRequest</p>
     */
    public static class TextPart extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("text")
        private String text;

        private TextPart(Builder builder) {
            this.text = builder.text;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TextPart create() {
            return builder().build();
        }

        /**
         * @return text
         */
        public String getText() {
            return this.text;
        }

        public static final class Builder {
            private String text; 

            private Builder() {
            } 

            private Builder(TextPart model) {
                this.text = model.text;
            } 

            /**
             * text.
             */
            public Builder text(String text) {
                this.text = text;
                return this;
            }

            public TextPart build() {
                return new TextPart(this);
            } 

        } 

    }
    /**
     * 
     * {@link InvokeAssistantRequest} extends {@link TeaModel}
     *
     * <p>InvokeAssistantRequest</p>
     */
    public static class Parts extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("append")
        private Boolean append;

        @com.aliyun.core.annotation.NameInMap("dataPart")
        private DataPart dataPart;

        @com.aliyun.core.annotation.NameInMap("finish")
        private Boolean finish;

        @com.aliyun.core.annotation.NameInMap("partDesc")
        private String partDesc;

        @com.aliyun.core.annotation.NameInMap("partId")
        private String partId;

        @com.aliyun.core.annotation.NameInMap("reasonPart")
        private ReasonPart reasonPart;

        @com.aliyun.core.annotation.NameInMap("recommendPart")
        private RecommendPart recommendPart;

        @com.aliyun.core.annotation.NameInMap("referencePart")
        private ReferencePart referencePart;

        @com.aliyun.core.annotation.NameInMap("textPart")
        private TextPart textPart;

        @com.aliyun.core.annotation.NameInMap("type")
        @com.aliyun.core.annotation.Validation(required = true)
        private String type;

        private Parts(Builder builder) {
            this.append = builder.append;
            this.dataPart = builder.dataPart;
            this.finish = builder.finish;
            this.partDesc = builder.partDesc;
            this.partId = builder.partId;
            this.reasonPart = builder.reasonPart;
            this.recommendPart = builder.recommendPart;
            this.referencePart = builder.referencePart;
            this.textPart = builder.textPart;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Parts create() {
            return builder().build();
        }

        /**
         * @return append
         */
        public Boolean getAppend() {
            return this.append;
        }

        /**
         * @return dataPart
         */
        public DataPart getDataPart() {
            return this.dataPart;
        }

        /**
         * @return finish
         */
        public Boolean getFinish() {
            return this.finish;
        }

        /**
         * @return partDesc
         */
        public String getPartDesc() {
            return this.partDesc;
        }

        /**
         * @return partId
         */
        public String getPartId() {
            return this.partId;
        }

        /**
         * @return reasonPart
         */
        public ReasonPart getReasonPart() {
            return this.reasonPart;
        }

        /**
         * @return recommendPart
         */
        public RecommendPart getRecommendPart() {
            return this.recommendPart;
        }

        /**
         * @return referencePart
         */
        public ReferencePart getReferencePart() {
            return this.referencePart;
        }

        /**
         * @return textPart
         */
        public TextPart getTextPart() {
            return this.textPart;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private Boolean append; 
            private DataPart dataPart; 
            private Boolean finish; 
            private String partDesc; 
            private String partId; 
            private ReasonPart reasonPart; 
            private RecommendPart recommendPart; 
            private ReferencePart referencePart; 
            private TextPart textPart; 
            private String type; 

            private Builder() {
            } 

            private Builder(Parts model) {
                this.append = model.append;
                this.dataPart = model.dataPart;
                this.finish = model.finish;
                this.partDesc = model.partDesc;
                this.partId = model.partId;
                this.reasonPart = model.reasonPart;
                this.recommendPart = model.recommendPart;
                this.referencePart = model.referencePart;
                this.textPart = model.textPart;
                this.type = model.type;
            } 

            /**
             * append.
             */
            public Builder append(Boolean append) {
                this.append = append;
                return this;
            }

            /**
             * dataPart.
             */
            public Builder dataPart(DataPart dataPart) {
                this.dataPart = dataPart;
                return this;
            }

            /**
             * finish.
             */
            public Builder finish(Boolean finish) {
                this.finish = finish;
                return this;
            }

            /**
             * partDesc.
             */
            public Builder partDesc(String partDesc) {
                this.partDesc = partDesc;
                return this;
            }

            /**
             * partId.
             */
            public Builder partId(String partId) {
                this.partId = partId;
                return this;
            }

            /**
             * reasonPart.
             */
            public Builder reasonPart(ReasonPart reasonPart) {
                this.reasonPart = reasonPart;
                return this;
            }

            /**
             * recommendPart.
             */
            public Builder recommendPart(RecommendPart recommendPart) {
                this.recommendPart = recommendPart;
                return this;
            }

            /**
             * referencePart.
             */
            public Builder referencePart(ReferencePart referencePart) {
                this.referencePart = referencePart;
                return this;
            }

            /**
             * textPart.
             */
            public Builder textPart(TextPart textPart) {
                this.textPart = textPart;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>textPart</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Parts build() {
                return new Parts(this);
            } 

        } 

    }
    /**
     * 
     * {@link InvokeAssistantRequest} extends {@link TeaModel}
     *
     * <p>InvokeAssistantRequest</p>
     */
    public static class StructView extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("parts")
        private java.util.List<Parts> parts;

        private StructView(Builder builder) {
            this.parts = builder.parts;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static StructView create() {
            return builder().build();
        }

        /**
         * @return parts
         */
        public java.util.List<Parts> getParts() {
            return this.parts;
        }

        public static final class Builder {
            private java.util.List<Parts> parts; 

            private Builder() {
            } 

            private Builder(StructView model) {
                this.parts = model.parts;
            } 

            /**
             * parts.
             */
            public Builder parts(java.util.List<Parts> parts) {
                this.parts = parts;
                return this;
            }

            public StructView build() {
                return new StructView(this);
            } 

        } 

    }
    /**
     * 
     * {@link InvokeAssistantRequest} extends {@link TeaModel}
     *
     * <p>InvokeAssistantRequest</p>
     */
    public static class Text extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("value")
        private String value;

        private Text(Builder builder) {
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Text create() {
            return builder().build();
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String value; 

            private Builder() {
            } 

            private Builder(Text model) {
                this.value = model.value;
            } 

            /**
             * value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Text build() {
                return new Text(this);
            } 

        } 

    }
    /**
     * 
     * {@link InvokeAssistantRequest} extends {@link TeaModel}
     *
     * <p>InvokeAssistantRequest</p>
     */
    public static class Content extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("cardCallback")
        private CardCallback cardCallback;

        @com.aliyun.core.annotation.NameInMap("dingCard")
        private DingCard dingCard;

        @com.aliyun.core.annotation.NameInMap("dingNormalCard")
        private DingNormalCard dingNormalCard;

        @com.aliyun.core.annotation.NameInMap("markdown")
        private Markdown markdown;

        @com.aliyun.core.annotation.NameInMap("structView")
        private StructView structView;

        @com.aliyun.core.annotation.NameInMap("text")
        private Text text;

        @com.aliyun.core.annotation.NameInMap("type")
        @com.aliyun.core.annotation.Validation(required = true)
        private String type;

        private Content(Builder builder) {
            this.cardCallback = builder.cardCallback;
            this.dingCard = builder.dingCard;
            this.dingNormalCard = builder.dingNormalCard;
            this.markdown = builder.markdown;
            this.structView = builder.structView;
            this.text = builder.text;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Content create() {
            return builder().build();
        }

        /**
         * @return cardCallback
         */
        public CardCallback getCardCallback() {
            return this.cardCallback;
        }

        /**
         * @return dingCard
         */
        public DingCard getDingCard() {
            return this.dingCard;
        }

        /**
         * @return dingNormalCard
         */
        public DingNormalCard getDingNormalCard() {
            return this.dingNormalCard;
        }

        /**
         * @return markdown
         */
        public Markdown getMarkdown() {
            return this.markdown;
        }

        /**
         * @return structView
         */
        public StructView getStructView() {
            return this.structView;
        }

        /**
         * @return text
         */
        public Text getText() {
            return this.text;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private CardCallback cardCallback; 
            private DingCard dingCard; 
            private DingNormalCard dingNormalCard; 
            private Markdown markdown; 
            private StructView structView; 
            private Text text; 
            private String type; 

            private Builder() {
            } 

            private Builder(Content model) {
                this.cardCallback = model.cardCallback;
                this.dingCard = model.dingCard;
                this.dingNormalCard = model.dingNormalCard;
                this.markdown = model.markdown;
                this.structView = model.structView;
                this.text = model.text;
                this.type = model.type;
            } 

            /**
             * cardCallback.
             */
            public Builder cardCallback(CardCallback cardCallback) {
                this.cardCallback = cardCallback;
                return this;
            }

            /**
             * dingCard.
             */
            public Builder dingCard(DingCard dingCard) {
                this.dingCard = dingCard;
                return this;
            }

            /**
             * dingNormalCard.
             */
            public Builder dingNormalCard(DingNormalCard dingNormalCard) {
                this.dingNormalCard = dingNormalCard;
                return this;
            }

            /**
             * markdown.
             */
            public Builder markdown(Markdown markdown) {
                this.markdown = markdown;
                return this;
            }

            /**
             * structView.
             */
            public Builder structView(StructView structView) {
                this.structView = structView;
                return this;
            }

            /**
             * text.
             */
            public Builder text(Text text) {
                this.text = text;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>枚举字段，可为：text,markdown,cardCallback,dingCard,agentArtifact,dingNormalCard</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Content build() {
                return new Content(this);
            } 

        } 

    }
    /**
     * 
     * {@link InvokeAssistantRequest} extends {@link TeaModel}
     *
     * <p>InvokeAssistantRequest</p>
     */
    public static class Messages extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("content")
        private Content content;

        @com.aliyun.core.annotation.NameInMap("contentDesc")
        private String contentDesc;

        @com.aliyun.core.annotation.NameInMap("createAt")
        private Long createAt;

        @com.aliyun.core.annotation.NameInMap("role")
        private String role;

        private Messages(Builder builder) {
            this.content = builder.content;
            this.contentDesc = builder.contentDesc;
            this.createAt = builder.createAt;
            this.role = builder.role;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Messages create() {
            return builder().build();
        }

        /**
         * @return content
         */
        public Content getContent() {
            return this.content;
        }

        /**
         * @return contentDesc
         */
        public String getContentDesc() {
            return this.contentDesc;
        }

        /**
         * @return createAt
         */
        public Long getCreateAt() {
            return this.createAt;
        }

        /**
         * @return role
         */
        public String getRole() {
            return this.role;
        }

        public static final class Builder {
            private Content content; 
            private String contentDesc; 
            private Long createAt; 
            private String role; 

            private Builder() {
            } 

            private Builder(Messages model) {
                this.content = model.content;
                this.contentDesc = model.contentDesc;
                this.createAt = model.createAt;
                this.role = model.role;
            } 

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>{}</p>
             */
            public Builder content(Content content) {
                this.content = content;
                return this;
            }

            /**
             * contentDesc.
             */
            public Builder contentDesc(String contentDesc) {
                this.contentDesc = contentDesc;
                return this;
            }

            /**
             * createAt.
             */
            public Builder createAt(Long createAt) {
                this.createAt = createAt;
                return this;
            }

            /**
             * role.
             */
            public Builder role(String role) {
                this.role = role;
                return this;
            }

            public Messages build() {
                return new Messages(this);
            } 

        } 

    }
}
