// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.datalake20200710.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DatabaseResource} extends {@link TeaModel}
 *
 * <p>DatabaseResource</p>
 */
public class DatabaseResource extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DatabaseName")
    private String databaseName;

    @com.aliyun.core.annotation.NameInMap("DatabaseWildcard")
    private String databaseWildcard;

    private DatabaseResource(Builder builder) {
        this.databaseName = builder.databaseName;
        this.databaseWildcard = builder.databaseWildcard;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DatabaseResource create() {
        return builder().build();
    }

    /**
     * @return databaseName
     */
    public String getDatabaseName() {
        return this.databaseName;
    }

    /**
     * @return databaseWildcard
     */
    public String getDatabaseWildcard() {
        return this.databaseWildcard;
    }

    public static final class Builder {
        private String databaseName; 
        private String databaseWildcard; 

        /**
         * DatabaseName.
         */
        public Builder databaseName(String databaseName) {
            this.databaseName = databaseName;
            return this;
        }

        /**
         * DatabaseWildcard.
         */
        public Builder databaseWildcard(String databaseWildcard) {
            this.databaseWildcard = databaseWildcard;
            return this;
        }

        public DatabaseResource build() {
            return new DatabaseResource(this);
        } 

    } 

}
