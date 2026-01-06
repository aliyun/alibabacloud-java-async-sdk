// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nas20170626.models;

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
 * {@link GetProtocolMountTargetResponseBody} extends {@link TeaModel}
 *
 * <p>GetProtocolMountTargetResponseBody</p>
 */
public class GetProtocolMountTargetResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("ProtocolMountTarget")
    private ProtocolMountTarget protocolMountTarget;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetProtocolMountTargetResponseBody(Builder builder) {
        this.nextToken = builder.nextToken;
        this.protocolMountTarget = builder.protocolMountTarget;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetProtocolMountTargetResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return protocolMountTarget
     */
    public ProtocolMountTarget getProtocolMountTarget() {
        return this.protocolMountTarget;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String nextToken; 
        private ProtocolMountTarget protocolMountTarget; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetProtocolMountTargetResponseBody model) {
            this.nextToken = model.nextToken;
            this.protocolMountTarget = model.protocolMountTarget;
            this.requestId = model.requestId;
        } 

        /**
         * NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * ProtocolMountTarget.
         */
        public Builder protocolMountTarget(ProtocolMountTarget protocolMountTarget) {
            this.protocolMountTarget = protocolMountTarget;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetProtocolMountTargetResponseBody build() {
            return new GetProtocolMountTargetResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetProtocolMountTargetResponseBody} extends {@link TeaModel}
     *
     * <p>GetProtocolMountTargetResponseBody</p>
     */
    public static class ProtocolMountTarget extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccessGroupName")
        private String accessGroupName;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("ExportId")
        private String exportId;

        @com.aliyun.core.annotation.NameInMap("FsetId")
        private String fsetId;

        @com.aliyun.core.annotation.NameInMap("Path")
        private String path;

        @com.aliyun.core.annotation.NameInMap("ProtocolMountTargetDomain")
        private String protocolMountTargetDomain;

        @com.aliyun.core.annotation.NameInMap("ProtocolType")
        private String protocolType;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("VSwitchId")
        private String vSwitchId;

        @com.aliyun.core.annotation.NameInMap("VSwitchIds")
        private java.util.List<String> vSwitchIds;

        @com.aliyun.core.annotation.NameInMap("VpcId")
        private String vpcId;

        private ProtocolMountTarget(Builder builder) {
            this.accessGroupName = builder.accessGroupName;
            this.createTime = builder.createTime;
            this.description = builder.description;
            this.exportId = builder.exportId;
            this.fsetId = builder.fsetId;
            this.path = builder.path;
            this.protocolMountTargetDomain = builder.protocolMountTargetDomain;
            this.protocolType = builder.protocolType;
            this.status = builder.status;
            this.vSwitchId = builder.vSwitchId;
            this.vSwitchIds = builder.vSwitchIds;
            this.vpcId = builder.vpcId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ProtocolMountTarget create() {
            return builder().build();
        }

        /**
         * @return accessGroupName
         */
        public String getAccessGroupName() {
            return this.accessGroupName;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return exportId
         */
        public String getExportId() {
            return this.exportId;
        }

        /**
         * @return fsetId
         */
        public String getFsetId() {
            return this.fsetId;
        }

        /**
         * @return path
         */
        public String getPath() {
            return this.path;
        }

        /**
         * @return protocolMountTargetDomain
         */
        public String getProtocolMountTargetDomain() {
            return this.protocolMountTargetDomain;
        }

        /**
         * @return protocolType
         */
        public String getProtocolType() {
            return this.protocolType;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return vSwitchId
         */
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        /**
         * @return vSwitchIds
         */
        public java.util.List<String> getVSwitchIds() {
            return this.vSwitchIds;
        }

        /**
         * @return vpcId
         */
        public String getVpcId() {
            return this.vpcId;
        }

        public static final class Builder {
            private String accessGroupName; 
            private String createTime; 
            private String description; 
            private String exportId; 
            private String fsetId; 
            private String path; 
            private String protocolMountTargetDomain; 
            private String protocolType; 
            private String status; 
            private String vSwitchId; 
            private java.util.List<String> vSwitchIds; 
            private String vpcId; 

            private Builder() {
            } 

            private Builder(ProtocolMountTarget model) {
                this.accessGroupName = model.accessGroupName;
                this.createTime = model.createTime;
                this.description = model.description;
                this.exportId = model.exportId;
                this.fsetId = model.fsetId;
                this.path = model.path;
                this.protocolMountTargetDomain = model.protocolMountTargetDomain;
                this.protocolType = model.protocolType;
                this.status = model.status;
                this.vSwitchId = model.vSwitchId;
                this.vSwitchIds = model.vSwitchIds;
                this.vpcId = model.vpcId;
            } 

            /**
             * AccessGroupName.
             */
            public Builder accessGroupName(String accessGroupName) {
                this.accessGroupName = accessGroupName;
                return this;
            }

            /**
             * CreateTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * ExportId.
             */
            public Builder exportId(String exportId) {
                this.exportId = exportId;
                return this;
            }

            /**
             * <p>Fileset ID。</p>
             * 
             * <strong>example:</strong>
             * <p>fset-299b4ca04de8****</p>
             */
            public Builder fsetId(String fsetId) {
                this.fsetId = fsetId;
                return this;
            }

            /**
             * Path.
             */
            public Builder path(String path) {
                this.path = path;
                return this;
            }

            /**
             * ProtocolMountTargetDomain.
             */
            public Builder protocolMountTargetDomain(String protocolMountTargetDomain) {
                this.protocolMountTargetDomain = protocolMountTargetDomain;
                return this;
            }

            /**
             * ProtocolType.
             */
            public Builder protocolType(String protocolType) {
                this.protocolType = protocolType;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * VSwitchId.
             */
            public Builder vSwitchId(String vSwitchId) {
                this.vSwitchId = vSwitchId;
                return this;
            }

            /**
             * VSwitchIds.
             */
            public Builder vSwitchIds(java.util.List<String> vSwitchIds) {
                this.vSwitchIds = vSwitchIds;
                return this;
            }

            /**
             * VpcId.
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            public ProtocolMountTarget build() {
                return new ProtocolMountTarget(this);
            } 

        } 

    }
}
