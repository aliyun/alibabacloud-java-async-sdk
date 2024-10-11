// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20200701.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link AddPhoneNumberToSkillGroupsRequest} extends {@link RequestModel}
 *
 * <p>AddPhoneNumberToSkillGroupsRequest</p>
 */
public class AddPhoneNumberToSkillGroupsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Number")
    @com.aliyun.core.annotation.Validation(required = true)
    private String number;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SkillGroupIdList")
    @com.aliyun.core.annotation.Validation(required = true)
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ccc-test</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>0101234****</p>
         */
        public Builder number(String number) {
            this.putQueryParameter("Number", number);
            this.number = number;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;skillgroup1@ccc-test&quot;,&quot;skillgroup2@ccc-test&quot;]</p>
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
