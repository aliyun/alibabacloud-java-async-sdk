// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.lingmou20250527.models;

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
 * {@link CreateChatSessionRequest} extends {@link RequestModel}
 *
 * <p>CreateChatSessionRequest</p>
 */
public class CreateChatSessionRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("id")
    @com.aliyun.core.annotation.Validation(required = true)
    private String id;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("instanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("license")
    private String license;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("platform")
    private String platform;

    private CreateChatSessionRequest(Builder builder) {
        super(builder);
        this.id = builder.id;
        this.instanceId = builder.instanceId;
        this.license = builder.license;
        this.platform = builder.platform;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateChatSessionRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return id
     */
    public String getId() {
        return this.id;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return license
     */
    public String getLicense() {
        return this.license;
    }

    /**
     * @return platform
     */
    public String getPlatform() {
        return this.platform;
    }

    public static final class Builder extends Request.Builder<CreateChatSessionRequest, Builder> {
        private String id; 
        private String instanceId; 
        private String license; 
        private String platform; 

        private Builder() {
            super();
        } 

        private Builder(CreateChatSessionRequest request) {
            super(request);
            this.id = request.id;
            this.instanceId = request.instanceId;
            this.license = request.license;
            this.platform = request.platform;
        } 

        /**
         * <p>即对话数字人的项目ID，通过灵眸控制台<a href="https://avatar.console.aliyun.com/lingmou/chat">对话互动</a>页面点击对话项目右下角更多选项查看。</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>C1gttTrdX7l98YCPck7Jr-iA</p>
         */
        public Builder id(String id) {
            this.putPathParameter("id", id);
            this.id = id;
            return this;
        }

        /**
         * <p>需要在<a href="https://common-buy.aliyun.com/?spm=a2c4g.11186623.0.0.457876812ETi6y&commodityCode=avatar_2dchat_public_cn">数字人实时交互服务</a>购买完成对应的服务购买，当前有可用的服务时，前往阿里云-<a href="https://billing-cost.console.aliyun.com/order/list">我的订单</a>页面对应订单详情下进行查询</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>rmq-cn-9t946y43m1d</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("instanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>灵眸平台颁发的个人凭证（在使用端渲染数字人的场景下必填）。</p>
         * 
         * <strong>example:</strong>
         * <p>b9be4b25c2d38c409c376ffd2372be1</p>
         */
        public Builder license(String license) {
            this.putQueryParameter("license", license);
            this.license = license;
            return this;
        }

        /**
         * <p>运行SDK的平台（在使用端渲染数字人的场景下必填）。</p>
         * 
         * <strong>example:</strong>
         * <p>Web | Android | iOS</p>
         */
        public Builder platform(String platform) {
            this.putQueryParameter("platform", platform);
            this.platform = platform;
            return this;
        }

        @Override
        public CreateChatSessionRequest build() {
            return new CreateChatSessionRequest(this);
        } 

    } 

}
