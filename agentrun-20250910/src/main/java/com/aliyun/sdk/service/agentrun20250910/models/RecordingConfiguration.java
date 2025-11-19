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
 * {@link RecordingConfiguration} extends {@link TeaModel}
 *
 * <p>RecordingConfiguration</p>
 */
public class RecordingConfiguration extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("enabled")
    @com.aliyun.core.annotation.Validation(required = true)
    private Boolean enabled;

    @com.aliyun.core.annotation.NameInMap("ossLocation")
    private OssConfiguration ossLocation;

    private RecordingConfiguration(Builder builder) {
        this.enabled = builder.enabled;
        this.ossLocation = builder.ossLocation;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RecordingConfiguration create() {
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
    public OssConfiguration getOssLocation() {
        return this.ossLocation;
    }

    public static final class Builder {
        private Boolean enabled; 
        private OssConfiguration ossLocation; 

        private Builder() {
        } 

        private Builder(RecordingConfiguration model) {
            this.enabled = model.enabled;
            this.ossLocation = model.ossLocation;
        } 

        /**
         * <p>是否启用录制</p>
         * <p>This parameter is required.</p>
         */
        public Builder enabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }

        /**
         * ossLocation.
         */
        public Builder ossLocation(OssConfiguration ossLocation) {
            this.ossLocation = ossLocation;
            return this;
        }

        public RecordingConfiguration build() {
            return new RecordingConfiguration(this);
        } 

    } 

}
