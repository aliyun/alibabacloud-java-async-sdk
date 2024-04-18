// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oos20190601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListInstancePatchesResponseBody} extends {@link TeaModel}
 *
 * <p>ListInstancePatchesResponseBody</p>
 */
public class ListInstancePatchesResponseBody extends TeaModel {
    @NameInMap("MaxResults")
    private Integer maxResults;

    @NameInMap("NextToken")
    private String nextToken;

    @NameInMap("Patches")
    private java.util.List < Patches> patches;

    @NameInMap("RequestId")
    private String requestId;

    private ListInstancePatchesResponseBody(Builder builder) {
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.patches = builder.patches;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListInstancePatchesResponseBody create() {
        return builder().build();
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return patches
     */
    public java.util.List < Patches> getPatches() {
        return this.patches;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Integer maxResults; 
        private String nextToken; 
        private java.util.List < Patches> patches; 
        private String requestId; 

        /**
         * The number of entries returned on each page.
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * The token that is used to retrieve the next page of results.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * The information about the patch.
         */
        public Builder patches(java.util.List < Patches> patches) {
            this.patches = patches;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListInstancePatchesResponseBody build() {
            return new ListInstancePatchesResponseBody(this);
        } 

    } 

    public static class Patches extends TeaModel {
        @NameInMap("Classification")
        private String classification;

        @NameInMap("InstalledTime")
        private String installedTime;

        @NameInMap("KBId")
        private String KBId;

        @NameInMap("Severity")
        private String severity;

        @NameInMap("Status")
        private String status;

        @NameInMap("Title")
        private String title;

        private Patches(Builder builder) {
            this.classification = builder.classification;
            this.installedTime = builder.installedTime;
            this.KBId = builder.KBId;
            this.severity = builder.severity;
            this.status = builder.status;
            this.title = builder.title;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Patches create() {
            return builder().build();
        }

        /**
         * @return classification
         */
        public String getClassification() {
            return this.classification;
        }

        /**
         * @return installedTime
         */
        public String getInstalledTime() {
            return this.installedTime;
        }

        /**
         * @return KBId
         */
        public String getKBId() {
            return this.KBId;
        }

        /**
         * @return severity
         */
        public String getSeverity() {
            return this.severity;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return title
         */
        public String getTitle() {
            return this.title;
        }

        public static final class Builder {
            private String classification; 
            private String installedTime; 
            private String KBId; 
            private String severity; 
            private String status; 
            private String title; 

            /**
             * The classification of the patch.
             */
            public Builder classification(String classification) {
                this.classification = classification;
                return this;
            }

            /**
             * The time when the patch was installed.
             */
            public Builder installedTime(String installedTime) {
                this.installedTime = installedTime;
                return this;
            }

            /**
             * The Id of KBId.
             */
            public Builder KBId(String KBId) {
                this.KBId = KBId;
                return this;
            }

            /**
             * The level of the severity.
             */
            public Builder severity(String severity) {
                this.severity = severity;
                return this;
            }

            /**
             * The status of the installation.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * The name of the patch.
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            public Patches build() {
                return new Patches(this);
            } 

        } 

    }
}
