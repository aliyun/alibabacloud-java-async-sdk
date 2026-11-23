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
         * <p>The configuration parameters to be modified. You can call the <a href="https://help.aliyun.com/document_detail/452210.html">DescribeDBClusterConfigInXML</a> operation to query the configuration parameters and modify the returned parameters.</p>
         * <blockquote>
         * <p>To modify a single parameter, you must pass all configuration parameters. Parameters that are not passed retain their original values or cause the configuration parameter modification to fail.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <?xml version="1.0"?><p> <yandex>  <logger>    <level>debug</level>    <size>1000M</size>  </logger>  <listen_backlog>64</listen_backlog>  <max_connections>4096</max_connections>  <keep_alive_timeout>300</keep_alive_timeout>  <max_concurrent_queries>100</max_concurrent_queries>  <max_server_memory_usage>0</max_server_memory_usage>  <max_thread_pool_size>10000</max_thread_pool_size>  <max_server_memory_usage_to_ram_ratio>0.9</max_server_memory_usage_to_ram_ratio>  <total_memory_profiler_step>4194304</total_memory_profiler_step>  <total_memory_tracker_sample_probability>0</total_memory_tracker_sample_probability>  <query_log>    <database>system</database>    <table>query_log</table>    <engine>ENGINE = MergeTree PARTITION BY event_date ORDER BY event_time TTL event_time + INTERVAL 15 DAY</engine>    <flush_interval_milliseconds>7500</flush_interval_milliseconds>  </query_log>  <query_thread_log>    <database>system</database>    <table>query_thread_log</table>    <engine>ENGINE = MergeTree PARTITION BY event_date ORDER BY event_time TTL event_time + INTERVAL 15 DAY</engine>    <flush_interval_milliseconds>7500</flush_interval_milliseconds>  </query_thread_log>  <max_table_size_to_drop>0</max_table_size_to_drop>  <max_partition_size_to_drop>0</max_partition_size_to_drop>  <merge_tree>    <max_delay_to_insert>256</max_delay_to_insert>    <max_suspicious_broken_parts>100</max_suspicious_broken_parts>    <zookeeper_session_expiration_check_period>1</zookeeper_session_expiration_check_period>    <max_part_loading_threads>16</max_part_loading_threads>  </merge_tree>  <mark_cache_size>6871947673</mark_cache_size>  <uncompressed_cache_size>3435973836</uncompressed_cache_size></yandex></p>
         */
        public Builder config(String config) {
            this.putQueryParameter("Config", config);
            this.config = config;
            return this;
        }

        /**
         * <p>The cluster ID.
         * You can call the <a href="https://help.aliyun.com/document_detail/170879.html">DescribeDBClusters</a> operation to query all clusters in the target region, including their cluster IDs.</p>
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
         * <p>The description of the modification.</p>
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
         * <p>The region ID. You can call the <a href="https://help.aliyun.com/document_detail/170875.html">DescribeRegions</a> operation to query the region ID.</p>
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
