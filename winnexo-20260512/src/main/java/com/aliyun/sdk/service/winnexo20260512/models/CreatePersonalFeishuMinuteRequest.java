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
 * {@link CreatePersonalFeishuMinuteRequest} extends {@link RequestModel}
 *
 * <p>CreatePersonalFeishuMinuteRequest</p>
 */
public class CreatePersonalFeishuMinuteRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("credentialId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String credentialId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("directoryId")
    private String directoryId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("minuteToken")
    @com.aliyun.core.annotation.Validation(required = true)
    private String minuteToken;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("operatingObjectName")
    private String operatingObjectName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("tenantId")
    private String tenantId;

    private CreatePersonalFeishuMinuteRequest(Builder builder) {
        super(builder);
        this.credentialId = builder.credentialId;
        this.description = builder.description;
        this.directoryId = builder.directoryId;
        this.minuteToken = builder.minuteToken;
        this.name = builder.name;
        this.operatingObjectName = builder.operatingObjectName;
        this.tenantId = builder.tenantId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreatePersonalFeishuMinuteRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return credentialId
     */
    public String getCredentialId() {
        return this.credentialId;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return directoryId
     */
    public String getDirectoryId() {
        return this.directoryId;
    }

    /**
     * @return minuteToken
     */
    public String getMinuteToken() {
        return this.minuteToken;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return operatingObjectName
     */
    public String getOperatingObjectName() {
        return this.operatingObjectName;
    }

    /**
     * @return tenantId
     */
    public String getTenantId() {
        return this.tenantId;
    }

    public static final class Builder extends Request.Builder<CreatePersonalFeishuMinuteRequest, Builder> {
        private String credentialId; 
        private String description; 
        private String directoryId; 
        private String minuteToken; 
        private String name; 
        private String operatingObjectName; 
        private String tenantId; 

        private Builder() {
            super();
        } 

        private Builder(CreatePersonalFeishuMinuteRequest request) {
            super(request);
            this.credentialId = request.credentialId;
            this.description = request.description;
            this.directoryId = request.directoryId;
            this.minuteToken = request.minuteToken;
            this.name = request.name;
            this.operatingObjectName = request.operatingObjectName;
            this.tenantId = request.tenantId;
        } 

        /**
         * <p>凭证 ID（关联 rbj_credential 表，必填）</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>exampleCredentialId</p>
         */
        public Builder credentialId(String credentialId) {
            this.putBodyParameter("credentialId", credentialId);
            this.credentialId = credentialId;
            return this;
        }

        /**
         * <p>资源描述（可选）</p>
         * 
         * <strong>example:</strong>
         * <p>created by eventbridge</p>
         */
        public Builder description(String description) {
            this.putBodyParameter("description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>目标个人目录 ID；不传时自动绑定到当前数字员工默认根目录，传入时必须是当前用户在当前数字员工下的已有个人目录</p>
         * 
         * <strong>example:</strong>
         * <p>exampleDirectoryId</p>
         */
        public Builder directoryId(String directoryId) {
            this.putBodyParameter("directoryId", directoryId);
            this.directoryId = directoryId;
            return this;
        }

        /**
         * <p>飞书妙记 token（妙记唯一标识符，必填）</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>string_value</p>
         */
        public Builder minuteToken(String minuteToken) {
            this.putBodyParameter("minuteToken", minuteToken);
            this.minuteToken = minuteToken;
            return this;
        }

        /**
         * <p>资源显示名称</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>_DevsAF_19df1a74-a740-449a-bd7a-9acb39e00f25</p>
         */
        public Builder name(String name) {
            this.putBodyParameter("name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>数字员工名称（已废弃：不再作为个人资源隔离条件，仅保留用于来源追溯）</p>
         * 
         * <strong>example:</strong>
         * <p>string_value</p>
         */
        public Builder operatingObjectName(String operatingObjectName) {
            this.putBodyParameter("operatingObjectName", operatingObjectName);
            this.operatingObjectName = operatingObjectName;
            return this;
        }

        /**
         * <p>租户ID，公共参数；winnexo-cli 通过 --tenant-id 显式传入</p>
         * 
         * <strong>example:</strong>
         * <p>1iSgnW4pARwoPUd5D5nuCNwiEiE</p>
         */
        public Builder tenantId(String tenantId) {
            this.putQueryParameter("tenantId", tenantId);
            this.tenantId = tenantId;
            return this;
        }

        @Override
        public CreatePersonalFeishuMinuteRequest build() {
            return new CreatePersonalFeishuMinuteRequest(this);
        } 

    } 

}
