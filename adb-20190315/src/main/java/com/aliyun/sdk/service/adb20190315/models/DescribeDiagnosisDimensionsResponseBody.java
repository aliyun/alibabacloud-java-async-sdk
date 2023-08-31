// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20190315.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDiagnosisDimensionsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDiagnosisDimensionsResponseBody</p>
 */
public class DescribeDiagnosisDimensionsResponseBody extends TeaModel {
    @NameInMap("ClientIps")
    private java.util.List < String > clientIps;

    @NameInMap("Databases")
    private java.util.List < String > databases;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("ResourceGroups")
    private java.util.List < String > resourceGroups;

    @NameInMap("UserNames")
    private java.util.List < String > userNames;

    private DescribeDiagnosisDimensionsResponseBody(Builder builder) {
        this.clientIps = builder.clientIps;
        this.databases = builder.databases;
        this.requestId = builder.requestId;
        this.resourceGroups = builder.resourceGroups;
        this.userNames = builder.userNames;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDiagnosisDimensionsResponseBody create() {
        return builder().build();
    }

    /**
     * @return clientIps
     */
    public java.util.List < String > getClientIps() {
        return this.clientIps;
    }

    /**
     * @return databases
     */
    public java.util.List < String > getDatabases() {
        return this.databases;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return resourceGroups
     */
    public java.util.List < String > getResourceGroups() {
        return this.resourceGroups;
    }

    /**
     * @return userNames
     */
    public java.util.List < String > getUserNames() {
        return this.userNames;
    }

    public static final class Builder {
        private java.util.List < String > clientIps; 
        private java.util.List < String > databases; 
        private String requestId; 
        private java.util.List < String > resourceGroups; 
        private java.util.List < String > userNames; 

        /**
         * The source IP addresses.
         */
        public Builder clientIps(java.util.List < String > clientIps) {
            this.clientIps = clientIps;
            return this;
        }

        /**
         * The databases.
         */
        public Builder databases(java.util.List < String > databases) {
            this.databases = databases;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The resource groups.
         */
        public Builder resourceGroups(java.util.List < String > resourceGroups) {
            this.resourceGroups = resourceGroups;
            return this;
        }

        /**
         * The usernames.
         */
        public Builder userNames(java.util.List < String > userNames) {
            this.userNames = userNames;
            return this;
        }

        public DescribeDiagnosisDimensionsResponseBody build() {
            return new DescribeDiagnosisDimensionsResponseBody(this);
        } 

    } 

}
