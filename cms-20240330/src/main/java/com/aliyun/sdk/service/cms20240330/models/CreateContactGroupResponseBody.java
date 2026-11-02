// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20240330.models;

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
 * {@link CreateContactGroupResponseBody} extends {@link TeaModel}
 *
 * <p>CreateContactGroupResponseBody</p>
 */
public class CreateContactGroupResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("contactGroupId")
    private String contactGroupId;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private CreateContactGroupResponseBody(Builder builder) {
        this.contactGroupId = builder.contactGroupId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateContactGroupResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return contactGroupId
     */
    public String getContactGroupId() {
        return this.contactGroupId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String contactGroupId; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(CreateContactGroupResponseBody model) {
            this.contactGroupId = model.contactGroupId;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The ID of the contact group.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder contactGroupId(String contactGroupId) {
            this.contactGroupId = contactGroupId;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>8FDE2569-626B-5176-9844-28877A*****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateContactGroupResponseBody build() {
            return new CreateContactGroupResponseBody(this);
        } 

    } 

}
