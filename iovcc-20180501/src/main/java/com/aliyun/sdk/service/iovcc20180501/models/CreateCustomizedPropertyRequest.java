// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iovcc20180501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateCustomizedPropertyRequest} extends {@link RequestModel}
 *
 * <p>CreateCustomizedPropertyRequest</p>
 */
public class CreateCustomizedPropertyRequest extends Request {
    @Query
    @NameInMap("Name")
    @Validation(required = true)
    private String name;

    @Query
    @NameInMap("ProjectId")
    @Validation(required = true)
    private String projectId;

    @Host
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("Value")
    @Validation(required = true)
    private String value;

    @Query
    @NameInMap("VersionId")
    @Validation(required = true)
    private String versionId;

    @Query
    @NameInMap("VersionType")
    @Validation(required = true)
    private String versionType;

    private CreateCustomizedPropertyRequest(Builder builder) {
        super(builder);
        this.name = builder.name;
        this.projectId = builder.projectId;
        this.regionId = builder.regionId;
        this.value = builder.value;
        this.versionId = builder.versionId;
        this.versionType = builder.versionType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateCustomizedPropertyRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
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
     * @return value
     */
    public String getValue() {
        return this.value;
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

    public static final class Builder extends Request.Builder<CreateCustomizedPropertyRequest, Builder> {
        private String name; 
        private String projectId; 
        private String regionId; 
        private String value; 
        private String versionId; 
        private String versionType; 

        private Builder() {
            super();
        } 

        private Builder(CreateCustomizedPropertyRequest response) {
            super(response);
            this.name = response.name;
            this.projectId = response.projectId;
            this.regionId = response.regionId;
            this.value = response.value;
            this.versionId = response.versionId;
            this.versionType = response.versionType;
        } 

        /**
         * Name.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
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
         * Value.
         */
        public Builder value(String value) {
            this.putQueryParameter("Value", value);
            this.value = value;
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
        public CreateCustomizedPropertyRequest build() {
            return new CreateCustomizedPropertyRequest(this);
        } 

    } 

}
