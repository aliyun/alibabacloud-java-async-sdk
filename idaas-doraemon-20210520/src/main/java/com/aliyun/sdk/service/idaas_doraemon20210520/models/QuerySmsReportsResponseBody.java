// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.idaas_doraemon20210520.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QuerySmsReportsResponseBody} extends {@link TeaModel}
 *
 * <p>QuerySmsReportsResponseBody</p>
 */
public class QuerySmsReportsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("SmsReports")
    private java.util.List < SmsReports> smsReports;

    @NameInMap("TotalElements")
    private Long totalElements;

    private QuerySmsReportsResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.smsReports = builder.smsReports;
        this.totalElements = builder.totalElements;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QuerySmsReportsResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return smsReports
     */
    public java.util.List < SmsReports> getSmsReports() {
        return this.smsReports;
    }

    /**
     * @return totalElements
     */
    public Long getTotalElements() {
        return this.totalElements;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List < SmsReports> smsReports; 
        private Long totalElements; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * SmsReports.
         */
        public Builder smsReports(java.util.List < SmsReports> smsReports) {
            this.smsReports = smsReports;
            return this;
        }

        /**
         * TotalElements.
         */
        public Builder totalElements(Long totalElements) {
            this.totalElements = totalElements;
            return this;
        }

        public QuerySmsReportsResponseBody build() {
            return new QuerySmsReportsResponseBody(this);
        } 

    } 

    public static class SmsReports extends TeaModel {
        @NameInMap("AppId")
        private String appId;

        @NameInMap("ChargedCount")
        private Integer chargedCount;

        @NameInMap("Code")
        private String code;

        @NameInMap("EventId")
        private String eventId;

        @NameInMap("Mobile")
        private String mobile;

        @NameInMap("Sn")
        private String sn;

        @NameInMap("Stat")
        private String stat;

        @NameInMap("TenantId")
        private String tenantId;

        @NameInMap("Tid")
        private String tid;

        @NameInMap("Time")
        private String time;

        private SmsReports(Builder builder) {
            this.appId = builder.appId;
            this.chargedCount = builder.chargedCount;
            this.code = builder.code;
            this.eventId = builder.eventId;
            this.mobile = builder.mobile;
            this.sn = builder.sn;
            this.stat = builder.stat;
            this.tenantId = builder.tenantId;
            this.tid = builder.tid;
            this.time = builder.time;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SmsReports create() {
            return builder().build();
        }

        /**
         * @return appId
         */
        public String getAppId() {
            return this.appId;
        }

        /**
         * @return chargedCount
         */
        public Integer getChargedCount() {
            return this.chargedCount;
        }

        /**
         * @return code
         */
        public String getCode() {
            return this.code;
        }

        /**
         * @return eventId
         */
        public String getEventId() {
            return this.eventId;
        }

        /**
         * @return mobile
         */
        public String getMobile() {
            return this.mobile;
        }

        /**
         * @return sn
         */
        public String getSn() {
            return this.sn;
        }

        /**
         * @return stat
         */
        public String getStat() {
            return this.stat;
        }

        /**
         * @return tenantId
         */
        public String getTenantId() {
            return this.tenantId;
        }

        /**
         * @return tid
         */
        public String getTid() {
            return this.tid;
        }

        /**
         * @return time
         */
        public String getTime() {
            return this.time;
        }

        public static final class Builder {
            private String appId; 
            private Integer chargedCount; 
            private String code; 
            private String eventId; 
            private String mobile; 
            private String sn; 
            private String stat; 
            private String tenantId; 
            private String tid; 
            private String time; 

            /**
             * AppId.
             */
            public Builder appId(String appId) {
                this.appId = appId;
                return this;
            }

            /**
             * ChargedCount.
             */
            public Builder chargedCount(Integer chargedCount) {
                this.chargedCount = chargedCount;
                return this;
            }

            /**
             * Code.
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * EventId.
             */
            public Builder eventId(String eventId) {
                this.eventId = eventId;
                return this;
            }

            /**
             * Mobile.
             */
            public Builder mobile(String mobile) {
                this.mobile = mobile;
                return this;
            }

            /**
             * Sn.
             */
            public Builder sn(String sn) {
                this.sn = sn;
                return this;
            }

            /**
             * Stat.
             */
            public Builder stat(String stat) {
                this.stat = stat;
                return this;
            }

            /**
             * TenantId.
             */
            public Builder tenantId(String tenantId) {
                this.tenantId = tenantId;
                return this;
            }

            /**
             * Tid.
             */
            public Builder tid(String tid) {
                this.tid = tid;
                return this;
            }

            /**
             * Time.
             */
            public Builder time(String time) {
                this.time = time;
                return this;
            }

            public SmsReports build() {
                return new SmsReports(this);
            } 

        } 

    }
}
