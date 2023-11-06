// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.config20200907.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetAggregateAdvancedSearchFileResponseBody} extends {@link TeaModel}
 *
 * <p>GetAggregateAdvancedSearchFileResponseBody</p>
 */
public class GetAggregateAdvancedSearchFileResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("ResourceSearch")
    private ResourceSearch resourceSearch;

    private GetAggregateAdvancedSearchFileResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.resourceSearch = builder.resourceSearch;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAggregateAdvancedSearchFileResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return resourceSearch
     */
    public ResourceSearch getResourceSearch() {
        return this.resourceSearch;
    }

    public static final class Builder {
        private String requestId; 
        private ResourceSearch resourceSearch; 

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The information about the resource file.
         */
        public Builder resourceSearch(ResourceSearch resourceSearch) {
            this.resourceSearch = resourceSearch;
            return this;
        }

        public GetAggregateAdvancedSearchFileResponseBody build() {
            return new GetAggregateAdvancedSearchFileResponseBody(this);
        } 

    } 

    public static class ResourceSearch extends TeaModel {
        @NameInMap("DownloadUrl")
        private String downloadUrl;

        @NameInMap("ResourceInventoryGenerateTime")
        private Long resourceInventoryGenerateTime;

        @NameInMap("Status")
        private String status;

        private ResourceSearch(Builder builder) {
            this.downloadUrl = builder.downloadUrl;
            this.resourceInventoryGenerateTime = builder.resourceInventoryGenerateTime;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResourceSearch create() {
            return builder().build();
        }

        /**
         * @return downloadUrl
         */
        public String getDownloadUrl() {
            return this.downloadUrl;
        }

        /**
         * @return resourceInventoryGenerateTime
         */
        public Long getResourceInventoryGenerateTime() {
            return this.resourceInventoryGenerateTime;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String downloadUrl; 
            private Long resourceInventoryGenerateTime; 
            private String status; 

            /**
             * The download URL of the resource file.
             */
            public Builder downloadUrl(String downloadUrl) {
                this.downloadUrl = downloadUrl;
                return this;
            }

            /**
             * The time when the resource file was generated. The value is a timestamp.
             * <p>
             * 
             * Unit: milliseconds.
             */
            public Builder resourceInventoryGenerateTime(Long resourceInventoryGenerateTime) {
                this.resourceInventoryGenerateTime = resourceInventoryGenerateTime;
                return this;
            }

            /**
             * The generation status of the resource file. Valid values:
             * <p>
             * 
             * *   CREATING: The resource file is being generated.
             * *   COMPLETE: The resource file is generated.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public ResourceSearch build() {
                return new ResourceSearch(this);
            } 

        } 

    }
}
