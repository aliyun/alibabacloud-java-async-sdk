// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

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
 * {@link DeletePushRuleRequest} extends {@link RequestModel}
 *
 * <p>DeletePushRuleRequest</p>
 */
public class DeletePushRuleRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("repositoryId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long repositoryId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("pushRuleId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long pushRuleId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("accessToken")
    private String accessToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("organizationId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String organizationId;

    private DeletePushRuleRequest(Builder builder) {
        super(builder);
        this.repositoryId = builder.repositoryId;
        this.pushRuleId = builder.pushRuleId;
        this.accessToken = builder.accessToken;
        this.organizationId = builder.organizationId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeletePushRuleRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return repositoryId
     */
    public Long getRepositoryId() {
        return this.repositoryId;
    }

    /**
     * @return pushRuleId
     */
    public Long getPushRuleId() {
        return this.pushRuleId;
    }

    /**
     * @return accessToken
     */
    public String getAccessToken() {
        return this.accessToken;
    }

    /**
     * @return organizationId
     */
    public String getOrganizationId() {
        return this.organizationId;
    }

    public static final class Builder extends Request.Builder<DeletePushRuleRequest, Builder> {
        private Long repositoryId; 
        private Long pushRuleId; 
        private String accessToken; 
        private String organizationId; 

        private Builder() {
            super();
        } 

        private Builder(DeletePushRuleRequest request) {
            super(request);
            this.repositoryId = request.repositoryId;
            this.pushRuleId = request.pushRuleId;
            this.accessToken = request.accessToken;
            this.organizationId = request.organizationId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2813489</p>
         */
        public Builder repositoryId(Long repositoryId) {
            this.putPathParameter("repositoryId", repositoryId);
            this.repositoryId = repositoryId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2077</p>
         */
        public Builder pushRuleId(Long pushRuleId) {
            this.putPathParameter("pushRuleId", pushRuleId);
            this.pushRuleId = pushRuleId;
            return this;
        }

        /**
         * accessToken.
         */
        public Builder accessToken(String accessToken) {
            this.putQueryParameter("accessToken", accessToken);
            this.accessToken = accessToken;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>60d54f3daccf2bbd6659f3ad</p>
         */
        public Builder organizationId(String organizationId) {
            this.putQueryParameter("organizationId", organizationId);
            this.organizationId = organizationId;
            return this;
        }

        @Override
        public DeletePushRuleRequest build() {
            return new DeletePushRuleRequest(this);
        } 

    } 

}
