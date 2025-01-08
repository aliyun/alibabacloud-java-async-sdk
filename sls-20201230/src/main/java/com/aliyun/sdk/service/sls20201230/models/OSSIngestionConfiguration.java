// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sls20201230.models;

import com.aliyun.sdk.gateway.sls.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.sls.models.*;

/**
 * 
 * {@link OSSIngestionConfiguration} extends {@link TeaModel}
 *
 * <p>OSSIngestionConfiguration</p>
 */
public class OSSIngestionConfiguration extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("logstore")
    @com.aliyun.core.annotation.Validation(required = true)
    private String logstore;

    @com.aliyun.core.annotation.NameInMap("source")
    @com.aliyun.core.annotation.Validation(required = true)
    private OSSIngestionConfigurationSource source;

    private OSSIngestionConfiguration(Builder builder) {
        this.logstore = builder.logstore;
        this.source = builder.source;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static OSSIngestionConfiguration create() {
        return builder().build();
    }

    /**
     * @return logstore
     */
    public String getLogstore() {
        return this.logstore;
    }

    /**
     * @return source
     */
    public OSSIngestionConfigurationSource getSource() {
        return this.source;
    }

    public static final class Builder {
        private String logstore; 
        private OSSIngestionConfigurationSource source; 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>myLogstore</p>
         */
        public Builder logstore(String logstore) {
            this.logstore = logstore;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder source(OSSIngestionConfigurationSource source) {
            this.source = source;
            return this;
        }

        public OSSIngestionConfiguration build() {
            return new OSSIngestionConfiguration(this);
        } 

    } 

}
