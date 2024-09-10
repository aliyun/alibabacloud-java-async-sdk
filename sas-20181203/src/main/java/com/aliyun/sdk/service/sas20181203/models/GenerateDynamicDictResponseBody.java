// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GenerateDynamicDictResponseBody} extends {@link TeaModel}
 *
 * <p>GenerateDynamicDictResponseBody</p>
 */
public class GenerateDynamicDictResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("KeywordList")
    private java.util.List < String > keywordList;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GenerateDynamicDictResponseBody(Builder builder) {
        this.keywordList = builder.keywordList;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GenerateDynamicDictResponseBody create() {
        return builder().build();
    }

    /**
     * @return keywordList
     */
    public java.util.List < String > getKeywordList() {
        return this.keywordList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < String > keywordList; 
        private String requestId; 

        /**
         * The custom weak passwords.
         */
        public Builder keywordList(java.util.List < String > keywordList) {
            this.keywordList = keywordList;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GenerateDynamicDictResponseBody build() {
            return new GenerateDynamicDictResponseBody(this);
        } 

    } 

}
