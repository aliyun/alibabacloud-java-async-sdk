// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiops20200806.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteAlertContactRequest} extends {@link RequestModel}
 *
 * <p>DeleteAlertContactRequest</p>
 */
public class DeleteAlertContactRequest extends Request {
    @Body
    @NameInMap("ContactIdListJson")
    private String contactIdListJson;

    @Body
    @NameInMap("GroupId")
    private Long groupId;

    @Query
    @NameInMap("OperaUid")
    private String operaUid;

    private DeleteAlertContactRequest(Builder builder) {
        super(builder);
        this.contactIdListJson = builder.contactIdListJson;
        this.groupId = builder.groupId;
        this.operaUid = builder.operaUid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteAlertContactRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return contactIdListJson
     */
    public String getContactIdListJson() {
        return this.contactIdListJson;
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

    public static final class Builder extends Request.Builder<DeleteAlertContactRequest, Builder> {
        private String contactIdListJson; 
        private Long groupId; 
        private String operaUid; 

        private Builder() {
            super();
        } 

        private Builder(DeleteAlertContactRequest request) {
            super(request);
            this.contactIdListJson = request.contactIdListJson;
            this.groupId = request.groupId;
            this.operaUid = request.operaUid;
        } 

        /**
         * ContactIdListJson.
         */
        public Builder contactIdListJson(String contactIdListJson) {
            this.putBodyParameter("ContactIdListJson", contactIdListJson);
            this.contactIdListJson = contactIdListJson;
            return this;
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
        public DeleteAlertContactRequest build() {
            return new DeleteAlertContactRequest(this);
        } 

    } 

}
