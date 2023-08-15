// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudcontrol20220830.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListDataSourcesRequest} extends {@link RequestModel}
 *
 * <p>ListDataSourcesRequest</p>
 */
public class ListDataSourcesRequest extends Request {
    @Path
    @NameInMap("requestPath")
    private String requestPath;

    @Query
    @NameInMap("attributeName")
    @Validation(required = true)
    private String attributeName;

    @Query
    @NameInMap("filter")
    private java.util.Map < String, ? > filter;

    private ListDataSourcesRequest(Builder builder) {
        super(builder);
        this.requestPath = builder.requestPath;
        this.attributeName = builder.attributeName;
        this.filter = builder.filter;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDataSourcesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return requestPath
     */
    public String getRequestPath() {
        return this.requestPath;
    }

    /**
     * @return attributeName
     */
    public String getAttributeName() {
        return this.attributeName;
    }

    /**
     * @return filter
     */
    public java.util.Map < String, ? > getFilter() {
        return this.filter;
    }

    public static final class Builder extends Request.Builder<ListDataSourcesRequest, Builder> {
        private String requestPath; 
        private String attributeName; 
        private java.util.Map < String, ? > filter; 

        private Builder() {
            super();
        } 

        private Builder(ListDataSourcesRequest request) {
            super(request);
            this.requestPath = request.requestPath;
            this.attributeName = request.attributeName;
            this.filter = request.filter;
        } 

        /**
         * requestPath.
         */
        public Builder requestPath(String requestPath) {
            this.putPathParameter("requestPath", requestPath);
            this.requestPath = requestPath;
            return this;
        }

        /**
         * attributeName.
         */
        public Builder attributeName(String attributeName) {
            this.putQueryParameter("attributeName", attributeName);
            this.attributeName = attributeName;
            return this;
        }

        /**
         * filter.
         */
        public Builder filter(java.util.Map < String, ? > filter) {
            String filterShrink = shrink(filter, "filter", "json");
            this.putQueryParameter("filter", filterShrink);
            this.filter = filter;
            return this;
        }

        @Override
        public ListDataSourcesRequest build() {
            return new ListDataSourcesRequest(this);
        } 

    } 

}
