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
 * {@link CostModelDetailRowDTO} extends {@link TeaModel}
 *
 * <p>CostModelDetailRowDTO</p>
 */
public class CostModelDetailRowDTO extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("timestamp")
    private Long timestamp;

    @com.aliyun.core.annotation.NameInMap("values")
    private String values;

    private CostModelDetailRowDTO(Builder builder) {
        this.timestamp = builder.timestamp;
        this.values = builder.values;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CostModelDetailRowDTO create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return timestamp
     */
    public Long getTimestamp() {
        return this.timestamp;
    }

    /**
     * @return values
     */
    public String getValues() {
        return this.values;
    }

    public static final class Builder {
        private Long timestamp; 
        private String values; 

        private Builder() {
        } 

        private Builder(CostModelDetailRowDTO model) {
            this.timestamp = model.timestamp;
            this.values = model.values;
        } 

        /**
         * timestamp.
         */
        public Builder timestamp(Long timestamp) {
            this.timestamp = timestamp;
            return this;
        }

        /**
         * values.
         */
        public Builder values(String values) {
            this.values = values;
            return this;
        }

        public CostModelDetailRowDTO build() {
            return new CostModelDetailRowDTO(this);
        } 

    } 

}
