// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.wyota20210420.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CreateUserInvitationCodeRequest} extends {@link RequestModel}
 *
 * <p>CreateUserInvitationCodeRequest</p>
 */
public class CreateUserInvitationCodeRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EndUserId")
    private String endUserId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EndUserIds")
    private java.util.List<String> endUserIds;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TerminalGroupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String terminalGroupId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ValidityMinutes")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer validityMinutes;

    private CreateUserInvitationCodeRequest(Builder builder) {
        super(builder);
        this.endUserId = builder.endUserId;
        this.endUserIds = builder.endUserIds;
        this.terminalGroupId = builder.terminalGroupId;
        this.validityMinutes = builder.validityMinutes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateUserInvitationCodeRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return endUserId
     */
    public String getEndUserId() {
        return this.endUserId;
    }

    /**
     * @return endUserIds
     */
    public java.util.List<String> getEndUserIds() {
        return this.endUserIds;
    }

    /**
     * @return terminalGroupId
     */
    public String getTerminalGroupId() {
        return this.terminalGroupId;
    }

    /**
     * @return validityMinutes
     */
    public Integer getValidityMinutes() {
        return this.validityMinutes;
    }

    public static final class Builder extends Request.Builder<CreateUserInvitationCodeRequest, Builder> {
        private String endUserId; 
        private java.util.List<String> endUserIds; 
        private String terminalGroupId; 
        private Integer validityMinutes; 

        private Builder() {
            super();
        } 

        private Builder(CreateUserInvitationCodeRequest request) {
            super(request);
            this.endUserId = request.endUserId;
            this.endUserIds = request.endUserIds;
            this.terminalGroupId = request.terminalGroupId;
            this.validityMinutes = request.validityMinutes;
        } 

        /**
         * <p>The logon identifier (EndUserId) of a single user, used for compatibility with single-user creation. You must specify either this parameter or EndUserIds, but not both. If neither is specified, PARAMETER_MISSING is returned. If both are specified, PARAM_ERROR is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>user-001</p>
         */
        public Builder endUserId(String endUserId) {
            this.putBodyParameter("EndUserId", endUserId);
            this.endUserId = endUserId;
            return this;
        }

        /**
         * <p>The array of user logon identifiers (EndUserIds). You must specify either this parameter or EndUserId. You can specify 1 to 100 unique, non-empty strings at a time, and a code is generated for each user. If any user does not exist, USER_NOT_FOUND is returned. If the array is empty, or contains duplicate items, empty items, or non-string items, PARAM_ERROR is returned.</p>
         */
        public Builder endUserIds(java.util.List<String> endUserIds) {
            this.putBodyParameter("EndUserIds", endUserIds);
            this.endUserIds = endUserIds;
            return this;
        }

        /**
         * <p>The ID of the terminal group. The group must belong to the current account and must not be deleted. After the corresponding terminal uses the management code to complete management, it is added to this group. If the group does not exist, is deleted, or does not belong to the current account, TERMINAL_GROUP_NOT_FOUND is returned.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>tg-example</p>
         */
        public Builder terminalGroupId(String terminalGroupId) {
            this.putBodyParameter("TerminalGroupId", terminalGroupId);
            this.terminalGroupId = terminalGroupId;
            return this;
        }

        /**
         * <p>The validity period of the management code, in minutes. A value of -1 indicates that the code is permanently valid. For values between 60 and 1440, only integer multiples of 60 (1 to 24 hours) are allowed. For values greater than 1440, only integer multiples of 1440 are allowed, up to a maximum of 12960 (2 to 9 days). Other values return PARAM_ERROR. The server calculates the validity period based on this duration.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1440</p>
         */
        public Builder validityMinutes(Integer validityMinutes) {
            this.putBodyParameter("ValidityMinutes", validityMinutes);
            this.validityMinutes = validityMinutes;
            return this;
        }

        @Override
        public CreateUserInvitationCodeRequest build() {
            return new CreateUserInvitationCodeRequest(this);
        } 

    } 

}
