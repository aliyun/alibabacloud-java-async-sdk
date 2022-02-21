// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.drds20190123.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link EnableSqlAuditRequest} extends {@link RequestModel}
 *
 * <p>EnableSqlAuditRequest</p>
 */
public class EnableSqlAuditRequest extends Request {
    @Query
    @NameInMap("DbName")
    @Validation(required = true)
    private String dbName;

    @Query
    @NameInMap("DrdsInstanceId")
    @Validation(required = true)
    private String drdsInstanceId;

    @Query
    @NameInMap("IsRecall")
    private Boolean isRecall;

    @Query
    @NameInMap("RecallEndTimestamp")
    private String recallEndTimestamp;

    @Query
    @NameInMap("RecallStartTimestamp")
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

        private Builder(EnableSqlAuditRequest response) {
            super(response);
            this.dbName = response.dbName;
            this.drdsInstanceId = response.drdsInstanceId;
            this.isRecall = response.isRecall;
            this.recallEndTimestamp = response.recallEndTimestamp;
            this.recallStartTimestamp = response.recallStartTimestamp;
        } 

        /**
         * DbName.
         */
        public Builder dbName(String dbName) {
            this.putQueryParameter("DbName", dbName);
            this.dbName = dbName;
            return this;
        }

        /**
         * DrdsInstanceId.
         */
        public Builder drdsInstanceId(String drdsInstanceId) {
            this.putQueryParameter("DrdsInstanceId", drdsInstanceId);
            this.drdsInstanceId = drdsInstanceId;
            return this;
        }

        /**
         * IsRecall.
         */
        public Builder isRecall(Boolean isRecall) {
            this.putQueryParameter("IsRecall", isRecall);
            this.isRecall = isRecall;
            return this;
        }

        /**
         * RecallEndTimestamp.
         */
        public Builder recallEndTimestamp(String recallEndTimestamp) {
            this.putQueryParameter("RecallEndTimestamp", recallEndTimestamp);
            this.recallEndTimestamp = recallEndTimestamp;
            return this;
        }

        /**
         * RecallStartTimestamp.
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
