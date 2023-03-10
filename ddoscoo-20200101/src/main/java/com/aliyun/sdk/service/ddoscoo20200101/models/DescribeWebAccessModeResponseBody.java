// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeWebAccessModeResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeWebAccessModeResponseBody</p>
 */
public class DescribeWebAccessModeResponseBody extends TeaModel {
    @NameInMap("DomainModes")
    private java.util.List < DomainModes> domainModes;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeWebAccessModeResponseBody(Builder builder) {
        this.domainModes = builder.domainModes;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeWebAccessModeResponseBody create() {
        return builder().build();
    }

    /**
     * @return domainModes
     */
    public java.util.List < DomainModes> getDomainModes() {
        return this.domainModes;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < DomainModes> domainModes; 
        private String requestId; 

        /**
         * An array consisting of the modes in which the website service is added.
         */
        public Builder domainModes(java.util.List < DomainModes> domainModes) {
            this.domainModes = domainModes;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeWebAccessModeResponseBody build() {
            return new DescribeWebAccessModeResponseBody(this);
        } 

    } 

    public static class DomainModes extends TeaModel {
        @NameInMap("AccessMode")
        private Integer accessMode;

        @NameInMap("Domain")
        private String domain;

        private DomainModes(Builder builder) {
            this.accessMode = builder.accessMode;
            this.domain = builder.domain;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DomainModes create() {
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
             * The mode in which the website service is added. Valid values:
             * <p>
             * 
             * *   **0**: A record
             * *   **1**: anti-DDoS mode
             * *   **2**: origin redundancy mode
             */
            public Builder accessMode(Integer accessMode) {
                this.accessMode = accessMode;
                return this;
            }

            /**
             * The domain name of the website.
             */
            public Builder domain(String domain) {
                this.domain = domain;
                return this;
            }

            public DomainModes build() {
                return new DomainModes(this);
            } 

        } 

    }
}
