// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link CreateVirusScanOnceTaskRequest} extends {@link RequestModel}
 *
 * <p>CreateVirusScanOnceTaskRequest</p>
 */
public class CreateVirusScanOnceTaskRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    @com.aliyun.core.annotation.Validation(maxLength = 64)
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DryRun")
    private Boolean dryRun;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Param")
    private String param;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ScanPath")
    private java.util.List<String> scanPath;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ScanType")
    private String scanType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SelectionKey")
    private String selectionKey;

    private CreateVirusScanOnceTaskRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.dryRun = builder.dryRun;
        this.param = builder.param;
        this.scanPath = builder.scanPath;
        this.scanType = builder.scanType;
        this.selectionKey = builder.selectionKey;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateVirusScanOnceTaskRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return dryRun
     */
    public Boolean getDryRun() {
        return this.dryRun;
    }

    /**
     * @return param
     */
    public String getParam() {
        return this.param;
    }

    /**
     * @return scanPath
     */
    public java.util.List<String> getScanPath() {
        return this.scanPath;
    }

    /**
     * @return scanType
     */
    public String getScanType() {
        return this.scanType;
    }

    /**
     * @return selectionKey
     */
    public String getSelectionKey() {
        return this.selectionKey;
    }

    public static final class Builder extends Request.Builder<CreateVirusScanOnceTaskRequest, Builder> {
        private String clientToken; 
        private Boolean dryRun; 
        private String param; 
        private java.util.List<String> scanPath; 
        private String scanType; 
        private String selectionKey; 

        private Builder() {
            super();
        } 

        private Builder(CreateVirusScanOnceTaskRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.dryRun = request.dryRun;
            this.param = request.param;
            this.scanPath = request.scanPath;
            this.scanType = request.scanType;
            this.selectionKey = request.selectionKey;
        } 

        /**
         * <p>The client token that is used to ensure the idempotence of the request. Different requests should use different tokens. The token supports only ASCII characters and cannot exceed 64 characters in length.</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>Specifies whether to perform only a dry run of the request. Valid values:</p>
         * <ul>
         * <li>true: performs only a dry run without executing the actual operation.</li>
         * <li>false: performs the actual request.</li>
         * </ul>
         * <p>Default value: false.</p>
         */
        public Builder dryRun(Boolean dryRun) {
            this.putQueryParameter("DryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        /**
         * <p>The extended information field:</p>
         * <ul>
         * <li><strong>additionType</strong>: the extended scan type</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>{\&quot;additionType\&quot;:[\&quot;SCAN_MEMORY\&quot;]}</p>
         */
        public Builder param(String param) {
            this.putQueryParameter("Param", param);
            this.param = param;
            return this;
        }

        /**
         * <p>The scan path information to be transmitted if the scan type is custom scan.</p>
         */
        public Builder scanPath(java.util.List<String> scanPath) {
            this.putQueryParameter("ScanPath", scanPath);
            this.scanPath = scanPath;
            return this;
        }

        /**
         * <p>The scan type of the virus scan. Valid values:</p>
         * <ul>
         * <li><strong>system</strong>: system scan</li>
         * <li><strong>user</strong>: custom scan</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>system</p>
         */
        public Builder scanType(String scanType) {
            this.putQueryParameter("ScanType", scanType);
            this.scanType = scanType;
            return this;
        }

        /**
         * <p>The key that stores asset information.</p>
         * <blockquote>
         * <p>You can call the <a href="~~GetAssetSelectionConfig~~">GetAssetSelectionConfig</a> operation to obtain this parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>845de1ec-4b08-42e1-b564-31321e48xxxx</p>
         */
        public Builder selectionKey(String selectionKey) {
            this.putQueryParameter("SelectionKey", selectionKey);
            this.selectionKey = selectionKey;
            return this;
        }

        @Override
        public CreateVirusScanOnceTaskRequest build() {
            return new CreateVirusScanOnceTaskRequest(this);
        } 

    } 

}
