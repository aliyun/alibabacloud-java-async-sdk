// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListRdDefaultSyncListResponseBody} extends {@link TeaModel}
 *
 * <p>ListRdDefaultSyncListResponseBody</p>
 */
public class ListRdDefaultSyncListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListRdDefaultSyncListResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListRdDefaultSyncListResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Data data; 
        private String requestId; 

        /**
         * The data returned if the call is successful.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListRdDefaultSyncListResponseBody build() {
            return new ListRdDefaultSyncListResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FolderIds")
        private String folderIds;

        private Data(Builder builder) {
            this.folderIds = builder.folderIds;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return folderIds
         */
        public String getFolderIds() {
            return this.folderIds;
        }

        public static final class Builder {
            private String folderIds; 

            /**
             * The IDs of the folders in the resource directory.
             */
            public Builder folderIds(String folderIds) {
                this.folderIds = folderIds;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
