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
 * {@link HandleSimilarMaliciousFilesResponseBody} extends {@link TeaModel}
 *
 * <p>HandleSimilarMaliciousFilesResponseBody</p>
 */
public class HandleSimilarMaliciousFilesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Long data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private HandleSimilarMaliciousFilesResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static HandleSimilarMaliciousFilesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public Long getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Long data; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(HandleSimilarMaliciousFilesResponseBody model) {
            this.data = model.data;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The number of alerts that are batch processed.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder data(Long data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The ID of the request. The China value is a unique identifier that Alibaba Cloud generates for the request and can be used to troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>8C376***AE74FB4</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public HandleSimilarMaliciousFilesResponseBody build() {
            return new HandleSimilarMaliciousFilesResponseBody(this);
        } 

    } 

}
