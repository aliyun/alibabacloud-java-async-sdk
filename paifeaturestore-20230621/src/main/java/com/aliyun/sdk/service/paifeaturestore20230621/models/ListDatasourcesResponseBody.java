// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paifeaturestore20230621.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListDatasourcesResponseBody} extends {@link TeaModel}
 *
 * <p>ListDatasourcesResponseBody</p>
 */
public class ListDatasourcesResponseBody extends TeaModel {
    @NameInMap("Datasources")
    private java.util.List < Datasources> datasources;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Long totalCount;

    private ListDatasourcesResponseBody(Builder builder) {
        this.datasources = builder.datasources;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDatasourcesResponseBody create() {
        return builder().build();
    }

    /**
     * @return datasources
     */
    public java.util.List < Datasources> getDatasources() {
        return this.datasources;
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
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List < Datasources> datasources; 
        private String requestId; 
        private Long totalCount; 

        /**
         * Datasources.
         */
        public Builder datasources(java.util.List < Datasources> datasources) {
            this.datasources = datasources;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListDatasourcesResponseBody build() {
            return new ListDatasourcesResponseBody(this);
        } 

    } 

    public static class Datasources extends TeaModel {
        @NameInMap("Config")
        private String config;

        @NameInMap("DatasourceId")
        private String datasourceId;

        @NameInMap("GmtCreateTime")
        private String gmtCreateTime;

        @NameInMap("GmtModifiedTime")
        private String gmtModifiedTime;

        @NameInMap("Name")
        private String name;

        @NameInMap("Type")
        private String type;

        @NameInMap("Uri")
        private String uri;

        @NameInMap("WorkspaceId")
        private String workspaceId;

        private Datasources(Builder builder) {
            this.config = builder.config;
            this.datasourceId = builder.datasourceId;
            this.gmtCreateTime = builder.gmtCreateTime;
            this.gmtModifiedTime = builder.gmtModifiedTime;
            this.name = builder.name;
            this.type = builder.type;
            this.uri = builder.uri;
            this.workspaceId = builder.workspaceId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Datasources create() {
            return builder().build();
        }

        /**
         * @return config
         */
        public String getConfig() {
            return this.config;
        }

        /**
         * @return datasourceId
         */
        public String getDatasourceId() {
            return this.datasourceId;
        }

        /**
         * @return gmtCreateTime
         */
        public String getGmtCreateTime() {
            return this.gmtCreateTime;
        }

        /**
         * @return gmtModifiedTime
         */
        public String getGmtModifiedTime() {
            return this.gmtModifiedTime;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return uri
         */
        public String getUri() {
            return this.uri;
        }

        /**
         * @return workspaceId
         */
        public String getWorkspaceId() {
            return this.workspaceId;
        }

        public static final class Builder {
            private String config; 
            private String datasourceId; 
            private String gmtCreateTime; 
            private String gmtModifiedTime; 
            private String name; 
            private String type; 
            private String uri; 
            private String workspaceId; 

            /**
             * Config.
             */
            public Builder config(String config) {
                this.config = config;
                return this;
            }

            /**
             * DatasourceId.
             */
            public Builder datasourceId(String datasourceId) {
                this.datasourceId = datasourceId;
                return this;
            }

            /**
             * GmtCreateTime.
             */
            public Builder gmtCreateTime(String gmtCreateTime) {
                this.gmtCreateTime = gmtCreateTime;
                return this;
            }

            /**
             * GmtModifiedTime.
             */
            public Builder gmtModifiedTime(String gmtModifiedTime) {
                this.gmtModifiedTime = gmtModifiedTime;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * Uri.
             */
            public Builder uri(String uri) {
                this.uri = uri;
                return this;
            }

            /**
             * WorkspaceId.
             */
            public Builder workspaceId(String workspaceId) {
                this.workspaceId = workspaceId;
                return this;
            }

            public Datasources build() {
                return new Datasources(this);
            } 

        } 

    }
}
