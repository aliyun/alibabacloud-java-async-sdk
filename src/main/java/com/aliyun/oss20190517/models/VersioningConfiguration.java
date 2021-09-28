// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link VersioningConfiguration} extends {@link TeaModel}
 *
 * <p>VersioningConfiguration</p>
 */
public class VersioningConfiguration extends TeaModel {
    @NameInMap("Status")
    private BucketVersioningStatus status;


    private VersioningConfiguration(Builder builder) {
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static VersioningConfiguration create() {
        return builder().build();
    }

    /**
     * @return status
     */
    public BucketVersioningStatus status() {
        return this.status;
    }

    public static final class Builder {
        private BucketVersioningStatus status; 

        /**
         * <p>Status.</p>
         */
        public Builder status(BucketVersioningStatus status) {
            this.status = status;
            return this;
        }

        public VersioningConfiguration build() {
            return new VersioningConfiguration(this);
        } 

    } 

}
