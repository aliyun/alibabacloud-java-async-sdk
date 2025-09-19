// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GenerateDynamicDictResponseBody} extends {@link TeaModel}
 *
 * <p>GenerateDynamicDictResponseBody</p>
 */
public class GenerateDynamicDictResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("KeywordList")
    private java.util.List<String> keywordList;

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

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return keywordList
     */
    public java.util.List<String> getKeywordList() {
        return this.keywordList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<String> keywordList; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GenerateDynamicDictResponseBody model) {
            this.keywordList = model.keywordList;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The custom weak passwords.</p>
         */
        public Builder keywordList(java.util.List<String> keywordList) {
            this.keywordList = keywordList;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>00E9B912-6066-5E4E-9F24-35EA09F2****</p>
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
