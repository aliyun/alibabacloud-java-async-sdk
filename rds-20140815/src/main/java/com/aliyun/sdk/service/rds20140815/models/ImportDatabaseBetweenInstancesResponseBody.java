// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ImportDatabaseBetweenInstancesResponseBody} extends {@link TeaModel}
 *
 * <p>ImportDatabaseBetweenInstancesResponseBody</p>
 */
public class ImportDatabaseBetweenInstancesResponseBody extends TeaModel {
    @NameInMap("ImportId")
    private String importId;

    @NameInMap("RequestId")
    private String requestId;

    private ImportDatabaseBetweenInstancesResponseBody(Builder builder) {
        this.importId = builder.importId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ImportDatabaseBetweenInstancesResponseBody create() {
        return builder().build();
    }

    /**
     * @return importId
     */
    public String getImportId() {
        return this.importId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String importId; 
        private String requestId; 

        /**
         * The ID of the import task.
         */
        public Builder importId(String importId) {
            this.importId = importId;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ImportDatabaseBetweenInstancesResponseBody build() {
            return new ImportDatabaseBetweenInstancesResponseBody(this);
        } 

    } 

}
