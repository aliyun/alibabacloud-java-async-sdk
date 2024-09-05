// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quanmiaolightapp20240801.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RunScriptPlanningRequest} extends {@link RequestModel}
 *
 * <p>RunScriptPlanningRequest</p>
 */
public class RunScriptPlanningRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("regionId")
    private String regionId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("workspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("additionalNote")
    @com.aliyun.core.annotation.Validation(maxLength = 5000)
    private String additionalNote;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("dialogueInScene")
    private Boolean dialogueInScene;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("plotConflict")
    private Boolean plotConflict;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("scriptName")
    @com.aliyun.core.annotation.Validation(maxLength = 5000)
    private String scriptName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("scriptShotCount")
    @com.aliyun.core.annotation.Validation(maximum = 10, minimum = 1)
    private Integer scriptShotCount;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("scriptSummary")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 5000)
    private String scriptSummary;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("scriptTypeKeyword")
    @com.aliyun.core.annotation.Validation(maxLength = 5000)
    private String scriptTypeKeyword;

    private RunScriptPlanningRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.workspaceId = builder.workspaceId;
        this.additionalNote = builder.additionalNote;
        this.dialogueInScene = builder.dialogueInScene;
        this.plotConflict = builder.plotConflict;
        this.scriptName = builder.scriptName;
        this.scriptShotCount = builder.scriptShotCount;
        this.scriptSummary = builder.scriptSummary;
        this.scriptTypeKeyword = builder.scriptTypeKeyword;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RunScriptPlanningRequest create() {
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
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    /**
     * @return additionalNote
     */
    public String getAdditionalNote() {
        return this.additionalNote;
    }

    /**
     * @return dialogueInScene
     */
    public Boolean getDialogueInScene() {
        return this.dialogueInScene;
    }

    /**
     * @return plotConflict
     */
    public Boolean getPlotConflict() {
        return this.plotConflict;
    }

    /**
     * @return scriptName
     */
    public String getScriptName() {
        return this.scriptName;
    }

    /**
     * @return scriptShotCount
     */
    public Integer getScriptShotCount() {
        return this.scriptShotCount;
    }

    /**
     * @return scriptSummary
     */
    public String getScriptSummary() {
        return this.scriptSummary;
    }

    /**
     * @return scriptTypeKeyword
     */
    public String getScriptTypeKeyword() {
        return this.scriptTypeKeyword;
    }

    public static final class Builder extends Request.Builder<RunScriptPlanningRequest, Builder> {
        private String regionId; 
        private String workspaceId; 
        private String additionalNote; 
        private Boolean dialogueInScene; 
        private Boolean plotConflict; 
        private String scriptName; 
        private Integer scriptShotCount; 
        private String scriptSummary; 
        private String scriptTypeKeyword; 

        private Builder() {
            super();
        } 

        private Builder(RunScriptPlanningRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.workspaceId = request.workspaceId;
            this.additionalNote = request.additionalNote;
            this.dialogueInScene = request.dialogueInScene;
            this.plotConflict = request.plotConflict;
            this.scriptName = request.scriptName;
            this.scriptShotCount = request.scriptShotCount;
            this.scriptSummary = request.scriptSummary;
            this.scriptTypeKeyword = request.scriptTypeKeyword;
        } 

        /**
         * regionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("regionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * workspaceId.
         */
        public Builder workspaceId(String workspaceId) {
            this.putPathParameter("workspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        /**
         * additionalNote.
         */
        public Builder additionalNote(String additionalNote) {
            this.putBodyParameter("additionalNote", additionalNote);
            this.additionalNote = additionalNote;
            return this;
        }

        /**
         * dialogueInScene.
         */
        public Builder dialogueInScene(Boolean dialogueInScene) {
            this.putBodyParameter("dialogueInScene", dialogueInScene);
            this.dialogueInScene = dialogueInScene;
            return this;
        }

        /**
         * plotConflict.
         */
        public Builder plotConflict(Boolean plotConflict) {
            this.putBodyParameter("plotConflict", plotConflict);
            this.plotConflict = plotConflict;
            return this;
        }

        /**
         * scriptName.
         */
        public Builder scriptName(String scriptName) {
            this.putBodyParameter("scriptName", scriptName);
            this.scriptName = scriptName;
            return this;
        }

        /**
         * scriptShotCount.
         */
        public Builder scriptShotCount(Integer scriptShotCount) {
            this.putBodyParameter("scriptShotCount", scriptShotCount);
            this.scriptShotCount = scriptShotCount;
            return this;
        }

        /**
         * scriptSummary.
         */
        public Builder scriptSummary(String scriptSummary) {
            this.putBodyParameter("scriptSummary", scriptSummary);
            this.scriptSummary = scriptSummary;
            return this;
        }

        /**
         * scriptTypeKeyword.
         */
        public Builder scriptTypeKeyword(String scriptTypeKeyword) {
            this.putBodyParameter("scriptTypeKeyword", scriptTypeKeyword);
            this.scriptTypeKeyword = scriptTypeKeyword;
            return this;
        }

        @Override
        public RunScriptPlanningRequest build() {
            return new RunScriptPlanningRequest(this);
        } 

    } 

}
