// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cr20181201.models;

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
 * {@link GetRepoTagScanStatusResponseBody} extends {@link TeaModel}
 *
 * <p>GetRepoTagScanStatusResponseBody</p>
 */
public class GetRepoTagScanStatusResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("IsSuccess")
    private Boolean isSuccess;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ScanService")
    private String scanService;

    @com.aliyun.core.annotation.NameInMap("Status")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(GetRepoTagScanStatusResponseBody model) {
            this.code = model.code;
            this.isSuccess = model.isSuccess;
            this.requestId = model.requestId;
            this.scanService = model.scanService;
            this.status = model.status;
        } 

        /**
         * <p>The HTTP status code.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>Indicates whether the request is successful. Valid values:</p>
         * <ul>
         * <li><code>true</code>: The request is successful.</li>
         * <li><code>false</code>: The request fails.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder isSuccess(Boolean isSuccess) {
            this.isSuccess = isSuccess;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>BC648259-91A7-4502-BED3-EDF64361FA83</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The type of the scanning engine.</p>
         * <ul>
         * <li><code>ACR_SCAN_SERVICE</code>: Trivy scan engine provided by Container Registry</li>
         * <li><code>SAS_SCAN_SERVICE</code>: Security Center scan engine</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ACR_SCAN_SERVICE</p>
         */
        public Builder scanService(String scanService) {
            this.scanService = scanService;
            return this;
        }

        /**
         * <p>The scanning status of the image tag. Valid values:</p>
         * <ul>
         * <li><code>SCANNING</code>: The image tag is being scanned.</li>
         * <li><code>COMPLETE</code>: The scanning of the image tag is complete.</li>
         * <li><code>FAILED</code>: The image tag failed to be scanned.</li>
         * <li><code>RETRYING</code>: The system is retrying to scan the image tag.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>COMPLETE</p>
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
