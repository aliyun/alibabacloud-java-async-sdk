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
    @NameInMap("NextToken")
    private String nextToken;

    @NameInMap("OUNames")
    private java.util.List < OUNames> OUNames;

    @NameInMap("RequestId")
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
         * The token that is used to start the next query.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * The names of the OUs in the AD domain.
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
        @NameInMap("DisplayOUName")
        private String displayOUName;

        @NameInMap("OUName")
        private String OUName;

        @NameInMap("OfficeSiteId")
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
             * The display name of the OU.
             */
            public Builder displayOUName(String displayOUName) {
                this.displayOUName = displayOUName;
                return this;
            }

            /**
             * The name of the OU of the AD domain controller.
             */
            public Builder OUName(String OUName) {
                this.OUName = OUName;
                return this;
            }

            /**
             * The ID of the AD workspace.
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
