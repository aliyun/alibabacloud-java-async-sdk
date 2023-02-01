// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeVpcAccessesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeVpcAccessesResponseBody</p>
 */
public class DescribeVpcAccessesResponseBody extends TeaModel {
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

    private DescribeVpcAccessesResponseBody(Builder builder) {
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
        this.vpcAccessAttributes = builder.vpcAccessAttributes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeVpcAccessesResponseBody create() {
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
         * The page number of the returned page.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries returned per page.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
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
         * The total number of returned entries.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * The information about the VPC authorization. The information is an array consisting of VpcAccessAttribute data.
         */
        public Builder vpcAccessAttributes(VpcAccessAttributes vpcAccessAttributes) {
            this.vpcAccessAttributes = vpcAccessAttributes;
            return this;
        }

        public DescribeVpcAccessesResponseBody build() {
            return new DescribeVpcAccessesResponseBody(this);
        } 

    } 

    public static class VpcAccessAttribute extends TeaModel {
        @NameInMap("CreatedTime")
        private String createdTime;

        @NameInMap("Description")
        private String description;

        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("Name")
        private String name;

        @NameInMap("Port")
        private Integer port;

        @NameInMap("RegionId")
        private String regionId;

        @NameInMap("VpcAccessId")
        private String vpcAccessId;

        @NameInMap("VpcId")
        private String vpcId;

        @NameInMap("VpcTargetHostName")
        private String vpcTargetHostName;

        private VpcAccessAttribute(Builder builder) {
            this.createdTime = builder.createdTime;
            this.description = builder.description;
            this.instanceId = builder.instanceId;
            this.name = builder.name;
            this.port = builder.port;
            this.regionId = builder.regionId;
            this.vpcAccessId = builder.vpcAccessId;
            this.vpcId = builder.vpcId;
            this.vpcTargetHostName = builder.vpcTargetHostName;
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
         * @return description
         */
        public String getDescription() {
            return this.description;
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
         * @return port
         */
        public Integer getPort() {
            return this.port;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return vpcAccessId
         */
        public String getVpcAccessId() {
            return this.vpcAccessId;
        }

        /**
         * @return vpcId
         */
        public String getVpcId() {
            return this.vpcId;
        }

        /**
         * @return vpcTargetHostName
         */
        public String getVpcTargetHostName() {
            return this.vpcTargetHostName;
        }

        public static final class Builder {
            private String createdTime; 
            private String description; 
            private String instanceId; 
            private String name; 
            private Integer port; 
            private String regionId; 
            private String vpcAccessId; 
            private String vpcId; 
            private String vpcTargetHostName; 

            /**
             * The time when the authorization was created.
             */
            public Builder createdTime(String createdTime) {
                this.createdTime = createdTime;
                return this;
            }

            /**
             * The description of the VPC authorization.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The ID of an ECS or SLB instance in the VPC.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * The name of the authorization.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The port number that corresponds to the instance.
             */
            public Builder port(Integer port) {
                this.port = port;
                return this;
            }

            /**
             * The ID of the region.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * The ID of the VPC authorization.
             */
            public Builder vpcAccessId(String vpcAccessId) {
                this.vpcAccessId = vpcAccessId;
                return this;
            }

            /**
             * The ID of the VPC.
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            /**
             * The host of the backend service.
             */
            public Builder vpcTargetHostName(String vpcTargetHostName) {
                this.vpcTargetHostName = vpcTargetHostName;
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
