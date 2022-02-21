// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListAckNamespacesRequest} extends {@link RequestModel}
 *
 * <p>ListAckNamespacesRequest</p>
 */
public class ListAckNamespacesRequest extends Request {
    @Path
    @NameInMap("ClusterId")
    @Validation(required = true)
    private String clusterId;

    @Query
    @NameInMap("page")
    @Validation(maximum = 200, minimum = 1)
    private Integer page;

    @Query
    @NameInMap("size")
    @Validation(maximum = 500, minimum = 1)
    private Integer size;

    private ListAckNamespacesRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.page = builder.page;
        this.size = builder.size;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAckNamespacesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
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

    public static final class Builder extends Request.Builder<ListAckNamespacesRequest, Builder> {
        private String clusterId; 
        private Integer page; 
        private Integer size; 

        private Builder() {
            super();
        } 

        private Builder(ListAckNamespacesRequest response) {
            super(response);
            this.clusterId = response.clusterId;
            this.page = response.page;
            this.size = response.size;
        } 

        /**
         * ClusterId.
         */
        public Builder clusterId(String clusterId) {
            this.putPathParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * page.
         */
        public Builder page(Integer page) {
            this.putQueryParameter("page", page);
            this.page = page;
            return this;
        }

        /**
         * size.
         */
        public Builder size(Integer size) {
            this.putQueryParameter("size", size);
            this.size = size;
            return this;
        }

        @Override
        public ListAckNamespacesRequest build() {
            return new ListAckNamespacesRequest(this);
        } 

    } 

}
