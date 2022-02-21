// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cddc20200320.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeHostSecurityGroupAttributeResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeHostSecurityGroupAttributeResponseBody</p>
 */
public class DescribeHostSecurityGroupAttributeResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("SecGroupPermission")
    private SecGroupPermission secGroupPermission;

    @NameInMap("Success")
    private Integer success;

    private DescribeHostSecurityGroupAttributeResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.secGroupPermission = builder.secGroupPermission;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeHostSecurityGroupAttributeResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return secGroupPermission
     */
    public SecGroupPermission getSecGroupPermission() {
        return this.secGroupPermission;
    }

    /**
     * @return success
     */
    public Integer getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String requestId; 
        private SecGroupPermission secGroupPermission; 
        private Integer success; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * SecGroupPermission.
         */
        public Builder secGroupPermission(SecGroupPermission secGroupPermission) {
            this.secGroupPermission = secGroupPermission;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Integer success) {
            this.success = success;
            return this;
        }

        public DescribeHostSecurityGroupAttributeResponseBody build() {
            return new DescribeHostSecurityGroupAttributeResponseBody(this);
        } 

    } 

    public static class SecGroupPermissionSecGroupPermission extends TeaModel {
        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("Description")
        private String description;

        @NameInMap("Direction")
        private String direction;

        @NameInMap("IpProtocol")
        private String ipProtocol;

        @NameInMap("NicType")
        private String nicType;

        @NameInMap("Policy")
        private String policy;

        @NameInMap("PortRange")
        private String portRange;

        @NameInMap("SourceCidrIp")
        private String sourceCidrIp;

        private SecGroupPermissionSecGroupPermission(Builder builder) {
            this.createTime = builder.createTime;
            this.description = builder.description;
            this.direction = builder.direction;
            this.ipProtocol = builder.ipProtocol;
            this.nicType = builder.nicType;
            this.policy = builder.policy;
            this.portRange = builder.portRange;
            this.sourceCidrIp = builder.sourceCidrIp;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SecGroupPermissionSecGroupPermission create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return direction
         */
        public String getDirection() {
            return this.direction;
        }

        /**
         * @return ipProtocol
         */
        public String getIpProtocol() {
            return this.ipProtocol;
        }

        /**
         * @return nicType
         */
        public String getNicType() {
            return this.nicType;
        }

        /**
         * @return policy
         */
        public String getPolicy() {
            return this.policy;
        }

        /**
         * @return portRange
         */
        public String getPortRange() {
            return this.portRange;
        }

        /**
         * @return sourceCidrIp
         */
        public String getSourceCidrIp() {
            return this.sourceCidrIp;
        }

        public static final class Builder {
            private String createTime; 
            private String description; 
            private String direction; 
            private String ipProtocol; 
            private String nicType; 
            private String policy; 
            private String portRange; 
            private String sourceCidrIp; 

            /**
             * CreateTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * Direction.
             */
            public Builder direction(String direction) {
                this.direction = direction;
                return this;
            }

            /**
             * IpProtocol.
             */
            public Builder ipProtocol(String ipProtocol) {
                this.ipProtocol = ipProtocol;
                return this;
            }

            /**
             * NicType.
             */
            public Builder nicType(String nicType) {
                this.nicType = nicType;
                return this;
            }

            /**
             * Policy.
             */
            public Builder policy(String policy) {
                this.policy = policy;
                return this;
            }

            /**
             * PortRange.
             */
            public Builder portRange(String portRange) {
                this.portRange = portRange;
                return this;
            }

            /**
             * SourceCidrIp.
             */
            public Builder sourceCidrIp(String sourceCidrIp) {
                this.sourceCidrIp = sourceCidrIp;
                return this;
            }

            public SecGroupPermissionSecGroupPermission build() {
                return new SecGroupPermissionSecGroupPermission(this);
            } 

        } 

    }
    public static class SecGroupPermission extends TeaModel {
        @NameInMap("SecGroupPermission")
        private java.util.List < SecGroupPermissionSecGroupPermission> secGroupPermission;

        private SecGroupPermission(Builder builder) {
            this.secGroupPermission = builder.secGroupPermission;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SecGroupPermission create() {
            return builder().build();
        }

        /**
         * @return secGroupPermission
         */
        public java.util.List < SecGroupPermissionSecGroupPermission> getSecGroupPermission() {
            return this.secGroupPermission;
        }

        public static final class Builder {
            private java.util.List < SecGroupPermissionSecGroupPermission> secGroupPermission; 

            /**
             * SecGroupPermission.
             */
            public Builder secGroupPermission(java.util.List < SecGroupPermissionSecGroupPermission> secGroupPermission) {
                this.secGroupPermission = secGroupPermission;
                return this;
            }

            public SecGroupPermission build() {
                return new SecGroupPermission(this);
            } 

        } 

    }
}
