// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iovcc20180501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateCustomizedFilterRequest} extends {@link RequestModel}
 *
 * <p>CreateCustomizedFilterRequest</p>
 */
public class CreateCustomizedFilterRequest extends Request {
    @Query
    @NameInMap("BlackWhiteType")
    @Validation(required = true)
    private String blackWhiteType;

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
    @NameInMap("ValueCompareType")
    @Validation(required = true)
    private String valueCompareType;

    @Query
    @NameInMap("ValueType")
    @Validation(required = true)
    private String valueType;

    @Query
    @NameInMap("VersionId")
    @Validation(required = true)
    private String versionId;

    @Query
    @NameInMap("VersionType")
    @Validation(required = true)
    private String versionType;

    private CreateCustomizedFilterRequest(Builder builder) {
        super(builder);
        this.blackWhiteType = builder.blackWhiteType;
        this.name = builder.name;
        this.projectId = builder.projectId;
        this.regionId = builder.regionId;
        this.value = builder.value;
        this.valueCompareType = builder.valueCompareType;
        this.valueType = builder.valueType;
        this.versionId = builder.versionId;
        this.versionType = builder.versionType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateCustomizedFilterRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return blackWhiteType
     */
    public String getBlackWhiteType() {
        return this.blackWhiteType;
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
     * @return valueCompareType
     */
    public String getValueCompareType() {
        return this.valueCompareType;
    }

    /**
     * @return valueType
     */
    public String getValueType() {
        return this.valueType;
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

    public static final class Builder extends Request.Builder<CreateCustomizedFilterRequest, Builder> {
        private String blackWhiteType; 
        private String name; 
        private String projectId; 
        private String regionId; 
        private String value; 
        private String valueCompareType; 
        private String valueType; 
        private String versionId; 
        private String versionType; 

        private Builder() {
            super();
        } 

        private Builder(CreateCustomizedFilterRequest response) {
            super(response);
            this.blackWhiteType = response.blackWhiteType;
            this.name = response.name;
            this.projectId = response.projectId;
            this.regionId = response.regionId;
            this.value = response.value;
            this.valueCompareType = response.valueCompareType;
            this.valueType = response.valueType;
            this.versionId = response.versionId;
            this.versionType = response.versionType;
        } 

        /**
         * BlackWhiteType.
         */
        public Builder blackWhiteType(String blackWhiteType) {
            this.putQueryParameter("BlackWhiteType", blackWhiteType);
            this.blackWhiteType = blackWhiteType;
            return this;
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
         * ValueCompareType.
         */
        public Builder valueCompareType(String valueCompareType) {
            this.putQueryParameter("ValueCompareType", valueCompareType);
            this.valueCompareType = valueCompareType;
            return this;
        }

        /**
         * ValueType.
         */
        public Builder valueType(String valueType) {
            this.putQueryParameter("ValueType", valueType);
            this.valueType = valueType;
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
        public CreateCustomizedFilterRequest build() {
            return new CreateCustomizedFilterRequest(this);
        } 

    } 

}
