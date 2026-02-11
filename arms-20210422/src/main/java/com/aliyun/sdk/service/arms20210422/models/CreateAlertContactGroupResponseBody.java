// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20210422.models;

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
 * {@link CreateAlertContactGroupResponseBody} extends {@link TeaModel}
 *
 * <p>CreateAlertContactGroupResponseBody</p>
 */
public class CreateAlertContactGroupResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ContactGroupId")
    private String contactGroupId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateAlertContactGroupResponseBody(Builder builder) {
        this.contactGroupId = builder.contactGroupId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateAlertContactGroupResponseBody create() {
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

        private Builder(CreateAlertContactGroupResponseBody model) {
            this.contactGroupId = model.contactGroupId;
            this.requestId = model.requestId;
        } 

        /**
         * ContactGroupId.
         */
        public Builder contactGroupId(String contactGroupId) {
            this.contactGroupId = contactGroupId;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateAlertContactGroupResponseBody build() {
            return new CreateAlertContactGroupResponseBody(this);
        } 

    } 

}
