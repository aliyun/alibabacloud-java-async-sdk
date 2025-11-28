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
 * {@link DescribeDatabaseResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDatabaseResponseBody</p>
 */
public class DescribeDatabaseResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AccessPrivilege")
    private String accessPrivilege;

    @com.aliyun.core.annotation.NameInMap("CharacterSetName")
    private String characterSetName;

    @com.aliyun.core.annotation.NameInMap("Collate")
    private String collate;

    @com.aliyun.core.annotation.NameInMap("ConnLimit")
    private String connLimit;

    @com.aliyun.core.annotation.NameInMap("Ctype")
    private String ctype;

    @com.aliyun.core.annotation.NameInMap("DBInstanceId")
    private String DBInstanceId;

    @com.aliyun.core.annotation.NameInMap("DatabaseName")
    private String databaseName;

    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("Owner")
    private String owner;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Size")
    private String size;

    @com.aliyun.core.annotation.NameInMap("TableSpace")
    private String tableSpace;

    private DescribeDatabaseResponseBody(Builder builder) {
        this.accessPrivilege = builder.accessPrivilege;
        this.characterSetName = builder.characterSetName;
        this.collate = builder.collate;
        this.connLimit = builder.connLimit;
        this.ctype = builder.ctype;
        this.DBInstanceId = builder.DBInstanceId;
        this.databaseName = builder.databaseName;
        this.description = builder.description;
        this.owner = builder.owner;
        this.requestId = builder.requestId;
        this.size = builder.size;
        this.tableSpace = builder.tableSpace;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDatabaseResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accessPrivilege
     */
    public String getAccessPrivilege() {
        return this.accessPrivilege;
    }

    /**
     * @return characterSetName
     */
    public String getCharacterSetName() {
        return this.characterSetName;
    }

    /**
     * @return collate
     */
    public String getCollate() {
        return this.collate;
    }

    /**
     * @return connLimit
     */
    public String getConnLimit() {
        return this.connLimit;
    }

    /**
     * @return ctype
     */
    public String getCtype() {
        return this.ctype;
    }

    /**
     * @return DBInstanceId
     */
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    /**
     * @return databaseName
     */
    public String getDatabaseName() {
        return this.databaseName;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return owner
     */
    public String getOwner() {
        return this.owner;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return size
     */
    public String getSize() {
        return this.size;
    }

    /**
     * @return tableSpace
     */
    public String getTableSpace() {
        return this.tableSpace;
    }

    public static final class Builder {
        private String accessPrivilege; 
        private String characterSetName; 
        private String collate; 
        private String connLimit; 
        private String ctype; 
        private String DBInstanceId; 
        private String databaseName; 
        private String description; 
        private String owner; 
        private String requestId; 
        private String size; 
        private String tableSpace; 

        private Builder() {
        } 

        private Builder(DescribeDatabaseResponseBody model) {
            this.accessPrivilege = model.accessPrivilege;
            this.characterSetName = model.characterSetName;
            this.collate = model.collate;
            this.connLimit = model.connLimit;
            this.ctype = model.ctype;
            this.DBInstanceId = model.DBInstanceId;
            this.databaseName = model.databaseName;
            this.description = model.description;
            this.owner = model.owner;
            this.requestId = model.requestId;
            this.size = model.size;
            this.tableSpace = model.tableSpace;
        } 

        /**
         * AccessPrivilege.
         */
        public Builder accessPrivilege(String accessPrivilege) {
            this.accessPrivilege = accessPrivilege;
            return this;
        }

        /**
         * CharacterSetName.
         */
        public Builder characterSetName(String characterSetName) {
            this.characterSetName = characterSetName;
            return this;
        }

        /**
         * Collate.
         */
        public Builder collate(String collate) {
            this.collate = collate;
            return this;
        }

        /**
         * ConnLimit.
         */
        public Builder connLimit(String connLimit) {
            this.connLimit = connLimit;
            return this;
        }

        /**
         * Ctype.
         */
        public Builder ctype(String ctype) {
            this.ctype = ctype;
            return this;
        }

        /**
         * DBInstanceId.
         */
        public Builder DBInstanceId(String DBInstanceId) {
            this.DBInstanceId = DBInstanceId;
            return this;
        }

        /**
         * DatabaseName.
         */
        public Builder databaseName(String databaseName) {
            this.databaseName = databaseName;
            return this;
        }

        /**
         * Description.
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * Owner.
         */
        public Builder owner(String owner) {
            this.owner = owner;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Size.
         */
        public Builder size(String size) {
            this.size = size;
            return this;
        }

        /**
         * TableSpace.
         */
        public Builder tableSpace(String tableSpace) {
            this.tableSpace = tableSpace;
            return this;
        }

        public DescribeDatabaseResponseBody build() {
            return new DescribeDatabaseResponseBody(this);
        } 

    } 

}
