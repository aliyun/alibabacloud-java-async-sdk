// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

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
 * {@link UpdateLivePackageOriginEndpointRequest} extends {@link RequestModel}
 *
 * <p>UpdateLivePackageOriginEndpointRequest</p>
 */
public class UpdateLivePackageOriginEndpointRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AuthorizationCode")
    private String authorizationCode;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ChannelName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String channelName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EndpointName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String endpointName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("GroupName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String groupName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("IpBlacklist")
    private String ipBlacklist;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("IpWhitelist")
    private String ipWhitelist;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ManifestName")
    private String manifestName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Protocol")
    @com.aliyun.core.annotation.Validation(required = true)
    private String protocol;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TimeshiftVision")
    private Integer timeshiftVision;

    private UpdateLivePackageOriginEndpointRequest(Builder builder) {
        super(builder);
        this.authorizationCode = builder.authorizationCode;
        this.channelName = builder.channelName;
        this.description = builder.description;
        this.endpointName = builder.endpointName;
        this.groupName = builder.groupName;
        this.ipBlacklist = builder.ipBlacklist;
        this.ipWhitelist = builder.ipWhitelist;
        this.manifestName = builder.manifestName;
        this.protocol = builder.protocol;
        this.timeshiftVision = builder.timeshiftVision;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateLivePackageOriginEndpointRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return authorizationCode
     */
    public String getAuthorizationCode() {
        return this.authorizationCode;
    }

    /**
     * @return channelName
     */
    public String getChannelName() {
        return this.channelName;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return endpointName
     */
    public String getEndpointName() {
        return this.endpointName;
    }

    /**
     * @return groupName
     */
    public String getGroupName() {
        return this.groupName;
    }

    /**
     * @return ipBlacklist
     */
    public String getIpBlacklist() {
        return this.ipBlacklist;
    }

    /**
     * @return ipWhitelist
     */
    public String getIpWhitelist() {
        return this.ipWhitelist;
    }

    /**
     * @return manifestName
     */
    public String getManifestName() {
        return this.manifestName;
    }

    /**
     * @return protocol
     */
    public String getProtocol() {
        return this.protocol;
    }

    /**
     * @return timeshiftVision
     */
    public Integer getTimeshiftVision() {
        return this.timeshiftVision;
    }

    public static final class Builder extends Request.Builder<UpdateLivePackageOriginEndpointRequest, Builder> {
        private String authorizationCode; 
        private String channelName; 
        private String description; 
        private String endpointName; 
        private String groupName; 
        private String ipBlacklist; 
        private String ipWhitelist; 
        private String manifestName; 
        private String protocol; 
        private Integer timeshiftVision; 

        private Builder() {
            super();
        } 

        private Builder(UpdateLivePackageOriginEndpointRequest request) {
            super(request);
            this.authorizationCode = request.authorizationCode;
            this.channelName = request.channelName;
            this.description = request.description;
            this.endpointName = request.endpointName;
            this.groupName = request.groupName;
            this.ipBlacklist = request.ipBlacklist;
            this.ipWhitelist = request.ipWhitelist;
            this.manifestName = request.manifestName;
            this.protocol = request.protocol;
            this.timeshiftVision = request.timeshiftVision;
        } 

        /**
         * <p>回源授权码，与IpWhitelist必选其一</p>
         * 
         * <strong>example:</strong>
         * <p>Abc123Def456</p>
         */
        public Builder authorizationCode(String authorizationCode) {
            this.putBodyParameter("AuthorizationCode", authorizationCode);
            this.authorizationCode = authorizationCode;
            return this;
        }

        /**
         * <p>频道名称。
         * 1 ~ 200个字符。
         * 正则匹配输入：[A-Za-z0-9_-]+</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>channel-1</p>
         */
        public Builder channelName(String channelName) {
            this.putBodyParameter("ChannelName", channelName);
            this.channelName = channelName;
            return this;
        }

        /**
         * <p>端点描述，最大1000个字符</p>
         */
        public Builder description(String description) {
            this.putBodyParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>端点名称，要求在单个频道中唯一。
         * 1 ~ 200个字符。
         * 正则匹配输入：[A-Za-z0-9_-]+</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>endpoint-1</p>
         */
        public Builder endpointName(String endpointName) {
            this.putBodyParameter("EndpointName", endpointName);
            this.endpointName = endpointName;
            return this;
        }

        /**
         * <p>频道组名称。
         * 1 ~ 200个字符。
         * 正则匹配输入：[A-Za-z0-9_-]+</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>channel-group-1</p>
         */
        public Builder groupName(String groupName) {
            this.putBodyParameter("GroupName", groupName);
            this.groupName = groupName;
            return this;
        }

        /**
         * <p>IP黑名单，支持无类别域间路由（CIDR），逗号分隔</p>
         * 
         * <strong>example:</strong>
         * <p>103.0.0.0/8</p>
         */
        public Builder ipBlacklist(String ipBlacklist) {
            this.putBodyParameter("IpBlacklist", ipBlacklist);
            this.ipBlacklist = ipBlacklist;
            return this;
        }

        /**
         * <p>IP白名单，支持无类别域间路由（CIDR），逗号分隔，与AuthorizationCode必选其一</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.1.0/24,10.0.0.1</p>
         */
        public Builder ipWhitelist(String ipWhitelist) {
            this.putBodyParameter("IpWhitelist", ipWhitelist);
            this.ipWhitelist = ipWhitelist;
            return this;
        }

        /**
         * <p>播放列表名，缺省为manifest。
         * 1 ~ 100个字符。
         * 正则匹配输入：[A-Za-z0-9_]+</p>
         * 
         * <strong>example:</strong>
         * <p>manifest</p>
         */
        public Builder manifestName(String manifestName) {
            this.putBodyParameter("ManifestName", manifestName);
            this.manifestName = manifestName;
            return this;
        }

        /**
         * <p>端点分发协议，暂只支持HLS</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>HLS</p>
         */
        public Builder protocol(String protocol) {
            this.putBodyParameter("Protocol", protocol);
            this.protocol = protocol;
            return this;
        }

        /**
         * <p>时移天数，最大30天，0表示不支持时移</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        public Builder timeshiftVision(Integer timeshiftVision) {
            this.putBodyParameter("TimeshiftVision", timeshiftVision);
            this.timeshiftVision = timeshiftVision;
            return this;
        }

        @Override
        public UpdateLivePackageOriginEndpointRequest build() {
            return new UpdateLivePackageOriginEndpointRequest(this);
        } 

    } 

}
