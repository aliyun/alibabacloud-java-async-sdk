// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oosops20190601.models;

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
 * {@link ListUserInstancePatchesResponseBody} extends {@link TeaModel}
 *
 * <p>ListUserInstancePatchesResponseBody</p>
 */
public class ListUserInstancePatchesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("Patches")
    private java.util.List<Patches> patches;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListUserInstancePatchesResponseBody(Builder builder) {
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.patches = builder.patches;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListUserInstancePatchesResponseBody create() {
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
    public java.util.List<Patches> getPatches() {
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
        private java.util.List<Patches> patches; 
        private String requestId; 

        /**
         * MaxResults.
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * Patches.
         */
        public Builder patches(java.util.List<Patches> patches) {
            this.patches = patches;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListUserInstancePatchesResponseBody build() {
            return new ListUserInstancePatchesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListUserInstancePatchesResponseBody} extends {@link TeaModel}
     *
     * <p>ListUserInstancePatchesResponseBody</p>
     */
    public static class Patches extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Classification")
        private String classification;

        @com.aliyun.core.annotation.NameInMap("InstalledTime")
        private String installedTime;

        @com.aliyun.core.annotation.NameInMap("KBId")
        private String KBId;

        @com.aliyun.core.annotation.NameInMap("Severity")
        private String severity;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("Title")
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
             * Classification.
             */
            public Builder classification(String classification) {
                this.classification = classification;
                return this;
            }

            /**
             * InstalledTime.
             */
            public Builder installedTime(String installedTime) {
                this.installedTime = installedTime;
                return this;
            }

            /**
             * KBId.
             */
            public Builder KBId(String KBId) {
                this.KBId = KBId;
                return this;
            }

            /**
             * Severity.
             */
            public Builder severity(String severity) {
                this.severity = severity;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * Title.
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
