// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eds_aic20230930.models;

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
 * {@link GetNetworkBlacklistResponseBody} extends {@link TeaModel}
 *
 * <p>GetNetworkBlacklistResponseBody</p>
 */
public class GetNetworkBlacklistResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("NetworkBlacklistModel")
    private NetworkBlacklistModel networkBlacklistModel;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetNetworkBlacklistResponseBody(Builder builder) {
        this.networkBlacklistModel = builder.networkBlacklistModel;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetNetworkBlacklistResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return networkBlacklistModel
     */
    public NetworkBlacklistModel getNetworkBlacklistModel() {
        return this.networkBlacklistModel;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private NetworkBlacklistModel networkBlacklistModel; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetNetworkBlacklistResponseBody model) {
            this.networkBlacklistModel = model.networkBlacklistModel;
            this.requestId = model.requestId;
        } 

        /**
         * NetworkBlacklistModel.
         */
        public Builder networkBlacklistModel(NetworkBlacklistModel networkBlacklistModel) {
            this.networkBlacklistModel = networkBlacklistModel;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetNetworkBlacklistResponseBody build() {
            return new GetNetworkBlacklistResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetNetworkBlacklistResponseBody} extends {@link TeaModel}
     *
     * <p>GetNetworkBlacklistResponseBody</p>
     */
    public static class NetworkBlacklistModel extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DomainBlacklist")
        private java.util.List<String> domainBlacklist;

        @com.aliyun.core.annotation.NameInMap("IpBlacklist")
        private java.util.List<String> ipBlacklist;

        private NetworkBlacklistModel(Builder builder) {
            this.domainBlacklist = builder.domainBlacklist;
            this.ipBlacklist = builder.ipBlacklist;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NetworkBlacklistModel create() {
            return builder().build();
        }

        /**
         * @return domainBlacklist
         */
        public java.util.List<String> getDomainBlacklist() {
            return this.domainBlacklist;
        }

        /**
         * @return ipBlacklist
         */
        public java.util.List<String> getIpBlacklist() {
            return this.ipBlacklist;
        }

        public static final class Builder {
            private java.util.List<String> domainBlacklist; 
            private java.util.List<String> ipBlacklist; 

            private Builder() {
            } 

            private Builder(NetworkBlacklistModel model) {
                this.domainBlacklist = model.domainBlacklist;
                this.ipBlacklist = model.ipBlacklist;
            } 

            /**
             * DomainBlacklist.
             */
            public Builder domainBlacklist(java.util.List<String> domainBlacklist) {
                this.domainBlacklist = domainBlacklist;
                return this;
            }

            /**
             * IpBlacklist.
             */
            public Builder ipBlacklist(java.util.List<String> ipBlacklist) {
                this.ipBlacklist = ipBlacklist;
                return this;
            }

            public NetworkBlacklistModel build() {
                return new NetworkBlacklistModel(this);
            } 

        } 

    }
}
