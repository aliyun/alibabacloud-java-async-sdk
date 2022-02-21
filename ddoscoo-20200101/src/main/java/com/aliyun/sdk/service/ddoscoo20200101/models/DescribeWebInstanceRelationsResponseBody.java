// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeWebInstanceRelationsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeWebInstanceRelationsResponseBody</p>
 */
public class DescribeWebInstanceRelationsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("WebInstanceRelations")
    private java.util.List < WebInstanceRelations> webInstanceRelations;

    private DescribeWebInstanceRelationsResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.webInstanceRelations = builder.webInstanceRelations;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeWebInstanceRelationsResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return webInstanceRelations
     */
    public java.util.List < WebInstanceRelations> getWebInstanceRelations() {
        return this.webInstanceRelations;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List < WebInstanceRelations> webInstanceRelations; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * WebInstanceRelations.
         */
        public Builder webInstanceRelations(java.util.List < WebInstanceRelations> webInstanceRelations) {
            this.webInstanceRelations = webInstanceRelations;
            return this;
        }

        public DescribeWebInstanceRelationsResponseBody build() {
            return new DescribeWebInstanceRelationsResponseBody(this);
        } 

    } 

    public static class InstanceDetails extends TeaModel {
        @NameInMap("EipList")
        private java.util.List < String > eipList;

        @NameInMap("FunctionVersion")
        private String functionVersion;

        @NameInMap("InstanceId")
        private String instanceId;

        private InstanceDetails(Builder builder) {
            this.eipList = builder.eipList;
            this.functionVersion = builder.functionVersion;
            this.instanceId = builder.instanceId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InstanceDetails create() {
            return builder().build();
        }

        /**
         * @return eipList
         */
        public java.util.List < String > getEipList() {
            return this.eipList;
        }

        /**
         * @return functionVersion
         */
        public String getFunctionVersion() {
            return this.functionVersion;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        public static final class Builder {
            private java.util.List < String > eipList; 
            private String functionVersion; 
            private String instanceId; 

            /**
             * EipList.
             */
            public Builder eipList(java.util.List < String > eipList) {
                this.eipList = eipList;
                return this;
            }

            /**
             * FunctionVersion.
             */
            public Builder functionVersion(String functionVersion) {
                this.functionVersion = functionVersion;
                return this;
            }

            /**
             * InstanceId.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            public InstanceDetails build() {
                return new InstanceDetails(this);
            } 

        } 

    }
    public static class WebInstanceRelations extends TeaModel {
        @NameInMap("Domain")
        private String domain;

        @NameInMap("InstanceDetails")
        private java.util.List < InstanceDetails> instanceDetails;

        private WebInstanceRelations(Builder builder) {
            this.domain = builder.domain;
            this.instanceDetails = builder.instanceDetails;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static WebInstanceRelations create() {
            return builder().build();
        }

        /**
         * @return domain
         */
        public String getDomain() {
            return this.domain;
        }

        /**
         * @return instanceDetails
         */
        public java.util.List < InstanceDetails> getInstanceDetails() {
            return this.instanceDetails;
        }

        public static final class Builder {
            private String domain; 
            private java.util.List < InstanceDetails> instanceDetails; 

            /**
             * Domain.
             */
            public Builder domain(String domain) {
                this.domain = domain;
                return this;
            }

            /**
             * InstanceDetails.
             */
            public Builder instanceDetails(java.util.List < InstanceDetails> instanceDetails) {
                this.instanceDetails = instanceDetails;
                return this;
            }

            public WebInstanceRelations build() {
                return new WebInstanceRelations(this);
            } 

        } 

    }
}
