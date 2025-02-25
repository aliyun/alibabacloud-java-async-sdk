// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alikafka20190916.models;

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
 * {@link GetInstanceListRequest} extends {@link RequestModel}
 *
 * <p>GetInstanceListRequest</p>
 */
public class GetInstanceListRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private java.util.List<String> instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OrderId")
    private String orderId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Series")
    private String series;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tag")
    private java.util.List<Tag> tag;

    private GetInstanceListRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.orderId = builder.orderId;
        this.regionId = builder.regionId;
        this.resourceGroupId = builder.resourceGroupId;
        this.series = builder.series;
        this.tag = builder.tag;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetInstanceListRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceId
     */
    public java.util.List<String> getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return orderId
     */
    public String getOrderId() {
        return this.orderId;
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
     * @return series
     */
    public String getSeries() {
        return this.series;
    }

    /**
     * @return tag
     */
    public java.util.List<Tag> getTag() {
        return this.tag;
    }

    public static final class Builder extends Request.Builder<GetInstanceListRequest, Builder> {
        private java.util.List<String> instanceId; 
        private String orderId; 
        private String regionId; 
        private String resourceGroupId; 
        private String series; 
        private java.util.List<Tag> tag; 

        private Builder() {
            super();
        } 

        private Builder(GetInstanceListRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.orderId = request.orderId;
            this.regionId = request.regionId;
            this.resourceGroupId = request.resourceGroupId;
            this.series = request.series;
            this.tag = request.tag;
        } 

        /**
         * <p>The IDs of instances.</p>
         * 
         * <strong>example:</strong>
         * <p>alikafka_post-cn-mp91gnw0p***</p>
         */
        public Builder instanceId(java.util.List<String> instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The ID of the order. You can obtain the order ID on the <a href="https://usercenter2-intl.aliyun.com/order/list?pageIndex=1&pageSize=20&spm=5176.12818093.top-nav.ditem-ord.36f016d0OQFmJa">Orders</a> page in Alibaba Cloud User Center.</p>
         * 
         * <strong>example:</strong>
         * <p>6072673****</p>
         */
        public Builder orderId(String orderId) {
            this.putQueryParameter("OrderId", orderId);
            this.orderId = orderId;
            return this;
        }

        /**
         * <p>The ID of the region where the instance resides.</p>
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
         * <p>The ID of the resource group. You can obtain this ID on the Resource Group page in the Resource Management console.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-ac***********7q</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * <p>The instance version. You can use instance versions to filter different versions of instances. Valid values:</p>
         * <ul>
         * <li>v2</li>
         * <li>v3</li>
         * <li>confluent</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>v3</p>
         */
        public Builder series(String series) {
            this.putQueryParameter("Series", series);
            this.series = series;
            return this;
        }

        /**
         * <p>The tags.</p>
         */
        public Builder tag(java.util.List<Tag> tag) {
            this.putQueryParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        @Override
        public GetInstanceListRequest build() {
            return new GetInstanceListRequest(this);
        } 

    } 

    /**
     * 
     * {@link GetInstanceListRequest} extends {@link TeaModel}
     *
     * <p>GetInstanceListRequest</p>
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
             * <ul>
             * <li>If you leave this parameter empty, the keys of all tags are matched.</li>
             * <li>The tag key can be up to 128 characters in length. It cannot start with aliyun or acs: and cannot contain <code>http://</code> or <code>https://</code>.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The tag value.</p>
             * <ul>
             * <li>If you leave Key empty, you must also leave this parameter empty. If you leave this parameter empty, the values of all tags are matched.</li>
             * <li>The tag value can be up to 128 characters in length. It cannot start with aliyun or acs: and cannot contain <code>http://</code> or <code>https://</code>.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>test</p>
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
