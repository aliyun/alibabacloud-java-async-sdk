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
 * {@link DescribeWebPathResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeWebPathResponseBody</p>
 */
public class DescribeWebPathResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ConfigList")
    private java.util.List<ConfigList> configList;

    @com.aliyun.core.annotation.NameInMap("Count")
    private Integer count;

    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    private Integer currentPage;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeWebPathResponseBody(Builder builder) {
        this.configList = builder.configList;
        this.count = builder.count;
        this.currentPage = builder.currentPage;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeWebPathResponseBody create() {
        return builder().build();
    }

    /**
     * @return configList
     */
    public java.util.List<ConfigList> getConfigList() {
        return this.configList;
    }

    /**
     * @return count
     */
    public Integer getCount() {
        return this.count;
    }

    /**
     * @return currentPage
     */
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List<ConfigList> configList; 
        private Integer count; 
        private Integer currentPage; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * <p>An array that consists of the paths to the web directories.</p>
         */
        public Builder configList(java.util.List<ConfigList> configList) {
            this.configList = configList;
            return this;
        }

        /**
         * <p>The number of entries returned on the current page.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder count(Integer count) {
            this.count = count;
            return this;
        }

        /**
         * <p>The page number of the returned page.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder currentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }

        /**
         * <p>The number of entries returned per page.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>B37C9052-A73E-4707-A024-92477028****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeWebPathResponseBody build() {
            return new DescribeWebPathResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeWebPathResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeWebPathResponseBody</p>
     */
    public static class TargetList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Target")
        private String target;

        @com.aliyun.core.annotation.NameInMap("TargetType")
        private String targetType;

        private TargetList(Builder builder) {
            this.target = builder.target;
            this.targetType = builder.targetType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TargetList create() {
            return builder().build();
        }

        /**
         * @return target
         */
        public String getTarget() {
            return this.target;
        }

        /**
         * @return targetType
         */
        public String getTargetType() {
            return this.targetType;
        }

        public static final class Builder {
            private String target; 
            private String targetType; 

            /**
             * <p>The object.</p>
             * 
             * <strong>example:</strong>
             * <p>82048187-bb9b-4e19-8320-7b4ddb97****</p>
             */
            public Builder target(String target) {
                this.target = target;
                return this;
            }

            /**
             * <p>The object type. Valid values:</p>
             * <ul>
             * <li><strong>uuid</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>uuid</p>
             */
            public Builder targetType(String targetType) {
                this.targetType = targetType;
                return this;
            }

            public TargetList build() {
                return new TargetList(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeWebPathResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeWebPathResponseBody</p>
     */
    public static class ConfigList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("TargetList")
        private java.util.List<TargetList> targetList;

        @com.aliyun.core.annotation.NameInMap("WebPath")
        private String webPath;

        @com.aliyun.core.annotation.NameInMap("WebPathType")
        private String webPathType;

        private ConfigList(Builder builder) {
            this.targetList = builder.targetList;
            this.webPath = builder.webPath;
            this.webPathType = builder.webPathType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ConfigList create() {
            return builder().build();
        }

        /**
         * @return targetList
         */
        public java.util.List<TargetList> getTargetList() {
            return this.targetList;
        }

        /**
         * @return webPath
         */
        public String getWebPath() {
            return this.webPath;
        }

        /**
         * @return webPathType
         */
        public String getWebPathType() {
            return this.webPathType;
        }

        public static final class Builder {
            private java.util.List<TargetList> targetList; 
            private String webPath; 
            private String webPathType; 

            /**
             * <p>An array consisting of the servers on which the web directories are scanned.</p>
             */
            public Builder targetList(java.util.List<TargetList> targetList) {
                this.targetList = targetList;
                return this;
            }

            /**
             * <p>The path to the web directory.</p>
             * 
             * <strong>example:</strong>
             * <p>/root/www****</p>
             */
            public Builder webPath(String webPath) {
                this.webPath = webPath;
                return this;
            }

            /**
             * <p>The path type of the web directory. Valid values:</p>
             * <ul>
             * <li><strong>def</strong>: automatically identified</li>
             * <li><strong>customize</strong>: manually added</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>def</p>
             */
            public Builder webPathType(String webPathType) {
                this.webPathType = webPathType;
                return this;
            }

            public ConfigList build() {
                return new ConfigList(this);
            } 

        } 

    }
}
