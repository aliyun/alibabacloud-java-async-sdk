// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paielasticdatasetaccelerator20220801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListEndpointsResponseBody} extends {@link TeaModel}
 *
 * <p>ListEndpointsResponseBody</p>
 */
public class ListEndpointsResponseBody extends TeaModel {
    @NameInMap("Endpoints")
    private java.util.List < Endpoints> endpoints;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private ListEndpointsResponseBody(Builder builder) {
        this.endpoints = builder.endpoints;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListEndpointsResponseBody create() {
        return builder().build();
    }

    /**
     * @return endpoints
     */
    public java.util.List < Endpoints> getEndpoints() {
        return this.endpoints;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List < Endpoints> endpoints; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * Endpoints.
         */
        public Builder endpoints(java.util.List < Endpoints> endpoints) {
            this.endpoints = endpoints;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListEndpointsResponseBody build() {
            return new ListEndpointsResponseBody(this);
        } 

    } 

    public static class Endpoints extends TeaModel {
        @NameInMap("GmtCreateTime")
        private String gmtCreateTime;

        @NameInMap("GmtModifiedTime")
        private String gmtModifiedTime;

        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("Name")
        private String name;

        @NameInMap("OwnerId")
        private String ownerId;

        @NameInMap("Status")
        private EndpointStatus status;

        @NameInMap("Type")
        private String type;

        @NameInMap("UserId")
        private String userId;

        @NameInMap("Uuid")
        private String uuid;

        @NameInMap("VpcId")
        private String vpcId;

        @NameInMap("VswitchId")
        private String vswitchId;

        private Endpoints(Builder builder) {
            this.gmtCreateTime = builder.gmtCreateTime;
            this.gmtModifiedTime = builder.gmtModifiedTime;
            this.instanceId = builder.instanceId;
            this.name = builder.name;
            this.ownerId = builder.ownerId;
            this.status = builder.status;
            this.type = builder.type;
            this.userId = builder.userId;
            this.uuid = builder.uuid;
            this.vpcId = builder.vpcId;
            this.vswitchId = builder.vswitchId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Endpoints create() {
            return builder().build();
        }

        /**
         * @return gmtCreateTime
         */
        public String getGmtCreateTime() {
            return this.gmtCreateTime;
        }

        /**
         * @return gmtModifiedTime
         */
        public String getGmtModifiedTime() {
            return this.gmtModifiedTime;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return ownerId
         */
        public String getOwnerId() {
            return this.ownerId;
        }

        /**
         * @return status
         */
        public EndpointStatus getStatus() {
            return this.status;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        /**
         * @return uuid
         */
        public String getUuid() {
            return this.uuid;
        }

        /**
         * @return vpcId
         */
        public String getVpcId() {
            return this.vpcId;
        }

        /**
         * @return vswitchId
         */
        public String getVswitchId() {
            return this.vswitchId;
        }

        public static final class Builder {
            private String gmtCreateTime; 
            private String gmtModifiedTime; 
            private String instanceId; 
            private String name; 
            private String ownerId; 
            private EndpointStatus status; 
            private String type; 
            private String userId; 
            private String uuid; 
            private String vpcId; 
            private String vswitchId; 

            /**
             * GmtCreateTime.
             */
            public Builder gmtCreateTime(String gmtCreateTime) {
                this.gmtCreateTime = gmtCreateTime;
                return this;
            }

            /**
             * GmtModifiedTime.
             */
            public Builder gmtModifiedTime(String gmtModifiedTime) {
                this.gmtModifiedTime = gmtModifiedTime;
                return this;
            }

            /**
             * 所属加速实例的ID。
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * OwnerId.
             */
            public Builder ownerId(String ownerId) {
                this.ownerId = ownerId;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(EndpointStatus status) {
                this.status = status;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * UserId.
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            /**
             * Uuid.
             */
            public Builder uuid(String uuid) {
                this.uuid = uuid;
                return this;
            }

            /**
             * VpcId.
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            /**
             * VswitchId.
             */
            public Builder vswitchId(String vswitchId) {
                this.vswitchId = vswitchId;
                return this;
            }

            public Endpoints build() {
                return new Endpoints(this);
            } 

        } 

    }
}
