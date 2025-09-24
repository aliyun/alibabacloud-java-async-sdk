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
            this.description = request.description;
            this.edition = request.edition;
            this.mountAccessReadWriteRoleIdList = request.mountAccessReadWriteRoleIdList;
            this.name = request.name;
            this.options = request.options;
            this.sharingConfig = request.sharingConfig;
        } 

        /**
         * <p>The dataset ID. You can call <a href="https://help.aliyun.com/document_detail/457222.html">ListDatasets</a> to obtain the dataset ID.</p>
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
         * <p>The description of the dataset.</p>
         */
        public Builder description(String description) {
            this.putBodyParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * Edition.
         */
        public Builder edition(String edition) {
            this.putBodyParameter("Edition", edition);
            this.edition = edition;
            return this;
        }

        /**
         * <p>The list of role names in the workspace that have read and write permissions on the mounted database. The names starting with PAI are basic role names, and the names starting with role- are custom role names. If the list contains asterisks (*), all roles have read and write permissions.</p>
         * <ul>
         * <li>If you set the value to [&quot;PAI.AlgoOperator&quot;, &quot;role-hiuwpd01ncrokkgp21&quot;], the account of the specified role is granted the read and write permissions.</li>
         * <li>If you set the value to [&quot;*&quot;], all accounts are granted the read and write permissions.</li>
         * <li>If you set the value to [], only the creator of the dataset has the read and write permissions.</li>
         * </ul>
         */
        public Builder mountAccessReadWriteRoleIdList(java.util.List<String> mountAccessReadWriteRoleIdList) {
            this.putBodyParameter("MountAccessReadWriteRoleIdList", mountAccessReadWriteRoleIdList);
            this.mountAccessReadWriteRoleIdList = mountAccessReadWriteRoleIdList;
            return this;
        }

        /**
         * <p>The dataset name. You can call <a href="https://help.aliyun.com/document_detail/457222.html">ListDatasets</a> to obtain the dataset name.</p>
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
         * <p>The extended field, which is a JSON string. When you use the dataset in Deep Learning Containers (DLC), you can set mountPath to specify the default mount path of the dataset.</p>
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
         * SharingConfig.
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
             * SharedTo.
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
