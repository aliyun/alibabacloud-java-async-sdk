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
 * {@link UpdateTimeTemplateRequest} extends {@link RequestModel}
 *
 * <p>UpdateTimeTemplateRequest</p>
 */
public class UpdateTimeTemplateRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AllDay")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer allDay;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TemplateId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String templateId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TimeSections")
    private java.util.List<TimeSections> timeSections;

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
    public java.util.List<TimeSections> getTimeSections() {
        return this.timeSections;
    }

    public static final class Builder extends Request.Builder<UpdateTimeTemplateRequest, Builder> {
        private Integer allDay; 
        private String name; 
        private String templateId; 
        private java.util.List<TimeSections> timeSections; 

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
         * <p>Specifies whether 24/7 recording is enabled.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>1: yes.</li>
         * <li>0: no. For detailed configurations, see the TimeSections.N.DayOfWeek, TimeSections.N.Begin, and TimeSections.N.End parameters.</li>
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
         * <p>The name must be less than 48 characters in length and can contain letters, digits, and the following special characters: hyphens (-), underscores (_), at signs (@), periods (.), and colons (:).</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>The ID of the time template. You can call the <a href="https://help.aliyun.com/document_detail/107890.html">QueryTimeTemplate</a> operation to query the ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>fc82774fa749485bad7d719f9670****</p>
         */
        public Builder templateId(String templateId) {
            this.putQueryParameter("TemplateId", templateId);
            this.templateId = templateId;
            return this;
        }

        /**
         * <p>The list of time sections.</p>
         */
        public Builder timeSections(java.util.List<TimeSections> timeSections) {
            this.putQueryParameter("TimeSections", timeSections);
            this.timeSections = timeSections;
            return this;
        }

        @Override
        public UpdateTimeTemplateRequest build() {
            return new UpdateTimeTemplateRequest(this);
        } 

    } 

    /**
     * 
     * {@link UpdateTimeTemplateRequest} extends {@link TeaModel}
     *
     * <p>UpdateTimeTemplateRequest</p>
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
             * <p>The start time of the day. Valid values: 0 to 86399. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>20000</p>
             */
            public Builder begin(Integer begin) {
                this.begin = begin;
                return this;
            }

            /**
             * <p>The day of the week. Valid values: 0 to 6, which indicate Sunday to Saturday.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder dayOfWeek(Integer dayOfWeek) {
                this.dayOfWeek = dayOfWeek;
                return this;
            }

            /**
             * <p>The end time of the day. Valid values: 1 to 86399. Unit: seconds.</p>
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
