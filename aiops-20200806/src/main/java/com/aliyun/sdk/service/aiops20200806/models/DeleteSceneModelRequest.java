// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiops20200806.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteSceneModelRequest} extends {@link RequestModel}
 *
 * <p>DeleteSceneModelRequest</p>
 */
public class DeleteSceneModelRequest extends Request {
    @Body
    @NameInMap("ModelId")
    private Long modelId;

    @Body
    @NameInMap("OperaUid")
    private String operaUid;

    @Body
    @NameInMap("SureDelete")
    private Boolean sureDelete;

    private DeleteSceneModelRequest(Builder builder) {
        super(builder);
        this.modelId = builder.modelId;
        this.operaUid = builder.operaUid;
        this.sureDelete = builder.sureDelete;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteSceneModelRequest create() {
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
     * @return operaUid
     */
    public String getOperaUid() {
        return this.operaUid;
    }

    /**
     * @return sureDelete
     */
    public Boolean getSureDelete() {
        return this.sureDelete;
    }

    public static final class Builder extends Request.Builder<DeleteSceneModelRequest, Builder> {
        private Long modelId; 
        private String operaUid; 
        private Boolean sureDelete; 

        private Builder() {
            super();
        } 

        private Builder(DeleteSceneModelRequest request) {
            super(request);
            this.modelId = request.modelId;
            this.operaUid = request.operaUid;
            this.sureDelete = request.sureDelete;
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

        /**
         * SureDelete.
         */
        public Builder sureDelete(Boolean sureDelete) {
            this.putBodyParameter("SureDelete", sureDelete);
            this.sureDelete = sureDelete;
            return this;
        }

        @Override
        public DeleteSceneModelRequest build() {
            return new DeleteSceneModelRequest(this);
        } 

    } 

}
