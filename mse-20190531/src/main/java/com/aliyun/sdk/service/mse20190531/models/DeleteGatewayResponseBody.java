// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteGatewayResponseBody} extends {@link TeaModel}
 *
 * <p>DeleteGatewayResponseBody</p>
 */
public class DeleteGatewayResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private DeleteGatewayResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteGatewayResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public Integer getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
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
        private Integer code; 
        private Data data; 
        private Integer httpStatusCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        /**
         * The HTTP status code returned. The value 200 indicates that the request was successful. Other values indicate that the request failed.
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * The details of the data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * The HTTP status code returned.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * The returned message.
         * <p>
         * 
         * *   If the request is successful, a success message is returned.
         * *   If the request fails, an error message is returned, such as the "TaskId not found" message.
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
         * Indicates whether the request was successful. Valid values:
         * <p>
         * 
         * *   `true`: The request was successful.
         * *   `false`: The request failed.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public DeleteGatewayResponseBody build() {
            return new DeleteGatewayResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("GatewayUniqueId")
        private String gatewayUniqueId;

        @com.aliyun.core.annotation.NameInMap("GmtCreate")
        private String gmtCreate;

        @com.aliyun.core.annotation.NameInMap("GmtModified")
        private String gmtModified;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("PrimaryUser")
        private String primaryUser;

        @com.aliyun.core.annotation.NameInMap("Region")
        private String region;

        @com.aliyun.core.annotation.NameInMap("Replica")
        private Integer replica;

        @com.aliyun.core.annotation.NameInMap("SecurityGroup")
        private String securityGroup;

        @com.aliyun.core.annotation.NameInMap("Spec")
        private String spec;

        @com.aliyun.core.annotation.NameInMap("Status")
        private Integer status;

        @com.aliyun.core.annotation.NameInMap("Vpc")
        private String vpc;

        @com.aliyun.core.annotation.NameInMap("Vswitch")
        private String vswitch;

        private Data(Builder builder) {
            this.gatewayUniqueId = builder.gatewayUniqueId;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.id = builder.id;
            this.name = builder.name;
            this.primaryUser = builder.primaryUser;
            this.region = builder.region;
            this.replica = builder.replica;
            this.securityGroup = builder.securityGroup;
            this.spec = builder.spec;
            this.status = builder.status;
            this.vpc = builder.vpc;
            this.vswitch = builder.vswitch;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return gatewayUniqueId
         */
        public String getGatewayUniqueId() {
            return this.gatewayUniqueId;
        }

        /**
         * @return gmtCreate
         */
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return gmtModified
         */
        public String getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return primaryUser
         */
        public String getPrimaryUser() {
            return this.primaryUser;
        }

        /**
         * @return region
         */
        public String getRegion() {
            return this.region;
        }

        /**
         * @return replica
         */
        public Integer getReplica() {
            return this.replica;
        }

        /**
         * @return securityGroup
         */
        public String getSecurityGroup() {
            return this.securityGroup;
        }

        /**
         * @return spec
         */
        public String getSpec() {
            return this.spec;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        /**
         * @return vpc
         */
        public String getVpc() {
            return this.vpc;
        }

        /**
         * @return vswitch
         */
        public String getVswitch() {
            return this.vswitch;
        }

        public static final class Builder {
            private String gatewayUniqueId; 
            private String gmtCreate; 
            private String gmtModified; 
            private Long id; 
            private String name; 
            private String primaryUser; 
            private String region; 
            private Integer replica; 
            private String securityGroup; 
            private String spec; 
            private Integer status; 
            private String vpc; 
            private String vswitch; 

            /**
             * The unique ID of the gateway. The ID is automatically generated by the system.
             */
            public Builder gatewayUniqueId(String gatewayUniqueId) {
                this.gatewayUniqueId = gatewayUniqueId;
                return this;
            }

            /**
             * The creation time.
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * The time when the gateway was last updated.
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * The ID of the primary key.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * The name of the gateway.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The information about the user.
             */
            public Builder primaryUser(String primaryUser) {
                this.primaryUser = primaryUser;
                return this;
            }

            /**
             * The ID of the region.
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            /**
             * The number of gateway replicas.
             */
            public Builder replica(Integer replica) {
                this.replica = replica;
                return this;
            }

            /**
             * The ID of the security group.
             */
            public Builder securityGroup(String securityGroup) {
                this.securityGroup = securityGroup;
                return this;
            }

            /**
             * The specifications of the gateway.
             */
            public Builder spec(String spec) {
                this.spec = spec;
                return this;
            }

            /**
             * The status of the gateway. Valid values: 0: The gateway is being created. 1: The gateway fails to be created. 2: The gateway is running. 3: The gateway is changing. 4: The gateway is scaling down. 6: The gateway is scaling up. 8: The gateway is being deleted. 10: The gateway is restarting. 11: The gateway is being rebuilt. 12: The gateway is updating. 13: The gateway fails to be updated.
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * The ID of the virtual private cloud (VPC) where the gateway resides.
             */
            public Builder vpc(String vpc) {
                this.vpc = vpc;
                return this;
            }

            /**
             * The ID of the vSwitch.
             */
            public Builder vswitch(String vswitch) {
                this.vswitch = vswitch;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
