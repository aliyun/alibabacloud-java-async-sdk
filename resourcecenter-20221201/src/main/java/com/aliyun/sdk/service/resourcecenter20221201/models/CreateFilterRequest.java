// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcecenter20221201.models;

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
 * {@link CreateFilterRequest} extends {@link RequestModel}
 *
 * <p>CreateFilterRequest</p>
 */
public class CreateFilterRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FilterConfiguration")
    @com.aliyun.core.annotation.Validation(required = true)
    private String filterConfiguration;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FilterName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String filterName;

    private CreateFilterRequest(Builder builder) {
        super(builder);
        this.filterConfiguration = builder.filterConfiguration;
        this.filterName = builder.filterName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateFilterRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return filterConfiguration
     */
    public String getFilterConfiguration() {
        return this.filterConfiguration;
    }

    /**
     * @return filterName
     */
    public String getFilterName() {
        return this.filterName;
    }

    public static final class Builder extends Request.Builder<CreateFilterRequest, Builder> {
        private String filterConfiguration; 
        private String filterName; 

        private Builder() {
            super();
        } 

        private Builder(CreateFilterRequest request) {
            super(request);
            this.filterConfiguration = request.filterConfiguration;
            this.filterName = request.filterName;
        } 

        /**
         * <p>The configurations of the filter.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *   &quot;regions&quot;: [],
         *   &quot;tagFilters&quot;: [
         *     [{ &quot;type&quot;: &quot;notContainTagKey&quot;, &quot;tagKey&quot;: &quot;xxx&quot;, &quot;tagValue&quot;: &quot;&quot; }],
         *     [{ &quot;tagKey&quot;: &quot;xxx&quot;, &quot;tagValue&quot;: &quot;xxx&quot; }]
         *   ],
         *   &quot;resourceTypes&quot;: [
         *     &quot;ACS::ECS::AutoSnapshotPolicy&quot;
         *   ]
         * }</p>
         */
        public Builder filterConfiguration(String filterConfiguration) {
            this.putQueryParameter("FilterConfiguration", filterConfiguration);
            this.filterConfiguration = filterConfiguration;
            return this;
        }

        /**
         * <p>The name of the filter.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ECS</p>
         */
        public Builder filterName(String filterName) {
            this.putQueryParameter("FilterName", filterName);
            this.filterName = filterName;
            return this;
        }

        @Override
        public CreateFilterRequest build() {
            return new CreateFilterRequest(this);
        } 

    } 

}
