// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

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
 * {@link AddPrometheusGlobalViewRequest} extends {@link RequestModel}
 *
 * <p>AddPrometheusGlobalViewRequest</p>
 */
public class AddPrometheusGlobalViewRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Clusters")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clusters;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GroupName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String groupName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tag")
    private java.util.List<Tag> tag;

    private AddPrometheusGlobalViewRequest(Builder builder) {
        super(builder);
        this.clusters = builder.clusters;
        this.groupName = builder.groupName;
        this.regionId = builder.regionId;
        this.resourceGroupId = builder.resourceGroupId;
        this.tag = builder.tag;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddPrometheusGlobalViewRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clusters
     */
    public String getClusters() {
        return this.clusters;
    }

    /**
     * @return groupName
     */
    public String getGroupName() {
        return this.groupName;
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
     * @return tag
     */
    public java.util.List<Tag> getTag() {
        return this.tag;
    }

    public static final class Builder extends Request.Builder<AddPrometheusGlobalViewRequest, Builder> {
        private String clusters; 
        private String groupName; 
        private String regionId; 
        private String resourceGroupId; 
        private java.util.List<Tag> tag; 

        private Builder() {
            super();
        } 

        private Builder(AddPrometheusGlobalViewRequest request) {
            super(request);
            this.clusters = request.clusters;
            this.groupName = request.groupName;
            this.regionId = request.regionId;
            this.resourceGroupId = request.resourceGroupId;
            this.tag = request.tag;
        } 

        /**
         * <p>The queried global aggregation instances. The value is a JSON string.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>[         {             &quot;sourceName&quot;: &quot;Data source name- ArmsPrometheus No.1&quot;,             &quot;sourceType&quot;:&quot;AlibabaPrometheus&quot;,             &quot;userId&quot;:&quot;UserID&quot;,             &quot;clusterId&quot;:&quot;ClusterId&quot;,         },         {             &quot;sourceName&quot;: &quot;Data source name - MetrcStore No.2&quot;,             &quot;sourceType&quot;:&quot;MetricStore&quot;,             &quot;dataSource&quot;:&quot;MetricStore remote read address&quot;,             &quot;extras&quot;:{                 &quot;username&quot;:&quot;BasicAuthUsername&quot;,                 &quot;password&quot;:&quot;BasicAuthPassword&quot;             }         },         {             &quot;sourceName&quot;: &quot;Custom &quot;,             &quot;sourceType&quot;:&quot;CustomPrometheus&quot;,             &quot;dataSource&quot;:&quot;Build your own Prometheus data source remoteread address&quot;,             &quot;extras&quot;:{                 &quot;username&quot;:&quot;BasicAuthUsername&quot;,                 &quot;password&quot;:&quot;BasicAuthPassword&quot;             }         },         {           	&quot;sourceName&quot;: &quot;Other one &quot;,             &quot;sourceType&quot;:&quot;Others&quot;,             &quot;dataSource&quot;:&quot;Other data sources such as Tencent remoteread address&quot;,             &quot;headers&quot;:{                 &quot;AnyHeaderToFill&quot;:&quot;Headers to be populated&quot;             },             &quot;extras&quot;:{                 &quot;username&quot;:&quot;BasicAuthUsername&quot;,                 &quot;password&quot;:&quot;BasicAuthPassword&quot;             }         }   // ....... more addre ]</p>
         */
        public Builder clusters(String clusters) {
            this.putQueryParameter("Clusters", clusters);
            this.clusters = clusters;
            return this;
        }

        /**
         * <p>The name of the aggregation instance.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>zyGlobalView</p>
         */
        public Builder groupName(String groupName) {
            this.putQueryParameter("GroupName", groupName);
            this.groupName = groupName;
            return this;
        }

        /**
         * <p>The region ID.</p>
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
         * <p>The resource group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-aek2eq4pecazwfy</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * <p>The list of tags.</p>
         */
        public Builder tag(java.util.List<Tag> tag) {
            this.putQueryParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        @Override
        public AddPrometheusGlobalViewRequest build() {
            return new AddPrometheusGlobalViewRequest(this);
        } 

    } 

    /**
     * 
     * {@link AddPrometheusGlobalViewRequest} extends {@link TeaModel}
     *
     * <p>AddPrometheusGlobalViewRequest</p>
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
             * <p>http.status_code</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The tag value.</p>
             * 
             * <strong>example:</strong>
             * <p>200</p>
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
