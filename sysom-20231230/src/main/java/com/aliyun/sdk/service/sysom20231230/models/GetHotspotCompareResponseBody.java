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
 * {@link GetHotspotCompareResponseBody} extends {@link TeaModel}
 *
 * <p>GetHotspotCompareResponseBody</p>
 */
public class GetHotspotCompareResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("success")
    private Boolean success;

    private GetHotspotCompareResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetHotspotCompareResponseBody create() {
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

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(GetHotspotCompareResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
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
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>2D693121-C925-5154-8DF6-C09A8B369822</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetHotspotCompareResponseBody build() {
            return new GetHotspotCompareResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetHotspotCompareResponseBody} extends {@link TeaModel}
     *
     * <p>GetHotspotCompareResponseBody</p>
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

            private Builder() {
            } 

            private Builder(Flame model) {
                this.columns = model.columns;
                this.values = model.values;
            } 

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
     * {@link GetHotspotCompareResponseBody} extends {@link TeaModel}
     *
     * <p>GetHotspotCompareResponseBody</p>
     */
    public static class SeriesInstance1 extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("columns")
        private java.util.List<String> columns;

        @com.aliyun.core.annotation.NameInMap("values")
        private java.util.List<java.util.List<String>> values;

        private SeriesInstance1(Builder builder) {
            this.columns = builder.columns;
            this.values = builder.values;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SeriesInstance1 create() {
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

            private Builder() {
            } 

            private Builder(SeriesInstance1 model) {
                this.columns = model.columns;
                this.values = model.values;
            } 

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

            public SeriesInstance1 build() {
                return new SeriesInstance1(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetHotspotCompareResponseBody} extends {@link TeaModel}
     *
     * <p>GetHotspotCompareResponseBody</p>
     */
    public static class SeriesInstance2 extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("columns")
        private java.util.List<String> columns;

        @com.aliyun.core.annotation.NameInMap("values")
        private java.util.List<java.util.List<String>> values;

        private SeriesInstance2(Builder builder) {
            this.columns = builder.columns;
            this.values = builder.values;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SeriesInstance2 create() {
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

            private Builder() {
            } 

            private Builder(SeriesInstance2 model) {
                this.columns = model.columns;
                this.values = model.values;
            } 

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

            public SeriesInstance2 build() {
                return new SeriesInstance2(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetHotspotCompareResponseBody} extends {@link TeaModel}
     *
     * <p>GetHotspotCompareResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("flame")
        private Flame flame;

        @com.aliyun.core.annotation.NameInMap("series_instance1")
        private SeriesInstance1 seriesInstance1;

        @com.aliyun.core.annotation.NameInMap("series_instance2")
        private SeriesInstance2 seriesInstance2;

        private Data(Builder builder) {
            this.flame = builder.flame;
            this.seriesInstance1 = builder.seriesInstance1;
            this.seriesInstance2 = builder.seriesInstance2;
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
         * @return seriesInstance1
         */
        public SeriesInstance1 getSeriesInstance1() {
            return this.seriesInstance1;
        }

        /**
         * @return seriesInstance2
         */
        public SeriesInstance2 getSeriesInstance2() {
            return this.seriesInstance2;
        }

        public static final class Builder {
            private Flame flame; 
            private SeriesInstance1 seriesInstance1; 
            private SeriesInstance2 seriesInstance2; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.flame = model.flame;
                this.seriesInstance1 = model.seriesInstance1;
                this.seriesInstance2 = model.seriesInstance2;
            } 

            /**
             * flame.
             */
            public Builder flame(Flame flame) {
                this.flame = flame;
                return this;
            }

            /**
             * series_instance1.
             */
            public Builder seriesInstance1(SeriesInstance1 seriesInstance1) {
                this.seriesInstance1 = seriesInstance1;
                return this;
            }

            /**
             * series_instance2.
             */
            public Builder seriesInstance2(SeriesInstance2 seriesInstance2) {
                this.seriesInstance2 = seriesInstance2;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
