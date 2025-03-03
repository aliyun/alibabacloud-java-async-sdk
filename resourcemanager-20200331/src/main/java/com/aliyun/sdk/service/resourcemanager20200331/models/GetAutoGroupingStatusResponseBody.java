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

        /**
         * <p>Indicates whether the Transfer Existing Associated Resources feature is enabled. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
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
         * <p>The status of the Automatic Resource Transfer feature. Valid values:</p>
         * <ul>
         * <li>Enabling: The feature is being enabled.</li>
         * <li>Enable: The feature is enabled.</li>
         * <li>Partial_Enable: The transfer of associated resources is enabled, but custom transfer rule-based resource transfer is disabled. You can call the <a href="https://help.aliyun.com/document_detail/2870380.html">EnableAutoGrouping</a> operation to enable custom transfer rule-based resource transfer.</li>
         * <li>Disable: The feature is disabled.</li>
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
