// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QuerySearchIndexResponseBody} extends {@link TeaModel}
 *
 * <p>QuerySearchIndexResponseBody</p>
 */
public class QuerySearchIndexResponseBody extends TeaModel {
    @NameInMap("IndexConfig")
    private String indexConfig;

    @NameInMap("IndexType")
    private String indexType;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("SearchLibName")
    private String searchLibName;

    private QuerySearchIndexResponseBody(Builder builder) {
        this.indexConfig = builder.indexConfig;
        this.indexType = builder.indexType;
        this.requestId = builder.requestId;
        this.searchLibName = builder.searchLibName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QuerySearchIndexResponseBody create() {
        return builder().build();
    }

    /**
     * @return indexConfig
     */
    public String getIndexConfig() {
        return this.indexConfig;
    }

    /**
     * @return indexType
     */
    public String getIndexType() {
        return this.indexType;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return searchLibName
     */
    public String getSearchLibName() {
        return this.searchLibName;
    }

    public static final class Builder {
        private String indexConfig; 
        private String indexType; 
        private String requestId; 
        private String searchLibName; 

        /**
         * IndexConfig.
         */
        public Builder indexConfig(String indexConfig) {
            this.indexConfig = indexConfig;
            return this;
        }

        /**
         * IndexType.
         */
        public Builder indexType(String indexType) {
            this.indexType = indexType;
            return this;
        }

        /**
         * Id of the request
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * SearchLibName.
         */
        public Builder searchLibName(String searchLibName) {
            this.searchLibName = searchLibName;
            return this;
        }

        public QuerySearchIndexResponseBody build() {
            return new QuerySearchIndexResponseBody(this);
        } 

    } 

}
