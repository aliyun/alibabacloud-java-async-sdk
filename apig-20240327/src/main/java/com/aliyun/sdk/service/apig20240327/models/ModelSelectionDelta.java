// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.apig20240327.models;

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
 * {@link ModelSelectionDelta} extends {@link TeaModel}
 *
 * <p>ModelSelectionDelta</p>
 */
public class ModelSelectionDelta extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("addModelCardIds")
    private java.util.List<String> addModelCardIds;

    @com.aliyun.core.annotation.NameInMap("removeModelCardIds")
    private java.util.List<String> removeModelCardIds;

    private ModelSelectionDelta(Builder builder) {
        this.addModelCardIds = builder.addModelCardIds;
        this.removeModelCardIds = builder.removeModelCardIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModelSelectionDelta create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return addModelCardIds
     */
    public java.util.List<String> getAddModelCardIds() {
        return this.addModelCardIds;
    }

    /**
     * @return removeModelCardIds
     */
    public java.util.List<String> getRemoveModelCardIds() {
        return this.removeModelCardIds;
    }

    public static final class Builder {
        private java.util.List<String> addModelCardIds; 
        private java.util.List<String> removeModelCardIds; 

        private Builder() {
        } 

        private Builder(ModelSelectionDelta model) {
            this.addModelCardIds = model.addModelCardIds;
            this.removeModelCardIds = model.removeModelCardIds;
        } 

        /**
         * <p>The actual source model IDs to add to the unique ModelAPI. Already selected IDs must not be added again.</p>
         */
        public Builder addModelCardIds(java.util.List<String> addModelCardIds) {
            this.addModelCardIds = addModelCardIds;
            return this;
        }

        /**
         * <p>The actual source model IDs to remove from the unique ModelAPI. This operation does not delete models in the source. You cannot clear the API or remove backup models that are still referenced by other entry points.</p>
         */
        public Builder removeModelCardIds(java.util.List<String> removeModelCardIds) {
            this.removeModelCardIds = removeModelCardIds;
            return this;
        }

        public ModelSelectionDelta build() {
            return new ModelSelectionDelta(this);
        } 

    } 

}
