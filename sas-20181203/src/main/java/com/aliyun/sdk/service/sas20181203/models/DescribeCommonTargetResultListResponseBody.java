// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeCommonTargetResultListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeCommonTargetResultListResponseBody</p>
 */
public class DescribeCommonTargetResultListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TargetConfig")
    private TargetConfig targetConfig;

    private DescribeCommonTargetResultListResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.targetConfig = builder.targetConfig;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCommonTargetResultListResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return targetConfig
     */
    public TargetConfig getTargetConfig() {
        return this.targetConfig;
    }

    public static final class Builder {
        private String requestId; 
        private TargetConfig targetConfig; 

        private Builder() {
        } 

        private Builder(DescribeCommonTargetResultListResponseBody model) {
            this.requestId = model.requestId;
            this.targetConfig = model.targetConfig;
        } 

        /**
         * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>6673D49C-A9AB-40DD-B4A2-B92306701AE7</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The information about the configuration item.</p>
         */
        public Builder targetConfig(TargetConfig targetConfig) {
            this.targetConfig = targetConfig;
            return this;
        }

        public DescribeCommonTargetResultListResponseBody build() {
            return new DescribeCommonTargetResultListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeCommonTargetResultListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCommonTargetResultListResponseBody</p>
     */
    public static class TargetConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Flag")
        private String flag;

        @com.aliyun.core.annotation.NameInMap("TargetDefault")
        private String targetDefault;

        @com.aliyun.core.annotation.NameInMap("TargetList")
        private java.util.List<String> targetList;

        @com.aliyun.core.annotation.NameInMap("TargetType")
        private String targetType;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private String totalCount;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private TargetConfig(Builder builder) {
            this.flag = builder.flag;
            this.targetDefault = builder.targetDefault;
            this.targetList = builder.targetList;
            this.targetType = builder.targetType;
            this.totalCount = builder.totalCount;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TargetConfig create() {
            return builder().build();
        }

        /**
         * @return flag
         */
        public String getFlag() {
            return this.flag;
        }

        /**
         * @return targetDefault
         */
        public String getTargetDefault() {
            return this.targetDefault;
        }

        /**
         * @return targetList
         */
        public java.util.List<String> getTargetList() {
            return this.targetList;
        }

        /**
         * @return targetType
         */
        public String getTargetType() {
            return this.targetType;
        }

        /**
         * @return totalCount
         */
        public String getTotalCount() {
            return this.totalCount;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String flag; 
            private String targetDefault; 
            private java.util.List<String> targetList; 
            private String targetType; 
            private String totalCount; 
            private String type; 

            private Builder() {
            } 

            private Builder(TargetConfig model) {
                this.flag = model.flag;
                this.targetDefault = model.targetDefault;
                this.targetList = model.targetList;
                this.targetType = model.targetType;
                this.totalCount = model.totalCount;
                this.type = model.type;
            } 

            /**
             * <p>The identifier that indicates whether the configuration item is applied to the server. Valid values:</p>
             * <ul>
             * <li><strong>add</strong>: applied</li>
             * <li><strong>del</strong>: not applied</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>del</p>
             */
            public Builder flag(String flag) {
                this.flag = flag;
                return this;
            }

            /**
             * <p>The default identifier.</p>
             * 
             * <strong>example:</strong>
             * <p>add</p>
             */
            public Builder targetDefault(String targetDefault) {
                this.targetDefault = targetDefault;
                return this;
            }

            /**
             * <p>An array that consists of the IDs of the server groups or the UUIDs of the servers.</p>
             * <blockquote>
             * <p> If <strong>uuid</strong> is returned for the <strong>TargetType</strong> parameter, <strong>UUIDs</strong> of the servers are returned. If <strong>groupId</strong> is returned for the <strong>TargetType</strong> parameter, IDs of the server groups are returned.</p>
             * </blockquote>
             */
            public Builder targetList(java.util.List<String> targetList) {
                this.targetList = targetList;
                return this;
            }

            /**
             * <p>The type of the server to which the configuration item is applied. Valid values:</p>
             * <ul>
             * <li><strong>uuid</strong>: a server</li>
             * <li><strong>groupId</strong>: a server group</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>uuid</p>
             */
            public Builder targetType(String targetType) {
                this.targetType = targetType;
                return this;
            }

            /**
             * <p>The total number of entries returned.</p>
             * 
             * <strong>example:</strong>
             * <p>22</p>
             */
            public Builder totalCount(String totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            /**
             * <p>The type of the configuration item. Valid values:</p>
             * <ul>
             * <li><strong>webshell_timescan</strong>: webshell detection and removal</li>
             * <li><strong>aliscriptengine</strong>: in-depth detection engine</li>
             * <li><strong>alidetect</strong>: installation scope of local file detection</li>
             * <li><strong>alidetect-scan-enable</strong>: detection scope of local file detection</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>webshell_timescan</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public TargetConfig build() {
                return new TargetConfig(this);
            } 

        } 

    }
}
