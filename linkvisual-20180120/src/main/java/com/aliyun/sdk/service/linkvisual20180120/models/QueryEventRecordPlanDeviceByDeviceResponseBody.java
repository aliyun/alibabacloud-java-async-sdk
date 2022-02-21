// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkvisual20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryEventRecordPlanDeviceByDeviceResponseBody} extends {@link TeaModel}
 *
 * <p>QueryEventRecordPlanDeviceByDeviceResponseBody</p>
 */
public class QueryEventRecordPlanDeviceByDeviceResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("ErrorMessage")
    private String errorMessage;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private QueryEventRecordPlanDeviceByDeviceResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.errorMessage = builder.errorMessage;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryEventRecordPlanDeviceByDeviceResponseBody create() {
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
    public Data getData() {
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
        private Data data; 
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
        public Builder data(Data data) {
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

        public QueryEventRecordPlanDeviceByDeviceResponseBody build() {
            return new QueryEventRecordPlanDeviceByDeviceResponseBody(this);
        } 

    } 

    public static class TimeSectionList extends TeaModel {
        @NameInMap("Begin")
        private Integer begin;

        @NameInMap("DayOfWeek")
        private Integer dayOfWeek;

        @NameInMap("End")
        private Integer end;

        private TimeSectionList(Builder builder) {
            this.begin = builder.begin;
            this.dayOfWeek = builder.dayOfWeek;
            this.end = builder.end;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TimeSectionList create() {
            return builder().build();
        }

        /**
         * @return begin
         */
        public Integer getBegin() {
            return this.begin;
        }

        /**
         * @return dayOfWeek
         */
        public Integer getDayOfWeek() {
            return this.dayOfWeek;
        }

        /**
         * @return end
         */
        public Integer getEnd() {
            return this.end;
        }

        public static final class Builder {
            private Integer begin; 
            private Integer dayOfWeek; 
            private Integer end; 

            /**
             * Begin.
             */
            public Builder begin(Integer begin) {
                this.begin = begin;
                return this;
            }

            /**
             * DayOfWeek.
             */
            public Builder dayOfWeek(Integer dayOfWeek) {
                this.dayOfWeek = dayOfWeek;
                return this;
            }

            /**
             * End.
             */
            public Builder end(Integer end) {
                this.end = end;
                return this;
            }

            public TimeSectionList build() {
                return new TimeSectionList(this);
            } 

        } 

    }
    public static class TemplateInfo extends TeaModel {
        @NameInMap("AllDay")
        private Integer allDay;

        @NameInMap("Default")
        private Integer _default;

        @NameInMap("Name")
        private String name;

        @NameInMap("TemplateId")
        private String templateId;

        @NameInMap("TimeSectionList")
        private java.util.List < TimeSectionList> timeSectionList;

        private TemplateInfo(Builder builder) {
            this.allDay = builder.allDay;
            this._default = builder._default;
            this.name = builder.name;
            this.templateId = builder.templateId;
            this.timeSectionList = builder.timeSectionList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TemplateInfo create() {
            return builder().build();
        }

        /**
         * @return allDay
         */
        public Integer getAllDay() {
            return this.allDay;
        }

        /**
         * @return _default
         */
        public Integer get_default() {
            return this._default;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return templateId
         */
        public String getTemplateId() {
            return this.templateId;
        }

        /**
         * @return timeSectionList
         */
        public java.util.List < TimeSectionList> getTimeSectionList() {
            return this.timeSectionList;
        }

        public static final class Builder {
            private Integer allDay; 
            private Integer _default; 
            private String name; 
            private String templateId; 
            private java.util.List < TimeSectionList> timeSectionList; 

            /**
             * AllDay.
             */
            public Builder allDay(Integer allDay) {
                this.allDay = allDay;
                return this;
            }

            /**
             * Default.
             */
            public Builder _default(Integer _default) {
                this._default = _default;
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
             * TemplateId.
             */
            public Builder templateId(String templateId) {
                this.templateId = templateId;
                return this;
            }

            /**
             * TimeSectionList.
             */
            public Builder timeSectionList(java.util.List < TimeSectionList> timeSectionList) {
                this.timeSectionList = timeSectionList;
                return this;
            }

            public TemplateInfo build() {
                return new TemplateInfo(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("Name")
        private String name;

        @NameInMap("PlanId")
        private String planId;

        @NameInMap("PreRecordDuration")
        private Integer preRecordDuration;

        @NameInMap("RecordDuration")
        private Integer recordDuration;

        @NameInMap("TemplateId")
        private String templateId;

        @NameInMap("TemplateInfo")
        private TemplateInfo templateInfo;

        private Data(Builder builder) {
            this.name = builder.name;
            this.planId = builder.planId;
            this.preRecordDuration = builder.preRecordDuration;
            this.recordDuration = builder.recordDuration;
            this.templateId = builder.templateId;
            this.templateInfo = builder.templateInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return planId
         */
        public String getPlanId() {
            return this.planId;
        }

        /**
         * @return preRecordDuration
         */
        public Integer getPreRecordDuration() {
            return this.preRecordDuration;
        }

        /**
         * @return recordDuration
         */
        public Integer getRecordDuration() {
            return this.recordDuration;
        }

        /**
         * @return templateId
         */
        public String getTemplateId() {
            return this.templateId;
        }

        /**
         * @return templateInfo
         */
        public TemplateInfo getTemplateInfo() {
            return this.templateInfo;
        }

        public static final class Builder {
            private String name; 
            private String planId; 
            private Integer preRecordDuration; 
            private Integer recordDuration; 
            private String templateId; 
            private TemplateInfo templateInfo; 

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * PlanId.
             */
            public Builder planId(String planId) {
                this.planId = planId;
                return this;
            }

            /**
             * PreRecordDuration.
             */
            public Builder preRecordDuration(Integer preRecordDuration) {
                this.preRecordDuration = preRecordDuration;
                return this;
            }

            /**
             * RecordDuration.
             */
            public Builder recordDuration(Integer recordDuration) {
                this.recordDuration = recordDuration;
                return this;
            }

            /**
             * TemplateId.
             */
            public Builder templateId(String templateId) {
                this.templateId = templateId;
                return this;
            }

            /**
             * TemplateInfo.
             */
            public Builder templateInfo(TemplateInfo templateInfo) {
                this.templateInfo = templateInfo;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
