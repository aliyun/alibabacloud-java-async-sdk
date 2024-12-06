// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListNodesRequest} extends {@link RequestModel}
 *
 * <p>ListNodesRequest</p>
 */
public class ListNodesRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("ResId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String resId;

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
    @com.aliyun.core.annotation.Validation(maximum = 10000, minimum = 1)
    private Integer size;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("tags")
    private String tags;

    private ListNodesRequest(Builder builder) {
        super(builder);
        this.resId = builder.resId;
        this.ecsInstanceIds = builder.ecsInstanceIds;
        this.ecsInstanceName = builder.ecsInstanceName;
        this.page = builder.page;
        this.size = builder.size;
        this.tags = builder.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListNodesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return resId
     */
    public String getResId() {
        return this.resId;
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

    public static final class Builder extends Request.Builder<ListNodesRequest, Builder> {
        private String resId; 
        private String ecsInstanceIds; 
        private String ecsInstanceName; 
        private Integer page; 
        private Integer size; 
        private String tags; 

        private Builder() {
            super();
        } 

        private Builder(ListNodesRequest request) {
            super(request);
            this.resId = request.resId;
            this.ecsInstanceIds = request.ecsInstanceIds;
            this.ecsInstanceName = request.ecsInstanceName;
            this.page = request.page;
            this.size = request.size;
            this.tags = request.tags;
        } 

        /**
         * <p>The ID of the shipper.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ct-cn-l871nd0u73c45****</p>
         */
        public Builder resId(String resId) {
            this.putPathParameter("ResId", resId);
            this.resId = resId;
            return this;
        }

        /**
         * <p>The IDs of the ECS instances.</p>
         * 
         * <strong>example:</strong>
         * <p>i-bp1ei8ysh7orb6eq****</p>
         */
        public Builder ecsInstanceIds(String ecsInstanceIds) {
            this.putQueryParameter("ecsInstanceIds", ecsInstanceIds);
            this.ecsInstanceIds = ecsInstanceIds;
            return this;
        }

        /**
         * <p>The name of the ECS instance.</p>
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
         * <p>The number of the page to return.</p>
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
         * <p>The number of entries to return on each page.</p>
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
         * <p>The tags of the ECS instance. You must configure tagKey and tagValue.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;tagKey&quot;:&quot;abc&quot;,&quot;tagValue&quot;:&quot;xyz&quot;}]</p>
         */
        public Builder tags(String tags) {
            this.putQueryParameter("tags", tags);
            this.tags = tags;
            return this;
        }

        @Override
        public ListNodesRequest build() {
            return new ListNodesRequest(this);
        } 

    } 

}
