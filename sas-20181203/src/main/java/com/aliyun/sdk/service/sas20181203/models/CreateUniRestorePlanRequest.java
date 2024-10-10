// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
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
         * <p>The name of the database.</p>
         * 
         * <strong>example:</strong>
         * <p>qtc</p>
         */
        public Builder database(String database) {
            this.putQueryParameter("Database", database);
            this.database = database;
            return this;
        }

        /**
         * <p>The UUID of the Hybrid Backup Recovery (HBR) agent that is used to restore the data of the database on your server.</p>
         * <blockquote>
         * <p> You can call the <a href="~~DescribeUniBackupDatabase~~">DescribeUniBackupDatabase</a> operation to query the UUID.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>ac457b30598d11ed800000163e02****</p>
         */
        public Builder instanceUuid(String instanceUuid) {
            this.putQueryParameter("InstanceUuid", instanceUuid);
            this.instanceUuid = instanceUuid;
            return this;
        }

        /**
         * <p>The ID of the anti-ransomware policy.</p>
         * <blockquote>
         * <p> You can call the <a href="~~DescribeUniBackupPolicies~~">DescribeUniBackupPolicies</a> operation to query the ID.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        public Builder policyId(Long policyId) {
            this.putQueryParameter("PolicyId", policyId);
            this.policyId = policyId;
            return this;
        }

        /**
         * <p>The identifier of the point in time for restoration in the backup version that you want to use. The database is an Oracle database.****</p>
         * <blockquote>
         * <p> You can call the <a href="~~DescribeUniRecoverableList~~">DescribeUniRecoverableList</a> operation to query the value.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>925702.0</p>
         */
        public Builder resetScn(String resetScn) {
            this.putQueryParameter("ResetScn", resetScn);
            this.resetScn = resetScn;
            return this;
        }

        /**
         * <p>The point in time for restoration in the backup version that you want to use. The database is an Oracle database.****</p>
         * <blockquote>
         * <p> You can call the <a href="~~DescribeUniRecoverableList~~">DescribeUniRecoverableList</a> operation to query the value.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>2022-10-29 01:06:24</p>
         */
        public Builder resetTime(String resetTime) {
            this.putQueryParameter("ResetTime", resetTime);
            this.resetTime = resetTime;
            return this;
        }

        /**
         * <p>The information about the database. This parameter is available when the database is a Microsoft SQL Server (MSSQL) database. The value is a JSON string. Valid values:</p>
         * <ul>
         * <li><strong>name</strong>: the name of the database</li>
         * <li><strong>files</strong>: the path to the database files</li>
         * </ul>
         * <blockquote>
         * <p> You can call the <a href="~~DescribeUniRecoverableList~~">DescribeUniRecoverableList</a> operation to query the information.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>{&quot;files&quot;: {&quot;qtc&quot;:&quot;F:\database\qtc.mdf&quot;,&quot;qtc_log&quot;:&quot;F:\database\qtc_0.ldf&quot;},
         * &quot;name&quot;:&quot;qtc&quot;}</p>
         */
        public Builder restoreInfo(String restoreInfo) {
            this.putQueryParameter("RestoreInfo", restoreInfo);
            this.restoreInfo = restoreInfo;
            return this;
        }

        /**
         * <p>The point in time to which you want to restore data.</p>
         * <blockquote>
         * <p> You can call the <a href="~~DescribeRestorePlans~~">DescribeRestorePlans</a> operation to query the point in time.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1656957664000</p>
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
