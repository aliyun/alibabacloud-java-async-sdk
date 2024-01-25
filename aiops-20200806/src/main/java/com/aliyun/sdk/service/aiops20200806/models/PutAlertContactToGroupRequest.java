// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiops20200806.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PutAlertContactToGroupRequest} extends {@link RequestModel}
 *
 * <p>PutAlertContactToGroupRequest</p>
 */
public class PutAlertContactToGroupRequest extends Request {
    @Body
    @NameInMap("ContactIdListJson")
    private String contactIdListJson;

    @Body
    @NameInMap("GroupId")
    private Long groupId;

    @Body
    @NameInMap("GroupIdListJson")
    private String groupIdListJson;

    @Query
    @NameInMap("OperaUid")
    private String operaUid;

    private PutAlertContactToGroupRequest(Builder builder) {
        super(builder);
        this.contactIdListJson = builder.contactIdListJson;
        this.groupId = builder.groupId;
        this.groupIdListJson = builder.groupIdListJson;
        this.operaUid = builder.operaUid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PutAlertContactToGroupRequest create() {
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
     * @return groupIdListJson
     */
    public String getGroupIdListJson() {
        return this.groupIdListJson;
    }

    /**
     * @return operaUid
     */
    public String getOperaUid() {
        return this.operaUid;
    }

    public static final class Builder extends Request.Builder<PutAlertContactToGroupRequest, Builder> {
        private String contactIdListJson; 
        private Long groupId; 
        private String groupIdListJson; 
        private String operaUid; 

        private Builder() {
            super();
        } 

        private Builder(PutAlertContactToGroupRequest request) {
            super(request);
            this.contactIdListJson = request.contactIdListJson;
            this.groupId = request.groupId;
            this.groupIdListJson = request.groupIdListJson;
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
         * GroupIdListJson.
         */
        public Builder groupIdListJson(String groupIdListJson) {
            this.putBodyParameter("GroupIdListJson", groupIdListJson);
            this.groupIdListJson = groupIdListJson;
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
        public PutAlertContactToGroupRequest build() {
            return new PutAlertContactToGroupRequest(this);
        } 

    } 

}
