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
 * {@link GetHotspotTrackingResponseBody} extends {@link TeaModel}
 *
 * <p>GetHotspotTrackingResponseBody</p>
 */
public class GetHotspotTrackingResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private GetHotspotTrackingResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetHotspotTrackingResponseBody create() {
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
        public Builder data(Data data) {
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

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetHotspotTrackingResponseBody build() {
            return new GetHotspotTrackingResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetHotspotTrackingResponseBody} extends {@link TeaModel}
     *
     * <p>GetHotspotTrackingResponseBody</p>
     */
    public static class Flame extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("columns")
        private java.util.List<String> columns;

        @com.aliyun.core.annotation.NameInMap("values")
        private java.util.List<java.util.List<String>> values;

        private Flame(Builder builder) {
            this.columns = builder.columns;
            this.values = builder.values;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Flame create() {
            return builder().build();
        }

        /**
         * @return columns
         */
        public java.util.List<String> getColumns() {
            return this.columns;
        }

        /**
         * @return values
         */
        public java.util.List<java.util.List<String>> getValues() {
            return this.values;
        }

        public static final class Builder {
            private java.util.List<String> columns; 
            private java.util.List<java.util.List<String>> values; 

            /**
             * columns.
             */
            public Builder columns(java.util.List<String> columns) {
                this.columns = columns;
                return this;
            }

            /**
             * values.
             */
            public Builder values(java.util.List<java.util.List<String>> values) {
                this.values = values;
                return this;
            }

            public Flame build() {
                return new Flame(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetHotspotTrackingResponseBody} extends {@link TeaModel}
     *
     * <p>GetHotspotTrackingResponseBody</p>
     */
    public static class Series extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("columns")
        private java.util.List<String> columns;

        @com.aliyun.core.annotation.NameInMap("values")
        private java.util.List<java.util.List<String>> values;

        private Series(Builder builder) {
            this.columns = builder.columns;
            this.values = builder.values;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Series create() {
            return builder().build();
        }

        /**
         * @return columns
         */
        public java.util.List<String> getColumns() {
            return this.columns;
        }

        /**
         * @return values
         */
        public java.util.List<java.util.List<String>> getValues() {
            return this.values;
        }

        public static final class Builder {
            private java.util.List<String> columns; 
            private java.util.List<java.util.List<String>> values; 

            /**
             * columns.
             */
            public Builder columns(java.util.List<String> columns) {
                this.columns = columns;
                return this;
            }

            /**
             * values.
             */
            public Builder values(java.util.List<java.util.List<String>> values) {
                this.values = values;
                return this;
            }

            public Series build() {
                return new Series(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetHotspotTrackingResponseBody} extends {@link TeaModel}
     *
     * <p>GetHotspotTrackingResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("flame")
        private Flame flame;

        @com.aliyun.core.annotation.NameInMap("series")
        private Series series;

        private Data(Builder builder) {
            this.flame = builder.flame;
            this.series = builder.series;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return flame
         */
        public Flame getFlame() {
            return this.flame;
        }

        /**
         * @return series
         */
        public Series getSeries() {
            return this.series;
        }

        public static final class Builder {
            private Flame flame; 
            private Series series; 

            /**
             * flame.
             */
            public Builder flame(Flame flame) {
                this.flame = flame;
                return this;
            }

            /**
             * series.
             */
            public Builder series(Series series) {
                this.series = series;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
