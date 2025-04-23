// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eds_user20210308.models;

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
 * {@link DescribeOrgByLayerResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeOrgByLayerResponseBody</p>
 */
public class DescribeOrgByLayerResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Orgs")
    private java.util.List<Orgs> orgs;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeOrgByLayerResponseBody(Builder builder) {
        this.orgs = builder.orgs;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeOrgByLayerResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return orgs
     */
    public java.util.List<Orgs> getOrgs() {
        return this.orgs;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<Orgs> orgs; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeOrgByLayerResponseBody model) {
            this.orgs = model.orgs;
            this.requestId = model.requestId;
        } 

        /**
         * Orgs.
         */
        public Builder orgs(java.util.List<Orgs> orgs) {
            this.orgs = orgs;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeOrgByLayerResponseBody build() {
            return new DescribeOrgByLayerResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeOrgByLayerResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeOrgByLayerResponseBody</p>
     */
    public static class Orgs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("OrgId")
        private String orgId;

        @com.aliyun.core.annotation.NameInMap("OrgName")
        private String orgName;

        @com.aliyun.core.annotation.NameInMap("ParentOrgId")
        private String parentOrgId;

        private Orgs(Builder builder) {
            this.orgId = builder.orgId;
            this.orgName = builder.orgName;
            this.parentOrgId = builder.parentOrgId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Orgs create() {
            return builder().build();
        }

        /**
         * @return orgId
         */
        public String getOrgId() {
            return this.orgId;
        }

        /**
         * @return orgName
         */
        public String getOrgName() {
            return this.orgName;
        }

        /**
         * @return parentOrgId
         */
        public String getParentOrgId() {
            return this.parentOrgId;
        }

        public static final class Builder {
            private String orgId; 
            private String orgName; 
            private String parentOrgId; 

            private Builder() {
            } 

            private Builder(Orgs model) {
                this.orgId = model.orgId;
                this.orgName = model.orgName;
                this.parentOrgId = model.parentOrgId;
            } 

            /**
             * OrgId.
             */
            public Builder orgId(String orgId) {
                this.orgId = orgId;
                return this;
            }

            /**
             * OrgName.
             */
            public Builder orgName(String orgName) {
                this.orgName = orgName;
                return this;
            }

            /**
             * ParentOrgId.
             */
            public Builder parentOrgId(String parentOrgId) {
                this.parentOrgId = parentOrgId;
                return this;
            }

            public Orgs build() {
                return new Orgs(this);
            } 

        } 

    }
}
