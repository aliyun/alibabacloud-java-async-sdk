// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

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
 * {@link UpdateWhiteIpsResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateWhiteIpsResponseBody</p>
 */
public class UpdateWhiteIpsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Result")
    private Result result;

    private UpdateWhiteIpsResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateWhiteIpsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return result
     */
    public Result getResult() {
        return this.result;
    }

    public static final class Builder {
        private String requestId; 
        private Result result; 

        private Builder() {
        } 

        private Builder(UpdateWhiteIpsResponseBody model) {
            this.requestId = model.requestId;
            this.result = model.result;
        } 

        /**
         * <p>The updated whitelist.</p>
         * 
         * <strong>example:</strong>
         * <p>8D58B014-BBD7-4D80-B219-00B9D5C6860C</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The network configurations.</p>
         */
        public Builder result(Result result) {
            this.result = result;
            return this;
        }

        public UpdateWhiteIpsResponseBody build() {
            return new UpdateWhiteIpsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link UpdateWhiteIpsResponseBody} extends {@link TeaModel}
     *
     * <p>UpdateWhiteIpsResponseBody</p>
     */
    public static class WhiteIpGroupList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("groupName")
        private String groupName;

        @com.aliyun.core.annotation.NameInMap("ips")
        private java.util.List<String> ips;

        @com.aliyun.core.annotation.NameInMap("whiteIpType")
        private String whiteIpType;

        private WhiteIpGroupList(Builder builder) {
            this.groupName = builder.groupName;
            this.ips = builder.ips;
            this.whiteIpType = builder.whiteIpType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static WhiteIpGroupList create() {
            return builder().build();
        }

        /**
         * @return groupName
         */
        public String getGroupName() {
            return this.groupName;
        }

        /**
         * @return ips
         */
        public java.util.List<String> getIps() {
            return this.ips;
        }

        /**
         * @return whiteIpType
         */
        public String getWhiteIpType() {
            return this.whiteIpType;
        }

        public static final class Builder {
            private String groupName; 
            private java.util.List<String> ips; 
            private String whiteIpType; 

            private Builder() {
            } 

            private Builder(WhiteIpGroupList model) {
                this.groupName = model.groupName;
                this.ips = model.ips;
                this.whiteIpType = model.whiteIpType;
            } 

            /**
             * <p>The type of the whitelist. The value of this parameter is fixed as PRIVATE_ES, which indicates a private IP address whitelist.</p>
             * 
             * <strong>example:</strong>
             * <p>test_group</p>
             */
            public Builder groupName(String groupName) {
                this.groupName = groupName;
                return this;
            }

            /**
             * ips.
             */
            public Builder ips(java.util.List<String> ips) {
                this.ips = ips;
                return this;
            }

            /**
             * whiteIpType.
             */
            public Builder whiteIpType(String whiteIpType) {
                this.whiteIpType = whiteIpType;
                return this;
            }

            public WhiteIpGroupList build() {
                return new WhiteIpGroupList(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateWhiteIpsResponseBody} extends {@link TeaModel}
     *
     * <p>UpdateWhiteIpsResponseBody</p>
     */
    public static class NetworkConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("whiteIpGroupList")
        private java.util.List<WhiteIpGroupList> whiteIpGroupList;

        private NetworkConfig(Builder builder) {
            this.whiteIpGroupList = builder.whiteIpGroupList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NetworkConfig create() {
            return builder().build();
        }

        /**
         * @return whiteIpGroupList
         */
        public java.util.List<WhiteIpGroupList> getWhiteIpGroupList() {
            return this.whiteIpGroupList;
        }

        public static final class Builder {
            private java.util.List<WhiteIpGroupList> whiteIpGroupList; 

            private Builder() {
            } 

            private Builder(NetworkConfig model) {
                this.whiteIpGroupList = model.whiteIpGroupList;
            } 

            /**
             * <p>The IP addresses in the whitelist.</p>
             */
            public Builder whiteIpGroupList(java.util.List<WhiteIpGroupList> whiteIpGroupList) {
                this.whiteIpGroupList = whiteIpGroupList;
                return this;
            }

            public NetworkConfig build() {
                return new NetworkConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateWhiteIpsResponseBody} extends {@link TeaModel}
     *
     * <p>UpdateWhiteIpsResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("esIPWhitelist")
        private java.util.List<String> esIPWhitelist;

        @com.aliyun.core.annotation.NameInMap("networkConfig")
        private NetworkConfig networkConfig;

        private Result(Builder builder) {
            this.esIPWhitelist = builder.esIPWhitelist;
            this.networkConfig = builder.networkConfig;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return esIPWhitelist
         */
        public java.util.List<String> getEsIPWhitelist() {
            return this.esIPWhitelist;
        }

        /**
         * @return networkConfig
         */
        public NetworkConfig getNetworkConfig() {
            return this.networkConfig;
        }

        public static final class Builder {
            private java.util.List<String> esIPWhitelist; 
            private NetworkConfig networkConfig; 

            private Builder() {
            } 

            private Builder(Result model) {
                this.esIPWhitelist = model.esIPWhitelist;
                this.networkConfig = model.networkConfig;
            } 

            /**
             * <p>The list of whitelists.</p>
             */
            public Builder esIPWhitelist(java.util.List<String> esIPWhitelist) {
                this.esIPWhitelist = esIPWhitelist;
                return this;
            }

            /**
             * <p>The name of the whitelist. By default, the default whitelist is included.</p>
             */
            public Builder networkConfig(NetworkConfig networkConfig) {
                this.networkConfig = networkConfig;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
