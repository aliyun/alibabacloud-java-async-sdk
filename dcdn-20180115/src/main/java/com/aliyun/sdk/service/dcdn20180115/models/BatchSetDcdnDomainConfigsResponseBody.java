// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

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
 * {@link BatchSetDcdnDomainConfigsResponseBody} extends {@link TeaModel}
 *
 * <p>BatchSetDcdnDomainConfigsResponseBody</p>
 */
public class BatchSetDcdnDomainConfigsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DomainConfigList")
    private DomainConfigList domainConfigList;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private BatchSetDcdnDomainConfigsResponseBody(Builder builder) {
        this.domainConfigList = builder.domainConfigList;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BatchSetDcdnDomainConfigsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return domainConfigList
     */
    public DomainConfigList getDomainConfigList() {
        return this.domainConfigList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private DomainConfigList domainConfigList; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(BatchSetDcdnDomainConfigsResponseBody model) {
            this.domainConfigList = model.domainConfigList;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The list of domain configurations.</p>
         */
        public Builder domainConfigList(DomainConfigList domainConfigList) {
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

        public BatchSetDcdnDomainConfigsResponseBody build() {
            return new BatchSetDcdnDomainConfigsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link BatchSetDcdnDomainConfigsResponseBody} extends {@link TeaModel}
     *
     * <p>BatchSetDcdnDomainConfigsResponseBody</p>
     */
    public static class DomainConfigModel extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ConfigId")
        private Long configId;

        @com.aliyun.core.annotation.NameInMap("DomainName")
        private String domainName;

        @com.aliyun.core.annotation.NameInMap("FunctionName")
        private String functionName;

        private DomainConfigModel(Builder builder) {
            this.configId = builder.configId;
            this.domainName = builder.domainName;
            this.functionName = builder.functionName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DomainConfigModel create() {
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

            private Builder() {
            } 

            private Builder(DomainConfigModel model) {
                this.configId = model.configId;
                this.domainName = model.domainName;
                this.functionName = model.functionName;
            } 

            /**
             * <p>The ID of the configuration.</p>
             * 
             * <strong>example:</strong>
             * <p>123456</p>
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

            public DomainConfigModel build() {
                return new DomainConfigModel(this);
            } 

        } 

    }
    /**
     * 
     * {@link BatchSetDcdnDomainConfigsResponseBody} extends {@link TeaModel}
     *
     * <p>BatchSetDcdnDomainConfigsResponseBody</p>
     */
    public static class DomainConfigList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DomainConfigModel")
        private java.util.List<DomainConfigModel> domainConfigModel;

        private DomainConfigList(Builder builder) {
            this.domainConfigModel = builder.domainConfigModel;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DomainConfigList create() {
            return builder().build();
        }

        /**
         * @return domainConfigModel
         */
        public java.util.List<DomainConfigModel> getDomainConfigModel() {
            return this.domainConfigModel;
        }

        public static final class Builder {
            private java.util.List<DomainConfigModel> domainConfigModel; 

            private Builder() {
            } 

            private Builder(DomainConfigList model) {
                this.domainConfigModel = model.domainConfigModel;
            } 

            /**
             * DomainConfigModel.
             */
            public Builder domainConfigModel(java.util.List<DomainConfigModel> domainConfigModel) {
                this.domainConfigModel = domainConfigModel;
                return this;
            }

            public DomainConfigList build() {
                return new DomainConfigList(this);
            } 

        } 

    }
}
