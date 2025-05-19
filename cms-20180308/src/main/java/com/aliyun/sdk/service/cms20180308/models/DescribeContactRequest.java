// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20180308.models;

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
 * {@link DescribeContactRequest} extends {@link RequestModel}
 *
 * <p>DescribeContactRequest</p>
 */
public class DescribeContactRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ContactName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String contactName;

    private DescribeContactRequest(Builder builder) {
        super(builder);
        this.contactName = builder.contactName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeContactRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return contactName
     */
    public String getContactName() {
        return this.contactName;
    }

    public static final class Builder extends Request.Builder<DescribeContactRequest, Builder> {
        private String contactName; 

        private Builder() {
            super();
        } 

        private Builder(DescribeContactRequest request) {
            super(request);
            this.contactName = request.contactName;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder contactName(String contactName) {
            this.putQueryParameter("ContactName", contactName);
            this.contactName = contactName;
            return this;
        }

        @Override
        public DescribeContactRequest build() {
            return new DescribeContactRequest(this);
        } 

    } 

}
