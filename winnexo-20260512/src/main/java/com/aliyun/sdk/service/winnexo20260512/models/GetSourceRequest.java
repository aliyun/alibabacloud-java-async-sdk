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
 * {@link GetSourceRequest} extends {@link RequestModel}
 *
 * <p>GetSourceRequest</p>
 */
public class GetSourceRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("includeDetails")
    private Boolean includeDetails;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("sourceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String sourceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("tenantId")
    private String tenantId;

    private GetSourceRequest(Builder builder) {
        super(builder);
        this.includeDetails = builder.includeDetails;
        this.sourceId = builder.sourceId;
        this.tenantId = builder.tenantId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetSourceRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return includeDetails
     */
    public Boolean getIncludeDetails() {
        return this.includeDetails;
    }

    /**
     * @return sourceId
     */
    public String getSourceId() {
        return this.sourceId;
    }

    /**
     * @return tenantId
     */
    public String getTenantId() {
        return this.tenantId;
    }

    public static final class Builder extends Request.Builder<GetSourceRequest, Builder> {
        private Boolean includeDetails; 
        private String sourceId; 
        private String tenantId; 

        private Builder() {
            super();
        } 

        private Builder(GetSourceRequest request) {
            super(request);
            this.includeDetails = request.includeDetails;
            this.sourceId = request.sourceId;
            this.tenantId = request.tenantId;
        } 

        /**
         * <p>是否返回大体积明细字段（settings / notes / structuredTables / unstructuredDocs）。默认 False，仅返回元信息。</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder includeDetails(Boolean includeDetails) {
            this.putBodyParameter("includeDetails", includeDetails);
            this.includeDetails = includeDetails;
            return this;
        }

        /**
         * <p>数据源 ID（租户内唯一）</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>exampleSourceId</p>
         */
        public Builder sourceId(String sourceId) {
            this.putBodyParameter("sourceId", sourceId);
            this.sourceId = sourceId;
            return this;
        }

        /**
         * <p>租户ID，公共参数，缺省时使用调用方默认租户</p>
         * 
         * <strong>example:</strong>
         * <p>10000</p>
         */
        public Builder tenantId(String tenantId) {
            this.putQueryParameter("tenantId", tenantId);
            this.tenantId = tenantId;
            return this;
        }

        @Override
        public GetSourceRequest build() {
            return new GetSourceRequest(this);
        } 

    } 

}
