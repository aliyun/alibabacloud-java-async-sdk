// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paistudio20210202.models;

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
 * {@link UpdateExperimentContentResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateExperimentContentResponseBody</p>
 */
public class UpdateExperimentContentResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Version")
    private Long version;

    private UpdateExperimentContentResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.version = builder.version;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateExperimentContentResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return version
     */
    public Long getVersion() {
        return this.version;
    }

    public static final class Builder {
        private String requestId; 
        private Long version; 

        private Builder() {
        } 

        private Builder(UpdateExperimentContentResponseBody model) {
            this.requestId = model.requestId;
            this.version = model.version;
        } 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Version.
         */
        public Builder version(Long version) {
            this.version = version;
            return this;
        }

        public UpdateExperimentContentResponseBody build() {
            return new UpdateExperimentContentResponseBody(this);
        } 

    } 

}
