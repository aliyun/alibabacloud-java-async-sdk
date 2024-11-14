// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddosbgp20180720.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeInstanceListRequest} extends {@link RequestModel}
 *
 * <p>DescribeInstanceListRequest</p>
 */
public class DescribeInstanceListRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceIdList")
    private String instanceIdList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceType")
    private String instanceType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceTypeList")
    private java.util.List < String > instanceTypeList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Ip")
    private String ip;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IpVersion")
    private String ipVersion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Orderby")
    private String orderby;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Orderdire")
    private String orderdire;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNo")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer pageNo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Remark")
    private String remark;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tag")
    private java.util.List < Tag> tag;

    private DescribeInstanceListRequest(Builder builder) {
        super(builder);
        this.instanceIdList = builder.instanceIdList;
        this.instanceType = builder.instanceType;
        this.instanceTypeList = builder.instanceTypeList;
        this.ip = builder.ip;
        this.ipVersion = builder.ipVersion;
        this.orderby = builder.orderby;
        this.orderdire = builder.orderdire;
        this.pageNo = builder.pageNo;
        this.pageSize = builder.pageSize;
        this.regionId = builder.regionId;
        this.remark = builder.remark;
        this.resourceGroupId = builder.resourceGroupId;
        this.tag = builder.tag;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeInstanceListRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceIdList
     */
    public String getInstanceIdList() {
        return this.instanceIdList;
    }

    /**
     * @return instanceType
     */
    public String getInstanceType() {
        return this.instanceType;
    }

    /**
     * @return instanceTypeList
     */
    public java.util.List < String > getInstanceTypeList() {
        return this.instanceTypeList;
    }

    /**
     * @return ip
     */
    public String getIp() {
        return this.ip;
    }

    /**
     * @return ipVersion
     */
    public String getIpVersion() {
        return this.ipVersion;
    }

    /**
     * @return orderby
     */
    public String getOrderby() {
        return this.orderby;
    }

    /**
     * @return orderdire
     */
    public String getOrderdire() {
        return this.orderdire;
    }

    /**
     * @return pageNo
     */
    public Integer getPageNo() {
        return this.pageNo;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return remark
     */
    public String getRemark() {
        return this.remark;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return tag
     */
    public java.util.List < Tag> getTag() {
        return this.tag;
    }

    public static final class Builder extends Request.Builder<DescribeInstanceListRequest, Builder> {
        private String instanceIdList; 
        private String instanceType; 
        private java.util.List < String > instanceTypeList; 
        private String ip; 
        private String ipVersion; 
        private String orderby; 
        private String orderdire; 
        private Integer pageNo; 
        private Integer pageSize; 
        private String regionId; 
        private String remark; 
        private String resourceGroupId; 
        private java.util.List < Tag> tag; 

        private Builder() {
            super();
        } 

        private Builder(DescribeInstanceListRequest request) {
            super(request);
            this.instanceIdList = request.instanceIdList;
            this.instanceType = request.instanceType;
            this.instanceTypeList = request.instanceTypeList;
            this.ip = request.ip;
            this.ipVersion = request.ipVersion;
            this.orderby = request.orderby;
            this.orderdire = request.orderdire;
            this.pageNo = request.pageNo;
            this.pageSize = request.pageSize;
            this.regionId = request.regionId;
            this.remark = request.remark;
            this.resourceGroupId = request.resourceGroupId;
            this.tag = request.tag;
        } 

        /**
         * <p>The IDs of the Anti-DDoS Origin instances to query. Specify the value is in the <code>[&quot;&lt;Instance ID 1&gt;&quot;,&quot;&lt;Instance ID 2&gt;&quot;,……]</code> format.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;ddosbgp-cn-oew1pjrk****&quot;]</p>
         */
        public Builder instanceIdList(String instanceIdList) {
            this.putQueryParameter("InstanceIdList", instanceIdList);
            this.instanceIdList = instanceIdList;
            return this;
        }

        /**
         * <p>The mitigation plan of the Anti-DDoS Origin instance to query. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: the Professional mitigation plan</li>
         * <li><strong>1</strong>: the Enterprise mitigation plan</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder instanceType(String instanceType) {
            this.putQueryParameter("InstanceType", instanceType);
            this.instanceType = instanceType;
            return this;
        }

        /**
         * <p>The mitigation plan of the Anti-DDoS Origin instance.</p>
         */
        public Builder instanceTypeList(java.util.List < String > instanceTypeList) {
            this.putQueryParameter("InstanceTypeList", instanceTypeList);
            this.instanceTypeList = instanceTypeList;
            return this;
        }

        /**
         * <p>The IP address of the object that is protected by the Anti-DDoS Origin instance to query.</p>
         * 
         * <strong>example:</strong>
         * <p>47.89.XX.XX</p>
         */
        public Builder ip(String ip) {
            this.putQueryParameter("Ip", ip);
            this.ip = ip;
            return this;
        }

        /**
         * <p>The protocol type of the IP address asset that is protected by the Anti-DDoS Origin instance to query. Valid values:</p>
         * <ul>
         * <li><strong>Ipv4</strong>: IPv4</li>
         * <li><strong>Ipv6</strong>: IPv6</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>IPv4</p>
         */
        public Builder ipVersion(String ipVersion) {
            this.putQueryParameter("IpVersion", ipVersion);
            this.ipVersion = ipVersion;
            return this;
        }

        /**
         * <p>The field that is used to sort the Anti-DDoS Origin instances. Set the value to <strong>expireTime</strong>, which indicates that the instances are sorted based on the expiration time.</p>
         * <p>You can set the <strong>Orderdire</strong> parameter to specify the sorting method.</p>
         * 
         * <strong>example:</strong>
         * <p>expireTime</p>
         */
        public Builder orderby(String orderby) {
            this.putQueryParameter("Orderby", orderby);
            this.orderby = orderby;
            return this;
        }

        /**
         * <p>The sorting method. Valid values:</p>
         * <ul>
         * <li><strong>desc</strong>: the descending order. This is the default value.</li>
         * <li><strong>asc</strong>: the ascending order.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>desc</p>
         */
        public Builder orderdire(String orderdire) {
            this.putQueryParameter("Orderdire", orderdire);
            this.orderdire = orderdire;
            return this;
        }

        /**
         * <p>The number of the page to return.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNo(Integer pageNo) {
            this.putQueryParameter("PageNo", pageNo);
            this.pageNo = pageNo;
            return this;
        }

        /**
         * <p>The number of entries to return on each page.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The ID of the region where the Anti-DDoS Origin instance to query resides.</p>
         * <blockquote>
         * <p> You can call the <a href="https://help.aliyun.com/document_detail/118703.html">DescribeRegions</a> operation to query the most recent region list.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The remarks of the Anti-DDoS Origin instance to query. Fuzzy match is supported.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder remark(String remark) {
            this.putQueryParameter("Remark", remark);
            this.remark = remark;
            return this;
        }

        /**
         * <p>The ID of the resource group to which the Anti-DDoS Origin instance belongs in Resource Management.</p>
         * <p>If you do not specify this parameter, the instance belongs to the default resource group.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-acfm2pz25js****</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * <p>The tags that are added to the Anti-DDoS Origin instance.</p>
         */
        public Builder tag(java.util.List < Tag> tag) {
            this.putQueryParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        @Override
        public DescribeInstanceListRequest build() {
            return new DescribeInstanceListRequest(this);
        } 

    } 

    /**
     * 
     * {@link DescribeInstanceListRequest} extends {@link TeaModel}
     *
     * <p>DescribeInstanceListRequest</p>
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
             * <p>The key of the tag that is added to the Anti-DDoS Origin instance.</p>
             * 
             * <strong>example:</strong>
             * <p>test-key</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The value of the tag that is added to the Anti-DDoS Origin instance.</p>
             * 
             * <strong>example:</strong>
             * <p>test-value</p>
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
}
