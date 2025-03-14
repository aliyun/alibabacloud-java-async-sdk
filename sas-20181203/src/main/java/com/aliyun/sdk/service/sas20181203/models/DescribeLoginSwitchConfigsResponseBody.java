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
 * {@link DescribeLoginSwitchConfigsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeLoginSwitchConfigsResponseBody</p>
 */
public class DescribeLoginSwitchConfigsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ConfigList")
    private java.util.List<ConfigList> configList;

    @com.aliyun.core.annotation.NameInMap("Count")
    private Integer count;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeLoginSwitchConfigsResponseBody(Builder builder) {
        this.configList = builder.configList;
        this.count = builder.count;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeLoginSwitchConfigsResponseBody create() {
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
     * @return count
     */
    public Integer getCount() {
        return this.count;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<ConfigList> configList; 
        private Integer count; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeLoginSwitchConfigsResponseBody model) {
            this.configList = model.configList;
            this.count = model.count;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The configuration item returned.</p>
         */
        public Builder configList(java.util.List<ConfigList> configList) {
            this.configList = configList;
            return this;
        }

        /**
         * <p>The number of returned configuration items.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder count(Integer count) {
            this.count = count;
            return this;
        }

        /**
         * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>0B48AB3C-84FC-424D-A01D-B9270EF4****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeLoginSwitchConfigsResponseBody build() {
            return new DescribeLoginSwitchConfigsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeLoginSwitchConfigsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeLoginSwitchConfigsResponseBody</p>
     */
    public static class ConfigList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Item")
        private String item;

        @com.aliyun.core.annotation.NameInMap("Status")
        private Integer status;

        private ConfigList(Builder builder) {
            this.item = builder.item;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ConfigList create() {
            return builder().build();
        }

        /**
         * @return item
         */
        public String getItem() {
            return this.item;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String item; 
            private Integer status; 

            private Builder() {
            } 

            private Builder(ConfigList model) {
                this.item = model.item;
                this.status = model.status;
            } 

            /**
             * <p>The type of the alert that you enabled or disabled. Valid values:</p>
             * <ul>
             * <li><strong>login_common_ip</strong>: alerts for unapproved logon IP addresses</li>
             * <li><strong>login_common_time</strong>: alerts for unapproved logon time ranges</li>
             * <li><strong>login_common_account</strong>: alerts for unapproved logon accounts</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>login_common_ip</p>
             */
            public Builder item(String item) {
                this.item = item;
                return this;
            }

            /**
             * <p>The status of the Log Service feature. Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: The feature is disabled.</li>
             * <li><strong>1</strong>: The feature is enabled.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            public ConfigList build() {
                return new ConfigList(this);
            } 

        } 

    }
}
