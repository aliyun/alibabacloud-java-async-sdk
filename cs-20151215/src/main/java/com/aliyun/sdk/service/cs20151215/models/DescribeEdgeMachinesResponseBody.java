// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeEdgeMachinesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeEdgeMachinesResponseBody</p>
 */
public class DescribeEdgeMachinesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("edge_machines")
    private java.util.List < EdgeMachines> edgeMachines;

    @com.aliyun.core.annotation.NameInMap("page_info")
    private PageInfo pageInfo;

    private DescribeEdgeMachinesResponseBody(Builder builder) {
        this.edgeMachines = builder.edgeMachines;
        this.pageInfo = builder.pageInfo;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeEdgeMachinesResponseBody create() {
        return builder().build();
    }

    /**
     * @return edgeMachines
     */
    public java.util.List < EdgeMachines> getEdgeMachines() {
        return this.edgeMachines;
    }

    /**
     * @return pageInfo
     */
    public PageInfo getPageInfo() {
        return this.pageInfo;
    }

    public static final class Builder {
        private java.util.List < EdgeMachines> edgeMachines; 
        private PageInfo pageInfo; 

        /**
         * <p>The list of cloud-native boxes.</p>
         */
        public Builder edgeMachines(java.util.List < EdgeMachines> edgeMachines) {
            this.edgeMachines = edgeMachines;
            return this;
        }

        /**
         * <p>The paging information.</p>
         */
        public Builder pageInfo(PageInfo pageInfo) {
            this.pageInfo = pageInfo;
            return this;
        }

        public DescribeEdgeMachinesResponseBody build() {
            return new DescribeEdgeMachinesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeEdgeMachinesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeEdgeMachinesResponseBody</p>
     */
    public static class EdgeMachines extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("active_time")
        private String activeTime;

        @com.aliyun.core.annotation.NameInMap("created")
        private String created;

        @com.aliyun.core.annotation.NameInMap("edge_machine_id")
        private String edgeMachineId;

        @com.aliyun.core.annotation.NameInMap("hostname")
        private String hostname;

        @com.aliyun.core.annotation.NameInMap("life_state")
        private String lifeState;

        @com.aliyun.core.annotation.NameInMap("model")
        private String model;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("online_state")
        private String onlineState;

        @com.aliyun.core.annotation.NameInMap("sn")
        private String sn;

        @com.aliyun.core.annotation.NameInMap("updated")
        private String updated;

        private EdgeMachines(Builder builder) {
            this.activeTime = builder.activeTime;
            this.created = builder.created;
            this.edgeMachineId = builder.edgeMachineId;
            this.hostname = builder.hostname;
            this.lifeState = builder.lifeState;
            this.model = builder.model;
            this.name = builder.name;
            this.onlineState = builder.onlineState;
            this.sn = builder.sn;
            this.updated = builder.updated;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EdgeMachines create() {
            return builder().build();
        }

        /**
         * @return activeTime
         */
        public String getActiveTime() {
            return this.activeTime;
        }

        /**
         * @return created
         */
        public String getCreated() {
            return this.created;
        }

        /**
         * @return edgeMachineId
         */
        public String getEdgeMachineId() {
            return this.edgeMachineId;
        }

        /**
         * @return hostname
         */
        public String getHostname() {
            return this.hostname;
        }

        /**
         * @return lifeState
         */
        public String getLifeState() {
            return this.lifeState;
        }

        /**
         * @return model
         */
        public String getModel() {
            return this.model;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return onlineState
         */
        public String getOnlineState() {
            return this.onlineState;
        }

        /**
         * @return sn
         */
        public String getSn() {
            return this.sn;
        }

        /**
         * @return updated
         */
        public String getUpdated() {
            return this.updated;
        }

        public static final class Builder {
            private String activeTime; 
            private String created; 
            private String edgeMachineId; 
            private String hostname; 
            private String lifeState; 
            private String model; 
            private String name; 
            private String onlineState; 
            private String sn; 
            private String updated; 

            /**
             * <p>The time when the cloud-native box was activated.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-07-19T16:07:48+08:00</p>
             */
            public Builder activeTime(String activeTime) {
                this.activeTime = activeTime;
                return this;
            }

            /**
             * <p>The time when the cloud-native box was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-07-07T20:44:00+08:00</p>
             */
            public Builder created(String created) {
                this.created = created;
                return this;
            }

            /**
             * <p>The device ID.</p>
             * 
             * <strong>example:</strong>
             * <p>c61083909b13f4a95b8554bda9577****</p>
             */
            public Builder edgeMachineId(String edgeMachineId) {
                this.edgeMachineId = edgeMachineId;
                return this;
            }

            /**
             * <p>The <code>hostname</code> of the cloud-native box.</p>
             * 
             * <strong>example:</strong>
             * <p>ack-v-b010-ssdfw****</p>
             */
            public Builder hostname(String hostname) {
                this.hostname = hostname;
                return this;
            }

            /**
             * <p>The lifecycle of the cloud-native box.</p>
             * 
             * <strong>example:</strong>
             * <p>activated</p>
             */
            public Builder lifeState(String lifeState) {
                this.lifeState = lifeState;
                return this;
            }

            /**
             * <p>The model of the cloud-native box.</p>
             * 
             * <strong>example:</strong>
             * <p>ACK-V-B010</p>
             */
            public Builder model(String model) {
                this.model = model;
                return this;
            }

            /**
             * <p>The machine name.</p>
             * 
             * <strong>example:</strong>
             * <p>ack-v-b010-ssdfw****</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The status of the cloud-native box.</p>
             * 
             * <strong>example:</strong>
             * <p>online</p>
             */
            public Builder onlineState(String onlineState) {
                this.onlineState = onlineState;
                return this;
            }

            /**
             * <p>The serial number.</p>
             * 
             * <strong>example:</strong>
             * <p>ACK9GBL31SXX****</p>
             */
            public Builder sn(String sn) {
                this.sn = sn;
                return this;
            }

            /**
             * <p>The time when the cloud-native box was last updated.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-07-07T20:44:00+08:00</p>
             */
            public Builder updated(String updated) {
                this.updated = updated;
                return this;
            }

            public EdgeMachines build() {
                return new EdgeMachines(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeEdgeMachinesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeEdgeMachinesResponseBody</p>
     */
    public static class PageInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("page_number")
        private Integer pageNumber;

        @com.aliyun.core.annotation.NameInMap("page_size")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("total_count")
        private Integer totalCount;

        private PageInfo(Builder builder) {
            this.pageNumber = builder.pageNumber;
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
         * @return pageNumber
         */
        public Integer getPageNumber() {
            return this.pageNumber;
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
            private Integer pageNumber; 
            private Integer pageSize; 
            private Integer totalCount; 

            /**
             * <p>The page number.</p>
             * <p>Default value: 1.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder pageNumber(Integer pageNumber) {
                this.pageNumber = pageNumber;
                return this;
            }

            /**
             * <p>The number of entries per page.</p>
             * <p>Default value: 10.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * <p>The total number of pages returned.</p>
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
