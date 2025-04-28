// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20190315.models;

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
 * {@link ModifyAuditLogConfigResponseBody} extends {@link TeaModel}
 *
 * <p>ModifyAuditLogConfigResponseBody</p>
 */
public class ModifyAuditLogConfigResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("UpdateSucceed")
    private Boolean updateSucceed;

    private ModifyAuditLogConfigResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.updateSucceed = builder.updateSucceed;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyAuditLogConfigResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return updateSucceed
     */
    public Boolean getUpdateSucceed() {
        return this.updateSucceed;
    }

    public static final class Builder {
        private String requestId; 
        private Boolean updateSucceed; 

        private Builder() {
        } 

        private Builder(ModifyAuditLogConfigResponseBody model) {
            this.requestId = model.requestId;
            this.updateSucceed = model.updateSucceed;
        } 

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>1AD222E9-E606-4A42-BF6D-8A4442913CEF</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the status of SQL audit is updated. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: The status of SQL audit is updated.</li>
         * <li><strong>false</strong>: The status of SQL audit is not updated.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder updateSucceed(Boolean updateSucceed) {
            this.updateSucceed = updateSucceed;
            return this;
        }

        public ModifyAuditLogConfigResponseBody build() {
            return new ModifyAuditLogConfigResponseBody(this);
        } 

    } 

}
