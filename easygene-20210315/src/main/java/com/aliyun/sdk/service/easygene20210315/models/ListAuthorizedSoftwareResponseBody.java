// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.easygene20210315.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListAuthorizedSoftwareResponseBody} extends {@link TeaModel}
 *
 * <p>ListAuthorizedSoftwareResponseBody</p>
 */
public class ListAuthorizedSoftwareResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("HostId")
    private String hostId;

    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Softwares")
    private java.util.List < Softwares> softwares;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private ListAuthorizedSoftwareResponseBody(Builder builder) {
        this.hostId = builder.hostId;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.softwares = builder.softwares;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAuthorizedSoftwareResponseBody create() {
        return builder().build();
    }

    /**
     * @return hostId
     */
    public String getHostId() {
        return this.hostId;
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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return softwares
     */
    public java.util.List < Softwares> getSoftwares() {
        return this.softwares;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private String hostId; 
        private Integer maxResults; 
        private String nextToken; 
        private String requestId; 
        private java.util.List < Softwares> softwares; 
        private Integer totalCount; 

        /**
         * HostId.
         */
        public Builder hostId(String hostId) {
            this.hostId = hostId;
            return this;
        }

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
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Softwares.
         */
        public Builder softwares(java.util.List < Softwares> softwares) {
            this.softwares = softwares;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListAuthorizedSoftwareResponseBody build() {
            return new ListAuthorizedSoftwareResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListAuthorizedSoftwareResponseBody} extends {@link TeaModel}
     *
     * <p>ListAuthorizedSoftwareResponseBody</p>
     */
    public static class Softwares extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("HelpLink")
        private String helpLink;

        @com.aliyun.core.annotation.NameInMap("LastModified")
        private String lastModified;

        @com.aliyun.core.annotation.NameInMap("Locations")
        private java.util.List < String > locations;

        @com.aliyun.core.annotation.NameInMap("Promotion")
        private String promotion;

        @com.aliyun.core.annotation.NameInMap("SoftwareDefaultVersion")
        private String softwareDefaultVersion;

        @com.aliyun.core.annotation.NameInMap("SoftwareDescription")
        private String softwareDescription;

        @com.aliyun.core.annotation.NameInMap("SoftwareIcon")
        private String softwareIcon;

        @com.aliyun.core.annotation.NameInMap("SoftwareLicenseFee")
        private Float softwareLicenseFee;

        @com.aliyun.core.annotation.NameInMap("SoftwareLongName")
        private String softwareLongName;

        @com.aliyun.core.annotation.NameInMap("SoftwareName")
        private String softwareName;

        @com.aliyun.core.annotation.NameInMap("SoftwareVersions")
        private java.util.List < String > softwareVersions;

        private Softwares(Builder builder) {
            this.helpLink = builder.helpLink;
            this.lastModified = builder.lastModified;
            this.locations = builder.locations;
            this.promotion = builder.promotion;
            this.softwareDefaultVersion = builder.softwareDefaultVersion;
            this.softwareDescription = builder.softwareDescription;
            this.softwareIcon = builder.softwareIcon;
            this.softwareLicenseFee = builder.softwareLicenseFee;
            this.softwareLongName = builder.softwareLongName;
            this.softwareName = builder.softwareName;
            this.softwareVersions = builder.softwareVersions;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Softwares create() {
            return builder().build();
        }

        /**
         * @return helpLink
         */
        public String getHelpLink() {
            return this.helpLink;
        }

        /**
         * @return lastModified
         */
        public String getLastModified() {
            return this.lastModified;
        }

        /**
         * @return locations
         */
        public java.util.List < String > getLocations() {
            return this.locations;
        }

        /**
         * @return promotion
         */
        public String getPromotion() {
            return this.promotion;
        }

        /**
         * @return softwareDefaultVersion
         */
        public String getSoftwareDefaultVersion() {
            return this.softwareDefaultVersion;
        }

        /**
         * @return softwareDescription
         */
        public String getSoftwareDescription() {
            return this.softwareDescription;
        }

        /**
         * @return softwareIcon
         */
        public String getSoftwareIcon() {
            return this.softwareIcon;
        }

        /**
         * @return softwareLicenseFee
         */
        public Float getSoftwareLicenseFee() {
            return this.softwareLicenseFee;
        }

        /**
         * @return softwareLongName
         */
        public String getSoftwareLongName() {
            return this.softwareLongName;
        }

        /**
         * @return softwareName
         */
        public String getSoftwareName() {
            return this.softwareName;
        }

        /**
         * @return softwareVersions
         */
        public java.util.List < String > getSoftwareVersions() {
            return this.softwareVersions;
        }

        public static final class Builder {
            private String helpLink; 
            private String lastModified; 
            private java.util.List < String > locations; 
            private String promotion; 
            private String softwareDefaultVersion; 
            private String softwareDescription; 
            private String softwareIcon; 
            private Float softwareLicenseFee; 
            private String softwareLongName; 
            private String softwareName; 
            private java.util.List < String > softwareVersions; 

            /**
             * HelpLink.
             */
            public Builder helpLink(String helpLink) {
                this.helpLink = helpLink;
                return this;
            }

            /**
             * LastModified.
             */
            public Builder lastModified(String lastModified) {
                this.lastModified = lastModified;
                return this;
            }

            /**
             * Locations.
             */
            public Builder locations(java.util.List < String > locations) {
                this.locations = locations;
                return this;
            }

            /**
             * Promotion.
             */
            public Builder promotion(String promotion) {
                this.promotion = promotion;
                return this;
            }

            /**
             * SoftwareDefaultVersion.
             */
            public Builder softwareDefaultVersion(String softwareDefaultVersion) {
                this.softwareDefaultVersion = softwareDefaultVersion;
                return this;
            }

            /**
             * SoftwareDescription.
             */
            public Builder softwareDescription(String softwareDescription) {
                this.softwareDescription = softwareDescription;
                return this;
            }

            /**
             * SoftwareIcon.
             */
            public Builder softwareIcon(String softwareIcon) {
                this.softwareIcon = softwareIcon;
                return this;
            }

            /**
             * SoftwareLicenseFee.
             */
            public Builder softwareLicenseFee(Float softwareLicenseFee) {
                this.softwareLicenseFee = softwareLicenseFee;
                return this;
            }

            /**
             * SoftwareLongName.
             */
            public Builder softwareLongName(String softwareLongName) {
                this.softwareLongName = softwareLongName;
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
             * SoftwareVersions.
             */
            public Builder softwareVersions(java.util.List < String > softwareVersions) {
                this.softwareVersions = softwareVersions;
                return this;
            }

            public Softwares build() {
                return new Softwares(this);
            } 

        } 

    }
}
