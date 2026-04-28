// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

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
 * {@link ModifyModelServiceResponseBody} extends {@link TeaModel}
 *
 * <p>ModifyModelServiceResponseBody</p>
 */
public class ModifyModelServiceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ModelServiceId")
    private String modelServiceId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    private ModifyModelServiceResponseBody(Builder builder) {
        this.modelServiceId = builder.modelServiceId;
        this.requestId = builder.requestId;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyModelServiceResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return modelServiceId
     */
    public String getModelServiceId() {
        return this.modelServiceId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder {
        private String modelServiceId; 
        private String requestId; 
        private String status; 

        private Builder() {
        } 

        private Builder(ModifyModelServiceResponseBody model) {
            this.modelServiceId = model.modelServiceId;
            this.requestId = model.requestId;
            this.status = model.status;
        } 

        /**
         * ModelServiceId.
         */
        public Builder modelServiceId(String modelServiceId) {
            this.modelServiceId = modelServiceId;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>6A2EE5B4-CC9F-46E1-A747-E43BC9******</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Status.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        public ModifyModelServiceResponseBody build() {
            return new ModifyModelServiceResponseBody(this);
        } 

    } 

}
