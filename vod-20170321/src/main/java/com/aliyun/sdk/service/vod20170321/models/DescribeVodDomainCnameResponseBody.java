// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

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
 * {@link DescribeVodDomainCnameResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeVodDomainCnameResponseBody</p>
 */
public class DescribeVodDomainCnameResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CnameDatas")
    private CnameDatas cnameDatas;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeVodDomainCnameResponseBody(Builder builder) {
        this.cnameDatas = builder.cnameDatas;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeVodDomainCnameResponseBody create() {
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

        private Builder(DescribeVodDomainCnameResponseBody model) {
            this.cnameDatas = model.cnameDatas;
            this.requestId = model.requestId;
        } 

        /**
         * CnameDatas.
         */
        public Builder cnameDatas(CnameDatas cnameDatas) {
            this.cnameDatas = cnameDatas;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeVodDomainCnameResponseBody build() {
            return new DescribeVodDomainCnameResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeVodDomainCnameResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeVodDomainCnameResponseBody</p>
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

            private Builder() {
            } 

            private Builder(Data model) {
                this.cname = model.cname;
                this.domain = model.domain;
                this.status = model.status;
            } 

            /**
             * Cname.
             */
            public Builder cname(String cname) {
                this.cname = cname;
                return this;
            }

            /**
             * Domain.
             */
            public Builder domain(String domain) {
                this.domain = domain;
                return this;
            }

            /**
             * Status.
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
     * {@link DescribeVodDomainCnameResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeVodDomainCnameResponseBody</p>
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
