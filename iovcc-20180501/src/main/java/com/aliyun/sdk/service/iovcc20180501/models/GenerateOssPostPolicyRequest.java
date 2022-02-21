// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iovcc20180501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GenerateOssPostPolicyRequest} extends {@link RequestModel}
 *
 * <p>GenerateOssPostPolicyRequest</p>
 */
public class GenerateOssPostPolicyRequest extends Request {
    @Query
    @NameInMap("AccessId")
    @Validation(required = true)
    private String accessId;

    @Query
    @NameInMap("AccessKey")
    @Validation(required = true)
    private String accessKey;

    @Query
    @NameInMap("Ext")
    @Validation(required = true)
    private String ext;

    @Query
    @NameInMap("ProjectId")
    @Validation(required = true)
    private String projectId;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    private GenerateOssPostPolicyRequest(Builder builder) {
        super(builder);
        this.accessId = builder.accessId;
        this.accessKey = builder.accessKey;
        this.ext = builder.ext;
        this.projectId = builder.projectId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GenerateOssPostPolicyRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accessId
     */
    public String getAccessId() {
        return this.accessId;
    }

    /**
     * @return accessKey
     */
    public String getAccessKey() {
        return this.accessKey;
    }

    /**
     * @return ext
     */
    public String getExt() {
        return this.ext;
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

    public static final class Builder extends Request.Builder<GenerateOssPostPolicyRequest, Builder> {
        private String accessId; 
        private String accessKey; 
        private String ext; 
        private String projectId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(GenerateOssPostPolicyRequest response) {
            super(response);
            this.accessId = response.accessId;
            this.accessKey = response.accessKey;
            this.ext = response.ext;
            this.projectId = response.projectId;
            this.regionId = response.regionId;
        } 

        /**
         * AccessId.
         */
        public Builder accessId(String accessId) {
            this.putQueryParameter("AccessId", accessId);
            this.accessId = accessId;
            return this;
        }

        /**
         * AccessKey.
         */
        public Builder accessKey(String accessKey) {
            this.putQueryParameter("AccessKey", accessKey);
            this.accessKey = accessKey;
            return this;
        }

        /**
         * Ext.
         */
        public Builder ext(String ext) {
            this.putQueryParameter("Ext", ext);
            this.ext = ext;
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
        public GenerateOssPostPolicyRequest build() {
            return new GenerateOssPostPolicyRequest(this);
        } 

    } 

}
