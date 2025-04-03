// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.config20200907.models;

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
 * {@link GetAggregateAdvancedSearchFileResponseBody} extends {@link TeaModel}
 *
 * <p>GetAggregateAdvancedSearchFileResponseBody</p>
 */
public class GetAggregateAdvancedSearchFileResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ResourceSearch")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(GetAggregateAdvancedSearchFileResponseBody model) {
            this.requestId = model.requestId;
            this.resourceSearch = model.resourceSearch;
        } 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>6DB86284-DB7F-5936-B210-3B53D6D41B03</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The information about the resource file.</p>
         */
        public Builder resourceSearch(ResourceSearch resourceSearch) {
            this.resourceSearch = resourceSearch;
            return this;
        }

        public GetAggregateAdvancedSearchFileResponseBody build() {
            return new GetAggregateAdvancedSearchFileResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetAggregateAdvancedSearchFileResponseBody} extends {@link TeaModel}
     *
     * <p>GetAggregateAdvancedSearchFileResponseBody</p>
     */
    public static class ResourceSearch extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DownloadUrl")
        private String downloadUrl;

        @com.aliyun.core.annotation.NameInMap("ResourceInventoryGenerateTime")
        private Long resourceInventoryGenerateTime;

        @com.aliyun.core.annotation.NameInMap("Status")
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

            private Builder() {
            } 

            private Builder(ResourceSearch model) {
                this.downloadUrl = model.downloadUrl;
                this.resourceInventoryGenerateTime = model.resourceInventoryGenerateTime;
                this.status = model.status;
            } 

            /**
             * <p>The download URL of the resource file.</p>
             */
            public Builder downloadUrl(String downloadUrl) {
                this.downloadUrl = downloadUrl;
                return this;
            }

            /**
             * <p>The time when the resource file was generated. The value is a timestamp.</p>
             * <p>Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1691375618130</p>
             */
            public Builder resourceInventoryGenerateTime(Long resourceInventoryGenerateTime) {
                this.resourceInventoryGenerateTime = resourceInventoryGenerateTime;
                return this;
            }

            /**
             * <p>The generation status of the resource file. Valid values:</p>
             * <ul>
             * <li>CREATING: The resource file is being generated.</li>
             * <li>COMPLETE: The resource file is generated.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>COMPLETE</p>
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
