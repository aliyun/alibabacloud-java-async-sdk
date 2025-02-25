// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeDcdnDomainCnameResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDcdnDomainCnameResponseBody</p>
 */
public class DescribeDcdnDomainCnameResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CnameDatas")
    private CnameDatas cnameDatas;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeDcdnDomainCnameResponseBody(Builder builder) {
        this.cnameDatas = builder.cnameDatas;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDcdnDomainCnameResponseBody create() {
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
         * <p>The CNAME information.</p>
         */
        public Builder cnameDatas(CnameDatas cnameDatas) {
            this.cnameDatas = cnameDatas;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>15C66C7B-671A-4297-9187-2C4477247A74</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeDcdnDomainCnameResponseBody build() {
            return new DescribeDcdnDomainCnameResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeDcdnDomainCnameResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDcdnDomainCnameResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Cname")
        private String cname;

        @com.aliyun.core.annotation.NameInMap("Domain")
        private String domain;

        @com.aliyun.core.annotation.NameInMap("Status")
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
             * <p>The CNAME assigned to the domain name.</p>
             * 
             * <strong>example:</strong>
             * <p>*.com</p>
             */
            public Builder cname(String cname) {
                this.cname = cname;
                return this;
            }

            /**
             * <p>The accelerated domain name.</p>
             * 
             * <strong>example:</strong>
             * <p>.example.com</p>
             */
            public Builder domain(String domain) {
                this.domain = domain;
                return this;
            }

            /**
             * <p>The configuration status of the CNAME record. If the operation returns 0 for the parameter, the configuration was successful. Otherwise, the configuration failed.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
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
    /**
     * 
     * {@link DescribeDcdnDomainCnameResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDcdnDomainCnameResponseBody</p>
     */
    public static class CnameDatas extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Data")
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
