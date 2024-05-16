// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
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
         * The list of domain configurations.
         */
        public Builder domainConfigList(java.util.List < DomainConfigList> domainConfigList) {
            this.domainConfigList = domainConfigList;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public SetCdnDomainStagingConfigResponseBody build() {
            return new SetCdnDomainStagingConfigResponseBody(this);
        } 

    } 

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
             * The ID of the configuration.
             */
            public Builder configId(Long configId) {
                this.configId = configId;
                return this;
            }

            /**
             * The domain name.
             */
            public Builder domainName(String domainName) {
                this.domainName = domainName;
                return this;
            }

            /**
             * The name of the feature.
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
