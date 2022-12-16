// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteGatewayResponseBody} extends {@link TeaModel}
 *
 * <p>DeleteGatewayResponseBody</p>
 */
public class DeleteGatewayResponseBody extends TeaModel {
    @NameInMap("Code")
    private Integer code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
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
         * The request is processed successfully.
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * Indicates whether the request is successful. Valid values:
         * <p>
         * 
         * - `true`: The request is successful. 
         * - `false`: The request fails.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * The HTTP status code returned.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * The data structure.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The status code returned. A value of 200 indicates that the request is successful. Other values indicate that the request fails.
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
        @NameInMap("GatewayUniqueId")
        private String gatewayUniqueId;

        @NameInMap("GmtCreate")
        private String gmtCreate;

        @NameInMap("GmtModified")
        private String gmtModified;

        @NameInMap("Id")
        private Long id;

        @NameInMap("Name")
        private String name;

        @NameInMap("PrimaryUser")
        private String primaryUser;

        @NameInMap("Region")
        private String region;

        @NameInMap("Replica")
        private Integer replica;

        @NameInMap("SecurityGroup")
        private String securityGroup;

        @NameInMap("Spec")
        private String spec;

        @NameInMap("Status")
        private Integer status;

        @NameInMap("Vpc")
        private String vpc;

        @NameInMap("Vswitch")
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
             * The name of the gateway.
             */
            public Builder gatewayUniqueId(String gatewayUniqueId) {
                this.gatewayUniqueId = gatewayUniqueId;
                return this;
            }

            /**
             * The number of gateway replicas.
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * The time when the gateway was created.
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * The details of the data.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * The ID of the primary key.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The ID of the region.
             */
            public Builder primaryUser(String primaryUser) {
                this.primaryUser = primaryUser;
                return this;
            }

            /**
             * The unique ID of the gateway. It is an identifier automatically generated by the system.
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            /**
             * The instance type of the gateway.
             */
            public Builder replica(Integer replica) {
                this.replica = replica;
                return this;
            }

            /**
             * The ID of the vSwitch.
             */
            public Builder securityGroup(String securityGroup) {
                this.securityGroup = securityGroup;
                return this;
            }

            /**
             * The ID of the security group.
             */
            public Builder spec(String spec) {
                this.spec = spec;
                return this;
            }

            /**
             * The information about the user.
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * The status of the gateway. Valid values:
             * <p>
             * 0: The gateway is being created.
             * 1: The gateway fails to be created.
             * 2: The gateway is running.
             * 3: The gateway is changing.
             * 4: The gateway is scaling down.
             * 6: The gateway is scaling up.
             * 8: The gateway is being deleted.
             * 10: The gateway is restarting.
             * 11: The gateway is being recreated.
             * 12: The gateway is updating.
             * 13: The gateway fails to be updated.
             */
            public Builder vpc(String vpc) {
                this.vpc = vpc;
                return this;
            }

            /**
             * The ID of the virtual private cloud (VPC) where the gateway resides.
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
