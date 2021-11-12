// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link CreateUniRestorePlanRequest} extends {@link RequestModel}
 *
 * <p>CreateUniRestorePlanRequest</p>
 */
public class CreateUniRestorePlanRequest extends Request {
    @Query
    @NameInMap("Database")
    private String database;

    @Query
    @NameInMap("InstanceUuid")
    private String instanceUuid;

    @Query
    @NameInMap("PolicyId")
    private Long policyId;

    @Query
    @NameInMap("ResetScn")
    private String resetScn;

    @Query
    @NameInMap("ResetTime")
    private String resetTime;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @Query
    @NameInMap("RestoreInfo")
    private String restoreInfo;

    @Query
    @NameInMap("SourceIp")
    private String sourceIp;

    @Query
    @NameInMap("TimePoint")
    private Long timePoint;


    private CreateUniRestorePlanRequest(Builder builder) {
        super(builder);
        this.database = builder.database;
        this.instanceUuid = builder.instanceUuid;
        this.policyId = builder.policyId;
        this.resetScn = builder.resetScn;
        this.resetTime = builder.resetTime;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.restoreInfo = builder.restoreInfo;
        this.sourceIp = builder.sourceIp;
        this.timePoint = builder.timePoint;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateUniRestorePlanRequest create() {
        return builder().build();
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
     * @return resourceOwnerId
     */
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    /**
     * @return restoreInfo
     */
    public String getRestoreInfo() {
        return this.restoreInfo;
    }

    /**
     * @return sourceIp
     */
    public String getSourceIp() {
        return this.sourceIp;
    }

    /**
     * @return timePoint
     */
    public Long getTimePoint() {
        return this.timePoint;
    }

    public static final class Builder extends Request.Builder {
        private String database; 
        private String instanceUuid; 
        private Long policyId; 
        private String resetScn; 
        private String resetTime; 
        private Long resourceOwnerId; 
        private String restoreInfo; 
        private String sourceIp; 
        private Long timePoint; 

        /**
         * <p>Database.</p>
         */
        public Builder database(String database) {
            this.putQueryParameter("Database", database);
            this.database = database;
            return this;
        }

        /**
         * <p>InstanceUuid.</p>
         */
        public Builder instanceUuid(String instanceUuid) {
            this.putQueryParameter("InstanceUuid", instanceUuid);
            this.instanceUuid = instanceUuid;
            return this;
        }

        /**
         * <p>PolicyId.</p>
         */
        public Builder policyId(Long policyId) {
            this.putQueryParameter("PolicyId", policyId);
            this.policyId = policyId;
            return this;
        }

        /**
         * <p>ResetScn.</p>
         */
        public Builder resetScn(String resetScn) {
            this.putQueryParameter("ResetScn", resetScn);
            this.resetScn = resetScn;
            return this;
        }

        /**
         * <p>ResetTime.</p>
         */
        public Builder resetTime(String resetTime) {
            this.putQueryParameter("ResetTime", resetTime);
            this.resetTime = resetTime;
            return this;
        }

        /**
         * <p>ResourceOwnerId.</p>
         */
        public Builder resourceOwnerId(Long resourceOwnerId) {
            this.putQueryParameter("ResourceOwnerId", resourceOwnerId);
            this.resourceOwnerId = resourceOwnerId;
            return this;
        }

        /**
         * <p>RestoreInfo.</p>
         */
        public Builder restoreInfo(String restoreInfo) {
            this.putQueryParameter("RestoreInfo", restoreInfo);
            this.restoreInfo = restoreInfo;
            return this;
        }

        /**
         * <p>SourceIp.</p>
         */
        public Builder sourceIp(String sourceIp) {
            this.putQueryParameter("SourceIp", sourceIp);
            this.sourceIp = sourceIp;
            return this;
        }

        /**
         * <p>TimePoint.</p>
         */
        public Builder timePoint(Long timePoint) {
            this.putQueryParameter("TimePoint", timePoint);
            this.timePoint = timePoint;
            return this;
        }

        public CreateUniRestorePlanRequest build() {
            return new CreateUniRestorePlanRequest(this);
        } 

    } 

}
