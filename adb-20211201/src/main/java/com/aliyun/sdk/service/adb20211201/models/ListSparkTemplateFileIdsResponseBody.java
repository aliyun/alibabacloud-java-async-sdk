// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20211201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListSparkTemplateFileIdsResponseBody} extends {@link TeaModel}
 *
 * <p>ListSparkTemplateFileIdsResponseBody</p>
 */
public class ListSparkTemplateFileIdsResponseBody extends TeaModel {
    @NameInMap("Data")
    private java.util.List < Long > data;

    @NameInMap("RequestId")
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
    public java.util.List < Long > getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < Long > data; 
        private String requestId; 

        /**
         * The IDs of Spark template files.
         */
        public Builder data(java.util.List < Long > data) {
            this.data = data;
            return this;
        }

        /**
         * The request ID.
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
