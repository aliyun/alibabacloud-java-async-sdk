// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkvisual20180120.models;

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
 * {@link CreateTimeTemplateRequest} extends {@link RequestModel}
 *
 * <p>CreateTimeTemplateRequest</p>
 */
public class CreateTimeTemplateRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AllDay")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer allDay;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TimeSections")
    private java.util.List<TimeSections> timeSections;

    private CreateTimeTemplateRequest(Builder builder) {
        super(builder);
        this.allDay = builder.allDay;
        this.name = builder.name;
        this.timeSections = builder.timeSections;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateTimeTemplateRequest create() {
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
     * @return timeSections
     */
    public java.util.List<TimeSections> getTimeSections() {
        return this.timeSections;
    }

    public static final class Builder extends Request.Builder<CreateTimeTemplateRequest, Builder> {
        private Integer allDay; 
        private String name; 
        private java.util.List<TimeSections> timeSections; 

        private Builder() {
            super();
        } 

        private Builder(CreateTimeTemplateRequest request) {
            super(request);
            this.allDay = request.allDay;
            this.name = request.name;
            this.timeSections = request.timeSections;
        } 

        /**
         * <p>Specifies whether to enable 24/7 recording. Valid values:</p>
         * <ul>
         * <li>1: Yes.</li>
         * <li>0: No. You must configure the TimeSections.N.DayOfWeek, TimeSections.N.Begin, and TimeSections.N.End parameters.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder allDay(Integer allDay) {
            this.putQueryParameter("AllDay", allDay);
            this.allDay = allDay;
            return this;
        }

        /**
         * <p>The name of the time template.</p>
         * <p>The name must be fewer than 48 characters in length and can contain letters, digits, and the following special characters: hyphens (-), underscores (_), at signs (@), periods (.), and colons (:).</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>example</p>
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>The list of time ranges.</p>
         */
        public Builder timeSections(java.util.List<TimeSections> timeSections) {
            this.putQueryParameter("TimeSections", timeSections);
            this.timeSections = timeSections;
            return this;
        }

        @Override
        public CreateTimeTemplateRequest build() {
            return new CreateTimeTemplateRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateTimeTemplateRequest} extends {@link TeaModel}
     *
     * <p>CreateTimeTemplateRequest</p>
     */
    public static class TimeSections extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Begin")
        private Integer begin;

        @com.aliyun.core.annotation.NameInMap("DayOfWeek")
        private Integer dayOfWeek;

        @com.aliyun.core.annotation.NameInMap("End")
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

            private Builder() {
            } 

            private Builder(TimeSections model) {
                this.begin = model.begin;
                this.dayOfWeek = model.dayOfWeek;
                this.end = model.end;
            } 

            /**
             * <p>The start time of each day. Valid values: 0 to 86399. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>20000</p>
             */
            public Builder begin(Integer begin) {
                this.begin = begin;
                return this;
            }

            /**
             * <p>The day of the week. Valid values: 0 to 6, which represent Sunday through Saturday.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder dayOfWeek(Integer dayOfWeek) {
                this.dayOfWeek = dayOfWeek;
                return this;
            }

            /**
             * <p>The end time of each day. Valid values: 1 to 86399. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>60000</p>
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
