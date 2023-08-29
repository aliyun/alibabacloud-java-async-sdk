// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cas20200630.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetCAInstanceStatusResponseBody} extends {@link TeaModel}
 *
 * <p>GetCAInstanceStatusResponseBody</p>
 */
public class GetCAInstanceStatusResponseBody extends TeaModel {
    @NameInMap("InstanceStatusList")
    private java.util.List < InstanceStatusList> instanceStatusList;

    @NameInMap("RequestId")
    private String requestId;

    private GetCAInstanceStatusResponseBody(Builder builder) {
        this.instanceStatusList = builder.instanceStatusList;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetCAInstanceStatusResponseBody create() {
        return builder().build();
    }

    /**
     * @return instanceStatusList
     */
    public java.util.List < InstanceStatusList> getInstanceStatusList() {
        return this.instanceStatusList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < InstanceStatusList> instanceStatusList; 
        private String requestId; 

        /**
         * InstanceStatusList.
         */
        public Builder instanceStatusList(java.util.List < InstanceStatusList> instanceStatusList) {
            this.instanceStatusList = instanceStatusList;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetCAInstanceStatusResponseBody build() {
            return new GetCAInstanceStatusResponseBody(this);
        } 

    } 

    public static class InstanceStatusList extends TeaModel {
        @NameInMap("AfterTime")
        private Long afterTime;

        @NameInMap("BeforeTime")
        private Long beforeTime;

        @NameInMap("CertIssuedCount")
        private Integer certIssuedCount;

        @NameInMap("CertTotalCount")
        private Integer certTotalCount;

        @NameInMap("Identifier")
        private String identifier;

        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("Status")
        private String status;

        @NameInMap("Type")
        private String type;

        @NameInMap("UseExpireTime")
        private Long useExpireTime;

        private InstanceStatusList(Builder builder) {
            this.afterTime = builder.afterTime;
            this.beforeTime = builder.beforeTime;
            this.certIssuedCount = builder.certIssuedCount;
            this.certTotalCount = builder.certTotalCount;
            this.identifier = builder.identifier;
            this.instanceId = builder.instanceId;
            this.status = builder.status;
            this.type = builder.type;
            this.useExpireTime = builder.useExpireTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InstanceStatusList create() {
            return builder().build();
        }

        /**
         * @return afterTime
         */
        public Long getAfterTime() {
            return this.afterTime;
        }

        /**
         * @return beforeTime
         */
        public Long getBeforeTime() {
            return this.beforeTime;
        }

        /**
         * @return certIssuedCount
         */
        public Integer getCertIssuedCount() {
            return this.certIssuedCount;
        }

        /**
         * @return certTotalCount
         */
        public Integer getCertTotalCount() {
            return this.certTotalCount;
        }

        /**
         * @return identifier
         */
        public String getIdentifier() {
            return this.identifier;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return useExpireTime
         */
        public Long getUseExpireTime() {
            return this.useExpireTime;
        }

        public static final class Builder {
            private Long afterTime; 
            private Long beforeTime; 
            private Integer certIssuedCount; 
            private Integer certTotalCount; 
            private String identifier; 
            private String instanceId; 
            private String status; 
            private String type; 
            private Long useExpireTime; 

            /**
             * AfterTime.
             */
            public Builder afterTime(Long afterTime) {
                this.afterTime = afterTime;
                return this;
            }

            /**
             * BeforeTime.
             */
            public Builder beforeTime(Long beforeTime) {
                this.beforeTime = beforeTime;
                return this;
            }

            /**
             * CertIssuedCount.
             */
            public Builder certIssuedCount(Integer certIssuedCount) {
                this.certIssuedCount = certIssuedCount;
                return this;
            }

            /**
             * CertTotalCount.
             */
            public Builder certTotalCount(Integer certTotalCount) {
                this.certTotalCount = certTotalCount;
                return this;
            }

            /**
             * Identifier.
             */
            public Builder identifier(String identifier) {
                this.identifier = identifier;
                return this;
            }

            /**
             * InstanceId.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
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
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * UseExpireTime.
             */
            public Builder useExpireTime(Long useExpireTime) {
                this.useExpireTime = useExpireTime;
                return this;
            }

            public InstanceStatusList build() {
                return new InstanceStatusList(this);
            } 

        } 

    }
}
