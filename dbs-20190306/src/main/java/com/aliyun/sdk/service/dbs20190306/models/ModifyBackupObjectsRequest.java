// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dbs20190306.models;

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
 * {@link ModifyBackupObjectsRequest} extends {@link RequestModel}
 *
 * <p>ModifyBackupObjectsRequest</p>
 */
public class ModifyBackupObjectsRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BackupObjects")
    @com.aliyun.core.annotation.Validation(required = true)
    private String backupObjects;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BackupPlanId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String backupPlanId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private String ownerId;

    private ModifyBackupObjectsRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.backupObjects = builder.backupObjects;
        this.backupPlanId = builder.backupPlanId;
        this.clientToken = builder.clientToken;
        this.ownerId = builder.ownerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyBackupObjectsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return backupObjects
     */
    public String getBackupObjects() {
        return this.backupObjects;
    }

    /**
     * @return backupPlanId
     */
    public String getBackupPlanId() {
        return this.backupPlanId;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return ownerId
     */
    public String getOwnerId() {
        return this.ownerId;
    }

    public static final class Builder extends Request.Builder<ModifyBackupObjectsRequest, Builder> {
        private String regionId; 
        private String backupObjects; 
        private String backupPlanId; 
        private String clientToken; 
        private String ownerId; 

        private Builder() {
            super();
        } 

        private Builder(ModifyBackupObjectsRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.backupObjects = request.backupObjects;
            this.backupPlanId = request.backupPlanId;
            this.clientToken = request.clientToken;
            this.ownerId = request.ownerId;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The backup objects that are defined in a JSON string in the following format:</p>
         * <pre><code>[
         *     {
         *         &quot;DBName&quot;:&quot;The name of the database that you want to back up&quot;,
         *         &quot;SchemaName&quot;:&quot;The name of the schema that you want to back up&quot;,
         *         &quot;TableIncludes&quot;:[{
         *             &quot;TableName&quot;:&quot;The name of the table that you want to back up&quot;
         *         }],
         *         &quot;TableExcludes&quot;:[{
         *             &quot;TableName&quot;:&quot;The name of the table that you want to exclude during the backup&quot;
         *         }]
         *     }
         * ]
         * </code></pre>
         * <ul>
         * <li><p>If you specify only <code>DBName</code> and do not specify objects of lower levels, all objects in the database are backed up.</p>
         * </li>
         * <li><p>If you specify <code>DBName</code> and some objects of lower levels, only the specified objects are backed up by default. You can use the following regular expressions to define object names:</p>
         * <ul>
         * <li>A period <code>.</code> matches any single character except <code>\r\n</code>.</li>
         * <li>An asterisk <code>*</code> matches zero or more occurrences of a preceding subexpression. For example, <code>h.*llo</code> matches strings such as <code>hllo</code> and <code>heeeello</code>.</li>
         * <li>A question mark <code>?</code> matches zero or one occurrence of a preceding subexpression. For example, <code>h.?llo</code> matches strings such as <code>hllo</code> and <code>hello</code>, but not <code>haello</code>.</li>
         * <li>Character set <code>[Characters]</code> matches a character included in the brackets ([ ]). For example, <code>h[ae]llo</code> matches <code>hallo</code> and <code>hello</code>.</li>
         * <li>Negative character set <code>[^Characters]</code> does not match a character in the brackets ([ ]). For example, <code>h[^ae]llo</code> matches <code>hcllo</code> and <code>hdllo</code>, but not <code>hallo</code> or <code>hello</code>.</li>
         * <li>Character range <code>[character1-character2]</code> matches any character included in the range from <code>character1 to character2</code>, such as <code>[0-9]</code> and <code>[a-z]</code>.</li>
         * </ul>
         * </li>
         * </ul>
         * <blockquote>
         * <p> <code>SchemaName</code> and <code>NewSchemaName</code> apply only to SQL Server databases. Use <code>DBName</code> and <code>NewDBName</code> to specify the names of other databases.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>[     {         &quot;DBName&quot;:&quot;17xxx92xxxx374&quot;,         &quot;SchemaName&quot;:&quot;gy9xnj8xxxxxx&quot;,         &quot;TableIncludes&quot;:[{         	&quot;TableName&quot;:&quot;test1&quot;         }],         &quot;TableExcludes&quot;:[{             &quot;TableName&quot;:&quot;test2&quot;         }]     } ]</p>
         */
        public Builder backupObjects(String backupObjects) {
            this.putQueryParameter("BackupObjects", backupObjects);
            this.backupObjects = backupObjects;
            return this;
        }

        /**
         * <p>The ID of the backup schedule.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>dbs1h****usfa</p>
         */
        public Builder backupPlanId(String backupPlanId) {
            this.putQueryParameter("BackupPlanId", backupPlanId);
            this.backupPlanId = backupPlanId;
            return this;
        }

        /**
         * <p>The client token that is used to ensure the idempotence of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>ETnLKlblzczshOTUbOCzxxxxxxx</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(String ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        @Override
        public ModifyBackupObjectsRequest build() {
            return new ModifyBackupObjectsRequest(this);
        } 

    } 

}
