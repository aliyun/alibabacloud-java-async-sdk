// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20211201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeApsResourceGroupsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeApsResourceGroupsResponseBody</p>
 */
public class DescribeApsResourceGroupsResponseBody extends TeaModel {
    @NameInMap("Data")
    private Data data;

    @NameInMap("HttpStatusCode")
    private Long httpStatusCode;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private DescribeApsResourceGroupsResponseBody(Builder builder) {
        this.data = builder.data;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeApsResourceGroupsResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return httpStatusCode
     */
    public Long getHttpStatusCode() {
        return this.httpStatusCode;
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

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private Data data; 
        private Long httpStatusCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * HttpStatusCode.
         */
        public Builder httpStatusCode(Long httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
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
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public DescribeApsResourceGroupsResponseBody build() {
            return new DescribeApsResourceGroupsResponseBody(this);
        } 

    } 

    public static class ResourceGroups extends TeaModel {
        @NameInMap("Available")
        private Boolean available;

        @NameInMap("CuOptions")
        private java.util.List < Long > cuOptions;

        @NameInMap("GroupName")
        private String groupName;

        @NameInMap("GroupType")
        private String groupType;

        @NameInMap("LeftComputeResource")
        private Integer leftComputeResource;

        @NameInMap("MaxComputeResource")
        private Integer maxComputeResource;

        @NameInMap("MinComputeResource")
        private Integer minComputeResource;

        private ResourceGroups(Builder builder) {
            this.available = builder.available;
            this.cuOptions = builder.cuOptions;
            this.groupName = builder.groupName;
            this.groupType = builder.groupType;
            this.leftComputeResource = builder.leftComputeResource;
            this.maxComputeResource = builder.maxComputeResource;
            this.minComputeResource = builder.minComputeResource;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResourceGroups create() {
            return builder().build();
        }

        /**
         * @return available
         */
        public Boolean getAvailable() {
            return this.available;
        }

        /**
         * @return cuOptions
         */
        public java.util.List < Long > getCuOptions() {
            return this.cuOptions;
        }

        /**
         * @return groupName
         */
        public String getGroupName() {
            return this.groupName;
        }

        /**
         * @return groupType
         */
        public String getGroupType() {
            return this.groupType;
        }

        /**
         * @return leftComputeResource
         */
        public Integer getLeftComputeResource() {
            return this.leftComputeResource;
        }

        /**
         * @return maxComputeResource
         */
        public Integer getMaxComputeResource() {
            return this.maxComputeResource;
        }

        /**
         * @return minComputeResource
         */
        public Integer getMinComputeResource() {
            return this.minComputeResource;
        }

        public static final class Builder {
            private Boolean available; 
            private java.util.List < Long > cuOptions; 
            private String groupName; 
            private String groupType; 
            private Integer leftComputeResource; 
            private Integer maxComputeResource; 
            private Integer minComputeResource; 

            /**
             * Available.
             */
            public Builder available(Boolean available) {
                this.available = available;
                return this;
            }

            /**
             * CuOptions.
             */
            public Builder cuOptions(java.util.List < Long > cuOptions) {
                this.cuOptions = cuOptions;
                return this;
            }

            /**
             * GroupName.
             */
            public Builder groupName(String groupName) {
                this.groupName = groupName;
                return this;
            }

            /**
             * GroupType.
             */
            public Builder groupType(String groupType) {
                this.groupType = groupType;
                return this;
            }

            /**
             * LeftComputeResource.
             */
            public Builder leftComputeResource(Integer leftComputeResource) {
                this.leftComputeResource = leftComputeResource;
                return this;
            }

            /**
             * MaxComputeResource.
             */
            public Builder maxComputeResource(Integer maxComputeResource) {
                this.maxComputeResource = maxComputeResource;
                return this;
            }

            /**
             * MinComputeResource.
             */
            public Builder minComputeResource(Integer minComputeResource) {
                this.minComputeResource = minComputeResource;
                return this;
            }

            public ResourceGroups build() {
                return new ResourceGroups(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("ResourceGroups")
        private java.util.List < ResourceGroups> resourceGroups;

        @NameInMap("Step")
        private Long step;

        private Data(Builder builder) {
            this.resourceGroups = builder.resourceGroups;
            this.step = builder.step;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return resourceGroups
         */
        public java.util.List < ResourceGroups> getResourceGroups() {
            return this.resourceGroups;
        }

        /**
         * @return step
         */
        public Long getStep() {
            return this.step;
        }

        public static final class Builder {
            private java.util.List < ResourceGroups> resourceGroups; 
            private Long step; 

            /**
             * ResourceGroups.
             */
            public Builder resourceGroups(java.util.List < ResourceGroups> resourceGroups) {
                this.resourceGroups = resourceGroups;
                return this;
            }

            /**
             * Step.
             */
            public Builder step(Long step) {
                this.step = step;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
