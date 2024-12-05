// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.searchengine20211025.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetTableGenerationRequest} extends {@link RequestModel}
 *
 * <p>GetTableGenerationRequest</p>
 */
public class GetTableGenerationRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("instanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("tableName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String tableName;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("generationId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long generationId;

    private GetTableGenerationRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.tableName = builder.tableName;
        this.generationId = builder.generationId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetTableGenerationRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return tableName
     */
    public String getTableName() {
        return this.tableName;
    }

    /**
     * @return generationId
     */
    public Long getGenerationId() {
        return this.generationId;
    }

    public static final class Builder extends Request.Builder<GetTableGenerationRequest, Builder> {
        private String instanceId; 
        private String tableName; 
        private Long generationId; 

        private Builder() {
            super();
        } 

        private Builder(GetTableGenerationRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.tableName = request.tableName;
            this.generationId = request.generationId;
        } 

        /**
         * <p>The instance ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ha-cn-pl32rf0js04</p>
         */
        public Builder instanceId(String instanceId) {
            this.putPathParameter("instanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The name of the table.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test_summary</p>
         */
        public Builder tableName(String tableName) {
            this.putPathParameter("tableName", tableName);
            this.tableName = tableName;
            return this;
        }

        /**
         * <p>The ID of the full index version.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1708674867</p>
         */
        public Builder generationId(Long generationId) {
            this.putPathParameter("generationId", generationId);
            this.generationId = generationId;
            return this;
        }

        @Override
        public GetTableGenerationRequest build() {
            return new GetTableGenerationRequest(this);
        } 

    } 

}
