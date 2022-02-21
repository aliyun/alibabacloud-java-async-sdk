// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeVulDetailsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeVulDetailsResponseBody</p>
 */
public class DescribeVulDetailsResponseBody extends TeaModel {
    @NameInMap("Cves")
    private java.util.List < Cves> cves;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeVulDetailsResponseBody(Builder builder) {
        this.cves = builder.cves;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeVulDetailsResponseBody create() {
        return builder().build();
    }

    /**
     * @return cves
     */
    public java.util.List < Cves> getCves() {
        return this.cves;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < Cves> cves; 
        private String requestId; 

        /**
         * Cves.
         */
        public Builder cves(java.util.List < Cves> cves) {
            this.cves = cves;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeVulDetailsResponseBody build() {
            return new DescribeVulDetailsResponseBody(this);
        } 

    } 

    public static class Cves extends TeaModel {
        @NameInMap("CveId")
        private String cveId;

        @NameInMap("CvssScore")
        private String cvssScore;

        @NameInMap("Summary")
        private String summary;

        @NameInMap("Title")
        private String title;

        private Cves(Builder builder) {
            this.cveId = builder.cveId;
            this.cvssScore = builder.cvssScore;
            this.summary = builder.summary;
            this.title = builder.title;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Cves create() {
            return builder().build();
        }

        /**
         * @return cveId
         */
        public String getCveId() {
            return this.cveId;
        }

        /**
         * @return cvssScore
         */
        public String getCvssScore() {
            return this.cvssScore;
        }

        /**
         * @return summary
         */
        public String getSummary() {
            return this.summary;
        }

        /**
         * @return title
         */
        public String getTitle() {
            return this.title;
        }

        public static final class Builder {
            private String cveId; 
            private String cvssScore; 
            private String summary; 
            private String title; 

            /**
             * CveId.
             */
            public Builder cveId(String cveId) {
                this.cveId = cveId;
                return this;
            }

            /**
             * CvssScore.
             */
            public Builder cvssScore(String cvssScore) {
                this.cvssScore = cvssScore;
                return this;
            }

            /**
             * Summary.
             */
            public Builder summary(String summary) {
                this.summary = summary;
                return this;
            }

            /**
             * Title.
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            public Cves build() {
                return new Cves(this);
            } 

        } 

    }
}
