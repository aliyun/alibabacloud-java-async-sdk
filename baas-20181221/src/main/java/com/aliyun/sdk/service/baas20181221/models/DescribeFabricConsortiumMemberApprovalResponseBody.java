// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.baas20181221.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeFabricConsortiumMemberApprovalResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeFabricConsortiumMemberApprovalResponseBody</p>
 */
public class DescribeFabricConsortiumMemberApprovalResponseBody extends TeaModel {
    @NameInMap("ErrorCode")
    private Integer errorCode;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Result")
    private java.util.List < Result> result;

    @NameInMap("Success")
    private Boolean success;

    private DescribeFabricConsortiumMemberApprovalResponseBody(Builder builder) {
        this.errorCode = builder.errorCode;
        this.requestId = builder.requestId;
        this.result = builder.result;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeFabricConsortiumMemberApprovalResponseBody create() {
        return builder().build();
    }

    /**
     * @return errorCode
     */
    public Integer getErrorCode() {
        return this.errorCode;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return result
     */
    public java.util.List < Result> getResult() {
        return this.result;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private Integer errorCode; 
        private String requestId; 
        private java.util.List < Result> result; 
        private Boolean success; 

        /**
         * ErrorCode.
         */
        public Builder errorCode(Integer errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Result.
         */
        public Builder result(java.util.List < Result> result) {
            this.result = result;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public DescribeFabricConsortiumMemberApprovalResponseBody build() {
            return new DescribeFabricConsortiumMemberApprovalResponseBody(this);
        } 

    } 

    public static class Result extends TeaModel {
        @NameInMap("ChannelCreatePolicy")
        private String channelCreatePolicy;

        @NameInMap("ConfirmTime")
        private String confirmTime;

        @NameInMap("ConsortiumId")
        private String consortiumId;

        @NameInMap("ConsortiumName")
        private String consortiumName;

        @NameInMap("DomainName")
        private String domainName;

        @NameInMap("OrganizationId")
        private String organizationId;

        @NameInMap("OrganizationName")
        private String organizationName;

        @NameInMap("State")
        private String state;

        private Result(Builder builder) {
            this.channelCreatePolicy = builder.channelCreatePolicy;
            this.confirmTime = builder.confirmTime;
            this.consortiumId = builder.consortiumId;
            this.consortiumName = builder.consortiumName;
            this.domainName = builder.domainName;
            this.organizationId = builder.organizationId;
            this.organizationName = builder.organizationName;
            this.state = builder.state;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return channelCreatePolicy
         */
        public String getChannelCreatePolicy() {
            return this.channelCreatePolicy;
        }

        /**
         * @return confirmTime
         */
        public String getConfirmTime() {
            return this.confirmTime;
        }

        /**
         * @return consortiumId
         */
        public String getConsortiumId() {
            return this.consortiumId;
        }

        /**
         * @return consortiumName
         */
        public String getConsortiumName() {
            return this.consortiumName;
        }

        /**
         * @return domainName
         */
        public String getDomainName() {
            return this.domainName;
        }

        /**
         * @return organizationId
         */
        public String getOrganizationId() {
            return this.organizationId;
        }

        /**
         * @return organizationName
         */
        public String getOrganizationName() {
            return this.organizationName;
        }

        /**
         * @return state
         */
        public String getState() {
            return this.state;
        }

        public static final class Builder {
            private String channelCreatePolicy; 
            private String confirmTime; 
            private String consortiumId; 
            private String consortiumName; 
            private String domainName; 
            private String organizationId; 
            private String organizationName; 
            private String state; 

            /**
             * ChannelCreatePolicy.
             */
            public Builder channelCreatePolicy(String channelCreatePolicy) {
                this.channelCreatePolicy = channelCreatePolicy;
                return this;
            }

            /**
             * ConfirmTime.
             */
            public Builder confirmTime(String confirmTime) {
                this.confirmTime = confirmTime;
                return this;
            }

            /**
             * ConsortiumId.
             */
            public Builder consortiumId(String consortiumId) {
                this.consortiumId = consortiumId;
                return this;
            }

            /**
             * ConsortiumName.
             */
            public Builder consortiumName(String consortiumName) {
                this.consortiumName = consortiumName;
                return this;
            }

            /**
             * DomainName.
             */
            public Builder domainName(String domainName) {
                this.domainName = domainName;
                return this;
            }

            /**
             * OrganizationId.
             */
            public Builder organizationId(String organizationId) {
                this.organizationId = organizationId;
                return this;
            }

            /**
             * OrganizationName.
             */
            public Builder organizationName(String organizationName) {
                this.organizationName = organizationName;
                return this;
            }

            /**
             * State.
             */
            public Builder state(String state) {
                this.state = state;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
