// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20211201.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetSparkTemplateFolderTreeResponseBody} extends {@link TeaModel}
 *
 * <p>GetSparkTemplateFolderTreeResponseBody</p>
 */
public class GetSparkTemplateFolderTreeResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private String data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetSparkTemplateFolderTreeResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetSparkTemplateFolderTreeResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public String getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String data; 
        private String requestId; 

        /**
         * The directory structure of Spark applications, which is in the tree format. Fields in the response parameter:
         * <p>
         * 
         * *   **Uid**: the UID of the Alibaba Cloud account.
         * 
         * *   **Type**: the application template type. Valid values: **FOLDER**
         * 
         * *   **Parent**: indicates whether a child directory exists. Valid values:
         * 
         *     *   **0**: no.
         *     *   **-1**: yes.
         * 
         * *   **Children**: the child directory.
         * 
         * *   **LastModified**: the time when applications in the directory are last modified. This value is a UNIX timestamp representing the number of seconds that have elapsed since January 1, 1970, 00:00:00 UTC.
         * 
         * *   **Name**: the name of the directory.
         * 
         * *   **Id**: the directory ID.
         */
        public Builder data(String data) {
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

        public GetSparkTemplateFolderTreeResponseBody build() {
            return new GetSparkTemplateFolderTreeResponseBody(this);
        } 

    } 

}
