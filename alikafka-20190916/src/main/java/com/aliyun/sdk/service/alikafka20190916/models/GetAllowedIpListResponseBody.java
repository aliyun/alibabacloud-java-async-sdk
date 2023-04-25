// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alikafka20190916.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetAllowedIpListResponseBody} extends {@link TeaModel}
 *
 * <p>GetAllowedIpListResponseBody</p>
 */
public class GetAllowedIpListResponseBody extends TeaModel {
    @NameInMap("AllowedList")
    private AllowedList allowedList;

    @NameInMap("Code")
    private Integer code;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private GetAllowedIpListResponseBody(Builder builder) {
        this.allowedList = builder.allowedList;
        this.code = builder.code;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAllowedIpListResponseBody create() {
        return builder().build();
    }

    /**
     * @return allowedList
     */
    public AllowedList getAllowedList() {
        return this.allowedList;
    }

    /**
     * @return code
     */
    public Integer getCode() {
        return this.code;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private AllowedList allowedList; 
        private Integer code; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        /**
         * The IP address whitelist of the instance.
         */
        public Builder allowedList(AllowedList allowedList) {
            this.allowedList = allowedList;
            return this;
        }

        /**
         * The HTTP status code returned. The HTTP status code 200 indicates that the request is successful.
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * The message returned.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Indicates whether the request is successful.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetAllowedIpListResponseBody build() {
            return new GetAllowedIpListResponseBody(this);
        } 

    } 

    public static class InternetList extends TeaModel {
        @NameInMap("AllowedIpGroup")
        private java.util.Map < String, String > allowedIpGroup;

        @NameInMap("AllowedIpList")
        private java.util.List < String > allowedIpList;

        @NameInMap("PortRange")
        private String portRange;

        private InternetList(Builder builder) {
            this.allowedIpGroup = builder.allowedIpGroup;
            this.allowedIpList = builder.allowedIpList;
            this.portRange = builder.portRange;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InternetList create() {
            return builder().build();
        }

        /**
         * @return allowedIpGroup
         */
        public java.util.Map < String, String > getAllowedIpGroup() {
            return this.allowedIpGroup;
        }

        /**
         * @return allowedIpList
         */
        public java.util.List < String > getAllowedIpList() {
            return this.allowedIpList;
        }

        /**
         * @return portRange
         */
        public String getPortRange() {
            return this.portRange;
        }

        public static final class Builder {
            private java.util.Map < String, String > allowedIpGroup; 
            private java.util.List < String > allowedIpList; 
            private String portRange; 

            /**
             * The IP address whitelist group.
             */
            public Builder allowedIpGroup(java.util.Map < String, String > allowedIpGroup) {
                this.allowedIpGroup = allowedIpGroup;
                return this;
            }

            /**
             * AllowedIpList.
             */
            public Builder allowedIpList(java.util.List < String > allowedIpList) {
                this.allowedIpList = allowedIpList;
                return this;
            }

            /**
             * The port range. Valid values:
             * <p>
             * 
             * **9093/9093**.
             */
            public Builder portRange(String portRange) {
                this.portRange = portRange;
                return this;
            }

            public InternetList build() {
                return new InternetList(this);
            } 

        } 

    }
    public static class VpcList extends TeaModel {
        @NameInMap("AllowedIpGroup")
        private java.util.Map < String, String > allowedIpGroup;

        @NameInMap("AllowedIpList")
        private java.util.List < String > allowedIpList;

        @NameInMap("PortRange")
        private String portRange;

        private VpcList(Builder builder) {
            this.allowedIpGroup = builder.allowedIpGroup;
            this.allowedIpList = builder.allowedIpList;
            this.portRange = builder.portRange;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VpcList create() {
            return builder().build();
        }

        /**
         * @return allowedIpGroup
         */
        public java.util.Map < String, String > getAllowedIpGroup() {
            return this.allowedIpGroup;
        }

        /**
         * @return allowedIpList
         */
        public java.util.List < String > getAllowedIpList() {
            return this.allowedIpList;
        }

        /**
         * @return portRange
         */
        public String getPortRange() {
            return this.portRange;
        }

        public static final class Builder {
            private java.util.Map < String, String > allowedIpGroup; 
            private java.util.List < String > allowedIpList; 
            private String portRange; 

            /**
             * The IP address whitelist group.
             */
            public Builder allowedIpGroup(java.util.Map < String, String > allowedIpGroup) {
                this.allowedIpGroup = allowedIpGroup;
                return this;
            }

            /**
             * AllowedIpList.
             */
            public Builder allowedIpList(java.util.List < String > allowedIpList) {
                this.allowedIpList = allowedIpList;
                return this;
            }

            /**
             * The port range. Valid values:
             * <p>
             * 
             * **9092/9092**.
             */
            public Builder portRange(String portRange) {
                this.portRange = portRange;
                return this;
            }

            public VpcList build() {
                return new VpcList(this);
            } 

        } 

    }
    public static class AllowedList extends TeaModel {
        @NameInMap("DeployType")
        private Integer deployType;

        @NameInMap("InternetList")
        private java.util.List < InternetList> internetList;

        @NameInMap("VpcList")
        private java.util.List < VpcList> vpcList;

        private AllowedList(Builder builder) {
            this.deployType = builder.deployType;
            this.internetList = builder.internetList;
            this.vpcList = builder.vpcList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AllowedList create() {
            return builder().build();
        }

        /**
         * @return deployType
         */
        public Integer getDeployType() {
            return this.deployType;
        }

        /**
         * @return internetList
         */
        public java.util.List < InternetList> getInternetList() {
            return this.internetList;
        }

        /**
         * @return vpcList
         */
        public java.util.List < VpcList> getVpcList() {
            return this.vpcList;
        }

        public static final class Builder {
            private Integer deployType; 
            private java.util.List < InternetList> internetList; 
            private java.util.List < VpcList> vpcList; 

            /**
             * The deployment mode of the instance. Valid values:
             * <p>
             * 
             * *   **4**: allows access from the Internet and a virtual private cloud (VPC).
             * *   **5**: allows access from a VPC.
             * 
             * >  Only integrators need to concern themselves with the value of this parameter.
             */
            public Builder deployType(Integer deployType) {
                this.deployType = deployType;
                return this;
            }

            /**
             * The whitelist for access from the Internet.
             */
            public Builder internetList(java.util.List < InternetList> internetList) {
                this.internetList = internetList;
                return this;
            }

            /**
             * The whitelist for access from a VPC.
             */
            public Builder vpcList(java.util.List < VpcList> vpcList) {
                this.vpcList = vpcList;
                return this;
            }

            public AllowedList build() {
                return new AllowedList(this);
            } 

        } 

    }
}
