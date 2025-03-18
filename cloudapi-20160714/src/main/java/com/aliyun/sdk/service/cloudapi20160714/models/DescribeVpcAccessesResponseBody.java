// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

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
 * {@link DescribeVpcAccessesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeVpcAccessesResponseBody</p>
 */
public class DescribeVpcAccessesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    @com.aliyun.core.annotation.NameInMap("VpcAccessAttributes")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(DescribeVpcAccessesResponseBody model) {
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
            this.vpcAccessAttributes = model.vpcAccessAttributes;
        } 

        /**
         * <p>The page number of the returned page.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries returned on each page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>8883AC74-259D-4C0B-99FC-0B7F9A588B2F</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of returned entries.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * <p>The information about the VPC access authorization. The information is an array consisting of VpcAccessAttribute data.</p>
         */
        public Builder vpcAccessAttributes(VpcAccessAttributes vpcAccessAttributes) {
            this.vpcAccessAttributes = vpcAccessAttributes;
            return this;
        }

        public DescribeVpcAccessesResponseBody build() {
            return new DescribeVpcAccessesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeVpcAccessesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeVpcAccessesResponseBody</p>
     */
    public static class TagInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private TagInfo(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TagInfo create() {
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

            private Builder() {
            } 

            private Builder(TagInfo model) {
                this.key = model.key;
                this.value = model.value;
            } 

            /**
             * <p>The tag key.</p>
             * 
             * <strong>example:</strong>
             * <p>PROJECT</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The tag value.</p>
             * 
             * <strong>example:</strong>
             * <p>6427a17ae6041d1be62414e4</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public TagInfo build() {
                return new TagInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeVpcAccessesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeVpcAccessesResponseBody</p>
     */
    public static class Tags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("TagInfo")
        private java.util.List<TagInfo> tagInfo;

        private Tags(Builder builder) {
            this.tagInfo = builder.tagInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tags create() {
            return builder().build();
        }

        /**
         * @return tagInfo
         */
        public java.util.List<TagInfo> getTagInfo() {
            return this.tagInfo;
        }

        public static final class Builder {
            private java.util.List<TagInfo> tagInfo; 

            private Builder() {
            } 

            private Builder(Tags model) {
                this.tagInfo = model.tagInfo;
            } 

            /**
             * TagInfo.
             */
            public Builder tagInfo(java.util.List<TagInfo> tagInfo) {
                this.tagInfo = tagInfo;
                return this;
            }

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeVpcAccessesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeVpcAccessesResponseBody</p>
     */
    public static class VpcAccessAttribute extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreatedTime")
        private String createdTime;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Port")
        private Integer port;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("Tags")
        private Tags tags;

        @com.aliyun.core.annotation.NameInMap("VpcAccessId")
        private String vpcAccessId;

        @com.aliyun.core.annotation.NameInMap("VpcId")
        private String vpcId;

        @com.aliyun.core.annotation.NameInMap("VpcTargetHostName")
        private String vpcTargetHostName;

        private VpcAccessAttribute(Builder builder) {
            this.createdTime = builder.createdTime;
            this.description = builder.description;
            this.instanceId = builder.instanceId;
            this.name = builder.name;
            this.port = builder.port;
            this.regionId = builder.regionId;
            this.tags = builder.tags;
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
         * @return tags
         */
        public Tags getTags() {
            return this.tags;
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
            private Tags tags; 
            private String vpcAccessId; 
            private String vpcId; 
            private String vpcTargetHostName; 

            private Builder() {
            } 

            private Builder(VpcAccessAttribute model) {
                this.createdTime = model.createdTime;
                this.description = model.description;
                this.instanceId = model.instanceId;
                this.name = model.name;
                this.port = model.port;
                this.regionId = model.regionId;
                this.tags = model.tags;
                this.vpcAccessId = model.vpcAccessId;
                this.vpcId = model.vpcId;
                this.vpcTargetHostName = model.vpcTargetHostName;
            } 

            /**
             * <p>The time when the authorization was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2017-01-30T04:10:19Z</p>
             */
            public Builder createdTime(String createdTime) {
                this.createdTime = createdTime;
                return this;
            }

            /**
             * <p>The description of the VPC access authorization.</p>
             * 
             * <strong>example:</strong>
             * <p>Test</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The ID of an Elastic Compute Service (ECS) or Server Load Balancer (SLB) instance in the VPC.</p>
             * 
             * <strong>example:</strong>
             * <p>i-uf6bzcg1pr4oh5jjmxxx</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The name of the authorization.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The port number that corresponds to the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>80</p>
             */
            public Builder port(Integer port) {
                this.port = port;
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

            /**
             * <p>The tags.</p>
             */
            public Builder tags(Tags tags) {
                this.tags = tags;
                return this;
            }

            /**
             * <p>The ID of the VPC access authorization.</p>
             * 
             * <strong>example:</strong>
             * <p>vpc-*****ssds24</p>
             */
            public Builder vpcAccessId(String vpcAccessId) {
                this.vpcAccessId = vpcAccessId;
                return this;
            }

            /**
             * <p>The VPC ID.</p>
             * 
             * <strong>example:</strong>
             * <p>vpc-uf657qec7lx42paw3qxxx</p>
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            /**
             * <p>The host of the backend service.</p>
             * 
             * <strong>example:</strong>
             * <p>hos-a***.fh-**nc.com</p>
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
    /**
     * 
     * {@link DescribeVpcAccessesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeVpcAccessesResponseBody</p>
     */
    public static class VpcAccessAttributes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("VpcAccessAttribute")
        private java.util.List<VpcAccessAttribute> vpcAccessAttribute;

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
        public java.util.List<VpcAccessAttribute> getVpcAccessAttribute() {
            return this.vpcAccessAttribute;
        }

        public static final class Builder {
            private java.util.List<VpcAccessAttribute> vpcAccessAttribute; 

            private Builder() {
            } 

            private Builder(VpcAccessAttributes model) {
                this.vpcAccessAttribute = model.vpcAccessAttribute;
            } 

            /**
             * VpcAccessAttribute.
             */
            public Builder vpcAccessAttribute(java.util.List<VpcAccessAttribute> vpcAccessAttribute) {
                this.vpcAccessAttribute = vpcAccessAttribute;
                return this;
            }

            public VpcAccessAttributes build() {
                return new VpcAccessAttributes(this);
            } 

        } 

    }
}
