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
         * <p>The return code.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>Specifies whether the request was successful. Valid values:</p>
         * <ul>
         * <li><p><code>true</code>: The request was successful.</p>
         * </li>
         * <li><p><code>false</code>: The request failed.</p>
         * </li>
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
         * <p>The scan engine type. Valid values:</p>
         * <ul>
         * <li><p><code>ACR_SCAN_SERVICE</code>: the ACR Trivy scan engine.</p>
         * </li>
         * <li><p><code>SAS_SCAN_SERVICE</code>: the Cloud Security scan engine.</p>
         * </li>
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
         * <p>The scan status of the image. Valid values:</p>
         * <ul>
         * <li><p><code>SCANNING</code>: The image is being scanned.</p>
         * </li>
         * <li><p><code>COMPLETE</code>: The scan is complete.</p>
         * </li>
         * <li><p><code>FAILED</code>: The scan failed.</p>
         * </li>
         * <li><p><code>RETRYING</code>: The scan is being retried.</p>
         * </li>
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
