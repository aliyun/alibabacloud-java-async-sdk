// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20211201.models;

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
 * {@link DescribeDiagnosisDimensionsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDiagnosisDimensionsResponseBody</p>
 */
public class DescribeDiagnosisDimensionsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ClientIps")
    private java.util.List<String> clientIps;

    @com.aliyun.core.annotation.NameInMap("Databases")
    private java.util.List<String> databases;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ResourceGroups")
    private java.util.List<String> resourceGroups;

    @com.aliyun.core.annotation.NameInMap("UserNames")
    private java.util.List<String> userNames;

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

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clientIps
     */
    public java.util.List<String> getClientIps() {
        return this.clientIps;
    }

    /**
     * @return databases
     */
    public java.util.List<String> getDatabases() {
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
    public java.util.List<String> getResourceGroups() {
        return this.resourceGroups;
    }

    /**
     * @return userNames
     */
    public java.util.List<String> getUserNames() {
        return this.userNames;
    }

    public static final class Builder {
        private java.util.List<String> clientIps; 
        private java.util.List<String> databases; 
        private String requestId; 
        private java.util.List<String> resourceGroups; 
        private java.util.List<String> userNames; 

        private Builder() {
        } 

        private Builder(DescribeDiagnosisDimensionsResponseBody model) {
            this.clientIps = model.clientIps;
            this.databases = model.databases;
            this.requestId = model.requestId;
            this.resourceGroups = model.resourceGroups;
            this.userNames = model.userNames;
        } 

        /**
         * <p>The queried source IP addresses.</p>
         */
        public Builder clientIps(java.util.List<String> clientIps) {
            this.clientIps = clientIps;
            return this;
        }

        /**
         * <p>The queried database names.</p>
         */
        public Builder databases(java.util.List<String> databases) {
            this.databases = databases;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>DEA97C6B-D7A4-5E69-9EFC-D7F88737CED5</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The queried resource group names.</p>
         */
        public Builder resourceGroups(java.util.List<String> resourceGroups) {
            this.resourceGroups = resourceGroups;
            return this;
        }

        /**
         * <p>The queried usernames.</p>
         */
        public Builder userNames(java.util.List<String> userNames) {
            this.userNames = userNames;
            return this;
        }

        public DescribeDiagnosisDimensionsResponseBody build() {
            return new DescribeDiagnosisDimensionsResponseBody(this);
        } 

    } 

}
