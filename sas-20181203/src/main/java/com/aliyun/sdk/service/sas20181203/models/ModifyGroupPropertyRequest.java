// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
         * <p>The new attributes of the server group. You can specify the following parameters to configure the attributes:</p>
         * <ul>
         * <li><strong>groupFlag</strong>: the type of the server group. Valid values: 0 and 1. The value <strong>0</strong> specifies the Default server group. The value <strong>1</strong> specifies other server groups.</li>
         * <li><strong>groupId</strong>: the ID of the server group.</li>
         * <li><strong>groupIndex</strong>: no meaning. You can leave this parameter empty.</li>
         * <li><strong>groupName</strong>: the name of the server group. The value is the new name of the server group. The new name cannot be the same as the original name of the server group.</li>
         * </ul>
         * <blockquote>
         * <p> You can call the <a href="~~DescribeAllGroups~~">DescribeAllGroups</a> operation to obtain the values of the groupFlag and groupId parameters. You cannot change the value of the groupFlag or groupId parameter. You can change only the value of the groupName parameter.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;groupFlag&quot;:1,&quot;groupId&quot;:8436682,&quot;groupIndex&quot;:,&quot;groupName&quot;:&quot;example&quot;}]</p>
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
