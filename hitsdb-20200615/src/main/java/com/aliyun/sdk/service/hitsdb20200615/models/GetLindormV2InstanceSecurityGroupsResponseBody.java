// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hitsdb20200615.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetLindormV2InstanceSecurityGroupsResponseBody} extends {@link TeaModel}
 *
 * <p>GetLindormV2InstanceSecurityGroupsResponseBody</p>
 */
public class GetLindormV2InstanceSecurityGroupsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AccessDeniedDetail")
    private String accessDeniedDetail;

    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SgList")
    private java.util.List<SgList> sgList;

    private GetLindormV2InstanceSecurityGroupsResponseBody(Builder builder) {
        this.accessDeniedDetail = builder.accessDeniedDetail;
        this.instanceId = builder.instanceId;
        this.requestId = builder.requestId;
        this.sgList = builder.sgList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetLindormV2InstanceSecurityGroupsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accessDeniedDetail
     */
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return sgList
     */
    public java.util.List<SgList> getSgList() {
        return this.sgList;
    }

    public static final class Builder {
        private String accessDeniedDetail; 
        private String instanceId; 
        private String requestId; 
        private java.util.List<SgList> sgList; 

        private Builder() {
        } 

        private Builder(GetLindormV2InstanceSecurityGroupsResponseBody model) {
            this.accessDeniedDetail = model.accessDeniedDetail;
            this.instanceId = model.instanceId;
            this.requestId = model.requestId;
            this.sgList = model.sgList;
        } 

        /**
         * AccessDeniedDetail.
         */
        public Builder accessDeniedDetail(String accessDeniedDetail) {
            this.accessDeniedDetail = accessDeniedDetail;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.instanceId = instanceId;
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
         * SgList.
         */
        public Builder sgList(java.util.List<SgList> sgList) {
            this.sgList = sgList;
            return this;
        }

        public GetLindormV2InstanceSecurityGroupsResponseBody build() {
            return new GetLindormV2InstanceSecurityGroupsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetLindormV2InstanceSecurityGroupsResponseBody} extends {@link TeaModel}
     *
     * <p>GetLindormV2InstanceSecurityGroupsResponseBody</p>
     */
    public static class SgList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("GmtModified")
        private String gmtModified;

        @com.aliyun.core.annotation.NameInMap("IpList")
        private String ipList;

        @com.aliyun.core.annotation.NameInMap("IsAvailable")
        private Boolean isAvailable;

        @com.aliyun.core.annotation.NameInMap("SecurityGroupId")
        private String securityGroupId;

        private SgList(Builder builder) {
            this.gmtModified = builder.gmtModified;
            this.ipList = builder.ipList;
            this.isAvailable = builder.isAvailable;
            this.securityGroupId = builder.securityGroupId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SgList create() {
            return builder().build();
        }

        /**
         * @return gmtModified
         */
        public String getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return ipList
         */
        public String getIpList() {
            return this.ipList;
        }

        /**
         * @return isAvailable
         */
        public Boolean getIsAvailable() {
            return this.isAvailable;
        }

        /**
         * @return securityGroupId
         */
        public String getSecurityGroupId() {
            return this.securityGroupId;
        }

        public static final class Builder {
            private String gmtModified; 
            private String ipList; 
            private Boolean isAvailable; 
            private String securityGroupId; 

            private Builder() {
            } 

            private Builder(SgList model) {
                this.gmtModified = model.gmtModified;
                this.ipList = model.ipList;
                this.isAvailable = model.isAvailable;
                this.securityGroupId = model.securityGroupId;
            } 

            /**
             * GmtModified.
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * IpList.
             */
            public Builder ipList(String ipList) {
                this.ipList = ipList;
                return this;
            }

            /**
             * IsAvailable.
             */
            public Builder isAvailable(Boolean isAvailable) {
                this.isAvailable = isAvailable;
                return this;
            }

            /**
             * SecurityGroupId.
             */
            public Builder securityGroupId(String securityGroupId) {
                this.securityGroupId = securityGroupId;
                return this;
            }

            public SgList build() {
                return new SgList(this);
            } 

        } 

    }
}
