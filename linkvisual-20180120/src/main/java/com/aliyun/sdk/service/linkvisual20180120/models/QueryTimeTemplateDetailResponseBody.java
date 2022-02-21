// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkvisual20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryTimeTemplateDetailResponseBody} extends {@link TeaModel}
 *
 * <p>QueryTimeTemplateDetailResponseBody</p>
 */
public class QueryTimeTemplateDetailResponseBody extends TeaModel {
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

    private QueryTimeTemplateDetailResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.errorMessage = builder.errorMessage;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryTimeTemplateDetailResponseBody create() {
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

        public QueryTimeTemplateDetailResponseBody build() {
            return new QueryTimeTemplateDetailResponseBody(this);
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
    public static class Data extends TeaModel {
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

        private Data(Builder builder) {
            this.allDay = builder.allDay;
            this._default = builder._default;
            this.name = builder.name;
            this.templateId = builder.templateId;
            this.timeSectionList = builder.timeSectionList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
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

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
