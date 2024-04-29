// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateVirusScanOnceTaskRequest} extends {@link RequestModel}
 *
 * <p>CreateVirusScanOnceTaskRequest</p>
 */
public class CreateVirusScanOnceTaskRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ScanPath")
    private java.util.List < String > scanPath;

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
    public java.util.List < String > getScanPath() {
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
        private java.util.List < String > scanPath; 
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
         * The information about the scan path that is required for a custom scan.
         */
        public Builder scanPath(java.util.List < String > scanPath) {
            this.putQueryParameter("ScanPath", scanPath);
            this.scanPath = scanPath;
            return this;
        }

        /**
         * The type of the virus scan. Valid values:
         * <p>
         * 
         * *   **system**: system scan.
         * *   **user**: custom scan.
         */
        public Builder scanType(String scanType) {
            this.putQueryParameter("ScanType", scanType);
            this.scanType = scanType;
            return this;
        }

        /**
         * The key that stores the asset information.
         * <p>
         * 
         * > You can call the [GetAssetSelectionConfig](~~GetAssetSelectionConfig~~) operation to obtain the key value.
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
