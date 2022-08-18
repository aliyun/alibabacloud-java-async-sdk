// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eiam20211201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListOrganizationalUnitsForApplicationResponseBody} extends {@link TeaModel}
 *
 * <p>ListOrganizationalUnitsForApplicationResponseBody</p>
 */
public class ListOrganizationalUnitsForApplicationResponseBody extends TeaModel {
    @NameInMap("OrganizationalUnits")
    private java.util.List < OrganizationalUnits> organizationalUnits;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
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
    public java.util.List < OrganizationalUnits> getOrganizationalUnits() {
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
        private java.util.List < OrganizationalUnits> organizationalUnits; 
        private String requestId; 
        private Long totalCount; 

        /**
         * OrganizationalUnits.
         */
        public Builder organizationalUnits(java.util.List < OrganizationalUnits> organizationalUnits) {
            this.organizationalUnits = organizationalUnits;
            return this;
        }

        /**
         * 请求ID。
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * 列表总条数目。
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListOrganizationalUnitsForApplicationResponseBody build() {
            return new ListOrganizationalUnitsForApplicationResponseBody(this);
        } 

    } 

    public static class OrganizationalUnits extends TeaModel {
        @NameInMap("OrganizationalUnitId")
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
             * 组织的唯一标识.
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
