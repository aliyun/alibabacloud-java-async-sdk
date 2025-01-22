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
 * {@link UpdateLivePackageChannelCredentialsRequest} extends {@link RequestModel}
 *
 * <p>UpdateLivePackageChannelCredentialsRequest</p>
 */
public class UpdateLivePackageChannelCredentialsRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ChannelName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String channelName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("GroupName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String groupName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RotateCredentials")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer rotateCredentials;

    private UpdateLivePackageChannelCredentialsRequest(Builder builder) {
        super(builder);
        this.channelName = builder.channelName;
        this.groupName = builder.groupName;
        this.rotateCredentials = builder.rotateCredentials;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateLivePackageChannelCredentialsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return channelName
     */
    public String getChannelName() {
        return this.channelName;
    }

    /**
     * @return groupName
     */
    public String getGroupName() {
        return this.groupName;
    }

    /**
     * @return rotateCredentials
     */
    public Integer getRotateCredentials() {
        return this.rotateCredentials;
    }

    public static final class Builder extends Request.Builder<UpdateLivePackageChannelCredentialsRequest, Builder> {
        private String channelName; 
        private String groupName; 
        private Integer rotateCredentials; 

        private Builder() {
            super();
        } 

        private Builder(UpdateLivePackageChannelCredentialsRequest request) {
            super(request);
            this.channelName = request.channelName;
            this.groupName = request.groupName;
            this.rotateCredentials = request.rotateCredentials;
        } 

        /**
         * <p>频道名称，字符必须为大小写英文字母或-、<em>。
         * 1 ~ 200个字符。
         * 格式：[A-Za-z0-9</em>-]+</p>
         * <p>This parameter is required.</p>
         */
        public Builder channelName(String channelName) {
            this.putBodyParameter("ChannelName", channelName);
            this.channelName = channelName;
            return this;
        }

        /**
         * <p>频道组名称</p>
         * <p>This parameter is required.</p>
         */
        public Builder groupName(String groupName) {
            this.putBodyParameter("GroupName", groupName);
            this.groupName = groupName;
            return this;
        }

        /**
         * <p>刷新密钥选项, 1: 刷新endpoint1，2:刷新endpoint2，3: 刷新endpoint1&amp;2</p>
         * <p>This parameter is required.</p>
         */
        public Builder rotateCredentials(Integer rotateCredentials) {
            this.putBodyParameter("RotateCredentials", rotateCredentials);
            this.rotateCredentials = rotateCredentials;
            return this;
        }

        @Override
        public UpdateLivePackageChannelCredentialsRequest build() {
            return new UpdateLivePackageChannelCredentialsRequest(this);
        } 

    } 

}
