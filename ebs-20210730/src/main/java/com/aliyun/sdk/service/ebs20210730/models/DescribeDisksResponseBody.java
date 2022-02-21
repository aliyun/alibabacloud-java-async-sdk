// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ebs20210730.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDisksResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDisksResponseBody</p>
 */
public class DescribeDisksResponseBody extends TeaModel {
    @NameInMap("Disks")
    private Disks disks;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeDisksResponseBody(Builder builder) {
        this.disks = builder.disks;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDisksResponseBody create() {
        return builder().build();
    }

    /**
     * @return disks
     */
    public Disks getDisks() {
        return this.disks;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Disks disks; 
        private String requestId; 

        /**
         * Disks.
         */
        public Builder disks(Disks disks) {
            this.disks = disks;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeDisksResponseBody build() {
            return new DescribeDisksResponseBody(this);
        } 

    } 

    public static class Disk extends TeaModel {
        @NameInMap("DiskId")
        private String diskId;

        @NameInMap("ShowName")
        private String showName;

        private Disk(Builder builder) {
            this.diskId = builder.diskId;
            this.showName = builder.showName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Disk create() {
            return builder().build();
        }

        /**
         * @return diskId
         */
        public String getDiskId() {
            return this.diskId;
        }

        /**
         * @return showName
         */
        public String getShowName() {
            return this.showName;
        }

        public static final class Builder {
            private String diskId; 
            private String showName; 

            /**
             * DiskId.
             */
            public Builder diskId(String diskId) {
                this.diskId = diskId;
                return this;
            }

            /**
             * ShowName.
             */
            public Builder showName(String showName) {
                this.showName = showName;
                return this;
            }

            public Disk build() {
                return new Disk(this);
            } 

        } 

    }
    public static class Disks extends TeaModel {
        @NameInMap("Disk")
        private java.util.List < Disk> disk;

        private Disks(Builder builder) {
            this.disk = builder.disk;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Disks create() {
            return builder().build();
        }

        /**
         * @return disk
         */
        public java.util.List < Disk> getDisk() {
            return this.disk;
        }

        public static final class Builder {
            private java.util.List < Disk> disk; 

            /**
             * Disk.
             */
            public Builder disk(java.util.List < Disk> disk) {
                this.disk = disk;
                return this;
            }

            public Disks build() {
                return new Disks(this);
            } 

        } 

    }
}
