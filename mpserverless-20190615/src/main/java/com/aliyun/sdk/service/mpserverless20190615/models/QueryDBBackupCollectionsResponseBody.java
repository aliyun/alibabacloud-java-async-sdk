// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mpserverless20190615.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryDBBackupCollectionsResponseBody} extends {@link TeaModel}
 *
 * <p>QueryDBBackupCollectionsResponseBody</p>
 */
public class QueryDBBackupCollectionsResponseBody extends TeaModel {
    @NameInMap("Collections")
    private java.util.List < String > collections;

    @NameInMap("RequestId")
    private String requestId;

    private QueryDBBackupCollectionsResponseBody(Builder builder) {
        this.collections = builder.collections;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryDBBackupCollectionsResponseBody create() {
        return builder().build();
    }

    /**
     * @return collections
     */
    public java.util.List < String > getCollections() {
        return this.collections;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < String > collections; 
        private String requestId; 

        /**
         * Collections.
         */
        public Builder collections(java.util.List < String > collections) {
            this.collections = collections;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public QueryDBBackupCollectionsResponseBody build() {
            return new QueryDBBackupCollectionsResponseBody(this);
        } 

    } 

}
