// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.csas20230120.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListSoftwareForUserDeviceResponseBody} extends {@link TeaModel}
 *
 * <p>ListSoftwareForUserDeviceResponseBody</p>
 */
public class ListSoftwareForUserDeviceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Software")
    private java.util.List < Software> software;

    @com.aliyun.core.annotation.NameInMap("TotalNum")
    private Long totalNum;

    private ListSoftwareForUserDeviceResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.software = builder.software;
        this.totalNum = builder.totalNum;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListSoftwareForUserDeviceResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return software
     */
    public java.util.List < Software> getSoftware() {
        return this.software;
    }

    /**
     * @return totalNum
     */
    public Long getTotalNum() {
        return this.totalNum;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List < Software> software; 
        private Long totalNum; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Software.
         */
        public Builder software(java.util.List < Software> software) {
            this.software = software;
            return this;
        }

        /**
         * TotalNum.
         */
        public Builder totalNum(Long totalNum) {
            this.totalNum = totalNum;
            return this;
        }

        public ListSoftwareForUserDeviceResponseBody build() {
            return new ListSoftwareForUserDeviceResponseBody(this);
        } 

    } 

    public static class Software extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Inc")
        private String inc;

        @com.aliyun.core.annotation.NameInMap("InstallTime")
        private String installTime;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Versions")
        private java.util.List < String > versions;

        private Software(Builder builder) {
            this.inc = builder.inc;
            this.installTime = builder.installTime;
            this.name = builder.name;
            this.versions = builder.versions;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Software create() {
            return builder().build();
        }

        /**
         * @return inc
         */
        public String getInc() {
            return this.inc;
        }

        /**
         * @return installTime
         */
        public String getInstallTime() {
            return this.installTime;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return versions
         */
        public java.util.List < String > getVersions() {
            return this.versions;
        }

        public static final class Builder {
            private String inc; 
            private String installTime; 
            private String name; 
            private java.util.List < String > versions; 

            /**
             * Inc.
             */
            public Builder inc(String inc) {
                this.inc = inc;
                return this;
            }

            /**
             * InstallTime.
             */
            public Builder installTime(String installTime) {
                this.installTime = installTime;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Versions.
             */
            public Builder versions(java.util.List < String > versions) {
                this.versions = versions;
                return this;
            }

            public Software build() {
                return new Software(this);
            } 

        } 

    }
}
