// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paielasticdatasetaccelerator20220801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeEndpointResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeEndpointResponseBody</p>
 */
public class DescribeEndpointResponseBody extends TeaModel {
    @NameInMap("GmtCreateTime")
    private String gmtCreateTime;

    @NameInMap("GmtModifiedTime")
    private String gmtModifiedTime;

    @NameInMap("Name")
    private String name;

    @NameInMap("OwnerId")
    private String ownerId;

    @NameInMap("RequestId")
    private String requestId;

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

    private DescribeEndpointResponseBody(Builder builder) {
        this.gmtCreateTime = builder.gmtCreateTime;
        this.gmtModifiedTime = builder.gmtModifiedTime;
        this.name = builder.name;
        this.ownerId = builder.ownerId;
        this.requestId = builder.requestId;
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

    public static DescribeEndpointResponseBody create() {
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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
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
        private String name; 
        private String ownerId; 
        private String requestId; 
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
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
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

        public DescribeEndpointResponseBody build() {
            return new DescribeEndpointResponseBody(this);
        } 

    } 

}
