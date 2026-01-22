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
 * {@link CreateAlertWebhookResponseBody} extends {@link TeaModel}
 *
 * <p>CreateAlertWebhookResponseBody</p>
 */
public class CreateAlertWebhookResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("alertWebhookId")
    private String alertWebhookId;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private CreateAlertWebhookResponseBody(Builder builder) {
        this.alertWebhookId = builder.alertWebhookId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateAlertWebhookResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return alertWebhookId
     */
    public String getAlertWebhookId() {
        return this.alertWebhookId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String alertWebhookId; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(CreateAlertWebhookResponseBody model) {
            this.alertWebhookId = model.alertWebhookId;
            this.requestId = model.requestId;
        } 

        /**
         * alertWebhookId.
         */
        public Builder alertWebhookId(String alertWebhookId) {
            this.alertWebhookId = alertWebhookId;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateAlertWebhookResponseBody build() {
            return new CreateAlertWebhookResponseBody(this);
        } 

    } 

}
