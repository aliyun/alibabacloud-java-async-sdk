// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.winnexo20260512.models;

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
 * {@link CreateCustomOrgRequest} extends {@link RequestModel}
 *
 * <p>CreateCustomOrgRequest</p>
 */
public class CreateCustomOrgRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("corpId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String corpId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("corpName")
    private String corpName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("tenantId")
    private String tenantId;

    private CreateCustomOrgRequest(Builder builder) {
        super(builder);
        this.corpId = builder.corpId;
        this.corpName = builder.corpName;
        this.tenantId = builder.tenantId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateCustomOrgRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return corpId
     */
    public String getCorpId() {
        return this.corpId;
    }

    /**
     * @return corpName
     */
    public String getCorpName() {
        return this.corpName;
    }

    /**
     * @return tenantId
     */
    public String getTenantId() {
        return this.tenantId;
    }

    public static final class Builder extends Request.Builder<CreateCustomOrgRequest, Builder> {
        private String corpId; 
        private String corpName; 
        private String tenantId; 

        private Builder() {
            super();
        } 

        private Builder(CreateCustomOrgRequest request) {
            super(request);
            this.corpId = request.corpId;
            this.corpName = request.corpName;
            this.tenantId = request.tenantId;
        } 

        /**
         * <p>自定义组织标识，格式：^[a-z0-9][a-z0-9-]{2,63}$</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>exampleCorpId</p>
         */
        public Builder corpId(String corpId) {
            this.putBodyParameter("corpId", corpId);
            this.corpId = corpId;
            return this;
        }

        /**
         * <p>组织展示名称（可选，不传则与 corpId 相同）</p>
         * 
         * <strong>example:</strong>
         * <p>string_value</p>
         */
        public Builder corpName(String corpName) {
            this.putBodyParameter("corpName", corpName);
            this.corpName = corpName;
            return this;
        }

        /**
         * <p>租户ID，公共参数，缺省时使用调用方默认租户</p>
         * 
         * <strong>example:</strong>
         * <p>692318833855074</p>
         */
        public Builder tenantId(String tenantId) {
            this.putQueryParameter("tenantId", tenantId);
            this.tenantId = tenantId;
            return this;
        }

        @Override
        public CreateCustomOrgRequest build() {
            return new CreateCustomOrgRequest(this);
        } 

    } 

}
