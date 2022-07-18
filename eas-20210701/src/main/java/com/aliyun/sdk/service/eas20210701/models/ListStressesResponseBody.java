// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eas20210701.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListStressesResponseBody} extends {@link TeaModel}
 *
 * <p>ListStressesResponseBody</p>
 */
public class ListStressesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Stresses")
    private java.util.List < Stresses> stresses;

    private ListStressesResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.stresses = builder.stresses;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListStressesResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return stresses
     */
    public java.util.List < Stresses> getStresses() {
        return this.stresses;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List < Stresses> stresses; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Stresses.
         */
        public Builder stresses(java.util.List < Stresses> stresses) {
            this.stresses = stresses;
            return this;
        }

        public ListStressesResponseBody build() {
            return new ListStressesResponseBody(this);
        } 

    } 

    public static class Stresses extends TeaModel {
        @NameInMap("AvailableAgent")
        private Long availableAgent;

        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("Message")
        private String message;

        @NameInMap("Region")
        private String region;

        @NameInMap("ServiceName")
        private String serviceName;

        @NameInMap("Status")
        private String status;

        @NameInMap("StressName")
        private String stressName;

        @NameInMap("UpdateTime")
        private String updateTime;

        private Stresses(Builder builder) {
            this.availableAgent = builder.availableAgent;
            this.createTime = builder.createTime;
            this.message = builder.message;
            this.region = builder.region;
            this.serviceName = builder.serviceName;
            this.status = builder.status;
            this.stressName = builder.stressName;
            this.updateTime = builder.updateTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Stresses create() {
            return builder().build();
        }

        /**
         * @return availableAgent
         */
        public Long getAvailableAgent() {
            return this.availableAgent;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        /**
         * @return region
         */
        public String getRegion() {
            return this.region;
        }

        /**
         * @return serviceName
         */
        public String getServiceName() {
            return this.serviceName;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return stressName
         */
        public String getStressName() {
            return this.stressName;
        }

        /**
         * @return updateTime
         */
        public String getUpdateTime() {
            return this.updateTime;
        }

        public static final class Builder {
            private Long availableAgent; 
            private String createTime; 
            private String message; 
            private String region; 
            private String serviceName; 
            private String status; 
            private String stressName; 
            private String updateTime; 

            /**
             * AvailableAgent.
             */
            public Builder availableAgent(Long availableAgent) {
                this.availableAgent = availableAgent;
                return this;
            }

            /**
             * CreateTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
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
             * Region.
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            /**
             * ServiceName.
             */
            public Builder serviceName(String serviceName) {
                this.serviceName = serviceName;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * StressName.
             */
            public Builder stressName(String stressName) {
                this.stressName = stressName;
                return this;
            }

            /**
             * UpdateTime.
             */
            public Builder updateTime(String updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            public Stresses build() {
                return new Stresses(this);
            } 

        } 

    }
}
