// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.das20200116.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetAutoResourceOptimizeRulesResponseBody} extends {@link TeaModel}
 *
 * <p>GetAutoResourceOptimizeRulesResponseBody</p>
 */
public class GetAutoResourceOptimizeRulesResponseBody extends TeaModel {
    @NameInMap("Code")
    private Long code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
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
         * The HTTP status code returned.
         */
        public Builder code(Long code) {
            this.code = code;
            return this;
        }

        /**
         * The data returned.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * The returned message.
         * <p>
         * 
         * >  If the request was successful, **Successful** is returned. If the request failed, an error message such as an error code is returned.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Indicates whether the request was successful. Valid values:
         * <p>
         * 
         * *   **true**
         * *   **false**
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetAutoResourceOptimizeRulesResponseBody build() {
            return new GetAutoResourceOptimizeRulesResponseBody(this);
        } 

    } 

    public static class EnableAutoResourceOptimizeList extends TeaModel {
        @NameInMap("AutoDefragment")
        private Boolean autoDefragment;

        @NameInMap("DasProOn")
        private Boolean dasProOn;

        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("TableFragmentationRatio")
        private Double tableFragmentationRatio;

        @NameInMap("TableSpaceSize")
        private Double tableSpaceSize;

        @NameInMap("UserId")
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
             * Indicates whether the automatic fragment recycling feature is enabled. Valid values:
             * <p>
             * 
             * * **true**
             * * **false**
             */
            public Builder autoDefragment(Boolean autoDefragment) {
                this.autoDefragment = autoDefragment;
                return this;
            }

            /**
             * Indicates whether DAS Professional Edition is enabled. Valid values:
             * <p>
             * 
             * * **true**
             * * **false**
             */
            public Builder dasProOn(Boolean dasProOn) {
                this.dasProOn = dasProOn;
                return this;
            }

            /**
             * The database instance ID.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * The fragmentation rate of a single physical table for which the automatic fragment recycling feature is enabled.
             */
            public Builder tableFragmentationRatio(Double tableFragmentationRatio) {
                this.tableFragmentationRatio = tableFragmentationRatio;
                return this;
            }

            /**
             * The minimum storage usage of a single physical table for which the automatic fragment recycling feature is enabled. Unit: GB.
             */
            public Builder tableSpaceSize(Double tableSpaceSize) {
                this.tableSpaceSize = tableSpaceSize;
                return this;
            }

            /**
             * The ID of the Alibaba Cloud account that is used to create the database instance.
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
    public static class HasEnableRuleButNotDasProList extends TeaModel {
        @NameInMap("AutoDefragment")
        private Boolean autoDefragment;

        @NameInMap("DasProOn")
        private Boolean dasProOn;

        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("TableFragmentationRatio")
        private Double tableFragmentationRatio;

        @NameInMap("TableSpaceSize")
        private Double tableSpaceSize;

        @NameInMap("UserId")
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
             * Indicates whether the automatic fragment recycling feature is enabled. Valid values:
             * <p>
             * 
             * * **true**
             * * **false**
             */
            public Builder autoDefragment(Boolean autoDefragment) {
                this.autoDefragment = autoDefragment;
                return this;
            }

            /**
             * Indicates whether DAS Professional Edition is enabled. Valid values:
             * <p>
             * 
             * * **true**
             * * **false**
             */
            public Builder dasProOn(Boolean dasProOn) {
                this.dasProOn = dasProOn;
                return this;
            }

            /**
             * The database instance ID.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * The fragmentation rate of a single physical table for which the automatic fragment recycling feature is enabled.
             */
            public Builder tableFragmentationRatio(Double tableFragmentationRatio) {
                this.tableFragmentationRatio = tableFragmentationRatio;
                return this;
            }

            /**
             * The minimum storage usage of a single physical table for which the automatic fragment recycling feature is enabled. Unit: GB.
             */
            public Builder tableSpaceSize(Double tableSpaceSize) {
                this.tableSpaceSize = tableSpaceSize;
                return this;
            }

            /**
             * The ID of the Alibaba Cloud account that is used to create the database instance.
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
    public static class TurnOffAutoResourceOptimizeList extends TeaModel {
        @NameInMap("AutoDefragment")
        private Boolean autoDefragment;

        @NameInMap("DasProOn")
        private Boolean dasProOn;

        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("TableFragmentationRatio")
        private Double tableFragmentationRatio;

        @NameInMap("TableSpaceSize")
        private Double tableSpaceSize;

        @NameInMap("UserId")
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
             * Indicates whether the automatic fragment recycling feature is enabled. Valid values:
             * <p>
             * 
             * * **true**
             * * **false**
             */
            public Builder autoDefragment(Boolean autoDefragment) {
                this.autoDefragment = autoDefragment;
                return this;
            }

            /**
             * Indicates whether DAS Professional Edition is enabled. Valid values:
             * <p>
             * 
             * * **true**
             * * **false**
             */
            public Builder dasProOn(Boolean dasProOn) {
                this.dasProOn = dasProOn;
                return this;
            }

