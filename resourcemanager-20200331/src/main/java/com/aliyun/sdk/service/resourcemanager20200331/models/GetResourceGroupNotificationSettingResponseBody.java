// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcemanager20200331.models;

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
 * {@link GetResourceGroupNotificationSettingResponseBody} extends {@link TeaModel}
 *
 * <p>GetResourceGroupNotificationSettingResponseBody</p>
 */
public class GetResourceGroupNotificationSettingResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ResourceGroupNotificationEnableStatus")
    private Boolean resourceGroupNotificationEnableStatus;

    private GetResourceGroupNotificationSettingResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.resourceGroupNotificationEnableStatus = builder.resourceGroupNotificationEnableStatus;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetResourceGroupNotificationSettingResponseBody create() {
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
     * @return resourceGroupNotificationEnableStatus
     */
    public Boolean getResourceGroupNotificationEnableStatus() {
        return this.resourceGroupNotificationEnableStatus;
    }

    public static final class Builder {
        private String requestId; 
        private Boolean resourceGroupNotificationEnableStatus; 

        private Builder() {
        } 

        private Builder(GetResourceGroupNotificationSettingResponseBody model) {
            this.requestId = model.requestId;
            this.resourceGroupNotificationEnableStatus = model.resourceGroupNotificationEnableStatus;
        } 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * ResourceGroupNotificationEnableStatus.
         */
        public Builder resourceGroupNotificationEnableStatus(Boolean resourceGroupNotificationEnableStatus) {
            this.resourceGroupNotificationEnableStatus = resourceGroupNotificationEnableStatus;
            return this;
        }

        public GetResourceGroupNotificationSettingResponseBody build() {
            return new GetResourceGroupNotificationSettingResponseBody(this);
        } 

    } 

}
