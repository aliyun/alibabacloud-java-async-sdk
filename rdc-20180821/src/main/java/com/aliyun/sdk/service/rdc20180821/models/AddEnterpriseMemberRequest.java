// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rdc20180821.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddEnterpriseMemberRequest} extends {@link RequestModel}
 *
 * <p>AddEnterpriseMemberRequest</p>
 */
public class AddEnterpriseMemberRequest extends Request {
    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("Operator")
    @Validation(required = true)
    private String operator;

    @Query
    @NameInMap("StaffId")
    @Validation(required = true)
    private String staffId;

    private AddEnterpriseMemberRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.operator = builder.operator;
        this.staffId = builder.staffId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddEnterpriseMemberRequest create() {
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
     * @return operator
     */
    public String getOperator() {
        return this.operator;
    }

    /**
     * @return staffId
     */
    public String getStaffId() {
        return this.staffId;
    }

    public static final class Builder extends Request.Builder<AddEnterpriseMemberRequest, Builder> {
        private String instanceId; 
        private String operator; 
        private String staffId; 

        private Builder() {
            super();
        } 

        private Builder(AddEnterpriseMemberRequest response) {
            super(response);
            this.instanceId = response.instanceId;
            this.operator = response.operator;
            this.staffId = response.staffId;
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
         * Operator.
         */
        public Builder operator(String operator) {
            this.putQueryParameter("Operator", operator);
            this.operator = operator;
            return this;
        }

        /**
         * StaffId.
         */
        public Builder staffId(String staffId) {
            this.putQueryParameter("StaffId", staffId);
            this.staffId = staffId;
            return this;
        }

        @Override
        public AddEnterpriseMemberRequest build() {
            return new AddEnterpriseMemberRequest(this);
        } 

    } 

}
