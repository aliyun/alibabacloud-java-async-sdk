// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link ListClusterPluginInfoRequest} extends {@link RequestModel}
 *
 * <p>ListClusterPluginInfoRequest</p>
 */
public class ListClusterPluginInfoRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClusterIds")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> clusterIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PluginName")
    private String pluginName;

    private ListClusterPluginInfoRequest(Builder builder) {
        super(builder);
        this.clusterIds = builder.clusterIds;
        this.lang = builder.lang;
        this.pluginName = builder.pluginName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListClusterPluginInfoRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clusterIds
     */
    public java.util.List<String> getClusterIds() {
        return this.clusterIds;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return pluginName
     */
    public String getPluginName() {
        return this.pluginName;
    }

    public static final class Builder extends Request.Builder<ListClusterPluginInfoRequest, Builder> {
        private java.util.List<String> clusterIds; 
        private String lang; 
        private String pluginName; 

        private Builder() {
            super();
        } 

        private Builder(ListClusterPluginInfoRequest request) {
            super(request);
            this.clusterIds = request.clusterIds;
            this.lang = request.lang;
            this.pluginName = request.pluginName;
        } 

        /**
         * <p>The IDs of the clusters.</p>
         * <p>This parameter is required.</p>
         */
        public Builder clusterIds(java.util.List<String> clusterIds) {
            this.putQueryParameter("ClusterIds", clusterIds);
            this.clusterIds = clusterIds;
            return this;
        }

        /**
         * <p>The language of the content within the request and response. Default value: <strong>zh</strong>. Valid values:</p>
         * <ul>
         * <li><strong>zh</strong>: Chinese</li>
         * <li><strong>en</strong>: English</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>zh</p>
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * <p>The name of the plug-in.</p>
         * 
         * <strong>example:</strong>
         * <p>alihips</p>
         */
        public Builder pluginName(String pluginName) {
            this.putQueryParameter("PluginName", pluginName);
            this.pluginName = pluginName;
            return this;
        }

        @Override
        public ListClusterPluginInfoRequest build() {
            return new ListClusterPluginInfoRequest(this);
        } 

    } 

}
