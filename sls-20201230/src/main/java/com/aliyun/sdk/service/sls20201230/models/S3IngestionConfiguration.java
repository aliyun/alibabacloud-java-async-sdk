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
 * {@link S3IngestionConfiguration} extends {@link TeaModel}
 *
 * <p>S3IngestionConfiguration</p>
 */
public class S3IngestionConfiguration extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("logstore")
    private String logstore;

    @com.aliyun.core.annotation.NameInMap("source")
    private S3IngestionConfigurationSource source;

    private S3IngestionConfiguration(Builder builder) {
        this.logstore = builder.logstore;
        this.source = builder.source;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static S3IngestionConfiguration create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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
    public S3IngestionConfigurationSource getSource() {
        return this.source;
    }

    public static final class Builder {
        private String logstore; 
        private S3IngestionConfigurationSource source; 

        private Builder() {
        } 

        private Builder(S3IngestionConfiguration model) {
            this.logstore = model.logstore;
            this.source = model.source;
        } 

        /**
         * logstore.
         */
        public Builder logstore(String logstore) {
            this.logstore = logstore;
            return this;
        }

        /**
         * source.
         */
        public Builder source(S3IngestionConfigurationSource source) {
            this.source = source;
            return this;
        }

        public S3IngestionConfiguration build() {
            return new S3IngestionConfiguration(this);
        } 

    } 

}
