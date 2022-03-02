// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oss20190517.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.oss.models.*;

/**
 * {@link SelectRequestOptions} extends {@link TeaModel}
 *
 * <p>SelectRequestOptions</p>
 */
public class SelectRequestOptions extends TeaModel {
    @NameInMap("MaxSkippedRecordsAllowed")
    private Long maxSkippedRecordsAllowed;

    @NameInMap("SkipPartialDataRecord")
    private Boolean skipPartialDataRecord;

    private SelectRequestOptions(Builder builder) {
        this.maxSkippedRecordsAllowed = builder.maxSkippedRecordsAllowed;
        this.skipPartialDataRecord = builder.skipPartialDataRecord;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SelectRequestOptions create() {
        return builder().build();
    }

    /**
     * @return maxSkippedRecordsAllowed
     */
    public Long getMaxSkippedRecordsAllowed() {
        return this.maxSkippedRecordsAllowed;
    }

    /**
     * @return skipPartialDataRecord
     */
    public Boolean getSkipPartialDataRecord() {
        return this.skipPartialDataRecord;
    }

    public static final class Builder {
        private Long maxSkippedRecordsAllowed; 
        private Boolean skipPartialDataRecord; 

        /**
         * description
         */
        public Builder maxSkippedRecordsAllowed(Long maxSkippedRecordsAllowed) {
            this.maxSkippedRecordsAllowed = maxSkippedRecordsAllowed;
            return this;
        }

        /**
         * description
         */
        public Builder skipPartialDataRecord(Boolean skipPartialDataRecord) {
            this.skipPartialDataRecord = skipPartialDataRecord;
            return this;
        }

        public SelectRequestOptions build() {
            return new SelectRequestOptions(this);
        } 

    } 

}
