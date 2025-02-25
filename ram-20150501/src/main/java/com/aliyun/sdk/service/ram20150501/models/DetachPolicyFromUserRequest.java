// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ram20150501.models;

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
 * {@link DetachPolicyFromUserRequest} extends {@link RequestModel}
 *
 * <p>DetachPolicyFromUserRequest</p>
 */
public class DetachPolicyFromUserRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PolicyName")
    private String policyName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PolicyType")
    private String policyType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserName")
    private String userName;

    private DetachPolicyFromUserRequest(Builder builder) {
        super(builder);
        this.policyName = builder.policyName;
        this.policyType = builder.policyType;
        this.userName = builder.userName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DetachPolicyFromUserRequest create() {
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

    public static final class Builder extends Request.Builder<DetachPolicyFromUserRequest, Builder> {
        private String policyName; 
        private String policyType; 
        private String userName; 

        private Builder() {
            super();
        } 

        private Builder(DetachPolicyFromUserRequest request) {
            super(request);
            this.policyName = request.policyName;
            this.policyType = request.policyType;
            this.userName = request.userName;
        } 

        /**
         * <p>The name of the policy.</p>
         * 
         * <strong>example:</strong>
         * <p>OSS-Administrator</p>
         */
        public Builder policyName(String policyName) {
            this.putQueryParameter("PolicyName", policyName);
            this.policyName = policyName;
            return this;
        }

        /**
         * <p>The type of the policy. Valid values: <code>System</code> and <code>Custom</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>Custom</p>
         */
        public Builder policyType(String policyType) {
            this.putQueryParameter("PolicyType", policyType);
            this.policyType = policyType;
            return this;
        }

        /**
         * <p>The name of the RAM user.</p>
         * 
         * <strong>example:</strong>
         * <p>zhangq****</p>
         */
        public Builder userName(String userName) {
            this.putQueryParameter("UserName", userName);
            this.userName = userName;
            return this;
        }

        @Override
        public DetachPolicyFromUserRequest build() {
            return new DetachPolicyFromUserRequest(this);
        } 

    } 

}
