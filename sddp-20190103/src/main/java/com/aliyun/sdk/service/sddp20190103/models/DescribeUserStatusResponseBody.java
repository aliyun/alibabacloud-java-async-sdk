// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sddp20190103.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeUserStatusResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeUserStatusResponseBody</p>
 */
public class DescribeUserStatusResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("UserStatus")
    private UserStatus userStatus;

    private DescribeUserStatusResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.userStatus = builder.userStatus;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeUserStatusResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return userStatus
     */
    public UserStatus getUserStatus() {
        return this.userStatus;
    }

    public static final class Builder {
        private String requestId; 
        private UserStatus userStatus; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * UserStatus.
         */
        public Builder userStatus(UserStatus userStatus) {
            this.userStatus = userStatus;
            return this;
        }

        public DescribeUserStatusResponseBody build() {
            return new DescribeUserStatusResponseBody(this);
        } 

    } 

    public static class UserStatus extends TeaModel {
        @NameInMap("AccessKeyId")
        private String accessKeyId;

        @NameInMap("Authed")
        private Boolean authed;

        @NameInMap("ChargeType")
        private String chargeType;

        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("InstanceNum")
        private Integer instanceNum;

        @NameInMap("LabStatus")
        private Integer labStatus;

        @NameInMap("Purchased")
        private Boolean purchased;

        @NameInMap("RemainDays")
        private Integer remainDays;

        @NameInMap("Trail")
        private Boolean trail;

        @NameInMap("UseInstanceNum")
        private Integer useInstanceNum;

        @NameInMap("UseOssSize")
        private Long useOssSize;

        private UserStatus(Builder builder) {
            this.accessKeyId = builder.accessKeyId;
            this.authed = builder.authed;
            this.chargeType = builder.chargeType;
            this.instanceId = builder.instanceId;
            this.instanceNum = builder.instanceNum;
            this.labStatus = builder.labStatus;
            this.purchased = builder.purchased;
            this.remainDays = builder.remainDays;
            this.trail = builder.trail;
            this.useInstanceNum = builder.useInstanceNum;
            this.useOssSize = builder.useOssSize;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UserStatus create() {
            return builder().build();
        }

        /**
         * @return accessKeyId
         */
        public String getAccessKeyId() {
            return this.accessKeyId;
        }

        /**
         * @return authed
         */
        public Boolean getAuthed() {
            return this.authed;
        }

        /**
         * @return chargeType
         */
        public String getChargeType() {
            return this.chargeType;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return instanceNum
         */
        public Integer getInstanceNum() {
            return this.instanceNum;
        }

        /**
         * @return labStatus
         */
        public Integer getLabStatus() {
            return this.labStatus;
        }

        /**
         * @return purchased
         */
        public Boolean getPurchased() {
            return this.purchased;
        }

        /**
         * @return remainDays
         */
        public Integer getRemainDays() {
            return this.remainDays;
        }

        /**
         * @return trail
         */
        public Boolean getTrail() {
            return this.trail;
        }

        /**
         * @return useInstanceNum
         */
        public Integer getUseInstanceNum() {
            return this.useInstanceNum;
        }

        /**
         * @return useOssSize
         */
        public Long getUseOssSize() {
            return this.useOssSize;
        }

        public static final class Builder {
            private String accessKeyId; 
            private Boolean authed; 
            private String chargeType; 
            private String instanceId; 
            private Integer instanceNum; 
            private Integer labStatus; 
            private Boolean purchased; 
            private Integer remainDays; 
            private Boolean trail; 
            private Integer useInstanceNum; 
            private Long useOssSize; 

            /**
             * AccessKeyId.
             */
            public Builder accessKeyId(String accessKeyId) {
                this.accessKeyId = accessKeyId;
                return this;
            }

            /**
             * Authed.
             */
            public Builder authed(Boolean authed) {
                this.authed = authed;
                return this;
            }

            /**
             * ChargeType.
             */
            public Builder chargeType(String chargeType) {
                this.chargeType = chargeType;
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
             * InstanceNum.
             */
            public Builder instanceNum(Integer instanceNum) {
                this.instanceNum = instanceNum;
                return this;
            }

            /**
             * LabStatus.
             */
            public Builder labStatus(Integer labStatus) {
                this.labStatus = labStatus;
                return this;
            }

            /**
             * Purchased.
             */
            public Builder purchased(Boolean purchased) {
                this.purchased = purchased;
                return this;
            }

            /**
             * RemainDays.
             */
            public Builder remainDays(Integer remainDays) {
                this.remainDays = remainDays;
                return this;
            }

            /**
             * Trail.
             */
            public Builder trail(Boolean trail) {
                this.trail = trail;
                return this;
            }

            /**
             * UseInstanceNum.
             */
            public Builder useInstanceNum(Integer useInstanceNum) {
                this.useInstanceNum = useInstanceNum;
                return this;
            }

            /**
             * UseOssSize.
             */
            public Builder useOssSize(Long useOssSize) {
                this.useOssSize = useOssSize;
                return this;
            }

            public UserStatus build() {
                return new UserStatus(this);
            } 

        } 

    }
}
