// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fc20230330.models;

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

    @NameInMap("startTime")
    private Long startTime;

    private SourceConfig(Builder builder) {
        this.logstore = builder.logstore;
        this.startTime = builder.startTime;
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

    /**
     * @return startTime
     */
    public Long getStartTime() {
        return this.startTime;
    }

    public static final class Builder {
        private String logstore; 
        private Long startTime; 

        /**
         * logstore.
         */
        public Builder logstore(String logstore) {
            this.logstore = logstore;
            return this;
        }

        /**
         * startTime.
         */
        public Builder startTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }

        public SourceConfig build() {
            return new SourceConfig(this);
        } 

    } 

}
