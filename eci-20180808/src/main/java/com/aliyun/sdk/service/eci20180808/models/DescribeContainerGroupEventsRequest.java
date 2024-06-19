// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eci20180808.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeContainerGroupEventsRequest} extends {@link RequestModel}
 *
 * <p>DescribeContainerGroupEventsRequest</p>
 */
public class DescribeContainerGroupEventsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ContainerGroupIds")
    private String containerGroupIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EventSource")
    private String eventSource;

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

    private DescribeContainerGroupEventsRequest(Builder builder) {
        super(builder);
        this.containerGroupIds = builder.containerGroupIds;
        this.eventSource = builder.eventSource;
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

    public static DescribeContainerGroupEventsRequest create() {
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
     * @return eventSource
     */
    public String getEventSource() {
        return this.eventSource;
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

    public static final class Builder extends Request.Builder<DescribeContainerGroupEventsRequest, Builder> {
        private String containerGroupIds; 
        private String eventSource; 
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

        private Builder(DescribeContainerGroupEventsRequest request) {
            super(request);
            this.containerGroupIds = request.containerGroupIds;
            this.eventSource = request.eventSource;
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
         * The IDs of the elastic container instances. You can specify up to 20 IDs. Each ID must be a JSON string.
         */
        public Builder containerGroupIds(String containerGroupIds) {
            this.putQueryParameter("ContainerGroupIds", containerGroupIds);
            this.containerGroupIds = containerGroupIds;
            return this;
        }

        /**
         * The event source. Valid values:
         * <p>
         * 
         * *   EciService
         * *   K8sAgent
         * 
         * This parameter is empty by default. This indicates that all events are queried.
         */
        public Builder eventSource(String eventSource) {
            this.putQueryParameter("EventSource", eventSource);
            this.eventSource = eventSource;
            return this;
        }

        /**
         * The maximum number of elastic container instances to be returned for this request. Default value: 200.
         * <p>
         * 
         * >  The number of elastic container instances to be returned is no greater than this parameter value.
         */
        public Builder limit(Integer limit) {
            this.putQueryParameter("Limit", limit);
            this.limit = limit;
            return this;
        }

        /**
         * The pagination token that is used in the next request to retrieve a new page of results. If NextToken is empty, no next page exists.
         * <p>
         * 
         * You do not need to specify this parameter for the first request. You must specify the token that is obtained from the previous query as the value of NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * The region ID.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The ID of the resource group.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * A relative time in seconds before the current time from which to show event information. This parameter is used to poll incremental events.
         */
        public Builder sinceSecond(Integer sinceSecond) {
            this.putQueryParameter("SinceSecond", sinceSecond);
            this.sinceSecond = sinceSecond;
            return this;
        }

        /**
         * The tag that is added to the elastic container instances.
         */
        public Builder tag(java.util.List < Tag> tag) {
            this.putQueryParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        /**
         * The vSwitch ID.
         */
        public Builder vSwitchId(String vSwitchId) {
            this.putQueryParameter("VSwitchId", vSwitchId);
            this.vSwitchId = vSwitchId;
            return this;
        }

        /**
         * The zone ID.
         */
        public Builder zoneId(String zoneId) {
            this.putQueryParameter("ZoneId", zoneId);
            this.zoneId = zoneId;
            return this;
        }

        @Override
        public DescribeContainerGroupEventsRequest build() {
            return new DescribeContainerGroupEventsRequest(this);
        } 

    } 

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
             * The key of the tag.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * The value of the tag.
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
