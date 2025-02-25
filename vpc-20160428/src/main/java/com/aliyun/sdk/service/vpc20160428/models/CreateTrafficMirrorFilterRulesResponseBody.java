// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

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
 * {@link CreateTrafficMirrorFilterRulesResponseBody} extends {@link TeaModel}
 *
 * <p>CreateTrafficMirrorFilterRulesResponseBody</p>
 */
public class CreateTrafficMirrorFilterRulesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("EgressRules")
    private java.util.List<EgressRules> egressRules;

    @com.aliyun.core.annotation.NameInMap("IngressRules")
    private java.util.List<IngressRules> ingressRules;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateTrafficMirrorFilterRulesResponseBody(Builder builder) {
        this.egressRules = builder.egressRules;
        this.ingressRules = builder.ingressRules;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateTrafficMirrorFilterRulesResponseBody create() {
        return builder().build();
    }

    /**
     * @return egressRules
     */
    public java.util.List<EgressRules> getEgressRules() {
        return this.egressRules;
    }

    /**
     * @return ingressRules
     */
    public java.util.List<IngressRules> getIngressRules() {
        return this.ingressRules;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<EgressRules> egressRules; 
        private java.util.List<IngressRules> ingressRules; 
        private String requestId; 

        /**
         * <p>The list of outbound rules.</p>
         */
        public Builder egressRules(java.util.List<EgressRules> egressRules) {
            this.egressRules = egressRules;
            return this;
        }

        /**
         * <p>The list of inbound rules.</p>
         */
        public Builder ingressRules(java.util.List<IngressRules> ingressRules) {
            this.ingressRules = ingressRules;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>07F272E2-6AD5-433A-8207-A607C76F1676</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateTrafficMirrorFilterRulesResponseBody build() {
            return new CreateTrafficMirrorFilterRulesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CreateTrafficMirrorFilterRulesResponseBody} extends {@link TeaModel}
     *
     * <p>CreateTrafficMirrorFilterRulesResponseBody</p>
     */
    public static class EgressRules extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        private EgressRules(Builder builder) {
            this.instanceId = builder.instanceId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EgressRules create() {
            return builder().build();
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        public static final class Builder {
            private String instanceId; 

            /**
             * <p>The ID of the outbound rule.</p>
             * 
             * <strong>example:</strong>
             * <p>tmr-j6cok23ugp53eeib5****</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            public EgressRules build() {
                return new EgressRules(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateTrafficMirrorFilterRulesResponseBody} extends {@link TeaModel}
     *
     * <p>CreateTrafficMirrorFilterRulesResponseBody</p>
     */
    public static class IngressRules extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        private IngressRules(Builder builder) {
            this.instanceId = builder.instanceId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static IngressRules create() {
            return builder().build();
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        public static final class Builder {
            private String instanceId; 

            /**
             * <p>The ID of the inbound rule.</p>
             * 
             * <strong>example:</strong>
             * <p>tmr-j6c6rtallo51ouzv3****</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            public IngressRules build() {
                return new IngressRules(this);
            } 

        } 

    }
}
