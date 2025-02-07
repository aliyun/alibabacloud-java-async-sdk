// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.clickhouse20191111.models;

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
 * {@link ModifyDBClusterConfigInXMLRequest} extends {@link RequestModel}
 *
 * <p>ModifyDBClusterConfigInXMLRequest</p>
 */
public class ModifyDBClusterConfigInXMLRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Config")
    @com.aliyun.core.annotation.Validation(required = true)
    private String config;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBClusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Reason")
    private String reason;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    private ModifyDBClusterConfigInXMLRequest(Builder builder) {
        super(builder);
        this.config = builder.config;
        this.DBClusterId = builder.DBClusterId;
        this.reason = builder.reason;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyDBClusterConfigInXMLRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return config
     */
    public String getConfig() {
        return this.config;
    }

    /**
     * @return DBClusterId
     */
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    /**
     * @return reason
     */
    public String getReason() {
        return this.reason;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<ModifyDBClusterConfigInXMLRequest, Builder> {
        private String config; 
        private String DBClusterId; 
        private String reason; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(ModifyDBClusterConfigInXMLRequest request) {
            super(request);
            this.config = request.config;
            this.DBClusterId = request.DBClusterId;
            this.reason = request.reason;
            this.regionId = request.regionId;
        } 

        /**
         * <p>The configuration parameters whose settings you want to modify. You can call the <a href="https://help.aliyun.com/document_detail/452210.html">DescribeDBClusterConfigInXML</a> operation to query configuration parameters, and modify the settings of the returned configuration parameters.</p>
         * <blockquote>
         * <p>You must specify all configuration parameters even when you want to modify the setting of a single parameter. If a configuration parameter is not specified, the original value of this parameter is retained or the modification fails.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <?xml version="1.0"?>
         * <yandex>
         *     <keep_alive_timeout>400</keep_alive_timeout>
         *     <listen_backlog>4096</listen_backlog>
         *     <logger>
         *         <level>debug</level>
         *         <size>1000M</size>
         *     </logger>
         *     <mark_cache_size>5368709120</mark_cache_size>
         *     <max_concurrent_queries>201</max_concurrent_queries>
         *     <max_connections>4096</max_connections>
         *     <max_partition_size_to_drop>0</max_partition_size_to_drop>
         *     <max_table_size_to_drop>0</max_table_size_to_drop>
         *     <merge_tree>
         *         <max_delay_to_insert>256</max_delay_to_insert>
         *         <max_part_loading_threads>auto</max_part_loading_threads>
         *         <max_suspicious_broken_parts>100</max_suspicious_broken_parts>
         *         <zookeeper_session_expiration_check_period>1</zookeeper_session_expiration_check_period>
         *     </merge_tree>
         *     <uncompressed_cache_size>1717986918</uncompressed_cache_size>
         * </yandex>
         */
        public Builder config(String config) {
            this.putQueryParameter("Config", config);
            this.config = config;
            return this;
        }

        /**
         * <p>The cluster ID. You can call the <a href="https://help.aliyun.com/document_detail/170879.html">DescribeDBClusters</a> operation to query information about all the clusters that are deployed in a specific region. The information includes the cluster IDs.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cc-bp108z124a8o7****</p>
         */
        public Builder DBClusterId(String DBClusterId) {
            this.putQueryParameter("DBClusterId", DBClusterId);
            this.DBClusterId = DBClusterId;
            return this;
        }

        /**
         * <p>The reason for the modification.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder reason(String reason) {
            this.putQueryParameter("Reason", reason);
            this.reason = reason;
            return this;
        }

        /**
         * <p>The region ID of the cluster. You can call the <a href="https://help.aliyun.com/document_detail/170875.html">DescribeRegions</a> operation to query the most recent region list.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public ModifyDBClusterConfigInXMLRequest build() {
            return new ModifyDBClusterConfigInXMLRequest(this);
        } 

    } 

}
