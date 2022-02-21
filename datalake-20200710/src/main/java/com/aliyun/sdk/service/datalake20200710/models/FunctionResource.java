// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.datalake20200710.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link FunctionResource} extends {@link TeaModel}
 *
 * <p>FunctionResource</p>
 */
public class FunctionResource extends TeaModel {
    @NameInMap("DatabaseName")
    private String databaseName;

    @NameInMap("FunctionName")
    private String functionName;

    private FunctionResource(Builder builder) {
        this.databaseName = builder.databaseName;
        this.functionName = builder.functionName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static FunctionResource create() {
        return builder().build();
    }

    /**
     * @return databaseName
     */
    public String getDatabaseName() {
        return this.databaseName;
    }

    /**
     * @return functionName
     */
    public String getFunctionName() {
        return this.functionName;
    }

    public static final class Builder {
        private String databaseName; 
        private String functionName; 

        /**
         * Database name
         */
        public Builder databaseName(String databaseName) {
            this.databaseName = databaseName;
            return this;
        }

        /**
         * Function name
         */
        public Builder functionName(String functionName) {
            this.functionName = functionName;
            return this;
        }

        public FunctionResource build() {
            return new FunctionResource(this);
        } 

    } 

}
