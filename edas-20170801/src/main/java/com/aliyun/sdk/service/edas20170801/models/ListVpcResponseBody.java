// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.edas20170801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListVpcResponseBody} extends {@link TeaModel}
 *
 * <p>ListVpcResponseBody</p>
 */
public class ListVpcResponseBody extends TeaModel {
    @NameInMap("Code")
    private Integer code;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("VpcList")
    private VpcList vpcList;

    private ListVpcResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.vpcList = builder.vpcList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListVpcResponseBody create() {
        return builder().build();
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
     * @return vpcList
     */
    public VpcList getVpcList() {
        return this.vpcList;
    }

    public static final class Builder {
        private Integer code; 
        private String message; 
        private String requestId; 
        private VpcList vpcList; 

        /**
         * The ID of the request.
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * The information about VPCs.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * The name of the VPC.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Indicates whether the VPC is available. Valid values:
         * <p>
         * - true: The VPC is available.
         * - false: The VPC is unavailable.
         */
        public Builder vpcList(VpcList vpcList) {
            this.vpcList = vpcList;
            return this;
        }

        public ListVpcResponseBody build() {
            return new ListVpcResponseBody(this);
        } 

    } 

    public static class VpcEntity extends TeaModel {
        @NameInMap("EcsNum")
        private Integer ecsNum;

        @NameInMap("Expired")
        private Boolean expired;

        @NameInMap("RegionId")
        private String regionId;

        @NameInMap("UserId")
        private String userId;

        @NameInMap("VpcId")
        private String vpcId;

        @NameInMap("VpcName")
        private String vpcName;

        private VpcEntity(Builder builder) {
            this.ecsNum = builder.ecsNum;
            this.expired = builder.expired;
            this.regionId = builder.regionId;
            this.userId = builder.userId;
            this.vpcId = builder.vpcId;
            this.vpcName = builder.vpcName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VpcEntity create() {
            return builder().build();
        }

        /**
         * @return ecsNum
         */
        public Integer getEcsNum() {
            return this.ecsNum;
        }

        /**
         * @return expired
         */
        public Boolean getExpired() {
            return this.expired;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        /**
         * @return vpcId
         */
        public String getVpcId() {
            return this.vpcId;
        }

        /**
         * @return vpcName
         */
        public String getVpcName() {
            return this.vpcName;
        }

        public static final class Builder {
            private Integer ecsNum; 
            private Boolean expired; 
            private String regionId; 
            private String userId; 
            private String vpcId; 
            private String vpcName; 

            /**
             * This operation uses only common request headers. For more information, see [Common parameters for API calls](~~123488~~).
             */
            public Builder ecsNum(Integer ecsNum) {
                this.ecsNum = ecsNum;
                return this;
            }

            /**
             * The region ID of the VPC.
             */
            public Builder expired(Boolean expired) {
                this.expired = expired;
                return this;
            }

            /**
             * No request parameters.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * GET /pop/v5/vpc_list HTTP/1.1
             * <p>
             * Common request headers
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            /**
             * The ID of the Alibaba Cloud account to which the VPC belongs.
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            /**
             * The number of ECS instances associated with the VPC.
             */
            public Builder vpcName(String vpcName) {
                this.vpcName = vpcName;
                return this;
            }

            public VpcEntity build() {
                return new VpcEntity(this);
            } 

        } 

    }
    public static class VpcList extends TeaModel {
        @NameInMap("VpcEntity")
        private java.util.List < VpcEntity> vpcEntity;

        private VpcList(Builder builder) {
            this.vpcEntity = builder.vpcEntity;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VpcList create() {
            return builder().build();
        }

        /**
         * @return vpcEntity
         */
        public java.util.List < VpcEntity> getVpcEntity() {
            return this.vpcEntity;
        }

        public static final class Builder {
            private java.util.List < VpcEntity> vpcEntity; 

            /**
             * VpcEntity.
             */
            public Builder vpcEntity(java.util.List < VpcEntity> vpcEntity) {
                this.vpcEntity = vpcEntity;
                return this;
            }

            public VpcList build() {
                return new VpcList(this);
            } 

        } 

    }
}
