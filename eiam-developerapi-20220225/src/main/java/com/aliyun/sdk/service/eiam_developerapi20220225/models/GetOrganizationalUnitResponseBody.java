// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eiam_developerapi20220225.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.eiam.dev.models.*;

/**
 * {@link GetOrganizationalUnitResponseBody} extends {@link TeaModel}
 *
 * <p>GetOrganizationalUnitResponseBody</p>
 */
public class GetOrganizationalUnitResponseBody extends TeaModel {
    @NameInMap("createTime")
    private Long createTime;

    @NameInMap("description")
    private String description;

    @NameInMap("instanceId")
    private String instanceId;

    @NameInMap("organizationalUnitExternalId")
    private String organizationalUnitExternalId;

    @NameInMap("organizationalUnitId")
    private String organizationalUnitId;

    @NameInMap("organizationalUnitName")
    private String organizationalUnitName;

    @NameInMap("organizationalUnitSourceId")
    private String organizationalUnitSourceId;

    @NameInMap("organizationalUnitSourceType")
    private String organizationalUnitSourceType;

    @NameInMap("parentId")
    private String parentId;

    @NameInMap("updateTime")
    private Long updateTime;

    private GetOrganizationalUnitResponseBody(Builder builder) {
        this.createTime = builder.createTime;
        this.description = builder.description;
        this.instanceId = builder.instanceId;
        this.organizationalUnitExternalId = builder.organizationalUnitExternalId;
        this.organizationalUnitId = builder.organizationalUnitId;
        this.organizationalUnitName = builder.organizationalUnitName;
        this.organizationalUnitSourceId = builder.organizationalUnitSourceId;
        this.organizationalUnitSourceType = builder.organizationalUnitSourceType;
        this.parentId = builder.parentId;
        this.updateTime = builder.updateTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetOrganizationalUnitResponseBody create() {
        return builder().build();
    }

    /**
     * @return createTime
     */
    public Long getCreateTime() {
        return this.createTime;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return organizationalUnitExternalId
     */
    public String getOrganizationalUnitExternalId() {
        return this.organizationalUnitExternalId;
    }

    /**
     * @return organizationalUnitId
     */
    public String getOrganizationalUnitId() {
        return this.organizationalUnitId;
    }

    /**
     * @return organizationalUnitName
     */
    public String getOrganizationalUnitName() {
        return this.organizationalUnitName;
    }

    /**
     * @return organizationalUnitSourceId
     */
    public String getOrganizationalUnitSourceId() {
        return this.organizationalUnitSourceId;
    }

    /**
     * @return organizationalUnitSourceType
     */
    public String getOrganizationalUnitSourceType() {
        return this.organizationalUnitSourceType;
    }

    /**
     * @return parentId
     */
    public String getParentId() {
        return this.parentId;
    }

    /**
     * @return updateTime
     */
    public Long getUpdateTime() {
        return this.updateTime;
    }

    public static final class Builder {
        private Long createTime; 
        private String description; 
        private String instanceId; 
        private String organizationalUnitExternalId; 
        private String organizationalUnitId; 
        private String organizationalUnitName; 
        private String organizationalUnitSourceId; 
        private String organizationalUnitSourceType; 
        private String parentId; 
        private Long updateTime; 

        /**
         * 创建时间，毫秒
         */
        public Builder createTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * 描述
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * 实例ID
         */
        public Builder instanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }

        /**
         * 外部ID
         */
        public Builder organizationalUnitExternalId(String organizationalUnitExternalId) {
            this.organizationalUnitExternalId = organizationalUnitExternalId;
            return this;
        }

        /**
         * 机构ID
         */
        public Builder organizationalUnitId(String organizationalUnitId) {
            this.organizationalUnitId = organizationalUnitId;
            return this;
        }

        /**
         * 机构名称
         */
        public Builder organizationalUnitName(String organizationalUnitName) {
            this.organizationalUnitName = organizationalUnitName;
            return this;
        }

        /**
         * 来源ID
         */
        public Builder organizationalUnitSourceId(String organizationalUnitSourceId) {
            this.organizationalUnitSourceId = organizationalUnitSourceId;
            return this;
        }

        /**
         * 来源类型
         */
        public Builder organizationalUnitSourceType(String organizationalUnitSourceType) {
            this.organizationalUnitSourceType = organizationalUnitSourceType;
            return this;
        }

        /**
         * 父机构ID
         */
        public Builder parentId(String parentId) {
            this.parentId = parentId;
            return this;
        }

        /**
         * 最近一次更新时间，毫秒
         */
        public Builder updateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }

        public GetOrganizationalUnitResponseBody build() {
            return new GetOrganizationalUnitResponseBody(this);
        } 

    } 

}
