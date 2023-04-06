// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eiam20211201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetRootOrganizationalUnitResponseBody} extends {@link TeaModel}
 *
 * <p>GetRootOrganizationalUnitResponseBody</p>
 */
public class GetRootOrganizationalUnitResponseBody extends TeaModel {
    @NameInMap("OrganizationalUnit")
    private OrganizationalUnit organizationalUnit;

    @NameInMap("RequestId")
    private String requestId;

    private GetRootOrganizationalUnitResponseBody(Builder builder) {
        this.organizationalUnit = builder.organizationalUnit;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetRootOrganizationalUnitResponseBody create() {
        return builder().build();
    }

    /**
     * @return organizationalUnit
     */
    public OrganizationalUnit getOrganizationalUnit() {
        return this.organizationalUnit;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private OrganizationalUnit organizationalUnit; 
        private String requestId; 

        /**
         * OrganizationalUnit.
         */
        public Builder organizationalUnit(OrganizationalUnit organizationalUnit) {
            this.organizationalUnit = organizationalUnit;
            return this;
        }

        /**
         * 请求ID。
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetRootOrganizationalUnitResponseBody build() {
            return new GetRootOrganizationalUnitResponseBody(this);
        } 

    } 

    public static class OrganizationalUnit extends TeaModel {
        @NameInMap("CreateTime")
        private Long createTime;

        @NameInMap("Description")
        private String description;

        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("OrganizationalUnitId")
        private String organizationalUnitId;

        @NameInMap("OrganizationalUnitName")
        private String organizationalUnitName;

        @NameInMap("UpdateTime")
        private Long updateTime;

        private OrganizationalUnit(Builder builder) {
            this.createTime = builder.createTime;
            this.description = builder.description;
            this.instanceId = builder.instanceId;
            this.organizationalUnitId = builder.organizationalUnitId;
            this.organizationalUnitName = builder.organizationalUnitName;
            this.updateTime = builder.updateTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OrganizationalUnit create() {
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
         * @return updateTime
         */
        public Long getUpdateTime() {
            return this.updateTime;
        }

        public static final class Builder {
            private Long createTime; 
            private String description; 
            private String instanceId; 
            private String organizationalUnitId; 
            private String organizationalUnitName; 
            private Long updateTime; 

            /**
             * 创建时间
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
             * 组织ID
             */
            public Builder organizationalUnitId(String organizationalUnitId) {
                this.organizationalUnitId = organizationalUnitId;
                return this;
            }

            /**
             * 组织名称
             */
            public Builder organizationalUnitName(String organizationalUnitName) {
                this.organizationalUnitName = organizationalUnitName;
                return this;
            }

            /**
             * 最近一次更新时间
             */
            public Builder updateTime(Long updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            public OrganizationalUnit build() {
                return new OrganizationalUnit(this);
            } 

        } 

    }
}
