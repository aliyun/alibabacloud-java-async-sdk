// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.schedulerx320240624.models;

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
 * {@link CreateContactRequest} extends {@link RequestModel}
 *
 * <p>CreateContactRequest</p>
 */
public class CreateContactRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Config")
    @com.aliyun.core.annotation.Validation(required = true)
    private String config;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ContactName")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 100, minLength = 1)
    private String contactName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Type")
    @com.aliyun.core.annotation.Validation(required = true)
    private String type;

    private CreateContactRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.config = builder.config;
        this.contactName = builder.contactName;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateContactRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return config
     */
    public String getConfig() {
        return this.config;
    }

    /**
     * @return contactName
     */
    public String getContactName() {
        return this.contactName;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<CreateContactRequest, Builder> {
        private String regionId; 
        private String config; 
        private String contactName; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(CreateContactRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.config = request.config;
            this.contactName = request.contactName;
            this.type = request.type;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>渠道参数配置 JSON 字符串。IM 类型示例：{&quot;channels&quot;:[{&quot;channelType&quot;:&quot;dingtalk&quot;,&quot;clientId&quot;:&quot;xxx&quot;,&quot;clientSecret&quot;:&quot;xxx&quot;,&quot;targetType&quot;:&quot;group&quot;,&quot;targetId&quot;:&quot;xxx&quot;,&quot;robotCode&quot;:&quot;xxx&quot;}]}</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;channels&quot;:[{&quot;channelType&quot;:&quot;dingtalk&quot;,&quot;clientId&quot;:&quot;xxx&quot;,&quot;clientSecret&quot;:&quot;xxx&quot;,&quot;targetType&quot;:&quot;group&quot;,&quot;targetId&quot;:&quot;xxx&quot;,&quot;robotCode&quot;:&quot;xxx&quot;}]}</p>
         */
        public Builder config(String config) {
            this.putBodyParameter("Config", config);
            this.config = config;
            return this;
        }

        /**
         * <p>联系人名称（用户自定义，用于展示），同一用户下不可重名</p>
         * <p>This parameter is required.</p>
         */
        public Builder contactName(String contactName) {
            this.putBodyParameter("ContactName", contactName);
            this.contactName = contactName;
            return this;
        }

        /**
         * <p>渠道大类，当前支持 IM</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>IM</p>
         */
        public Builder type(String type) {
            this.putBodyParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public CreateContactRequest build() {
            return new CreateContactRequest(this);
        } 

    } 

}
