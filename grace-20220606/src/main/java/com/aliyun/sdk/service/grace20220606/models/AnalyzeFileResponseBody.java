// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.grace20220606.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AnalyzeFileResponseBody} extends {@link TeaModel}
 *
 * <p>AnalyzeFileResponseBody</p>
 */
public class AnalyzeFileResponseBody extends TeaModel {
    @NameInMap("fileName")
    private String fileName;

    @NameInMap("requestId")
    private String requestId;

    private AnalyzeFileResponseBody(Builder builder) {
        this.fileName = builder.fileName;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AnalyzeFileResponseBody create() {
        return builder().build();
    }

    /**
     * @return fileName
     */
    public String getFileName() {
        return this.fileName;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String fileName; 
        private String requestId; 

        /**
         * fileName.
         */
        public Builder fileName(String fileName) {
            this.fileName = fileName;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public AnalyzeFileResponseBody build() {
            return new AnalyzeFileResponseBody(this);
        } 

    } 

}
