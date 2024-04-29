// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyGroupPropertyRequest} extends {@link RequestModel}
 *
 * <p>ModifyGroupPropertyRequest</p>
 */
public class ModifyGroupPropertyRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Data")
    @com.aliyun.core.annotation.Validation(required = true)
    private String data;

    private ModifyGroupPropertyRequest(Builder builder) {
        super(builder);
        this.data = builder.data;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyGroupPropertyRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public String getData() {
        return this.data;
    }

    public static final class Builder extends Request.Builder<ModifyGroupPropertyRequest, Builder> {
        private String data; 

        private Builder() {
            super();
        } 

        private Builder(ModifyGroupPropertyRequest request) {
            super(request);
            this.data = request.data;
        } 

        /**
         * The new attributes of the server group. You can specify the following parameters to configure the attributes:
         * <p>
         * 
         * *   **groupFlag**: the type of the server group. Valid values: 0 and 1. The value **0** specifies the Default server group. The value **1** specifies other server groups.
         * *   **groupId**: the ID of the server group.
         * *   **groupIndex**: no meaning. You can leave this parameter empty.
         * *   **groupName**: the name of the server group. The value is the new name of the server group. The new name cannot be the same as the original name of the server group.
         * 
         * >  You can call the [DescribeAllGroups](~~DescribeAllGroups~~) operation to obtain the values of the groupFlag and groupId parameters. You cannot change the value of the groupFlag or groupId parameter. You can change only the value of the groupName parameter.
         */
        public Builder data(String data) {
            this.putQueryParameter("Data", data);
            this.data = data;
            return this;
        }

        @Override
        public ModifyGroupPropertyRequest build() {
            return new ModifyGroupPropertyRequest(this);
        } 

    } 

}
