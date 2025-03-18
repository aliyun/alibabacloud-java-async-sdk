// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gpdb20160503.models;

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
    @com.aliyun.core.annotation.NameInMap("Databases")
    private java.util.List<String> databases;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("UserNames")
    private java.util.List<String> userNames;

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

    public Builder toBuilder() {
        return new Builder(this);
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
     * @return userNames
     */
    public java.util.List<String> getUserNames() {
        return this.userNames;
    }

    public static final class Builder {
        private java.util.List<String> databases; 
        private String requestId; 
        private java.util.List<String> userNames; 

        private Builder() {
        } 

        private Builder(DescribeDiagnosisDimensionsResponseBody model) {
            this.databases = model.databases;
            this.requestId = model.requestId;
            this.userNames = model.userNames;
        } 

        /**
         * <p>The names of the databases.</p>
         */
        public Builder databases(java.util.List<String> databases) {
            this.databases = databases;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>9ADCAACA-E0E8-5319-AE3B-E260E957BDF9</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The names of the database accounts.</p>
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
