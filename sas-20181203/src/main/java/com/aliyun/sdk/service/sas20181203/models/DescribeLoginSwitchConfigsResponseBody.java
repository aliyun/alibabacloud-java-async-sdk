// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeLoginSwitchConfigsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeLoginSwitchConfigsResponseBody</p>
 */
public class DescribeLoginSwitchConfigsResponseBody extends TeaModel {
    @NameInMap("ConfigList")
    private java.util.List < ConfigList> configList;

    @NameInMap("Count")
    private Integer count;

    @NameInMap("RequestId")
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
         * ConfigList.
         */
        public Builder configList(java.util.List < ConfigList> configList) {
            this.configList = configList;
            return this;
        }

        /**
         * Count.
         */
        public Builder count(Integer count) {
            this.count = count;
            return this;
        }

        /**
         * RequestId.
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
        @NameInMap("Item")
        private String item;

        @NameInMap("Status")
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
             * Item.
             */
            public Builder item(String item) {
                this.item = item;
                return this;
            }

            /**
             * Status.
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
