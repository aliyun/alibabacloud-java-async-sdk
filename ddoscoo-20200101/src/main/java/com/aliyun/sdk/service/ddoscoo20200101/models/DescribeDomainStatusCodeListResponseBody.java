// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDomainStatusCodeListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDomainStatusCodeListResponseBody</p>
 */
public class DescribeDomainStatusCodeListResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("StatusCodeList")
    private java.util.List < StatusCodeList> statusCodeList;

    private DescribeDomainStatusCodeListResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.statusCodeList = builder.statusCodeList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDomainStatusCodeListResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return statusCodeList
     */
    public java.util.List < StatusCodeList> getStatusCodeList() {
        return this.statusCodeList;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List < StatusCodeList> statusCodeList; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * StatusCodeList.
         */
        public Builder statusCodeList(java.util.List < StatusCodeList> statusCodeList) {
            this.statusCodeList = statusCodeList;
            return this;
        }

        public DescribeDomainStatusCodeListResponseBody build() {
            return new DescribeDomainStatusCodeListResponseBody(this);
        } 

    } 

    public static class StatusCodeList extends TeaModel {
        @NameInMap("Index")
        private Integer index;

        @NameInMap("Status200")
        private Long status200;

        @NameInMap("Status2XX")
        private Long status2XX;

        @NameInMap("Status3XX")
        private Long status3XX;

        @NameInMap("Status403")
        private Long status403;

        @NameInMap("Status404")
        private Long status404;

        @NameInMap("Status405")
        private Long status405;

        @NameInMap("Status4XX")
        private Long status4XX;

        @NameInMap("Status501")
        private Long status501;

        @NameInMap("Status502")
        private Long status502;

        @NameInMap("Status503")
        private Long status503;

        @NameInMap("Status504")
        private Long status504;

        @NameInMap("Status5XX")
        private Long status5XX;

        @NameInMap("Time")
        private Long time;

        private StatusCodeList(Builder builder) {
            this.index = builder.index;
            this.status200 = builder.status200;
            this.status2XX = builder.status2XX;
            this.status3XX = builder.status3XX;
            this.status403 = builder.status403;
            this.status404 = builder.status404;
            this.status405 = builder.status405;
            this.status4XX = builder.status4XX;
            this.status501 = builder.status501;
            this.status502 = builder.status502;
            this.status503 = builder.status503;
            this.status504 = builder.status504;
            this.status5XX = builder.status5XX;
            this.time = builder.time;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static StatusCodeList create() {
            return builder().build();
        }

        /**
         * @return index
         */
        public Integer getIndex() {
            return this.index;
        }

        /**
         * @return status200
         */
        public Long getStatus200() {
            return this.status200;
        }

        /**
         * @return status2XX
         */
        public Long getStatus2XX() {
            return this.status2XX;
        }

        /**
         * @return status3XX
         */
        public Long getStatus3XX() {
            return this.status3XX;
        }

        /**
         * @return status403
         */
        public Long getStatus403() {
            return this.status403;
        }

        /**
         * @return status404
         */
        public Long getStatus404() {
            return this.status404;
        }

        /**
         * @return status405
         */
        public Long getStatus405() {
            return this.status405;
        }

        /**
         * @return status4XX
         */
        public Long getStatus4XX() {
            return this.status4XX;
        }

        /**
         * @return status501
         */
        public Long getStatus501() {
            return this.status501;
        }

        /**
         * @return status502
         */
        public Long getStatus502() {
            return this.status502;
        }

        /**
         * @return status503
         */
        public Long getStatus503() {
            return this.status503;
        }

        /**
         * @return status504
         */
        public Long getStatus504() {
            return this.status504;
        }

        /**
         * @return status5XX
         */
        public Long getStatus5XX() {
            return this.status5XX;
        }

        /**
         * @return time
         */
        public Long getTime() {
            return this.time;
        }

        public static final class Builder {
            private Integer index; 
            private Long status200; 
            private Long status2XX; 
            private Long status3XX; 
            private Long status403; 
            private Long status404; 
            private Long status405; 
            private Long status4XX; 
            private Long status501; 
            private Long status502; 
            private Long status503; 
            private Long status504; 
            private Long status5XX; 
            private Long time; 

            /**
             * Index.
             */
            public Builder index(Integer index) {
                this.index = index;
                return this;
            }

            /**
             * Status200.
             */
            public Builder status200(Long status200) {
                this.status200 = status200;
                return this;
            }

            /**
             * Status2XX.
             */
            public Builder status2XX(Long status2XX) {
                this.status2XX = status2XX;
                return this;
            }

            /**
             * Status3XX.
             */
            public Builder status3XX(Long status3XX) {
                this.status3XX = status3XX;
                return this;
            }

            /**
             * Status403.
             */
            public Builder status403(Long status403) {
                this.status403 = status403;
                return this;
            }

            /**
             * Status404.
             */
            public Builder status404(Long status404) {
                this.status404 = status404;
                return this;
            }

            /**
             * Status405.
             */
            public Builder status405(Long status405) {
                this.status405 = status405;
                return this;
            }

            /**
             * Status4XX.
             */
            public Builder status4XX(Long status4XX) {
                this.status4XX = status4XX;
                return this;
            }

            /**
             * Status501.
             */
            public Builder status501(Long status501) {
                this.status501 = status501;
                return this;
            }

            /**
             * Status502.
             */
            public Builder status502(Long status502) {
                this.status502 = status502;
                return this;
            }

            /**
             * Status503.
             */
            public Builder status503(Long status503) {
                this.status503 = status503;
                return this;
            }

            /**
             * Status504.
             */
            public Builder status504(Long status504) {
                this.status504 = status504;
                return this;
            }

            /**
             * Status5XX.
             */
            public Builder status5XX(Long status5XX) {
                this.status5XX = status5XX;
                return this;
            }

            /**
             * Time.
             */
            public Builder time(Long time) {
                this.time = time;
                return this;
            }

            public StatusCodeList build() {
                return new StatusCodeList(this);
            } 

        } 

    }
}
