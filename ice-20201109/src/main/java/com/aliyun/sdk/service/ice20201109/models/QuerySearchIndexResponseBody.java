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
    @NameInMap("Code")
    private String code;

    @NameInMap("IndexStatus")
    private String indexStatus;

    @NameInMap("IndexType")
    private String indexType;

    @NameInMap("MediaTotal")
    private String mediaTotal;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("SearchLibName")
    private String searchLibName;

    @NameInMap("Success")
    private String success;

    private QuerySearchIndexResponseBody(Builder builder) {
        this.code = builder.code;
        this.indexStatus = builder.indexStatus;
        this.indexType = builder.indexType;
        this.mediaTotal = builder.mediaTotal;
        this.requestId = builder.requestId;
        this.searchLibName = builder.searchLibName;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QuerySearchIndexResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return indexStatus
     */
    public String getIndexStatus() {
        return this.indexStatus;
    }

    /**
     * @return indexType
     */
    public String getIndexType() {
        return this.indexType;
    }

    /**
     * @return mediaTotal
     */
    public String getMediaTotal() {
        return this.mediaTotal;
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

    /**
     * @return success
     */
    public String getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private String indexStatus; 
        private String indexType; 
        private String mediaTotal; 
        private String requestId; 
        private String searchLibName; 
        private String success; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * IndexStatus.
         */
        public Builder indexStatus(String indexStatus) {
            this.indexStatus = indexStatus;
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
         * MediaTotal.
         */
        public Builder mediaTotal(String mediaTotal) {
            this.mediaTotal = mediaTotal;
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

        /**
         * Success.
         */
        public Builder success(String success) {
            this.success = success;
            return this;
        }

        public QuerySearchIndexResponseBody build() {
            return new QuerySearchIndexResponseBody(this);
        } 

    } 

}
