// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeEdgeMachinesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeEdgeMachinesResponseBody</p>
 */
public class DescribeEdgeMachinesResponseBody extends TeaModel {
    @NameInMap("edge_machines")
    private java.util.List < EdgeMachines> edgeMachines;

    @NameInMap("page_info")
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
         * Cloud-native all-in-one machine List
         */
        public Builder edgeMachines(java.util.List < EdgeMachines> edgeMachines) {
            this.edgeMachines = edgeMachines;
            return this;
        }

        /**
         * Pagination information
         */
        public Builder pageInfo(PageInfo pageInfo) {
            this.pageInfo = pageInfo;
            return this;
        }

        public DescribeEdgeMachinesResponseBody build() {
            return new DescribeEdgeMachinesResponseBody(this);
        } 

    } 

    public static class EdgeMachines extends TeaModel {
        @NameInMap("edge_machine_id")
        private String edgeMachineId;

        @NameInMap("created")
        private String created;

        @NameInMap("updated")
        private String updated;

        @NameInMap("name")
        private String name;

        @NameInMap("hostname")
        private String hostname;

        @NameInMap("sn")
        private String sn;

        @NameInMap("model")
        private String model;

        @NameInMap("life_state")
        private String lifeState;

        @NameInMap("online_state")
        private String onlineState;

        @NameInMap("active_time")
        private String activeTime;

        private EdgeMachines(Builder builder) {
            this.edgeMachineId = builder.edgeMachineId;
            this.created = builder.created;
            this.updated = builder.updated;
            this.name = builder.name;
            this.hostname = builder.hostname;
            this.sn = builder.sn;
            this.model = builder.model;
            this.lifeState = builder.lifeState;
            this.onlineState = builder.onlineState;
            this.activeTime = builder.activeTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EdgeMachines create() {
            return builder().build();
        }

        /**
         * @return edgeMachineId
         */
        public String getEdgeMachineId() {
            return this.edgeMachineId;
        }

        /**
         * @return created
         */
        public String getCreated() {
            return this.created;
        }

        /**
         * @return updated
         */
        public String getUpdated() {
            return this.updated;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return hostname
         */
        public String getHostname() {
            return this.hostname;
        }

        /**
         * @return sn
         */
        public String getSn() {
            return this.sn;
        }

        /**
         * @return model
         */
        public String getModel() {
            return this.model;
        }

        /**
         * @return lifeState
         */
        public String getLifeState() {
            return this.lifeState;
        }

        /**
         * @return onlineState
         */
        public String getOnlineState() {
            return this.onlineState;
        }

        /**
         * @return activeTime
         */
        public String getActiveTime() {
            return this.activeTime;
        }

        public static final class Builder {
            private String edgeMachineId; 
            private String created; 
            private String updated; 
            private String name; 
            private String hostname; 
            private String sn; 
            private String model; 
            private String lifeState; 
            private String onlineState; 
            private String activeTime; 

            /**
             * Device ID
             */
            public Builder edgeMachineId(String edgeMachineId) {
                this.edgeMachineId = edgeMachineId;
                return this;
            }

            /**
             * Created
             */
            public Builder created(String created) {
                this.created = created;
                return this;
            }

            /**
             * Update Time
             */
            public Builder updated(String updated) {
                this.updated = updated;
                return this;
            }

            /**
             * Machine name
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Cloud-native all-in-one machine "hostname"
             */
            public Builder hostname(String hostname) {
                this.hostname = hostname;
                return this;
            }

            /**
             * SN serial number
             */
            public Builder sn(String sn) {
                this.sn = sn;
                return this;
            }

            /**
             * Cloud Native all-in-one model
             */
            public Builder model(String model) {
                this.model = model;
                return this;
            }

            /**
             * Lifecycle
             */
            public Builder lifeState(String lifeState) {
                this.lifeState = lifeState;
                return this;
            }

            /**
             * Online Status
             */
            public Builder onlineState(String onlineState) {
                this.onlineState = onlineState;
                return this;
            }

            /**
             * Activation time
             */
            public Builder activeTime(String activeTime) {
                this.activeTime = activeTime;
                return this;
            }

            public EdgeMachines build() {
                return new EdgeMachines(this);
            } 

        } 

    }
    public static class PageInfo extends TeaModel {
        @NameInMap("page_number")
        private Integer pageNumber;

        @NameInMap("page_size")
        private Integer pageSize;

        @NameInMap("total_count")
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
             * The page number.
             * <p>
             * 
             * Default value: 1.
             */
            public Builder pageNumber(Integer pageNumber) {
                this.pageNumber = pageNumber;
                return this;
            }

            /**
             * The number of records displayed on each page.
             * <p>
             * 
             * Default value: 10.
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * Total
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
