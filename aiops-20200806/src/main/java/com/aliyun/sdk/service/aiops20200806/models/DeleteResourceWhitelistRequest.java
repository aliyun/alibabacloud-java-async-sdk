// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiops20200806.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteResourceWhitelistRequest} extends {@link RequestModel}
 *
 * <p>DeleteResourceWhitelistRequest</p>
 */
public class DeleteResourceWhitelistRequest extends Request {
    @Body
    @NameInMap("InspectionWhitelistId")
    private Long inspectionWhitelistId;

    @Body
    @NameInMap("OperaUid")
    private String operaUid;

    private DeleteResourceWhitelistRequest(Builder builder) {
        super(builder);
        this.inspectionWhitelistId = builder.inspectionWhitelistId;
        this.operaUid = builder.operaUid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteResourceWhitelistRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return inspectionWhitelistId
     */
    public Long getInspectionWhitelistId() {
        return this.inspectionWhitelistId;
    }

    /**
     * @return operaUid
     */
    public String getOperaUid() {
        return this.operaUid;
    }

    public static final class Builder extends Request.Builder<DeleteResourceWhitelistRequest, Builder> {
        private Long inspectionWhitelistId; 
        private String operaUid; 

        private Builder() {
            super();
        } 

        private Builder(DeleteResourceWhitelistRequest request) {
            super(request);
            this.inspectionWhitelistId = request.inspectionWhitelistId;
            this.operaUid = request.operaUid;
        } 

        /**
         * InspectionWhitelistId.
         */
        public Builder inspectionWhitelistId(Long inspectionWhitelistId) {
            this.putBodyParameter("InspectionWhitelistId", inspectionWhitelistId);
            this.inspectionWhitelistId = inspectionWhitelistId;
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
        public DeleteResourceWhitelistRequest build() {
            return new DeleteResourceWhitelistRequest(this);
        } 

    } 

}
