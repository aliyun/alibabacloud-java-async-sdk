// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetUploadTaskResponseBody} extends {@link TeaModel}
 *
 * <p>GetUploadTaskResponseBody</p>
 */
public class GetUploadTaskResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    private GetUploadTaskResponseBody(Builder builder) {
        this.description = builder.description;
        this.requestId = builder.requestId;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetUploadTaskResponseBody create() {
        return builder().build();
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder {
        private String description; 
        private String requestId; 
        private String status; 

        /**
         * <p>The error message returned when the file upload task failed.</p>
         * 
         * <strong>example:</strong>
         * <p>invalid url</p>
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ET5BF670-09D5-4D0B-BEBY-D96A2A52****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The task status.</p>
         * <ul>
         * <li><strong>INIT</strong>: The task is being initialized.</li>
         * <li><strong>activacted</strong>: The task is activated.</li>
         * <li><strong>running</strong>: The task is running.</li>
         * <li><strong>success</strong>: The task is successful.</li>
         * <li><strong>partial</strong>: The task is partially successful.</li>
         * <li><strong>fail</strong>: The task failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>running</p>
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        public GetUploadTaskResponseBody build() {
            return new GetUploadTaskResponseBody(this);
        } 

    } 

}
