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
 * {@link DescribeDomainCnameResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDomainCnameResponseBody</p>
 */
public class DescribeDomainCnameResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CnameDatas")
    private CnameDatas cnameDatas;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(DescribeDomainCnameResponseBody model) {
            this.cnameDatas = model.cnameDatas;
            this.requestId = model.requestId;
        } 

        /**
         * <p>Details about the CNAME detection results.</p>
         */
        public Builder cnameDatas(CnameDatas cnameDatas) {
            this.cnameDatas = cnameDatas;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>06D29681-B7CD-4034-A8CC-28AFFA213539</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeDomainCnameResponseBody build() {
            return new DescribeDomainCnameResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeDomainCnameResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDomainCnameResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Cname")
        private String cname;

        @com.aliyun.core.annotation.NameInMap("Domain")
        private String domain;

        @com.aliyun.core.annotation.NameInMap("ErrMsg")
        private String errMsg;

        @com.aliyun.core.annotation.NameInMap("Passed")
        private String passed;

        @com.aliyun.core.annotation.NameInMap("Status")
        private Integer status;

        private Data(Builder builder) {
            this.cname = builder.cname;
            this.domain = builder.domain;
            this.errMsg = builder.errMsg;
            this.passed = builder.passed;
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
         * @return errMsg
         */
        public String getErrMsg() {
            return this.errMsg;
        }

        /**
         * @return passed
         */
        public String getPassed() {
            return this.passed;
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
            private String errMsg; 
            private String passed; 
            private Integer status; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.cname = model.cname;
                this.domain = model.domain;
                this.errMsg = model.errMsg;
                this.passed = model.passed;
                this.status = model.status;
            } 

            /**
             * <p>The CNAME assigned to the domain name by Alibaba Cloud CDN.</p>
             * 
             * <strong>example:</strong>
             * <p>a.com.w.alikunlun.net</p>
             */
            public Builder cname(String cname) {
                this.cname = cname;
                return this;
            }

            /**
             * <p>The accelerated domain name.</p>
             * 
             * <strong>example:</strong>
             * <p>a.com</p>
             */
            public Builder domain(String domain) {
                this.domain = domain;
                return this;
            }

            /**
             * ErrMsg.
             */
            public Builder errMsg(String errMsg) {
                this.errMsg = errMsg;
                return this;
            }

            /**
             * Passed.
             */
            public Builder passed(String passed) {
                this.passed = passed;
                return this;
            }

            /**
             * <p>The CNAME detection result. Valid values:</p>
             * <ul>
             * <li>0: The DNS can detect the CNAME assigned to the domain name.</li>
             * <li>Value other than 0: The DNS cannot detect the CNAME assigned to the domain name.</li>
             * </ul>
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
     * {@link DescribeDomainCnameResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDomainCnameResponseBody</p>
     */
    public static class CnameDatas extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Data")
        private java.util.List<Data> data;

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
        public java.util.List<Data> getData() {
            return this.data;
        }

        public static final class Builder {
            private java.util.List<Data> data; 

            private Builder() {
            } 

            private Builder(CnameDatas model) {
                this.data = model.data;
            } 

            /**
             * Data.
             */
            public Builder data(java.util.List<Data> data) {
                this.data = data;
                return this;
            }

            public CnameDatas build() {
                return new CnameDatas(this);
            } 

        } 

    }
}
