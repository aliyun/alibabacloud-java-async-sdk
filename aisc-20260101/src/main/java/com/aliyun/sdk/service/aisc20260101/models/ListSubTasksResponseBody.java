// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aisc20260101.models;

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
 * {@link ListSubTasksResponseBody} extends {@link TeaModel}
 *
 * <p>ListSubTasksResponseBody</p>
 */
public class ListSubTasksResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("PageInfo")
    private PageInfo pageInfo;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListSubTasksResponseBody(Builder builder) {
        this.data = builder.data;
        this.pageInfo = builder.pageInfo;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListSubTasksResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public java.util.List<Data> getData() {
        return this.data;
    }

    /**
     * @return pageInfo
     */
    public PageInfo getPageInfo() {
        return this.pageInfo;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<Data> data; 
        private PageInfo pageInfo; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ListSubTasksResponseBody model) {
            this.data = model.data;
            this.pageInfo = model.pageInfo;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The list of task results.</p>
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The pagination information.</p>
         */
        public Builder pageInfo(PageInfo pageInfo) {
            this.pageInfo = pageInfo;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>9FDE3D6F-26BD-5937-B0E5-8F47962B****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListSubTasksResponseBody build() {
            return new ListSubTasksResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListSubTasksResponseBody} extends {@link TeaModel}
     *
     * <p>ListSubTasksResponseBody</p>
     */
    public static class AssetScan extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Message")
        private String message;

        @com.aliyun.core.annotation.NameInMap("Percent")
        private Integer percent;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("StrategyId")
        private Long strategyId;

        private AssetScan(Builder builder) {
            this.message = builder.message;
            this.percent = builder.percent;
            this.status = builder.status;
            this.strategyId = builder.strategyId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AssetScan create() {
            return builder().build();
        }

        /**
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        /**
         * @return percent
         */
        public Integer getPercent() {
            return this.percent;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return strategyId
         */
        public Long getStrategyId() {
            return this.strategyId;
        }

        public static final class Builder {
            private String message; 
            private Integer percent; 
            private String status; 
            private Long strategyId; 

            private Builder() {
            } 

            private Builder(AssetScan model) {
                this.message = model.message;
                this.percent = model.percent;
                this.status = model.status;
                this.strategyId = model.strategyId;
            } 

            /**
             * <p>The result description of the check item, such as the cause of failure, the cause of skipping, or the ID of the delivered policy.</p>
             * 
             * <strong>example:</strong>
             * <p>dispatched</p>
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * <p>The progress percentage of the check item. Valid values: 0 to 100. This field is not used in the current version.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder percent(Integer percent) {
                this.percent = percent;
                return this;
            }

            /**
             * <p>The status of the check item. Valid values: init, running, success, failed, timeout, and skipped.</p>
             * 
             * <strong>example:</strong>
             * <p>success</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The ID of the policy corresponding to the check item. This field is used only by health check items.</p>
             * 
             * <strong>example:</strong>
             * <p>1001</p>
             */
            public Builder strategyId(Long strategyId) {
                this.strategyId = strategyId;
                return this;
            }

            public AssetScan build() {
                return new AssetScan(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListSubTasksResponseBody} extends {@link TeaModel}
     *
     * <p>ListSubTasksResponseBody</p>
     */
    public static class HealthCheck extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Message")
        private String message;

        @com.aliyun.core.annotation.NameInMap("Percent")
        private Integer percent;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("StrategyId")
        private Long strategyId;

        private HealthCheck(Builder builder) {
            this.message = builder.message;
            this.percent = builder.percent;
            this.status = builder.status;
            this.strategyId = builder.strategyId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static HealthCheck create() {
            return builder().build();
        }

        /**
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        /**
         * @return percent
         */
        public Integer getPercent() {
            return this.percent;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return strategyId
         */
        public Long getStrategyId() {
            return this.strategyId;
        }

        public static final class Builder {
            private String message; 
            private Integer percent; 
            private String status; 
            private Long strategyId; 

            private Builder() {
            } 

            private Builder(HealthCheck model) {
                this.message = model.message;
                this.percent = model.percent;
                this.status = model.status;
                this.strategyId = model.strategyId;
            } 

            /**
             * <p>The result description of the check item, such as the cause of failure, the cause of skipping, or the ID of the delivered policy.</p>
             * 
             * <strong>example:</strong>
             * <p>strategyId=1001</p>
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * <p>The progress percentage of the check item. Valid values: 0 to 100. This field is not used in the current version.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder percent(Integer percent) {
                this.percent = percent;
                return this;
            }

            /**
             * <p>The status of the check item. Valid values: init, running, success, failed, timeout, and skipped.</p>
             * 
             * <strong>example:</strong>
             * <p>success</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The ID of the policy corresponding to the check item. This field is used only by health check items.</p>
             * 
             * <strong>example:</strong>
             * <p>1001</p>
             */
            public Builder strategyId(Long strategyId) {
                this.strategyId = strategyId;
                return this;
            }

            public HealthCheck build() {
                return new HealthCheck(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListSubTasksResponseBody} extends {@link TeaModel}
     *
     * <p>ListSubTasksResponseBody</p>
     */
    public static class McpCheck extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Message")
        private String message;

        @com.aliyun.core.annotation.NameInMap("Percent")
        private Integer percent;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("StrategyId")
        private Long strategyId;

        private McpCheck(Builder builder) {
            this.message = builder.message;
            this.percent = builder.percent;
            this.status = builder.status;
            this.strategyId = builder.strategyId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static McpCheck create() {
            return builder().build();
        }

        /**
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        /**
         * @return percent
         */
        public Integer getPercent() {
            return this.percent;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return strategyId
         */
        public Long getStrategyId() {
            return this.strategyId;
        }

        public static final class Builder {
            private String message; 
            private Integer percent; 
            private String status; 
            private Long strategyId; 

            private Builder() {
            } 

            private Builder(McpCheck model) {
                this.message = model.message;
                this.percent = model.percent;
                this.status = model.status;
                this.strategyId = model.strategyId;
            } 

            /**
             * <p>The result description of the check item, such as the cause of failure, the cause of skipping, or the ID of the delivered policy.</p>
             * 
             * <strong>example:</strong>
             * <p>mcp check task created, detector not implemented yet</p>
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * <p>The progress percentage of the check item. Valid values: 0 to 100. This field is not used in the current version.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder percent(Integer percent) {
                this.percent = percent;
                return this;
            }

            /**
             * <p>The status of the check item. Valid values: init, running, success, failed, timeout, and skipped.</p>
             * 
             * <strong>example:</strong>
             * <p>success</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The ID of the policy corresponding to the check item. This field is used only by health check items.</p>
             * 
             * <strong>example:</strong>
             * <p>1001</p>
             */
            public Builder strategyId(Long strategyId) {
                this.strategyId = strategyId;
                return this;
            }

            public McpCheck build() {
                return new McpCheck(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListSubTasksResponseBody} extends {@link TeaModel}
     *
     * <p>ListSubTasksResponseBody</p>
     */
    public static class MemoryCheck extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Message")
        private String message;

        @com.aliyun.core.annotation.NameInMap("Percent")
        private Integer percent;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("StrategyId")
        private Long strategyId;

        private MemoryCheck(Builder builder) {
            this.message = builder.message;
            this.percent = builder.percent;
            this.status = builder.status;
            this.strategyId = builder.strategyId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MemoryCheck create() {
            return builder().build();
        }

        /**
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        /**
         * @return percent
         */
        public Integer getPercent() {
            return this.percent;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return strategyId
         */
        public Long getStrategyId() {
            return this.strategyId;
        }

        public static final class Builder {
            private String message; 
            private Integer percent; 
            private String status; 
            private Long strategyId; 

            private Builder() {
            } 

            private Builder(MemoryCheck model) {
                this.message = model.message;
                this.percent = model.percent;
                this.status = model.status;
                this.strategyId = model.strategyId;
            } 

            /**
             * <p>The result description of the check item, such as the cause of failure, the cause of skipping, or the ID of the delivered policy.</p>
             * 
             * <strong>example:</strong>
             * <p>memory check task created, detector not implemented yet</p>
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * <p>The progress percentage of the check item. Valid values: 0 to 100. This field is not used in the current version.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder percent(Integer percent) {
                this.percent = percent;
                return this;
            }

            /**
             * <p>The status of the check item. Valid values: init, running, success, failed, timeout, and skipped.</p>
             * 
             * <strong>example:</strong>
             * <p>success</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The ID of the policy corresponding to the check item. This field is used only by health check items.</p>
             * 
             * <strong>example:</strong>
             * <p>1001</p>
             */
            public Builder strategyId(Long strategyId) {
                this.strategyId = strategyId;
                return this;
            }

            public MemoryCheck build() {
                return new MemoryCheck(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListSubTasksResponseBody} extends {@link TeaModel}
     *
     * <p>ListSubTasksResponseBody</p>
     */
    public static class SessionCheck extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Message")
        private String message;

        @com.aliyun.core.annotation.NameInMap("Percent")
        private Integer percent;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("StrategyId")
        private Long strategyId;

        private SessionCheck(Builder builder) {
            this.message = builder.message;
            this.percent = builder.percent;
            this.status = builder.status;
            this.strategyId = builder.strategyId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SessionCheck create() {
            return builder().build();
        }

        /**
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        /**
         * @return percent
         */
        public Integer getPercent() {
            return this.percent;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return strategyId
         */
        public Long getStrategyId() {
            return this.strategyId;
        }

        public static final class Builder {
            private String message; 
            private Integer percent; 
            private String status; 
            private Long strategyId; 

            private Builder() {
            } 

            private Builder(SessionCheck model) {
                this.message = model.message;
                this.percent = model.percent;
                this.status = model.status;
                this.strategyId = model.strategyId;
            } 

            /**
             * <p>The result description of the check item, such as the cause of failure, the cause of skipping, or the ID of the delivered policy.</p>
             * 
             * <strong>example:</strong>
             * <p>session check task created, detector not implemented yet</p>
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * <p>The progress percentage of the check item. Valid values: 0 to 100. This field is not used in the current version.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder percent(Integer percent) {
                this.percent = percent;
                return this;
            }

            /**
             * <p>The status of the check item. Valid values: init, running, success, failed, timeout, and skipped.</p>
             * 
             * <strong>example:</strong>
             * <p>success</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The ID of the policy corresponding to the check item. This field is used only by health check items.</p>
             * 
             * <strong>example:</strong>
             * <p>1001</p>
             */
            public Builder strategyId(Long strategyId) {
                this.strategyId = strategyId;
                return this;
            }

            public SessionCheck build() {
                return new SessionCheck(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListSubTasksResponseBody} extends {@link TeaModel}
     *
     * <p>ListSubTasksResponseBody</p>
     */
    public static class SkillCheck extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Message")
        private String message;

        @com.aliyun.core.annotation.NameInMap("Percent")
        private Integer percent;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("StrategyId")
        private Long strategyId;

        private SkillCheck(Builder builder) {
            this.message = builder.message;
            this.percent = builder.percent;
            this.status = builder.status;
            this.strategyId = builder.strategyId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SkillCheck create() {
            return builder().build();
        }

        /**
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        /**
         * @return percent
         */
        public Integer getPercent() {
            return this.percent;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return strategyId
         */
        public Long getStrategyId() {
            return this.strategyId;
        }

        public static final class Builder {
            private String message; 
            private Integer percent; 
            private String status; 
            private Long strategyId; 

            private Builder() {
            } 

            private Builder(SkillCheck model) {
                this.message = model.message;
                this.percent = model.percent;
                this.status = model.status;
                this.strategyId = model.strategyId;
            } 

            /**
             * <p>The result description of the check item, such as the cause of failure, the cause of skipping, or the ID of the delivered policy.</p>
             * 
             * <strong>example:</strong>
             * <p>dispatched</p>
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * <p>The progress percentage of the check item. Valid values: 0 to 100. This field is not used in the current version.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder percent(Integer percent) {
                this.percent = percent;
                return this;
            }

            /**
             * <p>The status of the check item. Valid values: init, running, success, failed, timeout, and skipped.</p>
             * 
             * <strong>example:</strong>
             * <p>success</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The ID of the policy corresponding to the check item. This field is used only by health check items.</p>
             * 
             * <strong>example:</strong>
             * <p>1001</p>
             */
            public Builder strategyId(Long strategyId) {
                this.strategyId = strategyId;
                return this;
            }

            public SkillCheck build() {
                return new SkillCheck(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListSubTasksResponseBody} extends {@link TeaModel}
     *
     * <p>ListSubTasksResponseBody</p>
     */
    public static class VulScan extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Message")
        private String message;

        @com.aliyun.core.annotation.NameInMap("Percent")
        private Integer percent;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("StrategyId")
        private Long strategyId;

        private VulScan(Builder builder) {
            this.message = builder.message;
            this.percent = builder.percent;
            this.status = builder.status;
            this.strategyId = builder.strategyId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VulScan create() {
            return builder().build();
        }

        /**
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        /**
         * @return percent
         */
        public Integer getPercent() {
            return this.percent;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return strategyId
         */
        public Long getStrategyId() {
            return this.strategyId;
        }

        public static final class Builder {
            private String message; 
            private Integer percent; 
            private String status; 
            private Long strategyId; 

            private Builder() {
            } 

            private Builder(VulScan model) {
                this.message = model.message;
                this.percent = model.percent;
                this.status = model.status;
                this.strategyId = model.strategyId;
            } 

            /**
             * <p>The result description of the check item, such as the cause of failure, the cause of skipping, or the ID of the delivered policy.</p>
             * 
             * <strong>example:</strong>
             * <p>submitted</p>
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * <p>The progress percentage of the check item. Valid values: 0 to 100. This field is not used in the current version.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder percent(Integer percent) {
                this.percent = percent;
                return this;
            }

            /**
             * <p>The status of the check item. Valid values: init, running, success, failed, timeout, and skipped.</p>
             * 
             * <strong>example:</strong>
             * <p>success</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The ID of the policy corresponding to the check item. This field is used only by health check items.</p>
             * 
             * <strong>example:</strong>
             * <p>1001</p>
             */
            public Builder strategyId(Long strategyId) {
                this.strategyId = strategyId;
                return this;
            }

            public VulScan build() {
                return new VulScan(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListSubTasksResponseBody} extends {@link TeaModel}
     *
     * <p>ListSubTasksResponseBody</p>
     */
    public static class FullCheckResult extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AssetScan")
        private AssetScan assetScan;

        @com.aliyun.core.annotation.NameInMap("HealthCheck")
        private HealthCheck healthCheck;

        @com.aliyun.core.annotation.NameInMap("McpCheck")
        private McpCheck mcpCheck;

        @com.aliyun.core.annotation.NameInMap("MemoryCheck")
        private MemoryCheck memoryCheck;

        @com.aliyun.core.annotation.NameInMap("SessionCheck")
        private SessionCheck sessionCheck;

        @com.aliyun.core.annotation.NameInMap("SkillCheck")
        private SkillCheck skillCheck;

        @com.aliyun.core.annotation.NameInMap("VulScan")
        private VulScan vulScan;

        private FullCheckResult(Builder builder) {
            this.assetScan = builder.assetScan;
            this.healthCheck = builder.healthCheck;
            this.mcpCheck = builder.mcpCheck;
            this.memoryCheck = builder.memoryCheck;
            this.sessionCheck = builder.sessionCheck;
            this.skillCheck = builder.skillCheck;
            this.vulScan = builder.vulScan;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FullCheckResult create() {
            return builder().build();
        }

        /**
         * @return assetScan
         */
        public AssetScan getAssetScan() {
            return this.assetScan;
        }

        /**
         * @return healthCheck
         */
        public HealthCheck getHealthCheck() {
            return this.healthCheck;
        }

        /**
         * @return mcpCheck
         */
        public McpCheck getMcpCheck() {
            return this.mcpCheck;
        }

        /**
         * @return memoryCheck
         */
        public MemoryCheck getMemoryCheck() {
            return this.memoryCheck;
        }

        /**
         * @return sessionCheck
         */
        public SessionCheck getSessionCheck() {
            return this.sessionCheck;
        }

        /**
         * @return skillCheck
         */
        public SkillCheck getSkillCheck() {
            return this.skillCheck;
        }

        /**
         * @return vulScan
         */
        public VulScan getVulScan() {
            return this.vulScan;
        }

        public static final class Builder {
            private AssetScan assetScan; 
            private HealthCheck healthCheck; 
            private McpCheck mcpCheck; 
            private MemoryCheck memoryCheck; 
            private SessionCheck sessionCheck; 
            private SkillCheck skillCheck; 
            private VulScan vulScan; 

            private Builder() {
            } 

            private Builder(FullCheckResult model) {
                this.assetScan = model.assetScan;
                this.healthCheck = model.healthCheck;
                this.mcpCheck = model.mcpCheck;
                this.memoryCheck = model.memoryCheck;
                this.sessionCheck = model.sessionCheck;
                this.skillCheck = model.skillCheck;
                this.vulScan = model.vulScan;
            } 

            /**
             * <p>The result of the asset scanning check item.</p>
             */
            public Builder assetScan(AssetScan assetScan) {
                this.assetScan = assetScan;
                return this;
            }

            /**
             * <p>The result of the health check item.</p>
             */
            public Builder healthCheck(HealthCheck healthCheck) {
                this.healthCheck = healthCheck;
                return this;
            }

            /**
             * <p>The result of the MCP check item. If the detector is not connected, the result defaults to success.</p>
             */
            public Builder mcpCheck(McpCheck mcpCheck) {
                this.mcpCheck = mcpCheck;
                return this;
            }

            /**
             * <p>The result of the memory check item. If the detector is not connected, the result defaults to success.</p>
             */
            public Builder memoryCheck(MemoryCheck memoryCheck) {
                this.memoryCheck = memoryCheck;
                return this;
            }

            /**
             * <p>The result of the session check item. If the detector is not connected, the result defaults to success.</p>
             */
            public Builder sessionCheck(SessionCheck sessionCheck) {
                this.sessionCheck = sessionCheck;
                return this;
            }

            /**
             * <p>The result of the Skill file check item.</p>
             */
            public Builder skillCheck(SkillCheck skillCheck) {
                this.skillCheck = skillCheck;
                return this;
            }

            /**
             * <p>The result of the vulnerability scanning check item.</p>
             */
            public Builder vulScan(VulScan vulScan) {
                this.vulScan = vulScan;
                return this;
            }

            public FullCheckResult build() {
                return new FullCheckResult(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListSubTasksResponseBody} extends {@link TeaModel}
     *
     * <p>ListSubTasksResponseBody</p>
     */
    public static class Detail extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Content")
        private String content;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("ItemName")
        private String itemName;

        @com.aliyun.core.annotation.NameInMap("Line")
        private String line;

        private Detail(Builder builder) {
            this.content = builder.content;
            this.description = builder.description;
            this.itemName = builder.itemName;
            this.line = builder.line;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Detail create() {
            return builder().build();
        }

        /**
         * @return content
         */
        public String getContent() {
            return this.content;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return itemName
         */
        public String getItemName() {
            return this.itemName;
        }

        /**
         * @return line
         */
        public String getLine() {
            return this.line;
        }

        public static final class Builder {
            private String content; 
            private String description; 
            private String itemName; 
            private String line; 

            private Builder() {
            } 

            private Builder(Detail model) {
                this.content = model.content;
                this.description = model.description;
                this.itemName = model.itemName;
                this.line = model.line;
            } 

            /**
             * <p>The matched content.</p>
             * 
             * <strong>example:</strong>
             * <p>allowed-tools: Bash(agent-browser:*)</p>
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * <p>The description.</p>
             * 
             * <strong>example:</strong>
             * <p>The skill configuration allows Bash execution via agent-browser:* pattern without requiring user confirmation. This enables potentially dangerous command execution through the browser automation CLI.</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The name of the check item.</p>
             * 
             * <strong>example:</strong>
             * <p>Dangerous Tools Without Confirmation</p>
             */
            public Builder itemName(String itemName) {
                this.itemName = itemName;
                return this;
            }

            /**
             * <p>The line number of the matched content.</p>
             * 
             * <strong>example:</strong>
             * <p>2555</p>
             */
            public Builder line(String line) {
                this.line = line;
                return this;
            }

            public Detail build() {
                return new Detail(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListSubTasksResponseBody} extends {@link TeaModel}
     *
     * <p>ListSubTasksResponseBody</p>
     */
    public static class Config extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Detail")
        private java.util.List<Detail> detail;

        private Config(Builder builder) {
            this.detail = builder.detail;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Config create() {
            return builder().build();
        }

        /**
         * @return detail
         */
        public java.util.List<Detail> getDetail() {
            return this.detail;
        }

        public static final class Builder {
            private java.util.List<Detail> detail; 

            private Builder() {
            } 

            private Builder(Config model) {
                this.detail = model.detail;
            } 

            /**
             * <p>The list of risk details.</p>
             */
            public Builder detail(java.util.List<Detail> detail) {
                this.detail = detail;
                return this;
            }

            public Config build() {
                return new Config(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListSubTasksResponseBody} extends {@link TeaModel}
     *
     * <p>ListSubTasksResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Confidence")
        private Float confidence;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Label")
        private String label;

        @com.aliyun.core.annotation.NameInMap("Level")
        private String level;

        private Result(Builder builder) {
            this.confidence = builder.confidence;
            this.description = builder.description;
            this.label = builder.label;
            this.level = builder.level;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return confidence
         */
        public Float getConfidence() {
            return this.confidence;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return label
         */
        public String getLabel() {
            return this.label;
        }

        /**
         * @return level
         */
        public String getLevel() {
            return this.level;
        }

        public static final class Builder {
            private Float confidence; 
            private String description; 
            private String label; 
            private String level; 

            private Builder() {
            } 

            private Builder(Result model) {
                this.confidence = model.confidence;
                this.description = model.description;
                this.label = model.label;
                this.level = model.level;
            } 

            /**
             * <p>The confidence level. Valid values: 0 to 100.</p>
             * 
             * <strong>example:</strong>
             * <p>25</p>
             */
            public Builder confidence(Float confidence) {
                this.confidence = confidence;
                return this;
            }

            /**
             * <p>The result description.</p>
             * 
             * <strong>example:</strong>
             * <p>Suspicious attacks.</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The label information.</p>
             * 
             * <strong>example:</strong>
             * <p>attack</p>
             */
            public Builder label(String label) {
                this.label = label;
                return this;
            }

            /**
             * <p>The risk level. Valid values:</p>
             * <ul>
             * <li><strong>high</strong>: High risk.</li>
             * <li><strong>medium</strong>: Medium risk.</li>
             * <li><strong>low</strong>: Low risk.</li>
             * <li><strong>none</strong>: No risk.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>high</p>
             */
            public Builder level(String level) {
                this.level = level;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListSubTasksResponseBody} extends {@link TeaModel}
     *
     * <p>ListSubTasksResponseBody</p>
     */
    public static class GuardrailDetail extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Level")
        private String level;

        @com.aliyun.core.annotation.NameInMap("Result")
        private java.util.List<Result> result;

        @com.aliyun.core.annotation.NameInMap("Suggestion")
        private String suggestion;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private GuardrailDetail(Builder builder) {
            this.level = builder.level;
            this.result = builder.result;
            this.suggestion = builder.suggestion;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static GuardrailDetail create() {
            return builder().build();
        }

        /**
         * @return level
         */
        public String getLevel() {
            return this.level;
        }

        /**
         * @return result
         */
        public java.util.List<Result> getResult() {
            return this.result;
        }

        /**
         * @return suggestion
         */
        public String getSuggestion() {
            return this.suggestion;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String level; 
            private java.util.List<Result> result; 
            private String suggestion; 
            private String type; 

            private Builder() {
            } 

            private Builder(GuardrailDetail model) {
                this.level = model.level;
                this.result = model.result;
                this.suggestion = model.suggestion;
                this.type = model.type;
            } 

            /**
             * <p>The risk level. Valid values:</p>
             * <ul>
             * <li><strong>high</strong>: High risk.</li>
             * <li><strong>medium</strong>: Medium risk.</li>
             * <li><strong>low</strong>: Low risk.</li>
             * <li><strong>none</strong>: No risk.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>high</p>
             */
            public Builder level(String level) {
                this.level = level;
                return this;
            }

            /**
             * <p>The list of result details.</p>
             */
            public Builder result(java.util.List<Result> result) {
                this.result = result;
                return this;
            }

            /**
             * <p>The handling suggestion.</p>
             * 
             * <strong>example:</strong>
             * <p>block</p>
             */
            public Builder suggestion(String suggestion) {
                this.suggestion = suggestion;
                return this;
            }

            /**
             * <p>The risk type.</p>
             * 
             * <strong>example:</strong>
             * <p>promptAttack</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public GuardrailDetail build() {
                return new GuardrailDetail(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListSubTasksResponseBody} extends {@link TeaModel}
     *
     * <p>ListSubTasksResponseBody</p>
     */
    public static class Guardrail extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Detail")
        private java.util.List<GuardrailDetail> detail;

        @com.aliyun.core.annotation.NameInMap("Suggestion")
        private String suggestion;

        private Guardrail(Builder builder) {
            this.detail = builder.detail;
            this.suggestion = builder.suggestion;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Guardrail create() {
            return builder().build();
        }

        /**
         * @return detail
         */
        public java.util.List<GuardrailDetail> getDetail() {
            return this.detail;
        }

        /**
         * @return suggestion
         */
        public String getSuggestion() {
            return this.suggestion;
        }

        public static final class Builder {
            private java.util.List<GuardrailDetail> detail; 
            private String suggestion; 

            private Builder() {
            } 

            private Builder(Guardrail model) {
                this.detail = model.detail;
                this.suggestion = model.suggestion;
            } 

            /**
             * <p>The list of risk details.</p>
             */
            public Builder detail(java.util.List<GuardrailDetail> detail) {
                this.detail = detail;
                return this;
            }

            /**
             * <p>The handling suggestion.</p>
             * 
             * <strong>example:</strong>
             * <p>block</p>
             */
            public Builder suggestion(String suggestion) {
                this.suggestion = suggestion;
                return this;
            }

            public Guardrail build() {
                return new Guardrail(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListSubTasksResponseBody} extends {@link TeaModel}
     *
     * <p>ListSubTasksResponseBody</p>
     */
    public static class SensitiveDetail extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Desc")
        private String desc;

        @com.aliyun.core.annotation.NameInMap("Result")
        private java.util.List<String> result;

        private SensitiveDetail(Builder builder) {
            this.desc = builder.desc;
            this.result = builder.result;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SensitiveDetail create() {
            return builder().build();
        }

        /**
         * @return desc
         */
        public String getDesc() {
            return this.desc;
        }

        /**
         * @return result
         */
        public java.util.List<String> getResult() {
            return this.result;
        }

        public static final class Builder {
            private String desc; 
            private java.util.List<String> result; 

            private Builder() {
            } 

            private Builder(SensitiveDetail model) {
                this.desc = model.desc;
                this.result = model.result;
            } 

            /**
             * <p>The description.</p>
             * 
             * <strong>example:</strong>
             * <p>aliyun_ak_24</p>
             */
            public Builder desc(String desc) {
                this.desc = desc;
                return this;
            }

            /**
             * <p>The list of sensitive information.</p>
             */
            public Builder result(java.util.List<String> result) {
                this.result = result;
                return this;
            }

            public SensitiveDetail build() {
                return new SensitiveDetail(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListSubTasksResponseBody} extends {@link TeaModel}
     *
     * <p>ListSubTasksResponseBody</p>
     */
    public static class Sensitive extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Detail")
        private java.util.List<SensitiveDetail> detail;

        private Sensitive(Builder builder) {
            this.detail = builder.detail;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Sensitive create() {
            return builder().build();
        }

        /**
         * @return detail
         */
        public java.util.List<SensitiveDetail> getDetail() {
            return this.detail;
        }

        public static final class Builder {
            private java.util.List<SensitiveDetail> detail; 

            private Builder() {
            } 

            private Builder(Sensitive model) {
                this.detail = model.detail;
            } 

            /**
             * <p>The list of risk details.</p>
             */
            public Builder detail(java.util.List<SensitiveDetail> detail) {
                this.detail = detail;
                return this;
            }

            public Sensitive build() {
                return new Sensitive(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListSubTasksResponseBody} extends {@link TeaModel}
     *
     * <p>ListSubTasksResponseBody</p>
     */
    public static class Virus extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Ext")
        private String ext;

        @com.aliyun.core.annotation.NameInMap("Score")
        private Integer score;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private Virus(Builder builder) {
            this.ext = builder.ext;
            this.score = builder.score;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Virus create() {
            return builder().build();
        }

        /**
         * @return ext
         */
        public String getExt() {
            return this.ext;
        }

        /**
         * @return score
         */
        public Integer getScore() {
            return this.score;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String ext; 
            private Integer score; 
            private String type; 

            private Builder() {
            } 

            private Builder(Virus model) {
                this.ext = model.ext;
                this.score = model.score;
                this.type = model.type;
            } 

            /**
             * <p>The extended information field, which is a reserved parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>{}</p>
             */
            public Builder ext(String ext) {
                this.ext = ext;
                return this;
            }

            /**
             * <p>The risk score. The maximum score is 100.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder score(Integer score) {
                this.score = score;
                return this;
            }

            /**
             * <p>The virus type.</p>
             * 
             * <strong>example:</strong>
             * <p>Backdoor</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Virus build() {
                return new Virus(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListSubTasksResponseBody} extends {@link TeaModel}
     *
     * <p>ListSubTasksResponseBody</p>
     */
    public static class Ext extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Config")
        private Config config;

        @com.aliyun.core.annotation.NameInMap("Guardrail")
        private Guardrail guardrail;

        @com.aliyun.core.annotation.NameInMap("Sensitive")
        private Sensitive sensitive;

        @com.aliyun.core.annotation.NameInMap("Virus")
        private java.util.List<Virus> virus;

        private Ext(Builder builder) {
            this.config = builder.config;
            this.guardrail = builder.guardrail;
            this.sensitive = builder.sensitive;
            this.virus = builder.virus;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Ext create() {
            return builder().build();
        }

        /**
         * @return config
         */
        public Config getConfig() {
            return this.config;
        }

        /**
         * @return guardrail
         */
        public Guardrail getGuardrail() {
            return this.guardrail;
        }

        /**
         * @return sensitive
         */
        public Sensitive getSensitive() {
            return this.sensitive;
        }

        /**
         * @return virus
         */
        public java.util.List<Virus> getVirus() {
            return this.virus;
        }

        public static final class Builder {
            private Config config; 
            private Guardrail guardrail; 
            private Sensitive sensitive; 
            private java.util.List<Virus> virus; 

            private Builder() {
            } 

            private Builder(Ext model) {
                this.config = model.config;
                this.guardrail = model.guardrail;
                this.sensitive = model.sensitive;
                this.virus = model.virus;
            } 

            /**
             * <p>The configuration check risk.</p>
             */
            public Builder config(Config config) {
                this.config = config;
                return this;
            }

            /**
             * <p>The security guardrail detection risk.</p>
             */
            public Builder guardrail(Guardrail guardrail) {
                this.guardrail = guardrail;
                return this;
            }

            /**
             * <p>The sensitive information risk.</p>
             */
            public Builder sensitive(Sensitive sensitive) {
                this.sensitive = sensitive;
                return this;
            }

            /**
             * <p>The virus detection risk.</p>
             */
            public Builder virus(java.util.List<Virus> virus) {
                this.virus = virus;
                return this;
            }

            public Ext build() {
                return new Ext(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListSubTasksResponseBody} extends {@link TeaModel}
     *
     * <p>ListSubTasksResponseBody</p>
     */
    public static class RiskInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Ext")
        private Ext ext;

        @com.aliyun.core.annotation.NameInMap("Path")
        private String path;

        @com.aliyun.core.annotation.NameInMap("ResultType")
        private String resultType;

        private RiskInfo(Builder builder) {
            this.ext = builder.ext;
            this.path = builder.path;
            this.resultType = builder.resultType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RiskInfo create() {
            return builder().build();
        }

        /**
         * @return ext
         */
        public Ext getExt() {
            return this.ext;
        }

        /**
         * @return path
         */
        public String getPath() {
            return this.path;
        }

        /**
         * @return resultType
         */
        public String getResultType() {
            return this.resultType;
        }

        public static final class Builder {
            private Ext ext; 
            private String path; 
            private String resultType; 

            private Builder() {
            } 

            private Builder(RiskInfo model) {
                this.ext = model.ext;
                this.path = model.path;
                this.resultType = model.resultType;
            } 

            /**
             * <p>The list of file check risks.</p>
             */
            public Builder ext(Ext ext) {
                this.ext = ext;
                return this;
            }

            /**
             * <p>The file path.</p>
             * 
             * <strong>example:</strong>
             * <p>/home/97e55e6af371836f/</p>
             */
            public Builder path(String path) {
                this.path = path;
                return this;
            }

            /**
             * <p>The type of the check result. Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: No risk.</li>
             * <li><strong>1</strong>: Risk detected.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder resultType(String resultType) {
                this.resultType = resultType;
                return this;
            }

            public RiskInfo build() {
                return new RiskInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListSubTasksResponseBody} extends {@link TeaModel}
     *
     * <p>ListSubTasksResponseBody</p>
     */
    public static class SkillCheckResult extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("RiskInfo")
        private java.util.List<RiskInfo> riskInfo;

        private SkillCheckResult(Builder builder) {
            this.riskInfo = builder.riskInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SkillCheckResult create() {
            return builder().build();
        }

        /**
         * @return riskInfo
         */
        public java.util.List<RiskInfo> getRiskInfo() {
            return this.riskInfo;
        }

        public static final class Builder {
            private java.util.List<RiskInfo> riskInfo; 

            private Builder() {
            } 

            private Builder(SkillCheckResult model) {
                this.riskInfo = model.riskInfo;
            } 

            /**
             * <p>The file check risk information.</p>
             */
            public Builder riskInfo(java.util.List<RiskInfo> riskInfo) {
                this.riskInfo = riskInfo;
                return this;
            }

            public SkillCheckResult build() {
                return new SkillCheckResult(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListSubTasksResponseBody} extends {@link TeaModel}
     *
     * <p>ListSubTasksResponseBody</p>
     */
    public static class TaskResultMessage extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FullCheckResult")
        private FullCheckResult fullCheckResult;

        @com.aliyun.core.annotation.NameInMap("SkillCheckResult")
        private SkillCheckResult skillCheckResult;

        private TaskResultMessage(Builder builder) {
            this.fullCheckResult = builder.fullCheckResult;
            this.skillCheckResult = builder.skillCheckResult;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TaskResultMessage create() {
            return builder().build();
        }

        /**
         * @return fullCheckResult
         */
        public FullCheckResult getFullCheckResult() {
            return this.fullCheckResult;
        }

        /**
         * @return skillCheckResult
         */
        public SkillCheckResult getSkillCheckResult() {
            return this.skillCheckResult;
        }

        public static final class Builder {
            private FullCheckResult fullCheckResult; 
            private SkillCheckResult skillCheckResult; 

            private Builder() {
            } 

            private Builder(TaskResultMessage model) {
                this.fullCheckResult = model.fullCheckResult;
                this.skillCheckResult = model.skillCheckResult;
            } 

            /**
             * <p>The check results of the comprehensive health check task, which provides the status and description for each check item.</p>
             */
            public Builder fullCheckResult(FullCheckResult fullCheckResult) {
                this.fullCheckResult = fullCheckResult;
                return this;
            }

            /**
             * <p>The Skill check task result.</p>
             */
            public Builder skillCheckResult(SkillCheckResult skillCheckResult) {
                this.skillCheckResult = skillCheckResult;
                return this;
            }

            public TaskResultMessage build() {
                return new TaskResultMessage(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListSubTasksResponseBody} extends {@link TeaModel}
     *
     * <p>ListSubTasksResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AgentName")
        private String agentName;

        @com.aliyun.core.annotation.NameInMap("FileHash")
        private String fileHash;

        @com.aliyun.core.annotation.NameInMap("GmtTaskFinished")
        private Long gmtTaskFinished;

        @com.aliyun.core.annotation.NameInMap("GmtTaskStart")
        private Long gmtTaskStart;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("Target")
        private String target;

        @com.aliyun.core.annotation.NameInMap("TaskResultMessage")
        private TaskResultMessage taskResultMessage;

        @com.aliyun.core.annotation.NameInMap("TaskStatus")
        private String taskStatus;

        private Data(Builder builder) {
            this.agentName = builder.agentName;
            this.fileHash = builder.fileHash;
            this.gmtTaskFinished = builder.gmtTaskFinished;
            this.gmtTaskStart = builder.gmtTaskStart;
            this.id = builder.id;
            this.target = builder.target;
            this.taskResultMessage = builder.taskResultMessage;
            this.taskStatus = builder.taskStatus;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return agentName
         */
        public String getAgentName() {
            return this.agentName;
        }

        /**
         * @return fileHash
         */
        public String getFileHash() {
            return this.fileHash;
        }

        /**
         * @return gmtTaskFinished
         */
        public Long getGmtTaskFinished() {
            return this.gmtTaskFinished;
        }

        /**
         * @return gmtTaskStart
         */
        public Long getGmtTaskStart() {
            return this.gmtTaskStart;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return target
         */
        public String getTarget() {
            return this.target;
        }

        /**
         * @return taskResultMessage
         */
        public TaskResultMessage getTaskResultMessage() {
            return this.taskResultMessage;
        }

        /**
         * @return taskStatus
         */
        public String getTaskStatus() {
            return this.taskStatus;
        }

        public static final class Builder {
            private String agentName; 
            private String fileHash; 
            private Long gmtTaskFinished; 
            private Long gmtTaskStart; 
            private Long id; 
            private String target; 
            private TaskResultMessage taskResultMessage; 
            private String taskStatus; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.agentName = model.agentName;
                this.fileHash = model.fileHash;
                this.gmtTaskFinished = model.gmtTaskFinished;
                this.gmtTaskStart = model.gmtTaskStart;
                this.id = model.id;
                this.target = model.target;
                this.taskResultMessage = model.taskResultMessage;
                this.taskStatus = model.taskStatus;
            } 

            /**
             * <p>The display name of the agent. It is parsed from the application information based on the target of the subtask. This field is empty if the application record is missing.</p>
             * 
             * <strong>example:</strong>
             * <p>agent-01</p>
             */
            public Builder agentName(String agentName) {
                this.agentName = agentName;
                return this;
            }

            /**
             * <p>The hash value of the uploaded file.</p>
             * 
             * <strong>example:</strong>
             * <p>03d1f08455e965cac0351eaa59256fd9</p>
             */
            public Builder fileHash(String fileHash) {
                this.fileHash = fileHash;
                return this;
            }

            /**
             * <p>The millisecond-level timestamp when the subtask finishes execution. This field is empty if the subtask has not finished.</p>
             * 
             * <strong>example:</strong>
             * <p>1764036120000</p>
             */
            public Builder gmtTaskFinished(Long gmtTaskFinished) {
                this.gmtTaskFinished = gmtTaskFinished;
                return this;
            }

            /**
             * <p>The millisecond-level timestamp when the subtask starts execution. This field is empty if the subtask has not started.</p>
             * 
             * <strong>example:</strong>
             * <p>1764036000000</p>
             */
            public Builder gmtTaskStart(Long gmtTaskStart) {
                this.gmtTaskStart = gmtTaskStart;
                return this;
            }

            /**
             * <p>The task ID.</p>
             * 
             * <strong>example:</strong>
             * <p>4190063324899520</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The detection target.</p>
             * 
             * <strong>example:</strong>
             * <p>c7acb2f1264e4467887ef8f4c36c44ca1</p>
             */
            public Builder target(String target) {
                this.target = target;
                return this;
            }

            /**
             * <p>The task result message.</p>
             */
            public Builder taskResultMessage(TaskResultMessage taskResultMessage) {
                this.taskResultMessage = taskResultMessage;
                return this;
            }

            /**
             * <p>The task status.</p>
             * 
             * <strong>example:</strong>
             * <p>success</p>
             */
            public Builder taskStatus(String taskStatus) {
                this.taskStatus = taskStatus;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListSubTasksResponseBody} extends {@link TeaModel}
     *
     * <p>ListSubTasksResponseBody</p>
     */
    public static class PageInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Count")
        private String count;

        @com.aliyun.core.annotation.NameInMap("CurrentPage")
        private Integer currentPage;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Integer totalCount;

        private PageInfo(Builder builder) {
            this.count = builder.count;
            this.currentPage = builder.currentPage;
            this.pageSize = builder.pageSize;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PageInfo create() {
            return builder().build();
        }

        /**
         * @return count
         */
        public String getCount() {
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
         * @return totalCount
         */
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private String count; 
            private Integer currentPage; 
            private Integer pageSize; 
            private Integer totalCount; 

            private Builder() {
            } 

            private Builder(PageInfo model) {
                this.count = model.count;
                this.currentPage = model.currentPage;
                this.pageSize = model.pageSize;
                this.totalCount = model.totalCount;
            } 

            /**
             * <p>The number of entries returned on the current page.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder count(String count) {
                this.count = count;
                return this;
            }

            /**
             * <p>The current page number.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder currentPage(Integer currentPage) {
                this.currentPage = currentPage;
                return this;
            }

            /**
             * <p>The page size.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * <p>The total number of records in the query result.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder totalCount(Integer totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public PageInfo build() {
                return new PageInfo(this);
            } 

        } 

    }
}
