// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDomainNamesOfVersionResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDomainNamesOfVersionResponseBody</p>
 */
public class DescribeDomainNamesOfVersionResponseBody extends TeaModel {
    @NameInMap("Contents")
    private java.util.List < Contents> contents;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeDomainNamesOfVersionResponseBody(Builder builder) {
        this.contents = builder.contents;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDomainNamesOfVersionResponseBody create() {
        return builder().build();
    }

    /**
     * @return contents
     */
    public java.util.List < Contents> getContents() {
        return this.contents;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List < Contents> contents; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * Contents.
         */
        public Builder contents(java.util.List < Contents> contents) {
            this.contents = contents;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeDomainNamesOfVersionResponseBody build() {
            return new DescribeDomainNamesOfVersionResponseBody(this);
        } 

    } 

    public static class Contents extends TeaModel {
        @NameInMap("DomainId")
        private String domainId;

        @NameInMap("DomainName")
        private String domainName;

        private Contents(Builder builder) {
            this.domainId = builder.domainId;
            this.domainName = builder.domainName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Contents create() {
            return builder().build();
        }

        /**
         * @return domainId
         */
        public String getDomainId() {
            return this.domainId;
        }

        /**
         * @return domainName
         */
        public String getDomainName() {
            return this.domainName;
        }

        public static final class Builder {
            private String domainId; 
            private String domainName; 

            /**
             * DomainId.
             */
            public Builder domainId(String domainId) {
                this.domainId = domainId;
                return this;
            }

            /**
             * DomainName.
             */
            public Builder domainName(String domainName) {
                this.domainName = domainName;
                return this;
            }

            public Contents build() {
                return new Contents(this);
            } 

        } 

    }
}
