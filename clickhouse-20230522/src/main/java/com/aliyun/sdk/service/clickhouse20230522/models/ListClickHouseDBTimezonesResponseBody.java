// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.clickhouse20230522.models;

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
 * {@link ListClickHouseDBTimezonesResponseBody} extends {@link TeaModel}
 *
 * <p>ListClickHouseDBTimezonesResponseBody</p>
 */
public class ListClickHouseDBTimezonesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TimeZones")
    private java.util.List<TimeZones> timeZones;

    private ListClickHouseDBTimezonesResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.timeZones = builder.timeZones;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListClickHouseDBTimezonesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return timeZones
     */
    public java.util.List<TimeZones> getTimeZones() {
        return this.timeZones;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List<TimeZones> timeZones; 

        private Builder() {
        } 

        private Builder(ListClickHouseDBTimezonesResponseBody model) {
            this.requestId = model.requestId;
            this.timeZones = model.timeZones;
        } 

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>D0CEC6AC-7760-409A-A0D5-E6CD8660E9CC</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TimeZones.
         */
        public Builder timeZones(java.util.List<TimeZones> timeZones) {
            this.timeZones = timeZones;
            return this;
        }

        public ListClickHouseDBTimezonesResponseBody build() {
            return new ListClickHouseDBTimezonesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListClickHouseDBTimezonesResponseBody} extends {@link TeaModel}
     *
     * <p>ListClickHouseDBTimezonesResponseBody</p>
     */
    public static class TimeZones extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ZoneId")
        private String zoneId;

        private TimeZones(Builder builder) {
            this.zoneId = builder.zoneId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TimeZones create() {
            return builder().build();
        }

        /**
         * @return zoneId
         */
        public String getZoneId() {
            return this.zoneId;
        }

        public static final class Builder {
            private String zoneId; 

            private Builder() {
            } 

            private Builder(TimeZones model) {
                this.zoneId = model.zoneId;
            } 

            /**
             * ZoneId.
             */
            public Builder zoneId(String zoneId) {
                this.zoneId = zoneId;
                return this;
            }

            public TimeZones build() {
                return new TimeZones(this);
            } 

        } 

    }
}
