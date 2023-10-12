// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cmn20200825.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link OsVersion} extends {@link TeaModel}
 *
 * <p>OsVersion</p>
 */
public class OsVersion extends TeaModel {
    @NameInMap("AccessId")
    private String accessId;

    @NameInMap("CreateTime")
    private String createTime;

    @NameInMap("Directory")
    private String directory;

    @NameInMap("ExpireTime")
    private String expireTime;

    @NameInMap("FileName")
    private String fileName;

    @NameInMap("FilePath")
    private String filePath;

    @NameInMap("Host")
    private String host;

    @NameInMap("Model")
    private String model;

    @NameInMap("OsVersion")
    private String osVersion;

    @NameInMap("OsVersionId")
    private String osVersionId;

    @NameInMap("Policy")
    private String policy;

    @NameInMap("Signature")
    private String signature;

    @NameInMap("Status")
    private String status;

    @NameInMap("Vendor")
    private String vendor;

    private OsVersion(Builder builder) {
        this.accessId = builder.accessId;
        this.createTime = builder.createTime;
        this.directory = builder.directory;
        this.expireTime = builder.expireTime;
        this.fileName = builder.fileName;
        this.filePath = builder.filePath;
        this.host = builder.host;
        this.model = builder.model;
        this.osVersion = builder.osVersion;
        this.osVersionId = builder.osVersionId;
        this.policy = builder.policy;
        this.signature = builder.signature;
        this.status = builder.status;
        this.vendor = builder.vendor;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static OsVersion create() {
        return builder().build();
    }

    /**
     * @return accessId
     */
    public String getAccessId() {
        return this.accessId;
    }

    /**
     * @return createTime
     */
    public String getCreateTime() {
        return this.createTime;
    }

    /**
     * @return directory
     */
    public String getDirectory() {
        return this.directory;
    }

    /**
     * @return expireTime
     */
    public String getExpireTime() {
        return this.expireTime;
    }

    /**
     * @return fileName
     */
    public String getFileName() {
        return this.fileName;
    }

    /**
     * @return filePath
     */
    public String getFilePath() {
        return this.filePath;
    }

    /**
     * @return host
     */
    public String getHost() {
        return this.host;
    }

    /**
     * @return model
     */
    public String getModel() {
        return this.model;
    }

    /**
     * @return osVersion
     */
    public String getOsVersion() {
        return this.osVersion;
    }

    /**
     * @return osVersionId
     */
    public String getOsVersionId() {
        return this.osVersionId;
    }

    /**
     * @return policy
     */
    public String getPolicy() {
        return this.policy;
    }

    /**
     * @return signature
     */
    public String getSignature() {
        return this.signature;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return vendor
     */
    public String getVendor() {
        return this.vendor;
    }

    public static final class Builder {
        private String accessId; 
        private String createTime; 
        private String directory; 
        private String expireTime; 
        private String fileName; 
        private String filePath; 
        private String host; 
        private String model; 
        private String osVersion; 
        private String osVersionId; 
        private String policy; 
        private String signature; 
        private String status; 
        private String vendor; 

        /**
         * AccessId.
         */
        public Builder accessId(String accessId) {
            this.accessId = accessId;
            return this;
        }

        /**
         * CreateTime.
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * Directory.
         */
        public Builder directory(String directory) {
            this.directory = directory;
            return this;
        }

        /**
         * ExpireTime.
         */
        public Builder expireTime(String expireTime) {
            this.expireTime = expireTime;
            return this;
        }

        /**
         * FileName.
         */
        public Builder fileName(String fileName) {
            this.fileName = fileName;
            return this;
        }

        /**
         * FilePath.
         */
        public Builder filePath(String filePath) {
            this.filePath = filePath;
            return this;
        }

        /**
         * Host.
         */
        public Builder host(String host) {
            this.host = host;
            return this;
        }

        /**
         * Model.
         */
        public Builder model(String model) {
            this.model = model;
            return this;
        }

        /**
         * OsVersion.
         */
        public Builder osVersion(String osVersion) {
            this.osVersion = osVersion;
            return this;
        }

        /**
         * OsVersionId.
         */
        public Builder osVersionId(String osVersionId) {
            this.osVersionId = osVersionId;
            return this;
        }

        /**
         * Policy.
         */
        public Builder policy(String policy) {
            this.policy = policy;
            return this;
        }

        /**
         * Signature.
         */
        public Builder signature(String signature) {
            this.signature = signature;
            return this;
        }

        /**
         * Status.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * Vendor.
         */
        public Builder vendor(String vendor) {
            this.vendor = vendor;
            return this;
        }

        public OsVersion build() {
            return new OsVersion(this);
        } 

    } 

}
