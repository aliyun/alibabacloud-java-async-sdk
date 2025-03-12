// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20171228.models;

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
 * {@link DescribleLayer7InstanceRelationsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribleLayer7InstanceRelationsResponseBody</p>
 */
public class DescribleLayer7InstanceRelationsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Layer7InstanceRelations")
    private java.util.List<Layer7InstanceRelations> layer7InstanceRelations;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribleLayer7InstanceRelationsResponseBody(Builder builder) {
        this.layer7InstanceRelations = builder.layer7InstanceRelations;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribleLayer7InstanceRelationsResponseBody create() {
        return builder().build();
    }

    /**
     * @return layer7InstanceRelations
     */
    public java.util.List<Layer7InstanceRelations> getLayer7InstanceRelations() {
        return this.layer7InstanceRelations;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<Layer7InstanceRelations> layer7InstanceRelations; 
        private String requestId; 

        /**
         * Layer7InstanceRelations.
         */
        public Builder layer7InstanceRelations(java.util.List<Layer7InstanceRelations> layer7InstanceRelations) {
            this.layer7InstanceRelations = layer7InstanceRelations;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribleLayer7InstanceRelationsResponseBody build() {
            return new DescribleLayer7InstanceRelationsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribleLayer7InstanceRelationsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribleLayer7InstanceRelationsResponseBody</p>
     */
    public static class InstanceDetails extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EipList")
        private java.util.List<String> eipList;

        @com.aliyun.core.annotation.NameInMap("FunctionVersion")
        private String functionVersion;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("IpMode")
        private String ipMode;

        @com.aliyun.core.annotation.NameInMap("IpVersion")
        private String ipVersion;

        private InstanceDetails(Builder builder) {
            this.eipList = builder.eipList;
            this.functionVersion = builder.functionVersion;
            this.instanceId = builder.instanceId;
            this.ipMode = builder.ipMode;
            this.ipVersion = builder.ipVersion;
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
        public java.util.List<String> getEipList() {
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

        /**
         * @return ipMode
         */
        public String getIpMode() {
            return this.ipMode;
        }

        /**
         * @return ipVersion
         */
        public String getIpVersion() {
            return this.ipVersion;
        }

        public static final class Builder {
            private java.util.List<String> eipList; 
            private String functionVersion; 
            private String instanceId; 
            private String ipMode; 
            private String ipVersion; 

            /**
             * EipList.
             */
            public Builder eipList(java.util.List<String> eipList) {
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

            /**
             * IpMode.
             */
            public Builder ipMode(String ipMode) {
                this.ipMode = ipMode;
                return this;
            }

            /**
             * IpVersion.
             */
            public Builder ipVersion(String ipVersion) {
                this.ipVersion = ipVersion;
                return this;
            }

            public InstanceDetails build() {
                return new InstanceDetails(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribleLayer7InstanceRelationsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribleLayer7InstanceRelationsResponseBody</p>
     */
    public static class Layer7InstanceRelations extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Domain")
        private String domain;

        @com.aliyun.core.annotation.NameInMap("InstanceDetails")
        private java.util.List<InstanceDetails> instanceDetails;

        private Layer7InstanceRelations(Builder builder) {
            this.domain = builder.domain;
            this.instanceDetails = builder.instanceDetails;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Layer7InstanceRelations create() {
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
        public java.util.List<InstanceDetails> getInstanceDetails() {
            return this.instanceDetails;
        }

        public static final class Builder {
            private String domain; 
            private java.util.List<InstanceDetails> instanceDetails; 

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
            public Builder instanceDetails(java.util.List<InstanceDetails> instanceDetails) {
                this.instanceDetails = instanceDetails;
                return this;
            }

            public Layer7InstanceRelations build() {
                return new Layer7InstanceRelations(this);
            } 

        } 

    }
}
