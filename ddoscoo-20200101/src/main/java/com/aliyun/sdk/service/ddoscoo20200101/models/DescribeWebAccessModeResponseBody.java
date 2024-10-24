// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeWebAccessModeResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeWebAccessModeResponseBody</p>
 */
public class DescribeWebAccessModeResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DomainModes")
    private java.util.List < DomainModes> domainModes;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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
         * <p>An array consisting of the modes in which the website service is added.</p>
         */
        public Builder domainModes(java.util.List < DomainModes> domainModes) {
            this.domainModes = domainModes;
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

        public DescribeWebAccessModeResponseBody build() {
            return new DescribeWebAccessModeResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeWebAccessModeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeWebAccessModeResponseBody</p>
     */
    public static class DomainModes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccessMode")
        private Integer accessMode;

        @com.aliyun.core.annotation.NameInMap("Domain")
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
             * <p>The mode in which the website service is added. Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: A record</li>
             * <li><strong>1</strong>: anti-DDoS mode</li>
             * <li><strong>2</strong>: origin redundancy mode</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder accessMode(Integer accessMode) {
                this.accessMode = accessMode;
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

            public DomainModes build() {
                return new DomainModes(this);
            } 

        } 

    }
}
