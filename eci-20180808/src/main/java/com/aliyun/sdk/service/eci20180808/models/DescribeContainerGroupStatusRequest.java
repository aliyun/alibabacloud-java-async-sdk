// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eci20180808.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeContainerGroupStatusRequest} extends {@link RequestModel}
 *
 * <p>DescribeContainerGroupStatusRequest</p>
 */
public class DescribeContainerGroupStatusRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ContainerGroupIds")
    private String containerGroupIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Limit")
    @com.aliyun.core.annotation.Validation(maximum = 200, minimum = 1)
    private Integer limit;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SinceSecond")
    @com.aliyun.core.annotation.Validation(maximum = 3600, minimum = 60)
    private Integer sinceSecond;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tag")
    private java.util.List < Tag> tag;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VSwitchId")
    private String vSwitchId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ZoneId")
    private String zoneId;

    private DescribeContainerGroupStatusRequest(Builder builder) {
        super(builder);
        this.containerGroupIds = builder.containerGroupIds;
        this.limit = builder.limit;
        this.nextToken = builder.nextToken;
        this.regionId = builder.regionId;
        this.resourceGroupId = builder.resourceGroupId;
        this.sinceSecond = builder.sinceSecond;
        this.tag = builder.tag;
        this.vSwitchId = builder.vSwitchId;
        this.zoneId = builder.zoneId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeContainerGroupStatusRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return containerGroupIds
     */
    public String getContainerGroupIds() {
        return this.containerGroupIds;
    }

    /**
     * @return limit
     */
    public Integer getLimit() {
        return this.limit;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return sinceSecond
     */
    public Integer getSinceSecond() {
        return this.sinceSecond;
    }

    /**
     * @return tag
     */
    public java.util.List < Tag> getTag() {
        return this.tag;
    }

    /**
     * @return vSwitchId
     */
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    /**
     * @return zoneId
     */
    public String getZoneId() {
        return this.zoneId;
    }

    public static final class Builder extends Request.Builder<DescribeContainerGroupStatusRequest, Builder> {
        private String containerGroupIds; 
        private Integer limit; 
        private String nextToken; 
        private String regionId; 
        private String resourceGroupId; 
        private Integer sinceSecond; 
        private java.util.List < Tag> tag; 
        private String vSwitchId; 
        private String zoneId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeContainerGroupStatusRequest request) {
            super(request);
            this.containerGroupIds = request.containerGroupIds;
            this.limit = request.limit;
            this.nextToken = request.nextToken;
            this.regionId = request.regionId;
            this.resourceGroupId = request.resourceGroupId;
            this.sinceSecond = request.sinceSecond;
            this.tag = request.tag;
            this.vSwitchId = request.vSwitchId;
            this.zoneId = request.zoneId;
        } 

        /**
         * <p>The IDs of the instances. You can specify up to 20 IDs. Each ID must be a string in the JSON format.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;eci-bp17gw49eu09yiwm****&quot;, &quot;eci-bp19aq49du01abcm****&quot;, &quot;eci-2zegym1qhbmdfr1s****&quot;]</p>
         */
        public Builder containerGroupIds(String containerGroupIds) {
            this.putQueryParameter("ContainerGroupIds", containerGroupIds);
            this.containerGroupIds = containerGroupIds;
            return this;
        }

        /**
         * <p>Specifies the maximum number of elastic container instances to be returned for this request. Default value: 200.</p>
         * <blockquote>
         * <p>The number of returned resources can be less than or equal to the value of this parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder limit(Integer limit) {
            this.putQueryParameter("Limit", limit);
            this.limit = limit;
            return this;
        }

        /**
         * <p>The pagination token that is used in the next request to retrieve a new page of results. If NextToken is empty, no next page exists.<br>You do not need to specify this parameter for the first request. You must specify the token that is obtained from the previous query as the value of NextToken.</p>
         * 
         * <strong>example:</strong>
         * <p>d78f2dd8-5979-42fe-xaee-b16db43be5bc</p>
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The region ID of the instances.</p>
         * <p>This parameter is required.</p>
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
         * <p>The ID of the resource group to which the instances belong.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-uf66jeqopgqa9hdn****</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * <p>A relative time in seconds before the current time from which to show elastic container instances whose status changes. This parameter is used to poll status of elastic container instances.</p>
         * 
         * <strong>example:</strong>
         * <p>60</p>
         */
        public Builder sinceSecond(Integer sinceSecond) {
            this.putQueryParameter("SinceSecond", sinceSecond);
            this.sinceSecond = sinceSecond;
            return this;
        }

        /**
         * <p>The tag that is bound to the instances.</p>
         */
        public Builder tag(java.util.List < Tag> tag) {
            this.putQueryParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        /**
         * <p>The vSwitch ID.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-uf6h3rbwbm90urjwa****</p>
         */
        public Builder vSwitchId(String vSwitchId) {
            this.putQueryParameter("VSwitchId", vSwitchId);
            this.vSwitchId = vSwitchId;
            return this;
        }

        /**
         * <p>The zone ID of the instances.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou-k</p>
         */
        public Builder zoneId(String zoneId) {
            this.putQueryParameter("ZoneId", zoneId);
            this.zoneId = zoneId;
            return this;
        }

        @Override
        public DescribeContainerGroupStatusRequest build() {
            return new DescribeContainerGroupStatusRequest(this);
        } 

    } 

    /**
     * 
     * {@link DescribeContainerGroupStatusRequest} extends {@link TeaModel}
     *
     * <p>DescribeContainerGroupStatusRequest</p>
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
             * <p>The key of the tag.</p>
             * 
             * <strong>example:</strong>
             * <p>testKey</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The value of the tag.</p>
             * 
             * <strong>example:</strong>
             * <p>testValue</p>
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
