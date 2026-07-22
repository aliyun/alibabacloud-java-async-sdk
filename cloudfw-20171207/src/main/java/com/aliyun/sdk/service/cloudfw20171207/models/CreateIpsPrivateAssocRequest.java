// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

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
 * {@link CreateIpsPrivateAssocRequest} extends {@link RequestModel}
 *
 * <p>CreateIpsPrivateAssocRequest</p>
 */
public class CreateIpsPrivateAssocRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceId")
    private String resourceId;

    private CreateIpsPrivateAssocRequest(Builder builder) {
        super(builder);
        this.lang = builder.lang;
        this.resourceId = builder.resourceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateIpsPrivateAssocRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return resourceId
     */
    public String getResourceId() {
        return this.resourceId;
    }

    public static final class Builder extends Request.Builder<CreateIpsPrivateAssocRequest, Builder> {
        private String lang; 
        private String resourceId; 

        private Builder() {
            super();
        } 

        private Builder(CreateIpsPrivateAssocRequest request) {
            super(request);
            this.lang = request.lang;
            this.resourceId = request.resourceId;
        } 

        /**
         * Lang.
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * <p>资源实例 ID。本参数实际为必填项，未提供时 API 返回 -103201。取值约束：仅接受已受云防火墙保护的 NAT 网关实例 ID（格式 ngw-<em>），传入 vpc-</em>、eip-* 等其他资源类型将被拒绝。</p>
         * 
         * <strong>example:</strong>
         * <p>ngw-c5vhmjdfp5t****</p>
         */
        public Builder resourceId(String resourceId) {
            this.putQueryParameter("ResourceId", resourceId);
            this.resourceId = resourceId;
            return this;
        }

        @Override
        public CreateIpsPrivateAssocRequest build() {
            return new CreateIpsPrivateAssocRequest(this);
        } 

    } 

}
