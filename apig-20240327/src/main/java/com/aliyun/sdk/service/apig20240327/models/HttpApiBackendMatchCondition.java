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
 * {@link HttpApiBackendMatchCondition} extends {@link TeaModel}
 *
 * <p>HttpApiBackendMatchCondition</p>
 */
public class HttpApiBackendMatchCondition extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("key")
    private String key;

    @com.aliyun.core.annotation.NameInMap("operator")
    private String operator;

    @com.aliyun.core.annotation.NameInMap("type")
    private String type;

    @com.aliyun.core.annotation.NameInMap("value")
    private String value;

    private HttpApiBackendMatchCondition(Builder builder) {
        this.key = builder.key;
        this.operator = builder.operator;
        this.type = builder.type;
        this.value = builder.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static HttpApiBackendMatchCondition create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return key
     */
    public String getKey() {
        return this.key;
    }

    /**
     * @return operator
     */
    public String getOperator() {
        return this.operator;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    /**
     * @return value
     */
    public String getValue() {
        return this.value;
    }

    public static final class Builder {
        private String key; 
        private String operator; 
        private String type; 
        private String value; 

        private Builder() {
        } 

        private Builder(HttpApiBackendMatchCondition model) {
            this.key = model.key;
            this.operator = model.operator;
            this.type = model.type;
            this.value = model.value;
        } 

        /**
         * <p>The key of the matching condition.</p>
         * 
         * <strong>example:</strong>
         * <p>color</p>
         */
        public Builder key(String key) {
            this.key = key;
            return this;
        }

        /**
         * <p>The operator. Exact match, prefix match, and regular expressions are supported.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>equal</li>
         * <li>regex</li>
         * <li>prefix</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>equal</p>
         */
        public Builder operator(String operator) {
            this.operator = operator;
            return this;
        }

        /**
         * <p>The match type. Query and Header parameters can be matched.</p>
         * 
         * <strong>example:</strong>
         * <p>Query</p>
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        /**
         * <p>The value of the matching condition.</p>
         * 
         * <strong>example:</strong>
         * <p>gray</p>
         */
        public Builder value(String value) {
            this.value = value;
            return this;
        }

        public HttpApiBackendMatchCondition build() {
            return new HttpApiBackendMatchCondition(this);
        } 

    } 

}
