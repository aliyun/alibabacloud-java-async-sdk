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
 * {@link ModifyModelApiResponseBody} extends {@link TeaModel}
 *
 * <p>ModifyModelApiResponseBody</p>
 */
public class ModifyModelApiResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ModelApiId")
    private String modelApiId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ModifyModelApiResponseBody(Builder builder) {
        this.modelApiId = builder.modelApiId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyModelApiResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return modelApiId
     */
    public String getModelApiId() {
        return this.modelApiId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String modelApiId; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ModifyModelApiResponseBody model) {
            this.modelApiId = model.modelApiId;
            this.requestId = model.requestId;
        } 

        /**
         * ModelApiId.
         */
        public Builder modelApiId(String modelApiId) {
            this.modelApiId = modelApiId;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>925B84D9-CA72-432C-95CF-738C22******</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ModifyModelApiResponseBody build() {
            return new ModifyModelApiResponseBody(this);
        } 

    } 

}
