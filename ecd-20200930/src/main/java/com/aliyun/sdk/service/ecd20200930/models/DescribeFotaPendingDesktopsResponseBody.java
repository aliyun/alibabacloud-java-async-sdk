// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeFotaPendingDesktopsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeFotaPendingDesktopsResponseBody</p>
 */
public class DescribeFotaPendingDesktopsResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("FotaPendingDesktops")
    private java.util.List < FotaPendingDesktops> fotaPendingDesktops;

    @NameInMap("Message")
    private String message;

    @NameInMap("NextToken")
    private String nextToken;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeFotaPendingDesktopsResponseBody(Builder builder) {
        this.code = builder.code;
        this.fotaPendingDesktops = builder.fotaPendingDesktops;
        this.message = builder.message;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeFotaPendingDesktopsResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return fotaPendingDesktops
     */
    public java.util.List < FotaPendingDesktops> getFotaPendingDesktops() {
        return this.fotaPendingDesktops;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String code; 
        private java.util.List < FotaPendingDesktops> fotaPendingDesktops; 
        private String message; 
        private String nextToken; 
        private String requestId; 

        /**
         * The response code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * The cloud computers whose images can be but are not yet updated to the version that is described in an image update task (TaskUid).
         */
        public Builder fotaPendingDesktops(java.util.List < FotaPendingDesktops> fotaPendingDesktops) {
            this.fotaPendingDesktops = fotaPendingDesktops;
            return this;
        }

        /**
         * The returned message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * A pagination token. It can be used in the next request to retrieve a new page of results. If NextToken is empty, no next page exists.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeFotaPendingDesktopsResponseBody build() {
            return new DescribeFotaPendingDesktopsResponseBody(this);
        } 

    } 

    public static class Sessions extends TeaModel {
        @NameInMap("EndUserId")
        private String endUserId;

        private Sessions(Builder builder) {
            this.endUserId = builder.endUserId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Sessions create() {
            return builder().build();
        }

        /**
         * @return endUserId
         */
        public String getEndUserId() {
            return this.endUserId;
        }

        public static final class Builder {
            private String endUserId; 

            /**
             * The ID of the end user that connects to the cloud computer.
             */
            public Builder endUserId(String endUserId) {
                this.endUserId = endUserId;
                return this;
            }

            public Sessions build() {
                return new Sessions(this);
            } 

        } 

    }
    public static class FotaPendingDesktops extends TeaModel {
        @NameInMap("CurrentAppVersion")
        private String currentAppVersion;

        @NameInMap("DesktopId")
        private String desktopId;

        @NameInMap("DesktopName")
        private String desktopName;

        @NameInMap("FotaProject")
        private String fotaProject;

        @NameInMap("OfficeSiteId")
        private String officeSiteId;

        @NameInMap("Sessions")
        private java.util.List < Sessions> sessions;

        @NameInMap("Status")
        private Long status;

        private FotaPendingDesktops(Builder builder) {
            this.currentAppVersion = builder.currentAppVersion;
            this.desktopId = builder.desktopId;
            this.desktopName = builder.desktopName;
            this.fotaProject = builder.fotaProject;
            this.officeSiteId = builder.officeSiteId;
            this.sessions = builder.sessions;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FotaPendingDesktops create() {
            return builder().build();
        }

        /**
         * @return currentAppVersion
         */
        public String getCurrentAppVersion() {
            return this.currentAppVersion;
        }

        /**
         * @return desktopId
         */
        public String getDesktopId() {
            return this.desktopId;
        }

        /**
         * @return desktopName
         */
        public String getDesktopName() {
            return this.desktopName;
        }

        /**
         * @return fotaProject
         */
        public String getFotaProject() {
            return this.fotaProject;
        }

        /**
         * @return officeSiteId
         */
        public String getOfficeSiteId() {
            return this.officeSiteId;
        }

        /**
         * @return sessions
         */
        public java.util.List < Sessions> getSessions() {
            return this.sessions;
        }

        /**
         * @return status
         */
        public Long getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String currentAppVersion; 
            private String desktopId; 
            private String desktopName; 
            private String fotaProject; 
            private String officeSiteId; 
            private java.util.List < Sessions> sessions; 
            private Long status; 

            /**
             * The current version of the image used by the cloud computer.
             */
            public Builder currentAppVersion(String currentAppVersion) {
                this.currentAppVersion = currentAppVersion;
                return this;
            }

            /**
             * The cloud computer ID.
             */
            public Builder desktopId(String desktopId) {
                this.desktopId = desktopId;
                return this;
            }

            /**
             * The cloud computer name.
             */
            public Builder desktopName(String desktopName) {
                this.desktopName = desktopName;
                return this;
            }

            /**
             * The Firmware Over-The-Air (FOTA) update project of the cloud computer.
             */
            public Builder fotaProject(String fotaProject) {
                this.fotaProject = fotaProject;
                return this;
            }

            /**
             * The office network ID.
             */
            public Builder officeSiteId(String officeSiteId) {
                this.officeSiteId = officeSiteId;
                return this;
            }

            /**
             * The information about the connected sessions.
             */
            public Builder sessions(java.util.List < Sessions> sessions) {
                this.sessions = sessions;
                return this;
            }

            /**
             * The status.
             */
            public Builder status(Long status) {
                this.status = status;
                return this;
            }

            public FotaPendingDesktops build() {
                return new FotaPendingDesktops(this);
            } 

        } 

    }
}
