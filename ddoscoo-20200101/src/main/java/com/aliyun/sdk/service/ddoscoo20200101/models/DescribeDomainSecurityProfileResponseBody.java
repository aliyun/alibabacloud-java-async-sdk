// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeDomainSecurityProfileResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDomainSecurityProfileResponseBody</p>
 */
public class DescribeDomainSecurityProfileResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Result")
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
         * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The returned results.</p>
         */
        public Builder result(java.util.List < Result> result) {
            this.result = result;
            return this;
        }

        public DescribeDomainSecurityProfileResponseBody build() {
            return new DescribeDomainSecurityProfileResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeDomainSecurityProfileResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDomainSecurityProfileResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("GlobalEnable")
        private Boolean globalEnable;

        @com.aliyun.core.annotation.NameInMap("GlobalMode")
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
             * <p>Indicates whether the global mitigation policy is enabled. Valid values:</p>
             * <ul>
             * <li><strong>true</strong></li>
             * <li><strong>false</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder globalEnable(Boolean globalEnable) {
                this.globalEnable = globalEnable;
                return this;
            }

            /**
             * <p>The mode of the global mitigation policy. Valid values:</p>
             * <ul>
             * <li><strong>weak</strong>: the Low mode</li>
             * <li><strong>default</strong>: the Normal mode</li>
             * <li><strong>hard</strong>: the Strict mode</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>default</p>
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
