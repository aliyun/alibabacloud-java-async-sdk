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
 * {@link GetAutoGroupingStatusResponseBody} extends {@link TeaModel}
 *
 * <p>GetAutoGroupingStatusResponseBody</p>
 */
public class GetAutoGroupingStatusResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("EnableExistedResourcesTransfer")
    private Boolean enableExistedResourcesTransfer;

    @com.aliyun.core.annotation.NameInMap("EnableStatus")
    private String enableStatus;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetAutoGroupingStatusResponseBody(Builder builder) {
        this.enableExistedResourcesTransfer = builder.enableExistedResourcesTransfer;
        this.enableStatus = builder.enableStatus;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAutoGroupingStatusResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return enableExistedResourcesTransfer
     */
    public Boolean getEnableExistedResourcesTransfer() {
        return this.enableExistedResourcesTransfer;
    }

    /**
     * @return enableStatus
     */
    public String getEnableStatus() {
        return this.enableStatus;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Boolean enableExistedResourcesTransfer; 
        private String enableStatus; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetAutoGroupingStatusResponseBody model) {
            this.enableExistedResourcesTransfer = model.enableExistedResourcesTransfer;
            this.enableStatus = model.enableStatus;
            this.requestId = model.requestId;
        } 

        /**
         * <p>Indicates whether the attached-resource allocation for existing resources is enabled. Valid values:</p>
         * <ul>
         * <li>true: Enabled.</li>
         * <li>false: Not enabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder enableExistedResourcesTransfer(Boolean enableExistedResourcesTransfer) {
            this.enableExistedResourcesTransfer = enableExistedResourcesTransfer;
            return this;
        }

        /**
         * <p>The status of automatic resource group transfer. Valid values:</p>
         * <ul>
         * <li>Enabling: Being enabled.</li>
         * <li>Enable: Enabled.</li>
         * <li>Partial_Enable: Attached-resource allocation is enabled, but custom condition-based resource group transfer is not enabled. To enable custom condition-based resource group transfer, call <a href="~~EnableAutoGrouping~~">EnableAutoGrouping</a>.</li>
         * <li>Disable: Not enabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Enable</p>
         */
        public Builder enableStatus(String enableStatus) {
            this.enableStatus = enableStatus;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>0217AFEB-5318-56D4-B167-1933D83EDF3F</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetAutoGroupingStatusResponseBody build() {
            return new GetAutoGroupingStatusResponseBody(this);
        } 

    } 

}
