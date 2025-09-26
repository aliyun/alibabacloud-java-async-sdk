// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agentrun20250910.models;

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
 * {@link BrowserRecordingConfiguration} extends {@link TeaModel}
 *
 * <p>BrowserRecordingConfiguration</p>
 */
public class BrowserRecordingConfiguration extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("enabled")
    private Boolean enabled;

    @com.aliyun.core.annotation.NameInMap("ossLocation")
    private BrowserOssLocation ossLocation;

    private BrowserRecordingConfiguration(Builder builder) {
        this.enabled = builder.enabled;
        this.ossLocation = builder.ossLocation;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BrowserRecordingConfiguration create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return enabled
     */
    public Boolean getEnabled() {
        return this.enabled;
    }

    /**
     * @return ossLocation
     */
    public BrowserOssLocation getOssLocation() {
        return this.ossLocation;
    }

    public static final class Builder {
        private Boolean enabled; 
        private BrowserOssLocation ossLocation; 

        private Builder() {
        } 

        private Builder(BrowserRecordingConfiguration model) {
            this.enabled = model.enabled;
            this.ossLocation = model.ossLocation;
        } 

        /**
         * enabled.
         */
        public Builder enabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }

        /**
         * ossLocation.
         */
        public Builder ossLocation(BrowserOssLocation ossLocation) {
            this.ossLocation = ossLocation;
            return this;
        }

        public BrowserRecordingConfiguration build() {
            return new BrowserRecordingConfiguration(this);
        } 

    } 

}
