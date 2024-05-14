// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.waf_openapi20190910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeProtectionModuleCodeConfigResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeProtectionModuleCodeConfigResponseBody</p>
 */
public class DescribeProtectionModuleCodeConfigResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CodeConfigs")
    private String codeConfigs;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeProtectionModuleCodeConfigResponseBody(Builder builder) {
        this.codeConfigs = builder.codeConfigs;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeProtectionModuleCodeConfigResponseBody create() {
        return builder().build();
    }

    /**
     * @return codeConfigs
     */
    public String getCodeConfigs() {
        return this.codeConfigs;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String codeConfigs; 
        private String requestId; 

        /**
         * CodeConfigs.
         */
        public Builder codeConfigs(String codeConfigs) {
            this.codeConfigs = codeConfigs;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeProtectionModuleCodeConfigResponseBody build() {
            return new DescribeProtectionModuleCodeConfigResponseBody(this);
        } 

    } 

}
