// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oos20190601.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListInstancePatchesResponseBody} extends {@link TeaModel}
 *
 * <p>ListInstancePatchesResponseBody</p>
 */
public class ListInstancePatchesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("Patches")
    private java.util.List < Patches> patches;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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
         * <p>The number of entries returned on each page.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The token that is used to retrieve the next page of results.</p>
         * 
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The information about the patch.</p>
         */
        public Builder patches(java.util.List < Patches> patches) {
            this.patches = patches;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>0A615755-9C86-5EA6-BF9E-6E8F1AFF9403</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListInstancePatchesResponseBody build() {
            return new ListInstancePatchesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListInstancePatchesResponseBody} extends {@link TeaModel}
     *
     * <p>ListInstancePatchesResponseBody</p>
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
             * <p>The classification of the patch.</p>
             * 
             * <strong>example:</strong>
             * <p>“”</p>
             */
            public Builder classification(String classification) {
                this.classification = classification;
                return this;
            }

            /**
             * <p>The time when the patch was installed.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-01-28T07:07:20Z</p>
             */
            public Builder installedTime(String installedTime) {
                this.installedTime = installedTime;
                return this;
            }

            /**
             * <p>The Id of KBId.</p>
             * 
             * <strong>example:</strong>
             * <p>apt-utils.amd64</p>
             */
            public Builder KBId(String KBId) {
                this.KBId = KBId;
                return this;
            }

            /**
             * <p>The level of the severity.</p>
             * 
             * <strong>example:</strong>
             * <p>important</p>
             */
            public Builder severity(String severity) {
                this.severity = severity;
                return this;
            }

            /**
             * <p>The status of the installation.</p>
             * 
             * <strong>example:</strong>
             * <p>Installed</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The name of the patch.</p>
             * 
             * <strong>example:</strong>
             * <p>isc-dhcp-common.amd64:4.3.5-3ubuntu7.3</p>
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
