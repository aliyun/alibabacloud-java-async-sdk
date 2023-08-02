// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gpdb20160503.models;

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
    @NameInMap("Databases")
    private java.util.List < String > databases;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("UserNames")
    private java.util.List < String > userNames;

    private DescribeDiagnosisDimensionsResponseBody(Builder builder) {
        this.databases = builder.databases;
        this.requestId = builder.requestId;
        this.userNames = builder.userNames;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDiagnosisDimensionsResponseBody create() {
        return builder().build();
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
     * @return userNames
     */
    public java.util.List < String > getUserNames() {
        return this.userNames;
    }

    public static final class Builder {
        private java.util.List < String > databases; 
        private String requestId; 
        private java.util.List < String > userNames; 

        /**
         * The name of the database.
         */
        public Builder databases(java.util.List < String > databases) {
            this.databases = databases;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The name of the database account.
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
