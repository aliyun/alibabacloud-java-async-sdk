// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.das20200116.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetAutoResourceOptimizeRulesResponseBody} extends {@link TeaModel}
 *
 * <p>GetAutoResourceOptimizeRulesResponseBody</p>
 */
public class GetAutoResourceOptimizeRulesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Long code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GetAutoResourceOptimizeRulesResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAutoResourceOptimizeRulesResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public Long getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
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
        private Long code; 
        private Data data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        /**
         * <p>The HTTP status code returned.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(Long code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The data returned.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The returned message.</p>
         * <blockquote>
         * <p> If the request was successful, <strong>Successful</strong> is returned. If the request failed, an error message such as an error code is returned.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Successful</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>B6D17591-B48B-4D31-9CD6-9B9796B2****</p>
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
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetAutoResourceOptimizeRulesResponseBody build() {
            return new GetAutoResourceOptimizeRulesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetAutoResourceOptimizeRulesResponseBody} extends {@link TeaModel}
     *
     * <p>GetAutoResourceOptimizeRulesResponseBody</p>
     */
    public static class EnableAutoResourceOptimizeList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AutoDefragment")
        private Boolean autoDefragment;

        @com.aliyun.core.annotation.NameInMap("DasProOn")
        private Boolean dasProOn;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("TableFragmentationRatio")
        private Double tableFragmentationRatio;

        @com.aliyun.core.annotation.NameInMap("TableSpaceSize")
        private Double tableSpaceSize;

        @com.aliyun.core.annotation.NameInMap("UserId")
        private String userId;

        private EnableAutoResourceOptimizeList(Builder builder) {
            this.autoDefragment = builder.autoDefragment;
            this.dasProOn = builder.dasProOn;
            this.instanceId = builder.instanceId;
            this.tableFragmentationRatio = builder.tableFragmentationRatio;
            this.tableSpaceSize = builder.tableSpaceSize;
            this.userId = builder.userId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EnableAutoResourceOptimizeList create() {
            return builder().build();
        }

        /**
         * @return autoDefragment
         */
        public Boolean getAutoDefragment() {
            return this.autoDefragment;
        }

        /**
         * @return dasProOn
         */
        public Boolean getDasProOn() {
            return this.dasProOn;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return tableFragmentationRatio
         */
        public Double getTableFragmentationRatio() {
            return this.tableFragmentationRatio;
        }

        /**
         * @return tableSpaceSize
         */
        public Double getTableSpaceSize() {
            return this.tableSpaceSize;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        public static final class Builder {
            private Boolean autoDefragment; 
            private Boolean dasProOn; 
            private String instanceId; 
            private Double tableFragmentationRatio; 
            private Double tableSpaceSize; 
            private String userId; 

            /**
             * <p>Indicates whether the automatic fragment recycling feature is enabled. Valid values:</p>
             * <ul>
             * <li><strong>true</strong></li>
             * <li><strong>false</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder autoDefragment(Boolean autoDefragment) {
                this.autoDefragment = autoDefragment;
                return this;
            }

            /**
             * <p>Indicates whether DAS Enterprise Edition is enabled. Valid values:</p>
             * <ul>
             * <li><strong>true</strong></li>
             * <li><strong>false</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder dasProOn(Boolean dasProOn) {
                this.dasProOn = dasProOn;
                return this;
            }

            /**
             * <p>The database instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>rm-2ze8g2am97624****</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The fragmentation rate of a single physical table for which the automatic fragment recycling feature is enabled.</p>
             * 
             * <strong>example:</strong>
             * <p>0.2</p>
             */
            public Builder tableFragmentationRatio(Double tableFragmentationRatio) {
                this.tableFragmentationRatio = tableFragmentationRatio;
                return this;
            }

            /**
             * <p>The minimum storage usage of a single physical table for which the automatic fragment recycling feature is enabled. Unit: GB.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder tableSpaceSize(Double tableSpaceSize) {
                this.tableSpaceSize = tableSpaceSize;
                return this;
            }

            /**
             * <p>The ID of the Alibaba Cloud account that is used to create the database instance.</p>
             * 
             * <strong>example:</strong>
             * <p>140692647406****</p>
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            public EnableAutoResourceOptimizeList build() {
                return new EnableAutoResourceOptimizeList(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetAutoResourceOptimizeRulesResponseBody} extends {@link TeaModel}
     *
     * <p>GetAutoResourceOptimizeRulesResponseBody</p>
     */
    public static class HasEnableRuleButNotDasProList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AutoDefragment")
        private Boolean autoDefragment;

        @com.aliyun.core.annotation.NameInMap("DasProOn")
        private Boolean dasProOn;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("TableFragmentationRatio")
        private Double tableFragmentationRatio;

        @com.aliyun.core.annotation.NameInMap("TableSpaceSize")
        private Double tableSpaceSize;

        @com.aliyun.core.annotation.NameInMap("UserId")
        private String userId;

        private HasEnableRuleButNotDasProList(Builder builder) {
            this.autoDefragment = builder.autoDefragment;
            this.dasProOn = builder.dasProOn;
            this.instanceId = builder.instanceId;
            this.tableFragmentationRatio = builder.tableFragmentationRatio;
            this.tableSpaceSize = builder.tableSpaceSize;
            this.userId = builder.userId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static HasEnableRuleButNotDasProList create() {
            return builder().build();
        }

        /**
         * @return autoDefragment
         */
        public Boolean getAutoDefragment() {
            return this.autoDefragment;
        }

        /**
         * @return dasProOn
         */
        public Boolean getDasProOn() {
            return this.dasProOn;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return tableFragmentationRatio
         */
        public Double getTableFragmentationRatio() {
            return this.tableFragmentationRatio;
        }

        /**
         * @return tableSpaceSize
         */
        public Double getTableSpaceSize() {
            return this.tableSpaceSize;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        public static final class Builder {
            private Boolean autoDefragment; 
            private Boolean dasProOn; 
            private String instanceId; 
            private Double tableFragmentationRatio; 
            private Double tableSpaceSize; 
            private String userId; 

            /**
             * <p>Indicates whether the automatic fragment recycling feature is enabled. Valid values:</p>
             * <ul>
             * <li><strong>true</strong></li>
             * <li><strong>false</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder autoDefragment(Boolean autoDefragment) {
                this.autoDefragment = autoDefragment;
                return this;
            }

            /**
             * <p>Indicates whether DAS Enterprise Edition is enabled. Valid values:</p>
             * <ul>
             * <li><strong>true</strong></li>
             * <li><strong>false</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder dasProOn(Boolean dasProOn) {
                this.dasProOn = dasProOn;
                return this;
            }

            /**
             * <p>The database instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>rm-2ze9xrhze0709****</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The fragmentation rate of a single physical table for which the automatic fragment recycling feature is enabled.</p>
             * 
             * <strong>example:</strong>
             * <p>0.2</p>
             */
            public Builder tableFragmentationRatio(Double tableFragmentationRatio) {
                this.tableFragmentationRatio = tableFragmentationRatio;
                return this;
            }

            /**
             * <p>The minimum storage usage of a single physical table for which the automatic fragment recycling feature is enabled. Unit: GB.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder tableSpaceSize(Double tableSpaceSize) {
                this.tableSpaceSize = tableSpaceSize;
                return this;
            }

            /**
             * <p>The ID of the Alibaba Cloud account that is used to create the database instance.</p>
             * 
             * <strong>example:</strong>
             * <p>140692647406****</p>
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            public HasEnableRuleButNotDasProList build() {
                return new HasEnableRuleButNotDasProList(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetAutoResourceOptimizeRulesResponseBody} extends {@link TeaModel}
     *
     * <p>GetAutoResourceOptimizeRulesResponseBody</p>
     */
    public static class TurnOffAutoResourceOptimizeList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AutoDefragment")
        private Boolean autoDefragment;

        @com.aliyun.core.annotation.NameInMap("DasProOn")
        private Boolean dasProOn;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("TableFragmentationRatio")
        private Double tableFragmentationRatio;

        @com.aliyun.core.annotation.NameInMap("TableSpaceSize")
        private Double tableSpaceSize;

        @com.aliyun.core.annotation.NameInMap("UserId")
        private String userId;

        private TurnOffAutoResourceOptimizeList(Builder builder) {
            this.autoDefragment = builder.autoDefragment;
            this.dasProOn = builder.dasProOn;
            this.instanceId = builder.instanceId;
            this.tableFragmentationRatio = builder.tableFragmentationRatio;
            this.tableSpaceSize = builder.tableSpaceSize;
            this.userId = builder.userId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TurnOffAutoResourceOptimizeList create() {
            return builder().build();
        }

        /**
         * @return autoDefragment
         */
        public Boolean getAutoDefragment() {
            return this.autoDefragment;
        }

        /**
         * @return dasProOn
         */
        public Boolean getDasProOn() {
            return this.dasProOn;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return tableFragmentationRatio
         */
        public Double getTableFragmentationRatio() {
            return this.tableFragmentationRatio;
        }

        /**
         * @return tableSpaceSize
         */
        public Double getTableSpaceSize() {
            return this.tableSpaceSize;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        public static final class Builder {
            private Boolean autoDefragment; 
            private Boolean dasProOn; 
            private String instanceId; 
            private Double tableFragmentationRatio; 
            private Double tableSpaceSize; 
            private String userId; 

            /**
             * <p>Indicates whether the automatic fragment recycling feature is enabled. Valid values:</p>
             * <ul>
             * <li><strong>true</strong>:</li>
             * <li><strong>false</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder autoDefragment(Boolean autoDefragment) {
                this.autoDefragment = autoDefragment;
                return this;
            }

            /**
             * <p>Indicates whether DAS Enterprise Edition is enabled. Valid values:</p>
             * <ul>
             * <li><strong>true</strong></li>
             * <li><strong>false</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder dasProOn(Boolean dasProOn) {
                this.dasProOn = dasProOn;
                return this;
            }

            /**
             * <p>The database instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>rm-2vc54m2a6pd6p****</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The fragmentation rate of a single physical table for which the automatic fragment recycling feature is enabled.</p>
             * 
             * <strong>example:</strong>
             * <p>0.2</p>
             */
            public Builder tableFragmentationRatio(Double tableFragmentationRatio) {
                this.tableFragmentationRatio = tableFragmentationRatio;
                return this;
            }

            /**
             * <p>The minimum storage usage of a single physical table for which the automatic fragment recycling feature is enabled. Unit: GB.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder tableSpaceSize(Double tableSpaceSize) {
                this.tableSpaceSize = tableSpaceSize;
                return this;
            }

            /**
             * <p>The ID of the Alibaba Cloud account that is used to create the database instance.</p>
             * 
             * <strong>example:</strong>
             * <p>140692647406****</p>
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            public TurnOffAutoResourceOptimizeList build() {
                return new TurnOffAutoResourceOptimizeList(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetAutoResourceOptimizeRulesResponseBody} extends {@link TeaModel}
     *
     * <p>GetAutoResourceOptimizeRulesResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EnableAutoResourceOptimizeCount")
        private Long enableAutoResourceOptimizeCount;

        @com.aliyun.core.annotation.NameInMap("EnableAutoResourceOptimizeList")
        private java.util.List < EnableAutoResourceOptimizeList> enableAutoResourceOptimizeList;

        @com.aliyun.core.annotation.NameInMap("HasEnableRuleButNotDasProCount")
        private Long hasEnableRuleButNotDasProCount;

        @com.aliyun.core.annotation.NameInMap("HasEnableRuleButNotDasProList")
        private java.util.List < HasEnableRuleButNotDasProList> hasEnableRuleButNotDasProList;

        @com.aliyun.core.annotation.NameInMap("NeverEnableAutoResourceOptimizeOrReleasedInstanceCount")
        private Long neverEnableAutoResourceOptimizeOrReleasedInstanceCount;

        @com.aliyun.core.annotation.NameInMap("NeverEnableAutoResourceOptimizeOrReleasedInstanceIdList")
        private java.util.List < String > neverEnableAutoResourceOptimizeOrReleasedInstanceIdList;

        @com.aliyun.core.annotation.NameInMap("TotalAutoResourceOptimizeRulesCount")
        private Long totalAutoResourceOptimizeRulesCount;

        @com.aliyun.core.annotation.NameInMap("TurnOffAutoResourceOptimizeCount")
        private Long turnOffAutoResourceOptimizeCount;

        @com.aliyun.core.annotation.NameInMap("TurnOffAutoResourceOptimizeList")
        private java.util.List < TurnOffAutoResourceOptimizeList> turnOffAutoResourceOptimizeList;

        private Data(Builder builder) {
            this.enableAutoResourceOptimizeCount = builder.enableAutoResourceOptimizeCount;
            this.enableAutoResourceOptimizeList = builder.enableAutoResourceOptimizeList;
            this.hasEnableRuleButNotDasProCount = builder.hasEnableRuleButNotDasProCount;
            this.hasEnableRuleButNotDasProList = builder.hasEnableRuleButNotDasProList;
            this.neverEnableAutoResourceOptimizeOrReleasedInstanceCount = builder.neverEnableAutoResourceOptimizeOrReleasedInstanceCount;
            this.neverEnableAutoResourceOptimizeOrReleasedInstanceIdList = builder.neverEnableAutoResourceOptimizeOrReleasedInstanceIdList;
            this.totalAutoResourceOptimizeRulesCount = builder.totalAutoResourceOptimizeRulesCount;
            this.turnOffAutoResourceOptimizeCount = builder.turnOffAutoResourceOptimizeCount;
            this.turnOffAutoResourceOptimizeList = builder.turnOffAutoResourceOptimizeList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return enableAutoResourceOptimizeCount
         */
        public Long getEnableAutoResourceOptimizeCount() {
            return this.enableAutoResourceOptimizeCount;
        }

        /**
         * @return enableAutoResourceOptimizeList
         */
        public java.util.List < EnableAutoResourceOptimizeList> getEnableAutoResourceOptimizeList() {
            return this.enableAutoResourceOptimizeList;
        }

        /**
         * @return hasEnableRuleButNotDasProCount
         */
        public Long getHasEnableRuleButNotDasProCount() {
            return this.hasEnableRuleButNotDasProCount;
        }

        /**
         * @return hasEnableRuleButNotDasProList
         */
        public java.util.List < HasEnableRuleButNotDasProList> getHasEnableRuleButNotDasProList() {
            return this.hasEnableRuleButNotDasProList;
        }

        /**
         * @return neverEnableAutoResourceOptimizeOrReleasedInstanceCount
         */
        public Long getNeverEnableAutoResourceOptimizeOrReleasedInstanceCount() {
            return this.neverEnableAutoResourceOptimizeOrReleasedInstanceCount;
        }

        /**
         * @return neverEnableAutoResourceOptimizeOrReleasedInstanceIdList
         */
        public java.util.List < String > getNeverEnableAutoResourceOptimizeOrReleasedInstanceIdList() {
            return this.neverEnableAutoResourceOptimizeOrReleasedInstanceIdList;
        }

        /**
         * @return totalAutoResourceOptimizeRulesCount
         */
        public Long getTotalAutoResourceOptimizeRulesCount() {
            return this.totalAutoResourceOptimizeRulesCount;
        }

        /**
         * @return turnOffAutoResourceOptimizeCount
         */
        public Long getTurnOffAutoResourceOptimizeCount() {
            return this.turnOffAutoResourceOptimizeCount;
        }

        /**
         * @return turnOffAutoResourceOptimizeList
         */
        public java.util.List < TurnOffAutoResourceOptimizeList> getTurnOffAutoResourceOptimizeList() {
            return this.turnOffAutoResourceOptimizeList;
        }

        public static final class Builder {
            private Long enableAutoResourceOptimizeCount; 
            private java.util.List < EnableAutoResourceOptimizeList> enableAutoResourceOptimizeList; 
            private Long hasEnableRuleButNotDasProCount; 
            private java.util.List < HasEnableRuleButNotDasProList> hasEnableRuleButNotDasProList; 
            private Long neverEnableAutoResourceOptimizeOrReleasedInstanceCount; 
            private java.util.List < String > neverEnableAutoResourceOptimizeOrReleasedInstanceIdList; 
            private Long totalAutoResourceOptimizeRulesCount; 
            private Long turnOffAutoResourceOptimizeCount; 
            private java.util.List < TurnOffAutoResourceOptimizeList> turnOffAutoResourceOptimizeList; 

            /**
             * <p>The number of database instances for which the automatic fragment recycling feature is currently enabled.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder enableAutoResourceOptimizeCount(Long enableAutoResourceOptimizeCount) {
                this.enableAutoResourceOptimizeCount = enableAutoResourceOptimizeCount;
                return this;
            }

            /**
             * <p>The database instances for which the automatic fragment recycling feature is currently enabled.</p>
             */
            public Builder enableAutoResourceOptimizeList(java.util.List < EnableAutoResourceOptimizeList> enableAutoResourceOptimizeList) {
                this.enableAutoResourceOptimizeList = enableAutoResourceOptimizeList;
                return this;
            }

            /**
             * <p>The number of database instances for which the automatic fragment recycling feature is enabled and DAS Enterprise Edition is disabled.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder hasEnableRuleButNotDasProCount(Long hasEnableRuleButNotDasProCount) {
                this.hasEnableRuleButNotDasProCount = hasEnableRuleButNotDasProCount;
                return this;
            }

            /**
             * <p>The database instances for which the automatic fragment recycling feature is enabled and DAS Enterprise Edition is disabled.</p>
             * <blockquote>
             * <p> Automatic fragment recycling tasks are run on this type of database instances only if DAS Enterprise Edition is enabled for the database instances again.</p>
             * </blockquote>
             */
            public Builder hasEnableRuleButNotDasProList(java.util.List < HasEnableRuleButNotDasProList> hasEnableRuleButNotDasProList) {
                this.hasEnableRuleButNotDasProList = hasEnableRuleButNotDasProList;
                return this;
            }

            /**
             * <p>The number of database instances that do not exist or for which the automatic fragment recycling feature has never been enabled.</p>
             * <blockquote>
             * <p> If a database instance does not exist, the instance has been released or the specified instance ID is invalid.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder neverEnableAutoResourceOptimizeOrReleasedInstanceCount(Long neverEnableAutoResourceOptimizeOrReleasedInstanceCount) {
                this.neverEnableAutoResourceOptimizeOrReleasedInstanceCount = neverEnableAutoResourceOptimizeOrReleasedInstanceCount;
                return this;
            }

            /**
             * <p>The database instances that do not exist or for which the automatic fragment recycling feature has never been enabled.</p>
             */
            public Builder neverEnableAutoResourceOptimizeOrReleasedInstanceIdList(java.util.List < String > neverEnableAutoResourceOptimizeOrReleasedInstanceIdList) {
                this.neverEnableAutoResourceOptimizeOrReleasedInstanceIdList = neverEnableAutoResourceOptimizeOrReleasedInstanceIdList;
                return this;
            }

            /**
             * <p>The number of database instances for which the automatic fragment recycling feature has been enabled.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder totalAutoResourceOptimizeRulesCount(Long totalAutoResourceOptimizeRulesCount) {
                this.totalAutoResourceOptimizeRulesCount = totalAutoResourceOptimizeRulesCount;
                return this;
            }

            /**
             * <p>The number of database instances for which the automatic fragment recycling feature was once enabled but is currently disabled.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder turnOffAutoResourceOptimizeCount(Long turnOffAutoResourceOptimizeCount) {
                this.turnOffAutoResourceOptimizeCount = turnOffAutoResourceOptimizeCount;
                return this;
            }

            /**
             * <p>The database instances for which the automatic fragment recycling feature was once enabled but is currently disabled.</p>
             */
            public Builder turnOffAutoResourceOptimizeList(java.util.List < TurnOffAutoResourceOptimizeList> turnOffAutoResourceOptimizeList) {
                this.turnOffAutoResourceOptimizeList = turnOffAutoResourceOptimizeList;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
