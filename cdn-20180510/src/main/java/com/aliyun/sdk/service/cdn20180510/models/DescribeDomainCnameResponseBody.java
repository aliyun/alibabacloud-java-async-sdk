// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDomainCnameResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDomainCnameResponseBody</p>
 */
public class DescribeDomainCnameResponseBody extends TeaModel {
    @NameInMap("CnameDatas")
    private CnameDatas cnameDatas;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeDomainCnameResponseBody(Builder builder) {
        this.cnameDatas = builder.cnameDatas;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDomainCnameResponseBody create() {
        return builder().build();
    }

    /**
     * @return cnameDatas
     */
    public CnameDatas getCnameDatas() {
        return this.cnameDatas;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private CnameDatas cnameDatas; 
        private String requestId; 

        /**
         * Details about the CNAME detection results.
         */
        public Builder cnameDatas(CnameDatas cnameDatas) {
            this.cnameDatas = cnameDatas;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeDomainCnameResponseBody build() {
            return new DescribeDomainCnameResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("Cname")
        private String cname;

        @NameInMap("Domain")
        private String domain;

        @NameInMap("Status")
        private Integer status;

        private Data(Builder builder) {
            this.cname = builder.cname;
            this.domain = builder.domain;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return cname
         */
        public String getCname() {
            return this.cname;
        }

        /**
         * @return domain
         */
        public String getDomain() {
            return this.domain;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String cname; 
            private String domain; 
            private Integer status; 

            /**
             * The CNAME assigned to the domain name by Alibaba Cloud CDN.
             */
            public Builder cname(String cname) {
                this.cname = cname;
                return this;
            }

            /**
             * The accelerated domain name.
             */
            public Builder domain(String domain) {
                this.domain = domain;
                return this;
            }

            /**
             * The CNAME detection result. Valid values:
             * <p>
             * 
             * *   0: The DNS can detect the CNAME assigned to the domain name.
             * *   Value other than 0: The DNS cannot detect the CNAME assigned to the domain name.
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
    public static class CnameDatas extends TeaModel {
        @NameInMap("Data")
        private java.util.List < Data> data;

        private CnameDatas(Builder builder) {
            this.data = builder.data;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CnameDatas create() {
            return builder().build();
        }

        /**
         * @return data
         */
        public java.util.List < Data> getData() {
            return this.data;
        }

        public static final class Builder {
            private java.util.List < Data> data; 

            /**
             * Data.
             */
            public Builder data(java.util.List < Data> data) {
                this.data = data;
                return this;
            }

            public CnameDatas build() {
                return new CnameDatas(this);
            } 

        } 

    }
}
