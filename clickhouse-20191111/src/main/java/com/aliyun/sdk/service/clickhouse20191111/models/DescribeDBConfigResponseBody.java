// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.clickhouse20191111.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeDBConfigResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDBConfigResponseBody</p>
 */
public class DescribeDBConfigResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Config")
    private String config;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeDBConfigResponseBody(Builder builder) {
        this.config = builder.config;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDBConfigResponseBody create() {
        return builder().build();
    }

    /**
     * @return config
     */
    public String getConfig() {
        return this.config;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String config; 
        private String requestId; 

        /**
         * <p>The configuration information about the cluster.</p>
         * 
         * <strong>example:</strong>
         * <p><dictionaries><dictionary><name>test</name><source><clickhouse><host>10.37.XX.XX</host><port>9000</port><user>default</user><password></password><db>default</db><table>t_organization</table><where>id=1</where><invalidate_query>SQL_QUERY</invalidate_query></clickhouse></source><lifetime><min>31</min><max>33</max></lifetime><layout><flat></flat></layout><structure><key><attribute><name>field1</name><type>String</type></attribute></key></structure></dictionary></dictionaries></p>
         */
        public Builder config(String config) {
            this.config = config;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>16060117-92E1-5F3B-BF42-28B172D0F869</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeDBConfigResponseBody build() {
            return new DescribeDBConfigResponseBody(this);
        } 

    } 

}
