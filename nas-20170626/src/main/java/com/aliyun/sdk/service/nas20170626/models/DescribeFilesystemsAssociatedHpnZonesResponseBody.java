// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nas20170626.models;

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
 * {@link DescribeFilesystemsAssociatedHpnZonesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeFilesystemsAssociatedHpnZonesResponseBody</p>
 */
public class DescribeFilesystemsAssociatedHpnZonesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Filesystems")
    private java.util.List<Filesystems> filesystems;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeFilesystemsAssociatedHpnZonesResponseBody(Builder builder) {
        this.filesystems = builder.filesystems;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeFilesystemsAssociatedHpnZonesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return filesystems
     */
    public java.util.List<Filesystems> getFilesystems() {
        return this.filesystems;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<Filesystems> filesystems; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeFilesystemsAssociatedHpnZonesResponseBody model) {
            this.filesystems = model.filesystems;
            this.requestId = model.requestId;
        } 

        /**
         * Filesystems.
         */
        public Builder filesystems(java.util.List<Filesystems> filesystems) {
            this.filesystems = filesystems;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeFilesystemsAssociatedHpnZonesResponseBody build() {
            return new DescribeFilesystemsAssociatedHpnZonesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeFilesystemsAssociatedHpnZonesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeFilesystemsAssociatedHpnZonesResponseBody</p>
     */
    public static class Filesystems extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AssociatedHpnZones")
        private java.util.List<String> associatedHpnZones;

        @com.aliyun.core.annotation.NameInMap("FileSystemId")
        private String fileSystemId;

        @com.aliyun.core.annotation.NameInMap("ZoneId")
        private String zoneId;

        private Filesystems(Builder builder) {
            this.associatedHpnZones = builder.associatedHpnZones;
            this.fileSystemId = builder.fileSystemId;
            this.zoneId = builder.zoneId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Filesystems create() {
            return builder().build();
        }

        /**
         * @return associatedHpnZones
         */
        public java.util.List<String> getAssociatedHpnZones() {
            return this.associatedHpnZones;
        }

        /**
         * @return fileSystemId
         */
        public String getFileSystemId() {
            return this.fileSystemId;
        }

        /**
         * @return zoneId
         */
        public String getZoneId() {
            return this.zoneId;
        }

        public static final class Builder {
            private java.util.List<String> associatedHpnZones; 
            private String fileSystemId; 
            private String zoneId; 

            private Builder() {
            } 

            private Builder(Filesystems model) {
                this.associatedHpnZones = model.associatedHpnZones;
                this.fileSystemId = model.fileSystemId;
                this.zoneId = model.zoneId;
            } 

            /**
             * AssociatedHpnZones.
             */
            public Builder associatedHpnZones(java.util.List<String> associatedHpnZones) {
                this.associatedHpnZones = associatedHpnZones;
                return this;
            }

            /**
             * FileSystemId.
             */
            public Builder fileSystemId(String fileSystemId) {
                this.fileSystemId = fileSystemId;
                return this;
            }

            /**
             * ZoneId.
             */
            public Builder zoneId(String zoneId) {
                this.zoneId = zoneId;
                return this;
            }

            public Filesystems build() {
                return new Filesystems(this);
            } 

        } 

    }
}
