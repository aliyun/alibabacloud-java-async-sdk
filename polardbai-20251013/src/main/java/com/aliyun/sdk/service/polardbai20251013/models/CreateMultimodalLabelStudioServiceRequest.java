// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardbai20251013.models;

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
 * {@link CreateMultimodalLabelStudioServiceRequest} extends {@link RequestModel}
 *
 * <p>CreateMultimodalLabelStudioServiceRequest</p>
 */
public class CreateMultimodalLabelStudioServiceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBClusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DatasetIds")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> datasetIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Password")
    @com.aliyun.core.annotation.Validation(required = true)
    private String password;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceRegionId")
    private String sourceRegionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Username")
    @com.aliyun.core.annotation.Validation(required = true)
    private String username;

    private CreateMultimodalLabelStudioServiceRequest(Builder builder) {
        super(builder);
        this.DBClusterId = builder.DBClusterId;
        this.datasetIds = builder.datasetIds;
        this.password = builder.password;
        this.sourceRegionId = builder.sourceRegionId;
        this.username = builder.username;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateMultimodalLabelStudioServiceRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return DBClusterId
     */
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    /**
     * @return datasetIds
     */
    public java.util.List<String> getDatasetIds() {
        return this.datasetIds;
    }

    /**
     * @return password
     */
    public String getPassword() {
        return this.password;
    }

    /**
     * @return sourceRegionId
     */
    public String getSourceRegionId() {
        return this.sourceRegionId;
    }

    /**
     * @return username
     */
    public String getUsername() {
        return this.username;
    }

    public static final class Builder extends Request.Builder<CreateMultimodalLabelStudioServiceRequest, Builder> {
        private String DBClusterId; 
        private java.util.List<String> datasetIds; 
        private String password; 
        private String sourceRegionId; 
        private String username; 

        private Builder() {
            super();
        } 

        private Builder(CreateMultimodalLabelStudioServiceRequest request) {
            super(request);
            this.DBClusterId = request.DBClusterId;
            this.datasetIds = request.datasetIds;
            this.password = request.password;
            this.sourceRegionId = request.sourceRegionId;
            this.username = request.username;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>pc-2ze454l20me07****</p>
         */
        public Builder DBClusterId(String DBClusterId) {
            this.putQueryParameter("DBClusterId", DBClusterId);
            this.DBClusterId = DBClusterId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder datasetIds(java.util.List<String> datasetIds) {
            String datasetIdsShrink = shrink(datasetIds, "DatasetIds", "json");
            this.putQueryParameter("DatasetIds", datasetIdsShrink);
            this.datasetIds = datasetIds;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <hr>
         */
        public Builder password(String password) {
            this.putQueryParameter("Password", password);
            this.password = password;
            return this;
        }

        /**
         * SourceRegionId.
         */
        public Builder sourceRegionId(String sourceRegionId) {
            this.putQueryParameter("SourceRegionId", sourceRegionId);
            this.sourceRegionId = sourceRegionId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="mailto:service-admin@db4ai.com">service-admin@db4ai.com</a></p>
         */
        public Builder username(String username) {
            this.putQueryParameter("Username", username);
            this.username = username;
            return this;
        }

        @Override
        public CreateMultimodalLabelStudioServiceRequest build() {
            return new CreateMultimodalLabelStudioServiceRequest(this);
        } 

    } 

}
