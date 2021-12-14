// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20190910.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link DescribeProtectionModuleCodeConfigResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeProtectionModuleCodeConfigResponseBody</p>
 */
public class DescribeProtectionModuleCodeConfigResponseBody extends TeaModel {
    @NameInMap("CodeConfigs")
    private String codeConfigs;

    @NameInMap("RequestId")
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
         * <p>CodeConfigs.</p>
         */
        public Builder codeConfigs(String codeConfigs) {
            this.codeConfigs = codeConfigs;
            return this;
        }

        /**
         * <p>RequestId.</p>
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
