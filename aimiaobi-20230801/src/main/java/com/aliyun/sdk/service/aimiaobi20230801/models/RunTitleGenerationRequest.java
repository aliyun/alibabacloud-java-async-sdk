// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aimiaobi20230801.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link RunTitleGenerationRequest} extends {@link RequestModel}
 *
 * <p>RunTitleGenerationRequest</p>
 */
public class RunTitleGenerationRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ReferenceData")
    @com.aliyun.core.annotation.Validation(required = true)
    private ReferenceData referenceData;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TaskId")
    private String taskId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    private RunTitleGenerationRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.referenceData = builder.referenceData;
        this.taskId = builder.taskId;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RunTitleGenerationRequest create() {
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
     * @return referenceData
     */
    public ReferenceData getReferenceData() {
        return this.referenceData;
    }

    /**
     * @return taskId
     */
    public String getTaskId() {
        return this.taskId;
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder extends Request.Builder<RunTitleGenerationRequest, Builder> {
        private String regionId; 
        private ReferenceData referenceData; 
        private String taskId; 
        private String workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(RunTitleGenerationRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.referenceData = request.referenceData;
            this.taskId = request.taskId;
            this.workspaceId = request.workspaceId;
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
         */
        public Builder referenceData(ReferenceData referenceData) {
            String referenceDataShrink = shrink(referenceData, "ReferenceData", "json");
            this.putBodyParameter("ReferenceData", referenceDataShrink);
            this.referenceData = referenceData;
            return this;
        }

        /**
         * TaskId.
         */
        public Builder taskId(String taskId) {
            this.putBodyParameter("TaskId", taskId);
            this.taskId = taskId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>llm-xxx</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.putBodyParameter("WorkspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        @Override
        public RunTitleGenerationRequest build() {
            return new RunTitleGenerationRequest(this);
        } 

    } 

    /**
     * 
     * {@link RunTitleGenerationRequest} extends {@link TeaModel}
     *
     * <p>RunTitleGenerationRequest</p>
     */
    public static class ReferenceData extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Contents")
        @com.aliyun.core.annotation.Validation(required = true)
        private java.util.List < String > contents;

        private ReferenceData(Builder builder) {
            this.contents = builder.contents;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ReferenceData create() {
            return builder().build();
        }

        /**
         * @return contents
         */
        public java.util.List < String > getContents() {
            return this.contents;
        }

        public static final class Builder {
            private java.util.List < String > contents; 

            /**
             * <p>This parameter is required.</p>
             */
            public Builder contents(java.util.List < String > contents) {
                this.contents = contents;
                return this;
            }

            public ReferenceData build() {
                return new ReferenceData(this);
            } 

        } 

    }
}
