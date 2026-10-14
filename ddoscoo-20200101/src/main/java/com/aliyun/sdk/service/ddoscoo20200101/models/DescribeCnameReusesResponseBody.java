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
         * <p>The CNAME reuse information.</p>
         */
        public Builder cnameReuses(java.util.List<CnameReuses> cnameReuses) {
            this.cnameReuses = cnameReuses;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>0bcf28g5-d57c-11e7-9bs0-d89d6717dxbc</p>
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
             * <p>The reused canonical name value.</p>
             * 
             * <strong>example:</strong>
             * <p>4o6ep6q217k9****.aliyunddos0004.com</p>
             */
            public Builder cname(String cname) {
                this.cname = cname;
                return this;
            }

            /**
             * <p>The domain name of the website.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://www.aliyun.com">www.aliyun.com</a></p>
             */
            public Builder domain(String domain) {
                this.domain = domain;
                return this;
            }

            /**
             * <p>Indicates whether CNAME reuse is enabled. Valid values:</p>
             * <ul>
             * <li><p><strong>0</strong>: disabled</p>
             * </li>
             * <li><p><strong>1</strong>: enabled</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
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
