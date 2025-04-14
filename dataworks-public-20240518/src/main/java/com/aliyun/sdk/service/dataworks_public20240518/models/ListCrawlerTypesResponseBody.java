// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20240518.models;

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
 * {@link ListCrawlerTypesResponseBody} extends {@link TeaModel}
 *
 * <p>ListCrawlerTypesResponseBody</p>
 */
public class ListCrawlerTypesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CrawlerTypes")
    private java.util.List<CrawlerType> crawlerTypes;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private ListCrawlerTypesResponseBody(Builder builder) {
        this.crawlerTypes = builder.crawlerTypes;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListCrawlerTypesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return crawlerTypes
     */
    public java.util.List<CrawlerType> getCrawlerTypes() {
        return this.crawlerTypes;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private java.util.List<CrawlerType> crawlerTypes; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(ListCrawlerTypesResponseBody model) {
            this.crawlerTypes = model.crawlerTypes;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * CrawlerTypes.
         */
        public Builder crawlerTypes(java.util.List<CrawlerType> crawlerTypes) {
            this.crawlerTypes = crawlerTypes;
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
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ListCrawlerTypesResponseBody build() {
            return new ListCrawlerTypesResponseBody(this);
        } 

    } 

}
