// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oss20190517.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.oss.models.*;

/**
 * {@link OutputSerialization} extends {@link TeaModel}
 *
 * <p>OutputSerialization</p>
 */
public class OutputSerialization extends TeaModel {
    @NameInMap("CSV")
    private CSVOutput csv;

    @NameInMap("EnablePayloadCrc")
    private Boolean enablePayloadCrc;

    @NameInMap("JSON")
    private JSONOutput json;

    @NameInMap("KeepAllColumns")
    private Boolean keepAllColumns;

    @NameInMap("OutputHeader")
    private Boolean outputHeader;

    @NameInMap("OutputRawData")
    private Boolean outputRawData;

    private OutputSerialization(Builder builder) {
        this.csv = builder.csv;
        this.enablePayloadCrc = builder.enablePayloadCrc;
        this.json = builder.json;
        this.keepAllColumns = builder.keepAllColumns;
        this.outputHeader = builder.outputHeader;
        this.outputRawData = builder.outputRawData;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static OutputSerialization create() {
        return builder().build();
    }

    /**
     * @return csv
     */
    public CSVOutput getCsv() {
        return this.csv;
    }

    /**
     * @return enablePayloadCrc
     */
    public Boolean getEnablePayloadCrc() {
        return this.enablePayloadCrc;
    }

    /**
     * @return json
     */
    public JSONOutput getJson() {
        return this.json;
    }

    /**
     * @return keepAllColumns
     */
    public Boolean getKeepAllColumns() {
        return this.keepAllColumns;
    }

    /**
     * @return outputHeader
     */
    public Boolean getOutputHeader() {
        return this.outputHeader;
    }

    /**
     * @return outputRawData
     */
    public Boolean getOutputRawData() {
        return this.outputRawData;
    }

    public static final class Builder {
        private CSVOutput csv; 
        private Boolean enablePayloadCrc; 
        private JSONOutput json; 
        private Boolean keepAllColumns; 
        private Boolean outputHeader; 
        private Boolean outputRawData; 

        /**
         * CSV.
         */
        public Builder csv(CSVOutput csv) {
            this.csv = csv;
            return this;
        }

        /**
         * description
         */
        public Builder enablePayloadCrc(Boolean enablePayloadCrc) {
            this.enablePayloadCrc = enablePayloadCrc;
            return this;
        }

        /**
         * JSON.
         */
        public Builder json(JSONOutput json) {
            this.json = json;
            return this;
        }

        /**
         * description
         */
        public Builder keepAllColumns(Boolean keepAllColumns) {
            this.keepAllColumns = keepAllColumns;
            return this;
        }

        /**
         * description
         */
        public Builder outputHeader(Boolean outputHeader) {
            this.outputHeader = outputHeader;
            return this;
        }

        /**
         * description
         */
        public Builder outputRawData(Boolean outputRawData) {
            this.outputRawData = outputRawData;
            return this;
        }

        public OutputSerialization build() {
            return new OutputSerialization(this);
        } 

    } 

}
