// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20171228.models;

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
 * {@link DescribeDomainAccessModeResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDomainAccessModeResponseBody</p>
 */
public class DescribeDomainAccessModeResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DomainModeList")
    private java.util.List<DomainModeList> domainModeList;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeDomainAccessModeResponseBody(Builder builder) {
        this.domainModeList = builder.domainModeList;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDomainAccessModeResponseBody create() {
        return builder().build();
    }

    /**
     * @return domainModeList
     */
    public java.util.List<DomainModeList> getDomainModeList() {
        return this.domainModeList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<DomainModeList> domainModeList; 
        private String requestId; 

        /**
         * DomainModeList.
         */
        public Builder domainModeList(java.util.List<DomainModeList> domainModeList) {
            this.domainModeList = domainModeList;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeDomainAccessModeResponseBody build() {
            return new DescribeDomainAccessModeResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeDomainAccessModeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDomainAccessModeResponseBody</p>
     */
    public static class DomainModeList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccessMode")
        private Integer accessMode;

        @com.aliyun.core.annotation.NameInMap("Domain")
        private String domain;

        private DomainModeList(Builder builder) {
            this.accessMode = builder.accessMode;
            this.domain = builder.domain;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DomainModeList create() {
            return builder().build();
        }

        /**
         * @return accessMode
         */
        public Integer getAccessMode() {
            return this.accessMode;
        }

        /**
         * @return domain
         */
        public String getDomain() {
            return this.domain;
        }

        public static final class Builder {
            private Integer accessMode; 
            private String domain; 

            /**
             * AccessMode.
             */
            public Builder accessMode(Integer accessMode) {
                this.accessMode = accessMode;
                return this;
            }

            /**
             * Domain.
             */
            public Builder domain(String domain) {
                this.domain = domain;
                return this;
            }

            public DomainModeList build() {
                return new DomainModeList(this);
            } 

        } 

    }
}
