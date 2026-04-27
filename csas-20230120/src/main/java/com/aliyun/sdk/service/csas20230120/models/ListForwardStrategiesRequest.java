// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.csas20230120.models;

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
 * {@link ListForwardStrategiesRequest} extends {@link RequestModel}
 *
 * <p>ListForwardStrategiesRequest</p>
 */
public class ListForwardStrategiesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    private String currentPage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DestinationIds")
    private java.util.List<String> destinationIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DestinationType")
    private String destinationType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ForwardIds")
    private java.util.List<String> forwardIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private String pageSize;

    private ListForwardStrategiesRequest(Builder builder) {
        super(builder);
        this.currentPage = builder.currentPage;
        this.destinationIds = builder.destinationIds;
        this.destinationType = builder.destinationType;
        this.forwardIds = builder.forwardIds;
        this.name = builder.name;
        this.pageSize = builder.pageSize;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListForwardStrategiesRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return currentPage
     */
    public String getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return destinationIds
     */
    public java.util.List<String> getDestinationIds() {
        return this.destinationIds;
    }

    /**
     * @return destinationType
     */
    public String getDestinationType() {
        return this.destinationType;
    }

    /**
     * @return forwardIds
     */
    public java.util.List<String> getForwardIds() {
        return this.forwardIds;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return pageSize
     */
    public String getPageSize() {
        return this.pageSize;
    }

    public static final class Builder extends Request.Builder<ListForwardStrategiesRequest, Builder> {
        private String currentPage; 
        private java.util.List<String> destinationIds; 
        private String destinationType; 
        private java.util.List<String> forwardIds; 
        private String name; 
        private String pageSize; 

        private Builder() {
            super();
        } 

        private Builder(ListForwardStrategiesRequest request) {
            super(request);
            this.currentPage = request.currentPage;
            this.destinationIds = request.destinationIds;
            this.destinationType = request.destinationType;
            this.forwardIds = request.forwardIds;
            this.name = request.name;
            this.pageSize = request.pageSize;
        } 

        /**
         * CurrentPage.
         */
        public Builder currentPage(String currentPage) {
            this.putQueryParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * DestinationIds.
         */
        public Builder destinationIds(java.util.List<String> destinationIds) {
            this.putQueryParameter("DestinationIds", destinationIds);
            this.destinationIds = destinationIds;
            return this;
        }

        /**
         * DestinationType.
         */
        public Builder destinationType(String destinationType) {
            this.putQueryParameter("DestinationType", destinationType);
            this.destinationType = destinationType;
            return this;
        }

        /**
         * ForwardIds.
         */
        public Builder forwardIds(java.util.List<String> forwardIds) {
            this.putQueryParameter("ForwardIds", forwardIds);
            this.forwardIds = forwardIds;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(String pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        @Override
        public ListForwardStrategiesRequest build() {
            return new ListForwardStrategiesRequest(this);
        } 

    } 

}
