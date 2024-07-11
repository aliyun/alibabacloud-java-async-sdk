// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hbase20190101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyBackupPlanConfigRequest} extends {@link RequestModel}
 *
 * <p>ModifyBackupPlanConfigRequest</p>
 */
public class ModifyBackupPlanConfigRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FullBackupCycle")
    @com.aliyun.core.annotation.Validation(required = true)
    private String fullBackupCycle;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MinHFileBackupCount")
    @com.aliyun.core.annotation.Validation(required = true)
    private String minHFileBackupCount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NextFullBackupDate")
    @com.aliyun.core.annotation.Validation(required = true)
    private String nextFullBackupDate;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tables")
    @com.aliyun.core.annotation.Validation(required = true)
    private String tables;

    private ModifyBackupPlanConfigRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.fullBackupCycle = builder.fullBackupCycle;
        this.minHFileBackupCount = builder.minHFileBackupCount;
        this.nextFullBackupDate = builder.nextFullBackupDate;
        this.tables = builder.tables;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyBackupPlanConfigRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return fullBackupCycle
     */
    public String getFullBackupCycle() {
        return this.fullBackupCycle;
    }

    /**
     * @return minHFileBackupCount
     */
    public String getMinHFileBackupCount() {
        return this.minHFileBackupCount;
    }

    /**
     * @return nextFullBackupDate
     */
    public String getNextFullBackupDate() {
        return this.nextFullBackupDate;
    }

    /**
     * @return tables
     */
    public String getTables() {
        return this.tables;
    }

    public static final class Builder extends Request.Builder<ModifyBackupPlanConfigRequest, Builder> {
        private String clusterId; 
        private String fullBackupCycle; 
        private String minHFileBackupCount; 
        private String nextFullBackupDate; 
        private String tables; 

        private Builder() {
            super();
        } 

        private Builder(ModifyBackupPlanConfigRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.fullBackupCycle = request.fullBackupCycle;
            this.minHFileBackupCount = request.minHFileBackupCount;
            this.nextFullBackupDate = request.nextFullBackupDate;
            this.tables = request.tables;
        } 

        /**
         * ClusterId.
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * FullBackupCycle.
         */
        public Builder fullBackupCycle(String fullBackupCycle) {
            this.putQueryParameter("FullBackupCycle", fullBackupCycle);
            this.fullBackupCycle = fullBackupCycle;
            return this;
        }

        /**
         * MinHFileBackupCount.
         */
        public Builder minHFileBackupCount(String minHFileBackupCount) {
            this.putQueryParameter("MinHFileBackupCount", minHFileBackupCount);
            this.minHFileBackupCount = minHFileBackupCount;
            return this;
        }

        /**
         * NextFullBackupDate.
         */
        public Builder nextFullBackupDate(String nextFullBackupDate) {
            this.putQueryParameter("NextFullBackupDate", nextFullBackupDate);
            this.nextFullBackupDate = nextFullBackupDate;
            return this;
        }

        /**
         * Tables.
         */
        public Builder tables(String tables) {
            this.putQueryParameter("Tables", tables);
            this.tables = tables;
            return this;
        }

        @Override
        public ModifyBackupPlanConfigRequest build() {
            return new ModifyBackupPlanConfigRequest(this);
        } 

    } 

}
