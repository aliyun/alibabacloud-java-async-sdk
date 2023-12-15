// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.baas20180731.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CheckPointStructBody} extends {@link TeaModel}
 *
 * <p>CheckPointStructBody</p>
 */
public class CheckPointStructBody extends TeaModel {
    @NameInMap("ErrorCount")
    private String errorCount;

    @NameInMap("Height")
    private String height;

    @NameInMap("Index")
    private String index;

    @NameInMap("LastError")
    private String lastError;

    @NameInMap("TotalCount")
    private String totalCount;

    @NameInMap("Type")
    private String type;

    private CheckPointStructBody(Builder builder) {
        this.errorCount = builder.errorCount;
        this.height = builder.height;
        this.index = builder.index;
        this.lastError = builder.lastError;
        this.totalCount = builder.totalCount;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CheckPointStructBody create() {
        return builder().build();
    }

    /**
     * @return errorCount
     */
    public String getErrorCount() {
        return this.errorCount;
    }

    /**
     * @return height
     */
    public String getHeight() {
        return this.height;
    }

    /**
     * @return index
     */
    public String getIndex() {
        return this.index;
    }

    /**
     * @return lastError
     */
    public String getLastError() {
        return this.lastError;
    }

    /**
     * @return totalCount
     */
    public String getTotalCount() {
        return this.totalCount;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder {
        private String errorCount; 
        private String height; 
        private String index; 
        private String lastError; 
        private String totalCount; 
        private String type; 

        /**
         * ErrorCount.
         */
        public Builder errorCount(String errorCount) {
            this.errorCount = errorCount;
            return this;
        }

        /**
         * Height.
         */
        public Builder height(String height) {
            this.height = height;
            return this;
        }

        /**
         * Index.
         */
        public Builder index(String index) {
            this.index = index;
            return this;
        }

        /**
         * LastError.
         */
        public Builder lastError(String lastError) {
            this.lastError = lastError;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(String totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * Type.
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        public CheckPointStructBody build() {
            return new CheckPointStructBody(this);
        } 

    } 

}
