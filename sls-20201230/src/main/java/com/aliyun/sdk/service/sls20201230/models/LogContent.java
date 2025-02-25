// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sls20201230.models;

import com.aliyun.sdk.gateway.sls.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.sls.models.*;

/**
 * 
 * {@link LogContent} extends {@link TeaModel}
 *
 * <p>LogContent</p>
 */
public class LogContent extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Key")
    @com.aliyun.core.annotation.Validation(required = true)
    private String key;

    @com.aliyun.core.annotation.NameInMap("Value")
    @com.aliyun.core.annotation.Validation(required = true)
    private String value;

    private LogContent(Builder builder) {
        this.key = builder.key;
        this.value = builder.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static LogContent create() {
        return builder().build();
    }

    /**
     * @return key
     */
    public String getKey() {
        return this.key;
    }

    /**
     * @return value
     */
    public String getValue() {
        return this.value;
    }

    public static final class Builder {
        private String key; 
        private String value; 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>key-test</p>
         */
        public Builder key(String key) {
            this.key = key;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>value-test</p>
         */
        public Builder value(String value) {
            this.value = value;
            return this;
        }

        public LogContent build() {
            return new LogContent(this);
        } 

    } 

}
