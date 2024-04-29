// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeLoginSwitchConfigsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeLoginSwitchConfigsResponseBody</p>
 */
public class DescribeLoginSwitchConfigsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ConfigList")
    private java.util.List < ConfigList> configList;

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

    /**
     * @return configList
     */
    public java.util.List < ConfigList> getConfigList() {
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
        private java.util.List < ConfigList> configList; 
        private Integer count; 
        private String requestId; 

        /**
         * The configuration item returned.
         */
        public Builder configList(java.util.List < ConfigList> configList) {
            this.configList = configList;
            return this;
        }

        /**
         * The number of returned configuration items.
         */
        public Builder count(Integer count) {
            this.count = count;
            return this;
        }

        /**
         * The ID of the request, which is used to locate and troubleshoot issues.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeLoginSwitchConfigsResponseBody build() {
            return new DescribeLoginSwitchConfigsResponseBody(this);
        } 

    } 

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

            /**
             * The type of the alert that you enabled or disabled. Valid values:
             * <p>
             * 
             * *   **login\_common_ip**: alerts for unapproved logon IP addresses
             * *   **login\_common_time**: alerts for unapproved logon time ranges
             * *   **login\_common_account**: alerts for unapproved logon accounts
             */
            public Builder item(String item) {
                this.item = item;
                return this;
            }

            /**
             * The status of the Log Service feature. Valid values:
             * <p>
             * 
             * *   **0**: The feature is disabled.
             * *   **1**: The feature is enabled.
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
