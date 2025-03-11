// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.drds20190123.models;

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
 * {@link EnableSqlAuditRequest} extends {@link RequestModel}
 *
 * <p>EnableSqlAuditRequest</p>
 */
public class EnableSqlAuditRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DbName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String dbName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DrdsInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String drdsInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IsRecall")
    private Boolean isRecall;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RecallEndTimestamp")
    private String recallEndTimestamp;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RecallStartTimestamp")
    private String recallStartTimestamp;

    private EnableSqlAuditRequest(Builder builder) {
        super(builder);
        this.dbName = builder.dbName;
        this.drdsInstanceId = builder.drdsInstanceId;
        this.isRecall = builder.isRecall;
        this.recallEndTimestamp = builder.recallEndTimestamp;
        this.recallStartTimestamp = builder.recallStartTimestamp;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static EnableSqlAuditRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dbName
     */
    public String getDbName() {
        return this.dbName;
    }

    /**
     * @return drdsInstanceId
     */
    public String getDrdsInstanceId() {
        return this.drdsInstanceId;
    }

    /**
     * @return isRecall
     */
    public Boolean getIsRecall() {
        return this.isRecall;
    }

    /**
     * @return recallEndTimestamp
     */
    public String getRecallEndTimestamp() {
        return this.recallEndTimestamp;
    }

    /**
     * @return recallStartTimestamp
     */
    public String getRecallStartTimestamp() {
        return this.recallStartTimestamp;
    }

    public static final class Builder extends Request.Builder<EnableSqlAuditRequest, Builder> {
        private String dbName; 
        private String drdsInstanceId; 
        private Boolean isRecall; 
        private String recallEndTimestamp; 
        private String recallStartTimestamp; 

        private Builder() {
            super();
        } 

        private Builder(EnableSqlAuditRequest request) {
            super(request);
            this.dbName = request.dbName;
            this.drdsInstanceId = request.drdsInstanceId;
            this.isRecall = request.isRecall;
            this.recallEndTimestamp = request.recallEndTimestamp;
            this.recallStartTimestamp = request.recallStartTimestamp;
        } 

        /**
         * <p>The name of the database for which you want to enable the SQL audit feature.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder dbName(String dbName) {
            this.putQueryParameter("DbName", dbName);
            this.dbName = dbName;
            return this;
        }

        /**
         * <p>The ID of the PolarDB-X 1.0 instance.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>drds***********</p>
         */
        public Builder drdsInstanceId(String drdsInstanceId) {
            this.putQueryParameter("DrdsInstanceId", drdsInstanceId);
            this.drdsInstanceId = drdsInstanceId;
            return this;
        }

        /**
         * <p>Specifies whether to backtrack historical SQL statements for auditing.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder isRecall(Boolean isRecall) {
            this.putQueryParameter("IsRecall", isRecall);
            this.isRecall = isRecall;
            return this;
        }

        /**
         * <p>The timestamp that indicates when the backtracking ends. Unit: milliseconds.</p>
         * <blockquote>
         * <p>The end time of the backtracking must be later than the start time of the backtracking.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1568875132000</p>
         */
        public Builder recallEndTimestamp(String recallEndTimestamp) {
            this.putQueryParameter("RecallEndTimestamp", recallEndTimestamp);
            this.recallEndTimestamp = recallEndTimestamp;
            return this;
        }

        /**
         * <p>The timestamp that indicates when the backtracking starts. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1568875132000</p>
         */
        public Builder recallStartTimestamp(String recallStartTimestamp) {
            this.putQueryParameter("RecallStartTimestamp", recallStartTimestamp);
            this.recallStartTimestamp = recallStartTimestamp;
            return this;
        }

        @Override
        public EnableSqlAuditRequest build() {
            return new EnableSqlAuditRequest(this);
        } 

    } 

}
