// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fcsandbox20260509.models;

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
 * {@link E2BLifecycle} extends {@link TeaModel}
 *
 * <p>E2BLifecycle</p>
 */
public class E2BLifecycle extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("autoResume")
    private Boolean autoResume;

    @com.aliyun.core.annotation.NameInMap("onTimeout")
    private String onTimeout;

    private E2BLifecycle(Builder builder) {
        this.autoResume = builder.autoResume;
        this.onTimeout = builder.onTimeout;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static E2BLifecycle create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return autoResume
     */
    public Boolean getAutoResume() {
        return this.autoResume;
    }

    /**
     * @return onTimeout
     */
    public String getOnTimeout() {
        return this.onTimeout;
    }

    public static final class Builder {
        private Boolean autoResume; 
        private String onTimeout; 

        private Builder() {
        } 

        private Builder(E2BLifecycle model) {
            this.autoResume = model.autoResume;
            this.onTimeout = model.onTimeout;
        } 

        /**
         * autoResume.
         */
        public Builder autoResume(Boolean autoResume) {
            this.autoResume = autoResume;
            return this;
        }

        /**
         * onTimeout.
         */
        public Builder onTimeout(String onTimeout) {
            this.onTimeout = onTimeout;
            return this;
        }

        public E2BLifecycle build() {
            return new E2BLifecycle(this);
        } 

    } 

}
