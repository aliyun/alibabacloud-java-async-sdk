// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateUniRestorePlanRequest} extends {@link RequestModel}
 *
 * <p>CreateUniRestorePlanRequest</p>
 */
public class CreateUniRestorePlanRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Database")
    private String database;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceUuid")
    private String instanceUuid;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PolicyId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long policyId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResetScn")
    private String resetScn;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResetTime")
    private String resetTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RestoreInfo")
    private String restoreInfo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TimePoint")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long timePoint;

    private CreateUniRestorePlanRequest(Builder builder) {
        super(builder);
        this.database = builder.database;
        this.instanceUuid = builder.instanceUuid;
        this.policyId = builder.policyId;
        this.resetScn = builder.resetScn;
        this.resetTime = builder.resetTime;
        this.restoreInfo = builder.restoreInfo;
        this.timePoint = builder.timePoint;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateUniRestorePlanRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return database
     */
    public String getDatabase() {
        return this.database;
    }

    /**
     * @return instanceUuid
     */
    public String getInstanceUuid() {
        return this.instanceUuid;
    }

    /**
     * @return policyId
     */
    public Long getPolicyId() {
        return this.policyId;
    }

    /**
     * @return resetScn
     */
    public String getResetScn() {
        return this.resetScn;
    }

    /**
     * @return resetTime
     */
    public String getResetTime() {
        return this.resetTime;
    }

    /**
     * @return restoreInfo
     */
    public String getRestoreInfo() {
        return this.restoreInfo;
    }

    /**
     * @return timePoint
     */
    public Long getTimePoint() {
        return this.timePoint;
    }

    public static final class Builder extends Request.Builder<CreateUniRestorePlanRequest, Builder> {
        private String database; 
        private String instanceUuid; 
        private Long policyId; 
        private String resetScn; 
        private String resetTime; 
        private String restoreInfo; 
        private Long timePoint; 

        private Builder() {
            super();
        } 

        private Builder(CreateUniRestorePlanRequest request) {
            super(request);
            this.database = request.database;
            this.instanceUuid = request.instanceUuid;
            this.policyId = request.policyId;
            this.resetScn = request.resetScn;
            this.resetTime = request.resetTime;
            this.restoreInfo = request.restoreInfo;
            this.timePoint = request.timePoint;
        } 

        /**
         * The name of the database.
         */
        public Builder database(String database) {
            this.putQueryParameter("Database", database);
            this.database = database;
            return this;
        }

        /**
         * The UUID of the Hybrid Backup Recovery (HBR) agent that is used to restore the data of the database on your server.
         * <p>
         * 
         * >  You can call the [DescribeUniBackupDatabase](~~DescribeUniBackupDatabase~~) operation to query the UUID.
         */
        public Builder instanceUuid(String instanceUuid) {
            this.putQueryParameter("InstanceUuid", instanceUuid);
            this.instanceUuid = instanceUuid;
            return this;
        }

        /**
         * The ID of the anti-ransomware policy.
         * <p>
         * 
         * >  You can call the [DescribeUniBackupPolicies](~~DescribeUniBackupPolicies~~) operation to query the ID.
         */
        public Builder policyId(Long policyId) {
            this.putQueryParameter("PolicyId", policyId);
            this.policyId = policyId;
            return this;
        }

        /**
         * The identifier of the point in time for restoration in the backup version that you want to use. The database is an Oracle database.****
         * <p>
         * 
         * >  You can call the [DescribeUniRecoverableList](~~DescribeUniRecoverableList~~) operation to query the value.
         */
        public Builder resetScn(String resetScn) {
            this.putQueryParameter("ResetScn", resetScn);
            this.resetScn = resetScn;
            return this;
        }

        /**
         * The point in time for restoration in the backup version that you want to use. The database is an Oracle database.****
         * <p>
         * 
         * >  You can call the [DescribeUniRecoverableList](~~DescribeUniRecoverableList~~) operation to query the value.
         */
        public Builder resetTime(String resetTime) {
            this.putQueryParameter("ResetTime", resetTime);
            this.resetTime = resetTime;
            return this;
        }

        /**
         * The information about the database. This parameter is available when the database is a Microsoft SQL Server (MSSQL) database. The value is a JSON string. Valid values:
         * <p>
         * 
         * *   **name**: the name of the database
         * *   **files**: the path to the database files
         * 
         * >  You can call the [DescribeUniRecoverableList](~~DescribeUniRecoverableList~~) operation to query the information.
         */
        public Builder restoreInfo(String restoreInfo) {
            this.putQueryParameter("RestoreInfo", restoreInfo);
            this.restoreInfo = restoreInfo;
            return this;
        }

        /**
         * The point in time to which you want to restore data.
         * <p>
         * 
         * >  You can call the [DescribeRestorePlans](~~DescribeRestorePlans~~) operation to query the point in time.
         */
        public Builder timePoint(Long timePoint) {
            this.putQueryParameter("TimePoint", timePoint);
            this.timePoint = timePoint;
            return this;
        }

        @Override
        public CreateUniRestorePlanRequest build() {
            return new CreateUniRestorePlanRequest(this);
        } 

    } 

}
