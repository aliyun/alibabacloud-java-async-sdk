// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.chatbot20171011.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QuerySystemEntitiesResponseBody} extends {@link TeaModel}
 *
 * <p>QuerySystemEntitiesResponseBody</p>
 */
public class QuerySystemEntitiesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("SystemEntities")
    private java.util.List < SystemEntities> systemEntities;

    private QuerySystemEntitiesResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.systemEntities = builder.systemEntities;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QuerySystemEntitiesResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return systemEntities
     */
    public java.util.List < SystemEntities> getSystemEntities() {
        return this.systemEntities;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List < SystemEntities> systemEntities; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * SystemEntities.
         */
        public Builder systemEntities(java.util.List < SystemEntities> systemEntities) {
            this.systemEntities = systemEntities;
            return this;
        }

        public QuerySystemEntitiesResponseBody build() {
            return new QuerySystemEntitiesResponseBody(this);
        } 

    } 

    public static class SystemEntities extends TeaModel {
        @NameInMap("DefaultQuestion")
        private String defaultQuestion;

        @NameInMap("EntityCode")
        private String entityCode;

        @NameInMap("EntityName")
        private String entityName;

        private SystemEntities(Builder builder) {
            this.defaultQuestion = builder.defaultQuestion;
            this.entityCode = builder.entityCode;
            this.entityName = builder.entityName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SystemEntities create() {
            return builder().build();
        }

        /**
         * @return defaultQuestion
         */
        public String getDefaultQuestion() {
            return this.defaultQuestion;
        }

        /**
         * @return entityCode
         */
        public String getEntityCode() {
            return this.entityCode;
        }

        /**
         * @return entityName
         */
        public String getEntityName() {
            return this.entityName;
        }

        public static final class Builder {
            private String defaultQuestion; 
            private String entityCode; 
            private String entityName; 

            /**
             * DefaultQuestion.
             */
            public Builder defaultQuestion(String defaultQuestion) {
                this.defaultQuestion = defaultQuestion;
                return this;
            }

            /**
             * EntityCode.
             */
            public Builder entityCode(String entityCode) {
                this.entityCode = entityCode;
                return this;
            }

            /**
             * EntityName.
             */
            public Builder entityName(String entityName) {
                this.entityName = entityName;
                return this;
            }

            public SystemEntities build() {
                return new SystemEntities(this);
            } 

        } 

    }
}
