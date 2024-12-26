// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.schedulerx320240624.models;

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
 * {@link ImportJobsRequest} extends {@link RequestModel}
 *
 * <p>ImportJobsRequest</p>
 */
public class ImportJobsRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AutoCreateApp")
    private Boolean autoCreateApp;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clusterId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Content")
    private String content;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Overwrite")
    private Boolean overwrite;

    private ImportJobsRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.autoCreateApp = builder.autoCreateApp;
        this.clusterId = builder.clusterId;
        this.content = builder.content;
        this.overwrite = builder.overwrite;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ImportJobsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return autoCreateApp
     */
    public Boolean getAutoCreateApp() {
        return this.autoCreateApp;
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return content
     */
    public String getContent() {
        return this.content;
    }

    /**
     * @return overwrite
     */
    public Boolean getOverwrite() {
        return this.overwrite;
    }

    public static final class Builder extends Request.Builder<ImportJobsRequest, Builder> {
        private String regionId; 
        private Boolean autoCreateApp; 
        private String clusterId; 
        private String content; 
        private Boolean overwrite; 

        private Builder() {
            super();
        } 

        private Builder(ImportJobsRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.autoCreateApp = request.autoCreateApp;
            this.clusterId = request.clusterId;
            this.content = request.content;
            this.overwrite = request.overwrite;
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
         * AutoCreateApp.
         */
        public Builder autoCreateApp(Boolean autoCreateApp) {
            this.putBodyParameter("AutoCreateApp", autoCreateApp);
            this.autoCreateApp = autoCreateApp;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>xxljob-b6ec1xxxx</p>
         */
        public Builder clusterId(String clusterId) {
            this.putBodyParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * Content.
         */
        public Builder content(String content) {
            this.putBodyParameter("Content", content);
            this.content = content;
            return this;
        }

        /**
         * Overwrite.
         */
        public Builder overwrite(Boolean overwrite) {
            this.putBodyParameter("Overwrite", overwrite);
            this.overwrite = overwrite;
            return this;
        }

        @Override
        public ImportJobsRequest build() {
            return new ImportJobsRequest(this);
        } 

    } 

}
