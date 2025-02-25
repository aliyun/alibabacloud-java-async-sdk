// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiops20200806.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateSceneModelApplyRequest} extends {@link RequestModel}
 *
 * <p>UpdateSceneModelApplyRequest</p>
 */
public class UpdateSceneModelApplyRequest extends Request {
    @Body
    @NameInMap("ApplyContent")
    private String applyContent;

    @Body
    @NameInMap("ApplyId")
    private Long applyId;

    @Body
    @NameInMap("ApplyStatus")
    private Integer applyStatus;

    @Body
    @NameInMap("OperaUid")
    private String operaUid;

    private UpdateSceneModelApplyRequest(Builder builder) {
        super(builder);
        this.applyContent = builder.applyContent;
        this.applyId = builder.applyId;
        this.applyStatus = builder.applyStatus;
        this.operaUid = builder.operaUid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateSceneModelApplyRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return applyContent
     */
    public String getApplyContent() {
        return this.applyContent;
    }

    /**
     * @return applyId
     */
    public Long getApplyId() {
        return this.applyId;
    }

    /**
     * @return applyStatus
     */
    public Integer getApplyStatus() {
        return this.applyStatus;
    }

    /**
     * @return operaUid
     */
    public String getOperaUid() {
        return this.operaUid;
    }

    public static final class Builder extends Request.Builder<UpdateSceneModelApplyRequest, Builder> {
        private String applyContent; 
        private Long applyId; 
        private Integer applyStatus; 
        private String operaUid; 

        private Builder() {
            super();
        } 

        private Builder(UpdateSceneModelApplyRequest request) {
            super(request);
            this.applyContent = request.applyContent;
            this.applyId = request.applyId;
            this.applyStatus = request.applyStatus;
            this.operaUid = request.operaUid;
        } 

        /**
         * ApplyContent.
         */
        public Builder applyContent(String applyContent) {
            this.putBodyParameter("ApplyContent", applyContent);
            this.applyContent = applyContent;
            return this;
        }

        /**
         * ApplyId.
         */
        public Builder applyId(Long applyId) {
            this.putBodyParameter("ApplyId", applyId);
            this.applyId = applyId;
            return this;
        }

        /**
         * ApplyStatus.
         */
        public Builder applyStatus(Integer applyStatus) {
            this.putBodyParameter("ApplyStatus", applyStatus);
            this.applyStatus = applyStatus;
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
        public UpdateSceneModelApplyRequest build() {
            return new UpdateSceneModelApplyRequest(this);
        } 

    } 

}
