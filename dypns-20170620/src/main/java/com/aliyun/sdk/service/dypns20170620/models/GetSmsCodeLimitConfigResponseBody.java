// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dypns20170620.models;

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
 * {@link GetSmsCodeLimitConfigResponseBody} extends {@link TeaModel}
 *
 * <p>GetSmsCodeLimitConfigResponseBody</p>
 */
public class GetSmsCodeLimitConfigResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetSmsCodeLimitConfigResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetSmsCodeLimitConfigResponseBody create() {
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
    public Data getData() {
        return this.data;
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

    public static final class Builder {
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetSmsCodeLimitConfigResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
        } 

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

        public GetSmsCodeLimitConfigResponseBody build() {
            return new GetSmsCodeLimitConfigResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetSmsCodeLimitConfigResponseBody} extends {@link TeaModel}
     *
     * <p>GetSmsCodeLimitConfigResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("LimitDay")
        private Integer limitDay;

        @com.aliyun.core.annotation.NameInMap("LimitHour")
        private Integer limitHour;

        @com.aliyun.core.annotation.NameInMap("LimitId")
        private Long limitId;

        @com.aliyun.core.annotation.NameInMap("LimitMinute")
        private Integer limitMinute;

        @com.aliyun.core.annotation.NameInMap("LimitOther")
        private String limitOther;

        private Data(Builder builder) {
            this.limitDay = builder.limitDay;
            this.limitHour = builder.limitHour;
            this.limitId = builder.limitId;
            this.limitMinute = builder.limitMinute;
            this.limitOther = builder.limitOther;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return limitDay
         */
        public Integer getLimitDay() {
            return this.limitDay;
        }

        /**
         * @return limitHour
         */
        public Integer getLimitHour() {
            return this.limitHour;
        }

        /**
         * @return limitId
         */
        public Long getLimitId() {
            return this.limitId;
        }

        /**
         * @return limitMinute
         */
        public Integer getLimitMinute() {
            return this.limitMinute;
        }

        /**
         * @return limitOther
         */
        public String getLimitOther() {
            return this.limitOther;
        }

        public static final class Builder {
            private Integer limitDay; 
            private Integer limitHour; 
            private Long limitId; 
            private Integer limitMinute; 
            private String limitOther; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.limitDay = model.limitDay;
                this.limitHour = model.limitHour;
                this.limitId = model.limitId;
                this.limitMinute = model.limitMinute;
                this.limitOther = model.limitOther;
            } 

            /**
             * LimitDay.
             */
            public Builder limitDay(Integer limitDay) {
                this.limitDay = limitDay;
                return this;
            }

            /**
             * LimitHour.
             */
            public Builder limitHour(Integer limitHour) {
                this.limitHour = limitHour;
                return this;
            }

            /**
             * LimitId.
             */
            public Builder limitId(Long limitId) {
                this.limitId = limitId;
                return this;
            }

            /**
             * LimitMinute.
             */
            public Builder limitMinute(Integer limitMinute) {
                this.limitMinute = limitMinute;
                return this;
            }

            /**
             * LimitOther.
             */
            public Builder limitOther(String limitOther) {
                this.limitOther = limitOther;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
