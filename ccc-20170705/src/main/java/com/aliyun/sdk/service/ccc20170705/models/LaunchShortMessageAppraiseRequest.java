// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20170705.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link LaunchShortMessageAppraiseRequest} extends {@link RequestModel}
 *
 * <p>LaunchShortMessageAppraiseRequest</p>
 */
public class LaunchShortMessageAppraiseRequest extends Request {
    @Query
    @NameInMap("Acid")
    @Validation(required = true)
    private String acid;

    @Query
    @NameInMap("ContactType")
    @Validation(required = true)
    private Integer contactType;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("PhoneNumbers")
    @Validation(required = true)
    private String phoneNumbers;

    @Query
    @NameInMap("SkillGroupId")
    private String skillGroupId;

    private LaunchShortMessageAppraiseRequest(Builder builder) {
        super(builder);
        this.acid = builder.acid;
        this.contactType = builder.contactType;
        this.instanceId = builder.instanceId;
        this.phoneNumbers = builder.phoneNumbers;
        this.skillGroupId = builder.skillGroupId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static LaunchShortMessageAppraiseRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return acid
     */
    public String getAcid() {
        return this.acid;
    }

    /**
     * @return contactType
     */
    public Integer getContactType() {
        return this.contactType;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return phoneNumbers
     */
    public String getPhoneNumbers() {
        return this.phoneNumbers;
    }

    /**
     * @return skillGroupId
     */
    public String getSkillGroupId() {
        return this.skillGroupId;
    }

    public static final class Builder extends Request.Builder<LaunchShortMessageAppraiseRequest, Builder> {
        private String acid; 
        private Integer contactType; 
        private String instanceId; 
        private String phoneNumbers; 
        private String skillGroupId; 

        private Builder() {
            super();
        } 

        private Builder(LaunchShortMessageAppraiseRequest response) {
            super(response);
            this.acid = response.acid;
            this.contactType = response.contactType;
            this.instanceId = response.instanceId;
            this.phoneNumbers = response.phoneNumbers;
            this.skillGroupId = response.skillGroupId;
        } 

        /**
         * Acid.
         */
        public Builder acid(String acid) {
            this.putQueryParameter("Acid", acid);
            this.acid = acid;
            return this;
        }

        /**
         * ContactType.
         */
        public Builder contactType(Integer contactType) {
            this.putQueryParameter("ContactType", contactType);
            this.contactType = contactType;
            return this;
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
         * PhoneNumbers.
         */
        public Builder phoneNumbers(String phoneNumbers) {
            this.putQueryParameter("PhoneNumbers", phoneNumbers);
            this.phoneNumbers = phoneNumbers;
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
        public LaunchShortMessageAppraiseRequest build() {
            return new LaunchShortMessageAppraiseRequest(this);
        } 

    } 

}
