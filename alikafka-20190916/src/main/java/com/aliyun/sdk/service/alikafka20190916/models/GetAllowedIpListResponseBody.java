// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alikafka20190916.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetAllowedIpListResponseBody} extends {@link TeaModel}
 *
 * <p>GetAllowedIpListResponseBody</p>
 */
public class GetAllowedIpListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AllowedList")
    private AllowedList allowedList;

    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
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
         * <p>The IP address whitelist.</p>
         */
        public Builder allowedList(AllowedList allowedList) {
            this.allowedList = allowedList;
            return this;
        }

        /**
         * <p>The HTTP status code returned. The HTTP status code 200 indicates that the request is successful.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The message returned.</p>
         * 
         * <strong>example:</strong>
         * <p>operation success.</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>A421CCD7-5BC5-4B32-8DD8-64668A8FCB56</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request is successful.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetAllowedIpListResponseBody build() {
            return new GetAllowedIpListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetAllowedIpListResponseBody} extends {@link TeaModel}
     *
     * <p>GetAllowedIpListResponseBody</p>
     */
    public static class InternetList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AllowedIpGroup")
        private java.util.Map < String, String > allowedIpGroup;

        @com.aliyun.core.annotation.NameInMap("AllowedIpList")
        private java.util.List < String > allowedIpList;

        @com.aliyun.core.annotation.NameInMap("PortRange")
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
             * <p>The group to which the IP address whitelist belongs.</p>
             */
            public Builder allowedIpGroup(java.util.Map < String, String > allowedIpGroup) {
                this.allowedIpGroup = allowedIpGroup;
                return this;
            }

            /**
             * <p>The information about the IP address whitelist.</p>
             */
            public Builder allowedIpList(java.util.List < String > allowedIpList) {
                this.allowedIpList = allowedIpList;
                return this;
            }

            /**
             * <p>The port range. Valid value:</p>
             * <p><strong>9093/9093</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>9093/9093</p>
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
    /**
     * 
     * {@link GetAllowedIpListResponseBody} extends {@link TeaModel}
     *
     * <p>GetAllowedIpListResponseBody</p>
     */
    public static class VpcList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AllowedIpGroup")
        private java.util.Map < String, String > allowedIpGroup;

        @com.aliyun.core.annotation.NameInMap("AllowedIpList")
        private java.util.List < String > allowedIpList;

        @com.aliyun.core.annotation.NameInMap("PortRange")
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
             * <p>The group to which the IP address whitelist belongs.</p>
             */
            public Builder allowedIpGroup(java.util.Map < String, String > allowedIpGroup) {
                this.allowedIpGroup = allowedIpGroup;
                return this;
            }

            /**
             * <p>The information about the IP address whitelist.</p>
             */
            public Builder allowedIpList(java.util.List < String > allowedIpList) {
                this.allowedIpList = allowedIpList;
                return this;
            }

            /**
             * <p>The port range. Valid value:</p>
             * <p><strong>9092/9092</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>9092/9092</p>
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
    /**
     * 
     * {@link GetAllowedIpListResponseBody} extends {@link TeaModel}
     *
     * <p>GetAllowedIpListResponseBody</p>
     */
    public static class AllowedList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DeployType")
        private Integer deployType;

        @com.aliyun.core.annotation.NameInMap("InternetList")
        private java.util.List < InternetList> internetList;

        @com.aliyun.core.annotation.NameInMap("VpcList")
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
             * <p>The deployment mode of the instance. Valid values:</p>
             * <ul>
             * <li><strong>4</strong>: allows access from the Internet and a virtual private cloud (VPC).</li>
             * <li><strong>5</strong>: allows access from a VPC.</li>
             * </ul>
             * <blockquote>
             * <p> Only integrators need to concern themselves with the value of this parameter.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>4</p>
             */
            public Builder deployType(Integer deployType) {
                this.deployType = deployType;
                return this;
            }

            /**
             * <p>The whitelist for access from the Internet.</p>
             */
            public Builder internetList(java.util.List < InternetList> internetList) {
                this.internetList = internetList;
                return this;
            }

            /**
             * <p>The whitelist for access from a virtual private cloud (VPC).</p>
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
