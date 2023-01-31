// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.outboundbot20191226.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListIntentsResponseBody} extends {@link TeaModel}
 *
 * <p>ListIntentsResponseBody</p>
 */
public class ListIntentsResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @NameInMap("Intents")
    private Intents intents;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private ListIntentsResponseBody(Builder builder) {
        this.code = builder.code;
        this.httpStatusCode = builder.httpStatusCode;
        this.intents = builder.intents;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListIntentsResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    /**
     * @return intents
     */
    public Intents getIntents() {
        return this.intents;
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
        private Integer httpStatusCode; 
        private Intents intents; 
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
         * HttpStatusCode.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * Intents.
         */
        public Builder intents(Intents intents) {
            this.intents = intents;
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

        public ListIntentsResponseBody build() {
            return new ListIntentsResponseBody(this);
        } 

    } 

    public static class List extends TeaModel {
        @NameInMap("CreateTime")
        private Long createTime;

        @NameInMap("IntentDescription")
        private String intentDescription;

        @NameInMap("IntentId")
        private String intentId;

        @NameInMap("IntentName")
        private String intentName;

        @NameInMap("Keywords")
        private String keywords;

        @NameInMap("ScriptId")
        private String scriptId;

        @NameInMap("UpdateTime")
        private Long updateTime;

        @NameInMap("Utterances")
        private String utterances;

        private List(Builder builder) {
            this.createTime = builder.createTime;
            this.intentDescription = builder.intentDescription;
            this.intentId = builder.intentId;
            this.intentName = builder.intentName;
            this.keywords = builder.keywords;
            this.scriptId = builder.scriptId;
            this.updateTime = builder.updateTime;
            this.utterances = builder.utterances;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static List create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return intentDescription
         */
        public String getIntentDescription() {
            return this.intentDescription;
        }

        /**
         * @return intentId
         */
        public String getIntentId() {
            return this.intentId;
        }

        /**
         * @return intentName
         */
        public String getIntentName() {
            return this.intentName;
        }

        /**
         * @return keywords
         */
        public String getKeywords() {
            return this.keywords;
        }

        /**
         * @return scriptId
         */
        public String getScriptId() {
            return this.scriptId;
        }

        /**
         * @return updateTime
         */
        public Long getUpdateTime() {
            return this.updateTime;
        }

        /**
         * @return utterances
         */
        public String getUtterances() {
            return this.utterances;
        }

        public static final class Builder {
            private Long createTime; 
            private String intentDescription; 
            private String intentId; 
            private String intentName; 
            private String keywords; 
            private String scriptId; 
            private Long updateTime; 
            private String utterances; 

            /**
             * CreateTime.
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * IntentDescription.
             */
            public Builder intentDescription(String intentDescription) {
                this.intentDescription = intentDescription;
                return this;
            }

            /**
             * IntentId.
             */
            public Builder intentId(String intentId) {
                this.intentId = intentId;
                return this;
            }

            /**
             * IntentName.
             */
            public Builder intentName(String intentName) {
                this.intentName = intentName;
                return this;
            }

            /**
             * Keywords.
             */
            public Builder keywords(String keywords) {
                this.keywords = keywords;
                return this;
            }

            /**
             * ScriptId.
             */
            public Builder scriptId(String scriptId) {
                this.scriptId = scriptId;
                return this;
            }

            /**
             * UpdateTime.
             */
            public Builder updateTime(Long updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            /**
             * Utterances.
             */
            public Builder utterances(String utterances) {
                this.utterances = utterances;
                return this;
            }

            public List build() {
                return new List(this);
            } 

        } 

    }
    public static class Intents extends TeaModel {
        @NameInMap("List")
        private java.util.List < List> list;

        @NameInMap("PageNumber")
        private Integer pageNumber;

        @NameInMap("PageSize")
        private Integer pageSize;

        @NameInMap("TotalCount")
        private Integer totalCount;

        private Intents(Builder builder) {
            this.list = builder.list;
            this.pageNumber = builder.pageNumber;
            this.pageSize = builder.pageSize;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Intents create() {
            return builder().build();
        }

        /**
         * @return list
         */
        public java.util.List < List> getList() {
            return this.list;
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
         * @return totalCount
         */
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private java.util.List < List> list; 
            private Integer pageNumber; 
            private Integer pageSize; 
            private Integer totalCount; 

            /**
             * List.
             */
            public Builder list(java.util.List < List> list) {
                this.list = list;
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
             * TotalCount.
             */
            public Builder totalCount(Integer totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public Intents build() {
                return new Intents(this);
            } 

        } 

    }
}
