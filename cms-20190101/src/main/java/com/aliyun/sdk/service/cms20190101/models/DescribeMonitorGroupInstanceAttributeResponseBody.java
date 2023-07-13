// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeMonitorGroupInstanceAttributeResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeMonitorGroupInstanceAttributeResponseBody</p>
 */
public class DescribeMonitorGroupInstanceAttributeResponseBody extends TeaModel {
    @NameInMap("Code")
    private Integer code;

    @NameInMap("Message")
    private String message;

    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Resources")
    private Resources resources;

    @NameInMap("Success")
    private Boolean success;

    @NameInMap("Total")
    private Integer total;

    private DescribeMonitorGroupInstanceAttributeResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.resources = builder.resources;
        this.success = builder.success;
        this.total = builder.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeMonitorGroupInstanceAttributeResponseBody create() {
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
     * @return resources
     */
    public Resources getResources() {
        return this.resources;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    /**
     * @return total
     */
    public Integer getTotal() {
        return this.total;
    }

    public static final class Builder {
        private Integer code; 
        private String message; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Resources resources; 
        private Boolean success; 
        private Integer total; 

        /**
         * The information about the virtual private cloud (VPC).
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * The number of the page to return.
         * <p>
         * 
         * Valid values: 1 to 1000000000.
         * 
         * Default value: 1.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * The ID of the VPC.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries to return on each page.
         * <p>
         * 
         * Valid values: 1 to 1000000000.
         * 
         * Default value: 10.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The dimensions of the resource that is associated with the application group.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The ID of the instance.
         */
        public Builder resources(Resources resources) {
            this.resources = resources;
            return this;
        }

        /**
         * The total number of returned entries.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * The ID of the resource. Separate multiple resource IDs with commas (,). You can query the details about a maximum of 20 resources in each request.
         */
        public Builder total(Integer total) {
            this.total = total;
            return this;
        }

        public DescribeMonitorGroupInstanceAttributeResponseBody build() {
            return new DescribeMonitorGroupInstanceAttributeResponseBody(this);
        } 

    } 

    public static class Region extends TeaModel {
        @NameInMap("AvailabilityZone")
        private String availabilityZone;

        @NameInMap("RegionId")
        private String regionId;

        private Region(Builder builder) {
            this.availabilityZone = builder.availabilityZone;
            this.regionId = builder.regionId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Region create() {
            return builder().build();
        }

        /**
         * @return availabilityZone
         */
        public String getAvailabilityZone() {
            return this.availabilityZone;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        public static final class Builder {
            private String availabilityZone; 
            private String regionId; 

            /**
             * AvailabilityZone.
             */
            public Builder availabilityZone(String availabilityZone) {
                this.availabilityZone = availabilityZone;
                return this;
            }

            /**
             * RegionId.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            public Region build() {
                return new Region(this);
            } 

        } 

    }
    public static class Tag extends TeaModel {
        @NameInMap("Key")
        private String key;

        @NameInMap("Value")
        private String value;

        private Tag(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tag create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            /**
             * The name of the instance.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * The description of the resource.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Tag build() {
                return new Tag(this);
            } 

        } 

    }
    public static class Tags extends TeaModel {
        @NameInMap("Tag")
        private java.util.List < Tag> tag;

        private Tags(Builder builder) {
            this.tag = builder.tag;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tags create() {
            return builder().build();
        }

        /**
         * @return tag
         */
        public java.util.List < Tag> getTag() {
            return this.tag;
        }

        public static final class Builder {
            private java.util.List < Tag> tag; 

            /**
             * Tag.
             */
            public Builder tag(java.util.List < Tag> tag) {
                this.tag = tag;
                return this;
            }

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
    public static class Vpc extends TeaModel {
        @NameInMap("VpcInstanceId")
        private String vpcInstanceId;

        @NameInMap("VswitchInstanceId")
        private String vswitchInstanceId;

        private Vpc(Builder builder) {
            this.vpcInstanceId = builder.vpcInstanceId;
            this.vswitchInstanceId = builder.vswitchInstanceId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Vpc create() {
            return builder().build();
        }

        /**
         * @return vpcInstanceId
         */
        public String getVpcInstanceId() {
            return this.vpcInstanceId;
        }

        /**
         * @return vswitchInstanceId
         */
        public String getVswitchInstanceId() {
            return this.vswitchInstanceId;
        }

        public static final class Builder {
            private String vpcInstanceId; 
            private String vswitchInstanceId; 

            /**
             * VpcInstanceId.
             */
            public Builder vpcInstanceId(String vpcInstanceId) {
                this.vpcInstanceId = vpcInstanceId;
                return this;
            }

            /**
             * VswitchInstanceId.
             */
            public Builder vswitchInstanceId(String vswitchInstanceId) {
                this.vswitchInstanceId = vswitchInstanceId;
                return this;
            }

            public Vpc build() {
                return new Vpc(this);
            } 

        } 

    }
    public static class Resource extends TeaModel {
        @NameInMap("Category")
        private String category;

        @NameInMap("Desc")
        private String desc;

        @NameInMap("Dimension")
        private String dimension;

        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("InstanceName")
        private String instanceName;

        @NameInMap("NetworkType")
        private String networkType;

        @NameInMap("Region")
        private Region region;

        @NameInMap("Tags")
        private Tags tags;

        @NameInMap("Vpc")
        private Vpc vpc;

        private Resource(Builder builder) {
            this.category = builder.category;
            this.desc = builder.desc;
            this.dimension = builder.dimension;
            this.instanceId = builder.instanceId;
            this.instanceName = builder.instanceName;
            this.networkType = builder.networkType;
            this.region = builder.region;
            this.tags = builder.tags;
            this.vpc = builder.vpc;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Resource create() {
            return builder().build();
        }

        /**
         * @return category
         */
        public String getCategory() {
            return this.category;
        }

        /**
         * @return desc
         */
        public String getDesc() {
            return this.desc;
        }

        /**
         * @return dimension
         */
        public String getDimension() {
            return this.dimension;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return instanceName
         */
        public String getInstanceName() {
            return this.instanceName;
        }

        /**
         * @return networkType
         */
        public String getNetworkType() {
            return this.networkType;
        }

        /**
         * @return region
         */
        public Region getRegion() {
            return this.region;
        }

        /**
         * @return tags
         */
        public Tags getTags() {
            return this.tags;
        }

        /**
         * @return vpc
         */
        public Vpc getVpc() {
            return this.vpc;
        }

        public static final class Builder {
            private String category; 
            private String desc; 
            private String dimension; 
            private String instanceId; 
            private String instanceName; 
            private String networkType; 
            private Region region; 
            private Tags tags; 
            private Vpc vpc; 

            /**
             * The network type.
             */
            public Builder category(String category) {
                this.category = category;
                return this;
            }

            /**
             * The total number of returned pages.
             */
            public Builder desc(String desc) {
                this.desc = desc;
                return this;
            }

            /**
             * The tag value.
             */
            public Builder dimension(String dimension) {
                this.dimension = dimension;
                return this;
            }

            /**
             * Specifies whether to return the total number of resources in the specified application group. Valid values:
             * <p>
             * 
             * *   true (default value)
             * *   false
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * The resources that are associated with the application group.
             */
            public Builder instanceName(String instanceName) {
                this.instanceName = instanceName;
                return this;
            }

            /**
             * The page number of the returned page.
             */
            public Builder networkType(String networkType) {
                this.networkType = networkType;
                return this;
            }

            /**
             * Region.
             */
            public Builder region(Region region) {
                this.region = region;
                return this;
            }

            /**
             * The tags of the resource.
             */
            public Builder tags(Tags tags) {
                this.tags = tags;
                return this;
            }

            /**
             * The ID of the request.
             */
            public Builder vpc(Vpc vpc) {
                this.vpc = vpc;
                return this;
            }

            public Resource build() {
                return new Resource(this);
            } 

        } 

    }
    public static class Resources extends TeaModel {
        @NameInMap("Resource")
        private java.util.List < Resource> resource;

        private Resources(Builder builder) {
            this.resource = builder.resource;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Resources create() {
            return builder().build();
        }

        /**
         * @return resource
         */
        public java.util.List < Resource> getResource() {
            return this.resource;
        }

        public static final class Builder {
            private java.util.List < Resource> resource; 

            /**
             * Resource.
             */
            public Builder resource(java.util.List < Resource> resource) {
                this.resource = resource;
                return this;
            }

            public Resources build() {
                return new Resources(this);
            } 

        } 

    }
}
