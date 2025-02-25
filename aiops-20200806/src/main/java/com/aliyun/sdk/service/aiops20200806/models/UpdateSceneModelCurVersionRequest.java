// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiops20200806.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateSceneModelCurVersionRequest} extends {@link RequestModel}
 *
 * <p>UpdateSceneModelCurVersionRequest</p>
 */
public class UpdateSceneModelCurVersionRequest extends Request {
    @Body
    @NameInMap("ExtId")
    private Long extId;

    @Body
    @NameInMap("ModelId")
    private Long modelId;

    @Body
    @NameInMap("OperaUid")
    private String operaUid;

    private UpdateSceneModelCurVersionRequest(Builder builder) {
        super(builder);
        this.extId = builder.extId;
        this.modelId = builder.modelId;
        this.operaUid = builder.operaUid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateSceneModelCurVersionRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return extId
     */
    public Long getExtId() {
        return this.extId;
    }

    /**
     * @return modelId
     */
    public Long getModelId() {
        return this.modelId;
    }

    /**
     * @return operaUid
     */
    public String getOperaUid() {
        return this.operaUid;
    }

    public static final class Builder extends Request.Builder<UpdateSceneModelCurVersionRequest, Builder> {
        private Long extId; 
        private Long modelId; 
        private String operaUid; 

        private Builder() {
            super();
        } 

        private Builder(UpdateSceneModelCurVersionRequest request) {
            super(request);
            this.extId = request.extId;
            this.modelId = request.modelId;
            this.operaUid = request.operaUid;
        } 

        /**
         * ExtId.
         */
        public Builder extId(Long extId) {
            this.putBodyParameter("ExtId", extId);
            this.extId = extId;
            return this;
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
         * OperaUid.
         */
        public Builder operaUid(String operaUid) {
            this.putBodyParameter("OperaUid", operaUid);
            this.operaUid = operaUid;
            return this;
        }

        @Override
        public UpdateSceneModelCurVersionRequest build() {
            return new UpdateSceneModelCurVersionRequest(this);
        } 

    } 

}
