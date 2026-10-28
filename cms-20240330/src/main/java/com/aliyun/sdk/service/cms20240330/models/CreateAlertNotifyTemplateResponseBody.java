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
 * {@link CreateAlertNotifyTemplateResponseBody} extends {@link TeaModel}
 *
 * <p>CreateAlertNotifyTemplateResponseBody</p>
 */
public class CreateAlertNotifyTemplateResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("alertNotifyTemplateId")
    private String alertNotifyTemplateId;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private CreateAlertNotifyTemplateResponseBody(Builder builder) {
        this.alertNotifyTemplateId = builder.alertNotifyTemplateId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateAlertNotifyTemplateResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return alertNotifyTemplateId
     */
    public String getAlertNotifyTemplateId() {
        return this.alertNotifyTemplateId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String alertNotifyTemplateId; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(CreateAlertNotifyTemplateResponseBody model) {
            this.alertNotifyTemplateId = model.alertNotifyTemplateId;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The ID of the notification template.</p>
         * 
         * <strong>example:</strong>
         * <p>testId</p>
         */
        public Builder alertNotifyTemplateId(String alertNotifyTemplateId) {
            this.alertNotifyTemplateId = alertNotifyTemplateId;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>8A33DBEA-<em><strong><strong>-</strong></strong></em>-<em><strong><strong>-</strong></strong></em></p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateAlertNotifyTemplateResponseBody build() {
            return new CreateAlertNotifyTemplateResponseBody(this);
        } 

    } 

}
