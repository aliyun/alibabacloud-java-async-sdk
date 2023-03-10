// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeCnameReusesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeCnameReusesResponseBody</p>
 */
public class DescribeCnameReusesResponseBody extends TeaModel {
    @NameInMap("CnameReuses")
    private java.util.List < CnameReuses> cnameReuses;

    @NameInMap("RequestId")
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

    /**
     * @return cnameReuses
     */
    public java.util.List < CnameReuses> getCnameReuses() {
        return this.cnameReuses;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < CnameReuses> cnameReuses; 
        private String requestId; 

        /**
         * An array that consists of the CNAME reuse information.
         */
        public Builder cnameReuses(java.util.List < CnameReuses> cnameReuses) {
            this.cnameReuses = cnameReuses;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeCnameReusesResponseBody build() {
            return new DescribeCnameReusesResponseBody(this);
        } 

    } 

    public static class CnameReuses extends TeaModel {
        @NameInMap("Cname")
        private String cname;

        @NameInMap("Domain")
        private String domain;

        @NameInMap("Enable")
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

            /**
             * The CNAME record that is reused by the website.
             */
            public Builder cname(String cname) {
                this.cname = cname;
                return this;
            }

            /**
             * The domain name of the website.
             */
            public Builder domain(String domain) {
                this.domain = domain;
                return this;
            }

            /**
             * Indicates whether CNAME reuse is enabled. Valid values:
             * <p>
             * 
             * *   **0**: no
             * *   **1**: yes
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
