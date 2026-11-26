// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aligeniessp_1_0.models;

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
 * {@link ListDeviceByUserIdAndChanelRequest} extends {@link RequestModel}
 *
 * <p>ListDeviceByUserIdAndChanelRequest</p>
 */
public class ListDeviceByUserIdAndChanelRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ChannelInfo")
    @com.aliyun.core.annotation.Validation(required = true)
    private ChannelInfo channelInfo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserInfo")
    @com.aliyun.core.annotation.Validation(required = true)
    private UserInfo userInfo;

    private ListDeviceByUserIdAndChanelRequest(Builder builder) {
        super(builder);
        this.channelInfo = builder.channelInfo;
        this.userInfo = builder.userInfo;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDeviceByUserIdAndChanelRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return channelInfo
     */
    public ChannelInfo getChannelInfo() {
        return this.channelInfo;
    }

    /**
     * @return userInfo
     */
    public UserInfo getUserInfo() {
        return this.userInfo;
    }

    public static final class Builder extends Request.Builder<ListDeviceByUserIdAndChanelRequest, Builder> {
        private ChannelInfo channelInfo; 
        private UserInfo userInfo; 

        private Builder() {
            super();
        } 

        private Builder(ListDeviceByUserIdAndChanelRequest request) {
            super(request);
            this.channelInfo = request.channelInfo;
            this.userInfo = request.userInfo;
        } 

        /**
         * <p>Activation channel, such as WeChat mini program or third-party app.</p>
         * <p>This parameter is required.</p>
         */
        public Builder channelInfo(ChannelInfo channelInfo) {
            String channelInfoShrink = shrink(channelInfo, "ChannelInfo", "json");
            this.putQueryParameter("ChannelInfo", channelInfoShrink);
            this.channelInfo = channelInfo;
            return this;
        }

        /**
         * <p>List of User Identifier information.</p>
         * <p>This parameter is required.</p>
         */
        public Builder userInfo(UserInfo userInfo) {
            String userInfoShrink = shrink(userInfo, "UserInfo", "json");
            this.putQueryParameter("UserInfo", userInfoShrink);
            this.userInfo = userInfo;
            return this;
        }

        @Override
        public ListDeviceByUserIdAndChanelRequest build() {
            return new ListDeviceByUserIdAndChanelRequest(this);
        } 

    } 

    /**
     * 
     * {@link ListDeviceByUserIdAndChanelRequest} extends {@link TeaModel}
     *
     * <p>ListDeviceByUserIdAndChanelRequest</p>
     */
    public static class ChannelInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Channel")
        @com.aliyun.core.annotation.Validation(required = true)
        private String channel;

        @com.aliyun.core.annotation.NameInMap("ExtInfo")
        private String extInfo;

        private ChannelInfo(Builder builder) {
            this.channel = builder.channel;
            this.extInfo = builder.extInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ChannelInfo create() {
            return builder().build();
        }

        /**
         * @return channel
         */
        public String getChannel() {
            return this.channel;
        }

        /**
         * @return extInfo
         */
        public String getExtInfo() {
            return this.extInfo;
        }

        public static final class Builder {
            private String channel; 
            private String extInfo; 

            private Builder() {
            } 

            private Builder(ChannelInfo model) {
                this.channel = model.channel;
                this.extInfo = model.extInfo;
            } 

            /**
             * <p>Activation provisioning channel, such as WeChat or ThirdApp.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>WeChat、ThirdApp</p>
             */
            public Builder channel(String channel) {
                this.channel = channel;
                return this;
            }

            /**
             * <p>Extension information.</p>
             * 
             * <strong>example:</strong>
             * <p>{}</p>
             */
            public Builder extInfo(String extInfo) {
                this.extInfo = extInfo;
                return this;
            }

            public ChannelInfo build() {
                return new ChannelInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListDeviceByUserIdAndChanelRequest} extends {@link TeaModel}
     *
     * <p>ListDeviceByUserIdAndChanelRequest</p>
     */
    public static class UserInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EncodeKey")
        @com.aliyun.core.annotation.Validation(required = true)
        private String encodeKey;

        @com.aliyun.core.annotation.NameInMap("EncodeType")
        @com.aliyun.core.annotation.Validation(required = true)
        private String encodeType;

        @com.aliyun.core.annotation.NameInMap("Id")
        @com.aliyun.core.annotation.Validation(required = true)
        private String id;

        @com.aliyun.core.annotation.NameInMap("IdType")
        @com.aliyun.core.annotation.Validation(required = true)
        private String idType;

        @com.aliyun.core.annotation.NameInMap("OrganizationId")
        private String organizationId;

        private UserInfo(Builder builder) {
            this.encodeKey = builder.encodeKey;
            this.encodeType = builder.encodeType;
            this.id = builder.id;
            this.idType = builder.idType;
            this.organizationId = builder.organizationId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UserInfo create() {
            return builder().build();
        }

        /**
         * @return encodeKey
         */
        public String getEncodeKey() {
            return this.encodeKey;
        }

        /**
         * @return encodeType
         */
        public String getEncodeType() {
            return this.encodeType;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return idType
         */
        public String getIdType() {
            return this.idType;
        }

        /**
         * @return organizationId
         */
        public String getOrganizationId() {
            return this.organizationId;
        }

        public static final class Builder {
            private String encodeKey; 
            private String encodeType; 
            private String id; 
            private String idType; 
            private String organizationId; 

            private Builder() {
            } 

            private Builder(UserInfo model) {
                this.encodeKey = model.encodeKey;
                this.encodeType = model.encodeType;
                this.id = model.id;
                this.idType = model.idType;
                this.organizationId = model.organizationId;
            } 

            /**
             * <p>The value corresponding to the encoding type; enter the Project ID of the project to which the product belongs. You can view this in the Tmall Genie AI platform console.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>123</p>
             */
            public Builder encodeKey(String encodeKey) {
                this.encodeKey = encodeKey;
                return this;
            }

            /**
             * <p>Encoding Type; enter PROJECT_ID here.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>PROJECT_ID</p>
             */
            public Builder encodeType(String encodeType) {
                this.encodeType = encodeType;
                return this;
            }

            /**
             * <p>User Identifier; enter the value of userOpenId or userUnionId.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>123</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The Type of the User ID:<br>OPEN_ID: The default User ID identity.<br>UNION_ID: The User ID identity at the organization dimension, which requires you to request an organization in advance on the Open Platform.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>OPEN_ID</p>
             */
            public Builder idType(String idType) {
                this.idType = idType;
                return this;
            }

            /**
             * <p>Organization ID; required if IdType is UNION_ID.</p>
             * 
             * <strong>example:</strong>
             * <p>1***2</p>
             */
            public Builder organizationId(String organizationId) {
                this.organizationId = organizationId;
                return this;
            }

            public UserInfo build() {
                return new UserInfo(this);
            } 

        } 

    }
}
