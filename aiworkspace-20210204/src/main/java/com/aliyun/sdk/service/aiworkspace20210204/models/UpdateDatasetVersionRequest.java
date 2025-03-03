// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiworkspace20210204.models;

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
 * {@link UpdateDatasetVersionRequest} extends {@link RequestModel}
 *
 * <p>UpdateDatasetVersionRequest</p>
 */
public class UpdateDatasetVersionRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("DatasetId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String datasetId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("VersionName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String versionName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DataCount")
    private Long dataCount;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DataSize")
    private Long dataSize;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Options")
    private String options;

    private UpdateDatasetVersionRequest(Builder builder) {
        super(builder);
        this.datasetId = builder.datasetId;
        this.versionName = builder.versionName;
        this.dataCount = builder.dataCount;
        this.dataSize = builder.dataSize;
        this.description = builder.description;
        this.options = builder.options;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateDatasetVersionRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return datasetId
     */
    public String getDatasetId() {
        return this.datasetId;
    }

    /**
     * @return versionName
     */
    public String getVersionName() {
        return this.versionName;
    }

    /**
     * @return dataCount
     */
    public Long getDataCount() {
        return this.dataCount;
    }

    /**
     * @return dataSize
     */
    public Long getDataSize() {
        return this.dataSize;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return options
     */
    public String getOptions() {
        return this.options;
    }

    public static final class Builder extends Request.Builder<UpdateDatasetVersionRequest, Builder> {
        private String datasetId; 
        private String versionName; 
        private Long dataCount; 
        private Long dataSize; 
        private String description; 
        private String options; 

        private Builder() {
            super();
        } 

        private Builder(UpdateDatasetVersionRequest request) {
            super(request);
            this.datasetId = request.datasetId;
            this.versionName = request.versionName;
            this.dataCount = request.dataCount;
            this.dataSize = request.dataSize;
            this.description = request.description;
            this.options = request.options;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>d-rbvg5****jhc9ks92</p>
         */
        public Builder datasetId(String datasetId) {
            this.putPathParameter("DatasetId", datasetId);
            this.datasetId = datasetId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>v1</p>
         */
        public Builder versionName(String versionName) {
            this.putPathParameter("VersionName", versionName);
            this.versionName = versionName;
            return this;
        }

        /**
         * DataCount.
         */
        public Builder dataCount(Long dataCount) {
            this.putBodyParameter("DataCount", dataCount);
            this.dataCount = dataCount;
            return this;
        }

        /**
         * DataSize.
         */
        public Builder dataSize(Long dataSize) {
            this.putBodyParameter("DataSize", dataSize);
            this.dataSize = dataSize;
            return this;
        }

        /**
         * Description.
         */
        public Builder description(String description) {
            this.putBodyParameter("Description", description);
            this.description = description;
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

        @Override
        public UpdateDatasetVersionRequest build() {
            return new UpdateDatasetVersionRequest(this);
        } 

    } 

}
