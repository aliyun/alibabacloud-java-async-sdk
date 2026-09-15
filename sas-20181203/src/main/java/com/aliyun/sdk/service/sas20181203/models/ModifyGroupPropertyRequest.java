// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
         * <p>The new property information of the server group after modification. The following parameters are described:</p>
         * <ul>
         * <li><strong>groupFlag</strong>: The type of the server group. Valid values: <strong>0</strong> (default group) | <strong>1</strong> (other group).</li>
         * <li><strong>groupId</strong>: The ID of the server group.</li>
         * <li><strong>groupIndex</strong>: The sorting number of the server group. Sorted in ascending order.</li>
         * <li><strong>groupName</strong>: The name of the server group. Set this parameter to the new name of the server group. The new name must be different from the original name.</li>
         * </ul>
         * <blockquote>
         * <p>Call the <a href="~~DescribeAllGroups~~">DescribeAllGroups</a> operation to obtain the values of groupFlag and groupId. The values of groupFlag and groupId cannot be modified. Only the value of groupName can be modified.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;groupFlag&quot;:1,&quot;groupId&quot;:8436682,&quot;groupIndex&quot;:1,&quot;groupName&quot;:&quot;example&quot;}]</p>
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
