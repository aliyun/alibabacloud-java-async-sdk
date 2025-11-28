// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gpdb20160503.models;

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
 * {@link ListSupportModelsResponseBody} extends {@link TeaModel}
 *
 * <p>ListSupportModelsResponseBody</p>
 */
public class ListSupportModelsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ModelNames")
    private ModelNames modelNames;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListSupportModelsResponseBody(Builder builder) {
        this.modelNames = builder.modelNames;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListSupportModelsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return modelNames
     */
    public ModelNames getModelNames() {
        return this.modelNames;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private ModelNames modelNames; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ListSupportModelsResponseBody model) {
            this.modelNames = model.modelNames;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The list of supported model names.</p>
         */
        public Builder modelNames(ModelNames modelNames) {
            this.modelNames = modelNames;
            return this;
        }

        /**
         * <p>The unique ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>ABB39CC3-4488-4857-905D-2E4A051D0521</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListSupportModelsResponseBody build() {
            return new ListSupportModelsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListSupportModelsResponseBody} extends {@link TeaModel}
     *
     * <p>ListSupportModelsResponseBody</p>
     */
    public static class ModelNames extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("modelNames")
        private java.util.List<String> modelNames;

        private ModelNames(Builder builder) {
            this.modelNames = builder.modelNames;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ModelNames create() {
            return builder().build();
        }

        /**
         * @return modelNames
         */
        public java.util.List<String> getModelNames() {
            return this.modelNames;
        }

        public static final class Builder {
            private java.util.List<String> modelNames; 

            private Builder() {
            } 

            private Builder(ModelNames model) {
                this.modelNames = model.modelNames;
            } 

            /**
             * modelNames.
             */
            public Builder modelNames(java.util.List<String> modelNames) {
                this.modelNames = modelNames;
                return this;
            }

            public ModelNames build() {
                return new ModelNames(this);
            } 

        } 

    }
}
