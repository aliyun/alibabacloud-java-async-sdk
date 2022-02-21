// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iovcc20180501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetDeviceAppUpdateFunnelEventsRequest} extends {@link RequestModel}
 *
 * <p>GetDeviceAppUpdateFunnelEventsRequest</p>
 */
public class GetDeviceAppUpdateFunnelEventsRequest extends Request {
    @Query
    @NameInMap("IdType")
    private String idType;

    @Query
    @NameInMap("OriginalId")
    private String originalId;

    @Query
    @NameInMap("PackageName")
    private String packageName;

    @Query
    @NameInMap("ProjectId")
    @Validation(required = true)
    private String projectId;

    @Host
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("TargetVersionCode")
    private String targetVersionCode;

    private GetDeviceAppUpdateFunnelEventsRequest(Builder builder) {
        super(builder);
        this.idType = builder.idType;
        this.originalId = builder.originalId;
        this.packageName = builder.packageName;
        this.projectId = builder.projectId;
        this.regionId = builder.regionId;
        this.targetVersionCode = builder.targetVersionCode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDeviceAppUpdateFunnelEventsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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
     * @return packageName
     */
    public String getPackageName() {
        return this.packageName;
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
     * @return targetVersionCode
     */
    public String getTargetVersionCode() {
        return this.targetVersionCode;
    }

    public static final class Builder extends Request.Builder<GetDeviceAppUpdateFunnelEventsRequest, Builder> {
        private String idType; 
        private String originalId; 
        private String packageName; 
        private String projectId; 
        private String regionId; 
        private String targetVersionCode; 

        private Builder() {
            super();
        } 

        private Builder(GetDeviceAppUpdateFunnelEventsRequest response) {
            super(response);
            this.idType = response.idType;
            this.originalId = response.originalId;
            this.packageName = response.packageName;
            this.projectId = response.projectId;
            this.regionId = response.regionId;
            this.targetVersionCode = response.targetVersionCode;
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
         * PackageName.
         */
        public Builder packageName(String packageName) {
            this.putQueryParameter("PackageName", packageName);
            this.packageName = packageName;
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
         * TargetVersionCode.
         */
        public Builder targetVersionCode(String targetVersionCode) {
            this.putQueryParameter("TargetVersionCode", targetVersionCode);
            this.targetVersionCode = targetVersionCode;
            return this;
        }

        @Override
        public GetDeviceAppUpdateFunnelEventsRequest build() {
            return new GetDeviceAppUpdateFunnelEventsRequest(this);
        } 

    } 

}
