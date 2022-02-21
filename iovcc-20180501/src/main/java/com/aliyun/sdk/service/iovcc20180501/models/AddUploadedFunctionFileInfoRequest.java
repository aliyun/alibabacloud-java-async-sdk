// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iovcc20180501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddUploadedFunctionFileInfoRequest} extends {@link RequestModel}
 *
 * <p>AddUploadedFunctionFileInfoRequest</p>
 */
public class AddUploadedFunctionFileInfoRequest extends Request {
    @Query
    @NameInMap("FileName")
    @Validation(required = true)
    private String fileName;

    @Query
    @NameInMap("ObjectKey")
    @Validation(required = true)
    private String objectKey;

    @Query
    @NameInMap("ProjectId")
    @Validation(required = true)
    private String projectId;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    private AddUploadedFunctionFileInfoRequest(Builder builder) {
        super(builder);
        this.fileName = builder.fileName;
        this.objectKey = builder.objectKey;
        this.projectId = builder.projectId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddUploadedFunctionFileInfoRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return fileName
     */
    public String getFileName() {
        return this.fileName;
    }

    /**
     * @return objectKey
     */
    public String getObjectKey() {
        return this.objectKey;
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

    public static final class Builder extends Request.Builder<AddUploadedFunctionFileInfoRequest, Builder> {
        private String fileName; 
        private String objectKey; 
        private String projectId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(AddUploadedFunctionFileInfoRequest response) {
            super(response);
            this.fileName = response.fileName;
            this.objectKey = response.objectKey;
            this.projectId = response.projectId;
            this.regionId = response.regionId;
        } 

        /**
         * FileName.
         */
        public Builder fileName(String fileName) {
            this.putQueryParameter("FileName", fileName);
            this.fileName = fileName;
            return this;
        }

        /**
         * ObjectKey.
         */
        public Builder objectKey(String objectKey) {
            this.putQueryParameter("ObjectKey", objectKey);
            this.objectKey = objectKey;
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

        @Override
        public AddUploadedFunctionFileInfoRequest build() {
            return new AddUploadedFunctionFileInfoRequest(this);
        } 

    } 

}
