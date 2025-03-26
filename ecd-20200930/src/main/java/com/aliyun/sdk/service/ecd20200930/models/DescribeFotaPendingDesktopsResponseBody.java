// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

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
 * {@link DescribeFotaPendingDesktopsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeFotaPendingDesktopsResponseBody</p>
 */
public class DescribeFotaPendingDesktopsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("FotaPendingDesktops")
    private java.util.List<FotaPendingDesktops> fotaPendingDesktops;

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

    public Builder toBuilder() {
        return new Builder(this);
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
    public java.util.List<FotaPendingDesktops> getFotaPendingDesktops() {
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
        private java.util.List<FotaPendingDesktops> fotaPendingDesktops; 
        private String message; 
        private String nextToken; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeFotaPendingDesktopsResponseBody model) {
            this.code = model.code;
            this.fotaPendingDesktops = model.fotaPendingDesktops;
            this.message = model.message;
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The response code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The cloud computers whose images can be and are pending to be updated to the version specified in <code>TaskUid</code>.</p>
         */
        public Builder fotaPendingDesktops(java.util.List<FotaPendingDesktops> fotaPendingDesktops) {
            this.fotaPendingDesktops = fotaPendingDesktops;
            return this;
        }

        /**
         * <p>The returned message.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>A pagination token. It can be used in the next request to retrieve a new page of results. If NextToken is empty, no next page exists.</p>
         * 
         * <strong>example:</strong>
         * <p>caeba0bbb2be03f84eb48b699f0a4883</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1CBAFFAB-B697-4049-A9B1-67E1FC5F****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeFotaPendingDesktopsResponseBody build() {
            return new DescribeFotaPendingDesktopsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeFotaPendingDesktopsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeFotaPendingDesktopsResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(Sessions model) {
                this.endUserId = model.endUserId;
            } 

            /**
             * <p>The ID of the end user that connects to the cloud computer.</p>
             * 
             * <strong>example:</strong>
             * <p>end user id</p>
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
    /**
     * 
     * {@link DescribeFotaPendingDesktopsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeFotaPendingDesktopsResponseBody</p>
     */
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
        private java.util.List<Sessions> sessions;

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
        public java.util.List<Sessions> getSessions() {
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
            private java.util.List<Sessions> sessions; 
            private Long status; 

            private Builder() {
            } 

            private Builder(FotaPendingDesktops model) {
                this.currentAppVersion = model.currentAppVersion;
                this.desktopId = model.desktopId;
                this.desktopName = model.desktopName;
                this.fotaProject = model.fotaProject;
                this.officeSiteId = model.officeSiteId;
                this.sessions = model.sessions;
                this.status = model.status;
            } 

            /**
             * <p>The current version of the image used by the cloud computer.</p>
             * 
             * <strong>example:</strong>
             * <p>0.0.1-D-20220513.143129</p>
             */
            public Builder currentAppVersion(String currentAppVersion) {
                this.currentAppVersion = currentAppVersion;
                return this;
            }

            /**
             * <p>The ID of the cloud computer.</p>
             * 
             * <strong>example:</strong>
             * <p>ecd-bvdtu3jn97o1r****</p>
             */
            public Builder desktopId(String desktopId) {
                this.desktopId = desktopId;
                return this;
            }

            /**
             * <p>The name of the cloud computer.</p>
             * 
             * <strong>example:</strong>
             * <p>TestDesktop</p>
             */
            public Builder desktopName(String desktopName) {
                this.desktopName = desktopName;
                return this;
            }

            /**
             * <blockquote>
             * <p>This parameter is not publicly available.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>To be hidden</p>
             */
            public Builder fotaProject(String fotaProject) {
                this.fotaProject = fotaProject;
                return this;
            }

            /**
             * <p>The ID of the office network.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou+dir-815419****</p>
             */
            public Builder officeSiteId(String officeSiteId) {
                this.officeSiteId = officeSiteId;
                return this;
            }

            /**
             * <p>The connected sessions.</p>
             */
            public Builder sessions(java.util.List<Sessions> sessions) {
                this.sessions = sessions;
                return this;
            }

            /**
             * <p>The status of the cloud computer.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>0: The cloud computer is being created.</li>
             * <li>1: The cloud computer is being started.</li>
             * <li>2: The cloud computer is running.</li>
             * <li>3: The cloud computer is being stopped.</li>
             * <li>5: The cloud computer is stopped.</li>
             * <li>6: The cloud computer expires.</li>
             * <li>7: The cloud computer is deleted.</li>
             * <li>9: Failed to create the cloud computer.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>2</p>
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
