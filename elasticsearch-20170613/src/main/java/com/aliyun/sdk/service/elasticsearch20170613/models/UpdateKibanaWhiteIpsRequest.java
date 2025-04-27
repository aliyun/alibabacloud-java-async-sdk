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
 * {@link UpdateKibanaWhiteIpsRequest} extends {@link RequestModel}
 *
 * <p>UpdateKibanaWhiteIpsRequest</p>
 */
public class UpdateKibanaWhiteIpsRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("kibanaIPWhitelist")
    private java.util.List<String> kibanaIPWhitelist;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("whiteIpGroup")
    private WhiteIpGroup whiteIpGroup;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("clientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("modifyMode")
    private String modifyMode;

    private UpdateKibanaWhiteIpsRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.kibanaIPWhitelist = builder.kibanaIPWhitelist;
        this.whiteIpGroup = builder.whiteIpGroup;
        this.clientToken = builder.clientToken;
        this.modifyMode = builder.modifyMode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateKibanaWhiteIpsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return kibanaIPWhitelist
     */
    public java.util.List<String> getKibanaIPWhitelist() {
        return this.kibanaIPWhitelist;
    }

    /**
     * @return whiteIpGroup
     */
    public WhiteIpGroup getWhiteIpGroup() {
        return this.whiteIpGroup;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return modifyMode
     */
    public String getModifyMode() {
        return this.modifyMode;
    }

    public static final class Builder extends Request.Builder<UpdateKibanaWhiteIpsRequest, Builder> {
        private String instanceId; 
        private java.util.List<String> kibanaIPWhitelist; 
        private WhiteIpGroup whiteIpGroup; 
        private String clientToken; 
        private String modifyMode; 

        private Builder() {
            super();
        } 

        private Builder(UpdateKibanaWhiteIpsRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.kibanaIPWhitelist = request.kibanaIPWhitelist;
            this.whiteIpGroup = request.whiteIpGroup;
            this.clientToken = request.clientToken;
            this.modifyMode = request.modifyMode;
        } 

        /**
         * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>es-cn-tl329rbpc0001****</p>
         */
        public Builder instanceId(String instanceId) {
            this.putPathParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The IP address whitelists. This parameter is available if the whiteIpGroup parameter is left empty. The default IP address whitelist is updated based on the value of this parameter.</p>
         * <p>You cannot configure both the kibanaIPWhitelist and whiteIpGroup parameters.</p>
         */
        public Builder kibanaIPWhitelist(java.util.List<String> kibanaIPWhitelist) {
            this.putBodyParameter("kibanaIPWhitelist", kibanaIPWhitelist);
            this.kibanaIPWhitelist = kibanaIPWhitelist;
            return this;
        }

        /**
         * <p>The name of the whitelist. This parameter is required if you configure the whiteIpGroup parameter.</p>
         */
        public Builder whiteIpGroup(WhiteIpGroup whiteIpGroup) {
            this.putBodyParameter("whiteIpGroup", whiteIpGroup);
            this.whiteIpGroup = whiteIpGroup;
            return this;
        }

        /**
         * <p>The update mode. Valid values:</p>
         * <ul>
         * <li>Cover: overwrites the IP addresses in the specified IP address whitelist with the IP addresses specified by using the ips parameter. This is the default value.</li>
         * <li>Append: adds the IP addresses specified by using the ips parameter to the specified IP address whitelist.</li>
         * <li>Delete: deletes the IP addresses specified by using the ips parameter from the specified IP address whitelist. At least one IP address must be retained for the whitelist.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>5A2CFF0E-5718-45B5-9D4D-70B3FF****</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("clientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>The body of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>Cover</p>
         */
        public Builder modifyMode(String modifyMode) {
            this.putQueryParameter("modifyMode", modifyMode);
            this.modifyMode = modifyMode;
            return this;
        }

        @Override
        public UpdateKibanaWhiteIpsRequest build() {
            return new UpdateKibanaWhiteIpsRequest(this);
        } 

    } 

    /**
     * 
     * {@link UpdateKibanaWhiteIpsRequest} extends {@link TeaModel}
     *
     * <p>UpdateKibanaWhiteIpsRequest</p>
     */
    public static class WhiteIpGroup extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("groupName")
        private String groupName;

        @com.aliyun.core.annotation.NameInMap("ips")
        private java.util.List<String> ips;

        @com.aliyun.core.annotation.NameInMap("whiteIpType")
        private String whiteIpType;

        private WhiteIpGroup(Builder builder) {
            this.groupName = builder.groupName;
            this.ips = builder.ips;
            this.whiteIpType = builder.whiteIpType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static WhiteIpGroup create() {
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

            private Builder(WhiteIpGroup model) {
                this.groupName = model.groupName;
                this.ips = model.ips;
                this.whiteIpType = model.whiteIpType;
            } 

            /**
             * <p>The type of the whitelist. Set the value to PUBLIC_KIBANA. This value indicates a public IP address whitelist.</p>
             * 
             * <strong>example:</strong>
             * <p>test_group_name</p>
             */
            public Builder groupName(String groupName) {
                this.groupName = groupName;
                return this;
            }

            /**
             * <p>The IP addresses in the whitelist. This parameter is required if you configure the whiteIpGroup parameter.</p>
             */
            public Builder ips(java.util.List<String> ips) {
                this.ips = ips;
                return this;
            }

            /**
             * <p>The IP addresses in the whitelist.</p>
             * 
             * <strong>example:</strong>
             * <p>PUBLIC_KIBANA</p>
             */
            public Builder whiteIpType(String whiteIpType) {
                this.whiteIpType = whiteIpType;
                return this;
            }

            public WhiteIpGroup build() {
                return new WhiteIpGroup(this);
            } 

        } 

    }
}
