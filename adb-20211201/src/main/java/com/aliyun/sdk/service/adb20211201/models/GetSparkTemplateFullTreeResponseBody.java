// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20211201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetSparkTemplateFullTreeResponseBody} extends {@link TeaModel}
 *
 * <p>GetSparkTemplateFullTreeResponseBody</p>
 */
public class GetSparkTemplateFullTreeResponseBody extends TeaModel {
    @NameInMap("Data")
    private String data;

    @NameInMap("RequestId")
    private String requestId;

    private GetSparkTemplateFullTreeResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetSparkTemplateFullTreeResponseBody create() {
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
         * The directory structure of the application template. Fields in the response parameter:
         * <p>
         * 
         * *   **Uid**: the UID of the Alibaba Cloud account.
         * 
         * *   **Type**: the type of the application template. Valid values:
         * 
         *     *   **FOLDER**: directory
         *     *   **FILE**: application
         * 
         * *   **Parent**: the parent directory. Valid values:
         * 
         *     *   **0**: No child directory exists.
         *     *   **-1**: A child directory exists.
         * 
         * *   **Children**: the child directory.
         * 
         * *   **LastModified**: the time when the application is last modified. The time is displayed in the UNIX timestamp format. Unit: seconds.
         * 
         * *   **AppType**: the application type. Valid values:
         * 
         *     *   **SQL**: SQL application
         *     *   **STREAMING**: streaming application
         *     *   **BATCH**: batch application
         * 
         * *   **Name**: the name of the directory or application.
         * 
         * *   **Id**: the ID of the directory or application.
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

        public GetSparkTemplateFullTreeResponseBody build() {
            return new GetSparkTemplateFullTreeResponseBody(this);
        } 

    } 

}
