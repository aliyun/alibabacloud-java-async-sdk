// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

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
 * {@link ListInstanceRequest} extends {@link RequestModel}
 *
 * <p>ListInstanceRequest</p>
 */
public class ListInstanceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("esVersion")
    private String esVersion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("instanceCategory")
    private String instanceCategory;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("instanceId")
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("page")
    private Integer page;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("paymentType")
    private String paymentType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("resourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("size")
    private Integer size;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("tags")
    private String tags;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("vpcId")
    private String vpcId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("zoneId")
    private String zoneId;

    private ListInstanceRequest(Builder builder) {
        super(builder);
        this.description = builder.description;
        this.esVersion = builder.esVersion;
        this.instanceCategory = builder.instanceCategory;
        this.instanceId = builder.instanceId;
        this.page = builder.page;
        this.paymentType = builder.paymentType;
        this.resourceGroupId = builder.resourceGroupId;
        this.size = builder.size;
        this.tags = builder.tags;
        this.vpcId = builder.vpcId;
        this.zoneId = builder.zoneId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListInstanceRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return esVersion
     */
    public String getEsVersion() {
        return this.esVersion;
    }

    /**
     * @return instanceCategory
     */
    public String getInstanceCategory() {
        return this.instanceCategory;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return page
     */
    public Integer getPage() {
        return this.page;
    }

    /**
     * @return paymentType
     */
    public String getPaymentType() {
        return this.paymentType;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return size
     */
    public Integer getSize() {
        return this.size;
    }

    /**
     * @return tags
     */
    public String getTags() {
        return this.tags;
    }

    /**
     * @return vpcId
     */
    public String getVpcId() {
        return this.vpcId;
    }

    /**
     * @return zoneId
     */
    public String getZoneId() {
        return this.zoneId;
    }

    public static final class Builder extends Request.Builder<ListInstanceRequest, Builder> {
        private String description; 
        private String esVersion; 
        private String instanceCategory; 
        private String instanceId; 
        private Integer page; 
        private String paymentType; 
        private String resourceGroupId; 
        private Integer size; 
        private String tags; 
        private String vpcId; 
        private String zoneId; 

        private Builder() {
            super();
        } 

        private Builder(ListInstanceRequest request) {
            super(request);
            this.description = request.description;
            this.esVersion = request.esVersion;
            this.instanceCategory = request.instanceCategory;
            this.instanceId = request.instanceId;
            this.page = request.page;
            this.paymentType = request.paymentType;
            this.resourceGroupId = request.resourceGroupId;
            this.size = request.size;
            this.tags = request.tags;
            this.vpcId = request.vpcId;
            this.zoneId = request.zoneId;
        } 

        /**
         * <p>cn-hangzhou-i</p>
         * 
         * <strong>example:</strong>
         * <p>aliyunes_test1</p>
         */
        public Builder description(String description) {
            this.putQueryParameter("description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>advanced</p>
         * 
         * <strong>example:</strong>
         * <p>6.7_with_X-Pack</p>
         */
        public Builder esVersion(String esVersion) {
            this.putQueryParameter("esVersion", esVersion);
            this.esVersion = esVersion;
            return this;
        }

        /**
         * <p>The number of data nodes.</p>
         * 
         * <strong>example:</strong>
         * <p>advanced</p>
         */
        public Builder instanceCategory(String instanceCategory) {
            this.putQueryParameter("instanceCategory", instanceCategory);
            this.instanceCategory = instanceCategory;
            return this;
        }

        /**
         * <p>postpaid</p>
         * 
         * <strong>example:</strong>
         * <p>es-cn-v641a0ta3000g****</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("instanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>[{&quot;tagKey&quot;:&quot;key1&quot;,&quot;tagValue&quot;:&quot;value1&quot;}]</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder page(Integer page) {
            this.putQueryParameter("page", page);
            this.page = page;
            return this;
        }

        /**
         * <p>Specifies whether to include dedicated master nodes. Valid values:</p>
         * <ul>
         * <li>true: The files contain data that is dumped to the IA storage medium.</li>
         * <li>false: The files do not contain data that is dumped to the IA storage medium.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>postpaid</p>
         */
        public Builder paymentType(String paymentType) {
            this.putQueryParameter("paymentType", paymentType);
            this.paymentType = paymentType;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-aekzvowej3i****</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("resourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * <p>vpc-bp16k1dvzxtmagcva****</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder size(Integer size) {
            this.putQueryParameter("size", size);
            this.size = size;
            return this;
        }

        /**
         * <p>The header of the response.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;tagKey&quot;:&quot;key1&quot;,&quot;tagValue&quot;:&quot;value1&quot;}]</p>
         */
        public Builder tags(String tags) {
            this.putQueryParameter("tags", tags);
            this.tags = tags;
            return this;
        }

        /**
         * <p>The number of entries returned per page.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-bp16k1dvzxtmagcva****</p>
         */
        public Builder vpcId(String vpcId) {
            this.putQueryParameter("vpcId", vpcId);
            this.vpcId = vpcId;
            return this;
        }

        /**
         * <p>The returned data.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou-i</p>
         */
        public Builder zoneId(String zoneId) {
            this.putQueryParameter("zoneId", zoneId);
            this.zoneId = zoneId;
            return this;
        }

        @Override
        public ListInstanceRequest build() {
            return new ListInstanceRequest(this);
        } 

    } 

}
