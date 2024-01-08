// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkvisual20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateTimeTemplateRequest} extends {@link RequestModel}
 *
 * <p>UpdateTimeTemplateRequest</p>
 */
public class UpdateTimeTemplateRequest extends Request {
    @Query
    @NameInMap("AllDay")
    @Validation(required = true)
    private Integer allDay;

    @Query
    @NameInMap("Name")
    private String name;

    @Query
    @NameInMap("TemplateId")
    @Validation(required = true)
    private String templateId;

    @Query
    @NameInMap("TimeSections")
    private java.util.List < TimeSections> timeSections;

    private UpdateTimeTemplateRequest(Builder builder) {
        super(builder);
        this.allDay = builder.allDay;
        this.name = builder.name;
        this.templateId = builder.templateId;
        this.timeSections = builder.timeSections;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateTimeTemplateRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return allDay
     */
    public Integer getAllDay() {
        return this.allDay;
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
     * @return timeSections
     */
    public java.util.List < TimeSections> getTimeSections() {
        return this.timeSections;
    }

    public static final class Builder extends Request.Builder<UpdateTimeTemplateRequest, Builder> {
        private Integer allDay; 
        private String name; 
        private String templateId; 
        private java.util.List < TimeSections> timeSections; 

        private Builder() {
            super();
        } 

        private Builder(UpdateTimeTemplateRequest request) {
            super(request);
            this.allDay = request.allDay;
            this.name = request.name;
            this.templateId = request.templateId;
            this.timeSections = request.timeSections;
        } 

        /**
         * AllDay.
         */
        public Builder allDay(Integer allDay) {
            this.putQueryParameter("AllDay", allDay);
            this.allDay = allDay;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * TemplateId.
         */
        public Builder templateId(String templateId) {
            this.putQueryParameter("TemplateId", templateId);
            this.templateId = templateId;
            return this;
        }

        /**
         * TimeSections.
         */
        public Builder timeSections(java.util.List < TimeSections> timeSections) {
            this.putQueryParameter("TimeSections", timeSections);
            this.timeSections = timeSections;
            return this;
        }

        @Override
        public UpdateTimeTemplateRequest build() {
            return new UpdateTimeTemplateRequest(this);
        } 

    } 

    public static class TimeSections extends TeaModel {
        @NameInMap("Begin")
        private Integer begin;

        @NameInMap("DayOfWeek")
        private Integer dayOfWeek;

        @NameInMap("End")
        private Integer end;

        private TimeSections(Builder builder) {
            this.begin = builder.begin;
            this.dayOfWeek = builder.dayOfWeek;
            this.end = builder.end;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TimeSections create() {
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

            public TimeSections build() {
                return new TimeSections(this);
            } 

        } 

    }
}
