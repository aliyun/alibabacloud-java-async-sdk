// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

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
 * {@link ExportRecordsResponseBody} extends {@link TeaModel}
 *
 * <p>ExportRecordsResponseBody</p>
 */
public class ExportRecordsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Content")
    private String content;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ExportRecordsResponseBody(Builder builder) {
        this.content = builder.content;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ExportRecordsResponseBody create() {
        return builder().build();
    }

    /**
     * @return content
     */
    public String getContent() {
        return this.content;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String content; 
        private String requestId; 

        /**
         * <p>The exported DNS records.</p>
         * 
         * <strong>example:</strong>
         * <p>;; site:example.com.\n;; Exported:2024-01-24 15:54:35\n\n;; A Records\na1.example.com. 30 IN A 1.1.1.1 direct\na2.example.com. 30 IN A 1.1.1.1 direct\na3.example.com. 30 IN A 1.1.1.1 direct\n</p>
         */
        public Builder content(String content) {
            this.content = content;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>C69B5894-D1BA-592C-95D0-DADBE7AEAC63</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ExportRecordsResponseBody build() {
            return new ExportRecordsResponseBody(this);
        } 

    } 

}
