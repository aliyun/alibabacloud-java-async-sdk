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
 * {@link ConsumeProcessorConfiguration} extends {@link TeaModel}
 *
 * <p>ConsumeProcessorConfiguration</p>
 */
public class ConsumeProcessorConfiguration extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("spl")
    @com.aliyun.core.annotation.Validation(required = true)
    private String spl;

    private ConsumeProcessorConfiguration(Builder builder) {
        this.spl = builder.spl;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ConsumeProcessorConfiguration create() {
        return builder().build();
    }

    /**
     * @return spl
     */
    public String getSpl() {
        return this.spl;
    }

    public static final class Builder {
        private String spl; 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <ul>
         * <li>| project content</li>
         * </ul>
         */
        public Builder spl(String spl) {
            this.spl = spl;
            return this;
        }

        public ConsumeProcessorConfiguration build() {
            return new ConsumeProcessorConfiguration(this);
        } 

    } 

}
