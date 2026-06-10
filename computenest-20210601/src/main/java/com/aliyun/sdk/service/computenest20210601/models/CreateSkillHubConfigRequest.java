// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.computenest20210601.models;

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
 * {@link CreateSkillHubConfigRequest} extends {@link RequestModel}
 *
 * <p>CreateSkillHubConfigRequest</p>
 */
public class CreateSkillHubConfigRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OssBucketName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String ossBucketName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OssRegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String ossRegionId;

    private CreateSkillHubConfigRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.ossBucketName = builder.ossBucketName;
        this.ossRegionId = builder.ossRegionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateSkillHubConfigRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return ossBucketName
     */
    public String getOssBucketName() {
        return this.ossBucketName;
    }

    /**
     * @return ossRegionId
     */
    public String getOssRegionId() {
        return this.ossRegionId;
    }

    public static final class Builder extends Request.Builder<CreateSkillHubConfigRequest, Builder> {
        private String clientToken; 
        private String ossBucketName; 
        private String ossRegionId; 

        private Builder() {
            super();
        } 

        private Builder(CreateSkillHubConfigRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.ossBucketName = request.ossBucketName;
            this.ossRegionId = request.ossRegionId;
        } 

        /**
         * ClientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putBodyParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>tidb-test-a</p>
         */
        public Builder ossBucketName(String ossBucketName) {
            this.putQueryParameter("OssBucketName", ossBucketName);
            this.ossBucketName = ossBucketName;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shenzhen</p>
         */
        public Builder ossRegionId(String ossRegionId) {
            this.putQueryParameter("OssRegionId", ossRegionId);
            this.ossRegionId = ossRegionId;
            return this;
        }

        @Override
        public CreateSkillHubConfigRequest build() {
            return new CreateSkillHubConfigRequest(this);
        } 

    } 

}
