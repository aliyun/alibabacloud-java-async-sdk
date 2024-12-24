// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr_serverless_spark20230808.models;

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
 * {@link GetTemplateRequest} extends {@link RequestModel}
 *
 * <p>GetTemplateRequest</p>
 */
public class GetTemplateRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("workspaceBizId")
    private String workspaceBizId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("regionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("templateType")
    private String templateType;

    private GetTemplateRequest(Builder builder) {
        super(builder);
        this.workspaceBizId = builder.workspaceBizId;
        this.regionId = builder.regionId;
        this.templateType = builder.templateType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetTemplateRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return workspaceBizId
     */
    public String getWorkspaceBizId() {
        return this.workspaceBizId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return templateType
     */
    public String getTemplateType() {
        return this.templateType;
    }

    public static final class Builder extends Request.Builder<GetTemplateRequest, Builder> {
        private String workspaceBizId; 
        private String regionId; 
        private String templateType; 

        private Builder() {
            super();
        } 

        private Builder(GetTemplateRequest request) {
            super(request);
            this.workspaceBizId = request.workspaceBizId;
            this.regionId = request.regionId;
            this.templateType = request.templateType;
        } 

        /**
         * <p>The workspace ID.</p>
         * 
         * <strong>example:</strong>
         * <p>w-8adde60aa809701f</p>
         */
        public Builder workspaceBizId(String workspaceBizId) {
            this.putPathParameter("workspaceBizId", workspaceBizId);
            this.workspaceBizId = workspaceBizId;
            return this;
        }

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("regionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The template type.</p>
         * <ul>
         * <li>TASK</li>
         * <li>SESSION</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>TASK</p>
         */
        public Builder templateType(String templateType) {
            this.putQueryParameter("templateType", templateType);
            this.templateType = templateType;
            return this;
        }

        @Override
        public GetTemplateRequest build() {
            return new GetTemplateRequest(this);
        } 

    } 

}
