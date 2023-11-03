// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetFileProtectDashboardResponseBody} extends {@link TeaModel}
 *
 * <p>GetFileProtectDashboardResponseBody</p>
 */
public class GetFileProtectDashboardResponseBody extends TeaModel {
    @NameInMap("Data")
    private Data data;

    @NameInMap("RequestId")
    private String requestId;

    private GetFileProtectDashboardResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetFileProtectDashboardResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Data data; 
        private String requestId; 

        /**
         * The response parameters.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetFileProtectDashboardResponseBody build() {
            return new GetFileProtectDashboardResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("EnableRuleCount")
        private Integer enableRuleCount;

        @NameInMap("PluginCount")
        private Integer pluginCount;

        @NameInMap("PluginOfflineCount")
        private Integer pluginOfflineCount;

        @NameInMap("PluginOnlineCount")
        private Integer pluginOnlineCount;

        private Data(Builder builder) {
            this.enableRuleCount = builder.enableRuleCount;
            this.pluginCount = builder.pluginCount;
            this.pluginOfflineCount = builder.pluginOfflineCount;
            this.pluginOnlineCount = builder.pluginOnlineCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return enableRuleCount
         */
        public Integer getEnableRuleCount() {
            return this.enableRuleCount;
        }

        /**
         * @return pluginCount
         */
        public Integer getPluginCount() {
            return this.pluginCount;
        }

        /**
         * @return pluginOfflineCount
         */
        public Integer getPluginOfflineCount() {
            return this.pluginOfflineCount;
        }

        /**
         * @return pluginOnlineCount
         */
        public Integer getPluginOnlineCount() {
            return this.pluginOnlineCount;
        }

        public static final class Builder {
            private Integer enableRuleCount; 
            private Integer pluginCount; 
            private Integer pluginOfflineCount; 
            private Integer pluginOnlineCount; 

            /**
             * The total number of enabled rules.
             */
            public Builder enableRuleCount(Integer enableRuleCount) {
                this.enableRuleCount = enableRuleCount;
                return this;
            }

            /**
             * The total number of servers on which the Security Center agent is installed.
             */
            public Builder pluginCount(Integer pluginCount) {
                this.pluginCount = pluginCount;
                return this;
            }

            /**
             * The total number of servers on which the Security Center agent is offline.
             */
            public Builder pluginOfflineCount(Integer pluginOfflineCount) {
                this.pluginOfflineCount = pluginOfflineCount;
                return this;
            }

            /**
             * The total number of servers on which the Security Center agent is online.
             */
            public Builder pluginOnlineCount(Integer pluginOnlineCount) {
                this.pluginOnlineCount = pluginOnlineCount;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
