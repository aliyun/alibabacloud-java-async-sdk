// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

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
 * {@link AnswerSqlSyntaxByMetaAgentRequest} extends {@link RequestModel}
 *
 * <p>AnswerSqlSyntaxByMetaAgentRequest</p>
 */
public class AnswerSqlSyntaxByMetaAgentRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DbId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String dbId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Model")
    private String model;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Query")
    private String query;

    private AnswerSqlSyntaxByMetaAgentRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.dbId = builder.dbId;
        this.model = builder.model;
        this.query = builder.query;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AnswerSqlSyntaxByMetaAgentRequest create() {
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
     * @return dbId
     */
    public String getDbId() {
        return this.dbId;
    }

    /**
     * @return model
     */
    public String getModel() {
        return this.model;
    }

    /**
     * @return query
     */
    public String getQuery() {
        return this.query;
    }

    public static final class Builder extends Request.Builder<AnswerSqlSyntaxByMetaAgentRequest, Builder> {
        private String regionId; 
        private String dbId; 
        private String model; 
        private String query; 

        private Builder() {
            super();
        } 

        private Builder(AnswerSqlSyntaxByMetaAgentRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.dbId = request.dbId;
            this.model = request.model;
            this.query = request.query;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The ID of the database. You can call the <a href="https://help.aliyun.com/document_detail/141873.html">ListDatabases</a> operation to obtain the ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1***</p>
         */
        public Builder dbId(String dbId) {
            this.putQueryParameter("DbId", dbId);
            this.dbId = dbId;
            return this;
        }

        /**
         * <p>The name of the selected model. You can use only Qwen series models.</p>
         * 
         * <strong>example:</strong>
         * <p>qwen-plus</p>
         */
        public Builder model(String model) {
            this.putQueryParameter("Model", model);
            this.model = model;
            return this;
        }

        /**
         * <p>The syntax question.</p>
         * 
         * <strong>example:</strong>
         * <p>怎么获取当前时间的字符串</p>
         */
        public Builder query(String query) {
            this.putQueryParameter("Query", query);
            this.query = query;
            return this;
        }

        @Override
        public AnswerSqlSyntaxByMetaAgentRequest build() {
            return new AnswerSqlSyntaxByMetaAgentRequest(this);
        } 

    } 

}
