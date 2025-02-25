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
 * {@link IngestProcessorConfiguration} extends {@link TeaModel}
 *
 * <p>IngestProcessorConfiguration</p>
 */
public class IngestProcessorConfiguration extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("parseFail")
    private String parseFail;

    @com.aliyun.core.annotation.NameInMap("spl")
    @com.aliyun.core.annotation.Validation(required = true)
    private String spl;

    private IngestProcessorConfiguration(Builder builder) {
        this.parseFail = builder.parseFail;
        this.spl = builder.spl;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static IngestProcessorConfiguration create() {
        return builder().build();
    }

    /**
     * @return parseFail
     */
    public String getParseFail() {
        return this.parseFail;
    }

    /**
     * @return spl
     */
    public String getSpl() {
        return this.spl;
    }

    public static final class Builder {
        private String parseFail; 
        private String spl; 

        /**
         * parseFail.
         */
        public Builder parseFail(String parseFail) {
            this.parseFail = parseFail;
            return this;
        }

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

        public IngestProcessorConfiguration build() {
            return new IngestProcessorConfiguration(this);
        } 

    } 

}
