// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hbr20170908.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateBackupPlanRequest} extends {@link RequestModel}
 *
 * <p>UpdateBackupPlanRequest</p>
 */
public class UpdateBackupPlanRequest extends Request {
    @Body
    @NameInMap("Exclude")
    private String exclude;

    @Body
    @NameInMap("Include")
    private String include;

    @Body
    @NameInMap("Options")
    private String options;

    @Body
    @NameInMap("OtsDetail")
    private OtsDetail otsDetail;

    @Query
    @NameInMap("Path")
    private java.util.List < String > path;

    @Query
    @NameInMap("PlanId")
    @Validation(required = true)
    private String planId;

    @Query
    @NameInMap("PlanName")
    private String planName;

    @Query
    @NameInMap("Prefix")
    private String prefix;

    @Query
    @NameInMap("Retention")
    private Long retention;

    @Query
    @NameInMap("Schedule")
    private String schedule;

    @Query
    @NameInMap("SourceType")
    private String sourceType;

    @Query
    @NameInMap("SpeedLimit")
    private String speedLimit;

    @Query
    @NameInMap("UpdatePaths")
    private Boolean updatePaths;

    @Query
    @NameInMap("VaultId")
    private String vaultId;

    private UpdateBackupPlanRequest(Builder builder) {
        super(builder);
        this.exclude = builder.exclude;
        this.include = builder.include;
        this.options = builder.options;
        this.otsDetail = builder.otsDetail;
        this.path = builder.path;
        this.planId = builder.planId;
        this.planName = builder.planName;
        this.prefix = builder.prefix;
        this.retention = builder.retention;
        this.schedule = builder.schedule;
        this.sourceType = builder.sourceType;
        this.speedLimit = builder.speedLimit;
        this.updatePaths = builder.updatePaths;
        this.vaultId = builder.vaultId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateBackupPlanRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return exclude
     */
    public String getExclude() {
        return this.exclude;
    }

    /**
     * @return include
     */
    public String getInclude() {
        return this.include;
    }

    /**
     * @return options
     */
    public String getOptions() {
        return this.options;
    }

    /**
     * @return otsDetail
     */
    public OtsDetail getOtsDetail() {
        return this.otsDetail;
    }

    /**
     * @return path
     */
    public java.util.List < String > getPath() {
        return this.path;
    }

    /**
     * @return planId
     */
    public String getPlanId() {
        return this.planId;
    }

    /**
     * @return planName
     */
    public String getPlanName() {
        return this.planName;
    }

    /**
     * @return prefix
     */
    public String getPrefix() {
        return this.prefix;
    }

    /**
     * @return retention
     */
    public Long getRetention() {
        return this.retention;
    }

    /**
     * @return schedule
     */
    public String getSchedule() {
        return this.schedule;
    }

    /**
     * @return sourceType
     */
    public String getSourceType() {
        return this.sourceType;
    }

    /**
     * @return speedLimit
     */
    public String getSpeedLimit() {
        return this.speedLimit;
    }

    /**
     * @return updatePaths
     */
    public Boolean getUpdatePaths() {
        return this.updatePaths;
    }

    /**
     * @return vaultId
     */
    public String getVaultId() {
        return this.vaultId;
    }

    public static final class Builder extends Request.Builder<UpdateBackupPlanRequest, Builder> {
        private String exclude; 
        private String include; 
        private String options; 
        private OtsDetail otsDetail; 
        private java.util.List < String > path; 
        private String planId; 
        private String planName; 
        private String prefix; 
        private Long retention; 
        private String schedule; 
        private String sourceType; 
        private String speedLimit; 
        private Boolean updatePaths; 
        private String vaultId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateBackupPlanRequest response) {
            super(response);
            this.exclude = response.exclude;
            this.include = response.include;
            this.options = response.options;
            this.otsDetail = response.otsDetail;
            this.path = response.path;
            this.planId = response.planId;
            this.planName = response.planName;
            this.prefix = response.prefix;
            this.retention = response.retention;
            this.schedule = response.schedule;
            this.sourceType = response.sourceType;
            this.speedLimit = response.speedLimit;
            this.updatePaths = response.updatePaths;
            this.vaultId = response.vaultId;
        } 

        /**
         * Exclude.
         */
        public Builder exclude(String exclude) {
            this.putBodyParameter("Exclude", exclude);
            this.exclude = exclude;
            return this;
        }

        /**
         * Include.
         */
        public Builder include(String include) {
            this.putBodyParameter("Include", include);
            this.include = include;
            return this;
        }

        /**
         * Options.
         */
        public Builder options(String options) {
            this.putBodyParameter("Options", options);
            this.options = options;
            return this;
        }

        /**
         * OtsDetail.
         */
        public Builder otsDetail(OtsDetail otsDetail) {
            this.putBodyParameter("OtsDetail", otsDetail);
            this.otsDetail = otsDetail;
            return this;
        }

        /**
         * Path.
         */
        public Builder path(java.util.List < String > path) {
            this.putQueryParameter("Path", path);
            this.path = path;
            return this;
        }

        /**
         * PlanId.
         */
        public Builder planId(String planId) {
            this.putQueryParameter("PlanId", planId);
            this.planId = planId;
            return this;
        }

        /**
         * PlanName.
         */
        public Builder planName(String planName) {
            this.putQueryParameter("PlanName", planName);
            this.planName = planName;
            return this;
        }

        /**
         * Prefix.
         */
        public Builder prefix(String prefix) {
            this.putQueryParameter("Prefix", prefix);
            this.prefix = prefix;
            return this;
        }

        /**
         * Retention.
         */
        public Builder retention(Long retention) {
            this.putQueryParameter("Retention", retention);
            this.retention = retention;
            return this;
        }

        /**
         * Schedule.
         */
        public Builder schedule(String schedule) {
            this.putQueryParameter("Schedule", schedule);
            this.schedule = schedule;
            return this;
        }

        /**
         * SourceType.
         */
        public Builder sourceType(String sourceType) {
            this.putQueryParameter("SourceType", sourceType);
            this.sourceType = sourceType;
            return this;
        }

        /**
         * SpeedLimit.
         */
        public Builder speedLimit(String speedLimit) {
            this.putQueryParameter("SpeedLimit", speedLimit);
            this.speedLimit = speedLimit;
            return this;
        }

        /**
         * UpdatePaths.
         */
        public Builder updatePaths(Boolean updatePaths) {
            this.putQueryParameter("UpdatePaths", updatePaths);
            this.updatePaths = updatePaths;
            return this;
        }

        /**
         * VaultId.
         */
        public Builder vaultId(String vaultId) {
            this.putQueryParameter("VaultId", vaultId);
            this.vaultId = vaultId;
            return this;
        }

        @Override
        public UpdateBackupPlanRequest build() {
            return new UpdateBackupPlanRequest(this);
        } 

    } 

}
