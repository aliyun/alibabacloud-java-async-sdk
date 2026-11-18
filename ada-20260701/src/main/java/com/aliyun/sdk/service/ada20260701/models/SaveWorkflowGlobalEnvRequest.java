// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ada20260701.models;

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
 * {@link SaveWorkflowGlobalEnvRequest} extends {@link RequestModel}
 *
 * <p>SaveWorkflowGlobalEnvRequest</p>
 */
public class SaveWorkflowGlobalEnvRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Content")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 65536)
    private String content;

    private SaveWorkflowGlobalEnvRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.content = builder.content;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SaveWorkflowGlobalEnvRequest create() {
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
     * @return content
     */
    public String getContent() {
        return this.content;
    }

    public static final class Builder extends Request.Builder<SaveWorkflowGlobalEnvRequest, Builder> {
        private String regionId; 
        private String content; 

        private Builder() {
            super();
        } 

        private Builder(SaveWorkflowGlobalEnvRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.content = request.content;
        } 

        /**
         * <p>用于可信POP host路由和RAM ARN，不进入业务body/query，不作为客户账号归属来源。</p>
         * <p>This parameter is required.</p>
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The configuration content.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>MODE=demo</p>
         */
        public Builder content(String content) {
            this.putBodyParameter("Content", content);
            this.content = content;
            return this;
        }

        @Override
        public SaveWorkflowGlobalEnvRequest build() {
            return new SaveWorkflowGlobalEnvRequest(this);
        } 

    } 

}
