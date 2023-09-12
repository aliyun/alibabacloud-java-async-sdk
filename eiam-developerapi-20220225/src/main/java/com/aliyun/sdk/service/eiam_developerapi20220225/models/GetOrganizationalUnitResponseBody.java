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
         * createTime.
         */
        public Builder createTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * description.
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * instanceId.
         */
        public Builder instanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }

        /**
         * organizationalUnitExternalId.
         */
        public Builder organizationalUnitExternalId(String organizationalUnitExternalId) {
            this.organizationalUnitExternalId = organizationalUnitExternalId;
            return this;
        }

        /**
         * organizationalUnitId.
         */
        public Builder organizationalUnitId(String organizationalUnitId) {
            this.organizationalUnitId = organizationalUnitId;
            return this;
        }

        /**
         * organizationalUnitName.
         */
        public Builder organizationalUnitName(String organizationalUnitName) {
            this.organizationalUnitName = organizationalUnitName;
            return this;
        }

        /**
         * organizationalUnitSourceId.
         */
        public Builder organizationalUnitSourceId(String organizationalUnitSourceId) {
            this.organizationalUnitSourceId = organizationalUnitSourceId;
            return this;
        }

        /**
         * organizationalUnitSourceType.
         */
        public Builder organizationalUnitSourceType(String organizationalUnitSourceType) {
            this.organizationalUnitSourceType = organizationalUnitSourceType;
            return this;
        }

        /**
         * parentId.
         */
        public Builder parentId(String parentId) {
            this.parentId = parentId;
            return this;
        }

        /**
         * updateTime.
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
