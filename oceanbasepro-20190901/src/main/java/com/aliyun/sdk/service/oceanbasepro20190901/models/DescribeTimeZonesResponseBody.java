// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oceanbasepro20190901.models;

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
 * {@link DescribeTimeZonesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeTimeZonesResponseBody</p>
 */
public class DescribeTimeZonesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TimeZones")
    private TimeZones timeZones;

    private DescribeTimeZonesResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.timeZones = builder.timeZones;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeTimeZonesResponseBody create() {
        return builder().build();
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
    public TimeZones getTimeZones() {
        return this.timeZones;
    }

    public static final class Builder {
        private String requestId; 
        private TimeZones timeZones; 

        /**
         * <p>DescribeTimeZones</p>
         * 
         * <strong>example:</strong>
         * <p>EE205C00-30E4-XXXX-XXXX-87E3A8A2AA0C</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The description of the time zone.</p>
         */
        public Builder timeZones(TimeZones timeZones) {
            this.timeZones = timeZones;
            return this;
        }

        public DescribeTimeZonesResponseBody build() {
            return new DescribeTimeZonesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeTimeZonesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeTimeZonesResponseBody</p>
     */
    public static class List extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("TimeZone")
        private String timeZone;

        private List(Builder builder) {
            this.description = builder.description;
            this.timeZone = builder.timeZone;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static List create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return timeZone
         */
        public String getTimeZone() {
            return this.timeZone;
        }

        public static final class Builder {
            private String description; 
            private String timeZone; 

            /**
             * <p>Example 1</p>
             * 
             * <strong>example:</strong>
             * <p>(GMT+8:00) Asia/Shanghai</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The operation that you want to perform.<br>Set the value to <strong>DescribeTimeZones</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>Asia/Shanghai</p>
             */
            public Builder timeZone(String timeZone) {
                this.timeZone = timeZone;
                return this;
            }

            public List build() {
                return new List(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeTimeZonesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeTimeZonesResponseBody</p>
     */
    public static class TimeZones extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Default")
        private String _default;

        @com.aliyun.core.annotation.NameInMap("List")
        private java.util.List<List> list;

        private TimeZones(Builder builder) {
            this._default = builder._default;
            this.list = builder.list;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TimeZones create() {
            return builder().build();
        }

        /**
         * @return _default
         */
        public String get_default() {
            return this._default;
        }

        /**
         * @return list
         */
        public java.util.List<List> getList() {
            return this.list;
        }

        public static final class Builder {
            private String _default; 
            private java.util.List<List> list; 

            /**
             * Default.
             */
            public Builder _default(String _default) {
                this._default = _default;
                return this;
            }

            /**
             * <p>The list of time zones.</p>
             */
            public Builder list(java.util.List<List> list) {
                this.list = list;
                return this;
            }

            public TimeZones build() {
                return new TimeZones(this);
            } 

        } 

    }
}
