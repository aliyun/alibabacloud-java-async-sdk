// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.green20170823.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ImportKeywordsResponseBody} extends {@link TeaModel}
 *
 * <p>ImportKeywordsResponseBody</p>
 */
public class ImportKeywordsResponseBody extends TeaModel {
    @NameInMap("InvalidKeywordList")
    private java.util.List < String > invalidKeywordList;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("SuccessCount")
    private Integer successCount;

    @NameInMap("validKeywordList")
    private java.util.List < String > validKeywordList;

    private ImportKeywordsResponseBody(Builder builder) {
        this.invalidKeywordList = builder.invalidKeywordList;
        this.requestId = builder.requestId;
        this.successCount = builder.successCount;
        this.validKeywordList = builder.validKeywordList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ImportKeywordsResponseBody create() {
        return builder().build();
    }

    /**
     * @return invalidKeywordList
     */
    public java.util.List < String > getInvalidKeywordList() {
        return this.invalidKeywordList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return successCount
     */
    public Integer getSuccessCount() {
        return this.successCount;
    }

    /**
     * @return validKeywordList
     */
    public java.util.List < String > getValidKeywordList() {
        return this.validKeywordList;
    }

    public static final class Builder {
        private java.util.List < String > invalidKeywordList; 
        private String requestId; 
        private Integer successCount; 
        private java.util.List < String > validKeywordList; 

        /**
         * InvalidKeywordList.
         */
        public Builder invalidKeywordList(java.util.List < String > invalidKeywordList) {
            this.invalidKeywordList = invalidKeywordList;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * SuccessCount.
         */
        public Builder successCount(Integer successCount) {
            this.successCount = successCount;
            return this;
        }

        /**
         * validKeywordList.
         */
        public Builder validKeywordList(java.util.List < String > validKeywordList) {
            this.validKeywordList = validKeywordList;
            return this;
        }

        public ImportKeywordsResponseBody build() {
            return new ImportKeywordsResponseBody(this);
        } 

    } 

}
