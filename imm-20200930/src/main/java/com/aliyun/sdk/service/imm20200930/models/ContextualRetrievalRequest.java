// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imm20200930.models;

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
 * {@link ContextualRetrievalRequest} extends {@link RequestModel}
 *
 * <p>ContextualRetrievalRequest</p>
 */
public class ContextualRetrievalRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DatasetName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String datasetName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Messages")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<ContextualMessage> messages;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProjectName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String projectName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RecallOnly")
    private Boolean recallOnly;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SmartClusterIds")
    private java.util.List<String> smartClusterIds;

    private ContextualRetrievalRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.datasetName = builder.datasetName;
        this.messages = builder.messages;
        this.projectName = builder.projectName;
        this.recallOnly = builder.recallOnly;
        this.smartClusterIds = builder.smartClusterIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ContextualRetrievalRequest create() {
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
     * @return datasetName
     */
    public String getDatasetName() {
        return this.datasetName;
    }

    /**
     * @return messages
     */
    public java.util.List<ContextualMessage> getMessages() {
        return this.messages;
    }

    /**
     * @return projectName
     */
    public String getProjectName() {
        return this.projectName;
    }

    /**
     * @return recallOnly
     */
    public Boolean getRecallOnly() {
        return this.recallOnly;
    }

    /**
     * @return smartClusterIds
     */
    public java.util.List<String> getSmartClusterIds() {
        return this.smartClusterIds;
    }

    public static final class Builder extends Request.Builder<ContextualRetrievalRequest, Builder> {
        private String regionId; 
        private String datasetName; 
        private java.util.List<ContextualMessage> messages; 
        private String projectName; 
        private Boolean recallOnly; 
        private java.util.List<String> smartClusterIds; 

        private Builder() {
            super();
        } 

        private Builder(ContextualRetrievalRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.datasetName = request.datasetName;
            this.messages = request.messages;
            this.projectName = request.projectName;
            this.recallOnly = request.recallOnly;
            this.smartClusterIds = request.smartClusterIds;
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test-dataset</p>
         */
        public Builder datasetName(String datasetName) {
            this.putQueryParameter("DatasetName", datasetName);
            this.datasetName = datasetName;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder messages(java.util.List<ContextualMessage> messages) {
            String messagesShrink = shrink(messages, "Messages", "json");
            this.putBodyParameter("Messages", messagesShrink);
            this.messages = messages;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test-project</p>
         */
        public Builder projectName(String projectName) {
            this.putQueryParameter("ProjectName", projectName);
            this.projectName = projectName;
            return this;
        }

        /**
         * RecallOnly.
         */
        public Builder recallOnly(Boolean recallOnly) {
            this.putQueryParameter("RecallOnly", recallOnly);
            this.recallOnly = recallOnly;
            return this;
        }

        /**
         * SmartClusterIds.
         */
        public Builder smartClusterIds(java.util.List<String> smartClusterIds) {
            String smartClusterIdsShrink = shrink(smartClusterIds, "SmartClusterIds", "json");
            this.putBodyParameter("SmartClusterIds", smartClusterIdsShrink);
            this.smartClusterIds = smartClusterIds;
            return this;
        }

        @Override
        public ContextualRetrievalRequest build() {
            return new ContextualRetrievalRequest(this);
        } 

    } 

}
