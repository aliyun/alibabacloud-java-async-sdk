// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20211201.models;

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
 * {@link ListSparkTemplateFileIdsResponseBody} extends {@link TeaModel}
 *
 * <p>ListSparkTemplateFileIdsResponseBody</p>
 */
public class ListSparkTemplateFileIdsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List<Long> data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListSparkTemplateFileIdsResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListSparkTemplateFileIdsResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public java.util.List<Long> getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<Long> data; 
        private String requestId; 

        /**
         * <p>The IDs of Spark template files.</p>
         */
        public Builder data(java.util.List<Long> data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1AD222E9-E606-4A42-BF6D-8A4442913CEF</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListSparkTemplateFileIdsResponseBody build() {
            return new ListSparkTemplateFileIdsResponseBody(this);
        } 

    } 

}
