// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.airec20201126.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DeleteExtraDataSourceRequest} extends {@link RequestModel}
 *
 * <p>DeleteExtraDataSourceRequest</p>
 */
public class DeleteExtraDataSourceRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("instanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("type")
    @com.aliyun.core.annotation.Validation(required = true)
    private String type;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("dataSourceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String dataSourceId;

    private DeleteExtraDataSourceRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.type = builder.type;
        this.dataSourceId = builder.dataSourceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteExtraDataSourceRequest create() {
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
     * @return type
     */
    public String getType() {
        return this.type;
    }

    /**
     * @return dataSourceId
     */
    public String getDataSourceId() {
        return this.dataSourceId;
    }

    public static final class Builder extends Request.Builder<DeleteExtraDataSourceRequest, Builder> {
        private String instanceId; 
        private String type; 
        private String dataSourceId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteExtraDataSourceRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.type = request.type;
            this.dataSourceId = request.dataSourceId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>airec-cn-shdjkgkeog</p>
         */
        public Builder instanceId(String instanceId) {
            this.putPathParameter("instanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>数据源类型 UserCustomDataSource ItemCustomDataSource BehaviorCustomDataSource SampleCustomDataSource</p>
         */
        public Builder type(String type) {
            this.putPathParameter("type", type);
            this.type = type;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        public Builder dataSourceId(String dataSourceId) {
            this.putPathParameter("dataSourceId", dataSourceId);
            this.dataSourceId = dataSourceId;
            return this;
        }

        @Override
        public DeleteExtraDataSourceRequest build() {
            return new DeleteExtraDataSourceRequest(this);
        } 

    } 

}
