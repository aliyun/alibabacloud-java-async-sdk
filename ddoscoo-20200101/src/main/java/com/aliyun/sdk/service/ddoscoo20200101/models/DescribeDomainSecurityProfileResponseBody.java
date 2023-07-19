// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDomainSecurityProfileResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDomainSecurityProfileResponseBody</p>
 */
public class DescribeDomainSecurityProfileResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Result")
    private java.util.List < Result> result;

    private DescribeDomainSecurityProfileResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDomainSecurityProfileResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return result
     */
    public java.util.List < Result> getResult() {
        return this.result;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List < Result> result; 

        /**
         * The ID of the request, which is used to locate and troubleshoot issues.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The returned results.
         */
        public Builder result(java.util.List < Result> result) {
            this.result = result;
            return this;
        }

        public DescribeDomainSecurityProfileResponseBody build() {
            return new DescribeDomainSecurityProfileResponseBody(this);
        } 

    } 

    public static class Result extends TeaModel {
        @NameInMap("GlobalEnable")
        private Boolean globalEnable;

        @NameInMap("GlobalMode")
        private String globalMode;

        private Result(Builder builder) {
            this.globalEnable = builder.globalEnable;
            this.globalMode = builder.globalMode;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return globalEnable
         */
        public Boolean getGlobalEnable() {
            return this.globalEnable;
        }

        /**
         * @return globalMode
         */
        public String getGlobalMode() {
            return this.globalMode;
        }

        public static final class Builder {
            private Boolean globalEnable; 
            private String globalMode; 

            /**
             * Indicates whether the global mitigation policy is enabled. Valid values:
             * <p>
             * 
             * *   **true**
             * *   **false**
             */
            public Builder globalEnable(Boolean globalEnable) {
                this.globalEnable = globalEnable;
                return this;
            }

            /**
             * The mode of the global mitigation policy. Valid values:
             * <p>
             * 
             * *   **weak**: the Low mode
             * *   **default**: the Normal mode
             * *   **hard**: the Strict mode
             */
            public Builder globalMode(String globalMode) {
                this.globalMode = globalMode;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
