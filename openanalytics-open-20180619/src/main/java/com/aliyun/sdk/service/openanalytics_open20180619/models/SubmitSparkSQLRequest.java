// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.openanalytics_open20180619.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link SubmitSparkSQLRequest} extends {@link RequestModel}
 *
 * <p>SubmitSparkSQLRequest</p>
 */
public class SubmitSparkSQLRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Sql")
    @com.aliyun.core.annotation.Validation(required = true)
    private String sql;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("VcName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String vcName;

    private SubmitSparkSQLRequest(Builder builder) {
        super(builder);
        this.sql = builder.sql;
        this.vcName = builder.vcName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SubmitSparkSQLRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return sql
     */
    public String getSql() {
        return this.sql;
    }

    /**
     * @return vcName
     */
    public String getVcName() {
        return this.vcName;
    }

    public static final class Builder extends Request.Builder<SubmitSparkSQLRequest, Builder> {
        private String sql; 
        private String vcName; 

        private Builder() {
            super();
        } 

        private Builder(SubmitSparkSQLRequest request) {
            super(request);
            this.sql = request.sql;
            this.vcName = request.vcName;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>set spark.driver.resourceSpec=medium;set spark.executor.instances=5;  set spark.executor.resourceSpec=medium;  set spark.app.name=sparksqltest;  show databases;</p>
         */
        public Builder sql(String sql) {
            this.putBodyParameter("Sql", sql);
            this.sql = sql;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>MySparkCluster</p>
         */
        public Builder vcName(String vcName) {
            this.putBodyParameter("VcName", vcName);
            this.vcName = vcName;
            return this;
        }

        @Override
        public SubmitSparkSQLRequest build() {
            return new SubmitSparkSQLRequest(this);
        } 

    } 

}
