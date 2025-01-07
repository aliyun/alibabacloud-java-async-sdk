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
        private java.util.List<String> scanPath; 
        private String scanType; 
        private String selectionKey; 

        private Builder() {
            super();
        } 

        private Builder(CreateVirusScanOnceTaskRequest request) {
            super(request);
            this.scanPath = request.scanPath;
            this.scanType = request.scanType;
            this.selectionKey = request.selectionKey;
        } 

        /**
         * <p>The information about the scan path that is required for a custom scan.</p>
         */
        public Builder scanPath(java.util.List<String> scanPath) {
            this.putQueryParameter("ScanPath", scanPath);
            this.scanPath = scanPath;
            return this;
        }

        /**
         * <p>The type of the virus scan. Valid values:</p>
         * <ul>
         * <li><strong>system</strong>: system scan.</li>
         * <li><strong>user</strong>: custom scan.</li>
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
         * <p>The key that stores the asset information.</p>
         * <blockquote>
         * <p>You can call the <a href="~~GetAssetSelectionConfig~~">GetAssetSelectionConfig</a> operation to obtain the key value.</p>
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
