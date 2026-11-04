// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20170705.models;

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
 * {@link LaunchShortMessageAppraiseRequest} extends {@link RequestModel}
 *
 * <p>LaunchShortMessageAppraiseRequest</p>
 */
public class LaunchShortMessageAppraiseRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Acid")
    @com.aliyun.core.annotation.Validation(required = true)
    private String acid;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ContactType")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer contactType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PhoneNumbers")
    @com.aliyun.core.annotation.Validation(required = true)
    private String phoneNumbers;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SkillGroupId")
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

        private Builder(LaunchShortMessageAppraiseRequest request) {
            super(request);
            this.acid = request.acid;
            this.contactType = request.contactType;
            this.instanceId = request.instanceId;
            this.phoneNumbers = request.phoneNumbers;
            this.skillGroupId = request.skillGroupId;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder acid(String acid) {
            this.putQueryParameter("Acid", acid);
            this.acid = acid;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder contactType(Integer contactType) {
            this.putQueryParameter("ContactType", contactType);
            this.contactType = contactType;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
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
