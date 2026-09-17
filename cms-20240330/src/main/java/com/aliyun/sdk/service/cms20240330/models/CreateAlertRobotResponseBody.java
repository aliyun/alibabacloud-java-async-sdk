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
 * {@link CreateAlertRobotResponseBody} extends {@link TeaModel}
 *
 * <p>CreateAlertRobotResponseBody</p>
 */
public class CreateAlertRobotResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("alertRobotId")
    private String alertRobotId;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private CreateAlertRobotResponseBody(Builder builder) {
        this.alertRobotId = builder.alertRobotId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateAlertRobotResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return alertRobotId
     */
    public String getAlertRobotId() {
        return this.alertRobotId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String alertRobotId; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(CreateAlertRobotResponseBody model) {
            this.alertRobotId = model.alertRobotId;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The robot ID.</p>
         * 
         * <strong>example:</strong>
         * <p>testId</p>
         */
        public Builder alertRobotId(String alertRobotId) {
            this.alertRobotId = alertRobotId;
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

        public CreateAlertRobotResponseBody build() {
            return new CreateAlertRobotResponseBody(this);
        } 

    } 

}
