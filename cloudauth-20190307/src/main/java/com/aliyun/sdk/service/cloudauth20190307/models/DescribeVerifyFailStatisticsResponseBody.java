// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudauth20190307.models;

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
 * {@link DescribeVerifyFailStatisticsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeVerifyFailStatisticsResponseBody</p>
 */
public class DescribeVerifyFailStatisticsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ResultObject")
    private ResultObject resultObject;

    private DescribeVerifyFailStatisticsResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.resultObject = builder.resultObject;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeVerifyFailStatisticsResponseBody create() {
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
     * @return resultObject
     */
    public ResultObject getResultObject() {
        return this.resultObject;
    }

    public static final class Builder {
        private String requestId; 
        private ResultObject resultObject; 

        private Builder() {
        } 

        private Builder(DescribeVerifyFailStatisticsResponseBody model) {
            this.requestId = model.requestId;
            this.resultObject = model.resultObject;
        } 

        /**
         * <p>ID of this request.</p>
         * 
         * <strong>example:</strong>
         * <p>C2C596D1-B14B-5D79-9672-61D7686912B2</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Authentication result.</p>
         */
        public Builder resultObject(ResultObject resultObject) {
            this.resultObject = resultObject;
            return this;
        }

        public DescribeVerifyFailStatisticsResponseBody build() {
            return new DescribeVerifyFailStatisticsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeVerifyFailStatisticsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeVerifyFailStatisticsResponseBody</p>
     */
    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Code")
        private String code;

        @com.aliyun.core.annotation.NameInMap("Count")
        private Long count;

        @com.aliyun.core.annotation.NameInMap("Rate")
        private String rate;

        private Items(Builder builder) {
            this.code = builder.code;
            this.count = builder.count;
            this.rate = builder.rate;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
        }

        /**
         * @return code
         */
        public String getCode() {
            return this.code;
        }

        /**
         * @return count
         */
        public Long getCount() {
            return this.count;
        }

        /**
         * @return rate
         */
        public String getRate() {
            return this.rate;
        }

        public static final class Builder {
            private String code; 
            private Long count; 
            private String rate; 

            private Builder() {
            } 

            private Builder(Items model) {
                this.code = model.code;
                this.count = model.count;
                this.rate = model.rate;
            } 

            /**
             * <p>Error code.</p>
             * 
             * <strong>example:</strong>
             * <p>404</p>
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * <p>Failure count.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder count(Long count) {
                this.count = count;
                return this;
            }

            /**
             * <p>Date: Date</p>
             * 
             * <strong>example:</strong>
             * <p>2025-10-16</p>
             */
            public Builder rate(String rate) {
                this.rate = rate;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeVerifyFailStatisticsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeVerifyFailStatisticsResponseBody</p>
     */
    public static class Column extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Items")
        private java.util.List<Items> items;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Long totalCount;

        private Column(Builder builder) {
            this.items = builder.items;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Column create() {
            return builder().build();
        }

        /**
         * @return items
         */
        public java.util.List<Items> getItems() {
            return this.items;
        }

        /**
         * @return totalCount
         */
        public Long getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private java.util.List<Items> items; 
            private Long totalCount; 

            private Builder() {
            } 

            private Builder(Column model) {
                this.items = model.items;
                this.totalCount = model.totalCount;
            } 

            /**
             * <p>Column information.</p>
             */
            public Builder items(java.util.List<Items> items) {
                this.items = items;
                return this;
            }

            /**
             * <p>Total count.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder totalCount(Long totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public Column build() {
                return new Column(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeVerifyFailStatisticsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeVerifyFailStatisticsResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Code")
        private String code;

        @com.aliyun.core.annotation.NameInMap("Count")
        private Long count;

        @com.aliyun.core.annotation.NameInMap("Date")
        private String date;

        private Data(Builder builder) {
            this.code = builder.code;
            this.count = builder.count;
            this.date = builder.date;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return code
         */
        public String getCode() {
            return this.code;
        }

        /**
         * @return count
         */
        public Long getCount() {
            return this.count;
        }

        /**
         * @return date
         */
        public String getDate() {
            return this.date;
        }

        public static final class Builder {
            private String code; 
            private Long count; 
            private String date; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.code = model.code;
                this.count = model.count;
                this.date = model.date;
            } 

            /**
             * <p>Error code.</p>
             * 
             * <strong>example:</strong>
             * <p>404</p>
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * <p>Count.</p>
             * 
             * <strong>example:</strong>
             * <p>9</p>
             */
            public Builder count(Long count) {
                this.count = count;
                return this;
            }

            /**
             * <p>Date.</p>
             * 
             * <strong>example:</strong>
             * <p>2025-10-16</p>
             */
            public Builder date(String date) {
                this.date = date;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeVerifyFailStatisticsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeVerifyFailStatisticsResponseBody</p>
     */
    public static class LineItems extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Code")
        private String code;

        @com.aliyun.core.annotation.NameInMap("Data")
        private java.util.List<Data> data;

        private LineItems(Builder builder) {
            this.code = builder.code;
            this.data = builder.data;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LineItems create() {
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
        public java.util.List<Data> getData() {
            return this.data;
        }

        public static final class Builder {
            private String code; 
            private java.util.List<Data> data; 

            private Builder() {
            } 

            private Builder(LineItems model) {
                this.code = model.code;
                this.data = model.data;
            } 

            /**
             * <p>Error code.</p>
             * 
             * <strong>example:</strong>
             * <p>404</p>
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * <p>Returned quantity data.</p>
             */
            public Builder data(java.util.List<Data> data) {
                this.data = data;
                return this;
            }

            public LineItems build() {
                return new LineItems(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeVerifyFailStatisticsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeVerifyFailStatisticsResponseBody</p>
     */
    public static class Line extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Items")
        private java.util.List<LineItems> items;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Long totalCount;

        private Line(Builder builder) {
            this.items = builder.items;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Line create() {
            return builder().build();
        }

        /**
         * @return items
         */
        public java.util.List<LineItems> getItems() {
            return this.items;
        }

        /**
         * @return totalCount
         */
        public Long getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private java.util.List<LineItems> items; 
            private Long totalCount; 

            private Builder() {
            } 

            private Builder(Line model) {
                this.items = model.items;
                this.totalCount = model.totalCount;
            } 

            /**
             * <p>Column information.</p>
             */
            public Builder items(java.util.List<LineItems> items) {
                this.items = items;
                return this;
            }

            /**
             * <p>Total count.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder totalCount(Long totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public Line build() {
                return new Line(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeVerifyFailStatisticsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeVerifyFailStatisticsResponseBody</p>
     */
    public static class ResultObject extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Column")
        private Column column;

        @com.aliyun.core.annotation.NameInMap("Line")
        private Line line;

        private ResultObject(Builder builder) {
            this.column = builder.column;
            this.line = builder.line;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResultObject create() {
            return builder().build();
        }

        /**
         * @return column
         */
        public Column getColumn() {
            return this.column;
        }

        /**
         * @return line
         */
        public Line getLine() {
            return this.line;
        }

        public static final class Builder {
            private Column column; 
            private Line line; 

            private Builder() {
            } 

            private Builder(ResultObject model) {
                this.column = model.column;
                this.line = model.line;
            } 

            /**
             * <p>Line chart of failure reasons.</p>
             */
            public Builder column(Column column) {
                this.column = column;
                return this;
            }

            /**
             * <p>Bar chart of failure reasons.</p>
             */
            public Builder line(Line line) {
                this.line = line;
                return this;
            }

            public ResultObject build() {
                return new ResultObject(this);
            } 

        } 

    }
}
