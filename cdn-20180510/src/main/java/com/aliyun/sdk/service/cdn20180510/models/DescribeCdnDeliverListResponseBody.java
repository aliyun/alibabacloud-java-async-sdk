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
 * {@link DescribeCdnDeliverListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeCdnDeliverListResponseBody</p>
 */
public class DescribeCdnDeliverListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Content")
    private Content content;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeCdnDeliverListResponseBody(Builder builder) {
        this.content = builder.content;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCdnDeliverListResponseBody create() {
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

        private Builder(DescribeCdnDeliverListResponseBody model) {
            this.content = model.content;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The information about the tracking task.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;data&quot;: [{&quot;deliverId&quot;: 1,&quot;status&quot;: &quot;enable&quot;,&quot;createTime&quot;: &quot;2020-10-14T11:19:26Z&quot;,&quot;crontab&quot;: &quot;0 0 0 * * ?&quot;,&quot;frequency&quot;: &quot;d&quot;,&quot;name&quot;: &quot;The name of the tracking task&quot;,&quot;dmList&quot;: [&quot;<a href="http://www.example.com%22%5D,%22reports">www.example.com&quot;],&quot;reports</a>&quot;: [{&quot;reportId&quot;: 1,&quot;conditions&quot;: [{&quot;op&quot;: &quot;in&quot;,&quot;field&quot;: &quot;prov&quot;,&quot;value&quot;: [&quot;Heilongjiang&quot;,&quot;Beijing&quot;]}} },{&quot;reportId&quot;: 2}],&quot;deliver&quot;: {&quot;email&quot;: {&quot;subject&quot;: &quot;subject&quot;,&quot;to&quot;: [&quot;<a href="mailto:example@alibaba-inc.com">example@alibaba-inc.com</a>&quot;,&quot;<a href="mailto:example@alibaba-inc.com">example@alibaba-inc.com</a>&quot;]}}}]}</p>
         */
        public Builder content(Content content) {
            this.content = content;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>12345</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeCdnDeliverListResponseBody build() {
            return new DescribeCdnDeliverListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeCdnDeliverListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCdnDeliverListResponseBody</p>
     */
    public static class Email extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("to")
        private java.util.List<String> to;

        private Email(Builder builder) {
            this.to = builder.to;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Email create() {
            return builder().build();
        }

        /**
         * @return to
         */
        public java.util.List<String> getTo() {
            return this.to;
        }

        public static final class Builder {
            private java.util.List<String> to; 

            private Builder() {
            } 

            private Builder(Email model) {
                this.to = model.to;
            } 

            /**
             * to.
             */
            public Builder to(java.util.List<String> to) {
                this.to = to;
                return this;
            }

            public Email build() {
                return new Email(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeCdnDeliverListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCdnDeliverListResponseBody</p>
     */
    public static class Deliver extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("email")
        private Email email;

        private Deliver(Builder builder) {
            this.email = builder.email;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Deliver create() {
            return builder().build();
        }

        /**
         * @return email
         */
        public Email getEmail() {
            return this.email;
        }

        public static final class Builder {
            private Email email; 

            private Builder() {
            } 

            private Builder(Deliver model) {
                this.email = model.email;
            } 

            /**
             * email.
             */
            public Builder email(Email email) {
                this.email = email;
                return this;
            }

            public Deliver build() {
                return new Deliver(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeCdnDeliverListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCdnDeliverListResponseBody</p>
     */
    public static class Reports extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("reportId")
        private Long reportId;

        private Reports(Builder builder) {
            this.reportId = builder.reportId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Reports create() {
            return builder().build();
        }

        /**
         * @return reportId
         */
        public Long getReportId() {
            return this.reportId;
        }

        public static final class Builder {
            private Long reportId; 

            private Builder() {
            } 

            private Builder(Reports model) {
                this.reportId = model.reportId;
            } 

            /**
             * reportId.
             */
            public Builder reportId(Long reportId) {
                this.reportId = reportId;
                return this;
            }

            public Reports build() {
                return new Reports(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeCdnDeliverListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCdnDeliverListResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("createTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("crontab")
        private String crontab;

        @com.aliyun.core.annotation.NameInMap("deliver")
        private Deliver deliver;

        @com.aliyun.core.annotation.NameInMap("deliverId")
        private Long deliverId;

        @com.aliyun.core.annotation.NameInMap("dmList")
        private java.util.List<String> dmList;

        @com.aliyun.core.annotation.NameInMap("frequency")
        private String frequency;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("reports")
        private java.util.List<Reports> reports;

        @com.aliyun.core.annotation.NameInMap("status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("timeEndFormat")
        private String timeEndFormat;

        @com.aliyun.core.annotation.NameInMap("timeFromFormat")
        private String timeFromFormat;

        private Data(Builder builder) {
            this.createTime = builder.createTime;
            this.crontab = builder.crontab;
            this.deliver = builder.deliver;
            this.deliverId = builder.deliverId;
            this.dmList = builder.dmList;
            this.frequency = builder.frequency;
            this.name = builder.name;
            this.reports = builder.reports;
            this.status = builder.status;
            this.timeEndFormat = builder.timeEndFormat;
            this.timeFromFormat = builder.timeFromFormat;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return crontab
         */
        public String getCrontab() {
            return this.crontab;
        }

        /**
         * @return deliver
         */
        public Deliver getDeliver() {
            return this.deliver;
        }

        /**
         * @return deliverId
         */
        public Long getDeliverId() {
            return this.deliverId;
        }

        /**
         * @return dmList
         */
        public java.util.List<String> getDmList() {
            return this.dmList;
        }

        /**
         * @return frequency
         */
        public String getFrequency() {
            return this.frequency;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return reports
         */
        public java.util.List<Reports> getReports() {
            return this.reports;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return timeEndFormat
         */
        public String getTimeEndFormat() {
            return this.timeEndFormat;
        }

        /**
         * @return timeFromFormat
         */
        public String getTimeFromFormat() {
            return this.timeFromFormat;
        }

        public static final class Builder {
            private String createTime; 
            private String crontab; 
            private Deliver deliver; 
            private Long deliverId; 
            private java.util.List<String> dmList; 
            private String frequency; 
            private String name; 
            private java.util.List<Reports> reports; 
            private String status; 
            private String timeEndFormat; 
            private String timeFromFormat; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.createTime = model.createTime;
                this.crontab = model.crontab;
                this.deliver = model.deliver;
                this.deliverId = model.deliverId;
                this.dmList = model.dmList;
                this.frequency = model.frequency;
                this.name = model.name;
                this.reports = model.reports;
                this.status = model.status;
                this.timeEndFormat = model.timeEndFormat;
                this.timeFromFormat = model.timeFromFormat;
            } 

            /**
             * createTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * crontab.
             */
            public Builder crontab(String crontab) {
                this.crontab = crontab;
                return this;
            }

            /**
             * deliver.
             */
            public Builder deliver(Deliver deliver) {
                this.deliver = deliver;
                return this;
            }

            /**
             * deliverId.
             */
            public Builder deliverId(Long deliverId) {
                this.deliverId = deliverId;
                return this;
            }

            /**
             * dmList.
             */
            public Builder dmList(java.util.List<String> dmList) {
                this.dmList = dmList;
                return this;
            }

            /**
             * frequency.
             */
            public Builder frequency(String frequency) {
                this.frequency = frequency;
                return this;
            }

            /**
             * name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * reports.
             */
            public Builder reports(java.util.List<Reports> reports) {
                this.reports = reports;
                return this;
            }

            /**
             * status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * timeEndFormat.
             */
            public Builder timeEndFormat(String timeEndFormat) {
                this.timeEndFormat = timeEndFormat;
                return this;
            }

            /**
             * timeFromFormat.
             */
            public Builder timeFromFormat(String timeFromFormat) {
                this.timeFromFormat = timeFromFormat;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeCdnDeliverListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCdnDeliverListResponseBody</p>
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
