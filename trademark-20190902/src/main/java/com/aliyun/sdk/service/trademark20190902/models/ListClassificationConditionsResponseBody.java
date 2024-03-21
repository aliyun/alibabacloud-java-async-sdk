// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.trademark20190902.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListClassificationConditionsResponseBody} extends {@link TeaModel}
 *
 * <p>ListClassificationConditionsResponseBody</p>
 */
public class ListClassificationConditionsResponseBody extends TeaModel {
    @NameInMap("Data")
    private java.util.List < Data> data;

    @NameInMap("RequestId")
    private String requestId;

    private ListClassificationConditionsResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListClassificationConditionsResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public java.util.List < Data> getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < Data> data; 
        private String requestId; 

        /**
         * Data.
         */
        public Builder data(java.util.List < Data> data) {
            this.data = data;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListClassificationConditionsResponseBody build() {
            return new ListClassificationConditionsResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("ConditionContent")
        private String conditionContent;

        @NameInMap("CreateTime")
        private Long createTime;

        @NameInMap("Id")
        private Long id;

        @NameInMap("SessionId")
        private String sessionId;

        @NameInMap("TagName")
        private String tagName;

        @NameInMap("Type")
        private Long type;

        @NameInMap("Umid")
        private String umid;

        @NameInMap("UpdateTime")
        private Long updateTime;

        @NameInMap("UserId")
        private Long userId;

        private Data(Builder builder) {
            this.conditionContent = builder.conditionContent;
            this.createTime = builder.createTime;
            this.id = builder.id;
            this.sessionId = builder.sessionId;
            this.tagName = builder.tagName;
            this.type = builder.type;
            this.umid = builder.umid;
            this.updateTime = builder.updateTime;
            this.userId = builder.userId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return conditionContent
         */
        public String getConditionContent() {
            return this.conditionContent;
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return sessionId
         */
        public String getSessionId() {
            return this.sessionId;
        }

        /**
         * @return tagName
         */
        public String getTagName() {
            return this.tagName;
        }

        /**
         * @return type
         */
        public Long getType() {
            return this.type;
        }

        /**
         * @return umid
         */
        public String getUmid() {
            return this.umid;
        }

        /**
         * @return updateTime
         */
        public Long getUpdateTime() {
            return this.updateTime;
        }

        /**
         * @return userId
         */
        public Long getUserId() {
            return this.userId;
        }

        public static final class Builder {
            private String conditionContent; 
            private Long createTime; 
            private Long id; 
            private String sessionId; 
            private String tagName; 
            private Long type; 
            private String umid; 
            private Long updateTime; 
            private Long userId; 

            /**
             * ConditionContent.
             */
            public Builder conditionContent(String conditionContent) {
                this.conditionContent = conditionContent;
                return this;
            }

            /**
             * CreateTime.
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * SessionId.
             */
            public Builder sessionId(String sessionId) {
                this.sessionId = sessionId;
                return this;
            }

            /**
             * TagName.
             */
            public Builder tagName(String tagName) {
                this.tagName = tagName;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(Long type) {
                this.type = type;
                return this;
            }

            /**
             * Umid.
             */
            public Builder umid(String umid) {
                this.umid = umid;
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
             * UserId.
             */
            public Builder userId(Long userId) {
                this.userId = userId;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
