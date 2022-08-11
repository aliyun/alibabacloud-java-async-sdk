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
         * Id of the request
         */
        public Builder edgeMachines(java.util.List < EdgeMachines> edgeMachines) {
            this.edgeMachines = edgeMachines;
            return this;
        }

        /**
         * page info
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
        @NameInMap("active_time")
        private String activeTime;

        @NameInMap("created")
        private String created;

        @NameInMap("edge_machine_id")
        private String edgeMachineId;

        @NameInMap("hostname")
        private String hostname;

        @NameInMap("life_state")
        private String lifeState;

        @NameInMap("model")
        private String model;

        @NameInMap("name")
        private String name;

        @NameInMap("online_state")
        private String onlineState;

        @NameInMap("sn")
        private String sn;

        @NameInMap("updated")
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
             * actvite time
             */
            public Builder activeTime(String activeTime) {
                this.activeTime = activeTime;
                return this;
            }

            /**
             * created time
             */
            public Builder created(String created) {
                this.created = created;
                return this;
            }

            /**
             * edge machine id
             */
            public Builder edgeMachineId(String edgeMachineId) {
                this.edgeMachineId = edgeMachineId;
                return this;
            }

            /**
             * hostname
             */
            public Builder hostname(String hostname) {
                this.hostname = hostname;
                return this;
            }

            /**
             * life state
             */
            public Builder lifeState(String lifeState) {
                this.lifeState = lifeState;
                return this;
            }

            /**
             * model
             */
            public Builder model(String model) {
                this.model = model;
                return this;
            }

            /**
             * name of edgemachine
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * online state
             */
            public Builder onlineState(String onlineState) {
                this.onlineState = onlineState;
                return this;
            }

            /**
             * sn
             */
            public Builder sn(String sn) {
                this.sn = sn;
                return this;
            }

            /**
             * update time
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
             * page number
             */
            public Builder pageNumber(Integer pageNumber) {
                this.pageNumber = pageNumber;
                return this;
            }

            /**
             * page size
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * total count
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
