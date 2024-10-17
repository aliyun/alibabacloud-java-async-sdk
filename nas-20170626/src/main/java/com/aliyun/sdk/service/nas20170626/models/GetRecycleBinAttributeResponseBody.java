// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nas20170626.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetRecycleBinAttributeResponseBody} extends {@link TeaModel}
 *
 * <p>GetRecycleBinAttributeResponseBody</p>
 */
public class GetRecycleBinAttributeResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RecycleBinAttribute")
    private RecycleBinAttribute recycleBinAttribute;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetRecycleBinAttributeResponseBody(Builder builder) {
        this.recycleBinAttribute = builder.recycleBinAttribute;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetRecycleBinAttributeResponseBody create() {
        return builder().build();
    }

    /**
     * @return recycleBinAttribute
     */
    public RecycleBinAttribute getRecycleBinAttribute() {
        return this.recycleBinAttribute;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private RecycleBinAttribute recycleBinAttribute; 
        private String requestId; 

        /**
         * <p>The description of the recycle bin.</p>
         */
        public Builder recycleBinAttribute(RecycleBinAttribute recycleBinAttribute) {
            this.recycleBinAttribute = recycleBinAttribute;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>9E15E394-38A6-457A-A62A-D9797C9A****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetRecycleBinAttributeResponseBody build() {
            return new GetRecycleBinAttributeResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetRecycleBinAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>GetRecycleBinAttributeResponseBody</p>
     */
    public static class RecycleBinAttribute extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ArchiveSize")
        private Long archiveSize;

        @com.aliyun.core.annotation.NameInMap("EnableTime")
        private String enableTime;

        @com.aliyun.core.annotation.NameInMap("ReservedDays")
        private Long reservedDays;

        @com.aliyun.core.annotation.NameInMap("SecondarySize")
        private Long secondarySize;

        @com.aliyun.core.annotation.NameInMap("Size")
        private Long size;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private RecycleBinAttribute(Builder builder) {
            this.archiveSize = builder.archiveSize;
            this.enableTime = builder.enableTime;
            this.reservedDays = builder.reservedDays;
            this.secondarySize = builder.secondarySize;
            this.size = builder.size;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RecycleBinAttribute create() {
            return builder().build();
        }

        /**
         * @return archiveSize
         */
        public Long getArchiveSize() {
            return this.archiveSize;
        }

        /**
         * @return enableTime
         */
        public String getEnableTime() {
            return this.enableTime;
        }

        /**
         * @return reservedDays
         */
        public Long getReservedDays() {
            return this.reservedDays;
        }

        /**
         * @return secondarySize
         */
        public Long getSecondarySize() {
            return this.secondarySize;
        }

        /**
         * @return size
         */
        public Long getSize() {
            return this.size;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private Long archiveSize; 
            private String enableTime; 
            private Long reservedDays; 
            private Long secondarySize; 
            private Long size; 
            private String status; 

            /**
             * <p>The size of the archived data that is dumped to the recycle bin. Unit: bytes.</p>
             * 
             * <strong>example:</strong>
             * <p>1611661312</p>
             */
            public Builder archiveSize(Long archiveSize) {
                this.archiveSize = archiveSize;
                return this;
            }

            /**
             * <p>The time at which the recycle bin was enabled.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-05-30T10:08:08Z</p>
             */
            public Builder enableTime(String enableTime) {
                this.enableTime = enableTime;
                return this;
            }

            /**
             * <p>The retention period of the files in the recycle bin. Unit: days.</p>
             * <p>If the recycle bin is disabled, 0 is returned for this parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder reservedDays(Long reservedDays) {
                this.reservedDays = reservedDays;
                return this;
            }

            /**
             * <p>The size of the Infrequent Access (IA) data that is dumped to the recycle bin. Unit: bytes.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder secondarySize(Long secondarySize) {
                this.secondarySize = secondarySize;
                return this;
            }

            /**
             * <p>The size of the files that are dumped to the recycle bin. Unit: bytes.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder size(Long size) {
                this.size = size;
                return this;
            }

            /**
             * <p>The status of the recycle bin.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>Enable: The recycle bin is enabled.</li>
             * <li>Disable: The recycle bin is disabled.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Disable</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public RecycleBinAttribute build() {
                return new RecycleBinAttribute(this);
            } 

        } 

    }
}
