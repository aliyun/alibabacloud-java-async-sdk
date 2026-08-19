// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pai_dlc20201203.models;

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
 * {@link TokenSettings} extends {@link TeaModel}
 *
 * <p>TokenSettings</p>
 */
public class TokenSettings extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("EnableCrossAccountAccess")
    private Boolean enableCrossAccountAccess;

    @com.aliyun.core.annotation.NameInMap("EnableLogDownloadJob")
    private Boolean enableLogDownloadJob;

    private TokenSettings(Builder builder) {
        this.enableCrossAccountAccess = builder.enableCrossAccountAccess;
        this.enableLogDownloadJob = builder.enableLogDownloadJob;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static TokenSettings create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return enableCrossAccountAccess
     */
    public Boolean getEnableCrossAccountAccess() {
        return this.enableCrossAccountAccess;
    }

    /**
     * @return enableLogDownloadJob
     */
    public Boolean getEnableLogDownloadJob() {
        return this.enableLogDownloadJob;
    }

    public static final class Builder {
        private Boolean enableCrossAccountAccess; 
        private Boolean enableLogDownloadJob; 

        private Builder() {
        } 

        private Builder(TokenSettings model) {
            this.enableCrossAccountAccess = model.enableCrossAccountAccess;
            this.enableLogDownloadJob = model.enableLogDownloadJob;
        } 

        /**
         * EnableCrossAccountAccess.
         */
        public Builder enableCrossAccountAccess(Boolean enableCrossAccountAccess) {
            this.enableCrossAccountAccess = enableCrossAccountAccess;
            return this;
        }

        /**
         * EnableLogDownloadJob.
         */
        public Builder enableLogDownloadJob(Boolean enableLogDownloadJob) {
            this.enableLogDownloadJob = enableLogDownloadJob;
            return this;
        }

        public TokenSettings build() {
            return new TokenSettings(this);
        } 

    } 

}
