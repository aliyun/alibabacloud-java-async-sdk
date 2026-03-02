// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.neuron20211115.models;

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
 * {@link UpdateLibrarySchemaResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateLibrarySchemaResponseBody</p>
 */
public class UpdateLibrarySchemaResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("result")
    private LibrarySchema result;

    private UpdateLibrarySchemaResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateLibrarySchemaResponseBody create() {
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
     * @return result
     */
    public LibrarySchema getResult() {
        return this.result;
    }

    public static final class Builder {
        private String requestId; 
        private LibrarySchema result; 

        private Builder() {
        } 

        private Builder(UpdateLibrarySchemaResponseBody model) {
            this.requestId = model.requestId;
            this.result = model.result;
        } 

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * result.
         */
        public Builder result(LibrarySchema result) {
            this.result = result;
            return this;
        }

        public UpdateLibrarySchemaResponseBody build() {
            return new UpdateLibrarySchemaResponseBody(this);
        } 

    } 

}
