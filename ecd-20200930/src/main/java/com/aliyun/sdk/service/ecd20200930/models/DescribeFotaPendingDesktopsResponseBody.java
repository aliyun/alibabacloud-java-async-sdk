// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeFotaPendingDesktopsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeFotaPendingDesktopsResponseBody</p>
 */
public class DescribeFotaPendingDesktopsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("FotaPendingDesktops")
    private java.util.List < FotaPendingDesktops> fotaPendingDesktops;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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
         * The cloud computers whose images can be and are pending to be updated to the version specified in `TaskUid`.
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
        @com.aliyun.core.annotation.NameInMap("EndUserId")
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
        @com.aliyun.core.annotation.NameInMap("CurrentAppVersion")
        private String currentAppVersion;

        @com.aliyun.core.annotation.NameInMap("DesktopId")
        private String desktopId;

        @com.aliyun.core.annotation.NameInMap("DesktopName")
        private String desktopName;

        @com.aliyun.core.annotation.NameInMap("FotaProject")
        private String fotaProject;

        @com.aliyun.core.annotation.NameInMap("OfficeSiteId")
        private String officeSiteId;

        @com.aliyun.core.annotation.NameInMap("Sessions")
        private java.util.List < Sessions> sessions;

        @com.aliyun.core.annotation.NameInMap("Status")
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
             * The ID of the cloud computer.
             */
            public Builder desktopId(String desktopId) {
                this.desktopId = desktopId;
                return this;
            }

            /**
             * The name of the cloud computer.
             */
            public Builder desktopName(String desktopName) {
                this.desktopName = desktopName;
                return this;
            }

            /**
             * > This parameter is not publicly available.
             */
            public Builder fotaProject(String fotaProject) {
                this.fotaProject = fotaProject;
                return this;
            }

            /**
             * The ID of the office network.
             */
            public Builder officeSiteId(String officeSiteId) {
                this.officeSiteId = officeSiteId;
                return this;
            }

            /**
             * The connected sessions.
             */
            public Builder sessions(java.util.List < Sessions> sessions) {
                this.sessions = sessions;
                return this;
            }

            /**
             * The status of the cloud computer.
             * <p>
             * 
             * Valid values:
             * 
             * *   0: The cloud computer is being created.
             * *   1: The cloud computer is being started.
             * *   2: The cloud computer is running.
             * *   3: The cloud computer is being stopped.
             * *   5: The cloud computer is stopped.
             * *   6: The cloud computer expires.
             * *   7: The cloud computer is deleted.
             * *   9: Failed to create the cloud computer.
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
