// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pairecservice20221213.models;

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
 * {@link GetRecallManagementConfigResponseBody} extends {@link TeaModel}
 *
 * <p>GetRecallManagementConfigResponseBody</p>
 */
public class GetRecallManagementConfigResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("NetworkConfigs")
    private java.util.List<NetworkConfigs> networkConfigs;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("UserName")
    private String userName;

    private GetRecallManagementConfigResponseBody(Builder builder) {
        this.networkConfigs = builder.networkConfigs;
        this.requestId = builder.requestId;
        this.userName = builder.userName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetRecallManagementConfigResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return networkConfigs
     */
    public java.util.List<NetworkConfigs> getNetworkConfigs() {
        return this.networkConfigs;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return userName
     */
    public String getUserName() {
        return this.userName;
    }

    public static final class Builder {
        private java.util.List<NetworkConfigs> networkConfigs; 
        private String requestId; 
        private String userName; 

        private Builder() {
        } 

        private Builder(GetRecallManagementConfigResponseBody model) {
            this.networkConfigs = model.networkConfigs;
            this.requestId = model.requestId;
            this.userName = model.userName;
        } 

        /**
         * NetworkConfigs.
         */
        public Builder networkConfigs(java.util.List<NetworkConfigs> networkConfigs) {
            this.networkConfigs = networkConfigs;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>728C5E01-ABF6-5AA8-B9FC-B3BA05DECC77</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * UserName.
         */
        public Builder userName(String userName) {
            this.userName = userName;
            return this;
        }

        public GetRecallManagementConfigResponseBody build() {
            return new GetRecallManagementConfigResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetRecallManagementConfigResponseBody} extends {@link TeaModel}
     *
     * <p>GetRecallManagementConfigResponseBody</p>
     */
    public static class NetworkConfigs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PrivateLinkAddress")
        private String privateLinkAddress;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("VpcId")
        private String vpcId;

        @com.aliyun.core.annotation.NameInMap("VswitchIds")
        private java.util.Map<String, String> vswitchIds;

        private NetworkConfigs(Builder builder) {
            this.privateLinkAddress = builder.privateLinkAddress;
            this.status = builder.status;
            this.vpcId = builder.vpcId;
            this.vswitchIds = builder.vswitchIds;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NetworkConfigs create() {
            return builder().build();
        }

        /**
         * @return privateLinkAddress
         */
        public String getPrivateLinkAddress() {
            return this.privateLinkAddress;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return vpcId
         */
        public String getVpcId() {
            return this.vpcId;
        }

        /**
         * @return vswitchIds
         */
        public java.util.Map<String, String> getVswitchIds() {
            return this.vswitchIds;
        }

        public static final class Builder {
            private String privateLinkAddress; 
            private String status; 
            private String vpcId; 
            private java.util.Map<String, String> vswitchIds; 

            private Builder() {
            } 

            private Builder(NetworkConfigs model) {
                this.privateLinkAddress = model.privateLinkAddress;
                this.status = model.status;
                this.vpcId = model.vpcId;
                this.vswitchIds = model.vswitchIds;
            } 

            /**
             * PrivateLinkAddress.
             */
            public Builder privateLinkAddress(String privateLinkAddress) {
                this.privateLinkAddress = privateLinkAddress;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * VpcId.
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            /**
             * VswitchIds.
             */
            public Builder vswitchIds(java.util.Map<String, String> vswitchIds) {
                this.vswitchIds = vswitchIds;
                return this;
            }

            public NetworkConfigs build() {
                return new NetworkConfigs(this);
            } 

        } 

    }
}
