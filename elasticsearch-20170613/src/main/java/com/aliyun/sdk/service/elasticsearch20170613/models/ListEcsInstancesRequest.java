// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListEcsInstancesRequest} extends {@link RequestModel}
 *
 * <p>ListEcsInstancesRequest</p>
 */
public class ListEcsInstancesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ecsInstanceIds")
    private String ecsInstanceIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ecsInstanceName")
    private String ecsInstanceName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("page")
    @com.aliyun.core.annotation.Validation(maximum = 200, minimum = 1)
    private Integer page;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("size")
    @com.aliyun.core.annotation.Validation(maximum = 500, minimum = 1)
    private Integer size;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("tags")
    private String tags;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("vpcId")
    private String vpcId;

    private ListEcsInstancesRequest(Builder builder) {
        super(builder);
        this.ecsInstanceIds = builder.ecsInstanceIds;
        this.ecsInstanceName = builder.ecsInstanceName;
        this.page = builder.page;
        this.size = builder.size;
        this.tags = builder.tags;
        this.vpcId = builder.vpcId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListEcsInstancesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return ecsInstanceIds
     */
    public String getEcsInstanceIds() {
        return this.ecsInstanceIds;
    }

    /**
     * @return ecsInstanceName
     */
    public String getEcsInstanceName() {
        return this.ecsInstanceName;
    }

    /**
     * @return page
     */
    public Integer getPage() {
        return this.page;
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

    public static final class Builder extends Request.Builder<ListEcsInstancesRequest, Builder> {
        private String ecsInstanceIds; 
        private String ecsInstanceName; 
        private Integer page; 
        private Integer size; 
        private String tags; 
        private String vpcId; 

        private Builder() {
            super();
        } 

        private Builder(ListEcsInstancesRequest request) {
            super(request);
            this.ecsInstanceIds = request.ecsInstanceIds;
            this.ecsInstanceName = request.ecsInstanceName;
            this.page = request.page;
            this.size = request.size;
            this.tags = request.tags;
            this.vpcId = request.vpcId;
        } 

        /**
         * <p>test</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;i-bp13y63575oypr9d****&quot;,&quot;i-bp1gyhphjaj73jsr****&quot;]</p>
         */
        public Builder ecsInstanceIds(String ecsInstanceIds) {
            this.putQueryParameter("ecsInstanceIds", ecsInstanceIds);
            this.ecsInstanceIds = ecsInstanceIds;
            return this;
        }

        /**
         * <p>[{ &quot;tagKey&quot;:&quot;a&quot;,&quot;tagValue&quot;:&quot;b&quot;}]</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder ecsInstanceName(String ecsInstanceName) {
            this.putQueryParameter("ecsInstanceName", ecsInstanceName);
            this.ecsInstanceName = ecsInstanceName;
            return this;
        }

        /**
         * <p>10</p>
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
         * <p>[&quot;i-bp13y63575oypr9d****&quot;,&quot;i-bp1gyhphjaj73jsr****&quot;]</p>
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
         * <p>vpc-bp16k1dvzxtmagcva****</p>
         * 
         * <strong>example:</strong>
         * <p>[{ &quot;tagKey&quot;:&quot;a&quot;,&quot;tagValue&quot;:&quot;b&quot;}]</p>
         */
        public Builder tags(String tags) {
            this.putQueryParameter("tags", tags);
            this.tags = tags;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-bp16k1dvzxtmagcva****</p>
         */
        public Builder vpcId(String vpcId) {
            this.putQueryParameter("vpcId", vpcId);
            this.vpcId = vpcId;
            return this;
        }

        @Override
        public ListEcsInstancesRequest build() {
            return new ListEcsInstancesRequest(this);
        } 

    } 

}
