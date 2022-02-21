// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cr20181201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetRepoTagScanStatusResponseBody} extends {@link TeaModel}
 *
 * <p>GetRepoTagScanStatusResponseBody</p>
 */
public class GetRepoTagScanStatusResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("IsSuccess")
    private Boolean isSuccess;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("ScanService")
    private String scanService;

    @NameInMap("Status")
    private String status;

    private GetRepoTagScanStatusResponseBody(Builder builder) {
        this.code = builder.code;
        this.isSuccess = builder.isSuccess;
        this.requestId = builder.requestId;
        this.scanService = builder.scanService;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetRepoTagScanStatusResponseBody create() {
        return builder().build();
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

    /**
     * @return scanService
     */
    public String getScanService() {
        return this.scanService;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder {
        private String code; 
        private Boolean isSuccess; 
        private String requestId; 
        private String scanService; 
        private String status; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * IsSuccess.
         */
        public Builder isSuccess(Boolean isSuccess) {
            this.isSuccess = isSuccess;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * ScanService.
         */
        public Builder scanService(String scanService) {
            this.scanService = scanService;
            return this;
        }

        /**
         * Status.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        public GetRepoTagScanStatusResponseBody build() {
            return new GetRepoTagScanStatusResponseBody(this);
        } 

    } 

}
