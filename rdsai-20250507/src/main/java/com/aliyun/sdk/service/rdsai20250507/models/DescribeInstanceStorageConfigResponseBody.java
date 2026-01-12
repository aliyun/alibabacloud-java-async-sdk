// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rdsai20250507.models;

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
 * {@link DescribeInstanceStorageConfigResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeInstanceStorageConfigResponseBody</p>
 */
public class DescribeInstanceStorageConfigResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ConfigList")
    private java.util.List<ConfigList> configList;

    @com.aliyun.core.annotation.NameInMap("InstanceName")
    private String instanceName;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeInstanceStorageConfigResponseBody(Builder builder) {
        this.configList = builder.configList;
        this.instanceName = builder.instanceName;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeInstanceStorageConfigResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return configList
     */
    public java.util.List<ConfigList> getConfigList() {
        return this.configList;
    }

    /**
     * @return instanceName
     */
    public String getInstanceName() {
        return this.instanceName;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<ConfigList> configList; 
        private String instanceName; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeInstanceStorageConfigResponseBody model) {
            this.configList = model.configList;
            this.instanceName = model.instanceName;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The storage configurations.</p>
         */
        public Builder configList(java.util.List<ConfigList> configList) {
            this.configList = configList;
            return this;
        }

        /**
         * <p>The ID of the RDS Supabase instance.</p>
         * 
         * <strong>example:</strong>
         * <p>ra-supabase-8moov5lxba****</p>
         */
        public Builder instanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>FE9C65D7-930F-57A5-A207-8C396329241C</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeInstanceStorageConfigResponseBody build() {
            return new DescribeInstanceStorageConfigResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeInstanceStorageConfigResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeInstanceStorageConfigResponseBody</p>
     */
    public static class ConfigList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private ConfigList(Builder builder) {
            this.name = builder.name;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ConfigList create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String name; 
            private String value; 

            private Builder() {
            } 

            private Builder(ConfigList model) {
                this.name = model.name;
                this.value = model.value;
            } 

            /**
             * <p>The configuration item name. Valid values:</p>
             * <ul>
             * <li><strong>AWS_SESSION_TOKEN</strong>: temporary OSS access token (session token).</li>
             * <li><strong>AWS_ACCESS_KEY_ID</strong>: the AccessKey ID of OSS.</li>
             * <li><strong>AWS_SECRET_ACCESS_KEY</strong>: the AccessKey secret of OSS.</li>
             * <li><strong>GLOBAL_S3_BUCKET</strong>: the name of the OSS bucket.</li>
             * <li><strong>TENANT_ID</strong>: the tenant ID of the OSS Prefix (prefix or directory).</li>
             * <li><strong>GLOBAL_S3_ENDPOINT</strong>: the endpoint of OSS.</li>
             * <li><strong>REGION</strong>: the region of OSS.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>REGION</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The value of the configuration item.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-beijing</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public ConfigList build() {
                return new ConfigList(this);
            } 

        } 

    }
}
