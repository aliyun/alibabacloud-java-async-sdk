// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20210320.models;

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
 * {@link ListComponentInstancesResponseBody} extends {@link TeaModel}
 *
 * <p>ListComponentInstancesResponseBody</p>
 */
public class ListComponentInstancesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ComponentInstances")
    private java.util.List<ComponentInstances> componentInstances;

    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private ListComponentInstancesResponseBody(Builder builder) {
        this.componentInstances = builder.componentInstances;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListComponentInstancesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return componentInstances
     */
    public java.util.List<ComponentInstances> getComponentInstances() {
        return this.componentInstances;
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
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
        private java.util.List<ComponentInstances> componentInstances; 
        private Integer maxResults; 
        private String nextToken; 
        private String requestId; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(ListComponentInstancesResponseBody model) {
            this.componentInstances = model.componentInstances;
            this.maxResults = model.maxResults;
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The list of instance component installation information.</p>
         */
        public Builder componentInstances(java.util.List<ComponentInstances> componentInstances) {
            this.componentInstances = componentInstances;
            return this;
        }

        /**
         * <p>The maximum number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The pagination token that is used in the next request to retrieve a new page of results. If you leave this parameter empty, the query starts from the beginning.</p>
         * 
         * <strong>example:</strong>
         * <p>“”</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>7345241A-014C-17D2-A3AC-C72771188F46</p>
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

        public ListComponentInstancesResponseBody build() {
            return new ListComponentInstancesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListComponentInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>ListComponentInstancesResponseBody</p>
     */
    public static class ComponentInstances extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ApplicationName")
        private String applicationName;

        @com.aliyun.core.annotation.NameInMap("BizState")
        private String bizState;

        @com.aliyun.core.annotation.NameInMap("CommissionState")
        private String commissionState;

        @com.aliyun.core.annotation.NameInMap("ComponentInstanceState")
        private String componentInstanceState;

        @com.aliyun.core.annotation.NameInMap("ComponentName")
        private String componentName;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private Long createTime;

        @com.aliyun.core.annotation.NameInMap("DesiredState")
        private String desiredState;

        @com.aliyun.core.annotation.NameInMap("NodeId")
        private String nodeId;

        @com.aliyun.core.annotation.NameInMap("NodeName")
        private String nodeName;

        @com.aliyun.core.annotation.NameInMap("ZoneId")
        private String zoneId;

        private ComponentInstances(Builder builder) {
            this.applicationName = builder.applicationName;
            this.bizState = builder.bizState;
            this.commissionState = builder.commissionState;
            this.componentInstanceState = builder.componentInstanceState;
            this.componentName = builder.componentName;
            this.createTime = builder.createTime;
            this.desiredState = builder.desiredState;
            this.nodeId = builder.nodeId;
            this.nodeName = builder.nodeName;
            this.zoneId = builder.zoneId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ComponentInstances create() {
            return builder().build();
        }

        /**
         * @return applicationName
         */
        public String getApplicationName() {
            return this.applicationName;
        }

        /**
         * @return bizState
         */
        public String getBizState() {
            return this.bizState;
        }

        /**
         * @return commissionState
         */
        public String getCommissionState() {
            return this.commissionState;
        }

        /**
         * @return componentInstanceState
         */
        public String getComponentInstanceState() {
            return this.componentInstanceState;
        }

        /**
         * @return componentName
         */
        public String getComponentName() {
            return this.componentName;
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return desiredState
         */
        public String getDesiredState() {
            return this.desiredState;
        }

        /**
         * @return nodeId
         */
        public String getNodeId() {
            return this.nodeId;
        }

        /**
         * @return nodeName
         */
        public String getNodeName() {
            return this.nodeName;
        }

        /**
         * @return zoneId
         */
        public String getZoneId() {
            return this.zoneId;
        }

        public static final class Builder {
            private String applicationName; 
            private String bizState; 
            private String commissionState; 
            private String componentInstanceState; 
            private String componentName; 
            private Long createTime; 
            private String desiredState; 
            private String nodeId; 
            private String nodeName; 
            private String zoneId; 

            private Builder() {
            } 

            private Builder(ComponentInstances model) {
                this.applicationName = model.applicationName;
                this.bizState = model.bizState;
                this.commissionState = model.commissionState;
                this.componentInstanceState = model.componentInstanceState;
                this.componentName = model.componentName;
                this.createTime = model.createTime;
                this.desiredState = model.desiredState;
                this.nodeId = model.nodeId;
                this.nodeName = model.nodeName;
                this.zoneId = model.zoneId;
            } 

            /**
             * <p>The application name.</p>
             * 
             * <strong>example:</strong>
             * <p>KNOX</p>
             */
            public Builder applicationName(String applicationName) {
                this.applicationName = applicationName;
                return this;
            }

            /**
             * <p>The status of the component service. Valid values:</p>
             * <ul>
             * <li>active: the primary service.</li>
             * <li>standby: the standby service.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>active</p>
             */
            public Builder bizState(String bizState) {
                this.bizState = bizState;
                return this;
            }

            /**
             * <p>The status of the Commission. Valid values:</p>
             * <ul>
             * <li>COMMISSIONED</li>
             * <li>COMMISSIONING</li>
             * <li>DECOMMISSIONED</li>
             * <li>DECOMMISSIONINPROGRESS</li>
             * <li>DECOMMISSIONFAILED</li>
             * <li>INSERVICE</li>
             * <li>UNKNOWN</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>INSERVICE</p>
             */
            public Builder commissionState(String commissionState) {
                this.commissionState = commissionState;
                return this;
            }

            /**
             * <p>The status of the component. Valid values:</p>
             * <ul>
             * <li>WAITING</li>
             * <li>INSTALLING</li>
             * <li>INSTALLED</li>
             * <li>INSTALL_FAILED</li>
             * <li>STARTING</li>
             * <li>STARTED</li>
             * <li>START_FAILED</li>
             * <li>STOPPING</li>
             * <li>STOPPED</li>
             * <li>STOP_FAILED</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>STARTED</p>
             */
            public Builder componentInstanceState(String componentInstanceState) {
                this.componentInstanceState = componentInstanceState;
                return this;
            }

            /**
             * <p>The component name.</p>
             * 
             * <strong>example:</strong>
             * <p>KNOX</p>
             */
            public Builder componentName(String componentName) {
                this.componentName = componentName;
                return this;
            }

            /**
             * <p>The timestamp of the installation.</p>
             * 
             * <strong>example:</strong>
             * <p>1628248947000</p>
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>Valid values:</p>
             * <ul>
             * <li>WAITING</li>
             * <li>INSTALLING</li>
             * <li>INSTALLED</li>
             * <li>INSTALL_FAILED</li>
             * <li>STARTING</li>
             * <li>STARTED</li>
             * <li>START_FAILED</li>
             * <li>STOPPING</li>
             * <li>STOPPED</li>
             * <li>STOP_FAILED</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>STARTED</p>
             */
            public Builder desiredState(String desiredState) {
                this.desiredState = desiredState;
                return this;
            }

            /**
             * <p>The instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>i-bp17yy050pxo01m2****</p>
             */
            public Builder nodeId(String nodeId) {
                this.nodeId = nodeId;
                return this;
            }

            /**
             * <p>The instance name.</p>
             * 
             * <strong>example:</strong>
             * <p>emr-worker-1</p>
             */
            public Builder nodeName(String nodeName) {
                this.nodeName = nodeName;
                return this;
            }

            /**
             * <p>The zone ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou-i</p>
             */
            public Builder zoneId(String zoneId) {
                this.zoneId = zoneId;
                return this;
            }

            public ComponentInstances build() {
                return new ComponentInstances(this);
            } 

        } 

    }
}
