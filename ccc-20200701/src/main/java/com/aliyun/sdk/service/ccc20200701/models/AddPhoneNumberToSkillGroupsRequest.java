// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20200701.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddPhoneNumberToSkillGroupsRequest} extends {@link RequestModel}
 *
 * <p>AddPhoneNumberToSkillGroupsRequest</p>
 */
public class AddPhoneNumberToSkillGroupsRequest extends Request {
    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("Number")
    @Validation(required = true)
    private String number;

    @Query
    @NameInMap("SkillGroupIdList")
    @Validation(required = true)
    private String skillGroupIdList;

    private AddPhoneNumberToSkillGroupsRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.number = builder.number;
        this.skillGroupIdList = builder.skillGroupIdList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddPhoneNumberToSkillGroupsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return number
     */
    public String getNumber() {
        return this.number;
    }

    /**
     * @return skillGroupIdList
     */
    public String getSkillGroupIdList() {
        return this.skillGroupIdList;
    }

    public static final class Builder extends Request.Builder<AddPhoneNumberToSkillGroupsRequest, Builder> {
        private String instanceId; 
        private String number; 
        private String skillGroupIdList; 

        private Builder() {
            super();
        } 

        private Builder(AddPhoneNumberToSkillGroupsRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.number = request.number;
            this.skillGroupIdList = request.skillGroupIdList;
        } 

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * Number.
         */
        public Builder number(String number) {
            this.putQueryParameter("Number", number);
            this.number = number;
            return this;
        }

        /**
         * SkillGroupIdList.
         */
        public Builder skillGroupIdList(String skillGroupIdList) {
            this.putQueryParameter("SkillGroupIdList", skillGroupIdList);
            this.skillGroupIdList = skillGroupIdList;
            return this;
        }

        @Override
        public AddPhoneNumberToSkillGroupsRequest build() {
            return new AddPhoneNumberToSkillGroupsRequest(this);
        } 

    } 

}
