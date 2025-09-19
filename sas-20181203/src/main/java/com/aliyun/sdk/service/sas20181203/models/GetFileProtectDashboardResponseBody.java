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
 * {@link GetFileProtectDashboardResponseBody} extends {@link TeaModel}
 *
 * <p>GetFileProtectDashboardResponseBody</p>
 */
public class GetFileProtectDashboardResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(GetFileProtectDashboardResponseBody model) {
            this.data = model.data;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The response parameters.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>6673D49C-A9AB-40DD-B4A2-B92306701AE7</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetFileProtectDashboardResponseBody build() {
            return new GetFileProtectDashboardResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetFileProtectDashboardResponseBody} extends {@link TeaModel}
     *
     * <p>GetFileProtectDashboardResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EnableRuleCount")
        private Integer enableRuleCount;

        @com.aliyun.core.annotation.NameInMap("PluginCount")
        private Integer pluginCount;

        @com.aliyun.core.annotation.NameInMap("PluginOfflineCount")
        private Integer pluginOfflineCount;

        @com.aliyun.core.annotation.NameInMap("PluginOnlineCount")
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

            private Builder() {
            } 

            private Builder(Data model) {
                this.enableRuleCount = model.enableRuleCount;
                this.pluginCount = model.pluginCount;
                this.pluginOfflineCount = model.pluginOfflineCount;
                this.pluginOnlineCount = model.pluginOnlineCount;
            } 

            /**
             * <p>The total number of enabled rules.</p>
             * 
             * <strong>example:</strong>
             * <p>12</p>
             */
            public Builder enableRuleCount(Integer enableRuleCount) {
                this.enableRuleCount = enableRuleCount;
                return this;
            }

            /**
             * <p>The total number of servers on which the Security Center agent is installed.</p>
             * 
             * <strong>example:</strong>
             * <p>12</p>
             */
            public Builder pluginCount(Integer pluginCount) {
                this.pluginCount = pluginCount;
                return this;
            }

            /**
             * <p>The total number of servers on which the Security Center agent is offline.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder pluginOfflineCount(Integer pluginOfflineCount) {
                this.pluginOfflineCount = pluginOfflineCount;
                return this;
            }

            /**
             * <p>The total number of servers on which the Security Center agent is online.</p>
             * 
             * <strong>example:</strong>
             * <p>11</p>
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
