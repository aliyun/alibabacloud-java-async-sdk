// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataphin_public20230630.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListNodeDownStreamRequest} extends {@link RequestModel}
 *
 * <p>ListNodeDownStreamRequest</p>
 */
public class ListNodeDownStreamRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Env")
    private String env;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ListQuery")
    @com.aliyun.core.annotation.Validation(required = true)
    private ListQuery listQuery;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OpTenantId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long opTenantId;

    private ListNodeDownStreamRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.env = builder.env;
        this.listQuery = builder.listQuery;
        this.opTenantId = builder.opTenantId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListNodeDownStreamRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return env
     */
    public String getEnv() {
        return this.env;
    }

    /**
     * @return listQuery
     */
    public ListQuery getListQuery() {
        return this.listQuery;
    }

    /**
     * @return opTenantId
     */
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public static final class Builder extends Request.Builder<ListNodeDownStreamRequest, Builder> {
        private String regionId; 
        private String env; 
        private ListQuery listQuery; 
        private Long opTenantId; 

        private Builder() {
            super();
        } 

        private Builder(ListNodeDownStreamRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.env = request.env;
            this.listQuery = request.listQuery;
            this.opTenantId = request.opTenantId;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * Env.
         */
        public Builder env(String env) {
            this.putQueryParameter("Env", env);
            this.env = env;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder listQuery(ListQuery listQuery) {
            String listQueryShrink = shrink(listQuery, "ListQuery", "json");
            this.putBodyParameter("ListQuery", listQueryShrink);
            this.listQuery = listQuery;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>30001011</p>
         */
        public Builder opTenantId(Long opTenantId) {
            this.putQueryParameter("OpTenantId", opTenantId);
            this.opTenantId = opTenantId;
            return this;
        }

        @Override
        public ListNodeDownStreamRequest build() {
            return new ListNodeDownStreamRequest(this);
        } 

    } 

    /**
     * 
     * {@link ListNodeDownStreamRequest} extends {@link TeaModel}
     *
     * <p>ListNodeDownStreamRequest</p>
     */
    public static class FilterList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Exclude")
        private Boolean exclude;

        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("ValueList")
        private java.util.List < String > valueList;

        private FilterList(Builder builder) {
            this.exclude = builder.exclude;
            this.key = builder.key;
            this.valueList = builder.valueList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FilterList create() {
            return builder().build();
        }

        /**
         * @return exclude
         */
        public Boolean getExclude() {
            return this.exclude;
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return valueList
         */
        public java.util.List < String > getValueList() {
            return this.valueList;
        }

        public static final class Builder {
            private Boolean exclude; 
            private String key; 
            private java.util.List < String > valueList; 

            /**
             * Exclude.
             */
            public Builder exclude(Boolean exclude) {
                this.exclude = exclude;
                return this;
            }

            /**
             * Key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * ValueList.
             */
            public Builder valueList(java.util.List < String > valueList) {
                this.valueList = valueList;
                return this;
            }

            public FilterList build() {
                return new FilterList(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListNodeDownStreamRequest} extends {@link TeaModel}
     *
     * <p>ListNodeDownStreamRequest</p>
     */
    public static class NodeIdList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FieldIdList")
        private java.util.List < String > fieldIdList;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        private NodeIdList(Builder builder) {
            this.fieldIdList = builder.fieldIdList;
            this.id = builder.id;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NodeIdList create() {
            return builder().build();
        }

        /**
         * @return fieldIdList
         */
        public java.util.List < String > getFieldIdList() {
            return this.fieldIdList;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        public static final class Builder {
            private java.util.List < String > fieldIdList; 
            private String id; 

            /**
             * FieldIdList.
             */
            public Builder fieldIdList(java.util.List < String > fieldIdList) {
                this.fieldIdList = fieldIdList;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            public NodeIdList build() {
                return new NodeIdList(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListNodeDownStreamRequest} extends {@link TeaModel}
     *
     * <p>ListNodeDownStreamRequest</p>
     */
    public static class ListQuery extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DownStreamDepth")
        private Integer downStreamDepth;

        @com.aliyun.core.annotation.NameInMap("FilterList")
        private java.util.List < FilterList> filterList;

        @com.aliyun.core.annotation.NameInMap("NodeIdList")
        @com.aliyun.core.annotation.Validation(required = true)
        private java.util.List < NodeIdList> nodeIdList;

        @com.aliyun.core.annotation.NameInMap("ProjectId")
        private Long projectId;

        private ListQuery(Builder builder) {
            this.downStreamDepth = builder.downStreamDepth;
            this.filterList = builder.filterList;
            this.nodeIdList = builder.nodeIdList;
            this.projectId = builder.projectId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ListQuery create() {
            return builder().build();
        }

        /**
         * @return downStreamDepth
         */
        public Integer getDownStreamDepth() {
            return this.downStreamDepth;
        }

        /**
         * @return filterList
         */
        public java.util.List < FilterList> getFilterList() {
            return this.filterList;
        }

        /**
         * @return nodeIdList
         */
        public java.util.List < NodeIdList> getNodeIdList() {
            return this.nodeIdList;
        }

        /**
         * @return projectId
         */
        public Long getProjectId() {
            return this.projectId;
        }

        public static final class Builder {
            private Integer downStreamDepth; 
            private java.util.List < FilterList> filterList; 
            private java.util.List < NodeIdList> nodeIdList; 
            private Long projectId; 

            /**
             * DownStreamDepth.
             */
            public Builder downStreamDepth(Integer downStreamDepth) {
                this.downStreamDepth = downStreamDepth;
                return this;
            }

            /**
             * FilterList.
             */
            public Builder filterList(java.util.List < FilterList> filterList) {
                this.filterList = filterList;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             */
            public Builder nodeIdList(java.util.List < NodeIdList> nodeIdList) {
                this.nodeIdList = nodeIdList;
                return this;
            }

            /**
             * ProjectId.
             */
            public Builder projectId(Long projectId) {
                this.projectId = projectId;
                return this;
            }

            public ListQuery build() {
                return new ListQuery(this);
            } 

        } 

    }
}
