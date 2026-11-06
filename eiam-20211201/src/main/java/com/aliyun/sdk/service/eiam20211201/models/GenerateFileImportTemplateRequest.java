// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eiam20211201.models;

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
 * {@link GenerateFileImportTemplateRequest} extends {@link RequestModel}
 *
 * <p>GenerateFileImportTemplateRequest</p>
 */
public class GenerateFileImportTemplateRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FieldSelectionEnabled")
    private Boolean fieldSelectionEnabled;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 64)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SelectedFieldNames")
    private java.util.List<String> selectedFieldNames;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TargetType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String targetType;

    private GenerateFileImportTemplateRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.fieldSelectionEnabled = builder.fieldSelectionEnabled;
        this.instanceId = builder.instanceId;
        this.selectedFieldNames = builder.selectedFieldNames;
        this.targetType = builder.targetType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GenerateFileImportTemplateRequest create() {
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
     * @return fieldSelectionEnabled
     */
    public Boolean getFieldSelectionEnabled() {
        return this.fieldSelectionEnabled;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return selectedFieldNames
     */
    public java.util.List<String> getSelectedFieldNames() {
        return this.selectedFieldNames;
    }

    /**
     * @return targetType
     */
    public String getTargetType() {
        return this.targetType;
    }

    public static final class Builder extends Request.Builder<GenerateFileImportTemplateRequest, Builder> {
        private String regionId; 
        private Boolean fieldSelectionEnabled; 
        private String instanceId; 
        private java.util.List<String> selectedFieldNames; 
        private String targetType; 

        private Builder() {
            super();
        } 

        private Builder(GenerateFileImportTemplateRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.fieldSelectionEnabled = request.fieldSelectionEnabled;
            this.instanceId = request.instanceId;
            this.selectedFieldNames = request.selectedFieldNames;
            this.targetType = request.targetType;
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
         * <p>Specifies whether field selection mode is enabled.</p>
         */
        public Builder fieldSelectionEnabled(Boolean fieldSelectionEnabled) {
            this.putQueryParameter("FieldSelectionEnabled", fieldSelectionEnabled);
            this.fieldSelectionEnabled = fieldSelectionEnabled;
            return this;
        }

        /**
         * <p>The instance ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>idaas_ue2jvisn35ea5lmthk267xxxxx</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The selected fields.</p>
         */
        public Builder selectedFieldNames(java.util.List<String> selectedFieldNames) {
            this.putQueryParameter("SelectedFieldNames", selectedFieldNames);
            this.selectedFieldNames = selectedFieldNames;
            return this;
        }

        /**
         * <p>The synchronization target type.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>eiam_v2_user_import,
         * application, identity_provider</p>
         */
        public Builder targetType(String targetType) {
            this.putQueryParameter("TargetType", targetType);
            this.targetType = targetType;
            return this;
        }

        @Override
        public GenerateFileImportTemplateRequest build() {
            return new GenerateFileImportTemplateRequest(this);
        } 

    } 

}
