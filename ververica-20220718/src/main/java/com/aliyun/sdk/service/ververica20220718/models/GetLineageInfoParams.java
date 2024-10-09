// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ververica20220718.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetLineageInfoParams} extends {@link TeaModel}
 *
 * <p>GetLineageInfoParams</p>
 */
public class GetLineageInfoParams extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("depth")
    private Long depth;

    @com.aliyun.core.annotation.NameInMap("direction")
    private String direction;

    @com.aliyun.core.annotation.NameInMap("id")
    private String id;

    @com.aliyun.core.annotation.NameInMap("idType")
    private String idType;

    @com.aliyun.core.annotation.NameInMap("isColumnLevel")
    private Boolean isColumnLevel;

    @com.aliyun.core.annotation.NameInMap("isTemporary")
    private Boolean isTemporary;

    @com.aliyun.core.annotation.NameInMap("namespace")
    private String namespace;

    @com.aliyun.core.annotation.NameInMap("workspace")
    private String workspace;

    private GetLineageInfoParams(Builder builder) {
        this.depth = builder.depth;
        this.direction = builder.direction;
        this.id = builder.id;
        this.idType = builder.idType;
        this.isColumnLevel = builder.isColumnLevel;
        this.isTemporary = builder.isTemporary;
        this.namespace = builder.namespace;
        this.workspace = builder.workspace;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetLineageInfoParams create() {
        return builder().build();
    }

    /**
     * @return depth
     */
    public Long getDepth() {
        return this.depth;
    }

    /**
     * @return direction
     */
    public String getDirection() {
        return this.direction;
    }

    /**
     * @return id
     */
    public String getId() {
        return this.id;
    }

    /**
     * @return idType
     */
    public String getIdType() {
        return this.idType;
    }

    /**
     * @return isColumnLevel
     */
    public Boolean getIsColumnLevel() {
        return this.isColumnLevel;
    }

    /**
     * @return isTemporary
     */
    public Boolean getIsTemporary() {
        return this.isTemporary;
    }

    /**
     * @return namespace
     */
    public String getNamespace() {
        return this.namespace;
    }

    /**
     * @return workspace
     */
    public String getWorkspace() {
        return this.workspace;
    }

    public static final class Builder {
        private Long depth; 
        private String direction; 
        private String id; 
        private String idType; 
        private Boolean isColumnLevel; 
        private Boolean isTemporary; 
        private String namespace; 
        private String workspace; 

        /**
         * depth.
         */
        public Builder depth(Long depth) {
            this.depth = depth;
            return this;
        }

        /**
         * direction.
         */
        public Builder direction(String direction) {
            this.direction = direction;
            return this;
        }

        /**
         * id.
         */
        public Builder id(String id) {
            this.id = id;
            return this;
        }

        /**
         * idType.
         */
        public Builder idType(String idType) {
            this.idType = idType;
            return this;
        }

        /**
         * isColumnLevel.
         */
        public Builder isColumnLevel(Boolean isColumnLevel) {
            this.isColumnLevel = isColumnLevel;
            return this;
        }

        /**
         * isTemporary.
         */
        public Builder isTemporary(Boolean isTemporary) {
            this.isTemporary = isTemporary;
            return this;
        }

        /**
         * namespace.
         */
        public Builder namespace(String namespace) {
            this.namespace = namespace;
            return this;
        }

        /**
         * workspace.
         */
        public Builder workspace(String workspace) {
            this.workspace = workspace;
            return this;
        }

        public GetLineageInfoParams build() {
            return new GetLineageInfoParams(this);
        } 

    } 

}
