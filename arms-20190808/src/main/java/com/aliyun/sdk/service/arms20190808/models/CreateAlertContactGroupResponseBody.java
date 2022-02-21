// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateAlertContactGroupResponseBody} extends {@link TeaModel}
 *
 * <p>CreateAlertContactGroupResponseBody</p>
 */
public class CreateAlertContactGroupResponseBody extends TeaModel {
    @NameInMap("ContactGroupId")
    private String contactGroupId;

    @NameInMap("RequestId")
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
