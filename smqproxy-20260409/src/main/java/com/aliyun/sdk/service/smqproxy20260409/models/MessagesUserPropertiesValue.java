// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.smqproxy20260409.models;

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
 * {@link MessagesUserPropertiesValue} extends {@link TeaModel}
 *
 * <p>MessagesUserPropertiesValue</p>
 */
public class MessagesUserPropertiesValue extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DataType")
    private String dataType;

    @com.aliyun.core.annotation.NameInMap("StringValue")
    private String stringValue;

    @com.aliyun.core.annotation.NameInMap("BinaryValue")
    private String binaryValue;

    private MessagesUserPropertiesValue(Builder builder) {
        this.dataType = builder.dataType;
        this.stringValue = builder.stringValue;
        this.binaryValue = builder.binaryValue;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static MessagesUserPropertiesValue create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dataType
     */
    public String getDataType() {
        return this.dataType;
    }

    /**
     * @return stringValue
     */
    public String getStringValue() {
        return this.stringValue;
    }

    /**
     * @return binaryValue
     */
    public String getBinaryValue() {
        return this.binaryValue;
    }

    public static final class Builder {
        private String dataType; 
        private String stringValue; 
        private String binaryValue; 

        private Builder() {
        } 

        private Builder(MessagesUserPropertiesValue model) {
            this.dataType = model.dataType;
            this.stringValue = model.stringValue;
            this.binaryValue = model.binaryValue;
        } 

        /**
         * DataType.
         */
        public Builder dataType(String dataType) {
            this.dataType = dataType;
            return this;
        }

        /**
         * StringValue.
         */
        public Builder stringValue(String stringValue) {
            this.stringValue = stringValue;
            return this;
        }

        /**
         * BinaryValue.
         */
        public Builder binaryValue(String binaryValue) {
            this.binaryValue = binaryValue;
            return this;
        }

        public MessagesUserPropertiesValue build() {
            return new MessagesUserPropertiesValue(this);
        } 

    } 

}
