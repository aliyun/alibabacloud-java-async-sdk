// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.smartag20180313.models;

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
 * {@link DescribeACLAttributeResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeACLAttributeResponseBody</p>
 */
public class DescribeACLAttributeResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Acrs")
    private Acrs acrs;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeACLAttributeResponseBody(Builder builder) {
        this.acrs = builder.acrs;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeACLAttributeResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return acrs
     */
    public Acrs getAcrs() {
        return this.acrs;
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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private Acrs acrs; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(DescribeACLAttributeResponseBody model) {
            this.acrs = model.acrs;
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * Acrs.
         */
        public Builder acrs(Acrs acrs) {
            this.acrs = acrs;
            return this;
        }

        /**
         * <p>The page number for a paging query.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of access control rule entries returned on each page in a paging query.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>8F62CE77-FBA2-4F8D-AED9-0A02814EDA69</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of access control rule entries in the access control instance.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeACLAttributeResponseBody build() {
            return new DescribeACLAttributeResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeACLAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeACLAttributeResponseBody</p>
     */
    public static class DpiGroupIds extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DpiGroupId")
        private java.util.List<String> dpiGroupId;

        private DpiGroupIds(Builder builder) {
            this.dpiGroupId = builder.dpiGroupId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DpiGroupIds create() {
            return builder().build();
        }

        /**
         * @return dpiGroupId
         */
        public java.util.List<String> getDpiGroupId() {
            return this.dpiGroupId;
        }

        public static final class Builder {
            private java.util.List<String> dpiGroupId; 

            private Builder() {
            } 

            private Builder(DpiGroupIds model) {
                this.dpiGroupId = model.dpiGroupId;
            } 

            /**
             * DpiGroupId.
             */
            public Builder dpiGroupId(java.util.List<String> dpiGroupId) {
                this.dpiGroupId = dpiGroupId;
                return this;
            }

            public DpiGroupIds build() {
                return new DpiGroupIds(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeACLAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeACLAttributeResponseBody</p>
     */
    public static class DpiSignatureIds extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DpiSignatureId")
        private java.util.List<String> dpiSignatureId;

        private DpiSignatureIds(Builder builder) {
            this.dpiSignatureId = builder.dpiSignatureId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DpiSignatureIds create() {
            return builder().build();
        }

        /**
         * @return dpiSignatureId
         */
        public java.util.List<String> getDpiSignatureId() {
            return this.dpiSignatureId;
        }

        public static final class Builder {
            private java.util.List<String> dpiSignatureId; 

            private Builder() {
            } 

            private Builder(DpiSignatureIds model) {
                this.dpiSignatureId = model.dpiSignatureId;
            } 

            /**
             * DpiSignatureId.
             */
            public Builder dpiSignatureId(java.util.List<String> dpiSignatureId) {
                this.dpiSignatureId = dpiSignatureId;
                return this;
            }

            public DpiSignatureIds build() {
                return new DpiSignatureIds(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeACLAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeACLAttributeResponseBody</p>
     */
    public static class Acr extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AclId")
        private String aclId;

        @com.aliyun.core.annotation.NameInMap("AclType")
        private String aclType;

        @com.aliyun.core.annotation.NameInMap("AcrId")
        private String acrId;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("DestCidr")
        private String destCidr;

        @com.aliyun.core.annotation.NameInMap("DestPortRange")
        private String destPortRange;

        @com.aliyun.core.annotation.NameInMap("Direction")
        private String direction;

        @com.aliyun.core.annotation.NameInMap("DpiGroupIds")
        private DpiGroupIds dpiGroupIds;

        @com.aliyun.core.annotation.NameInMap("DpiSignatureIds")
        private DpiSignatureIds dpiSignatureIds;

        @com.aliyun.core.annotation.NameInMap("GmtCreate")
        private Long gmtCreate;

        @com.aliyun.core.annotation.NameInMap("IpProtocol")
        private String ipProtocol;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Policy")
        private String policy;

        @com.aliyun.core.annotation.NameInMap("Priority")
        private Integer priority;

        @com.aliyun.core.annotation.NameInMap("SourceCidr")
        private String sourceCidr;

        @com.aliyun.core.annotation.NameInMap("SourcePortRange")
        private String sourcePortRange;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private Acr(Builder builder) {
            this.aclId = builder.aclId;
            this.aclType = builder.aclType;
            this.acrId = builder.acrId;
            this.description = builder.description;
            this.destCidr = builder.destCidr;
            this.destPortRange = builder.destPortRange;
            this.direction = builder.direction;
            this.dpiGroupIds = builder.dpiGroupIds;
            this.dpiSignatureIds = builder.dpiSignatureIds;
            this.gmtCreate = builder.gmtCreate;
            this.ipProtocol = builder.ipProtocol;
            this.name = builder.name;
            this.policy = builder.policy;
            this.priority = builder.priority;
            this.sourceCidr = builder.sourceCidr;
            this.sourcePortRange = builder.sourcePortRange;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Acr create() {
            return builder().build();
        }

        /**
         * @return aclId
         */
        public String getAclId() {
            return this.aclId;
        }

        /**
         * @return aclType
         */
        public String getAclType() {
            return this.aclType;
        }

        /**
         * @return acrId
         */
        public String getAcrId() {
            return this.acrId;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return destCidr
         */
        public String getDestCidr() {
            return this.destCidr;
        }

        /**
         * @return destPortRange
         */
        public String getDestPortRange() {
            return this.destPortRange;
        }

        /**
         * @return direction
         */
        public String getDirection() {
            return this.direction;
        }

        /**
         * @return dpiGroupIds
         */
        public DpiGroupIds getDpiGroupIds() {
            return this.dpiGroupIds;
        }

        /**
         * @return dpiSignatureIds
         */
        public DpiSignatureIds getDpiSignatureIds() {
            return this.dpiSignatureIds;
        }

        /**
         * @return gmtCreate
         */
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return ipProtocol
         */
        public String getIpProtocol() {
            return this.ipProtocol;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return policy
         */
        public String getPolicy() {
            return this.policy;
        }

        /**
         * @return priority
         */
        public Integer getPriority() {
            return this.priority;
        }

        /**
         * @return sourceCidr
         */
        public String getSourceCidr() {
            return this.sourceCidr;
        }

        /**
         * @return sourcePortRange
         */
        public String getSourcePortRange() {
            return this.sourcePortRange;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String aclId; 
            private String aclType; 
            private String acrId; 
            private String description; 
            private String destCidr; 
            private String destPortRange; 
            private String direction; 
            private DpiGroupIds dpiGroupIds; 
            private DpiSignatureIds dpiSignatureIds; 
            private Long gmtCreate; 
            private String ipProtocol; 
            private String name; 
            private String policy; 
            private Integer priority; 
            private String sourceCidr; 
            private String sourcePortRange; 
            private String type; 

            private Builder() {
            } 

            private Builder(Acr model) {
                this.aclId = model.aclId;
                this.aclType = model.aclType;
                this.acrId = model.acrId;
                this.description = model.description;
                this.destCidr = model.destCidr;
                this.destPortRange = model.destPortRange;
                this.direction = model.direction;
                this.dpiGroupIds = model.dpiGroupIds;
                this.dpiSignatureIds = model.dpiSignatureIds;
                this.gmtCreate = model.gmtCreate;
                this.ipProtocol = model.ipProtocol;
                this.name = model.name;
                this.policy = model.policy;
                this.priority = model.priority;
                this.sourceCidr = model.sourceCidr;
                this.sourcePortRange = model.sourcePortRange;
                this.type = model.type;
            } 

            /**
             * AclId.
             */
            public Builder aclId(String aclId) {
                this.aclId = aclId;
                return this;
            }

            /**
             * AclType.
             */
            public Builder aclType(String aclType) {
                this.aclType = aclType;
                return this;
            }

            /**
             * AcrId.
             */
            public Builder acrId(String acrId) {
                this.acrId = acrId;
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
             * DestCidr.
             */
            public Builder destCidr(String destCidr) {
                this.destCidr = destCidr;
                return this;
            }

            /**
             * DestPortRange.
             */
            public Builder destPortRange(String destPortRange) {
                this.destPortRange = destPortRange;
                return this;
            }

            /**
             * Direction.
             */
            public Builder direction(String direction) {
                this.direction = direction;
                return this;
            }

            /**
             * DpiGroupIds.
             */
            public Builder dpiGroupIds(DpiGroupIds dpiGroupIds) {
                this.dpiGroupIds = dpiGroupIds;
                return this;
            }

            /**
             * DpiSignatureIds.
             */
            public Builder dpiSignatureIds(DpiSignatureIds dpiSignatureIds) {
                this.dpiSignatureIds = dpiSignatureIds;
                return this;
            }

            /**
             * GmtCreate.
             */
            public Builder gmtCreate(Long gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * IpProtocol.
             */
            public Builder ipProtocol(String ipProtocol) {
                this.ipProtocol = ipProtocol;
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
             * Policy.
             */
            public Builder policy(String policy) {
                this.policy = policy;
                return this;
            }

            /**
             * Priority.
             */
            public Builder priority(Integer priority) {
                this.priority = priority;
                return this;
            }

            /**
             * SourceCidr.
             */
            public Builder sourceCidr(String sourceCidr) {
                this.sourceCidr = sourceCidr;
                return this;
            }

            /**
             * SourcePortRange.
             */
            public Builder sourcePortRange(String sourcePortRange) {
                this.sourcePortRange = sourcePortRange;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Acr build() {
                return new Acr(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeACLAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeACLAttributeResponseBody</p>
     */
    public static class Acrs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Acr")
        private java.util.List<Acr> acr;

        private Acrs(Builder builder) {
            this.acr = builder.acr;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Acrs create() {
            return builder().build();
        }

        /**
         * @return acr
         */
        public java.util.List<Acr> getAcr() {
            return this.acr;
        }

        public static final class Builder {
            private java.util.List<Acr> acr; 

            private Builder() {
            } 

            private Builder(Acrs model) {
                this.acr = model.acr;
            } 

            /**
             * Acr.
             */
            public Builder acr(java.util.List<Acr> acr) {
                this.acr = acr;
                return this;
            }

            public Acrs build() {
                return new Acrs(this);
            } 

        } 

    }
}
