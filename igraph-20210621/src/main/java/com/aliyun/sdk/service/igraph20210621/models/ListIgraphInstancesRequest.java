// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.igraph20210621.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListIgraphInstancesRequest} extends {@link RequestModel}
 *
 * <p>ListIgraphInstancesRequest</p>
 */
public class ListIgraphInstancesRequest extends Request {
    @Query
    @NameInMap("pageContinue")
    private String pageContinue;

    @Query
    @NameInMap("pageLimit")
    private String pageLimit;

    @Query
    @NameInMap("resourceGroupId")
    private String resourceGroupId;

    @Query
    @NameInMap("tags")
    private java.util.List < Tags> tags;

    private ListIgraphInstancesRequest(Builder builder) {
        super(builder);
        this.pageContinue = builder.pageContinue;
        this.pageLimit = builder.pageLimit;
        this.resourceGroupId = builder.resourceGroupId;
        this.tags = builder.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListIgraphInstancesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return pageContinue
     */
    public String getPageContinue() {
        return this.pageContinue;
    }

    /**
     * @return pageLimit
     */
    public String getPageLimit() {
        return this.pageLimit;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return tags
     */
    public java.util.List < Tags> getTags() {
        return this.tags;
    }

    public static final class Builder extends Request.Builder<ListIgraphInstancesRequest, Builder> {
        private String pageContinue; 
        private String pageLimit; 
        private String resourceGroupId; 
        private java.util.List < Tags> tags; 

        private Builder() {
            super();
        } 

        private Builder(ListIgraphInstancesRequest request) {
            super(request);
            this.pageContinue = request.pageContinue;
            this.pageLimit = request.pageLimit;
            this.resourceGroupId = request.resourceGroupId;
            this.tags = request.tags;
        } 

        /**
         * pageContinue.
         */
        public Builder pageContinue(String pageContinue) {
            this.putQueryParameter("pageContinue", pageContinue);
            this.pageContinue = pageContinue;
            return this;
        }

        /**
         * pageLimit.
         */
        public Builder pageLimit(String pageLimit) {
            this.putQueryParameter("pageLimit", pageLimit);
            this.pageLimit = pageLimit;
            return this;
        }

        /**
         * resourceGroupId.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("resourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * tags.
         */
        public Builder tags(java.util.List < Tags> tags) {
            String tagsShrink = shrink(tags, "tags", "json");
            this.putQueryParameter("tags", tagsShrink);
            this.tags = tags;
            return this;
        }

        @Override
        public ListIgraphInstancesRequest build() {
            return new ListIgraphInstancesRequest(this);
        } 

    } 

    public static class Tags extends TeaModel {
        @NameInMap("key")
        private String key;

        @NameInMap("value")
        private String value;

        private Tags(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tags create() {
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
             * key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
}
