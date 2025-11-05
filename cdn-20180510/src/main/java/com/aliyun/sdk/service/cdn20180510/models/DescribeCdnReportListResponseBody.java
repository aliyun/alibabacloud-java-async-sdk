// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

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
 * {@link DescribeCdnReportListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeCdnReportListResponseBody</p>
 */
public class DescribeCdnReportListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Content")
    private Content content;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeCdnReportListResponseBody(Builder builder) {
        this.content = builder.content;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCdnReportListResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return content
     */
    public Content getContent() {
        return this.content;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Content content; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeCdnReportListResponseBody model) {
            this.content = model.content;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The information about the report that is queried.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;data&quot;:[{&quot;reportId&quot;:1,&quot;deliver&quot;:{&quot;report&quot;:{&quot;title&quot;:&quot;DomainPvUv&quot;,&quot;format&quot;:&quot;chart&quot;,&quot;shape&quot;:&quot;line&quot;,&quot;xAxis&quot;:&quot;ds&quot;,&quot;yAxis&quot;:&quot;cnt&quot;,&quot;legend&quot;:&quot;cnt_type&quot;,&quot;header&quot;:[&quot;ds&quot;,&quot;cnt_type&quot;,&quot;cnt&quot;]}}}</p>
         */
        public Builder content(Content content) {
            this.content = content;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>04F0F334-1335-436C-A1D7-6C044FE73368</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeCdnReportListResponseBody build() {
            return new DescribeCdnReportListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeCdnReportListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCdnReportListResponseBody</p>
     */
    public static class Report extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("format")
        private String format;

        @com.aliyun.core.annotation.NameInMap("header")
        private java.util.List<String> header;

        @com.aliyun.core.annotation.NameInMap("outLine")
        private Long outLine;

        @com.aliyun.core.annotation.NameInMap("outSize")
        private Long outSize;

        @com.aliyun.core.annotation.NameInMap("shape")
        private String shape;

        @com.aliyun.core.annotation.NameInMap("title")
        private String title;

        private Report(Builder builder) {
            this.format = builder.format;
            this.header = builder.header;
            this.outLine = builder.outLine;
            this.outSize = builder.outSize;
            this.shape = builder.shape;
            this.title = builder.title;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Report create() {
            return builder().build();
        }

        /**
         * @return format
         */
        public String getFormat() {
            return this.format;
        }

        /**
         * @return header
         */
        public java.util.List<String> getHeader() {
            return this.header;
        }

        /**
         * @return outLine
         */
        public Long getOutLine() {
            return this.outLine;
        }

        /**
         * @return outSize
         */
        public Long getOutSize() {
            return this.outSize;
        }

        /**
         * @return shape
         */
        public String getShape() {
            return this.shape;
        }

        /**
         * @return title
         */
        public String getTitle() {
            return this.title;
        }

        public static final class Builder {
            private String format; 
            private java.util.List<String> header; 
            private Long outLine; 
            private Long outSize; 
            private String shape; 
            private String title; 

            private Builder() {
            } 

            private Builder(Report model) {
                this.format = model.format;
                this.header = model.header;
                this.outLine = model.outLine;
                this.outSize = model.outSize;
                this.shape = model.shape;
                this.title = model.title;
            } 

            /**
             * format.
             */
            public Builder format(String format) {
                this.format = format;
                return this;
            }

            /**
             * header.
             */
            public Builder header(java.util.List<String> header) {
                this.header = header;
                return this;
            }

            /**
             * outLine.
             */
            public Builder outLine(Long outLine) {
                this.outLine = outLine;
                return this;
            }

            /**
             * outSize.
             */
            public Builder outSize(Long outSize) {
                this.outSize = outSize;
                return this;
            }

            /**
             * shape.
             */
            public Builder shape(String shape) {
                this.shape = shape;
                return this;
            }

            /**
             * title.
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            public Report build() {
                return new Report(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeCdnReportListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCdnReportListResponseBody</p>
     */
    public static class Deliver extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("report")
        private Report report;

        private Deliver(Builder builder) {
            this.report = builder.report;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Deliver create() {
            return builder().build();
        }

        /**
         * @return report
         */
        public Report getReport() {
            return this.report;
        }

        public static final class Builder {
            private Report report; 

            private Builder() {
            } 

            private Builder(Deliver model) {
                this.report = model.report;
            } 

            /**
             * report.
             */
            public Builder report(Report report) {
                this.report = report;
                return this;
            }

            public Deliver build() {
                return new Deliver(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeCdnReportListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCdnReportListResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("deliver")
        private Deliver deliver;

        @com.aliyun.core.annotation.NameInMap("reportId")
        private Long reportId;

        private Data(Builder builder) {
            this.deliver = builder.deliver;
            this.reportId = builder.reportId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return deliver
         */
        public Deliver getDeliver() {
            return this.deliver;
        }

        /**
         * @return reportId
         */
        public Long getReportId() {
            return this.reportId;
        }

        public static final class Builder {
            private Deliver deliver; 
            private Long reportId; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.deliver = model.deliver;
                this.reportId = model.reportId;
            } 

            /**
             * deliver.
             */
            public Builder deliver(Deliver deliver) {
                this.deliver = deliver;
                return this;
            }

            /**
             * reportId.
             */
            public Builder reportId(Long reportId) {
                this.reportId = reportId;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeCdnReportListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCdnReportListResponseBody</p>
     */
    public static class Content extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("data")
        private java.util.List<Data> data;

        private Content(Builder builder) {
            this.data = builder.data;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Content create() {
            return builder().build();
        }

        /**
         * @return data
         */
        public java.util.List<Data> getData() {
            return this.data;
        }

        public static final class Builder {
            private java.util.List<Data> data; 

            private Builder() {
            } 

            private Builder(Content model) {
                this.data = model.data;
            } 

            /**
             * data.
             */
            public Builder data(java.util.List<Data> data) {
                this.data = data;
                return this;
            }

            public Content build() {
                return new Content(this);
            } 

        } 

    }
}
