// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

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
 * {@link DescribePolarClawPluginsRequest} extends {@link RequestModel}
 *
 * <p>DescribePolarClawPluginsRequest</p>
 */
public class DescribePolarClawPluginsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ApplicationId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String applicationId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PluginList")
    private java.util.List<String> pluginList;

    private DescribePolarClawPluginsRequest(Builder builder) {
        super(builder);
        this.applicationId = builder.applicationId;
        this.pluginList = builder.pluginList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribePolarClawPluginsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return applicationId
     */
    public String getApplicationId() {
        return this.applicationId;
    }

    /**
     * @return pluginList
     */
    public java.util.List<String> getPluginList() {
        return this.pluginList;
    }

    public static final class Builder extends Request.Builder<DescribePolarClawPluginsRequest, Builder> {
        private String applicationId; 
        private java.util.List<String> pluginList; 

        private Builder() {
            super();
        } 

        private Builder(DescribePolarClawPluginsRequest request) {
            super(request);
            this.applicationId = request.applicationId;
            this.pluginList = request.pluginList;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>pa-**************</p>
         */
        public Builder applicationId(String applicationId) {
            this.putQueryParameter("ApplicationId", applicationId);
            this.applicationId = applicationId;
            return this;
        }

        /**
         * PluginList.
         */
        public Builder pluginList(java.util.List<String> pluginList) {
            this.putQueryParameter("PluginList", pluginList);
            this.pluginList = pluginList;
            return this;
        }

        @Override
        public DescribePolarClawPluginsRequest build() {
            return new DescribePolarClawPluginsRequest(this);
        } 

    } 

}
