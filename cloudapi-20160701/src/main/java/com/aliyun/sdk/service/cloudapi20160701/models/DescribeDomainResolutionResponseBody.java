// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160701.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDomainResolutionResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDomainResolutionResponseBody</p>
 */
public class DescribeDomainResolutionResponseBody extends TeaModel {
    @NameInMap("DomainResolutions")
    private DomainResolutions domainResolutions;

    @NameInMap("GroupId")
    private String groupId;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeDomainResolutionResponseBody(Builder builder) {
        this.domainResolutions = builder.domainResolutions;
        this.groupId = builder.groupId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDomainResolutionResponseBody create() {
        return builder().build();
    }

    /**
     * @return domainResolutions
     */
    public DomainResolutions getDomainResolutions() {
        return this.domainResolutions;
    }

    /**
     * @return groupId
     */
    public String getGroupId() {
        return this.groupId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private DomainResolutions domainResolutions; 
        private String groupId; 
        private String requestId; 

        /**
         * DomainResolutions.
         */
        public Builder domainResolutions(DomainResolutions domainResolutions) {
            this.domainResolutions = domainResolutions;
            return this;
        }

        /**
         * GroupId.
         */
        public Builder groupId(String groupId) {
            this.groupId = groupId;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeDomainResolutionResponseBody build() {
            return new DescribeDomainResolutionResponseBody(this);
        } 

    } 

    public static class DomainResolution extends TeaModel {
        @NameInMap("DomainName")
        private String domainName;

        @NameInMap("DomainNameResolution")
        private String domainNameResolution;

        private DomainResolution(Builder builder) {
            this.domainName = builder.domainName;
            this.domainNameResolution = builder.domainNameResolution;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DomainResolution create() {
            return builder().build();
        }

        /**
         * @return domainName
         */
        public String getDomainName() {
            return this.domainName;
        }

        /**
         * @return domainNameResolution
         */
        public String getDomainNameResolution() {
            return this.domainNameResolution;
        }

        public static final class Builder {
            private String domainName; 
            private String domainNameResolution; 

            /**
             * DomainName.
             */
            public Builder domainName(String domainName) {
                this.domainName = domainName;
                return this;
            }

            /**
             * DomainNameResolution.
             */
            public Builder domainNameResolution(String domainNameResolution) {
                this.domainNameResolution = domainNameResolution;
                return this;
            }

            public DomainResolution build() {
                return new DomainResolution(this);
            } 

        } 

    }
    public static class DomainResolutions extends TeaModel {
        @NameInMap("DomainResolution")
        private java.util.List < DomainResolution> domainResolution;

        private DomainResolutions(Builder builder) {
            this.domainResolution = builder.domainResolution;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DomainResolutions create() {
            return builder().build();
        }

        /**
         * @return domainResolution
         */
        public java.util.List < DomainResolution> getDomainResolution() {
            return this.domainResolution;
        }

        public static final class Builder {
            private java.util.List < DomainResolution> domainResolution; 

            /**
             * DomainResolution.
             */
            public Builder domainResolution(java.util.List < DomainResolution> domainResolution) {
                this.domainResolution = domainResolution;
                return this;
            }

            public DomainResolutions build() {
                return new DomainResolutions(this);
            } 

        } 

    }
}
