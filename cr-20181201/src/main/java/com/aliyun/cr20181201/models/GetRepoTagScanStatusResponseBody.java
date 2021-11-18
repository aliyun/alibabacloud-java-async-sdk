// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link GetRepoTagScanStatusResponseBody} extends {@link TeaModel}
 *
 * <p>GetRepoTagScanStatusResponseBody</p>
 */
public class GetRepoTagScanStatusResponseBody extends TeaModel {
    @NameInMap("Status")
    private String status;

    @NameInMap("Code")
    private String code;

    @NameInMap("IsSuccess")
    private Boolean isSuccess;

    @NameInMap("RequestId")
    private String requestId;


    private GetRepoTagScanStatusResponseBody(Builder builder) {
        this.status = builder.status;
        this.code = builder.code;
        this.isSuccess = builder.isSuccess;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetRepoTagScanStatusResponseBody create() {
        return builder().build();
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return isSuccess
     */
    public Boolean getIsSuccess() {
        return this.isSuccess;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String status; 
        private String code; 
        private Boolean isSuccess; 
        private String requestId; 

        /**
         * <p>The scan status of the image version. Valid values:

-"SCANNING": scanning

-"COMPLETE": scan completed</p>
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * <p>Return value</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>Successful</p>
         */
        public Builder isSuccess(Boolean isSuccess) {
            this.isSuccess = isSuccess;
            return this;
        }

        /**
         * <p>Request ID</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetRepoTagScanStatusResponseBody build() {
            return new GetRepoTagScanStatusResponseBody(this);
        } 

    } 

}
