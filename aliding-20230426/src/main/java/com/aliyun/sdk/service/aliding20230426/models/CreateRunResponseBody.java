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
 * {@link CreateRunResponseBody} extends {@link TeaModel}
 *
 * <p>CreateRunResponseBody</p>
 */
public class CreateRunResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("messages")
    private java.util.List<Messages> messages;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("run")
    private Run run;

    @com.aliyun.core.annotation.NameInMap("thread")
    private Thread thread;

    private CreateRunResponseBody(Builder builder) {
        this.messages = builder.messages;
        this.requestId = builder.requestId;
        this.run = builder.run;
        this.thread = builder.thread;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateRunResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return messages
     */
    public java.util.List<Messages> getMessages() {
        return this.messages;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return run
     */
    public Run getRun() {
        return this.run;
    }

    /**
     * @return thread
     */
    public Thread getThread() {
        return this.thread;
    }

    public static final class Builder {
        private java.util.List<Messages> messages; 
        private String requestId; 
        private Run run; 
        private Thread thread; 

        private Builder() {
        } 

        private Builder(CreateRunResponseBody model) {
            this.messages = model.messages;
            this.requestId = model.requestId;
            this.run = model.run;
            this.thread = model.thread;
        } 

        /**
         * messages.
         */
        public Builder messages(java.util.List<Messages> messages) {
            this.messages = messages;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * run.
         */
        public Builder run(Run run) {
            this.run = run;
            return this;
        }

        /**
         * thread.
         */
        public Builder thread(Thread thread) {
            this.thread = thread;
            return this;
        }

        public CreateRunResponseBody build() {
            return new CreateRunResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CreateRunResponseBody} extends {@link TeaModel}
     *
     * <p>CreateRunResponseBody</p>
     */
    public static class CardCallback extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("content")
        private String content;

        @com.aliyun.core.annotation.NameInMap("relatedMessageId")
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
             * content.
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * relatedMessageId.
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
     * {@link CreateRunResponseBody} extends {@link TeaModel}
     *
     * <p>CreateRunResponseBody</p>
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
             * content.
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
     * {@link CreateRunResponseBody} extends {@link TeaModel}
     *
     * <p>CreateRunResponseBody</p>
     */
    public static class CardData extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("cardParamMap")
        private Object cardParamMap;

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
        public Object getCardParamMap() {
            return this.cardParamMap;
        }

        public static final class Builder {
            private Object cardParamMap; 

            private Builder() {
            } 

            private Builder(CardData model) {
                this.cardParamMap = model.cardParamMap;
            } 

            /**
             * cardParamMap.
             */
            public Builder cardParamMap(Object cardParamMap) {
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
     * {@link CreateRunResponseBody} extends {@link TeaModel}
     *
     * <p>CreateRunResponseBody</p>
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
     * {@link CreateRunResponseBody} extends {@link TeaModel}
     *
     * <p>CreateRunResponseBody</p>
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
     * {@link CreateRunResponseBody} extends {@link TeaModel}
     *
     * <p>CreateRunResponseBody</p>
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
     * {@link CreateRunResponseBody} extends {@link TeaModel}
     *
     * <p>CreateRunResponseBody</p>
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
     * {@link CreateRunResponseBody} extends {@link TeaModel}
     *
     * <p>CreateRunResponseBody</p>
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
     * {@link CreateRunResponseBody} extends {@link TeaModel}
     *
     * <p>CreateRunResponseBody</p>
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
     * {@link CreateRunResponseBody} extends {@link TeaModel}
     *
     * <p>CreateRunResponseBody</p>
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
     * {@link CreateRunResponseBody} extends {@link TeaModel}
     *
     * <p>CreateRunResponseBody</p>
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
     * {@link CreateRunResponseBody} extends {@link TeaModel}
     *
     * <p>CreateRunResponseBody</p>
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
     * {@link CreateRunResponseBody} extends {@link TeaModel}
     *
     * <p>CreateRunResponseBody</p>
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
     * {@link CreateRunResponseBody} extends {@link TeaModel}
     *
     * <p>CreateRunResponseBody</p>
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
     * {@link CreateRunResponseBody} extends {@link TeaModel}
     *
     * <p>CreateRunResponseBody</p>
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
     * {@link CreateRunResponseBody} extends {@link TeaModel}
     *
     * <p>CreateRunResponseBody</p>
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
     * {@link CreateRunResponseBody} extends {@link TeaModel}
     *
     * <p>CreateRunResponseBody</p>
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
     * {@link CreateRunResponseBody} extends {@link TeaModel}
     *
     * <p>CreateRunResponseBody</p>
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
     * {@link CreateRunResponseBody} extends {@link TeaModel}
     *
     * <p>CreateRunResponseBody</p>
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
     * {@link CreateRunResponseBody} extends {@link TeaModel}
     *
     * <p>CreateRunResponseBody</p>
     */
    public static class PartsDataPart extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("data")
        private Object data;

        private PartsDataPart(Builder builder) {
            this.data = builder.data;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PartsDataPart create() {
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

            private Builder(PartsDataPart model) {
                this.data = model.data;
            } 

            /**
             * data.
             */
            public Builder data(Object data) {
                this.data = data;
                return this;
            }

            public PartsDataPart build() {
                return new PartsDataPart(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateRunResponseBody} extends {@link TeaModel}
     *
     * <p>CreateRunResponseBody</p>
     */
    public static class PartsReasonPart extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("reason")
        private String reason;

        private PartsReasonPart(Builder builder) {
            this.reason = builder.reason;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PartsReasonPart create() {
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

            private Builder(PartsReasonPart model) {
                this.reason = model.reason;
            } 

            /**
             * reason.
             */
            public Builder reason(String reason) {
                this.reason = reason;
                return this;
            }

            public PartsReasonPart build() {
                return new PartsReasonPart(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateRunResponseBody} extends {@link TeaModel}
     *
     * <p>CreateRunResponseBody</p>
     */
    public static class RecommendPartRecommends extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("mobileUrl")
        private String mobileUrl;

        @com.aliyun.core.annotation.NameInMap("text")
        private String text;

        @com.aliyun.core.annotation.NameInMap("url")
        private String url;

        private RecommendPartRecommends(Builder builder) {
            this.mobileUrl = builder.mobileUrl;
            this.text = builder.text;
            this.url = builder.url;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RecommendPartRecommends create() {
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

            private Builder(RecommendPartRecommends model) {
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

            public RecommendPartRecommends build() {
                return new RecommendPartRecommends(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateRunResponseBody} extends {@link TeaModel}
     *
     * <p>CreateRunResponseBody</p>
     */
    public static class PartsRecommendPart extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("recommends")
        private java.util.List<RecommendPartRecommends> recommends;

        private PartsRecommendPart(Builder builder) {
            this.recommends = builder.recommends;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PartsRecommendPart create() {
            return builder().build();
        }

        /**
         * @return recommends
         */
        public java.util.List<RecommendPartRecommends> getRecommends() {
            return this.recommends;
        }

        public static final class Builder {
            private java.util.List<RecommendPartRecommends> recommends; 

            private Builder() {
            } 

            private Builder(PartsRecommendPart model) {
                this.recommends = model.recommends;
            } 

            /**
             * recommends.
             */
            public Builder recommends(java.util.List<RecommendPartRecommends> recommends) {
                this.recommends = recommends;
                return this;
            }

            public PartsRecommendPart build() {
                return new PartsRecommendPart(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateRunResponseBody} extends {@link TeaModel}
     *
     * <p>CreateRunResponseBody</p>
     */
    public static class ReferencePartReferences extends TeaModel {
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

        private ReferencePartReferences(Builder builder) {
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

        public static ReferencePartReferences create() {
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

            private Builder(ReferencePartReferences model) {
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

            public ReferencePartReferences build() {
                return new ReferencePartReferences(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateRunResponseBody} extends {@link TeaModel}
     *
     * <p>CreateRunResponseBody</p>
     */
    public static class PartsReferencePart extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("references")
        private java.util.List<ReferencePartReferences> references;

        private PartsReferencePart(Builder builder) {
            this.references = builder.references;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PartsReferencePart create() {
            return builder().build();
        }

        /**
         * @return references
         */
        public java.util.List<ReferencePartReferences> getReferences() {
            return this.references;
        }

        public static final class Builder {
            private java.util.List<ReferencePartReferences> references; 

            private Builder() {
            } 

            private Builder(PartsReferencePart model) {
                this.references = model.references;
            } 

            /**
             * references.
             */
            public Builder references(java.util.List<ReferencePartReferences> references) {
                this.references = references;
                return this;
            }

            public PartsReferencePart build() {
                return new PartsReferencePart(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateRunResponseBody} extends {@link TeaModel}
     *
     * <p>CreateRunResponseBody</p>
     */
    public static class PartsTextPart extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("text")
        private String text;

        private PartsTextPart(Builder builder) {
            this.text = builder.text;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PartsTextPart create() {
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

            private Builder(PartsTextPart model) {
                this.text = model.text;
            } 

            /**
             * text.
             */
            public Builder text(String text) {
                this.text = text;
                return this;
            }

            public PartsTextPart build() {
                return new PartsTextPart(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateRunResponseBody} extends {@link TeaModel}
     *
     * <p>CreateRunResponseBody</p>
     */
    public static class ContentStructParts extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("append")
        private Boolean append;

        @com.aliyun.core.annotation.NameInMap("dataPart")
        private PartsDataPart dataPart;

        @com.aliyun.core.annotation.NameInMap("finish")
        private Boolean finish;

        @com.aliyun.core.annotation.NameInMap("partDesc")
        private String partDesc;

        @com.aliyun.core.annotation.NameInMap("partId")
        private String partId;

        @com.aliyun.core.annotation.NameInMap("reasonPart")
        private PartsReasonPart reasonPart;

        @com.aliyun.core.annotation.NameInMap("recommendPart")
        private PartsRecommendPart recommendPart;

        @com.aliyun.core.annotation.NameInMap("referencePart")
        private PartsReferencePart referencePart;

        @com.aliyun.core.annotation.NameInMap("textPart")
        private PartsTextPart textPart;

        @com.aliyun.core.annotation.NameInMap("type")
        @com.aliyun.core.annotation.Validation(required = true)
        private String type;

        private ContentStructParts(Builder builder) {
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

        public static ContentStructParts create() {
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
        public PartsDataPart getDataPart() {
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
        public PartsReasonPart getReasonPart() {
            return this.reasonPart;
        }

        /**
         * @return recommendPart
         */
        public PartsRecommendPart getRecommendPart() {
            return this.recommendPart;
        }

        /**
         * @return referencePart
         */
        public PartsReferencePart getReferencePart() {
            return this.referencePart;
        }

        /**
         * @return textPart
         */
        public PartsTextPart getTextPart() {
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
            private PartsDataPart dataPart; 
            private Boolean finish; 
            private String partDesc; 
            private String partId; 
            private PartsReasonPart reasonPart; 
            private PartsRecommendPart recommendPart; 
            private PartsReferencePart referencePart; 
            private PartsTextPart textPart; 
            private String type; 

            private Builder() {
            } 

            private Builder(ContentStructParts model) {
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
            public Builder dataPart(PartsDataPart dataPart) {
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
            public Builder reasonPart(PartsReasonPart reasonPart) {
                this.reasonPart = reasonPart;
                return this;
            }

            /**
             * recommendPart.
             */
            public Builder recommendPart(PartsRecommendPart recommendPart) {
                this.recommendPart = recommendPart;
                return this;
            }

            /**
             * referencePart.
             */
            public Builder referencePart(PartsReferencePart referencePart) {
                this.referencePart = referencePart;
                return this;
            }

            /**
             * textPart.
             */
            public Builder textPart(PartsTextPart textPart) {
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

            public ContentStructParts build() {
                return new ContentStructParts(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateRunResponseBody} extends {@link TeaModel}
     *
     * <p>CreateRunResponseBody</p>
     */
    public static class ContentStruct extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("parts")
        private java.util.List<ContentStructParts> parts;

        private ContentStruct(Builder builder) {
            this.parts = builder.parts;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ContentStruct create() {
            return builder().build();
        }

        /**
         * @return parts
         */
        public java.util.List<ContentStructParts> getParts() {
            return this.parts;
        }

        public static final class Builder {
            private java.util.List<ContentStructParts> parts; 

            private Builder() {
            } 

            private Builder(ContentStruct model) {
                this.parts = model.parts;
            } 

            /**
             * parts.
             */
            public Builder parts(java.util.List<ContentStructParts> parts) {
                this.parts = parts;
                return this;
            }

            public ContentStruct build() {
                return new ContentStruct(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateRunResponseBody} extends {@link TeaModel}
     *
     * <p>CreateRunResponseBody</p>
     */
    public static class Messages extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("content")
        private Content content;

        @com.aliyun.core.annotation.NameInMap("contentDesc")
        private String contentDesc;

        @com.aliyun.core.annotation.NameInMap("contentStruct")
        private ContentStruct contentStruct;

        @com.aliyun.core.annotation.NameInMap("createAt")
        private Long createAt;

        @com.aliyun.core.annotation.NameInMap("id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("role")
        private String role;

        @com.aliyun.core.annotation.NameInMap("runId")
        private String runId;

        @com.aliyun.core.annotation.NameInMap("threadId")
        private String threadId;

        private Messages(Builder builder) {
            this.content = builder.content;
            this.contentDesc = builder.contentDesc;
            this.contentStruct = builder.contentStruct;
            this.createAt = builder.createAt;
            this.id = builder.id;
            this.role = builder.role;
            this.runId = builder.runId;
            this.threadId = builder.threadId;
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
         * @return contentStruct
         */
        public ContentStruct getContentStruct() {
            return this.contentStruct;
        }

        /**
         * @return createAt
         */
        public Long getCreateAt() {
            return this.createAt;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return role
         */
        public String getRole() {
            return this.role;
        }

        /**
         * @return runId
         */
        public String getRunId() {
            return this.runId;
        }

        /**
         * @return threadId
         */
        public String getThreadId() {
            return this.threadId;
        }

        public static final class Builder {
            private Content content; 
            private String contentDesc; 
            private ContentStruct contentStruct; 
            private Long createAt; 
            private String id; 
            private String role; 
            private String runId; 
            private String threadId; 

            private Builder() {
            } 

            private Builder(Messages model) {
                this.content = model.content;
                this.contentDesc = model.contentDesc;
                this.contentStruct = model.contentStruct;
                this.createAt = model.createAt;
                this.id = model.id;
                this.role = model.role;
                this.runId = model.runId;
                this.threadId = model.threadId;
            } 

            /**
             * content.
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
             * contentStruct.
             */
            public Builder contentStruct(ContentStruct contentStruct) {
                this.contentStruct = contentStruct;
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
             * id.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * role.
             */
            public Builder role(String role) {
                this.role = role;
                return this;
            }

            /**
             * runId.
             */
            public Builder runId(String runId) {
                this.runId = runId;
                return this;
            }

            /**
             * threadId.
             */
            public Builder threadId(String threadId) {
                this.threadId = threadId;
                return this;
            }

            public Messages build() {
                return new Messages(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateRunResponseBody} extends {@link TeaModel}
     *
     * <p>CreateRunResponseBody</p>
     */
    public static class Run extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("cancelledAt")
        private Long cancelledAt;

        @com.aliyun.core.annotation.NameInMap("completedAt")
        private Long completedAt;

        @com.aliyun.core.annotation.NameInMap("createAt")
        private Long createAt;

        @com.aliyun.core.annotation.NameInMap("expiresAt")
        private Long expiresAt;

        @com.aliyun.core.annotation.NameInMap("failedAt")
        private Long failedAt;

        @com.aliyun.core.annotation.NameInMap("id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("lastErrorMsg")
        private String lastErrorMsg;

        @com.aliyun.core.annotation.NameInMap("startedAt")
        private Long startedAt;

        @com.aliyun.core.annotation.NameInMap("status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("threadId")
        private String threadId;

        private Run(Builder builder) {
            this.cancelledAt = builder.cancelledAt;
            this.completedAt = builder.completedAt;
            this.createAt = builder.createAt;
            this.expiresAt = builder.expiresAt;
            this.failedAt = builder.failedAt;
            this.id = builder.id;
            this.lastErrorMsg = builder.lastErrorMsg;
            this.startedAt = builder.startedAt;
            this.status = builder.status;
            this.threadId = builder.threadId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Run create() {
            return builder().build();
        }

        /**
         * @return cancelledAt
         */
        public Long getCancelledAt() {
            return this.cancelledAt;
        }

        /**
         * @return completedAt
         */
        public Long getCompletedAt() {
            return this.completedAt;
        }

        /**
         * @return createAt
         */
        public Long getCreateAt() {
            return this.createAt;
        }

        /**
         * @return expiresAt
         */
        public Long getExpiresAt() {
            return this.expiresAt;
        }

        /**
         * @return failedAt
         */
        public Long getFailedAt() {
            return this.failedAt;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return lastErrorMsg
         */
        public String getLastErrorMsg() {
            return this.lastErrorMsg;
        }

        /**
         * @return startedAt
         */
        public Long getStartedAt() {
            return this.startedAt;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return threadId
         */
        public String getThreadId() {
            return this.threadId;
        }

        public static final class Builder {
            private Long cancelledAt; 
            private Long completedAt; 
            private Long createAt; 
            private Long expiresAt; 
            private Long failedAt; 
            private String id; 
            private String lastErrorMsg; 
            private Long startedAt; 
            private String status; 
            private String threadId; 

            private Builder() {
            } 

            private Builder(Run model) {
                this.cancelledAt = model.cancelledAt;
                this.completedAt = model.completedAt;
                this.createAt = model.createAt;
                this.expiresAt = model.expiresAt;
                this.failedAt = model.failedAt;
                this.id = model.id;
                this.lastErrorMsg = model.lastErrorMsg;
                this.startedAt = model.startedAt;
                this.status = model.status;
                this.threadId = model.threadId;
            } 

            /**
             * cancelledAt.
             */
            public Builder cancelledAt(Long cancelledAt) {
                this.cancelledAt = cancelledAt;
                return this;
            }

            /**
             * completedAt.
             */
            public Builder completedAt(Long completedAt) {
                this.completedAt = completedAt;
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
             * expiresAt.
             */
            public Builder expiresAt(Long expiresAt) {
                this.expiresAt = expiresAt;
                return this;
            }

            /**
             * failedAt.
             */
            public Builder failedAt(Long failedAt) {
                this.failedAt = failedAt;
                return this;
            }

            /**
             * id.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * lastErrorMsg.
             */
            public Builder lastErrorMsg(String lastErrorMsg) {
                this.lastErrorMsg = lastErrorMsg;
                return this;
            }

            /**
             * startedAt.
             */
            public Builder startedAt(Long startedAt) {
                this.startedAt = startedAt;
                return this;
            }

            /**
             * status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * threadId.
             */
            public Builder threadId(String threadId) {
                this.threadId = threadId;
                return this;
            }

            public Run build() {
                return new Run(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateRunResponseBody} extends {@link TeaModel}
     *
     * <p>CreateRunResponseBody</p>
     */
    public static class Thread extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("createAt")
        private Long createAt;

        @com.aliyun.core.annotation.NameInMap("id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("status")
        private String status;

        private Thread(Builder builder) {
            this.createAt = builder.createAt;
            this.id = builder.id;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Thread create() {
            return builder().build();
        }

        /**
         * @return createAt
         */
        public Long getCreateAt() {
            return this.createAt;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private Long createAt; 
            private String id; 
            private String status; 

            private Builder() {
            } 

            private Builder(Thread model) {
                this.createAt = model.createAt;
                this.id = model.id;
                this.status = model.status;
            } 

            /**
             * createAt.
             */
            public Builder createAt(Long createAt) {
                this.createAt = createAt;
                return this;
            }

            /**
             * id.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public Thread build() {
                return new Thread(this);
            } 

        } 

    }
}
