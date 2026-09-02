// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eventbridge20200401.models;

import com.aliyun.sdk.gateway.eventbridge.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.eventbridge.models.*;

/**
 * 
 * {@link AgentDataSemanticsExampleParameter} extends {@link TeaModel}
 *
 * <p>AgentDataSemanticsExampleParameter</p>
 */
public class AgentDataSemanticsExampleParameter extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DataType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String dataType;

    @com.aliyun.core.annotation.NameInMap("Description")
    @com.aliyun.core.annotation.Validation(maxLength = 128)
    private String description;

    @com.aliyun.core.annotation.NameInMap("Name")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 64)
    private String name;

    @com.aliyun.core.annotation.NameInMap("Value")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 64)
    private String value;

    private AgentDataSemanticsExampleParameter(Builder builder) {
        this.dataType = builder.dataType;
        this.description = builder.description;
        this.name = builder.name;
        this.value = builder.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AgentDataSemanticsExampleParameter create() {
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
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return value
     */
    public String getValue() {
        return this.value;
    }

    public static final class Builder {
        private String dataType; 
        private String description; 
        private String name; 
        private String value; 

        private Builder() {
        } 

        private Builder(AgentDataSemanticsExampleParameter model) {
            this.dataType = model.dataType;
            this.description = model.description;
            this.name = model.name;
            this.value = model.value;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>date</p>
         */
        public Builder dataType(String dataType) {
            this.dataType = dataType;
            return this;
        }

        /**
         * Description.
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>start_date</p>
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-01-01</p>
         */
        public Builder value(String value) {
            this.value = value;
            return this;
        }

        public AgentDataSemanticsExampleParameter build() {
            return new AgentDataSemanticsExampleParameter(this);
        } 

    } 

}
