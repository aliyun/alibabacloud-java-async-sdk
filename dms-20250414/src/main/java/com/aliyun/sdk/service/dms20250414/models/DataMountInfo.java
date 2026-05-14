// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms20250414.models;

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
 * {@link DataMountInfo} extends {@link TeaModel}
 *
 * <p>DataMountInfo</p>
 */
public class DataMountInfo extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("MountFolderName")
    private String mountFolderName;

    @com.aliyun.core.annotation.NameInMap("OssBucket")
    private String ossBucket;

    @com.aliyun.core.annotation.NameInMap("Prefix")
    private String prefix;

    @com.aliyun.core.annotation.NameInMap("ReadOnly")
    private Boolean readOnly;

    private DataMountInfo(Builder builder) {
        this.mountFolderName = builder.mountFolderName;
        this.ossBucket = builder.ossBucket;
        this.prefix = builder.prefix;
        this.readOnly = builder.readOnly;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DataMountInfo create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return mountFolderName
     */
    public String getMountFolderName() {
        return this.mountFolderName;
    }

    /**
     * @return ossBucket
     */
    public String getOssBucket() {
        return this.ossBucket;
    }

    /**
     * @return prefix
     */
    public String getPrefix() {
        return this.prefix;
    }

    /**
     * @return readOnly
     */
    public Boolean getReadOnly() {
        return this.readOnly;
    }

    public static final class Builder {
        private String mountFolderName; 
        private String ossBucket; 
        private String prefix; 
        private Boolean readOnly; 

        private Builder() {
        } 

        private Builder(DataMountInfo model) {
            this.mountFolderName = model.mountFolderName;
            this.ossBucket = model.ossBucket;
            this.prefix = model.prefix;
            this.readOnly = model.readOnly;
        } 

        /**
         * MountFolderName.
         */
        public Builder mountFolderName(String mountFolderName) {
            this.mountFolderName = mountFolderName;
            return this;
        }

        /**
         * OssBucket.
         */
        public Builder ossBucket(String ossBucket) {
            this.ossBucket = ossBucket;
            return this;
        }

        /**
         * Prefix.
         */
        public Builder prefix(String prefix) {
            this.prefix = prefix;
            return this;
        }

        /**
         * ReadOnly.
         */
        public Builder readOnly(Boolean readOnly) {
            this.readOnly = readOnly;
            return this;
        }

        public DataMountInfo build() {
            return new DataMountInfo(this);
        } 

    } 

}
