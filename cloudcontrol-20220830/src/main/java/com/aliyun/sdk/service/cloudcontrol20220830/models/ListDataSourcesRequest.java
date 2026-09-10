// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudcontrol20220830.models;

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
 * {@link ListDataSourcesRequest} extends {@link RequestModel}
 *
 * <p>ListDataSourcesRequest</p>
 */
public class ListDataSourcesRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("requestPath")
    private String requestPath;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("attributeName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String attributeName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("filter")
    private java.util.Map<String, ?> filter;

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
    public java.util.Map<String, ?> getFilter() {
        return this.filter;
    }

    public static final class Builder extends Request.Builder<ListDataSourcesRequest, Builder> {
        private String requestPath; 
        private String attributeName; 
        private java.util.Map<String, ?> filter; 

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
         * <p>The URL of the request. The format is /api/v1/providers/{provider}/products/{product}/dataSources/{resourceType}.</p>
         * <p>The variables in the URL are described as follows:</p>
         * <p>provider: The cloud service provider. Only <code>Aliyun</code> is supported.</p>
         * <p>product: The product code.</p>
         * <p>resourceType: The resource type.</p>
         * <p>Example for a Redis DBInstance:</p>
         * <p><code>/api/v1/providers/Aliyun/products/Redis/dataSources/DBInstance</code></p>
         * 
         * <strong>example:</strong>
         * <p>/api/v1/providers/Aliyun/products/Redis/dataSources/DBInstance</p>
         */
        public Builder requestPath(String requestPath) {
            this.putPathParameter("requestPath", requestPath);
            this.requestPath = requestPath;
            return this;
        }

        /**
         * <p>The name of the attribute. Only <code>RegionId</code> is supported.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>RegionId</p>
         */
        public Builder attributeName(String attributeName) {
            this.putQueryParameter("attributeName", attributeName);
            this.attributeName = attributeName;
            return this;
        }

        /**
         * <p>The filter condition. The value must be a JSON string in the {&quot;key1&quot;:&quot;value1&quot;} format.</p>
         */
        public Builder filter(java.util.Map<String, ?> filter) {
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
