// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iovcc20180501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DiagnosisVersionRequest} extends {@link RequestModel}
 *
 * <p>DiagnosisVersionRequest</p>
 */
public class DiagnosisVersionRequest extends Request {
    @Query
    @NameInMap("DiagnoseStyle")
    @Validation(required = true)
    private String diagnoseStyle;

    @Query
    @NameInMap("EndTime")
    private String endTime;

    @Query
    @NameInMap("IdType")
    @Validation(required = true)
    private String idType;

    @Query
    @NameInMap("OriginalId")
    @Validation(required = true)
    private String originalId;

    @Query
    @NameInMap("ProjectId")
    @Validation(required = true)
    private String projectId;

    @Host
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("StartTime")
    private String startTime;

    @Query
    @NameInMap("VersionId")
    @Validation(required = true)
    private String versionId;

    @Query
    @NameInMap("VersionType")
    @Validation(required = true)
    private String versionType;

    private DiagnosisVersionRequest(Builder builder) {
        super(builder);
        this.diagnoseStyle = builder.diagnoseStyle;
        this.endTime = builder.endTime;
        this.idType = builder.idType;
        this.originalId = builder.originalId;
        this.projectId = builder.projectId;
        this.regionId = builder.regionId;
        this.startTime = builder.startTime;
        this.versionId = builder.versionId;
        this.versionType = builder.versionType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DiagnosisVersionRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return diagnoseStyle
     */
    public String getDiagnoseStyle() {
        return this.diagnoseStyle;
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return idType
     */
    public String getIdType() {
        return this.idType;
    }

    /**
     * @return originalId
     */
    public String getOriginalId() {
        return this.originalId;
    }

    /**
     * @return projectId
     */
    public String getProjectId() {
        return this.projectId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    /**
     * @return versionId
     */
    public String getVersionId() {
        return this.versionId;
    }

    /**
     * @return versionType
     */
    public String getVersionType() {
        return this.versionType;
    }

    public static final class Builder extends Request.Builder<DiagnosisVersionRequest, Builder> {
        private String diagnoseStyle; 
        private String endTime; 
        private String idType; 
        private String originalId; 
        private String projectId; 
        private String regionId; 
        private String startTime; 
        private String versionId; 
        private String versionType; 

        private Builder() {
            super();
        } 

        private Builder(DiagnosisVersionRequest response) {
            super(response);
            this.diagnoseStyle = response.diagnoseStyle;
            this.endTime = response.endTime;
            this.idType = response.idType;
            this.originalId = response.originalId;
            this.projectId = response.projectId;
            this.regionId = response.regionId;
            this.startTime = response.startTime;
            this.versionId = response.versionId;
            this.versionType = response.versionType;
        } 

        /**
         * DiagnoseStyle.
         */
        public Builder diagnoseStyle(String diagnoseStyle) {
            this.putQueryParameter("DiagnoseStyle", diagnoseStyle);
            this.diagnoseStyle = diagnoseStyle;
            return this;
        }

        /**
         * EndTime.
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * IdType.
         */
        public Builder idType(String idType) {
            this.putQueryParameter("IdType", idType);
            this.idType = idType;
            return this;
        }

        /**
         * OriginalId.
         */
        public Builder originalId(String originalId) {
            this.putQueryParameter("OriginalId", originalId);
            this.originalId = originalId;
            return this;
        }

        /**
         * ProjectId.
         */
        public Builder projectId(String projectId) {
            this.putQueryParameter("ProjectId", projectId);
            this.projectId = projectId;
            return this;
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
         * StartTime.
         */
        public Builder startTime(String startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * VersionId.
         */
        public Builder versionId(String versionId) {
            this.putQueryParameter("VersionId", versionId);
            this.versionId = versionId;
            return this;
        }

        /**
         * VersionType.
         */
        public Builder versionType(String versionType) {
            this.putQueryParameter("VersionType", versionType);
            this.versionType = versionType;
            return this;
        }

        @Override
        public DiagnosisVersionRequest build() {
            return new DiagnosisVersionRequest(this);
        } 

    } 

}
