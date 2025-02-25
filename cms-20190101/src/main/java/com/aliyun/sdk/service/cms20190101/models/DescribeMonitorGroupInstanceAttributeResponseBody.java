// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeMonitorGroupInstanceAttributeResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeMonitorGroupInstanceAttributeResponseBody</p>
 */
public class DescribeMonitorGroupInstanceAttributeResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Resources")
    private Resources resources;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("Total")
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
         * <p>The responses code.</p>
         * <blockquote>
         * <p> The status code 200 indicates that the request was successful.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The returned message.</p>
         * 
         * <strong>example:</strong>
         * <p>The specified resource is not found.</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>9FB8EA79-7279-4482-8D6D-3D28EEDD871A</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The resources that are associated with the application group.</p>
         */
        public Builder resources(Resources resources) {
            this.resources = resources;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>12</p>
         */
        public Builder total(Integer total) {
            this.total = total;
            return this;
        }

        public DescribeMonitorGroupInstanceAttributeResponseBody build() {
            return new DescribeMonitorGroupInstanceAttributeResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeMonitorGroupInstanceAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeMonitorGroupInstanceAttributeResponseBody</p>
     */
    public static class Region extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AvailabilityZone")
        private String availabilityZone;

        @com.aliyun.core.annotation.NameInMap("RegionId")
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
             * <p>The zone.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou-f</p>
             */
            public Builder availabilityZone(String availabilityZone) {
                this.availabilityZone = availabilityZone;
                return this;
            }

            /**
             * <p>The region ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
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
    /**
     * 
     * {@link DescribeMonitorGroupInstanceAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeMonitorGroupInstanceAttributeResponseBody</p>
     */
    public static class Tag extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
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
             * <p>The tag key.</p>
             * 
             * <strong>example:</strong>
             * <p>instanceNetworkType</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The tag value.</p>
             * 
             * <strong>example:</strong>
             * <p>VPC</p>
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
    /**
     * 
     * {@link DescribeMonitorGroupInstanceAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeMonitorGroupInstanceAttributeResponseBody</p>
     */
    public static class Tags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Tag")
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
    /**
     * 
     * {@link DescribeMonitorGroupInstanceAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeMonitorGroupInstanceAttributeResponseBody</p>
     */
    public static class Vpc extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("VpcInstanceId")
        private String vpcInstanceId;

        @com.aliyun.core.annotation.NameInMap("VswitchInstanceId")
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
             * <p>The VPC ID.</p>
             * 
             * <strong>example:</strong>
             * <p>vpc-2zew7etgiceg21****</p>
             */
            public Builder vpcInstanceId(String vpcInstanceId) {
                this.vpcInstanceId = vpcInstanceId;
                return this;
            }

            /**
             * <p>The vSwitch ID.</p>
             * 
             * <strong>example:</strong>
             * <p>vsw-2ze36seq79n992****</p>
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
    /**
     * 
     * {@link DescribeMonitorGroupInstanceAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeMonitorGroupInstanceAttributeResponseBody</p>
     */
    public static class Resource extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Category")
        private String category;

        @com.aliyun.core.annotation.NameInMap("Desc")
        private String desc;

        @com.aliyun.core.annotation.NameInMap("Dimension")
        private String dimension;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("InstanceName")
        private String instanceName;

        @com.aliyun.core.annotation.NameInMap("NetworkType")
        private String networkType;

        @com.aliyun.core.annotation.NameInMap("Region")
        private Region region;

        @com.aliyun.core.annotation.NameInMap("Tags")
        private Tags tags;

        @com.aliyun.core.annotation.NameInMap("Vpc")
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
             * <p>The name of the cloud service.</p>
             * 
             * <strong>example:</strong>
             * <p>ecs</p>
             */
            public Builder category(String category) {
                this.category = category;
                return this;
            }

            /**
             * <p>The resource description.</p>
             * 
             * <strong>example:</strong>
             * <p>desc_test</p>
             */
            public Builder desc(String desc) {
                this.desc = desc;
                return this;
            }

            /**
             * <p>The dimensions of the resource that is associated with the application group.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;instanceId&quot;:&quot;i-m5e0k0bexac8tykr****&quot;}</p>
             */
            public Builder dimension(String dimension) {
                this.dimension = dimension;
                return this;
            }

            /**
             * <p>The instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>i-m5e0k0bexac8tykr****</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The instance name.</p>
             * 
             * <strong>example:</strong>
             * <p>hostName</p>
             */
            public Builder instanceName(String instanceName) {
                this.instanceName = instanceName;
                return this;
            }

            /**
             * <p>The network type.</p>
             * 
             * <strong>example:</strong>
             * <p>vpc</p>
             */
            public Builder networkType(String networkType) {
                this.networkType = networkType;
                return this;
            }

            /**
             * <p>The region.</p>
             */
            public Builder region(Region region) {
                this.region = region;
                return this;
            }

            /**
             * <p>The tag of the resource.</p>
             */
            public Builder tags(Tags tags) {
                this.tags = tags;
                return this;
            }

            /**
             * <p>The VPC description.</p>
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
    /**
     * 
     * {@link DescribeMonitorGroupInstanceAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeMonitorGroupInstanceAttributeResponseBody</p>
     */
    public static class Resources extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Resource")
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
