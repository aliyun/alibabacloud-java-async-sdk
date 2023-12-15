// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.baas20180731.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeEthereumsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeEthereumsResponseBody</p>
 */
public class DescribeEthereumsResponseBody extends TeaModel {
    @NameInMap("ErrorCode")
    private Integer errorCode;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Result")
    private java.util.List < Result> result;

    @NameInMap("Success")
    private Boolean success;

    private DescribeEthereumsResponseBody(Builder builder) {
        this.errorCode = builder.errorCode;
        this.requestId = builder.requestId;
        this.result = builder.result;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeEthereumsResponseBody create() {
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

        public DescribeEthereumsResponseBody build() {
            return new DescribeEthereumsResponseBody(this);
        } 

    } 

    public static class Result extends TeaModel {
        @NameInMap("Consensus")
        private String consensus;

        @NameInMap("CreateTime")
        private Long createTime;

        @NameInMap("Creator")
        private String creator;

        @NameInMap("Deletable")
        private Boolean deletable;

        @NameInMap("Description")
        private String description;

        @NameInMap("Id")
        private String id;

        @NameInMap("Name")
        private String name;

        @NameInMap("NetworkId")
        private String networkId;

        @NameInMap("NodeNumber")
        private Integer nodeNumber;

        @NameInMap("RegionId")
        private String regionId;

        @NameInMap("State")
        private String state;

        private Result(Builder builder) {
            this.consensus = builder.consensus;
            this.createTime = builder.createTime;
            this.creator = builder.creator;
            this.deletable = builder.deletable;
            this.description = builder.description;
            this.id = builder.id;
            this.name = builder.name;
            this.networkId = builder.networkId;
            this.nodeNumber = builder.nodeNumber;
            this.regionId = builder.regionId;
            this.state = builder.state;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return consensus
         */
        public String getConsensus() {
            return this.consensus;
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return creator
         */
        public String getCreator() {
            return this.creator;
        }

        /**
         * @return deletable
         */
        public Boolean getDeletable() {
            return this.deletable;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return networkId
         */
        public String getNetworkId() {
            return this.networkId;
        }

        /**
         * @return nodeNumber
         */
        public Integer getNodeNumber() {
            return this.nodeNumber;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return state
         */
        public String getState() {
            return this.state;
        }

        public static final class Builder {
            private String consensus; 
            private Long createTime; 
            private String creator; 
            private Boolean deletable; 
            private String description; 
            private String id; 
            private String name; 
            private String networkId; 
            private Integer nodeNumber; 
            private String regionId; 
            private String state; 

            /**
             * Consensus.
             */
            public Builder consensus(String consensus) {
                this.consensus = consensus;
                return this;
            }

            /**
             * CreateTime.
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * Creator.
             */
            public Builder creator(String creator) {
                this.creator = creator;
                return this;
            }

            /**
             * Deletable.
             */
            public Builder deletable(Boolean deletable) {
                this.deletable = deletable;
                return this;
            }

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * NetworkId.
             */
            public Builder networkId(String networkId) {
                this.networkId = networkId;
                return this;
            }

            /**
             * NodeNumber.
             */
            public Builder nodeNumber(Integer nodeNumber) {
                this.nodeNumber = nodeNumber;
                return this;
            }

            /**
             * RegionId.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
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
