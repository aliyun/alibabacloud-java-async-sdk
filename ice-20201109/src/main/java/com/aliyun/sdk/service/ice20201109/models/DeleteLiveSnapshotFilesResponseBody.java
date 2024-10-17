// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DeleteLiveSnapshotFilesResponseBody} extends {@link TeaModel}
 *
 * <p>DeleteLiveSnapshotFilesResponseBody</p>
 */
public class DeleteLiveSnapshotFilesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DeleteFileResultList")
    private java.util.List < DeleteFileResultList> deleteFileResultList;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DeleteLiveSnapshotFilesResponseBody(Builder builder) {
        this.deleteFileResultList = builder.deleteFileResultList;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteLiveSnapshotFilesResponseBody create() {
        return builder().build();
    }

    /**
     * @return deleteFileResultList
     */
    public java.util.List < DeleteFileResultList> getDeleteFileResultList() {
        return this.deleteFileResultList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < DeleteFileResultList> deleteFileResultList; 
        private String requestId; 

        /**
         * DeleteFileResultList.
         */
        public Builder deleteFileResultList(java.util.List < DeleteFileResultList> deleteFileResultList) {
            this.deleteFileResultList = deleteFileResultList;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DeleteLiveSnapshotFilesResponseBody build() {
            return new DeleteLiveSnapshotFilesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DeleteLiveSnapshotFilesResponseBody} extends {@link TeaModel}
     *
     * <p>DeleteLiveSnapshotFilesResponseBody</p>
     */
    public static class DeleteFileResultList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTimestamp")
        private Long createTimestamp;

        @com.aliyun.core.annotation.NameInMap("Result")
        private String result;

        private DeleteFileResultList(Builder builder) {
            this.createTimestamp = builder.createTimestamp;
            this.result = builder.result;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DeleteFileResultList create() {
            return builder().build();
        }

        /**
         * @return createTimestamp
         */
        public Long getCreateTimestamp() {
            return this.createTimestamp;
        }

        /**
         * @return result
         */
        public String getResult() {
            return this.result;
        }

        public static final class Builder {
            private Long createTimestamp; 
            private String result; 

            /**
             * CreateTimestamp.
             */
            public Builder createTimestamp(Long createTimestamp) {
                this.createTimestamp = createTimestamp;
                return this;
            }

            /**
             * Result.
             */
            public Builder result(String result) {
                this.result = result;
                return this;
            }

            public DeleteFileResultList build() {
                return new DeleteFileResultList(this);
            } 

        } 

    }
}
