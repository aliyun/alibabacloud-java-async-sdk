// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

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
 * {@link DescribeContactListByContactGroupRequest} extends {@link RequestModel}
 *
 * <p>DescribeContactListByContactGroupRequest</p>
 */
public class DescribeContactListByContactGroupRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ContactGroupName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String contactGroupName;

    private DescribeContactListByContactGroupRequest(Builder builder) {
        super(builder);
        this.contactGroupName = builder.contactGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeContactListByContactGroupRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return contactGroupName
     */
    public String getContactGroupName() {
        return this.contactGroupName;
    }

    public static final class Builder extends Request.Builder<DescribeContactListByContactGroupRequest, Builder> {
        private String contactGroupName; 

        private Builder() {
            super();
        } 

        private Builder(DescribeContactListByContactGroupRequest request) {
            super(request);
            this.contactGroupName = request.contactGroupName;
        } 

        /**
         * <p>The name of the alert contact group.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>CloudMonitor</p>
         */
        public Builder contactGroupName(String contactGroupName) {
            this.putQueryParameter("ContactGroupName", contactGroupName);
            this.contactGroupName = contactGroupName;
            return this;
        }

        @Override
        public DescribeContactListByContactGroupRequest build() {
            return new DescribeContactListByContactGroupRequest(this);
        } 

    } 

}
