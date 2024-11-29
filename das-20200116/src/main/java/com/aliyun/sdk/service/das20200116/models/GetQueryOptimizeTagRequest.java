// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.das20200116.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetQueryOptimizeTagRequest} extends {@link RequestModel}
 *
 * <p>GetQueryOptimizeTagRequest</p>
 */
public class GetQueryOptimizeTagRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Engine")
    @com.aliyun.core.annotation.Validation(required = true)
    private String engine;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SqlId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String sqlId;

    private GetQueryOptimizeTagRequest(Builder builder) {
        super(builder);
        this.engine = builder.engine;
        this.instanceId = builder.instanceId;
        this.sqlId = builder.sqlId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetQueryOptimizeTagRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return engine
     */
    public String getEngine() {
        return this.engine;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return sqlId
     */
    public String getSqlId() {
        return this.sqlId;
    }

    public static final class Builder extends Request.Builder<GetQueryOptimizeTagRequest, Builder> {
        private String engine; 
        private String instanceId; 
        private String sqlId; 

        private Builder() {
            super();
        } 

        private Builder(GetQueryOptimizeTagRequest request) {
            super(request);
            this.engine = request.engine;
            this.instanceId = request.instanceId;
            this.sqlId = request.sqlId;
        } 

        /**
         * <p>The database engine. Valid values:</p>
         * <ul>
         * <li><strong>MySQL</strong>: ApsaraDB RDS for MySQL</li>
         * <li><strong>PolarDBMySQL</strong>: PolarDB for MySQL</li>
         * <li><strong>PostgreSQL</strong>: ApsaraDB RDS for PostgreSQL</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>MySQL</p>
         */
        public Builder engine(String engine) {
            this.putQueryParameter("Engine", engine);
            this.engine = engine;
            return this;
        }

        /**
         * <p>The instance ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>rm-2ze8g2am97624****</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The SQL template ID. You can call the <a href="https://help.aliyun.com/document_detail/405261.html">GetQueryOptimizeDataStats</a> operation to query the SQL template ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>29d9fef63e347d39c3436658a5fe5f2b</p>
         */
        public Builder sqlId(String sqlId) {
            this.putQueryParameter("SqlId", sqlId);
            this.sqlId = sqlId;
            return this;
        }

        @Override
        public GetQueryOptimizeTagRequest build() {
            return new GetQueryOptimizeTagRequest(this);
        } 

    } 

}
