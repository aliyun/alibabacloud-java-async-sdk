// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ga20191120.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListEndpointGroupsRequest} extends {@link RequestModel}
 *
 * <p>ListEndpointGroupsRequest</p>
 */
public class ListEndpointGroupsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AcceleratorId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String acceleratorId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AccessLogSwitch")
    private String accessLogSwitch;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndpointGroupId")
    private String endpointGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndpointGroupType")
    private String endpointGroupType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ListenerId")
    private String listenerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(maximum = 50, minimum = 1)
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tag")
    private java.util.List < Tag> tag;

    private ListEndpointGroupsRequest(Builder builder) {
        super(builder);
        this.acceleratorId = builder.acceleratorId;
        this.accessLogSwitch = builder.accessLogSwitch;
        this.endpointGroupId = builder.endpointGroupId;
        this.endpointGroupType = builder.endpointGroupType;
        this.listenerId = builder.listenerId;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.regionId = builder.regionId;
        this.tag = builder.tag;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListEndpointGroupsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return acceleratorId
     */
    public String getAcceleratorId() {
        return this.acceleratorId;
    }

    /**
     * @return accessLogSwitch
     */
    public String getAccessLogSwitch() {
        return this.accessLogSwitch;
    }

    /**
     * @return endpointGroupId
     */
    public String getEndpointGroupId() {
        return this.endpointGroupId;
    }

    /**
     * @return endpointGroupType
     */
    public String getEndpointGroupType() {
        return this.endpointGroupType;
    }

    /**
     * @return listenerId
     */
    public String getListenerId() {
        return this.listenerId;
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return tag
     */
    public java.util.List < Tag> getTag() {
        return this.tag;
    }

    public static final class Builder extends Request.Builder<ListEndpointGroupsRequest, Builder> {
        private String acceleratorId; 
        private String accessLogSwitch; 
        private String endpointGroupId; 
        private String endpointGroupType; 
        private String listenerId; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String regionId; 
        private java.util.List < Tag> tag; 

        private Builder() {
            super();
        } 

        private Builder(ListEndpointGroupsRequest request) {
            super(request);
            this.acceleratorId = request.acceleratorId;
            this.accessLogSwitch = request.accessLogSwitch;
            this.endpointGroupId = request.endpointGroupId;
            this.endpointGroupType = request.endpointGroupType;
            this.listenerId = request.listenerId;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.regionId = request.regionId;
            this.tag = request.tag;
        } 

        /**
         * The ID of the GA instance.
         */
        public Builder acceleratorId(String acceleratorId) {
            this.putQueryParameter("AcceleratorId", acceleratorId);
            this.acceleratorId = acceleratorId;
            return this;
        }

        /**
         * Specifies whether the access logging feature is enabled. Default value: off. Valid values:
         * <p>
         * 
         * *   **on**: The access logging feature is enabled.
         * *   **off**: The access logging feature is disabled.
         */
        public Builder accessLogSwitch(String accessLogSwitch) {
            this.putQueryParameter("AccessLogSwitch", accessLogSwitch);
            this.accessLogSwitch = accessLogSwitch;
            return this;
        }

        /**
         * The ID of the endpoint group.
         */
        public Builder endpointGroupId(String endpointGroupId) {
            this.putQueryParameter("EndpointGroupId", endpointGroupId);
            this.endpointGroupId = endpointGroupId;
            return this;
        }

        /**
         * The type of the endpoint group. Valid values:
         * <p>
         * 
         * *   **default**
         * *   **virtual**
         * *   If you leave this parameter empty, all default and virtual endpoint groups are queried.
         */
        public Builder endpointGroupType(String endpointGroupType) {
            this.putQueryParameter("EndpointGroupType", endpointGroupType);
            this.endpointGroupType = endpointGroupType;
            return this;
        }

        /**
         * The ID of the listener.
         */
        public Builder listenerId(String listenerId) {
            this.putQueryParameter("ListenerId", listenerId);
            this.listenerId = listenerId;
            return this;
        }

        /**
         * The page number. Default value: **1**.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries per page. Maximum value: **50**. Default value: **10**.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The ID of the region where the Global Accelerator (GA) instance is deployed. Set the value to **cn-hangzhou**.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The tag of the endpoint group.
         */
        public Builder tag(java.util.List < Tag> tag) {
            this.putQueryParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        @Override
        public ListEndpointGroupsRequest build() {
            return new ListEndpointGroupsRequest(this);
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
             * The tag key of the endpoint group. It cannot be an empty string.
             * <p>
             * 
             * The tag key can be up to 64 characters in length and cannot contain `http://` or `https://`. The tag key cannot start with `aliyun` or `acs:`.
             * 
             * You can specify up to 20 tag keys.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * The tag value of the endpoint group. The tag value can be an empty string.
             * <p>
             * 
             * The tag value can be up to 128 characters in length and cannot contain `http://` or `https://`. The tag value cannot start with `aliyun` or `acs:`.
             * 
             * You can specify up to 20 tag values.
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
