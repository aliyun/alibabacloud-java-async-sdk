// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oss20190517.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.oss.models.*;

/**
 * {@link CSVOutput} extends {@link TeaModel}
 *
 * <p>CSVOutput</p>
 */
public class CSVOutput extends TeaModel {
    @NameInMap("FieldDelimiter")
    private String fieldDelimiter;

    @NameInMap("RecordDelimiter")
    private String recordDelimiter;

    private CSVOutput(Builder builder) {
        this.fieldDelimiter = builder.fieldDelimiter;
        this.recordDelimiter = builder.recordDelimiter;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CSVOutput create() {
        return builder().build();
    }

    /**
     * @return fieldDelimiter
     */
    public String getFieldDelimiter() {
        return this.fieldDelimiter;
    }

    /**
     * @return recordDelimiter
     */
    public String getRecordDelimiter() {
        return this.recordDelimiter;
    }

    public static final class Builder {
        private String fieldDelimiter; 
        private String recordDelimiter; 

        /**
         * description
         */
        public Builder fieldDelimiter(String fieldDelimiter) {
            this.fieldDelimiter = fieldDelimiter;
            return this;
        }

        /**
         * description
         */
        public Builder recordDelimiter(String recordDelimiter) {
            this.recordDelimiter = recordDelimiter;
            return this;
        }

        public CSVOutput build() {
            return new CSVOutput(this);
        } 

    } 

}
