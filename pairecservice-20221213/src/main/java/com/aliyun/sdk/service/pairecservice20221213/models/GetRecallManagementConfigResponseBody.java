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
         * <p>The network configuration information.</p>
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
         * <p>The username.</p>
         * 
         * <strong>example:</strong>
         * <p>scene_test</p>
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

        @com.aliyun.core.annotation.NameInMap("PublicEndpoint")
        private String publicEndpoint;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("Token")
        private String token;

        @com.aliyun.core.annotation.NameInMap("VpcId")
        private String vpcId;

        @com.aliyun.core.annotation.NameInMap("VswitchIds")
        private java.util.Map<String, String> vswitchIds;

        private NetworkConfigs(Builder builder) {
            this.privateLinkAddress = builder.privateLinkAddress;
            this.publicEndpoint = builder.publicEndpoint;
            this.status = builder.status;
            this.token = builder.token;
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
         * @return publicEndpoint
         */
        public String getPublicEndpoint() {
            return this.publicEndpoint;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return token
         */
        public String getToken() {
            return this.token;
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
            private String publicEndpoint; 
            private String status; 
            private String token; 
            private String vpcId; 
            private java.util.Map<String, String> vswitchIds; 

            private Builder() {
            } 

            private Builder(NetworkConfigs model) {
                this.privateLinkAddress = model.privateLinkAddress;
                this.publicEndpoint = model.publicEndpoint;
                this.status = model.status;
                this.token = model.token;
                this.vpcId = model.vpcId;
                this.vswitchIds = model.vswitchIds;
            } 

            /**
             * <p>The private endpoint.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://xxx">http://xxx</a></p>
             */
            public Builder privateLinkAddress(String privateLinkAddress) {
                this.privateLinkAddress = privateLinkAddress;
                return this;
            }

            /**
             * <p>The public endpoint.</p>
             * 
             * <strong>example:</strong>
             * <p>&quot;&quot;</p>
             */
            public Builder publicEndpoint(String publicEndpoint) {
                this.publicEndpoint = publicEndpoint;
                return this;
            }

            /**
             * <p>The network connectivity status. Valid values:</p>
             * <ul>
             * <li><p>Connecting: connecting.</p>
             * </li>
             * <li><p>Connected: connected.</p>
             * </li>
             * <li><p>ConnectionFailed: connection failed.</p>
             * </li>
             * <li><p>Updating: updating.</p>
             * </li>
             * <li><p>UpdateFailed: update failed.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Connecting</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The public network connection token.</p>
             * 
             * <strong>example:</strong>
             * <p>&quot;&quot;</p>
             */
            public Builder token(String token) {
                this.token = token;
                return this;
            }

            /**
             * <p>The virtual private cloud (VPC) ID.</p>
             * 
             * <strong>example:</strong>
             * <p>vpc-xxx</p>
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            /**
             * <p>The zones.</p>
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
