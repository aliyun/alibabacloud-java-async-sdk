// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeHttpDDoSAttackProtectionResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeHttpDDoSAttackProtectionResponseBody</p>
 */
public class DescribeHttpDDoSAttackProtectionResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("GlobalMode")
    private String globalMode;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SiteId")
    private Long siteId;

    private DescribeHttpDDoSAttackProtectionResponseBody(Builder builder) {
        this.globalMode = builder.globalMode;
        this.requestId = builder.requestId;
        this.siteId = builder.siteId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeHttpDDoSAttackProtectionResponseBody create() {
        return builder().build();
    }

    /**
     * @return globalMode
     */
    public String getGlobalMode() {
        return this.globalMode;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return siteId
     */
    public Long getSiteId() {
        return this.siteId;
    }

    public static final class Builder {
        private String globalMode; 
        private String requestId; 
        private Long siteId; 

        /**
         * <p>The level of HTTP DDoS attack protection. Valid values:</p>
         * <ul>
         * <li><strong>very weak</strong>: very loose.</li>
         * <li><strong>weak</strong>: loose.</li>
         * <li><strong>default</strong>: normal.</li>
         * <li><strong>hard</strong>: strict.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>default</p>
         */
        public Builder globalMode(String globalMode) {
            this.globalMode = globalMode;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>35C66C7B-671H-4297-9187-2C4477247A78</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The website ID.</p>
         * 
         * <strong>example:</strong>
         * <p>123456****</p>
         */
        public Builder siteId(Long siteId) {
            this.siteId = siteId;
            return this;
        }

        public DescribeHttpDDoSAttackProtectionResponseBody build() {
            return new DescribeHttpDDoSAttackProtectionResponseBody(this);
        } 

    } 

}
