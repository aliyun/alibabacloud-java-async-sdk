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
 * {@link DescribeConfigVersionDifferenceResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeConfigVersionDifferenceResponseBody</p>
 */
public class DescribeConfigVersionDifferenceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("NewConfigXML")
    private String newConfigXML;

    @com.aliyun.core.annotation.NameInMap("OldConfigXML")
    private String oldConfigXML;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeConfigVersionDifferenceResponseBody(Builder builder) {
        this.newConfigXML = builder.newConfigXML;
        this.oldConfigXML = builder.oldConfigXML;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeConfigVersionDifferenceResponseBody create() {
        return builder().build();
    }

    /**
     * @return newConfigXML
     */
    public String getNewConfigXML() {
        return this.newConfigXML;
    }

    /**
     * @return oldConfigXML
     */
    public String getOldConfigXML() {
        return this.oldConfigXML;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String newConfigXML; 
        private String oldConfigXML; 
        private String requestId; 

        /**
         * <p>The values of the configuration parameters after the values of the configuration parameters are changed.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;<?xml version="1.0"?>
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
         * </yandex>&quot;</p>
         */
        public Builder newConfigXML(String newConfigXML) {
            this.newConfigXML = newConfigXML;
            return this;
        }

        /**
         * <p>The values of the configuration parameters before the values of the configuration parameters are changed.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;<?xml version="1.0"?>
         * <yandex>
         *     <keep_alive_timeout>300</keep_alive_timeout>
         *     <listen_backlog>4096</listen_backlog>
         *     <logger>
         *         <level>debug</level>
         *         <size>1000M</size>
         *     </logger>
         *     <mark_cache_size>5368709120</mark_cache_size>
         *     <max_concurrent_queries>150</max_concurrent_queries>
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
         * </yandex>&quot;</p>
         */
        public Builder oldConfigXML(String oldConfigXML) {
            this.oldConfigXML = oldConfigXML;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>D0CEC6AC-7760-409A-A0D5-E6CD8660E9CC</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeConfigVersionDifferenceResponseBody build() {
            return new DescribeConfigVersionDifferenceResponseBody(this);
        } 

    } 

}
