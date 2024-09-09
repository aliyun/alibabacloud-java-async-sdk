// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nas20170626.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
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
         * The description of the recycle bin.
         */
        public Builder recycleBinAttribute(RecycleBinAttribute recycleBinAttribute) {
            this.recycleBinAttribute = recycleBinAttribute;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetRecycleBinAttributeResponseBody build() {
            return new GetRecycleBinAttributeResponseBody(this);
        } 

    } 

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
             * ArchiveSize.
             */
            public Builder archiveSize(Long archiveSize) {
                this.archiveSize = archiveSize;
                return this;
            }

            /**
             * The time at which the recycle bin was enabled.
             */
            public Builder enableTime(String enableTime) {
                this.enableTime = enableTime;
                return this;
            }

            /**
             * The retention period of the files in the recycle bin. Unit: days.
             * <p>
             * 
             * If the recycle bin is disabled, 0 is returned for this parameter.
             */
            public Builder reservedDays(Long reservedDays) {
                this.reservedDays = reservedDays;
                return this;
            }

            /**
             * The size of the cold data that is dumped to the recycle bin. Unit: bytes.
             */
            public Builder secondarySize(Long secondarySize) {
                this.secondarySize = secondarySize;
                return this;
            }

            /**
             * The size of the files that are dumped to the recycle bin. Unit: bytes.
             */
            public Builder size(Long size) {
                this.size = size;
                return this;
            }

            /**
             * The status of the recycle bin.
             * <p>
             * 
             * Valid values:
             * 
             * *   Enable: The recycle bin is enabled.
             * *   Disable: The recycle bin is disabled.
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
