// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dlfnext20250310.models;

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
 * {@link Identifier} extends {@link TeaModel}
 *
 * <p>Identifier</p>
 */
public class Identifier extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("database")
    private String database;

    @com.aliyun.core.annotation.NameInMap("object")
    private String object;

    private Identifier(Builder builder) {
        this.database = builder.database;
        this.object = builder.object;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Identifier create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return database
     */
    public String getDatabase() {
        return this.database;
    }

    /**
     * @return object
     */
    public String getObject() {
        return this.object;
    }

    public static final class Builder {
        private String database; 
        private String object; 

        private Builder() {
        } 

        private Builder(Identifier model) {
            this.database = model.database;
            this.object = model.object;
        } 

        /**
         * database.
         */
        public Builder database(String database) {
            this.database = database;
            return this;
        }

        /**
         * object.
         */
        public Builder object(String object) {
            this.object = object;
            return this;
        }

        public Identifier build() {
            return new Identifier(this);
        } 

    } 

}
