// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nas20170626.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetRecycleBinAttributeResponseBody} extends {@link TeaModel}
 *
 * <p>GetRecycleBinAttributeResponseBody</p>
 */
public class GetRecycleBinAttributeResponseBody extends TeaModel {
    @NameInMap("RecycleBinAttribute")
    private RecycleBinAttribute recycleBinAttribute;

    @NameInMap("RequestId")
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
         * RecycleBinAttribute.
         */
        public Builder recycleBinAttribute(RecycleBinAttribute recycleBinAttribute) {
            this.recycleBinAttribute = recycleBinAttribute;
            return this;
        }

        /**
         * Id of the request
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
        @NameInMap("EnableTime")
        private String enableTime;

        @NameInMap("ReservedDays")
        private Long reservedDays;

        @NameInMap("Size")
        private Long size;

        @NameInMap("Status")
        private String status;

        private RecycleBinAttribute(Builder builder) {
            this.enableTime = builder.enableTime;
            this.reservedDays = builder.reservedDays;
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
            private String enableTime; 
            private Long reservedDays; 
            private Long size; 
            private String status; 

            /**
             * EnableTime.
             */
            public Builder enableTime(String enableTime) {
                this.enableTime = enableTime;
                return this;
            }

            /**
             * ReservedDays.
             */
            public Builder reservedDays(Long reservedDays) {
                this.reservedDays = reservedDays;
                return this;
            }

            /**
             * Size.
             */
            public Builder size(Long size) {
                this.size = size;
                return this;
            }

            /**
             * Status.
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
