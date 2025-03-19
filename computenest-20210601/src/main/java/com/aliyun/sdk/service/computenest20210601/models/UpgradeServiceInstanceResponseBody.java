// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.computenest20210601.models;

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
 * {@link UpgradeServiceInstanceResponseBody} extends {@link TeaModel}
 *
 * <p>UpgradeServiceInstanceResponseBody</p>
 */
public class UpgradeServiceInstanceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("UpgradeRequiredParameters")
    private java.util.List<String> upgradeRequiredParameters;

    private UpgradeServiceInstanceResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.upgradeRequiredParameters = builder.upgradeRequiredParameters;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpgradeServiceInstanceResponseBody create() {
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
     * @return upgradeRequiredParameters
     */
    public java.util.List<String> getUpgradeRequiredParameters() {
        return this.upgradeRequiredParameters;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List<String> upgradeRequiredParameters; 

        private Builder() {
        } 

        private Builder(UpgradeServiceInstanceResponseBody model) {
            this.requestId = model.requestId;
            this.upgradeRequiredParameters = model.upgradeRequiredParameters;
        } 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>4DB0F536-B3BE-4F0D-BD29-E83FB56D550C</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The parameters required for the upgrade. This parameter is returned only if DryRun is set to true in the request. You can specify the required parameters based on the returned value when you perform an actual request.</p>
         */
        public Builder upgradeRequiredParameters(java.util.List<String> upgradeRequiredParameters) {
            this.upgradeRequiredParameters = upgradeRequiredParameters;
            return this;
        }

        public UpgradeServiceInstanceResponseBody build() {
            return new UpgradeServiceInstanceResponseBody(this);
        } 

    } 

}
