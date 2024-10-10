// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
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
         * <p>The data returned if the call is successful.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>7532B7EE-7CE7-5F4D-BF04-B12447DDCAE1</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListRdDefaultSyncListResponseBody build() {
            return new ListRdDefaultSyncListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListRdDefaultSyncListResponseBody} extends {@link TeaModel}
     *
     * <p>ListRdDefaultSyncListResponseBody</p>
     */
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
             * <p>The IDs of the folders in the resource directory.</p>
             * 
             * <strong>example:</strong>
             * <p>fd-BwoXuf****,fd-CFamY7****</p>
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
