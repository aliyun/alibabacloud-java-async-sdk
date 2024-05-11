// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paiabtest20240119.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListLayersResponseBody} extends {@link TeaModel}
 *
 * <p>ListLayersResponseBody</p>
 */
public class ListLayersResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Layers")
    private java.util.List < Layers> layers;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private ListLayersResponseBody(Builder builder) {
        this.layers = builder.layers;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListLayersResponseBody create() {
        return builder().build();
    }

    /**
     * @return layers
     */
    public java.util.List < Layers> getLayers() {
        return this.layers;
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
        private java.util.List < Layers> layers; 
        private String requestId; 
        private Long totalCount; 

        /**
         * Layers.
         */
        public Builder layers(java.util.List < Layers> layers) {
            this.layers = layers;
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

        public ListLayersResponseBody build() {
            return new ListLayersResponseBody(this);
        } 

    } 

    public static class Layers extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("DomainId")
        private String domainId;

        @com.aliyun.core.annotation.NameInMap("DomainName")
        private String domainName;

        @com.aliyun.core.annotation.NameInMap("GmtCreateTime")
        private String gmtCreateTime;

        @com.aliyun.core.annotation.NameInMap("GmtModifyTime")
        private String gmtModifyTime;

        @com.aliyun.core.annotation.NameInMap("IsDefaultLayer")
        private Boolean isDefaultLayer;

        @com.aliyun.core.annotation.NameInMap("LayerId")
        private String layerId;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("ProjectId")
        private String projectId;

        @com.aliyun.core.annotation.NameInMap("ProjectName")
        private String projectName;

        @com.aliyun.core.annotation.NameInMap("WorkspaceId")
        private String workspaceId;

        private Layers(Builder builder) {
            this.description = builder.description;
            this.domainId = builder.domainId;
            this.domainName = builder.domainName;
            this.gmtCreateTime = builder.gmtCreateTime;
            this.gmtModifyTime = builder.gmtModifyTime;
            this.isDefaultLayer = builder.isDefaultLayer;
            this.layerId = builder.layerId;
            this.name = builder.name;
            this.projectId = builder.projectId;
            this.projectName = builder.projectName;
            this.workspaceId = builder.workspaceId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Layers create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return domainId
         */
        public String getDomainId() {
            return this.domainId;
        }

        /**
         * @return domainName
         */
        public String getDomainName() {
            return this.domainName;
        }

        /**
         * @return gmtCreateTime
         */
        public String getGmtCreateTime() {
            return this.gmtCreateTime;
        }

        /**
         * @return gmtModifyTime
         */
        public String getGmtModifyTime() {
            return this.gmtModifyTime;
        }

        /**
         * @return isDefaultLayer
         */
        public Boolean getIsDefaultLayer() {
            return this.isDefaultLayer;
        }

        /**
         * @return layerId
         */
        public String getLayerId() {
            return this.layerId;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return projectId
         */
        public String getProjectId() {
            return this.projectId;
        }

        /**
         * @return projectName
         */
        public String getProjectName() {
            return this.projectName;
        }

        /**
         * @return workspaceId
         */
        public String getWorkspaceId() {
            return this.workspaceId;
        }

        public static final class Builder {
            private String description; 
            private String domainId; 
            private String domainName; 
            private String gmtCreateTime; 
            private String gmtModifyTime; 
            private Boolean isDefaultLayer; 
            private String layerId; 
            private String name; 
            private String projectId; 
            private String projectName; 
            private String workspaceId; 

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * DomainId.
             */
            public Builder domainId(String domainId) {
                this.domainId = domainId;
                return this;
            }

            /**
             * DomainName.
             */
            public Builder domainName(String domainName) {
                this.domainName = domainName;
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
             * GmtModifyTime.
             */
            public Builder gmtModifyTime(String gmtModifyTime) {
                this.gmtModifyTime = gmtModifyTime;
                return this;
            }

            /**
             * IsDefaultLayer.
             */
            public Builder isDefaultLayer(Boolean isDefaultLayer) {
                this.isDefaultLayer = isDefaultLayer;
                return this;
            }

            /**
             * LayerId.
             */
            public Builder layerId(String layerId) {
                this.layerId = layerId;
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
             * ProjectId.
             */
            public Builder projectId(String projectId) {
                this.projectId = projectId;
                return this;
            }

            /**
             * ProjectName.
             */
            public Builder projectName(String projectName) {
                this.projectName = projectName;
                return this;
            }

            /**
             * WorkspaceId.
             */
            public Builder workspaceId(String workspaceId) {
                this.workspaceId = workspaceId;
                return this;
            }

            public Layers build() {
                return new Layers(this);
            } 

        } 

    }
}
