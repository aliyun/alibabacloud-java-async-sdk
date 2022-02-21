// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20180412.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListInstalledSoftwareResponseBody} extends {@link TeaModel}
 *
 * <p>ListInstalledSoftwareResponseBody</p>
 */
public class ListInstalledSoftwareResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("SoftwareList")
    private SoftwareList softwareList;

    private ListInstalledSoftwareResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.softwareList = builder.softwareList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListInstalledSoftwareResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return softwareList
     */
    public SoftwareList getSoftwareList() {
        return this.softwareList;
    }

    public static final class Builder {
        private String requestId; 
        private SoftwareList softwareList; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * SoftwareList.
         */
        public Builder softwareList(SoftwareList softwareList) {
            this.softwareList = softwareList;
            return this;
        }

        public ListInstalledSoftwareResponseBody build() {
            return new ListInstalledSoftwareResponseBody(this);
        } 

    } 

    public static class SoftwareListSoftwareList extends TeaModel {
        @NameInMap("SoftwareId")
        private String softwareId;

        @NameInMap("SoftwareName")
        private String softwareName;

        @NameInMap("SoftwareStatus")
        private String softwareStatus;

        @NameInMap("SoftwareVersion")
        private String softwareVersion;

        private SoftwareListSoftwareList(Builder builder) {
            this.softwareId = builder.softwareId;
            this.softwareName = builder.softwareName;
            this.softwareStatus = builder.softwareStatus;
            this.softwareVersion = builder.softwareVersion;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SoftwareListSoftwareList create() {
            return builder().build();
        }

        /**
         * @return softwareId
         */
        public String getSoftwareId() {
            return this.softwareId;
        }

        /**
         * @return softwareName
         */
        public String getSoftwareName() {
            return this.softwareName;
        }

        /**
         * @return softwareStatus
         */
        public String getSoftwareStatus() {
            return this.softwareStatus;
        }

        /**
         * @return softwareVersion
         */
        public String getSoftwareVersion() {
            return this.softwareVersion;
        }

        public static final class Builder {
            private String softwareId; 
            private String softwareName; 
            private String softwareStatus; 
            private String softwareVersion; 

            /**
             * SoftwareId.
             */
            public Builder softwareId(String softwareId) {
                this.softwareId = softwareId;
                return this;
            }

            /**
             * SoftwareName.
             */
            public Builder softwareName(String softwareName) {
                this.softwareName = softwareName;
                return this;
            }

            /**
             * SoftwareStatus.
             */
            public Builder softwareStatus(String softwareStatus) {
                this.softwareStatus = softwareStatus;
                return this;
            }

            /**
             * SoftwareVersion.
             */
            public Builder softwareVersion(String softwareVersion) {
                this.softwareVersion = softwareVersion;
                return this;
            }

            public SoftwareListSoftwareList build() {
                return new SoftwareListSoftwareList(this);
            } 

        } 

    }
    public static class SoftwareList extends TeaModel {
        @NameInMap("SoftwareList")
        private java.util.List < SoftwareListSoftwareList> softwareList;

        private SoftwareList(Builder builder) {
            this.softwareList = builder.softwareList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SoftwareList create() {
            return builder().build();
        }

        /**
         * @return softwareList
         */
        public java.util.List < SoftwareListSoftwareList> getSoftwareList() {
            return this.softwareList;
        }

        public static final class Builder {
            private java.util.List < SoftwareListSoftwareList> softwareList; 

            /**
             * SoftwareList.
             */
            public Builder softwareList(java.util.List < SoftwareListSoftwareList> softwareList) {
                this.softwareList = softwareList;
                return this;
            }

            public SoftwareList build() {
                return new SoftwareList(this);
            } 

        } 

    }
}
