// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

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
 * {@link GetClusterInspectConfigResponseBody} extends {@link TeaModel}
 *
 * <p>GetClusterInspectConfigResponseBody</p>
 */
public class GetClusterInspectConfigResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("disabledCheckItems")
    private java.util.List<String> disabledCheckItems;

    @com.aliyun.core.annotation.NameInMap("enabled")
    private Boolean enabled;

    @com.aliyun.core.annotation.NameInMap("recurrence")
    private String recurrence;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private GetClusterInspectConfigResponseBody(Builder builder) {
        this.disabledCheckItems = builder.disabledCheckItems;
        this.enabled = builder.enabled;
        this.recurrence = builder.recurrence;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetClusterInspectConfigResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return disabledCheckItems
     */
    public java.util.List<String> getDisabledCheckItems() {
        return this.disabledCheckItems;
    }

    /**
     * @return enabled
     */
    public Boolean getEnabled() {
        return this.enabled;
    }

    /**
     * @return recurrence
     */
    public String getRecurrence() {
        return this.recurrence;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<String> disabledCheckItems; 
        private Boolean enabled; 
        private String recurrence; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetClusterInspectConfigResponseBody model) {
            this.disabledCheckItems = model.disabledCheckItems;
            this.enabled = model.enabled;
            this.recurrence = model.recurrence;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The list of disabled inspection items.</p>
         */
        public Builder disabledCheckItems(java.util.List<String> disabledCheckItems) {
            this.disabledCheckItems = disabledCheckItems;
            return this;
        }

        /**
         * <p>Specifies whether to enable inspection.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder enabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }

        /**
         * <p>The inspection schedule defined through the RFC5545 Recurrence Rule syntax. You must specify BYHOUR and BYMINUTE. Only FREQ=DAILY is supported. COUNT and UNTIL are not supported.</p>
         * 
         * <strong>example:</strong>
         * <p>FREQ=DAILY;BYHOUR=10;BYMINUTE=15</p>
         */
        public Builder recurrence(String recurrence) {
            this.recurrence = recurrence;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>49511F2D-D56A-5C24-B9AE-C8491E09B095</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetClusterInspectConfigResponseBody build() {
            return new GetClusterInspectConfigResponseBody(this);
        } 

    } 

}
