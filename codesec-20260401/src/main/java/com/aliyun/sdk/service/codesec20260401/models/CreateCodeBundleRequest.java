// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.codesec20260401.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CreateCodeBundleRequest} extends {@link RequestModel}
 *
 * <p>CreateCodeBundleRequest</p>
 */
public class CreateCodeBundleRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("projectId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long projectId;

    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ciMetadata")
    private String ciMetadata;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("filename")
    @com.aliyun.core.annotation.Validation(required = true)
    private String filename;

    private CreateCodeBundleRequest(Builder builder) {
        super(builder);
        this.projectId = builder.projectId;
        this.regionId = builder.regionId;
        this.ciMetadata = builder.ciMetadata;
        this.filename = builder.filename;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateCodeBundleRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return projectId
     */
    public Long getProjectId() {
        return this.projectId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return ciMetadata
     */
    public String getCiMetadata() {
        return this.ciMetadata;
    }

    /**
     * @return filename
     */
    public String getFilename() {
        return this.filename;
    }

    public static final class Builder extends Request.Builder<CreateCodeBundleRequest, Builder> {
        private Long projectId; 
        private String regionId; 
        private String ciMetadata; 
        private String filename; 

        private Builder() {
            super();
        } 

        private Builder(CreateCodeBundleRequest request) {
            super(request);
            this.projectId = request.projectId;
            this.regionId = request.regionId;
            this.ciMetadata = request.ciMetadata;
            this.filename = request.filename;
        } 

        /**
         * <p>The project ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        public Builder projectId(Long projectId) {
            this.putPathParameter("projectId", projectId);
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
         * <p>An optional CI/CD metadata JSON string.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;region&quot;:&quot;cn-beijing&quot;}</p>
         */
        public Builder ciMetadata(String ciMetadata) {
            this.putQueryParameter("ciMetadata", ciMetadata);
            this.ciMetadata = ciMetadata;
            return this;
        }

        /**
         * <p>The file name.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test-cases.zip</p>
         */
        public Builder filename(String filename) {
            this.putQueryParameter("filename", filename);
            this.filename = filename;
            return this;
        }

        @Override
        public CreateCodeBundleRequest build() {
            return new CreateCodeBundleRequest(this);
        } 

    } 

}
