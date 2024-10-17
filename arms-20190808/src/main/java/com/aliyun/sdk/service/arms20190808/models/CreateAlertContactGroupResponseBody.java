// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

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
         * <p>The ID of the alert contact group.</p>
         * 
         * <strong>example:</strong>
         * <p>446*</p>
         */
        public Builder contactGroupId(String contactGroupId) {
            this.contactGroupId = contactGroupId;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>70675725-8F11-4817-8106-CFE0AD71****</p>
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
