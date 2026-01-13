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
         * <p>The permission control information.</p>
         * 
         * <strong>example:</strong>
         * <p>=Tc/test_001\ntest_001=CTc/test_001</p>
         */
        public Builder accessPrivilege(String accessPrivilege) {
            this.accessPrivilege = accessPrivilege;
            return this;
        }

        /**
         * <p>The character set.</p>
         * <p>For more information about the value range, see Document <a href="https://www.postgresql.org/docs/current/multibyte.html">https://www.postgresql.org/docs/current/multibyte.html</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>UTF8</p>
         */
        public Builder characterSetName(String characterSetName) {
            this.characterSetName = characterSetName;
            return this;
        }

        /**
         * <p>Database locale parameter that specifies string comparison and sorting rules.</p>
         * <blockquote>
         * </blockquote>
         * <ul>
         * <li><p>The locale must be compatible with the character set specified by the CharacterSetName parameter.</p>
         * </li>
         * <li><p>Collate: You can query available collations using the command SELECT DISTINCT collname FROM pg_collation;. If not specified, the default value is en_US.utf8.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>en_US.utf8</p>
         */
        public Builder collate(String collate) {
            this.collate = collate;
            return this;
        }

        /**
         * <p>Limits the number of concurrent connections. -1 indicates unlimited.</p>
         * 
         * <strong>example:</strong>
         * <p>-1</p>
         */
        public Builder connLimit(String connLimit) {
            this.connLimit = connLimit;
            return this;
        }

        /**
         * <p>Database locale parameter that specifies character classification and case conversion rules.</p>
         * <blockquote>
         * </blockquote>
         * <ul>
         * <li><p>The locale must be compatible with the character set specified by the CharacterSetName parameter.</p>
         * </li>
         * <li><p>You can execute the SELECT DISTINCT collctype FROM pg_collation; statement to obtain the field value. The default value is en_US.utf8.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>en_US.utf8</p>
         */
        public Builder ctype(String ctype) {
            this.ctype = ctype;
            return this;
        }

        /**
         * <p>The cluster ID.</p>
         * 
         * <strong>example:</strong>
         * <p>gp-xxxxxxxxx</p>
         */
        public Builder DBInstanceId(String DBInstanceId) {
            this.DBInstanceId = DBInstanceId;
            return this;
        }

        /**
         * <p>The database name.</p>
         * <ul>
         * <li>Only contain letters, digits, and underscores (_).</li>
         * <li>Must start with a letter.</li>
         * <li>Up to 63 characters in length.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>test01</p>
         */
        public Builder databaseName(String databaseName) {
            this.databaseName = databaseName;
            return this;
        }

        /**
         * <p>The database comment.</p>
         * 
         * <strong>example:</strong>
         * <p>A user management database storing customer profiles.</p>
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * <p>The owner of the table.</p>
         * <ul>
         * <li>Contain lowercase letters, digits, and underscores (_).</li>
         * <li>Must start with a lowercase letter and end with a lowercase letter or a digit.</li>
         * <li>Cannot start with gp.</li>
         * <li>Must be 2 to 16 characters in length.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>testadb</p>
         */
        public Builder owner(String owner) {
            this.owner = owner;
            return this;
        }

        /**
         * <p>The unique ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>ABB39CC3-4488-4857-905D-2E4A051D0521</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The database size.</p>
         * 
         * <strong>example:</strong>
         * <p>2000 MB</p>
         */
        public Builder size(String size) {
            this.size = size;
            return this;
        }

        /**
         * <p>The database tablespace.</p>
         * 
         * <strong>example:</strong>
         * <p>pg_default</p>
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
