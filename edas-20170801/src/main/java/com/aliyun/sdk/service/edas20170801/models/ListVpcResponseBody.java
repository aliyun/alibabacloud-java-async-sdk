// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.edas20170801.models;

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
 * {@link ListVpcResponseBody} extends {@link TeaModel}
 *
 * <p>ListVpcResponseBody</p>
 */
public class ListVpcResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("VpcList")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(ListVpcResponseBody model) {
            this.code = model.code;
            this.message = model.message;
            this.requestId = model.requestId;
            this.vpcList = model.vpcList;
        } 

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The information about VPCs.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The name of the VPC.</p>
         * 
         * <strong>example:</strong>
         * <p>b197-40ab-9155-7ca7</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the VPC is available. Valid values:</p>
         * <ul>
         * <li>true: The VPC is available.</li>
         * <li>false: The VPC is unavailable.</li>
         * </ul>
         */
        public Builder vpcList(VpcList vpcList) {
            this.vpcList = vpcList;
            return this;
        }

        public ListVpcResponseBody build() {
            return new ListVpcResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListVpcResponseBody} extends {@link TeaModel}
     *
     * <p>ListVpcResponseBody</p>
     */
    public static class VpcEntity extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EcsNum")
        private Integer ecsNum;

        @com.aliyun.core.annotation.NameInMap("Expired")
        private Boolean expired;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("UserId")
        private String userId;

        @com.aliyun.core.annotation.NameInMap("VpcId")
        private String vpcId;

        @com.aliyun.core.annotation.NameInMap("VpcName")
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

            private Builder() {
            } 

            private Builder(VpcEntity model) {
                this.ecsNum = model.ecsNum;
                this.expired = model.expired;
                this.regionId = model.regionId;
                this.userId = model.userId;
                this.vpcId = model.vpcId;
                this.vpcName = model.vpcName;
            } 

            /**
             * <p>This operation uses only common request headers. For more information, see <a href="https://help.aliyun.com/document_detail/123488.html">Common parameters for API calls</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder ecsNum(Integer ecsNum) {
                this.ecsNum = ecsNum;
                return this;
            }

            /**
             * <p>The region ID of the VPC.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder expired(Boolean expired) {
                this.expired = expired;
                return this;
            }

            /**
             * <p>No request parameters.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-shenzhen</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>GET /pop/v5/vpc_list HTTP/1.1
             * Common request headers</p>
             * 
             * <strong>example:</strong>
             * <p>edas_****_test@aliyun-****.com</p>
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            /**
             * <p>The ID of the Alibaba Cloud account to which the VPC belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>vpc-wz9pcq3jofczwpujq****</p>
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            /**
             * <p>The number of ECS instances associated with the VPC.</p>
             * 
             * <strong>example:</strong>
             * <p>edas-default-vpc4</p>
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
    /**
     * 
     * {@link ListVpcResponseBody} extends {@link TeaModel}
     *
     * <p>ListVpcResponseBody</p>
     */
    public static class VpcList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("VpcEntity")
        private java.util.List<VpcEntity> vpcEntity;

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
        public java.util.List<VpcEntity> getVpcEntity() {
            return this.vpcEntity;
        }

        public static final class Builder {
            private java.util.List<VpcEntity> vpcEntity; 

            private Builder() {
            } 

            private Builder(VpcList model) {
                this.vpcEntity = model.vpcEntity;
            } 

            /**
             * VpcEntity.
             */
            public Builder vpcEntity(java.util.List<VpcEntity> vpcEntity) {
                this.vpcEntity = vpcEntity;
                return this;
            }

            public VpcList build() {
                return new VpcList(this);
            } 

        } 

    }
}
