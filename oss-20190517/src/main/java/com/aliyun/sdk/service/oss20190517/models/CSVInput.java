// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oss20190517.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.oss.models.*;

/**
 * {@link CSVInput} extends {@link TeaModel}
 *
 * <p>CSVInput</p>
 */
public class CSVInput extends TeaModel {
    @NameInMap("AllowQuotedRecordDelimiter")
    private Boolean allowQuotedRecordDelimiter;

    @NameInMap("CommentCharacter")
    private String commentCharacter;

    @NameInMap("FieldDelimiter")
    private String fieldDelimiter;

    @NameInMap("FileHeaderInfo")
    private String fileHeaderInfo;

    @NameInMap("QuoteCharacter")
    private String quoteCharacter;

    @NameInMap("Range")
    private String range;

    @NameInMap("RecordDelimiter")
    private String recordDelimiter;

    private CSVInput(Builder builder) {
        this.allowQuotedRecordDelimiter = builder.allowQuotedRecordDelimiter;
        this.commentCharacter = builder.commentCharacter;
        this.fieldDelimiter = builder.fieldDelimiter;
        this.fileHeaderInfo = builder.fileHeaderInfo;
        this.quoteCharacter = builder.quoteCharacter;
        this.range = builder.range;
        this.recordDelimiter = builder.recordDelimiter;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CSVInput create() {
        return builder().build();
    }

    /**
     * @return allowQuotedRecordDelimiter
     */
    public Boolean getAllowQuotedRecordDelimiter() {
        return this.allowQuotedRecordDelimiter;
    }

    /**
     * @return commentCharacter
     */
    public String getCommentCharacter() {
        return this.commentCharacter;
    }

    /**
     * @return fieldDelimiter
     */
    public String getFieldDelimiter() {
        return this.fieldDelimiter;
    }

    /**
     * @return fileHeaderInfo
     */
    public String getFileHeaderInfo() {
        return this.fileHeaderInfo;
    }

    /**
     * @return quoteCharacter
     */
    public String getQuoteCharacter() {
        return this.quoteCharacter;
    }

    /**
     * @return range
     */
    public String getRange() {
        return this.range;
    }

    /**
     * @return recordDelimiter
     */
    public String getRecordDelimiter() {
        return this.recordDelimiter;
    }

    public static final class Builder {
        private Boolean allowQuotedRecordDelimiter; 
        private String commentCharacter; 
        private String fieldDelimiter; 
        private String fileHeaderInfo; 
        private String quoteCharacter; 
        private String range; 
        private String recordDelimiter; 

        /**
         * description
         */
        public Builder allowQuotedRecordDelimiter(Boolean allowQuotedRecordDelimiter) {
            this.allowQuotedRecordDelimiter = allowQuotedRecordDelimiter;
            return this;
        }

        /**
         * description
         */
        public Builder commentCharacter(String commentCharacter) {
            this.commentCharacter = commentCharacter;
            return this;
        }

        /**
         * description
         */
        public Builder fieldDelimiter(String fieldDelimiter) {
            this.fieldDelimiter = fieldDelimiter;
            return this;
        }

        /**
         * FileHeaderInfo.
         */
        public Builder fileHeaderInfo(String fileHeaderInfo) {
            this.fileHeaderInfo = fileHeaderInfo;
            return this;
        }

        /**
         * FileHeaderInfo.
         */
        public Builder fileHeaderInfo(FileHeaderInfo fileHeaderInfo) {
            this.fileHeaderInfo = fileHeaderInfo.getValue();
            return this;
        }

        /**
         * description
         */
        public Builder quoteCharacter(String quoteCharacter) {
            this.quoteCharacter = quoteCharacter;
            return this;
        }

        /**
         * description
         */
        public Builder range(String range) {
            this.range = range;
            return this;
        }

        /**
         * description
         */
        public Builder recordDelimiter(String recordDelimiter) {
            this.recordDelimiter = recordDelimiter;
            return this;
        }

        public CSVInput build() {
            return new CSVInput(this);
        } 

    } 

}
