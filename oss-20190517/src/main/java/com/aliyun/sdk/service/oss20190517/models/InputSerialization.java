// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oss20190517.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.oss.models.*;

/**
 * {@link InputSerialization} extends {@link TeaModel}
 *
 * <p>InputSerialization</p>
 */
public class InputSerialization extends TeaModel {
    @NameInMap("CSV")
    private CSVInput csv;

    @NameInMap("CompressionType")
    private String compressionType;

    @NameInMap("JSON")
    private JSONInput json;

    private InputSerialization(Builder builder) {
        this.csv = builder.csv;
        this.compressionType = builder.compressionType;
        this.json = builder.json;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static InputSerialization create() {
        return builder().build();
    }

    /**
     * @return csv
     */
    public CSVInput getCsv() {
        return this.csv;
    }

    /**
     * @return compressionType
     */
    public String getCompressionType() {
        return this.compressionType;
    }

    /**
     * @return json
     */
    public JSONInput getJson() {
        return this.json;
    }

    public static final class Builder {
        private CSVInput csv; 
        private String compressionType; 
        private JSONInput json; 

        /**
         * CSV.
         */
        public Builder csv(CSVInput csv) {
            this.csv = csv;
            return this;
        }

        /**
         * CompressionType.
         */
        public Builder compressionType(String compressionType) {
            this.compressionType = compressionType;
            return this;
        }

        /**
         * CompressionType.
         */
        public Builder compressionType(CompressionType compressionType) {
            this.compressionType = compressionType.getValue();
            return this;
        }

        /**
         * JSON.
         */
        public Builder json(JSONInput json) {
            this.json = json;
            return this;
        }

        public InputSerialization build() {
            return new InputSerialization(this);
        } 

    } 

}
