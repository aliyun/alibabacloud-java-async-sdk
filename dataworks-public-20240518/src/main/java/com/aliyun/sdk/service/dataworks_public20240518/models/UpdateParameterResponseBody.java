// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20240518.models;

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
 * {@link UpdateParameterResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateParameterResponseBody</p>
 */
public class UpdateParameterResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Version")
    private Integer version;

    private UpdateParameterResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.version = builder.version;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateParameterResponseBody create() {
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
    public Integer getVersion() {
        return this.version;
    }

    public static final class Builder {
        private String requestId; 
        private Integer version; 

        private Builder() {
        } 

        private Builder(UpdateParameterResponseBody model) {
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
        public Builder version(Integer version) {
            this.version = version;
            return this;
        }

        public UpdateParameterResponseBody build() {
            return new UpdateParameterResponseBody(this);
        } 

    } 

}
