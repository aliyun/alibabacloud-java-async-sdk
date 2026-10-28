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
 * {@link CreateAlertActionResponseBody} extends {@link TeaModel}
 *
 * <p>CreateAlertActionResponseBody</p>
 */
public class CreateAlertActionResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("alertActionId")
    private String alertActionId;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private CreateAlertActionResponseBody(Builder builder) {
        this.alertActionId = builder.alertActionId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateAlertActionResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return alertActionId
     */
    public String getAlertActionId() {
        return this.alertActionId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String alertActionId; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(CreateAlertActionResponseBody model) {
            this.alertActionId = model.alertActionId;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The ID of the alert action integration.</p>
         * 
         * <strong>example:</strong>
         * <p>testId</p>
         */
        public Builder alertActionId(String alertActionId) {
            this.alertActionId = alertActionId;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>8FDE2569-626B-5176-9844-28877A*****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateAlertActionResponseBody build() {
            return new CreateAlertActionResponseBody(this);
        } 

    } 

}
