// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vcs20200515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PeekNvrResponseBody} extends {@link TeaModel}
 *
 * <p>PeekNvrResponseBody</p>
 */
public class PeekNvrResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    private PeekNvrResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PeekNvrResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * Id of the request
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public PeekNvrResponseBody build() {
            return new PeekNvrResponseBody(this);
        } 

    } 

    public static class SubDeviceList extends TeaModel {
        @NameInMap("AssociatedPlatform")
        private String associatedPlatform;

        @NameInMap("SubDeviceId")
        private String subDeviceId;

        @NameInMap("SubDeviceName")
        private String subDeviceName;

        @NameInMap("SubDeviceNum")
        private String subDeviceNum;

        @NameInMap("SubDeviceStatus")
        private String subDeviceStatus;

        private SubDeviceList(Builder builder) {
            this.associatedPlatform = builder.associatedPlatform;
            this.subDeviceId = builder.subDeviceId;
            this.subDeviceName = builder.subDeviceName;
            this.subDeviceNum = builder.subDeviceNum;
            this.subDeviceStatus = builder.subDeviceStatus;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SubDeviceList create() {
            return builder().build();
        }

        /**
         * @return associatedPlatform
         */
        public String getAssociatedPlatform() {
            return this.associatedPlatform;
        }

        /**
         * @return subDeviceId
         */
        public String getSubDeviceId() {
            return this.subDeviceId;
        }

        /**
         * @return subDeviceName
         */
        public String getSubDeviceName() {
            return this.subDeviceName;
        }

        /**
         * @return subDeviceNum
         */
        public String getSubDeviceNum() {
            return this.subDeviceNum;
        }

        /**
         * @return subDeviceStatus
         */
        public String getSubDeviceStatus() {
            return this.subDeviceStatus;
        }

        public static final class Builder {
            private String associatedPlatform; 
            private String subDeviceId; 
            private String subDeviceName; 
            private String subDeviceNum; 
            private String subDeviceStatus; 

            /**
             * AssociatedPlatform.
             */
            public Builder associatedPlatform(String associatedPlatform) {
                this.associatedPlatform = associatedPlatform;
                return this;
            }

            /**
             * SubDeviceId.
             */
            public Builder subDeviceId(String subDeviceId) {
                this.subDeviceId = subDeviceId;
                return this;
            }

            /**
             * SubDeviceName.
             */
            public Builder subDeviceName(String subDeviceName) {
                this.subDeviceName = subDeviceName;
                return this;
            }

            /**
             * SubDeviceNum.
             */
            public Builder subDeviceNum(String subDeviceNum) {
                this.subDeviceNum = subDeviceNum;
                return this;
            }

            /**
             * SubDeviceStatus.
             */
            public Builder subDeviceStatus(String subDeviceStatus) {
                this.subDeviceStatus = subDeviceStatus;
                return this;
            }

            public SubDeviceList build() {
                return new SubDeviceList(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("IdleCount")
        private Long idleCount;

        @NameInMap("SubDeviceList")
        private java.util.List < SubDeviceList> subDeviceList;

        private Data(Builder builder) {
            this.idleCount = builder.idleCount;
            this.subDeviceList = builder.subDeviceList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return idleCount
         */
        public Long getIdleCount() {
            return this.idleCount;
        }

        /**
         * @return subDeviceList
         */
        public java.util.List < SubDeviceList> getSubDeviceList() {
            return this.subDeviceList;
        }

        public static final class Builder {
            private Long idleCount; 
            private java.util.List < SubDeviceList> subDeviceList; 

            /**
             * IdleCount.
             */
            public Builder idleCount(Long idleCount) {
                this.idleCount = idleCount;
                return this;
            }

            /**
             * SubDeviceList.
             */
            public Builder subDeviceList(java.util.List < SubDeviceList> subDeviceList) {
                this.subDeviceList = subDeviceList;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
