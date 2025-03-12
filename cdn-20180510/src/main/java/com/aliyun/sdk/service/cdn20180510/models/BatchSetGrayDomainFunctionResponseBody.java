// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link BatchSetGrayDomainFunctionResponseBody} extends {@link TeaModel}
 *
 * <p>BatchSetGrayDomainFunctionResponseBody</p>
 */
public class BatchSetGrayDomainFunctionResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DomainConfigList")
    private java.util.List<DomainConfigList> domainConfigList;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private BatchSetGrayDomainFunctionResponseBody(Builder builder) {
        this.domainConfigList = builder.domainConfigList;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BatchSetGrayDomainFunctionResponseBody create() {
        return builder().build();
    }

    /**
     * @return domainConfigList
     */
    public java.util.List<DomainConfigList> getDomainConfigList() {
        return this.domainConfigList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<DomainConfigList> domainConfigList; 
        private String requestId; 

        /**
         * DomainConfigList.
         */
        public Builder domainConfigList(java.util.List<DomainConfigList> domainConfigList) {
            this.domainConfigList = domainConfigList;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public BatchSetGrayDomainFunctionResponseBody build() {
            return new BatchSetGrayDomainFunctionResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link BatchSetGrayDomainFunctionResponseBody} extends {@link TeaModel}
     *
     * <p>BatchSetGrayDomainFunctionResponseBody</p>
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
             * ConfigId.
             */
            public Builder configId(Long configId) {
                this.configId = configId;
                return this;
            }

            /**
             * DomainName.
             */
            public Builder domainName(String domainName) {
                this.domainName = domainName;
                return this;
            }

            /**
             * FunctionName.
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
