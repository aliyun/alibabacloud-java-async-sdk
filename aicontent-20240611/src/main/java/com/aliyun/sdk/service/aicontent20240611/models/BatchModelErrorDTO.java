// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aicontent20240611.models;

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
 * {@link BatchModelErrorDTO} extends {@link TeaModel}
 *
 * <p>BatchModelErrorDTO</p>
 */
public class BatchModelErrorDTO extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("errorMsg")
    private String errorMsg;

    @com.aliyun.core.annotation.NameInMap("modelId")
    private String modelId;

    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    private BatchModelErrorDTO(Builder builder) {
        this.errorMsg = builder.errorMsg;
        this.modelId = builder.modelId;
        this.name = builder.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BatchModelErrorDTO create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return errorMsg
     */
    public String getErrorMsg() {
        return this.errorMsg;
    }

    /**
     * @return modelId
     */
    public String getModelId() {
        return this.modelId;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    public static final class Builder {
        private String errorMsg; 
        private String modelId; 
        private String name; 

        private Builder() {
        } 

        private Builder(BatchModelErrorDTO model) {
            this.errorMsg = model.errorMsg;
            this.modelId = model.modelId;
            this.name = model.name;
        } 

        /**
         * errorMsg.
         */
        public Builder errorMsg(String errorMsg) {
            this.errorMsg = errorMsg;
            return this;
        }

        /**
         * modelId.
         */
        public Builder modelId(String modelId) {
            this.modelId = modelId;
            return this;
        }

        /**
         * name.
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public BatchModelErrorDTO build() {
            return new BatchModelErrorDTO(this);
        } 

    } 

}
