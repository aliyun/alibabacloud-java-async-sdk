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
         * <p>The list of deleted files.</p>
         */
        public Builder deleteFileResultList(java.util.List < DeleteFileResultList> deleteFileResultList) {
            this.deleteFileResultList = deleteFileResultList;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p><strong><strong>2876-6263-4B75-8F2C-CD0F7FCF</strong></strong></p>
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
             * <p>The time when the file was created. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>1660638613798</p>
             */
            public Builder createTimestamp(Long createTimestamp) {
                this.createTimestamp = createTimestamp;
                return this;
            }

            /**
             * <p>The result of deletion. A value of OK indicates that the file is deleted. Other values indicate that the file failed to be deleted.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>OK: The file was deleted.</li>
             * <li>NotFound: The file was not found.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>OK</p>
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
