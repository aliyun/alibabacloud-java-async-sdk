// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20211201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetSparkTemplateFolderTreeResponseBody} extends {@link TeaModel}
 *
 * <p>GetSparkTemplateFolderTreeResponseBody</p>
 */
public class GetSparkTemplateFolderTreeResponseBody extends TeaModel {
    @NameInMap("Data")
    private String data;

    @NameInMap("RequestId")
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
         * *   **Type**: the type of the application template. Valid values: **FOLDER**: directory.
         * 
         * *   **Parent**: indicates whether a child directory exists. Valid values:
         * 
         *     *   **0**: No child directory exists.
         *     *   **-1**: A child directory exists.
         * 
         * *   **Children**: the child directory.
         * 
         * *   **LastModified**: the time when applications in the directory are last modified. The time is displayed in the UNIX timestamp format. Unit: seconds.
         * 
         * *   **Name**: the name of the directory.
         * 
         * *   **Id**: the ID of the directory.
         */
        public Builder data(String data) {
            this.data = data;
            return this;
        }

        /**
         * The ID of the request.
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