            /**
             * The database instance ID.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * The fragmentation rate of a single physical table for which the automatic fragment recycling feature is enabled.
             */
            public Builder tableFragmentationRatio(Double tableFragmentationRatio) {
                this.tableFragmentationRatio = tableFragmentationRatio;
                return this;
            }

            /**
             * Indicates whether the automatic fragment recycling feature is enabled. Valid values:
             * <p>
             * 
             * true
             * false
             */
            public Builder tableSpaceSize(Double tableSpaceSize) {
                this.tableSpaceSize = tableSpaceSize;
                return this;
            }

            /**
             * The ID of the Alibaba Cloud account that is used to create the database instance.
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
    public static class Data extends TeaModel {
        @NameInMap("EnableAutoResourceOptimizeCount")
        private Long enableAutoResourceOptimizeCount;

        @NameInMap("EnableAutoResourceOptimizeList")
        private java.util.List < EnableAutoResourceOptimizeList> enableAutoResourceOptimizeList;

        @NameInMap("HasEnableRuleButNotDasProCount")
        private Long hasEnableRuleButNotDasProCount;

        @NameInMap("HasEnableRuleButNotDasProList")
        private java.util.List < HasEnableRuleButNotDasProList> hasEnableRuleButNotDasProList;

        @NameInMap("NeverEnableAutoResourceOptimizeOrReleasedInstanceCount")
        private Long neverEnableAutoResourceOptimizeOrReleasedInstanceCount;

        @NameInMap("NeverEnableAutoResourceOptimizeOrReleasedInstanceIdList")
        private java.util.List < String > neverEnableAutoResourceOptimizeOrReleasedInstanceIdList;

        @NameInMap("TotalAutoResourceOptimizeRulesCount")
        private Long totalAutoResourceOptimizeRulesCount;

        @NameInMap("TurnOffAutoResourceOptimizeCount")
        private Long turnOffAutoResourceOptimizeCount;

        @NameInMap("TurnOffAutoResourceOptimizeList")
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
             * The number of database instances for which the automatic fragment recycling feature is currently enabled.
             */
            public Builder enableAutoResourceOptimizeCount(Long enableAutoResourceOptimizeCount) {
                this.enableAutoResourceOptimizeCount = enableAutoResourceOptimizeCount;
                return this;
            }

            /**
             * The database instances for which the automatic fragment recycling feature is currently enabled.
             */
            public Builder enableAutoResourceOptimizeList(java.util.List < EnableAutoResourceOptimizeList> enableAutoResourceOptimizeList) {
                this.enableAutoResourceOptimizeList = enableAutoResourceOptimizeList;
                return this;
            }

            /**
             * The number of database instances for which the automatic fragment recycling feature is enabled and DAS Professional Edition is disabled.
             */
            public Builder hasEnableRuleButNotDasProCount(Long hasEnableRuleButNotDasProCount) {
                this.hasEnableRuleButNotDasProCount = hasEnableRuleButNotDasProCount;
                return this;
            }

            /**
             * The database instances for which the automatic fragment recycling feature is enabled and DAS Professional Edition is disabled.
             * <p>
             * 
             * > This type of database instance does not perform automatic fragment recycling tasks until DAS Professional Edition is enabled for the instances again.
             */
            public Builder hasEnableRuleButNotDasProList(java.util.List < HasEnableRuleButNotDasProList> hasEnableRuleButNotDasProList) {
                this.hasEnableRuleButNotDasProList = hasEnableRuleButNotDasProList;
                return this;
            }

            /**
             * The number of database instances that do not exist or for which the automatic fragment recycling feature has never been enabled.
             * <p>
             * 
             * >  If a database instance does not exist, the instance has been released or the specified instance ID is invalid.
             */
            public Builder neverEnableAutoResourceOptimizeOrReleasedInstanceCount(Long neverEnableAutoResourceOptimizeOrReleasedInstanceCount) {
                this.neverEnableAutoResourceOptimizeOrReleasedInstanceCount = neverEnableAutoResourceOptimizeOrReleasedInstanceCount;
                return this;
            }

            /**
             * The database instances that do not exist or for which the automatic fragment recycling feature has never been enabled.
             */
            public Builder neverEnableAutoResourceOptimizeOrReleasedInstanceIdList(java.util.List < String > neverEnableAutoResourceOptimizeOrReleasedInstanceIdList) {
                this.neverEnableAutoResourceOptimizeOrReleasedInstanceIdList = neverEnableAutoResourceOptimizeOrReleasedInstanceIdList;
                return this;
            }

            /**
             * The number of database instances for which the automatic fragment recycling feature has been enabled.
             */
            public Builder totalAutoResourceOptimizeRulesCount(Long totalAutoResourceOptimizeRulesCount) {
                this.totalAutoResourceOptimizeRulesCount = totalAutoResourceOptimizeRulesCount;
                return this;
            }

            /**
             * The number of database instances for which the automatic fragment recycling feature was once enabled but is currently disabled.
             */
            public Builder turnOffAutoResourceOptimizeCount(Long turnOffAutoResourceOptimizeCount) {
                this.turnOffAutoResourceOptimizeCount = turnOffAutoResourceOptimizeCount;
                return this;
            }

            /**
             * The database instances for which the automatic fragment recycling feature was once enabled but is currently disabled.
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
