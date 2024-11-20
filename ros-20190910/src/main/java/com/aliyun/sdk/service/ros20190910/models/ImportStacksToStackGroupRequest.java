// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ros20190910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ImportStacksToStackGroupRequest} extends {@link RequestModel}
 *
 * <p>ImportStacksToStackGroupRequest</p>
 */
public class ImportStacksToStackGroupRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OperationDescription")
    private String operationDescription;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OperationPreferences")
    private java.util.Map < String, ? > operationPreferences;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceDirectoryFolderIds")
    private java.util.List < String > resourceDirectoryFolderIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StackArns")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List < String > stackArns;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StackGroupName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String stackGroupName;

    private ImportStacksToStackGroupRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.operationDescription = builder.operationDescription;
        this.operationPreferences = builder.operationPreferences;
        this.regionId = builder.regionId;
        this.resourceDirectoryFolderIds = builder.resourceDirectoryFolderIds;
        this.stackArns = builder.stackArns;
        this.stackGroupName = builder.stackGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ImportStacksToStackGroupRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return operationDescription
     */
    public String getOperationDescription() {
        return this.operationDescription;
    }

    /**
     * @return operationPreferences
     */
    public java.util.Map < String, ? > getOperationPreferences() {
        return this.operationPreferences;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return resourceDirectoryFolderIds
     */
    public java.util.List < String > getResourceDirectoryFolderIds() {
        return this.resourceDirectoryFolderIds;
    }

    /**
     * @return stackArns
     */
    public java.util.List < String > getStackArns() {
        return this.stackArns;
    }

    /**
     * @return stackGroupName
     */
    public String getStackGroupName() {
        return this.stackGroupName;
    }

    public static final class Builder extends Request.Builder<ImportStacksToStackGroupRequest, Builder> {
        private String clientToken; 
        private String operationDescription; 
        private java.util.Map < String, ? > operationPreferences; 
        private String regionId; 
        private java.util.List < String > resourceDirectoryFolderIds; 
        private java.util.List < String > stackArns; 
        private String stackGroupName; 

        private Builder() {
            super();
        } 

        private Builder(ImportStacksToStackGroupRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.operationDescription = request.operationDescription;
            this.operationPreferences = request.operationPreferences;
            this.regionId = request.regionId;
            this.resourceDirectoryFolderIds = request.resourceDirectoryFolderIds;
            this.stackArns = request.stackArns;
            this.stackGroupName = request.stackGroupName;
        } 

        /**
         * ClientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * OperationDescription.
         */
        public Builder operationDescription(String operationDescription) {
            this.putQueryParameter("OperationDescription", operationDescription);
            this.operationDescription = operationDescription;
            return this;
        }

        /**
         * OperationPreferences.
         */
        public Builder operationPreferences(java.util.Map < String, ? > operationPreferences) {
            String operationPreferencesShrink = shrink(operationPreferences, "OperationPreferences", "json");
            this.putQueryParameter("OperationPreferences", operationPreferencesShrink);
            this.operationPreferences = operationPreferences;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * ResourceDirectoryFolderIds.
         */
        public Builder resourceDirectoryFolderIds(java.util.List < String > resourceDirectoryFolderIds) {
            String resourceDirectoryFolderIdsShrink = shrink(resourceDirectoryFolderIds, "ResourceDirectoryFolderIds", "json");
            this.putQueryParameter("ResourceDirectoryFolderIds", resourceDirectoryFolderIdsShrink);
            this.resourceDirectoryFolderIds = resourceDirectoryFolderIds;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder stackArns(java.util.List < String > stackArns) {
            String stackArnsShrink = shrink(stackArns, "StackArns", "json");
            this.putQueryParameter("StackArns", stackArnsShrink);
            this.stackArns = stackArns;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>MyStackGroup</p>
         */
        public Builder stackGroupName(String stackGroupName) {
            this.putQueryParameter("StackGroupName", stackGroupName);
            this.stackGroupName = stackGroupName;
            return this;
        }

        @Override
        public ImportStacksToStackGroupRequest build() {
            return new ImportStacksToStackGroupRequest(this);
        } 

    } 

}
