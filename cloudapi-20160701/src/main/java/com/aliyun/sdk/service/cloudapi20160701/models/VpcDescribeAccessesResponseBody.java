// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160701.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link VpcDescribeAccessesResponseBody} extends {@link TeaModel}
 *
 * <p>VpcDescribeAccessesResponseBody</p>
 */
public class VpcDescribeAccessesResponseBody extends TeaModel {
    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Integer totalCount;

    @NameInMap("VpcAccessAttributes")
    private VpcAccessAttributes vpcAccessAttributes;

    private VpcDescribeAccessesResponseBody(Builder builder) {
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
        this.vpcAccessAttributes = builder.vpcAccessAttributes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static VpcDescribeAccessesResponseBody create() {
        return builder().build();
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
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

    /**
     * @return vpcAccessAttributes
     */
    public VpcAccessAttributes getVpcAccessAttributes() {
        return this.vpcAccessAttributes;
    }

    public static final class Builder {
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 
        private VpcAccessAttributes vpcAccessAttributes; 

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
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

        /**
         * VpcAccessAttributes.
         */
        public Builder vpcAccessAttributes(VpcAccessAttributes vpcAccessAttributes) {
            this.vpcAccessAttributes = vpcAccessAttributes;
            return this;
        }

        public VpcDescribeAccessesResponseBody build() {
            return new VpcDescribeAccessesResponseBody(this);
        } 

    } 

    public static class VpcAccessAttribute extends TeaModel {
        @NameInMap("CreatedTime")
        private String createdTime;

        @NameInMap("Id")
        private String id;

        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("ModifiedTime")
        private String modifiedTime;

        @NameInMap("Name")
        private String name;

        @NameInMap("Port")
        private String port;

        @NameInMap("RegionId")
        private String regionId;

        @NameInMap("Status")
        private String status;

        @NameInMap("UserId")
        private String userId;

        @NameInMap("VpcId")
        private String vpcId;

        private VpcAccessAttribute(Builder builder) {
            this.createdTime = builder.createdTime;
            this.id = builder.id;
            this.instanceId = builder.instanceId;
            this.modifiedTime = builder.modifiedTime;
            this.name = builder.name;
            this.port = builder.port;
            this.regionId = builder.regionId;
            this.status = builder.status;
            this.userId = builder.userId;
            this.vpcId = builder.vpcId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VpcAccessAttribute create() {
            return builder().build();
        }

        /**
         * @return createdTime
         */
        public String getCreatedTime() {
            return this.createdTime;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return modifiedTime
         */
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return port
         */
        public String getPort() {
            return this.port;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
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

        public static final class Builder {
            private String createdTime; 
            private String id; 
            private String instanceId; 
            private String modifiedTime; 
            private String name; 
            private String port; 
            private String regionId; 
            private String status; 
            private String userId; 
            private String vpcId; 

            /**
             * CreatedTime.
             */
            public Builder createdTime(String createdTime) {
                this.createdTime = createdTime;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * InstanceId.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * ModifiedTime.
             */
            public Builder modifiedTime(String modifiedTime) {
                this.modifiedTime = modifiedTime;
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
             * Port.
             */
            public Builder port(String port) {
                this.port = port;
                return this;
            }

            /**
             * RegionId.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
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
             * VpcId.
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            public VpcAccessAttribute build() {
                return new VpcAccessAttribute(this);
            } 

        } 

    }
    public static class VpcAccessAttributes extends TeaModel {
        @NameInMap("VpcAccessAttribute")
        private java.util.List < VpcAccessAttribute> vpcAccessAttribute;

        private VpcAccessAttributes(Builder builder) {
            this.vpcAccessAttribute = builder.vpcAccessAttribute;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VpcAccessAttributes create() {
            return builder().build();
        }

        /**
         * @return vpcAccessAttribute
         */
        public java.util.List < VpcAccessAttribute> getVpcAccessAttribute() {
            return this.vpcAccessAttribute;
        }

        public static final class Builder {
            private java.util.List < VpcAccessAttribute> vpcAccessAttribute; 

            /**
             * VpcAccessAttribute.
             */
            public Builder vpcAccessAttribute(java.util.List < VpcAccessAttribute> vpcAccessAttribute) {
                this.vpcAccessAttribute = vpcAccessAttribute;
                return this;
            }

            public VpcAccessAttributes build() {
                return new VpcAccessAttributes(this);
            } 

        } 

    }
}
