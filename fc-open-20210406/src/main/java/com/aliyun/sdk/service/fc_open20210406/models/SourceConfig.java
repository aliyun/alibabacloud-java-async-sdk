// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fc_open20210406.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SourceConfig} extends {@link TeaModel}
 *
 * <p>SourceConfig</p>
 */
public class SourceConfig extends TeaModel {
    @NameInMap("logstore")
    private String logstore;

    private SourceConfig(Builder builder) {
        this.logstore = builder.logstore;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SourceConfig create() {
        return builder().build();
    }

    /**
     * @return logstore
     */
    public String getLogstore() {
        return this.logstore;
    }

    public static final class Builder {
        private String logstore; 

        /**
         * logstore.
         */
        public Builder logstore(String logstore) {
            this.logstore = logstore;
            return this;
        }

        public SourceConfig build() {
            return new SourceConfig(this);
        } 

    } 

}
