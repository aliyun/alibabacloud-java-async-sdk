// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.tag20180828.models;

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
 * {@link CheckCreatedByEnabledResponseBody} extends {@link TeaModel}
 *
 * <p>CheckCreatedByEnabledResponseBody</p>
 */
public class CheckCreatedByEnabledResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("OpenStatus")
    private Boolean openStatus;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CheckCreatedByEnabledResponseBody(Builder builder) {
        this.openStatus = builder.openStatus;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CheckCreatedByEnabledResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return openStatus
     */
    public Boolean getOpenStatus() {
        return this.openStatus;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Boolean openStatus; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(CheckCreatedByEnabledResponseBody model) {
            this.openStatus = model.openStatus;
            this.requestId = model.requestId;
        } 

        /**
         * <p>Indicates whether the createdby tag is enabled. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder openStatus(Boolean openStatus) {
            this.openStatus = openStatus;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>682DD9E1-F530-5D14-A839-A6787FA8****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CheckCreatedByEnabledResponseBody build() {
            return new CheckCreatedByEnabledResponseBody(this);
        } 

    } 

}
