// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.energyexpertexternal20220923.models;

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
 * {@link DetailDocumentResponseBody} extends {@link TeaModel}
 *
 * <p>DetailDocumentResponseBody</p>
 */
public class DetailDocumentResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("data")
    private DocumentDetailItem data;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private DetailDocumentResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DetailDocumentResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public DocumentDetailItem getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private DocumentDetailItem data; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DetailDocumentResponseBody model) {
            this.data = model.data;
            this.requestId = model.requestId;
        } 

        /**
         * data.
         */
        public Builder data(DocumentDetailItem data) {
            this.data = data;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>83A5A7DD-8974-5769-952E-590A97BEA34E</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DetailDocumentResponseBody build() {
            return new DetailDocumentResponseBody(this);
        } 

    } 

}
