// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiops20200806.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateSceneSystemModelStatusRequest} extends {@link RequestModel}
 *
 * <p>UpdateSceneSystemModelStatusRequest</p>
 */
public class UpdateSceneSystemModelStatusRequest extends Request {
    @Body
    @NameInMap("ModelId")
    private Long modelId;

    @Body
    @NameInMap("ModelStatus")
    private Integer modelStatus;

    @Body
    @NameInMap("OperaUid")
    private String operaUid;

    private UpdateSceneSystemModelStatusRequest(Builder builder) {
        super(builder);
        this.modelId = builder.modelId;
        this.modelStatus = builder.modelStatus;
        this.operaUid = builder.operaUid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateSceneSystemModelStatusRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return modelId
     */
    public Long getModelId() {
        return this.modelId;
    }

    /**
     * @return modelStatus
     */
    public Integer getModelStatus() {
        return this.modelStatus;
    }

    /**
     * @return operaUid
     */
    public String getOperaUid() {
        return this.operaUid;
    }

    public static final class Builder extends Request.Builder<UpdateSceneSystemModelStatusRequest, Builder> {
        private Long modelId; 
        private Integer modelStatus; 
        private String operaUid; 

        private Builder() {
            super();
        } 

        private Builder(UpdateSceneSystemModelStatusRequest request) {
            super(request);
            this.modelId = request.modelId;
            this.modelStatus = request.modelStatus;
            this.operaUid = request.operaUid;
        } 

        /**
         * ModelId.
         */
        public Builder modelId(Long modelId) {
            this.putBodyParameter("ModelId", modelId);
            this.modelId = modelId;
            return this;
        }

        /**
         * ModelStatus.
         */
        public Builder modelStatus(Integer modelStatus) {
            this.putBodyParameter("ModelStatus", modelStatus);
            this.modelStatus = modelStatus;
            return this;
        }

        /**
         * OperaUid.
         */
        public Builder operaUid(String operaUid) {
            this.putBodyParameter("OperaUid", operaUid);
            this.operaUid = operaUid;
            return this;
        }

        @Override
        public UpdateSceneSystemModelStatusRequest build() {
            return new UpdateSceneSystemModelStatusRequest(this);
        } 

    } 

}
