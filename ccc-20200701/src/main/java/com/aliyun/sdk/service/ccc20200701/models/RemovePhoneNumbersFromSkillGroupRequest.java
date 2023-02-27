// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20200701.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RemovePhoneNumbersFromSkillGroupRequest} extends {@link RequestModel}
 *
 * <p>RemovePhoneNumbersFromSkillGroupRequest</p>
 */
public class RemovePhoneNumbersFromSkillGroupRequest extends Request {
    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("NumberList")
    @Validation(required = true)
    private String numberList;

    @Query
    @NameInMap("SkillGroupId")
    @Validation(required = true)
    private String skillGroupId;

    private RemovePhoneNumbersFromSkillGroupRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.numberList = builder.numberList;
        this.skillGroupId = builder.skillGroupId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RemovePhoneNumbersFromSkillGroupRequest create() {
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
     * @return numberList
     */
    public String getNumberList() {
        return this.numberList;
    }

    /**
     * @return skillGroupId
     */
    public String getSkillGroupId() {
        return this.skillGroupId;
    }

    public static final class Builder extends Request.Builder<RemovePhoneNumbersFromSkillGroupRequest, Builder> {
        private String instanceId; 
        private String numberList; 
        private String skillGroupId; 

        private Builder() {
            super();
        } 

        private Builder(RemovePhoneNumbersFromSkillGroupRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.numberList = request.numberList;
            this.skillGroupId = request.skillGroupId;
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
         * NumberList.
         */
        public Builder numberList(String numberList) {
            this.putQueryParameter("NumberList", numberList);
            this.numberList = numberList;
            return this;
        }

        /**
         * SkillGroupId.
         */
        public Builder skillGroupId(String skillGroupId) {
            this.putQueryParameter("SkillGroupId", skillGroupId);
            this.skillGroupId = skillGroupId;
            return this;
        }

        @Override
        public RemovePhoneNumbersFromSkillGroupRequest build() {
            return new RemovePhoneNumbersFromSkillGroupRequest(this);
        } 

    } 

}
