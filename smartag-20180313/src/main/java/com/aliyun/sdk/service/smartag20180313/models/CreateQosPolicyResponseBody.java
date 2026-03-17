// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.smartag20180313.models;

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
 * {@link CreateQosPolicyResponseBody} extends {@link TeaModel}
 *
 * <p>CreateQosPolicyResponseBody</p>
 */
public class CreateQosPolicyResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("DestCidr")
    private String destCidr;

    @com.aliyun.core.annotation.NameInMap("DestPortRange")
    private String destPortRange;

    @com.aliyun.core.annotation.NameInMap("DpiGroupIds")
    private DpiGroupIds dpiGroupIds;

    @com.aliyun.core.annotation.NameInMap("DpiSignatureIds")
    private DpiSignatureIds dpiSignatureIds;

    @com.aliyun.core.annotation.NameInMap("EndTime")
    private String endTime;

    @com.aliyun.core.annotation.NameInMap("IpProtocol")
    private String ipProtocol;

    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("Priority")
    private Integer priority;

    @com.aliyun.core.annotation.NameInMap("QosId")
    private String qosId;

    @com.aliyun.core.annotation.NameInMap("QosPolicyId")
    private String qosPolicyId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SourceCidr")
    private String sourceCidr;

    @com.aliyun.core.annotation.NameInMap("SourcePortRange")
    private String sourcePortRange;

    @com.aliyun.core.annotation.NameInMap("StartTime")
    private String startTime;

    private CreateQosPolicyResponseBody(Builder builder) {
        this.description = builder.description;
        this.destCidr = builder.destCidr;
        this.destPortRange = builder.destPortRange;
        this.dpiGroupIds = builder.dpiGroupIds;
        this.dpiSignatureIds = builder.dpiSignatureIds;
        this.endTime = builder.endTime;
        this.ipProtocol = builder.ipProtocol;
        this.name = builder.name;
        this.priority = builder.priority;
        this.qosId = builder.qosId;
        this.qosPolicyId = builder.qosPolicyId;
        this.requestId = builder.requestId;
        this.sourceCidr = builder.sourceCidr;
        this.sourcePortRange = builder.sourcePortRange;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateQosPolicyResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return destCidr
     */
    public String getDestCidr() {
        return this.destCidr;
    }

    /**
     * @return destPortRange
     */
    public String getDestPortRange() {
        return this.destPortRange;
    }

    /**
     * @return dpiGroupIds
     */
    public DpiGroupIds getDpiGroupIds() {
        return this.dpiGroupIds;
    }

    /**
     * @return dpiSignatureIds
     */
    public DpiSignatureIds getDpiSignatureIds() {
        return this.dpiSignatureIds;
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return ipProtocol
     */
    public String getIpProtocol() {
        return this.ipProtocol;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return priority
     */
    public Integer getPriority() {
        return this.priority;
    }

    /**
     * @return qosId
     */
    public String getQosId() {
        return this.qosId;
    }

    /**
     * @return qosPolicyId
     */
    public String getQosPolicyId() {
        return this.qosPolicyId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return sourceCidr
     */
    public String getSourceCidr() {
        return this.sourceCidr;
    }

    /**
     * @return sourcePortRange
     */
    public String getSourcePortRange() {
        return this.sourcePortRange;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    public static final class Builder {
        private String description; 
        private String destCidr; 
        private String destPortRange; 
        private DpiGroupIds dpiGroupIds; 
        private DpiSignatureIds dpiSignatureIds; 
        private String endTime; 
        private String ipProtocol; 
        private String name; 
        private Integer priority; 
        private String qosId; 
        private String qosPolicyId; 
        private String requestId; 
        private String sourceCidr; 
        private String sourcePortRange; 
        private String startTime; 

        private Builder() {
        } 

        private Builder(CreateQosPolicyResponseBody model) {
            this.description = model.description;
            this.destCidr = model.destCidr;
            this.destPortRange = model.destPortRange;
            this.dpiGroupIds = model.dpiGroupIds;
            this.dpiSignatureIds = model.dpiSignatureIds;
            this.endTime = model.endTime;
            this.ipProtocol = model.ipProtocol;
            this.name = model.name;
            this.priority = model.priority;
            this.qosId = model.qosId;
            this.qosPolicyId = model.qosPolicyId;
            this.requestId = model.requestId;
            this.sourceCidr = model.sourceCidr;
            this.sourcePortRange = model.sourcePortRange;
            this.startTime = model.startTime;
        } 

        /**
         * <p>The description of the traffic classification rule.</p>
         * 
         * <strong>example:</strong>
         * <p>desctest</p>
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * <p>The destination CIDR block.</p>
         * 
         * <strong>example:</strong>
         * <p>10.10.10.0/24</p>
         */
        public Builder destCidr(String destCidr) {
            this.destCidr = destCidr;
            return this;
        }

        /**
         * <p>The destination port range.</p>
         * 
         * <strong>example:</strong>
         * <p>80/80</p>
         */
        public Builder destPortRange(String destPortRange) {
            this.destPortRange = destPortRange;
            return this;
        }

        /**
         * <p>The ID of the application group.</p>
         */
        public Builder dpiGroupIds(DpiGroupIds dpiGroupIds) {
            this.dpiGroupIds = dpiGroupIds;
            return this;
        }

        /**
         * <p>The IDs of applications.</p>
         */
        public Builder dpiSignatureIds(DpiSignatureIds dpiSignatureIds) {
            this.dpiSignatureIds = dpiSignatureIds;
            return this;
        }

        /**
         * <p>The time when the traffic classification rule expires.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-09-14T16:41:33+0800</p>
         */
        public Builder endTime(String endTime) {
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>The protocol that applies to the traffic classification rule.</p>
         * 
         * <strong>example:</strong>
         * <p>TCP</p>
         */
        public Builder ipProtocol(String ipProtocol) {
            this.ipProtocol = ipProtocol;
            return this;
        }

        /**
         * <p>The name of the traffic classification rule.</p>
         * 
         * <strong>example:</strong>
         * <p>nametest</p>
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * <p>The priority of the traffic throttling policy to which the traffic classification rule belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        public Builder priority(Integer priority) {
            this.priority = priority;
            return this;
        }

        /**
         * <p>The ID of the QoS policy.</p>
         * 
         * <strong>example:</strong>
         * <p>qos-xitd8690ucu8ro****</p>
         */
        public Builder qosId(String qosId) {
            this.qosId = qosId;
            return this;
        }

        /**
         * <p>The ID of the traffic classification rule.</p>
         * 
         * <strong>example:</strong>
         * <p>qospy-xhwhyuo43l********</p>
         */
        public Builder qosPolicyId(String qosPolicyId) {
            this.qosPolicyId = qosPolicyId;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>97862812-2C7E-4D25-B0D5-B26DAC7FA293</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The source CIDR block.</p>
         * 
         * <strong>example:</strong>
         * <p>10.10.10.0/24</p>
         */
        public Builder sourceCidr(String sourceCidr) {
            this.sourceCidr = sourceCidr;
            return this;
        }

        /**
         * <p>The source port range.</p>
         * 
         * <strong>example:</strong>
         * <p>80/80</p>
         */
        public Builder sourcePortRange(String sourcePortRange) {
            this.sourcePortRange = sourcePortRange;
            return this;
        }

        /**
         * <p>The time when the traffic classification rule takes effect.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-07-14T16:41:33+0800</p>
         */
        public Builder startTime(String startTime) {
            this.startTime = startTime;
            return this;
        }

        public CreateQosPolicyResponseBody build() {
            return new CreateQosPolicyResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CreateQosPolicyResponseBody} extends {@link TeaModel}
     *
     * <p>CreateQosPolicyResponseBody</p>
     */
    public static class DpiGroupIds extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DpiGroupId")
        private java.util.List<String> dpiGroupId;

        private DpiGroupIds(Builder builder) {
            this.dpiGroupId = builder.dpiGroupId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DpiGroupIds create() {
            return builder().build();
        }

        /**
         * @return dpiGroupId
         */
        public java.util.List<String> getDpiGroupId() {
            return this.dpiGroupId;
        }

        public static final class Builder {
            private java.util.List<String> dpiGroupId; 

            private Builder() {
            } 

            private Builder(DpiGroupIds model) {
                this.dpiGroupId = model.dpiGroupId;
            } 

            /**
             * DpiGroupId.
             */
            public Builder dpiGroupId(java.util.List<String> dpiGroupId) {
                this.dpiGroupId = dpiGroupId;
                return this;
            }

            public DpiGroupIds build() {
                return new DpiGroupIds(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateQosPolicyResponseBody} extends {@link TeaModel}
     *
     * <p>CreateQosPolicyResponseBody</p>
     */
    public static class DpiSignatureIds extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DpiSignatureId")
        private java.util.List<String> dpiSignatureId;

        private DpiSignatureIds(Builder builder) {
            this.dpiSignatureId = builder.dpiSignatureId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DpiSignatureIds create() {
            return builder().build();
        }

        /**
         * @return dpiSignatureId
         */
        public java.util.List<String> getDpiSignatureId() {
            return this.dpiSignatureId;
        }

        public static final class Builder {
            private java.util.List<String> dpiSignatureId; 

            private Builder() {
            } 

            private Builder(DpiSignatureIds model) {
                this.dpiSignatureId = model.dpiSignatureId;
            } 

            /**
             * DpiSignatureId.
             */
            public Builder dpiSignatureId(java.util.List<String> dpiSignatureId) {
                this.dpiSignatureId = dpiSignatureId;
                return this;
            }

            public DpiSignatureIds build() {
                return new DpiSignatureIds(this);
            } 

        } 

    }
}
