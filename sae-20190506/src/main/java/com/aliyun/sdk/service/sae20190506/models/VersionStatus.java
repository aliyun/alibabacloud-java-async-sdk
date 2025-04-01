// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sae20190506.models;

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
 * {@link VersionStatus} extends {@link TeaModel}
 *
 * <p>VersionStatus</p>
 */
public class VersionStatus extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("errorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("status")
    private String status;

    private VersionStatus(Builder builder) {
        this.errorMessage = builder.errorMessage;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static VersionStatus create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return errorMessage
     */
    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder {
        private String errorMessage; 
        private String status; 

        private Builder() {
        } 

        private Builder(VersionStatus model) {
            this.errorMessage = model.errorMessage;
            this.status = model.status;
        } 

        /**
         * errorMessage.
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * status.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        public VersionStatus build() {
            return new VersionStatus(this);
        } 

    } 

}
