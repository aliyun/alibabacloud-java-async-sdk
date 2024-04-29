// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListUserAdOrganizationUnitsResponseBody} extends {@link TeaModel}
 *
 * <p>ListUserAdOrganizationUnitsResponseBody</p>
 */
public class ListUserAdOrganizationUnitsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("OUNames")
    private java.util.List < OUNames> OUNames;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListUserAdOrganizationUnitsResponseBody(Builder builder) {
        this.nextToken = builder.nextToken;
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
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
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
        private String nextToken; 
        private java.util.List < OUNames> OUNames; 
        private String requestId; 

        /**
         * A pagination token.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * The OUs of the AD domain.
         */
        public Builder OUNames(java.util.List < OUNames> OUNames) {
            this.OUNames = OUNames;
            return this;
        }

        /**
         * The ID of the request.
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
        @com.aliyun.core.annotation.NameInMap("DisplayOUName")
        private String displayOUName;

        @com.aliyun.core.annotation.NameInMap("OUName")
        private String OUName;

        @com.aliyun.core.annotation.NameInMap("OfficeSiteId")
        private String officeSiteId;

        private OUNames(Builder builder) {
            this.displayOUName = builder.displayOUName;
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
         * @return displayOUName
         */
        public String getDisplayOUName() {
            return this.displayOUName;
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
            private String displayOUName; 
            private String OUName; 
            private String officeSiteId; 

            /**
             * The name of the OU.
             */
            public Builder displayOUName(String displayOUName) {
                this.displayOUName = displayOUName;
                return this;
            }

            /**
             * The canonical name (CNAME) of the OU in the AD domain controller.
             */
            public Builder OUName(String OUName) {
                this.OUName = OUName;
                return this;
            }

            /**
             * The enterprise AD office network ID.
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
