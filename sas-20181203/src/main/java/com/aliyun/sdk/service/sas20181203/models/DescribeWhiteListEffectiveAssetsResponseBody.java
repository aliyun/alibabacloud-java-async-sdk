// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeWhiteListEffectiveAssetsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeWhiteListEffectiveAssetsResponseBody</p>
 */
public class DescribeWhiteListEffectiveAssetsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Assets")
    private java.util.List < Assets> assets;

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

    private DescribeWhiteListEffectiveAssetsResponseBody(Builder builder) {
        this.assets = builder.assets;
        this.count = builder.count;
        this.currentPage = builder.currentPage;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeWhiteListEffectiveAssetsResponseBody create() {
        return builder().build();
    }

    /**
     * @return assets
     */
    public java.util.List < Assets> getAssets() {
        return this.assets;
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
        private java.util.List < Assets> assets; 
        private Integer count; 
        private Integer currentPage; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * <p>The servers on which the policy takes effect.</p>
         */
        public Builder assets(java.util.List < Assets> assets) {
            this.assets = assets;
            return this;
        }

        /**
         * <p>The number of entries returned on the current page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder count(Integer count) {
            this.count = count;
            return this;
        }

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder currentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>A4EB8B1C-1DEC-5E18-BCD0-D1BBB39****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of the servers on which the policy takes effect.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeWhiteListEffectiveAssetsResponseBody build() {
            return new DescribeWhiteListEffectiveAssetsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeWhiteListEffectiveAssetsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeWhiteListEffectiveAssetsResponseBody</p>
     */
    public static class Assets extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("InternetIp")
        private String internetIp;

        @com.aliyun.core.annotation.NameInMap("IntranetIp")
        private String intranetIp;

        @com.aliyun.core.annotation.NameInMap("MachineName")
        private String machineName;

        @com.aliyun.core.annotation.NameInMap("ProcessMethod")
        private Integer processMethod;

        @com.aliyun.core.annotation.NameInMap("StrategyId")
        private Long strategyId;

        @com.aliyun.core.annotation.NameInMap("StrategyName")
        private String strategyName;

        @com.aliyun.core.annotation.NameInMap("SuspiciousEventCount")
        private Integer suspiciousEventCount;

        @com.aliyun.core.annotation.NameInMap("Uuid")
        private String uuid;

        private Assets(Builder builder) {
            this.internetIp = builder.internetIp;
            this.intranetIp = builder.intranetIp;
            this.machineName = builder.machineName;
            this.processMethod = builder.processMethod;
            this.strategyId = builder.strategyId;
            this.strategyName = builder.strategyName;
            this.suspiciousEventCount = builder.suspiciousEventCount;
            this.uuid = builder.uuid;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Assets create() {
            return builder().build();
        }

        /**
         * @return internetIp
         */
        public String getInternetIp() {
            return this.internetIp;
        }

        /**
         * @return intranetIp
         */
        public String getIntranetIp() {
            return this.intranetIp;
        }

        /**
         * @return machineName
         */
        public String getMachineName() {
            return this.machineName;
        }

        /**
         * @return processMethod
         */
        public Integer getProcessMethod() {
            return this.processMethod;
        }

        /**
         * @return strategyId
         */
        public Long getStrategyId() {
            return this.strategyId;
        }

        /**
         * @return strategyName
         */
        public String getStrategyName() {
            return this.strategyName;
        }

        /**
         * @return suspiciousEventCount
         */
        public Integer getSuspiciousEventCount() {
            return this.suspiciousEventCount;
        }

        /**
         * @return uuid
         */
        public String getUuid() {
            return this.uuid;
        }

        public static final class Builder {
            private String internetIp; 
            private String intranetIp; 
            private String machineName; 
            private Integer processMethod; 
            private Long strategyId; 
            private String strategyName; 
            private Integer suspiciousEventCount; 
            private String uuid; 

            /**
             * <p>The public IP address of the server.</p>
             * 
             * <strong>example:</strong>
             * <p>60.205.XX.XX</p>
             */
            public Builder internetIp(String internetIp) {
                this.internetIp = internetIp;
                return this;
            }

            /**
             * <p>The private IP address.</p>
             * 
             * <strong>example:</strong>
             * <p>192.168.XX.XX</p>
             */
            public Builder intranetIp(String intranetIp) {
                this.intranetIp = intranetIp;
                return this;
            }

            /**
             * <p>The name of the server.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder machineName(String machineName) {
                this.machineName = machineName;
                return this;
            }

            /**
             * <p>The exception handling mode. Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: unhandled</li>
             * <li><strong>1</strong>: alerted</li>
             * <li><strong>2</strong>: blocked</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder processMethod(Integer processMethod) {
                this.processMethod = processMethod;
                return this;
            }

            /**
             * <p>The ID of the policy.</p>
             * 
             * <strong>example:</strong>
             * <p>35815387</p>
             */
            public Builder strategyId(Long strategyId) {
                this.strategyId = strategyId;
                return this;
            }

            /**
             * <p>The name of the policy.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder strategyName(String strategyName) {
                this.strategyName = strategyName;
                return this;
            }

            /**
             * <p>The number of <strong>untrusted programs</strong> on the server.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder suspiciousEventCount(Integer suspiciousEventCount) {
                this.suspiciousEventCount = suspiciousEventCount;
                return this;
            }

            /**
             * <p>The UUID of the server.</p>
             * 
             * <strong>example:</strong>
             * <p>544900ff-1be7-4655-9719-6311cecb3****</p>
             */
            public Builder uuid(String uuid) {
                this.uuid = uuid;
                return this;
            }

            public Assets build() {
                return new Assets(this);
            } 

        } 

    }
}
