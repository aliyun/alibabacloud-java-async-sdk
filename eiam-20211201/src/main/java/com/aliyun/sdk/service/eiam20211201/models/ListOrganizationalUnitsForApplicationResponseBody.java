// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eiam20211201.models;

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
 * {@link ListOrganizationalUnitsForApplicationResponseBody} extends {@link TeaModel}
 *
 * <p>ListOrganizationalUnitsForApplicationResponseBody</p>
 */
public class ListOrganizationalUnitsForApplicationResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("OrganizationalUnits")
    private java.util.List<OrganizationalUnits> organizationalUnits;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private ListOrganizationalUnitsForApplicationResponseBody(Builder builder) {
        this.organizationalUnits = builder.organizationalUnits;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListOrganizationalUnitsForApplicationResponseBody create() {
        return builder().build();
    }

    /**
     * @return organizationalUnits
     */
    public java.util.List<OrganizationalUnits> getOrganizationalUnits() {
        return this.organizationalUnits;
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
        private java.util.List<OrganizationalUnits> organizationalUnits; 
        private String requestId; 
        private Long totalCount; 

        /**
         * <p>The IDs of the organizations that are allowed to access the application.</p>
         */
        public Builder organizationalUnits(java.util.List<OrganizationalUnits> organizationalUnits) {
            this.organizationalUnits = organizationalUnits;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>0441BD79-92F3-53AA-8657-F8CE4A2B912A</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of the returned entries.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListOrganizationalUnitsForApplicationResponseBody build() {
            return new ListOrganizationalUnitsForApplicationResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListOrganizationalUnitsForApplicationResponseBody} extends {@link TeaModel}
     *
     * <p>ListOrganizationalUnitsForApplicationResponseBody</p>
     */
    public static class OrganizationalUnits extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("OrganizationalUnitId")
        private String organizationalUnitId;

        private OrganizationalUnits(Builder builder) {
            this.organizationalUnitId = builder.organizationalUnitId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OrganizationalUnits create() {
            return builder().build();
        }

        /**
         * @return organizationalUnitId
         */
        public String getOrganizationalUnitId() {
            return this.organizationalUnitId;
        }

        public static final class Builder {
            private String organizationalUnitId; 

            /**
             * <p>The ID of the organization that is allowed to access the application.</p>
             * 
             * <strong>example:</strong>
             * <p>ou_wovwffm62xifdziem7an7xxxxx</p>
             */
            public Builder organizationalUnitId(String organizationalUnitId) {
                this.organizationalUnitId = organizationalUnitId;
                return this;
            }

            public OrganizationalUnits build() {
                return new OrganizationalUnits(this);
            } 

        } 

    }
}
