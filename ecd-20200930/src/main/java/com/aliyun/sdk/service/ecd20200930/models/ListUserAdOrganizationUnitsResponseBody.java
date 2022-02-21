// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListUserAdOrganizationUnitsResponseBody} extends {@link TeaModel}
 *
 * <p>ListUserAdOrganizationUnitsResponseBody</p>
 */
public class ListUserAdOrganizationUnitsResponseBody extends TeaModel {
    @NameInMap("OUNames")
    private java.util.List < OUNames> OUNames;

    @NameInMap("RequestId")
    private String requestId;

    private ListUserAdOrganizationUnitsResponseBody(Builder builder) {
        this.OUNames = builder.OUNames;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListUserAdOrganizationUnitsResponseBody create() {
        return builder().build();
    }

    /**
     * @return OUNames
     */
    public java.util.List < OUNames> getOUNames() {
        return this.OUNames;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < OUNames> OUNames; 
        private String requestId; 

        /**
         * OUNames.
         */
        public Builder OUNames(java.util.List < OUNames> OUNames) {
            this.OUNames = OUNames;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListUserAdOrganizationUnitsResponseBody build() {
            return new ListUserAdOrganizationUnitsResponseBody(this);
        } 

    } 

    public static class OUNames extends TeaModel {
        @NameInMap("OUName")
        private String OUName;

        @NameInMap("OfficeSiteId")
        private String officeSiteId;

        private OUNames(Builder builder) {
            this.OUName = builder.OUName;
            this.officeSiteId = builder.officeSiteId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OUNames create() {
            return builder().build();
        }

        /**
         * @return OUName
         */
        public String getOUName() {
            return this.OUName;
        }

        /**
         * @return officeSiteId
         */
        public String getOfficeSiteId() {
            return this.officeSiteId;
        }

        public static final class Builder {
            private String OUName; 
            private String officeSiteId; 

            /**
             * OUName.
             */
            public Builder OUName(String OUName) {
                this.OUName = OUName;
                return this;
            }

            /**
             * OfficeSiteId.
             */
            public Builder officeSiteId(String officeSiteId) {
                this.officeSiteId = officeSiteId;
                return this;
            }

            public OUNames build() {
                return new OUNames(this);
            } 

        } 

    }
}
