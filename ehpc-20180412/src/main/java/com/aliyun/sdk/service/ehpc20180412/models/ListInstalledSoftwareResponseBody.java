// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20180412.models;

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
 * {@link ListInstalledSoftwareResponseBody} extends {@link TeaModel}
 *
 * <p>ListInstalledSoftwareResponseBody</p>
 */
public class ListInstalledSoftwareResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SoftwareList")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(ListInstalledSoftwareResponseBody model) {
            this.requestId = model.requestId;
            this.softwareList = model.softwareList;
        } 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>DDCA0E7B-03E7-430D-810C-0D508539****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The installed software.</p>
         */
        public Builder softwareList(SoftwareList softwareList) {
            this.softwareList = softwareList;
            return this;
        }

        public ListInstalledSoftwareResponseBody build() {
            return new ListInstalledSoftwareResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListInstalledSoftwareResponseBody} extends {@link TeaModel}
     *
     * <p>ListInstalledSoftwareResponseBody</p>
     */
    public static class SoftwareListSoftwareList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SoftwareId")
        private String softwareId;

        @com.aliyun.core.annotation.NameInMap("SoftwareName")
        private String softwareName;

        @com.aliyun.core.annotation.NameInMap("SoftwareStatus")
        private String softwareStatus;

        @com.aliyun.core.annotation.NameInMap("SoftwareVersion")
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

            private Builder() {
            } 

            private Builder(SoftwareListSoftwareList model) {
                this.softwareId = model.softwareId;
                this.softwareName = model.softwareName;
                this.softwareStatus = model.softwareStatus;
                this.softwareVersion = model.softwareVersion;
            } 

            /**
             * <p>The software ID.</p>
             * 
             * <strong>example:</strong>
             * <p>MPICH_3.2</p>
             */
            public Builder softwareId(String softwareId) {
                this.softwareId = softwareId;
                return this;
            }

            /**
             * <p>The name of the software.</p>
             * 
             * <strong>example:</strong>
             * <p>mpich</p>
             */
            public Builder softwareName(String softwareName) {
                this.softwareName = softwareName;
                return this;
            }

            /**
             * <p>The status of the software. Valid values:</p>
             * <ul>
             * <li>Installing: The software is being installed.</li>
             * <li>Installed: The software is installed.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Installing</p>
             */
            public Builder softwareStatus(String softwareStatus) {
                this.softwareStatus = softwareStatus;
                return this;
            }

            /**
             * <p>The version of the software.</p>
             * 
             * <strong>example:</strong>
             * <p>3.2</p>
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
    /**
     * 
     * {@link ListInstalledSoftwareResponseBody} extends {@link TeaModel}
     *
     * <p>ListInstalledSoftwareResponseBody</p>
     */
    public static class SoftwareList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SoftwareList")
        private java.util.List<SoftwareListSoftwareList> softwareList;

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
        public java.util.List<SoftwareListSoftwareList> getSoftwareList() {
            return this.softwareList;
        }

        public static final class Builder {
            private java.util.List<SoftwareListSoftwareList> softwareList; 

            private Builder() {
            } 

            private Builder(SoftwareList model) {
                this.softwareList = model.softwareList;
            } 

            /**
             * <p>The installed software.</p>
             */
            public Builder softwareList(java.util.List<SoftwareListSoftwareList> softwareList) {
                this.softwareList = softwareList;
                return this;
            }

            public SoftwareList build() {
                return new SoftwareList(this);
            } 

        } 

    }
}
