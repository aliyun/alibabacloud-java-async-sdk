// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BatchSetCdnDomainConfigResponseBody} extends {@link TeaModel}
 *
 * <p>BatchSetCdnDomainConfigResponseBody</p>
 */
public class BatchSetCdnDomainConfigResponseBody extends TeaModel {
    @NameInMap("DomainConfigList")
    private DomainConfigList domainConfigList;

    @NameInMap("RequestId")
    private String requestId;

    private BatchSetCdnDomainConfigResponseBody(Builder builder) {
        this.domainConfigList = builder.domainConfigList;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BatchSetCdnDomainConfigResponseBody create() {
        return builder().build();
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

        /**
         * DomainConfigList.
         */
        public Builder domainConfigList(DomainConfigList domainConfigList) {
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

        public BatchSetCdnDomainConfigResponseBody build() {
            return new BatchSetCdnDomainConfigResponseBody(this);
        } 

    } 

    public static class DomainConfigModel extends TeaModel {
        @NameInMap("ConfigId")
        private Long configId;

        @NameInMap("DomainName")
        private String domainName;

        @NameInMap("FunctionName")
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

            public DomainConfigModel build() {
                return new DomainConfigModel(this);
            } 

        } 

    }
    public static class DomainConfigList extends TeaModel {
        @NameInMap("DomainConfigModel")
        private java.util.List < DomainConfigModel> domainConfigModel;

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
        public java.util.List < DomainConfigModel> getDomainConfigModel() {
            return this.domainConfigModel;
        }

        public static final class Builder {
            private java.util.List < DomainConfigModel> domainConfigModel; 

            /**
             * DomainConfigModel.
             */
            public Builder domainConfigModel(java.util.List < DomainConfigModel> domainConfigModel) {
                this.domainConfigModel = domainConfigModel;
                return this;
            }

            public DomainConfigList build() {
                return new DomainConfigList(this);
            } 

        } 

    }
}
