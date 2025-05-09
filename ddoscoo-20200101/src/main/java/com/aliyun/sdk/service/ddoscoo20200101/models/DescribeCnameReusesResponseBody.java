// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

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
 * {@link DescribeCnameReusesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeCnameReusesResponseBody</p>
 */
public class DescribeCnameReusesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CnameReuses")
    private java.util.List<CnameReuses> cnameReuses;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeCnameReusesResponseBody(Builder builder) {
        this.cnameReuses = builder.cnameReuses;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCnameReusesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return cnameReuses
     */
    public java.util.List<CnameReuses> getCnameReuses() {
        return this.cnameReuses;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<CnameReuses> cnameReuses; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeCnameReusesResponseBody model) {
            this.cnameReuses = model.cnameReuses;
            this.requestId = model.requestId;
        } 

        /**
         * CnameReuses.
         */
        public Builder cnameReuses(java.util.List<CnameReuses> cnameReuses) {
            this.cnameReuses = cnameReuses;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeCnameReusesResponseBody build() {
            return new DescribeCnameReusesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeCnameReusesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCnameReusesResponseBody</p>
     */
    public static class CnameReuses extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Cname")
        private String cname;

        @com.aliyun.core.annotation.NameInMap("Domain")
        private String domain;

        @com.aliyun.core.annotation.NameInMap("Enable")
        private Integer enable;

        private CnameReuses(Builder builder) {
            this.cname = builder.cname;
            this.domain = builder.domain;
            this.enable = builder.enable;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CnameReuses create() {
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
         * @return enable
         */
        public Integer getEnable() {
            return this.enable;
        }

        public static final class Builder {
            private String cname; 
            private String domain; 
            private Integer enable; 

            private Builder() {
            } 

            private Builder(CnameReuses model) {
                this.cname = model.cname;
                this.domain = model.domain;
                this.enable = model.enable;
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
             * Enable.
             */
            public Builder enable(Integer enable) {
                this.enable = enable;
                return this;
            }

            public CnameReuses build() {
                return new CnameReuses(this);
            } 

        } 

    }
}
