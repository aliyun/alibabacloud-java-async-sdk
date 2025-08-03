// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sysom20231230.models;

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
 * {@link GetAbnormalEventsCountResponseBody} extends {@link TeaModel}
 *
 * <p>GetAbnormalEventsCountResponseBody</p>
 */
public class GetAbnormalEventsCountResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    private GetAbnormalEventsCountResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAbnormalEventsCountResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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
    public java.util.List<Data> getData() {
        return this.data;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    public static final class Builder {
        private String code; 
        private java.util.List<Data> data; 
        private String message; 

        private Builder() {
        } 

        private Builder(GetAbnormalEventsCountResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
        } 

        /**
         * code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * data.
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        public GetAbnormalEventsCountResponseBody build() {
            return new GetAbnormalEventsCountResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetAbnormalEventsCountResponseBody} extends {@link TeaModel}
     *
     * <p>GetAbnormalEventsCountResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("eventList")
        private java.util.List<String> eventList;

        @com.aliyun.core.annotation.NameInMap("type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("value")
        private Long value;

        private Data(Builder builder) {
            this.eventList = builder.eventList;
            this.type = builder.type;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return eventList
         */
        public java.util.List<String> getEventList() {
            return this.eventList;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return value
         */
        public Long getValue() {
            return this.value;
        }

        public static final class Builder {
            private java.util.List<String> eventList; 
            private String type; 
            private Long value; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.eventList = model.eventList;
                this.type = model.type;
                this.value = model.value;
            } 

            /**
             * eventList.
             */
            public Builder eventList(java.util.List<String> eventList) {
                this.eventList = eventList;
                return this;
            }

            /**
             * type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * value.
             */
            public Builder value(Long value) {
                this.value = value;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
