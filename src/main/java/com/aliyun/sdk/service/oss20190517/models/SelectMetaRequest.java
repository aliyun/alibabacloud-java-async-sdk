// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oss20190517.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.oss.models.*;

/**
 * {@link SelectMetaRequest} extends {@link RequestModel}
 *
 * <p>SelectMetaRequest</p>
 */
public class SelectMetaRequest extends Request {
    @NameInMap("InputSerialization")
    private InputSerialization inputSerialization;

    @NameInMap("OverwriteIfExists")
    private Boolean overwriteIfExists;

    private SelectMetaRequest(Builder builder) {
        super(builder);
        this.inputSerialization = builder.inputSerialization;
        this.overwriteIfExists = builder.overwriteIfExists;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SelectMetaRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return inputSerialization
     */
    public InputSerialization getInputSerialization() {
        return this.inputSerialization;
    }

    /**
     * @return overwriteIfExists
     */
    public Boolean getOverwriteIfExists() {
        return this.overwriteIfExists;
    }

    public static final class Builder extends Request.Builder<SelectMetaRequest, Builder> {
        private InputSerialization inputSerialization; 
        private Boolean overwriteIfExists; 

        private Builder() {
            super();
        } 

        private Builder(SelectMetaRequest request) {
            super(request);
            this.inputSerialization = request.inputSerialization;
            this.overwriteIfExists = request.overwriteIfExists;
        } 

        /**
         * InputSerialization.
         */
        public Builder inputSerialization(InputSerialization inputSerialization) {
            this.inputSerialization = inputSerialization;
            return this;
        }

        /**
         * description
         */
        public Builder overwriteIfExists(Boolean overwriteIfExists) {
            this.overwriteIfExists = overwriteIfExists;
            return this;
        }

        @Override
        public SelectMetaRequest build() {
            return new SelectMetaRequest(this);
        } 

    } 

}
