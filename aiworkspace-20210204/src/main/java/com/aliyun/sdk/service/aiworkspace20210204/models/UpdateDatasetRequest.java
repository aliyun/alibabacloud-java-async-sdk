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
 * {@link UpdateDatasetRequest} extends {@link RequestModel}
 *
 * <p>UpdateDatasetRequest</p>
 */
public class UpdateDatasetRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("DatasetId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String datasetId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Accessibility")
    private String accessibility;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AccessibleRoleIdList")
    private java.util.List<String> accessibleRoleIdList;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Edition")
    private String edition;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("MountAccessReadWriteRoleIdList")
    private java.util.List<String> mountAccessReadWriteRoleIdList;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Options")
    private String options;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SharingConfig")
    private SharingConfig sharingConfig;

    private UpdateDatasetRequest(Builder builder) {
        super(builder);
        this.datasetId = builder.datasetId;
        this.accessibility = builder.accessibility;
        this.accessibleRoleIdList = builder.accessibleRoleIdList;
        this.description = builder.description;
        this.edition = builder.edition;
        this.mountAccessReadWriteRoleIdList = builder.mountAccessReadWriteRoleIdList;
        this.name = builder.name;
        this.options = builder.options;
        this.sharingConfig = builder.sharingConfig;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateDatasetRequest create() {
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
     * @return accessibility
     */
    public String getAccessibility() {
        return this.accessibility;
    }

    /**
     * @return accessibleRoleIdList
     */
    public java.util.List<String> getAccessibleRoleIdList() {
        return this.accessibleRoleIdList;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return edition
     */
    public String getEdition() {
        return this.edition;
    }

    /**
     * @return mountAccessReadWriteRoleIdList
     */
    public java.util.List<String> getMountAccessReadWriteRoleIdList() {
        return this.mountAccessReadWriteRoleIdList;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return options
     */
    public String getOptions() {
        return this.options;
    }

    /**
     * @return sharingConfig
     */
    public SharingConfig getSharingConfig() {
        return this.sharingConfig;
    }

    public static final class Builder extends Request.Builder<UpdateDatasetRequest, Builder> {
        private String datasetId; 
        private String accessibility; 
        private java.util.List<String> accessibleRoleIdList; 
        private String description; 
        private String edition; 
        private java.util.List<String> mountAccessReadWriteRoleIdList; 
        private String name; 
        private String options; 
        private SharingConfig sharingConfig; 

        private Builder() {
            super();
        } 

        private Builder(UpdateDatasetRequest request) {
            super(request);
            this.datasetId = request.datasetId;
            this.accessibility = request.accessibility;
            this.accessibleRoleIdList = request.accessibleRoleIdList;
            this.description = request.description;
            this.edition = request.edition;
            this.mountAccessReadWriteRoleIdList = request.mountAccessReadWriteRoleIdList;
            this.name = request.name;
            this.options = request.options;
            this.sharingConfig = request.sharingConfig;
        } 

        /**
         * <p>The dataset ID. For information about how to obtain the dataset ID, see <a href="https://help.aliyun.com/document_detail/457222.html">ListDatasets</a>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>d-rbvg5wz****c9ks92</p>
         */
        public Builder datasetId(String datasetId) {
            this.putPathParameter("DatasetId", datasetId);
            this.datasetId = datasetId;
            return this;
        }

        /**
         * <p>The visibility of the dataset in the workspace. Valid values:</p>
         * <ul>
         * <li><p><code>PRIVATE</code> (default): The dataset is visible only to its owner and administrators.</p>
         * </li>
         * <li><p><code>PUBLIC</code>: The dataset is visible to all users in the workspace.</p>
         * </li>
         * <li><p><code>ROLE_PUBLIC</code>: The dataset is visible to users in specific workspace roles. You must specify the roles in the <code>AccessibleRoleIdList</code> parameter. The dataset owner and administrators can always view the dataset.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PRIVATE</p>
         */
        public Builder accessibility(String accessibility) {
            this.putBodyParameter("Accessibility", accessibility);
            this.accessibility = accessibility;
            return this;
        }

        /**
         * <p>This parameter takes effect only when <code>Accessibility</code> is set to <code>ROLE_PUBLIC</code>. It specifies the list of workspace roles that can view the dataset. Role IDs that start with <code>PAI</code> are basic role IDs, and role IDs that start with <code>role-</code> are custom role IDs.</p>
         */
        public Builder accessibleRoleIdList(java.util.List<String> accessibleRoleIdList) {
            this.putBodyParameter("AccessibleRoleIdList", accessibleRoleIdList);
            this.accessibleRoleIdList = accessibleRoleIdList;
            return this;
        }

        /**
         * <p>The description of the dataset.</p>
         * 
         * <strong>example:</strong>
         * <p>This is a description of the dataset.</p>
         */
        public Builder description(String description) {
            this.putBodyParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The dataset edition. You can upgrade a dataset from <code>BASIC</code> to <code>ADVANCED</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>ADVANCED</p>
         */
        public Builder edition(String edition) {
            this.putBodyParameter("Edition", edition);
            this.edition = edition;
            return this;
        }

        /**
         * <p>A list of workspace roles that have read and write permissions on the mounted dataset. Role IDs that start with <code>PAI</code> are basic role IDs, and role IDs that start with <code>role-</code> are custom role IDs. If the list contains an asterisk (<code>*</code>), all roles are granted read and write permissions.</p>
         * <ul>
         * <li><p>To specify roles: [&quot;PAI.AlgoOperator&quot;, &quot;role-hiuwpd01ncrokkgp21&quot;]</p>
         * </li>
         * <li><p>To specify all roles: [&quot;\*&quot;]</p>
         * </li>
         * <li><p>To specify only the dataset creator: []</p>
         * </li>
         * </ul>
         */
        public Builder mountAccessReadWriteRoleIdList(java.util.List<String> mountAccessReadWriteRoleIdList) {
            this.putBodyParameter("MountAccessReadWriteRoleIdList", mountAccessReadWriteRoleIdList);
            this.mountAccessReadWriteRoleIdList = mountAccessReadWriteRoleIdList;
            return this;
        }

        /**
         * <p>The dataset name. For information about how to obtain the dataset name, see <a href="https://help.aliyun.com/document_detail/457222.html">ListDatasets</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>myName</p>
         */
        public Builder name(String name) {
            this.putBodyParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>An extended field in a JSON string format. When you use the dataset with Data Lake Compute (DLC), you can configure the <code>mountPath</code> field to specify the default mount path.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *   &quot;mountPath&quot;: &quot;/mnt/data/&quot;
         * }</p>
         */
        public Builder options(String options) {
            this.putBodyParameter("Options", options);
            this.options = options;
            return this;
        }

        /**
         * <p>The sharing configuration of the dataset.</p>
         */
        public Builder sharingConfig(SharingConfig sharingConfig) {
            this.putBodyParameter("SharingConfig", sharingConfig);
            this.sharingConfig = sharingConfig;
            return this;
        }

        @Override
        public UpdateDatasetRequest build() {
            return new UpdateDatasetRequest(this);
        } 

    } 

    /**
     * 
     * {@link UpdateDatasetRequest} extends {@link TeaModel}
     *
     * <p>UpdateDatasetRequest</p>
     */
    public static class SharingConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SharedTo")
        private java.util.List<DatasetShareRelationship> sharedTo;

        private SharingConfig(Builder builder) {
            this.sharedTo = builder.sharedTo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SharingConfig create() {
            return builder().build();
        }

        /**
         * @return sharedTo
         */
        public java.util.List<DatasetShareRelationship> getSharedTo() {
            return this.sharedTo;
        }

        public static final class Builder {
            private java.util.List<DatasetShareRelationship> sharedTo; 

            private Builder() {
            } 

            private Builder(SharingConfig model) {
                this.sharedTo = model.sharedTo;
            } 

            /**
             * <p>The sharing relationships of the dataset.</p>
             */
            public Builder sharedTo(java.util.List<DatasetShareRelationship> sharedTo) {
                this.sharedTo = sharedTo;
                return this;
            }

            public SharingConfig build() {
                return new SharingConfig(this);
            } 

        } 

    }
}
