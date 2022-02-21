// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ram20150501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AttachPolicyToUserRequest} extends {@link RequestModel}
 *
 * <p>AttachPolicyToUserRequest</p>
 */
public class AttachPolicyToUserRequest extends Request {
    @Query
    @NameInMap("PolicyName")
    private String policyName;

    @Query
    @NameInMap("PolicyType")
    private String policyType;

    @Query
    @NameInMap("UserName")
    private String userName;

    private AttachPolicyToUserRequest(Builder builder) {
        super(builder);
        this.policyName = builder.policyName;
        this.policyType = builder.policyType;
        this.userName = builder.userName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AttachPolicyToUserRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return policyName
     */
    public String getPolicyName() {
        return this.policyName;
    }

    /**
     * @return policyType
     */
    public String getPolicyType() {
        return this.policyType;
    }

    /**
     * @return userName
     */
    public String getUserName() {
        return this.userName;
    }

    public static final class Builder extends Request.Builder<AttachPolicyToUserRequest, Builder> {
        private String policyName; 
        private String policyType; 
        private String userName; 

        private Builder() {
            super();
        } 

        private Builder(AttachPolicyToUserRequest response) {
            super(response);
            this.policyName = response.policyName;
            this.policyType = response.policyType;
            this.userName = response.userName;
        } 

        /**
         * PolicyName.
         */
        public Builder policyName(String policyName) {
            this.putQueryParameter("PolicyName", policyName);
            this.policyName = policyName;
            return this;
        }

        /**
         * PolicyType.
         */
        public Builder policyType(String policyType) {
            this.putQueryParameter("PolicyType", policyType);
            this.policyType = policyType;
            return this;
        }

        /**
         * UserName.
         */
        public Builder userName(String userName) {
            this.putQueryParameter("UserName", userName);
            this.userName = userName;
            return this;
        }

        @Override
        public AttachPolicyToUserRequest build() {
            return new AttachPolicyToUserRequest(this);
        } 

    } 

}
