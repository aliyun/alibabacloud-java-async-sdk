// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20171228.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDomainAccessModeResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDomainAccessModeResponseBody</p>
 */
public class DescribeDomainAccessModeResponseBody extends TeaModel {
    @NameInMap("DomainModeList")
    private java.util.List < DomainModeList> domainModeList;

    @NameInMap("RequestId")
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
    public java.util.List < DomainModeList> getDomainModeList() {
        return this.domainModeList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < DomainModeList> domainModeList; 
        private String requestId; 

        /**
         * DomainModeList.
         */
        public Builder domainModeList(java.util.List < DomainModeList> domainModeList) {
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

    public static class DomainModeList extends TeaModel {
        @NameInMap("AccessMode")
        private Integer accessMode;

        @NameInMap("Domain")
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
