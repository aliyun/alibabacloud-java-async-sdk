// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aliding20230426.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryOrgHonorsResponseBody} extends {@link TeaModel}
 *
 * <p>QueryOrgHonorsResponseBody</p>
 */
public class QueryOrgHonorsResponseBody extends TeaModel {
    @NameInMap("nextToken")
    private String nextToken;

    @NameInMap("openHonors")
    private java.util.List < OpenHonors> openHonors;

    @NameInMap("requestId")
    private String requestId;

    private QueryOrgHonorsResponseBody(Builder builder) {
        this.nextToken = builder.nextToken;
        this.openHonors = builder.openHonors;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryOrgHonorsResponseBody create() {
        return builder().build();
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return openHonors
     */
    public java.util.List < OpenHonors> getOpenHonors() {
        return this.openHonors;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String nextToken; 
        private java.util.List < OpenHonors> openHonors; 
        private String requestId; 

        /**
         * nextToken.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * openHonors.
         */
        public Builder openHonors(java.util.List < OpenHonors> openHonors) {
            this.openHonors = openHonors;
            return this;
        }

        /**
         * requestId
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public QueryOrgHonorsResponseBody build() {
            return new QueryOrgHonorsResponseBody(this);
        } 

    } 

    public static class OpenHonors extends TeaModel {
        @NameInMap("honorDesc")
        private String honorDesc;

        @NameInMap("honorId")
        private Long honorId;

        @NameInMap("honorImgUrl")
        private String honorImgUrl;

        @NameInMap("honorName")
        private String honorName;

        @NameInMap("honorPendantImgUrl")
        private String honorPendantImgUrl;

        private OpenHonors(Builder builder) {
            this.honorDesc = builder.honorDesc;
            this.honorId = builder.honorId;
            this.honorImgUrl = builder.honorImgUrl;
            this.honorName = builder.honorName;
            this.honorPendantImgUrl = builder.honorPendantImgUrl;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OpenHonors create() {
            return builder().build();
        }

        /**
         * @return honorDesc
         */
        public String getHonorDesc() {
            return this.honorDesc;
        }

        /**
         * @return honorId
         */
        public Long getHonorId() {
            return this.honorId;
        }

        /**
         * @return honorImgUrl
         */
        public String getHonorImgUrl() {
            return this.honorImgUrl;
        }

        /**
         * @return honorName
         */
        public String getHonorName() {
            return this.honorName;
        }

        /**
         * @return honorPendantImgUrl
         */
        public String getHonorPendantImgUrl() {
            return this.honorPendantImgUrl;
        }

        public static final class Builder {
            private String honorDesc; 
            private Long honorId; 
            private String honorImgUrl; 
            private String honorName; 
            private String honorPendantImgUrl; 

            /**
             * honorDesc.
             */
            public Builder honorDesc(String honorDesc) {
                this.honorDesc = honorDesc;
                return this;
            }

            /**
             * honorId.
             */
            public Builder honorId(Long honorId) {
                this.honorId = honorId;
                return this;
            }

            /**
             * honorImgUrl.
             */
            public Builder honorImgUrl(String honorImgUrl) {
                this.honorImgUrl = honorImgUrl;
                return this;
            }

            /**
             * honorName.
             */
            public Builder honorName(String honorName) {
                this.honorName = honorName;
                return this;
            }

            /**
             * honorPendantImgUrl.
             */
            public Builder honorPendantImgUrl(String honorPendantImgUrl) {
                this.honorPendantImgUrl = honorPendantImgUrl;
                return this;
            }

            public OpenHonors build() {
                return new OpenHonors(this);
            } 

        } 

    }
}
