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
 * {@link UpdateWhiteIpsRequest} extends {@link RequestModel}
 *
 * <p>UpdateWhiteIpsRequest</p>
 */
public class UpdateWhiteIpsRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("esIPWhitelist")
    private java.util.List<String> esIPWhitelist;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("whiteIpGroup")
    private WhiteIpGroup whiteIpGroup;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("clientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("modifyMode")
    private String modifyMode;

    private UpdateWhiteIpsRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.esIPWhitelist = builder.esIPWhitelist;
        this.whiteIpGroup = builder.whiteIpGroup;
        this.clientToken = builder.clientToken;
        this.modifyMode = builder.modifyMode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateWhiteIpsRequest create() {
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
     * @return esIPWhitelist
     */
    public java.util.List<String> getEsIPWhitelist() {
        return this.esIPWhitelist;
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

    public static final class Builder extends Request.Builder<UpdateWhiteIpsRequest, Builder> {
        private String instanceId; 
        private java.util.List<String> esIPWhitelist; 
        private WhiteIpGroup whiteIpGroup; 
        private String clientToken; 
        private String modifyMode; 

        private Builder() {
            super();
        } 

        private Builder(UpdateWhiteIpsRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.esIPWhitelist = request.esIPWhitelist;
            this.whiteIpGroup = request.whiteIpGroup;
            this.clientToken = request.clientToken;
            this.modifyMode = request.modifyMode;
        } 

        /**
         * <p>The request body.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>es-cn-npk2154oi000b****</p>
         */
        public Builder instanceId(String instanceId) {
            this.putPathParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The name of the whitelist. This parameter is required if you configure the whiteIpGroup parameter.</p>
         */
        public Builder esIPWhitelist(java.util.List<String> esIPWhitelist) {
            this.putBodyParameter("esIPWhitelist", esIPWhitelist);
            this.esIPWhitelist = esIPWhitelist;
            return this;
        }

        /**
         * <p>The IP addresses in the whitelist. This parameter is required if you configure the whiteIpGroup parameter.</p>
         */
        public Builder whiteIpGroup(WhiteIpGroup whiteIpGroup) {
            this.putBodyParameter("whiteIpGroup", whiteIpGroup);
            this.whiteIpGroup = whiteIpGroup;
            return this;
        }

        /**
         * <p>The IP addresses in the whitelist.</p>
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
         * <p>The IP addresses in the whitelist. This parameter is available if the whiteIpGroup parameter is left empty. The default IP address whitelist is updated based on the value of this parameter.</p>
         * <blockquote>
         * <p> You cannot configure both the esIPWhitelist and whiteIpGroup parameters.</p>
         * </blockquote>
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
        public UpdateWhiteIpsRequest build() {
            return new UpdateWhiteIpsRequest(this);
        } 

    } 

    /**
     * 
     * {@link UpdateWhiteIpsRequest} extends {@link TeaModel}
     *
     * <p>UpdateWhiteIpsRequest</p>
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
             * <p>The type of the whitelist. Set the value to <strong>PRIVATE_ES</strong>. This value indicates a private IP address whitelist.</p>
             * 
             * <strong>example:</strong>
             * <p>test_group</p>
             */
            public Builder groupName(String groupName) {
                this.groupName = groupName;
                return this;
            }

            /**
             * <p>The returned result.</p>
             */
            public Builder ips(java.util.List<String> ips) {
                this.ips = ips;
                return this;
            }

            /**
             * <p>The returned result.</p>
             * 
             * <strong>example:</strong>
             * <p>PRIVATE_ES</p>
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
