// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20211201.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeApsResourceGroupsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeApsResourceGroupsResponseBody</p>
 */
public class DescribeApsResourceGroupsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Long httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
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
         * <p>The queried resource groups.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The HTTP status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(Long httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>The returned message.</p>
         * <ul>
         * <li>If the request was successful, a success message is returned.</li>
         * <li>If the request failed, an error message is returned.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>6FC370D7-1D4C-5A8E-805E-F73366382C66</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>True</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public DescribeApsResourceGroupsResponseBody build() {
            return new DescribeApsResourceGroupsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeApsResourceGroupsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeApsResourceGroupsResponseBody</p>
     */
    public static class ResourceGroups extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Available")
        private Boolean available;

        @com.aliyun.core.annotation.NameInMap("CuOptions")
        private java.util.List < Long > cuOptions;

        @com.aliyun.core.annotation.NameInMap("GroupName")
        private String groupName;

        @com.aliyun.core.annotation.NameInMap("GroupType")
        private String groupType;

        @com.aliyun.core.annotation.NameInMap("LeftComputeResource")
        private Integer leftComputeResource;

        @com.aliyun.core.annotation.NameInMap("MaxComputeResource")
        private Integer maxComputeResource;

        @com.aliyun.core.annotation.NameInMap("MinComputeResource")
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
             * <p>Indicates whether the resource group is available. Valid values:</p>
             * <ul>
             * <li><strong>true</strong></li>
             * <li><strong>false</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>True</p>
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
             * <p>The name of the resource group.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder groupName(String groupName) {
                this.groupName = groupName;
                return this;
            }

            /**
             * <p>The type of the resource group. Valid values:</p>
             * <ul>
             * <li><strong>Interactive</strong></li>
             * <li><strong>Job</strong></li>
             * </ul>
             * <blockquote>
             * <p> For more information about resource groups, see <a href="https://help.aliyun.com/document_detail/428610.html">Resource groups</a>.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>Job</p>
             */
            public Builder groupType(String groupType) {
                this.groupType = groupType;
                return this;
            }

            /**
             * <p>The amount of remaining computing resources. Unit: ACUs.</p>
             * 
             * <strong>example:</strong>
             * <p>512</p>
             */
            public Builder leftComputeResource(Integer leftComputeResource) {
                this.leftComputeResource = leftComputeResource;
                return this;
            }

            /**
             * <p>The maximum amount of reserved computing resources. Unit: ACUs.</p>
             * <ul>
             * <li>If the value of GroupType is <strong>Interactive</strong>, the amount of reserved computing resources that are not allocated in the cluster is returned in increments of 16 ACUs.</li>
             * <li>If the value of GroupType is <strong>Job</strong>, the amount of reserved computing resources that are not allocated in the cluster is returned in increments of 8 ACUs.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>512</p>
             */
            public Builder maxComputeResource(Integer maxComputeResource) {
                this.maxComputeResource = maxComputeResource;
                return this;
            }

            /**
             * <p>The minimum amount of reserved computing resources. Unit: ACUs.</p>
             * <ul>
             * <li>If the value of GroupType is <strong>Interactive</strong>, 16 is returned.</li>
             * <li>If the value of GroupType is <strong>Job</strong>, 0 is returned.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
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
    /**
     * 
     * {@link DescribeApsResourceGroupsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeApsResourceGroupsResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ResourceGroups")
        private java.util.List < ResourceGroups> resourceGroups;

        @com.aliyun.core.annotation.NameInMap("Step")
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
             * <p>The queried resource groups.</p>
             */
            public Builder resourceGroups(java.util.List < ResourceGroups> resourceGroups) {
                this.resourceGroups = resourceGroups;
                return this;
            }

            /**
             * <p>The step size of resources. Unit: AnalyticDB compute units (ACUs).</p>
             * <ul>
             * <li>If the value of GroupType is <strong>Interactive</strong>, 16 is returned.</li>
             * <li>If the value of GroupType is <strong>Job</strong>, 8 is returned.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>8</p>
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
