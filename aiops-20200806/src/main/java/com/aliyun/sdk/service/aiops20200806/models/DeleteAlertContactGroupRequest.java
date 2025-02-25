// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiops20200806.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteAlertContactGroupRequest} extends {@link RequestModel}
 *
 * <p>DeleteAlertContactGroupRequest</p>
 */
public class DeleteAlertContactGroupRequest extends Request {
    @Body
    @NameInMap("GroupId")
    private Long groupId;

    @Query
    @NameInMap("OperaUid")
    private String operaUid;

    private DeleteAlertContactGroupRequest(Builder builder) {
        super(builder);
        this.groupId = builder.groupId;
        this.operaUid = builder.operaUid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteAlertContactGroupRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return groupId
     */
    public Long getGroupId() {
        return this.groupId;
    }

    /**
     * @return operaUid
     */
    public String getOperaUid() {
        return this.operaUid;
    }

    public static final class Builder extends Request.Builder<DeleteAlertContactGroupRequest, Builder> {
        private Long groupId; 
        private String operaUid; 

        private Builder() {
            super();
        } 

        private Builder(DeleteAlertContactGroupRequest request) {
            super(request);
            this.groupId = request.groupId;
            this.operaUid = request.operaUid;
        } 

        /**
         * GroupId.
         */
        public Builder groupId(Long groupId) {
            this.putBodyParameter("GroupId", groupId);
            this.groupId = groupId;
            return this;
        }

        /**
         * OperaUid.
         */
        public Builder operaUid(String operaUid) {
            this.putQueryParameter("OperaUid", operaUid);
            this.operaUid = operaUid;
            return this;
        }

        @Override
        public DeleteAlertContactGroupRequest build() {
            return new DeleteAlertContactGroupRequest(this);
        } 

    } 

}
