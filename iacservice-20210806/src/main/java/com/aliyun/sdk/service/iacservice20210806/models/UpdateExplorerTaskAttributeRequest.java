// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iacservice20210806.models;

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
 * {@link UpdateExplorerTaskAttributeRequest} extends {@link RequestModel}
 *
 * <p>UpdateExplorerTaskAttributeRequest</p>
 */
public class UpdateExplorerTaskAttributeRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("explorerTaskId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String explorerTaskId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("autoApply")
    private Boolean autoApply;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("explorerTaskName")
    private String explorerTaskName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("moduleId")
    private String moduleId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("moduleVersion")
    private String moduleVersion;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("terraformProviderVersion")
    private String terraformProviderVersion;

    private UpdateExplorerTaskAttributeRequest(Builder builder) {
        super(builder);
        this.explorerTaskId = builder.explorerTaskId;
        this.autoApply = builder.autoApply;
        this.explorerTaskName = builder.explorerTaskName;
        this.moduleId = builder.moduleId;
        this.moduleVersion = builder.moduleVersion;
        this.terraformProviderVersion = builder.terraformProviderVersion;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateExplorerTaskAttributeRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return explorerTaskId
     */
    public String getExplorerTaskId() {
        return this.explorerTaskId;
    }

    /**
     * @return autoApply
     */
    public Boolean getAutoApply() {
        return this.autoApply;
    }

    /**
     * @return explorerTaskName
     */
    public String getExplorerTaskName() {
        return this.explorerTaskName;
    }

    /**
     * @return moduleId
     */
    public String getModuleId() {
        return this.moduleId;
    }

    /**
     * @return moduleVersion
     */
    public String getModuleVersion() {
        return this.moduleVersion;
    }

    /**
     * @return terraformProviderVersion
     */
    public String getTerraformProviderVersion() {
        return this.terraformProviderVersion;
    }

    public static final class Builder extends Request.Builder<UpdateExplorerTaskAttributeRequest, Builder> {
        private String explorerTaskId; 
        private Boolean autoApply; 
        private String explorerTaskName; 
        private String moduleId; 
        private String moduleVersion; 
        private String terraformProviderVersion; 

        private Builder() {
            super();
        } 

        private Builder(UpdateExplorerTaskAttributeRequest request) {
            super(request);
            this.explorerTaskId = request.explorerTaskId;
            this.autoApply = request.autoApply;
            this.explorerTaskName = request.explorerTaskName;
            this.moduleId = request.moduleId;
            this.moduleVersion = request.moduleVersion;
            this.terraformProviderVersion = request.terraformProviderVersion;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder explorerTaskId(String explorerTaskId) {
            this.putPathParameter("explorerTaskId", explorerTaskId);
            this.explorerTaskId = explorerTaskId;
            return this;
        }

        /**
         * autoApply.
         */
        public Builder autoApply(Boolean autoApply) {
            this.putBodyParameter("autoApply", autoApply);
            this.autoApply = autoApply;
            return this;
        }

        /**
         * explorerTaskName.
         */
        public Builder explorerTaskName(String explorerTaskName) {
            this.putBodyParameter("explorerTaskName", explorerTaskName);
            this.explorerTaskName = explorerTaskName;
            return this;
        }

        /**
         * moduleId.
         */
        public Builder moduleId(String moduleId) {
            this.putBodyParameter("moduleId", moduleId);
            this.moduleId = moduleId;
            return this;
        }

        /**
         * moduleVersion.
         */
        public Builder moduleVersion(String moduleVersion) {
            this.putBodyParameter("moduleVersion", moduleVersion);
            this.moduleVersion = moduleVersion;
            return this;
        }

        /**
         * terraformProviderVersion.
         */
        public Builder terraformProviderVersion(String terraformProviderVersion) {
            this.putBodyParameter("terraformProviderVersion", terraformProviderVersion);
            this.terraformProviderVersion = terraformProviderVersion;
            return this;
        }

        @Override
        public UpdateExplorerTaskAttributeRequest build() {
            return new UpdateExplorerTaskAttributeRequest(this);
        } 

    } 

}
