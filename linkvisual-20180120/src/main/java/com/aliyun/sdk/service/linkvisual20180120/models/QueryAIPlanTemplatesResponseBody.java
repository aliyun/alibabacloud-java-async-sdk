// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkvisual20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryAIPlanTemplatesResponseBody} extends {@link TeaModel}
 *
 * <p>QueryAIPlanTemplatesResponseBody</p>
 */
public class QueryAIPlanTemplatesResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Data")
    private java.util.List < Data> data;

    @NameInMap("ErrorMessage")
    private String errorMessage;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private QueryAIPlanTemplatesResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.errorMessage = builder.errorMessage;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryAIPlanTemplatesResponseBody create() {
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
    public java.util.List < Data> getData() {
        return this.data;
    }

    /**
     * @return errorMessage
     */
    public String getErrorMessage() {
        return this.errorMessage;
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
        private java.util.List < Data> data; 
        private String errorMessage; 
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
         * Data.
         */
        public Builder data(java.util.List < Data> data) {
            this.data = data;
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

        public QueryAIPlanTemplatesResponseBody build() {
            return new QueryAIPlanTemplatesResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("AppTemplateId")
        private String appTemplateId;

        @NameInMap("AppVersion")
        private String appVersion;

        @NameInMap("Description")
        private String description;

        @NameInMap("IntervalTiming")
        private Integer intervalTiming;

        @NameInMap("PlanTemplateId")
        private String planTemplateId;

        @NameInMap("TriggerEnum")
        private Integer triggerEnum;

        private Data(Builder builder) {
            this.appTemplateId = builder.appTemplateId;
            this.appVersion = builder.appVersion;
            this.description = builder.description;
            this.intervalTiming = builder.intervalTiming;
            this.planTemplateId = builder.planTemplateId;
            this.triggerEnum = builder.triggerEnum;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return appTemplateId
         */
        public String getAppTemplateId() {
            return this.appTemplateId;
        }

        /**
         * @return appVersion
         */
        public String getAppVersion() {
            return this.appVersion;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return intervalTiming
         */
        public Integer getIntervalTiming() {
            return this.intervalTiming;
        }

        /**
         * @return planTemplateId
         */
        public String getPlanTemplateId() {
            return this.planTemplateId;
        }

        /**
         * @return triggerEnum
         */
        public Integer getTriggerEnum() {
            return this.triggerEnum;
        }

        public static final class Builder {
            private String appTemplateId; 
            private String appVersion; 
            private String description; 
            private Integer intervalTiming; 
            private String planTemplateId; 
            private Integer triggerEnum; 

            /**
             * AppTemplateId.
             */
            public Builder appTemplateId(String appTemplateId) {
                this.appTemplateId = appTemplateId;
                return this;
            }

            /**
             * AppVersion.
             */
            public Builder appVersion(String appVersion) {
                this.appVersion = appVersion;
                return this;
            }

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * IntervalTiming.
             */
            public Builder intervalTiming(Integer intervalTiming) {
                this.intervalTiming = intervalTiming;
                return this;
            }

            /**
             * PlanTemplateId.
             */
            public Builder planTemplateId(String planTemplateId) {
                this.planTemplateId = planTemplateId;
                return this;
            }

            /**
             * TriggerEnum.
             */
            public Builder triggerEnum(Integer triggerEnum) {
                this.triggerEnum = triggerEnum;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
