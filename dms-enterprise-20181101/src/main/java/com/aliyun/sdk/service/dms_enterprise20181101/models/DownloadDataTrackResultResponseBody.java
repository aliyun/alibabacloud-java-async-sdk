// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DownloadDataTrackResultResponseBody} extends {@link TeaModel}
 *
 * <p>DownloadDataTrackResultResponseBody</p>
 */
public class DownloadDataTrackResultResponseBody extends TeaModel {
    @NameInMap("DownloadKeyId")
    private String downloadKeyId;

    @NameInMap("ErrorCode")
    private String errorCode;

    @NameInMap("ErrorMessage")
    private String errorMessage;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private DownloadDataTrackResultResponseBody(Builder builder) {
        this.downloadKeyId = builder.downloadKeyId;
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DownloadDataTrackResultResponseBody create() {
        return builder().build();
    }

    /**
     * @return downloadKeyId
     */
    public String getDownloadKeyId() {
        return this.downloadKeyId;
    }

    /**
     * @return errorCode
     */
    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * @return errorMessage
     */
    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String downloadKeyId; 
        private String errorCode; 
        private String errorMessage; 
        private String requestId; 
        private Boolean success; 

        /**
         * The ID of the download key, which is used to download the parsing result of the data tracking task.
         */
        public Builder downloadKeyId(String downloadKeyId) {
            this.downloadKeyId = downloadKeyId;
            return this;
        }

        /**
         * The error code returned if the request failed.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * The error message returned if the request failed.
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Indicates whether the request was successful. Valid values:
         * <p>
         * 
         * *   **true**: The request was successful.
         * *   **false**: The request failed.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public DownloadDataTrackResultResponseBody build() {
            return new DownloadDataTrackResultResponseBody(this);
        } 

    } 

}
