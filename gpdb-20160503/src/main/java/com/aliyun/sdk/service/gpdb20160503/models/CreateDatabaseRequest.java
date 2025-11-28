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
 * {@link CreateDatabaseRequest} extends {@link RequestModel}
 *
 * <p>CreateDatabaseRequest</p>
 */
public class CreateDatabaseRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CharacterSetName")
    private String characterSetName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Collate")
    private String collate;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Ctype")
    private String ctype;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DatabaseName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String databaseName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Owner")
    @com.aliyun.core.annotation.Validation(required = true)
    private String owner;

    private CreateDatabaseRequest(Builder builder) {
        super(builder);
        this.characterSetName = builder.characterSetName;
        this.collate = builder.collate;
        this.ctype = builder.ctype;
        this.DBInstanceId = builder.DBInstanceId;
        this.databaseName = builder.databaseName;
        this.description = builder.description;
        this.owner = builder.owner;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateDatabaseRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
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

    public static final class Builder extends Request.Builder<CreateDatabaseRequest, Builder> {
        private String characterSetName; 
        private String collate; 
        private String ctype; 
        private String DBInstanceId; 
        private String databaseName; 
        private String description; 
        private String owner; 

        private Builder() {
            super();
        } 

        private Builder(CreateDatabaseRequest request) {
            super(request);
            this.characterSetName = request.characterSetName;
            this.collate = request.collate;
            this.ctype = request.ctype;
            this.DBInstanceId = request.DBInstanceId;
            this.databaseName = request.databaseName;
            this.description = request.description;
            this.owner = request.owner;
        } 

        /**
         * <p>The character set.</p>
         * <p>For more information about the value range, see Document <a href="url">https://www.postgresql.org/docs/current/multibyte.html</a>.</p>
         * <p>Default value: UTF-8.</p>
         * 
         * <strong>example:</strong>
         * <p>UTF8</p>
         */
        public Builder characterSetName(String characterSetName) {
            this.putQueryParameter("CharacterSetName", characterSetName);
            this.characterSetName = characterSetName;
            return this;
        }

        /**
         * <p>Database locale parameter (specifies string comparison/sorting rules).</p>
         * <blockquote>
         * </blockquote>
         * <ul>
         * <li><p>The locale must be compatible with the character set specified by the CharacterSetName parameter.</p>
         * </li>
         * <li><p>Valid values for the Collate field: You can execute the SELECT DISTINCT collname FROM pg_collation; statement to obtain the field value. The default value is en_US.utf8.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>en_US.utf8</p>
         */
        public Builder collate(String collate) {
            this.putQueryParameter("Collate", collate);
            this.collate = collate;
            return this;
        }

        /**
         * <p>Database locale parameter (defines character classification/case conversion rules).</p>
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
            this.putQueryParameter("Ctype", ctype);
            this.ctype = ctype;
            return this;
        }

        /**
         * <p>The cluster ID.</p>
         * <blockquote>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/86911.html">DescribeDBInstances</a> operation to query the information about all AnalyticDB for PostgreSQL instances within a region, including instance IDs.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>gp-xxxxxxxxx</p>
         */
        public Builder DBInstanceId(String DBInstanceId) {
            this.putQueryParameter("DBInstanceId", DBInstanceId);
            this.DBInstanceId = DBInstanceId;
            return this;
        }

        /**
         * <p>The name of the database.</p>
         * <ul>
         * <li>Only contains letters, digits, and underscores (_).</li>
         * <li>Must start with a letter.</li>
         * <li>Up to 63 characters in length.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test01</p>
         */
        public Builder databaseName(String databaseName) {
            this.putQueryParameter("DatabaseName", databaseName);
            this.databaseName = databaseName;
            return this;
        }

        /**
         * <p>The description of the database.</p>
         * <ul>
         * <li>Must start with a letter.</li>
         * <li>Cannot start with http:// or https://.</li>
         * <li>Only contains letters, underscores (_), hyphens (-), and digits.</li>
         * <li>Must be 2 to 256 characters in length.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>A user management database storing customer profiles.</p>
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The owner of the table.</p>
         * <ul>
         * <li>Only contains lowercase letters, digits, and underscores (_).</li>
         * <li>Must start with a lowercase letter and end with a lowercase letter or a digit.</li>
         * <li>Cannot start with gp.</li>
         * <li>Must be 2 to 16 characters in length.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>testadb</p>
         */
        public Builder owner(String owner) {
            this.putQueryParameter("Owner", owner);
            this.owner = owner;
            return this;
        }

        @Override
        public CreateDatabaseRequest build() {
            return new CreateDatabaseRequest(this);
        } 

    } 

}
