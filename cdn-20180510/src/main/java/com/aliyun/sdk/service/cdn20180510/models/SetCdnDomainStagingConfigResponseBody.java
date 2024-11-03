// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link SetCdnDomainStagingConfigResponseBody} extends {@link TeaModel}
 *
 * <p>SetCdnDomainStagingConfigResponseBody</p>
 */
public class SetCdnDomainStagingConfigResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DomainConfigList")
    private java.util.List < DomainConfigList> domainConfigList;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private SetCdnDomainStagingConfigResponseBody(Builder builder) {
        this.domainConfigList = builder.domainConfigList;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetCdnDomainStagingConfigResponseBody create() {
        return builder().build();
    }

    /**
     * @return domainConfigList
     */
    public java.util.List < DomainConfigList> getDomainConfigList() {
        return this.domainConfigList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < DomainConfigList> domainConfigList; 
        private String requestId; 

        /**
         * <p>The list of domain configurations.</p>
         */
        public Builder domainConfigList(java.util.List < DomainConfigList> domainConfigList) {
            this.domainConfigList = domainConfigList;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>04F0F334-1335-436C-A1D7-6C044FE73368</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public SetCdnDomainStagingConfigResponseBody build() {
            return new SetCdnDomainStagingConfigResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link SetCdnDomainStagingConfigResponseBody} extends {@link TeaModel}
     *
     * <p>SetCdnDomainStagingConfigResponseBody</p>
     */
    public static class DomainConfigList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ConfigId")
        private Long configId;

        @com.aliyun.core.annotation.NameInMap("DomainName")
        private String domainName;

        @com.aliyun.core.annotation.NameInMap("FunctionName")
        private String functionName;

        private DomainConfigList(Builder builder) {
            this.configId = builder.configId;
            this.domainName = builder.domainName;
            this.functionName = builder.functionName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DomainConfigList create() {
            return builder().build();
        }

        /**
         * @return configId
         */
        public Long getConfigId() {
            return this.configId;
        }

        /**
         * @return domainName
         */
        public String getDomainName() {
            return this.domainName;
        }

        /**
         * @return functionName
         */
        public String getFunctionName() {
            return this.functionName;
        }

        public static final class Builder {
            private Long configId; 
            private String domainName; 
            private String functionName; 

            /**
             * <p>The ID of the configuration.</p>
             * 
             * <strong>example:</strong>
             * <p>1234567</p>
             */
            public Builder configId(Long configId) {
                this.configId = configId;
                return this;
            }

            /**
             * <p>The domain name.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://www.example.com">www.example.com</a></p>
             */
            public Builder domainName(String domainName) {
                this.domainName = domainName;
                return this;
            }

            /**
             * <p>The name of the feature.</p>
             * 
             * <strong>example:</strong>
             * <p>set_resp_header</p>
             */
            public Builder functionName(String functionName) {
                this.functionName = functionName;
                return this;
            }

            public DomainConfigList build() {
                return new DomainConfigList(this);
            } 

        } 

    }
}
